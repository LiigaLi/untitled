package lekcijaCetri.majasDarbs.classHomework;

public class Main {
    public static void main(String[] args) {
        Trissturis trissturis1 = new Trissturis();
        trissturis1.a = 3;
        trissturis1.b = 4;
        trissturis1.c = 4;

        Trissturis trissturis2 = new Trissturis(2,2,2);
        Trissturis trissturis3 = new Trissturis(4,5,4);
        Trissturis trissturis4 = new Trissturis(7,6,5);
        Trissturis trissturis5 = new Trissturis(7,6,6);

        trissturis1.rekinatLaukumu();
        trissturis2.rekinatLaukumu();
        trissturis3.rekinatLaukumu();
        trissturis4.rekinatLaukumu();
        trissturis5.rekinatLaukumu();


        System.out.println(trissturis1.vaiTrissturisIrVienadmalu());
        System.out.println(trissturis2.vaiTrissturisIrVienadmalu());
        System.out.println(trissturis3.vaiTrissturisIrVienadmalu());
        System.out.println(trissturis4.vaiTrissturisIrVienadmalu());
        System.out.println(trissturis5.vaiTrissturisIrVienadmalu());

        System.out.println(trissturis1.vaiTrissturisIrVienadsanu());
        System.out.println(trissturis2.vaiTrissturisIrVienadsanu());
        System.out.println(trissturis3.vaiTrissturisIrVienadsanu());
        System.out.println(trissturis4.vaiTrissturisIrVienadsanu());
        System.out.println(trissturis5.vaiTrissturisIrVienadsanu());





    }


}

