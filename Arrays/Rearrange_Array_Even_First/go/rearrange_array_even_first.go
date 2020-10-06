// Program to reorder arrays' entries so that the even entries appear first
// without allocating additional storage.
package main

import "fmt"

func main() {
	fmt.Println("Hello, Mahesh")
	x := [6]int{3, 2, 10, 4, 1, 8}
	e := 0
	o := len(x) - 1
	for e < o {
		if x[e]%2 == 0 {
			e++
		} else {
			x[e], x[o] = x[o], x[e]
			o--
		}
	}
	fmt.Println(x)

}
