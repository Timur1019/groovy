static def countElements(nums) {
  def countMap = [:].withDefault { 0 }

  nums.each { num ->
    countMap[num]++
  }

  return countMap
}

static void main(String[] args) {
  def nums = [1, 3, 4, 5, 1, 5, 4]
  def result = countElements(nums)
  println result
}
