Run shadow on REPL

(require '[shadow.cljs.devtools.server :as server])
(server/start!)
(require '[shadow.cljs.devtools.api :as shadow])
(shadow/watch :app)
