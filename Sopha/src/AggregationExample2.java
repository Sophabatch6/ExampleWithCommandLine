class Address1
{
    int streetNum;
    String city;
    String state;
    String country;
    Address1(int street, String c, String st, String coun)
    {
        this.streetNum=street;
        this.city =c;
        this.state = st;
        this.country = coun;
    }
}
class StudentClass1
{
    int rollNum;
    String studentName;
    //Creating HAS-A relationship with Address class
    Address1 studentAddr;
    StudentClass1(int roll, String name, Address1 addr){
        this.rollNum=roll;
        this.studentName=name;
        this.studentAddr = addr;
    }
}
class College
{
    String collegeName;
    //Creating HAS-A relationship with Address class
    Address1 collegeAddr;
    College(String name, Address1 addr){
        this.collegeName = name;
        this.collegeAddr = addr;
    }
}
class Staff
{
    String employeeName;
    //Creating HAS-A relationship with Address class
    Address1 employeeAddr;
    Staff(String name, Address1 addr){
        this.employeeName = name;
        this.employeeAddr = addr;
    }
}