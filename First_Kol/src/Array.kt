fun main(a:Array<String>){
    var arr = Array<Int>(5){0}
    var a2:Array<Int> = arrayOf(1,2,3,4,5)
    var arr2 = IntArray(3)
    var arr3 = FloatArray(4)
    var arr4 = intArrayOf(5)
    var arr5 = charArrayOf()
    var arr6 = CharArray(6)
    arr[0] = 58
    arr[1] = 23
    arr[2] = 34
    arr[3] = 56
    arr.set(4,46)
    for(i:Int in arr){
        println(i)
    }
    for(i:Int in 0..4)
    {
        println(arr[i])
        println(arr.get(i))
    }
}