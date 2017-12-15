;;


(defn captcha-1 [numbers]
  (let [first-val   (first numbers)]
    (->> numbers
         (partition 2 1 [first-val])
         (filter #(= (first %) (second %)))
         (map first)
         (reduce +))))
