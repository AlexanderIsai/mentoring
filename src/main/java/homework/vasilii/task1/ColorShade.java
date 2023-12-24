package homework.vasilii.task1;

public enum ColorShade {
    RED {
        @Override
        public void doSomething() {

        }
    },
    GREEN {
        @Override
        public void doSomething() {

        }
    },
    BLUE {
        @Override
        public void doSomething() {

        }
    },
    YELLOW {
        @Override
        public void doSomething() {

        }
    };

    ColorShade() {
        System.out.println("Constructor called for " + this.name());
    }

    public abstract void doSomething();

}
