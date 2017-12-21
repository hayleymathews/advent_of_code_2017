;;


(defn checksum-1 [matrix]
  (->> matrix
       (map (fn [row] (- (apply max row) (apply min row))))
       (reduce +)
  )
)
