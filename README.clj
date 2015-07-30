# clj-dojo

(def order_data
  {:10203025763458  {:ipAddress "23.211.183.44" :customerEmail "neo_2015@hotmail.com" :createdAt 123 :itemCount 2} 
   :10203025753456  {:ipAddress "87.211.183.34" :customerEmail "n_pinto_2015@hotmail.com" :createdAt 456 :itemCount 5}
   :10203025755697  {:ipAddress "123.211.44.114" :customerEmail "nely_po_2015@hotmail.com" :createdAt 12 :itemCount 7}
   :10203025746796  {:ipAddress "87.211.183.44" :customerEmail "nely_pin5@hotmail.com" :createdAt 32 :itemCount 3}
   :10203025734565  {:ipAddress "87.66.183.44" :customerEmail "nely_pi@hotmail.com" :createdAt 35 :itemCount 5}
   :10203025780891  {:ipAddress "34.45.2.144" :customerEmail "nely_5@hotmail.com" :createdAt 545 :itemCount 1}
   :10203025755678  {:ipAddress "37.3.183.241" :customerEmail "5@hotmail.com" :createdAt 3 :itemCount 20}
   :10203025757234  {:ipAddress "87.211.183.44" :customerEmail "into_2015@hotmail.com" :createdAt 543 :itemCount 6}})
   

   
   
   
   

;;-----------------------------
; task: sum up all the itemCount to see how many items are sold
; hint: first get all the values of order_data then map over them to create a list of itemCounts and reduce it to get the total sum

;;-----------------------------


; task: sort a nested map by some value 
;
;
; theory: in a normal hashmap there is no guaranteed order. 
; In clojure there is also a `(sorted-map :z 1, :b 2, :a 3)` but you can't sort by value with this approach.
; Take a look at https://clojuredocs.org/clojure.core/sorted-map-by and try to sort this collection by 'createdAt'
; 
;

;;-----------------------------
; 
