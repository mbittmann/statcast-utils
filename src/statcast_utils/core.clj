(ns statcast-utils.core
  (:gen-class)
   (:require [clj-http.client :as client])
   (:require [clojure.data.json :as json])
  )
  
(defn get-body-contents
  [url]
    ;;check type of returned object
    (let [response (client/get url {:as :json})]
    	( println "Found response content type: " ((response :headers) :Content-Type))
    	(get response :body))
  )

(defn get-innings
	[result-body]
	(get-in result-body [:data :game :inning])
	)

(defn get-atbat-description
	[atbat]
	(str "\t" (get atbat :des))
	)

(defn parse-half-inning
 	[half]
	(map get-atbat-description (get-in half [:atbat]))
)

(defn -main
  "Print the plays for an MLB statcast output."
  [url inning & args]
  ; (get-contents url)
  (let [result-body (get-body-contents url)]
  	(let [innings (get-innings result-body)]
  		(let [inning (get innings (dec (read-string inning)))]
  			(let [plays (concat ["****Top:"] (parse-half-inning (get inning :top))
  			["****Bottom:"] (parse-half-inning (get inning :bottom)))]
  				(println (clojure.string/join "\n" plays))
  			)

  		)
  	)
  )
)


