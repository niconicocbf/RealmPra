package prac;

import android.util.Log;

public class Boss implements WorkingListener {

    @Override
    public void work() {
        Log.d("work","干活啦！");
    }
    public void command(){
        employee memployee=new employee();
        memployee.setmOndragL(this);
    }
}
