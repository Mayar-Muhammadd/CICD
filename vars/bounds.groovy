def call(int lower, int upper) {
    if (lower > upper) {
        error "Lower bound cannot be greater than upper bound!"
    }
    return (lower..upper).toList()
}
def call(int x) { return x * 2 }
