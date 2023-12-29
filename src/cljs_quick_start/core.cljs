(ns cljs-quick-start.core)
  ; (:require react-dom))

; (println "Hello, World!")

; (.render js/ReactDOM
;   (.createElement js/React "h2" nil "Hello, React!")
;   (.getElementById js/document "app"))

(defn after-load! []
  (js/console.log "after load!"))

(defn main! []
  (js/console.log "main!"))
