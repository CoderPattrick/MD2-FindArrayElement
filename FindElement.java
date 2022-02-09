public class FindElement {
    public static void main(String[] args) {
        String array[]={"a","b","c","d"};
        String elementToFind = "b";
        int index=indexOfElement(array,elementToFind);
        if(index!=-1){
            System.out.printf("%s is found at position %d of the list array.",elementToFind,index);
        }
        else{
            System.out.printf("%s not found.",elementToFind);
        }
    }
    public static int indexOfElement(String[] arr,String element){
        for (int i = 0; i < arr.length; i++) {
            if(element.equals(arr[i])){
                return i;
            }
        }
        return -1;
    }
}
