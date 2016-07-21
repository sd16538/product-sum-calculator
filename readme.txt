Given a range of consecutive numbers, from 1 to n (inclusive). e.g. [1, 2, 3, 4... n], calculate a sum of a function across the entire range, where the function returns the product of the preceding C elements.

If there are less than C previous elements, just use the available numbers. i.e. if you are processing the fourth number in the range, but C is greater than 3, then you will calculate the product using only the 3 available preceding numbers. In this situation as you move further along in this range more preceding numbers become available.

A worked example: if n=5 and C=2, the correct products and final sum for each element of the range are: 0 + 1 + 2 + 6 + 12 = 21
