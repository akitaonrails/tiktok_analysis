package com.bytedance.createx.editor.gesture;

import X.C21645419nQ;
import X.C2188811AlT;
import X.C2219091BtD;
import X.InterfaceC379620EuW;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import zoo.b;

/* JADX INFO: loaded from: classes6.dex */
public class GestureInteractItem implements GestureLayout$OnGestureListener {
    public final /* synthetic */ GestureLayout$OnGestureListener LL;
    public final int LLILLJJLI;
    public final InterfaceC379620EuW LLILLL;
    public final GestureLayout$OnGestureListener LLILZ;
    public boolean LLILZIL;
    public final boolean LLILZLL;

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean E2(C21645419nQ c21645419nQ) {
        return this.LL.E2(c21645419nQ);
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LIZIZ(MotionEvent motionEvent) {
        return this.LL.LIZIZ(motionEvent);
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LIZLLL() {
        return this.LL.LIZLLL();
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LJ() {
        return this.LL.LJ();
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final void LJFF(b bVar) {
        this.LL.LJFF(bVar);
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LJIIIZ(float f) {
        return this.LL.LJIIIZ(f);
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final void LJIJJ(MotionEvent motionEvent) {
        this.LL.LJIJJ(motionEvent);
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final void LJJIJIIJIL(MotionEvent motionEvent) {
        this.LL.LJJIJIIJIL(motionEvent);
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LJJLIIIJLJLI(float f) {
        return this.LL.LJJLIIIJLJLI(f);
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LLLLJI(float f) {
        return this.LL.LLLLJI(f);
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LLLLLLLLL(b bVar, float f, float f2) {
        return this.LL.LLLLLLLLL(bVar, f, f2);
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LLLZLZ(b bVar) {
        return this.LL.LLLZLZ(bVar);
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return this.LL.onDown(motionEvent);
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return this.LL.onFling(motionEvent, motionEvent2, f, f2);
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        return this.LL.onScale(scaleGestureDetector);
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return this.LL.onScaleBegin(scaleGestureDetector);
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return this.LL.onScroll(motionEvent, motionEvent2, f, f2);
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return this.LL.onSingleTapConfirmed(motionEvent);
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.LL.onSingleTapUp(motionEvent);
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final void onTouchEvent(MotionEvent motionEvent) {
        this.LL.onTouchEvent(motionEvent);
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public boolean onUp(MotionEvent motionEvent) {
        return this.LL.onUp(motionEvent);
    }

    public final String toString() {
        View contentView;
        if (!this.LLILZLL) {
            return super.toString();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(super.toString());
        sbLIZ.append(",level=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(",gestureInteractView=");
        InterfaceC379620EuW interfaceC379620EuW = this.LLILLL;
        sbLIZ.append((interfaceC379620EuW == null || (contentView = interfaceC379620EuW.getContentView()) == null) ? null : contentView.getClass().getSimpleName());
        sbLIZ.append(",gestureListener=");
        GestureLayout$OnGestureListener gestureLayout$OnGestureListener = this.LLILZ;
        sbLIZ.append(gestureLayout$OnGestureListener != null ? gestureLayout$OnGestureListener.getClass().getSimpleName() : null);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ GestureInteractItem(int i, GestureLayout$OnGestureListener gestureLayout$OnGestureListener) {
        this(i, null, gestureLayout$OnGestureListener, false);
    }

    public GestureInteractItem(int i, final InterfaceC379620EuW interfaceC379620EuW, final GestureLayout$OnGestureListener gestureLayout$OnGestureListener, boolean z) {
        this.LL = (GestureLayout$OnGestureListener) Proxy.newProxyInstance(InterfaceC379620EuW.class.getClassLoader(), new Class[]{GestureLayout$OnGestureListener.class}, new InvocationHandler(interfaceC379620EuW, gestureLayout$OnGestureListener) { // from class: X.0Wex
            public final InterfaceC379620EuW LL;
            public final GestureLayout$OnGestureListener LLILLJJLI;

            {
                this.LL = interfaceC379620EuW;
                this.LLILLJJLI = gestureLayout$OnGestureListener;
            }

            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                boolean zBooleanValue;
                boolean zBooleanValue2;
                boolean z2 = false;
                if (method.getReturnType().equals(Boolean.TYPE)) {
                    if (objArr != null) {
                        for (Object obj2 : objArr) {
                            if (obj2 == null) {
                                return Boolean.FALSE;
                            }
                        }
                    }
                    InterfaceC379620EuW interfaceC379620EuW2 = this.LL;
                    if (interfaceC379620EuW2 != null) {
                        zBooleanValue = ((Boolean) C2204961BRm.a0(method, interfaceC379620EuW2, objArr, new C0WZX("dzBzEgAjS8/YVFkiQFyHdNBipZQqLGW/+XSaZ16n1vzpCWh00DsAzSTDNU2hsSRjJWjyHgH2EbO03jhekx+11IcuuRHP6BXFhg==", null))).booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    GestureLayout$OnGestureListener gestureLayout$OnGestureListener2 = this.LLILLJJLI;
                    if (gestureLayout$OnGestureListener2 != null) {
                        zBooleanValue2 = ((Boolean) C2204961BRm.a0(method, gestureLayout$OnGestureListener2, objArr, new C0WZX("dzBzEgAjS8/YVFkiQFyHdNBipZQqLGW/+XSaZ16n1vzpCWh00DsAzSTDNU2hsSRjJWjyHgH2EbO03jhekx+11IcuuRHP6BXFhg==", null))).booleanValue();
                    } else {
                        zBooleanValue2 = false;
                    }
                    if (zBooleanValue || zBooleanValue2) {
                        z2 = true;
                    }
                    return Boolean.valueOf(z2);
                }
                if (objArr != null) {
                    for (Object obj3 : objArr) {
                        if (obj3 == null) {
                            return null;
                        }
                    }
                }
                InterfaceC379620EuW interfaceC379620EuW3 = this.LL;
                if (interfaceC379620EuW3 != null) {
                    C2204961BRm.a0(method, interfaceC379620EuW3, objArr, new C0WZX("dzBzEgAjS8/YVFkiQFyHdNBipZQqLGW/+XSaZ16n1vzpCWh00DsAzSTDNU2hsSRjJWjyHgH2EbO03jhekx+11IcuuRHP6BXFhg==", null));
                }
                GestureLayout$OnGestureListener gestureLayout$OnGestureListener3 = this.LLILLJJLI;
                if (gestureLayout$OnGestureListener3 != null) {
                    C2204961BRm.a0(method, gestureLayout$OnGestureListener3, objArr, new C0WZX("dzBzEgAjS8/YVFkiQFyHdNBipZQqLGW/+XSaZ16n1vzpCWh00DsAzSTDNU2hsSRjJWjyHgH2EbO03jhekx+11IcuuRHP6BXFhg==", null));
                }
                return null;
            }
        });
        this.LLILLJJLI = i;
        this.LLILLL = interfaceC379620EuW;
        this.LLILZ = gestureLayout$OnGestureListener;
        this.LLILZIL = z;
        this.LLILZLL = C2219091BtD.LIZIZ();
    }
}
