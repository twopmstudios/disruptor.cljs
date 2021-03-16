# disruptor.cljs

> This project was generated using `npx create-cljs-project` and uses [`shadow-cljs`](https://github.com/thheller/shadow-cljs).

This repository represents an effort to create a somewhat idiomatic ClojureScript layer on top of [Phaser 3](https://github.com/photonstorm/phaser).

For now, it is simply a starting point for accessing Phaser API's from ClojureScript w/ a live-reloading dev environment.

# Objectives

- Explore a functional API that treats Phaser as a side effect layer applied at the boundaries
- Consider applying v-dom-diffing techniques to mutate the scene graph based on immutable state snapshots
- Event / signal driven architecture, inspired by React / Elm / re-frame etc.
- Extremely fast & predictable development
