(ns ^{:author "Nafisa Khandaker"
 :doc "JavaScript Object Notation (JSON) processor"}
clojure-utility.org.clingen.clj.utility.jsonutil
(:require [cheshire.core :as json]
          [clojure.java.io :as io])
(:import [java.util Map List]))
  
 ;This function takes a json file location and read it.
 (defn read-json [jfile-path]
    (json/parse-stream (io/reader jfile-path)))

;Extract root elements 
(defn get-root-elements [jsondata]
  (for [elm jsondata]
     (let [root (get-in elm[0])]
          root)))

;Extracts elements
(defn get-elements [jsondata]
   (for [elm jsondata]
      (if (nil? (get-in elm[1])) "" (let [valu (get-in elm[1])]                                      
           valu ))))

;Extracts elements by tag
(defn get-elements-by-tag [jsondata tag]
   (for [elm jsondata]
      (if (nil? (get-in elm[tag])) "" (let [tvalu (get-in elm[tag])]                                      
           tvalu ))))