import static sun.security.util.Debug.println

class GroovySolution {
    static void main(String[] args) {
        def certs = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 6, 1, 6, 4, 3, 1, 6, 4, 5]
        Map counts = certs.countBy {it}
        counts.findAll { it.value == counts.values().max() }
        println counts
    }
}
