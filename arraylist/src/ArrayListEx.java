import java.util.Objects;

public class ArrayListEx {

    public static void main(String[] args)
    {


    }
}

class Employee{
 private  int empId;
 private String firstName ;
 private String latName;

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", firstName='" + firstName + '\'' +
                ", latName='" + latName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId &&
                firstName.equals(employee.firstName) &&
                latName.equals(employee.latName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, firstName, latName);
    }

    public Employee(int empId, String firstName, String latName) {
        this.empId = empId;
        this.firstName = firstName;
        this.latName = latName;
    }


}
