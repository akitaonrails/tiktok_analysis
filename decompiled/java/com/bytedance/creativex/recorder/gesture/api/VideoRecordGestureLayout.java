package com.bytedance.creativex.recorder.gesture.api;

import X.C0FEV;
import X.C19290410dS;
import X.C21645419nQ;
import X.InterfaceC1650300t2y;
import X.InterfaceC21645219nO;
import X.InterfaceC21645719nT;
import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import zoo.b;

/* JADX INFO: loaded from: classes34.dex */
public class VideoRecordGestureLayout extends FrameLayout implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener {
    public InterfaceC21645719nT LL;
    public InterfaceC1650300t2y LLILLJJLI;
    public C19290410dS LLILLL;
    public ScaleGestureDetector LLILZ;
    public C21645419nQ LLILZIL;
    public b LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public float LLJIJIL;
    public float LLJILJIL;
    public boolean LLJILJILJ;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    public InterfaceC21645719nT getOnGestureListener() {
        return this.LL;
    }

    public ScaleGestureDetector getScaleGestureDetector() {
        return this.LLILZ;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i = measuredWidth / 10;
        int i2 = measuredHeight / 10;
        if (this.LL == null) {
            return false;
        }
        float x = motionEvent.getX() - this.LLJ;
        float y = motionEvent.getY() - this.LLJI;
        if ((x * x) + (y * y) >= this.LLIZLLLIL) {
            return false;
        }
        float f = i;
        if (motionEvent.getX() >= f && measuredWidth - motionEvent.getX() >= f) {
            float f2 = i2;
            if (motionEvent.getY() >= f2 && measuredHeight - motionEvent.getY() >= f2) {
                return this.LL.LIZIZ(motionEvent);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.LLJIJIL = motionEvent.getX();
            this.LLJILJIL = motionEvent.getY();
            return false;
        }
        InterfaceC1650300t2y interfaceC1650300t2y = this.LLILLJJLI;
        if (interfaceC1650300t2y != null && interfaceC1650300t2y.LJIIJJI(motionEvent, this.LLJIJIL, this.LLJILJIL)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        InterfaceC21645719nT interfaceC21645719nT = this.LL;
        if (interfaceC21645719nT != null) {
            interfaceC21645719nT.LIZ();
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        InterfaceC21645719nT interfaceC21645719nT = this.LL;
        if (interfaceC21645719nT != null) {
            boolean zOnScale = interfaceC21645719nT.onScale(scaleGestureDetector);
            if (zOnScale) {
                this.LLIZ = scaleGestureDetector.getScaleFactor();
            }
            return zOnScale;
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        InterfaceC21645719nT interfaceC21645719nT = this.LL;
        if (interfaceC21645719nT != null && interfaceC21645719nT.onScaleBegin(scaleGestureDetector)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        InterfaceC21645719nT interfaceC21645719nT = this.LL;
        if (interfaceC21645719nT != null) {
            interfaceC21645719nT.LLLLJI(this.LLIZ);
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        InterfaceC21645719nT interfaceC21645719nT = this.LL;
        if (interfaceC21645719nT != null && interfaceC21645719nT.onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.LLJ = motionEvent.getX();
        this.LLJI = motionEvent.getY();
        InterfaceC21645719nT interfaceC21645719nT = this.LL;
        if (interfaceC21645719nT != null && interfaceC21645719nT.onSingleTapUp(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ScaleGestureDetector scaleGestureDetector = this.LLILZ;
        if (scaleGestureDetector != null) {
            scaleGestureDetector.onTouchEvent(motionEvent);
        }
        this.LLILZIL.LIZJ(motionEvent);
        this.LLILZLL.LIZJ(motionEvent);
        if ((motionEvent.getAction() & 255) == 0) {
            this.LLJILJILJ = false;
        }
        if (motionEvent.getPointerCount() > 1) {
            this.LLJILJILJ = true;
        }
        if (!this.LLJILJILJ) {
            this.LLILLL.LIZ(motionEvent);
            return true;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.LLILLL.LIZ(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
        return true;
    }

    public void setOnGestureListener(InterfaceC21645719nT interfaceC21645719nT) {
        this.LL = interfaceC21645719nT;
    }

    public void setOnInterceptListener(InterfaceC1650300t2y interfaceC1650300t2y) {
        this.LLILLJJLI = interfaceC1650300t2y;
    }

    public void setSloppyExtra(int i) {
        this.LLILZIL.LJIIJJI = i;
    }

    public VideoRecordGestureLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLIZ = 1.0f;
        C0FEV c0fev = new C0FEV() { // from class: X.19nU
            @Override // X.C0FEV, X.InterfaceC21645519nR
            public final void LIZ(C21645419nQ c21645419nQ) {
                float fLJI = c21645419nQ.LJI();
                InterfaceC21645719nT interfaceC21645719nT = this.LIZ.LL;
                if (interfaceC21645719nT != null) {
                    interfaceC21645719nT.LJIIIZ(fLJI);
                }
            }

            @Override // X.InterfaceC21645519nR
            public final boolean LIZIZ(C21645419nQ c21645419nQ) {
                float fLJI = c21645419nQ.LJI();
                InterfaceC21645719nT interfaceC21645719nT = this.LIZ.LL;
                if (interfaceC21645719nT != null) {
                    interfaceC21645719nT.LJJLIIIJLJLI(fLJI);
                    return true;
                }
                return true;
            }

            @Override // X.C0FEV, X.InterfaceC21645519nR
            public final void LIZJ(C21645419nQ c21645419nQ) {
                InterfaceC21645719nT interfaceC21645719nT = this.LIZ.LL;
                if (interfaceC21645719nT != null) {
                    interfaceC21645719nT.E2(c21645419nQ);
                }
            }
        };
        InterfaceC21645219nO interfaceC21645219nO = new InterfaceC21645219nO() { // from class: X.19nV
            @Override // X.InterfaceC21645219nO
            public final void LJFF(b bVar) {
                InterfaceC21645719nT interfaceC21645719nT = this.LIZ.LL;
                if (interfaceC21645719nT != null) {
                    interfaceC21645719nT.LJFF(bVar);
                }
            }

            @Override // X.InterfaceC21645219nO
            public final boolean LLLZLZ(b bVar) {
                InterfaceC21645719nT interfaceC21645719nT = this.LIZ.LL;
                if (interfaceC21645719nT != null) {
                    interfaceC21645719nT.LLLZLZ(bVar);
                    return true;
                }
                return true;
            }

            @Override // X.InterfaceC21645219nO
            public final void LLLLLLLLL(b bVar, float f, float f2) {
                InterfaceC21645719nT interfaceC21645719nT = this.LIZ.LL;
                if (interfaceC21645719nT != null) {
                    interfaceC21645719nT.LLLLLLLLL(bVar, f, f2);
                }
            }
        };
        this.LLILZIL = new C21645419nQ(context, c0fev);
        this.LLILZLL = new b(context, interfaceC21645219nO);
        C19290410dS c19290410dS = new C19290410dS(context, this, null);
        this.LLILLL = c19290410dS;
        c19290410dS.LIZIZ(this);
        this.LLILZ = new ScaleGestureDetector(context, this);
        float scaledDoubleTapSlop = ViewConfiguration.get(getContext()).getScaledDoubleTapSlop();
        this.LLIZLLLIL = scaledDoubleTapSlop * scaledDoubleTapSlop;
        setOnTouchListener(this);
        try {
            Field declaredField = this.LLILZ.getClass().getDeclaredField("mSpanSlop");
            declaredField.setAccessible(true);
            int iIntValue = ((Integer) declaredField.get(this.LLILZ)).intValue();
            Field declaredField2 = this.LLILZ.getClass().getDeclaredField("mMinSpan");
            declaredField2.setAccessible(true);
            declaredField2.set(this.LLILZ, Integer.valueOf(iIntValue * 6));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        InterfaceC21645719nT interfaceC21645719nT = this.LL;
        if (interfaceC21645719nT == null) {
            return false;
        }
        interfaceC21645719nT.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                if (action != 5) {
                    if (action == 6) {
                        this.LL.LIZLLL();
                    }
                    return false;
                }
                this.LL.LJ();
                return false;
            }
            this.LL.onUp(motionEvent);
            return false;
        }
        this.LL.onDown(motionEvent);
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        InterfaceC21645719nT interfaceC21645719nT = this.LL;
        if (interfaceC21645719nT != null && interfaceC21645719nT.onFling(motionEvent, motionEvent2, f, f2)) {
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        InterfaceC21645719nT interfaceC21645719nT;
        if (motionEvent == null || motionEvent2 == null || (interfaceC21645719nT = this.LL) == null) {
            return false;
        }
        interfaceC21645719nT.onScroll(motionEvent, motionEvent2, f, f2);
        return true;
    }
}
