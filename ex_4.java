class human {
    void print() {
        System.out.println("human");
    }
}

class men extends human {
    void print() {
        System.out.println("men");
    }
}

class women extends human {
    void print() {
        System.out.println("women");
    }
}

public class ex_4 {
    public static void main(String[] args) {
        human a = new human();
        a.print();
        men b = new men();
        b.print();
        women c = new women();
        c.print();
        System.out.println("Created by harsh patel  id no=21ce090");
    }
}