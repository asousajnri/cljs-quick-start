https://clojurescript.org/guides/quick-start
https://shadow-cljs.github.io/docs/UsersGuide.html#embedded

#option 1
To work with Cursice and Shadow CLJS
1. https://shadow-cljs.github.io/docs/UsersGuide.html#_cursive
2. https://shadow-cljs.github.io/docs/UsersGuide.html#nREPL
3. https://shadow-cljs.github.io/docs/UsersGuide.html#_nrepl_usage

Commands
- Intellij IDEA >> Cursive >> Clojure >> Remote REPL
  - User Standart port File
- Terminal
npx shadow-cljs server
- In REPL
(shadow/watch :the-build)
(shadow/repl :the-build)

#option 2
Run shadow on REPL >> intellij idea
(require '[shadow.cljs.devtools.server :as server])
(server/start!)
(require '[shadow.cljs.devtools.api :as shadow])
(shadow/watch :app)
