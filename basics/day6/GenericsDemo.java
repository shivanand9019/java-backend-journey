class Box<T>{
    private T value;
    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }
}

public class GenericsDemo {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setValue(56);
        int intValue = intBox.getValue();
        System.out.println("Integer Value: " + intValue);

        Box<Float> flaotBox = new Box<>();
        flaotBox.setValue(7.99f);
        float flaotValue  = flaotBox.getValue();
        System.out.println("Float Value:"+flaotValue);
        
    }
    
}
