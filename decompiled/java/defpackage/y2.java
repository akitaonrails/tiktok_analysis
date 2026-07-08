package defpackage;

import X.C013C;
import X.C238400w2;
import X.C786410Ut5;
import X.C817403Hg;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class y2 {

    public final class a implements View.OnTouchListener {
        public final /* synthetic */ C013C LL;
        public final /* synthetic */ C817403Hg LLILLJJLI;
        public final /* synthetic */ C817403Hg LLILLL;
        public final /* synthetic */ C817403Hg LLILZ;
        public final /* synthetic */ C817403Hg LLILZIL;
        public final /* synthetic */ C817403Hg LLILZLL;
        public final /* synthetic */ C817403Hg LLIZ;
        public final /* synthetic */ C238400w2 LLIZLLLIL;
        public final /* synthetic */ C013C LLJ;
        public final /* synthetic */ float LLJI;
        public final /* synthetic */ long LLJIJIL;
        public final /* synthetic */ ViewGroup LLJILJIL;

        public a(C013C c013c, C817403Hg c817403Hg, C817403Hg c817403Hg2, C817403Hg c817403Hg3, C817403Hg c817403Hg4, C817403Hg c817403Hg5, C817403Hg c817403Hg6, C238400w2 c238400w2, C013C c013c2, float f, long j, ViewGroup viewGroup) {
            this.LL = c013c;
            this.LLILLJJLI = c817403Hg;
            this.LLILLL = c817403Hg2;
            this.LLILZ = c817403Hg3;
            this.LLILZIL = c817403Hg4;
            this.LLILZLL = c817403Hg5;
            this.LLIZ = c817403Hg6;
            this.LLIZLLLIL = c238400w2;
            this.LLJ = c013c2;
            this.LLJI = f;
            this.LLJIJIL = j;
            this.LLJILJIL = viewGroup;
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) throws Throwable {
            if (this.LL.element) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action != 3) {
                            return false;
                        }
                        return true;
                    }
                    if (!this.LLJ.element && Math.abs(motionEvent.getRawX() - this.LLILLJJLI.element) + Math.abs(motionEvent.getRawY() - this.LLILLL.element) > this.LLJI) {
                        this.LLJ.element = true;
                    }
                    if (this.LLJ.element) {
                        float rawX = motionEvent.getRawX() - this.LLILZ.element;
                        float rawY = motionEvent.getRawY() - this.LLILZIL.element;
                        C786410Ut5.Jc(view, view.getTranslationX() + rawX);
                        C786410Ut5.ed(view, view.getTranslationY() + rawY);
                        this.LLILZ.element = motionEvent.getRawX();
                        this.LLILZIL.element = motionEvent.getRawY();
                        return true;
                    }
                    return true;
                }
                long jUptimeMillis = SystemClock.uptimeMillis() - this.LLIZLLLIL.element;
                float fAbs = Math.abs(motionEvent.getRawX() - this.LLILZLL.element);
                float fAbs2 = Math.abs(motionEvent.getRawY() - this.LLIZ.element);
                if (jUptimeMillis < this.LLJIJIL) {
                    float f = this.LLJI;
                    if (fAbs < f && fAbs2 < f) {
                        ViewGroup viewGroup = this.LLJILJIL;
                        long j = this.LLIZLLLIL.element;
                        AwS608S0100000_29 awS608S0100000_29 = new AwS608S0100000_29(this.LL, 884);
                        awS608S0100000_29.invoke(Boolean.TRUE);
                        boolean zIsClickable = view.isClickable();
                        boolean zIsLongClickable = view.isLongClickable();
                        view.setClickable(false);
                        view.setLongClickable(false);
                        MotionEvent motionEventObtain = MotionEvent.obtain(j, j, 0, motionEvent.getRawX(), motionEvent.getRawY(), 0);
                        MotionEvent motionEventObtain2 = MotionEvent.obtain(j, SystemClock.uptimeMillis(), 1, motionEvent.getRawX(), motionEvent.getRawY(), 0);
                        viewGroup.getLocationOnScreen(new int[2]);
                        float f2 = -r10[0];
                        float f3 = -r10[1];
                        motionEventObtain.offsetLocation(f2, f3);
                        motionEventObtain2.offsetLocation(f2, f3);
                        try {
                            viewGroup.dispatchTouchEvent(motionEventObtain);
                            viewGroup.dispatchTouchEvent(motionEventObtain2);
                            motionEventObtain.recycle();
                            motionEventObtain2.recycle();
                            view.setClickable(zIsClickable);
                            view.setLongClickable(zIsLongClickable);
                            awS608S0100000_29.invoke(Boolean.FALSE);
                            return true;
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    motionEventObtain.recycle();
                                    motionEventObtain2.recycle();
                                    view.setClickable(zIsClickable);
                                    view.setLongClickable(zIsLongClickable);
                                    awS608S0100000_29.invoke(Boolean.FALSE);
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                this.LLILLJJLI.element = motionEvent.getRawX();
                this.LLILLL.element = motionEvent.getRawY();
                this.LLILZ.element = motionEvent.getRawX();
                this.LLILZIL.element = motionEvent.getRawY();
                this.LLILZLL.element = motionEvent.getRawX();
                this.LLIZ.element = motionEvent.getRawY();
                this.LLIZLLLIL.element = SystemClock.uptimeMillis();
                this.LLJ.element = false;
                return true;
            }
        }
    }

    public static final void LIZ(View view, ViewGroup viewGroup) {
        float scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        long tapTimeout = ViewConfiguration.getTapTimeout();
        view.setOnTouchListener(new a(new C013C(), new C817403Hg(), new C817403Hg(), new C817403Hg(), new C817403Hg(), new C817403Hg(), new C817403Hg(), new C238400w2(), new C013C(), scaledTouchSlop, tapTimeout, viewGroup));
    }
}
