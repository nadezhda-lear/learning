package edu.innotech;

public class StudentRepositoryMock implements StudentRepo{
public int getRaintingForGradeSum(int sum){
    if (sum > 50) return 9;
    return 10;
}

    @Override
    public boolean addNewGrade(int x) {
        if (x < 5 &&x >2) return true;
        return false;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Student entity) {

    }

    @Override
    public void deleteAll(Iterable<Student> entities) {

    }

    @Override
    public Iterable<Student> findAll() {
        return null;
    }

    @Override
    public Student save(Student entityy) {
        return null;
    }

    @Override
    public Iterable<Student> saveAll(Iterable<Student> entities) {
        return null;
    }

}


