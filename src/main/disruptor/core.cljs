(ns disruptor.core)

(defn MainScene []
  (this-as this
           (.call js/Phaser.Scene this)))

(set! (.. MainScene -prototype -preload)
      (fn []
        (this-as this
                 (.image (-> this .-load) "logo" "/assets/logo.png"))))

(set! (.. MainScene -prototype -create)
      (fn []
        (this-as this
                 (let [logo (.image (-> this .-add) 400 150 "logo")]
                   (.add (.-tweens this) (clj->js {:targets logo
                                                   :y 350
                                                   :duration 2000
                                                   :ease "Power2"
                                                   :yoyo true?
                                                   :loop -1}))))))

(defn init []
  (println "Hello World!"))

(let [config (clj->js {:type js/Phaser.AUTO
                       :parent "root"
                       :width 800
                       :height 600
                       :scene MainScene})]

  (def game (new js/Phaser.Game config))
  (js/console.log game))


(defn ^:dev/before-load stop []
  (js/console.log "stop")
  (.destroy game true false))

(defn ^:dev/after-load start []
  (js/console.log "start"))