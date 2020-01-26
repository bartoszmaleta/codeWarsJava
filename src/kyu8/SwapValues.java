package kyu8;

class SwapValues {

    public Object[] arguments;

    public SwapValues(final Object[] args) {
        arguments = args;
    }

    public void swapValues() {
        Object[] args = new Object[] { arguments[0], arguments[1] };
        Object temp = args[0];
        arguments[0] = args[1];
        arguments[1] = temp;
    }
}