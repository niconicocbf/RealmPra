package prac;

public class employee {
    WorkingListener mworkingLis;

    public void setmOndragL(WorkingListener mOndragL) {
        this.mworkingLis = mworkingLis;
    }
    public void mdowork(){
        mworkingLis.work();
    }
}
