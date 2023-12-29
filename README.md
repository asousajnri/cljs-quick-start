https://clojurescript.org/guides/quick-start
https://shadow-cljs.github.io/docs/UsersGuide.html#embedded

Run shadow on REPL >> intellij idea

(require '[shadow.cljs.devtools.server :as server])
(server/start!)
(require '[shadow.cljs.devtools.api :as shadow])
(shadow/watch :app)
