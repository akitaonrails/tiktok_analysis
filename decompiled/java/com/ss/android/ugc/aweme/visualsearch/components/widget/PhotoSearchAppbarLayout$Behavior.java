package com.ss.android.ugc.aweme.visualsearch.components.widget;

import X.AnonymousClass0208;
import X.C16G0;
import X.C16GK;
import X.C16GX;
import X.C20747416Gq;
import X.C20747516Gr;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import java.lang.reflect.Field;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS158S0400000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class PhotoSearchAppbarLayout$Behavior extends AppBarLayout$Behavior {
    public boolean LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public float LIZLLL;
    public float LJ;

    /* JADX WARN: Multi-variable type inference failed */
    public final Field LIZIZ() {
        Class superclass;
        Class superclass2;
        Class superclass3 = PhotoSearchAppbarLayout$Behavior.class.getSuperclass();
        Field declaredField = null;
        if (superclass3 != null) {
            try {
                superclass = superclass3.getSuperclass();
            } catch (NoSuchFieldException e) {
                TryCatchGuardChecker.doCheck(e);
                Class superclass4 = (superclass3 == null || (superclass2 = superclass3.getSuperclass()) == null) ? declaredField : superclass2.getSuperclass();
                return superclass4 != 0 ? superclass4.getDeclaredField("flingRunnable") : declaredField;
            }
        } else {
            superclass = null;
        }
        if (superclass == null) {
            return null;
        }
        declaredField = superclass.getDeclaredField("mFlingRunnable");
        return declaredField;
    }

    public PhotoSearchAppbarLayout$Behavior() {
        this.LIZIZ = -1;
        setDragCallback(new C16GK<C16GX>() { // from class: X.16Gs
            @Override // X.C16GK
            public final boolean LIZ(C16GX c16gx) {
                return true;
            }
        });
    }

    public PhotoSearchAppbarLayout$Behavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LIZIZ = -1;
        setDragCallback(new C16GK<C16GX>() { // from class: X.16Gs
            @Override // X.C16GK
            public final boolean LIZ(C16GX c16gx) {
                return true;
            }
        });
    }

    @Override // com.google.android.material.appbar.HeaderBehavior, X.C16BC
    public final boolean onInterceptTouchEvent(C16G0 c16g0, View view, MotionEvent motionEvent) {
        C16GX c16gx = (C16GX) view;
        if (motionEvent.getActionMasked() == 0 && (c16gx instanceof C20747416Gq)) {
            boolean z = false;
            this.LIZJ = false;
            this.LIZLLL = motionEvent.getRawX();
            this.LJ = motionEvent.getRawY();
            C20747416Gq c20747416Gq = (C20747416Gq) c16gx;
            Function0<Boolean> function0 = c20747416Gq.LLJJIJIIJIL;
            if (function0 != null && function0.invoke().booleanValue()) {
                z = true;
            }
            this.LIZ = z;
            this.LIZIZ = -1;
            if (z) {
                C20747516Gr c20747516Gr = c20747416Gq.LLJJIJI;
                c20747516Gr.getClass();
                c20747516Gr.LIZLLL = motionEvent.getRawX();
                c20747516Gr.LJ = motionEvent.getRawY();
                c20747516Gr.LJI = -1;
            }
        }
        return super.onInterceptTouchEvent(c16g0, c16gx, motionEvent);
    }

    @Override // com.google.android.material.appbar.HeaderBehavior, X.C16BC
    public final boolean onTouchEvent(C16G0 c16g0, View view, MotionEvent motionEvent) {
        float rawX;
        int i;
        C16GX c16gx = (C16GX) view;
        if (c16gx instanceof C20747416Gq) {
            AwS158S0400000_31 awS158S0400000_31 = new AwS158S0400000_31(motionEvent, c16g0, c16gx, this, 2);
            if (this.LIZIZ == -1) {
                float fAbs = Math.abs(motionEvent.getRawX() - this.LIZLLL);
                float fAbs2 = Math.abs(motionEvent.getRawY() - this.LJ);
                float f = (fAbs * fAbs) + (fAbs2 * fAbs2);
                C20747416Gq c20747416Gq = (C20747416Gq) c16gx;
                int scaledTouchSlop = ViewConfiguration.get(c20747416Gq.getContext()).getScaledTouchSlop();
                if (f > scaledTouchSlop * scaledTouchSlop) {
                    if (fAbs2 > fAbs) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    this.LIZIZ = i;
                }
                if (this.LIZIZ == 0 && this.LIZ) {
                    c20747416Gq.LLJJIJI.LJII.stopNestedScroll(0);
                }
            }
            if (!this.LIZ && this.LIZIZ != 0) {
                C20747416Gq c20747416Gq2 = (C20747416Gq) c16gx;
                boolean zLJIIIIZZ = c20747416Gq2.LJIIIIZZ();
                boolean z = this.LIZJ;
                this.LIZJ = zLJIIIIZZ;
                if (z != zLJIIIIZZ && zLJIIIIZZ) {
                    C20747516Gr c20747516Gr = c20747416Gq2.LLJJIJI;
                    float rawY = 0.0f;
                    if (motionEvent != null) {
                        c20747516Gr.getClass();
                        rawX = motionEvent.getRawX();
                    } else {
                        rawX = 0.0f;
                    }
                    c20747516Gr.LIZLLL = rawX;
                    if (motionEvent != null) {
                        rawY = motionEvent.getRawY();
                    }
                    c20747516Gr.LJ = rawY;
                    c20747516Gr.LJI = -1;
                }
                if (this.LIZJ) {
                    this.LIZ = c20747416Gq2.LJIIIZ(motionEvent, AnonymousClass0208.get$arr$(9));
                }
            }
            if (this.LIZ && this.LIZIZ == 1) {
                return ((C20747416Gq) c16gx).LJIIIZ(motionEvent, AnonymousClass0208.get$arr$(10));
            }
            return ((Boolean) awS158S0400000_31.invoke()).booleanValue();
        }
        return super.onTouchEvent(c16g0, c16gx, motionEvent);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, X.C16BC
    public final /* bridge */ /* synthetic */ void onStopNestedScroll(C16G0 c16g0, View view, View view2, int i) {
        onStopNestedScroll(c16g0, (C16GX) view, view2, i);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
    public final void onStopNestedScroll(C16G0 c16g0, C16GX c16gx, View view, int i) {
        super.onStopNestedScroll(c16g0, c16gx, view, i);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
    public final boolean onStartNestedScroll(C16G0 c16g0, C16GX c16gx, View view, View view2, int i, int i2) {
        Runnable runnable;
        try {
            Field fieldLIZIZ = LIZIZ();
            if (fieldLIZIZ != null) {
                fieldLIZIZ.setAccessible(true);
                Object obj = fieldLIZIZ.get(this);
                if ((obj instanceof Runnable) && (runnable = (Runnable) obj) != null) {
                    HandlerHook.viewRemoveCallbacks(c16gx, runnable);
                    fieldLIZIZ.set(this, null);
                }
            }
            Class superclass = PhotoSearchAppbarLayout$Behavior.class.getSuperclass();
            if (superclass != null) {
                superclass.getSuperclass();
            }
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (NoSuchFieldException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        return super.onStartNestedScroll(c16g0, c16gx, view, view2, i, i2);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, X.C16BC
    public final /* bridge */ /* synthetic */ boolean onStartNestedScroll(C16G0 c16g0, View view, View view2, View view3, int i, int i2) {
        return onStartNestedScroll(c16g0, (C16GX) view, view2, view3, i, i2);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, X.C16BC
    public final void onNestedPreScroll(C16G0 c16g0, View view, View view2, int i, int i2, int[] iArr, int i3) {
        super.onNestedPreScroll(c16g0, (C16GX) view, view2, i, i2, iArr, i3);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
    public final void onNestedPreScroll(C16G0 c16g0, C16GX c16gx, View view, int i, int i2, int[] iArr, int i3) {
        super.onNestedPreScroll(c16g0, c16gx, view, i, i2, iArr, i3);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, X.C16BC
    public final void onNestedScroll(C16G0 c16g0, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        super.onNestedScroll(c16g0, (C16GX) view, view2, i, i2, i3, i4, i5, iArr);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
    public final void onNestedScroll(C16G0 c16g0, C16GX c16gx, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        super.onNestedScroll(c16g0, c16gx, view, i, i2, i3, i4, i5, iArr);
    }
}
