(defproject figweel-hello "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.2"]
                 [cider/piggieback "0.5.2"]]
  :profiles 
     {:dev
       {:dependencies [[org.clojure/clojurescript "1.10.773"]
                       [com.bhauman/figwheel-main "0.2.12"]]}})
