// non nullable
fun String.isStringLength5() = this.length == 5
"Hello".isStringLength5()

// nullable
fun String?.isStringLength5Nullable() = this?.length == 5
var name: String? = null
name.isStringLength5Nullable()

val String?.isStringLength5Val: Boolean
    get() = this?.length == 5

"Hello".isStringLength5Val
