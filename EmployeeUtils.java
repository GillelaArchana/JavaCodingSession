public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        Employee jiya = new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0);
        Employee paul = new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0);
        Employee martin = new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0);
        Employee murali = new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0);
        Employee nima = new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0);
        Employee jasna = new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0);
        Employee iqbal = new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0);
        Employee sanvi = new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0);
        Employee anuj = new Employee(277, "Anuj", 31, "Male", "Product Development", 2012, 35700.0);

        employees.add(jiya);
        employees.add(paul);
        employees.add(martin);
        employees.add(murali);
        employees.add(nima);
        employees.add(jasna);
        employees.add(iqbal);
        employees.add(sanvi);
        employees.add(anuj);

        return employees;
    }

    public Map<String, Integer> employeeCountInEachDep(List<Employee> emps) {
        Map<String, Integer> empDepAndCount = new HashMap<>();
        for (Employee e : emps) {
            if(empDepAndCount.containsKey(e.getDepartment())) {
                empDepAndCount.put(e.getDepartment(), empDepAndCount.get(e.getDepartment()) + 1);
            } else {
                empDepAndCount.put(e.getDepartment(), 1);
            }
        }

        return empDepAndCount;
    }

    public Map<String, Set<String>> employeesInEachDep(List<Employee> emps) {
        Map<String, Set<String>> depAndEmps = new HashMap<>();
        for (Employee e : emps) {
            if(depAndEmps.containsKey(e.getDepartment())) {
                Set<String> empsInADep = depAndEmps.get(e.getDepartment());
                empsInADep.add(e.getName());
                depAndEmps.put(e.getDepartment(), empsInADep);
            } else {
                Set<String> empsInDep = new HashSet<>();
                depAndEmps.put(e.getDepartment(), empsInDep);
            }
        }

        return depAndEmps;
    }
