package try1;

import java.util.HashMap;

public class HashMapEx {

    public HashMap<Integer, Student> buildMap(Student[] students) {
        HashMap<Integer, Student> map = new HashMap<>();
        for(Student s : students)
            map.put(s.getId(), s);

        return map;
    }

    private class Student {

        private Integer id;
        public Integer getId() {
            return id;
        }
    }

}
