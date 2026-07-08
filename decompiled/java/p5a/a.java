package p5a;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes12.dex */
public class a implements View.OnTouchListener {
    public final float LL;
    public final long LLILLJJLI;
    public View.OnTouchListener LLILLL = null;

    public a(float f, long j) {
        this.LL = f;
        this.LLILLJJLI = j;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                view.animate().alpha(1.0f).setDuration(this.LLILLJJLI).start();
            }
        } else {
            view.animate().alpha(this.LL).setDuration(this.LLILLJJLI).start();
        }
        View.OnTouchListener onTouchListener = this.LLILLL;
        if (onTouchListener != null && onTouchListener.onTouch(view, motionEvent)) {
            return true;
        }
        return false;
    }
}
