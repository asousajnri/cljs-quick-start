(ns cljs-quick-start.core
  (:require react-dom))

(defn after-load! []
  (js/console.log "after load!"))

(defn main! []
  (js/console.log "main!")
  (.render js/ReactDOM
    (.createElement js/React "h2" nil "Hello, React!")
    (.getElementById js/document "app")))
