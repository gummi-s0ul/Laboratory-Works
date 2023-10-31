package LabWork18;

import java.util.Objects;

public class Task5 {
    public static void main(String[] args) {
        Custom custom = new Custom();
//        custom.setKey(5);

        try {
            if (Objects.isNull(custom.getDetails())) {
                throw new NullPointerException("Null key in getDetails");
            }
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Program terminated");
        }
    }

     static class Custom {
        private Integer key;

        public Integer getDetails() {
            return key;
        }

//        public void setKey(int num) {
//            key = num;
//         }
    }
}