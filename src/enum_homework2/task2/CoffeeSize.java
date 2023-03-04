package enum_homework2.task2;

public enum CoffeeSize {
    SMALL{
        @Override
        public void getValue() {
            System.out.println("Name " + SMALL.toString().toLowerCase() + " | Ordinal value = " + SMALL.ordinal());
        }
    }, MEDIUM {
        @Override
        public void getValue() {
            System.out.println("Name " + MEDIUM.toString().toLowerCase() + " | Ordinal value = " + MEDIUM.ordinal());
        }
    }, LARGE {
        @Override
        public void getValue() {
            System.out.println("Name " + LARGE.toString().toLowerCase() + " | Ordinal value = " + LARGE.ordinal());
        }
    };

    public abstract void getValue();

    public static void main(String[] args) {
        LARGE.getValue();
    }
}
