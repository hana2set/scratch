class Scratch {

    public static void main(String[] args) {
//        new Scratch().method();
        Test tc = new Scratch().new Test();
        tc.tempmethod();
    }

    public void method() {
        System.out.println("this.method");
        Test tc = new Test();
        tc.method();
    }

    private class Test{

        public void tempmethod() {
            System.out.println("내부클래스.tempmethod");
            Scratch.this.method();
        }
        public void method() {
            System.out.println("내부클래스.method");
            return;
        }
    }
}
