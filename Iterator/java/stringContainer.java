public class stringContainer implements Container{
    public String list[] = {"Hola", "Aloh", "Ok"};

    @Override
   public Iterator getIterator() {
      return new ListIterator();
   }

    private class ListIterator implements Iterator {
        int index;
        
        @Override
        public boolean hasNext(){
            return index < list.length;
        }

        @Override
        public Object next(){
            if(!this.hasNext()) return null;
            
            return list[index++];
        }
    }
}
