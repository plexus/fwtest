(defproject fwtest "0.1.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.227"]
                 [fipp "0.6.6"]]

  :source-paths ["src" "dev"]

  :plugins [[lein-figwheel "0.5.4-2"]
            [lein-cljsbuild "1.1.4"]]

  :cljsbuild
  {:builds [{:id "dev"
             :figwheel true
             :source-paths ["src"]
             :compiler
             {:main fwtest.gui
              :output-dir "resources/public/js/compiled"
              :output-to  "resources/public/js/compiled/gui.js"
              :asset-path "js/compiled"
              :optimizations :none}}

            {:id "prod"
             :source-paths ["src"]
             :compiler
             {:output-to "resources/public/js/compiled/gui.js"
              :optimizations :advanced}}]})
