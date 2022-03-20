package inheritance.stackOfStrings;

import java.util.ArrayList;

public class StackOfStrings {
    private ArrayList<String> data;

    public StackOfStrings() {
        data = new ArrayList<>();
    }

    public void push(String item) {
        this.data.add(0, item);
    }

    public String pop() {
        String stringToPop = this.data.get(0);
        this.data.remove(0);
        return stringToPop;
    }

    public String peek() {
        String stringToPop = this.data.get(0);
        return stringToPop;
    }

    public boolean isEmpty() {
        if (this.data.isEmpty())
            return true;
        return false;
    }

}
