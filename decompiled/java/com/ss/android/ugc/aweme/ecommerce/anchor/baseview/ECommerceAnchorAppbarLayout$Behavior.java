package com.ss.android.ugc.aweme.ecommerce.anchor.baseview;

import X.AnonymousClass0208;
import X.C16G0;
import X.C16GK;
import X.C16GX;
import X.C18Z4;
import X.C18Z5;
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
import kotlin.jvm.internal.AwS159S0400000_32;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class ECommerceAnchorAppbarLayout$Behavior extends AppBarLayout$Behavior {
    public final int LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public boolean LJFF;
    public float LJI;
    public float LJII;
    public AwS576S0100000_32 LJIIIIZZ;

    /* JADX WARN: Multi-variable type inference failed */
    public final Field LIZIZ() {
        Class superclass;
        Class superclass2;
        Class superclass3 = ECommerceAnchorAppbarLayout$Behavior.class.getSuperclass();
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

    public ECommerceAnchorAppbarLayout$Behavior() {
        this.LIZ = 1;
        this.LJ = -1;
        setDragCallback(new C16GK<C16GX>() { // from class: X.16Gt
            @Override // X.C16GK
            public final boolean LIZ(C16GX c16gx) {
                return true;
            }
        });
    }

    public final void LIZJ(C16GX c16gx) {
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
            Class superclass = ECommerceAnchorAppbarLayout$Behavior.class.getSuperclass();
            if (superclass != null) {
                superclass.getSuperclass();
            }
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (NoSuchFieldException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public ECommerceAnchorAppbarLayout$Behavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LIZ = 1;
        this.LJ = -1;
        setDragCallback(new C16GK<C16GX>() { // from class: X.16Gt
            @Override // X.C16GK
            public final boolean LIZ(C16GX c16gx) {
                return true;
            }
        });
    }

    @Override // com.google.android.material.appbar.HeaderBehavior, X.C16BC
    public final boolean onInterceptTouchEvent(C16G0 c16g0, View view, MotionEvent motionEvent) {
        C16GX c16gx = (C16GX) view;
        boolean z = false;
        this.LIZJ = false;
        if (this.LIZIZ) {
            this.LIZJ = true;
        }
        if (motionEvent.getActionMasked() == 0) {
            LIZJ(c16gx);
        }
        if (motionEvent.getActionMasked() == 0 && (c16gx instanceof C18Z4)) {
            this.LJFF = false;
            this.LJI = motionEvent.getRawX();
            this.LJII = motionEvent.getRawY();
            C18Z4 c18z4 = (C18Z4) c16gx;
            Function0<Boolean> function0 = c18z4.LLJJIJIIJIL;
            if (function0 != null && function0.invoke().booleanValue()) {
                z = true;
            }
            this.LIZLLL = z;
            this.LJ = -1;
            if (z) {
                C18Z5 c18z5 = c18z4.LLJJIJI;
                c18z5.getClass();
                c18z5.LIZLLL = motionEvent.getRawX();
                c18z5.LJ = motionEvent.getRawY();
                c18z5.LJI = -1;
            }
        }
        return super.onInterceptTouchEvent(c16g0, c16gx, motionEvent);
    }

    @Override // com.google.android.material.appbar.HeaderBehavior, X.C16BC
    public final boolean onTouchEvent(C16G0 c16g0, View view, MotionEvent motionEvent) throws Throwable {
        boolean zOnTouchEvent;
        AwS576S0100000_32 awS576S0100000_32;
        float rawX;
        int i;
        C16GX c16gx = (C16GX) view;
        if (c16gx instanceof C18Z4) {
            AwS159S0400000_32 awS159S0400000_32 = new AwS159S0400000_32(motionEvent, c16g0, c16gx, this, 4);
            if (this.LJ == -1) {
                float fAbs = Math.abs(motionEvent.getRawX() - this.LJI);
                float fAbs2 = Math.abs(motionEvent.getRawY() - this.LJII);
                float f = (fAbs * fAbs) + (fAbs2 * fAbs2);
                C18Z4 c18z4 = (C18Z4) c16gx;
                int scaledTouchSlop = ViewConfiguration.get(c18z4.getContext()).getScaledTouchSlop();
                if (f > scaledTouchSlop * scaledTouchSlop) {
                    if (fAbs2 > fAbs) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    this.LJ = i;
                }
                if (this.LJ == 0 && this.LIZLLL) {
                    c18z4.LLJJIJI.LJII.stopNestedScroll(0);
                }
            }
            if (!this.LIZLLL && this.LJ != 0) {
                C18Z4 c18z42 = (C18Z4) c16gx;
                boolean zLJIIIIZZ = c18z42.LJIIIIZZ();
                boolean z = this.LJFF;
                this.LJFF = zLJIIIIZZ;
                if (z != zLJIIIIZZ && zLJIIIIZZ) {
                    C18Z5 c18z5 = c18z42.LLJJIJI;
                    float rawY = 0.0f;
                    if (motionEvent != null) {
                        c18z5.getClass();
                        rawX = motionEvent.getRawX();
                    } else {
                        rawX = 0.0f;
                    }
                    c18z5.LIZLLL = rawX;
                    if (motionEvent != null) {
                        rawY = motionEvent.getRawY();
                    }
                    c18z5.LJ = rawY;
                    c18z5.LJI = -1;
                }
                if (this.LJFF) {
                    this.LIZLLL = c18z42.LJIIIZ(motionEvent, AnonymousClass0208.get$arr$(5));
                }
            }
            if (this.LIZLLL && this.LJ == 1) {
                zOnTouchEvent = ((C18Z4) c16gx).LJIIIZ(motionEvent, AnonymousClass0208.get$arr$(6));
            } else {
                zOnTouchEvent = ((Boolean) awS159S0400000_32.invoke()).booleanValue();
            }
        } else {
            zOnTouchEvent = super.onTouchEvent(c16g0, c16gx, motionEvent);
        }
        if (zOnTouchEvent && motionEvent.getAction() == 1 && (awS576S0100000_32 = this.LJIIIIZZ) != null) {
            awS576S0100000_32.invoke();
        }
        return zOnTouchEvent;
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
    public final void onStopNestedScroll(C16G0 c16g0, C16GX c16gx, View view, int i) {
        super.onStopNestedScroll(c16g0, c16gx, view, i);
        this.LIZIZ = false;
        this.LIZJ = false;
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, X.C16BC
    public final /* bridge */ /* synthetic */ void onStopNestedScroll(C16G0 c16g0, View view, View view2, int i) {
        onStopNestedScroll(c16g0, (C16GX) view, view2, i);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
    public final boolean onStartNestedScroll(C16G0 c16g0, C16GX c16gx, View view, View view2, int i, int i2) {
        LIZJ(c16gx);
        return super.onStartNestedScroll(c16g0, c16gx, view, view2, i, i2);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, X.C16BC
    public final /* bridge */ /* synthetic */ boolean onStartNestedScroll(C16G0 c16g0, View view, View view2, View view3, int i, int i2) {
        return onStartNestedScroll(c16g0, (C16GX) view, view2, view3, i, i2);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
    public final void onNestedPreScroll(C16G0 c16g0, C16GX c16gx, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == this.LIZ) {
            this.LIZIZ = true;
        }
        if (!this.LIZJ) {
            super.onNestedPreScroll(c16g0, c16gx, view, i, i2, iArr, i3);
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, X.C16BC
    public final /* bridge */ /* synthetic */ void onNestedPreScroll(C16G0 c16g0, View view, View view2, int i, int i2, int[] iArr, int i3) {
        onNestedPreScroll(c16g0, (C16GX) view, view2, i, i2, iArr, i3);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
    public final void onNestedScroll(C16G0 c16g0, C16GX c16gx, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (!this.LIZJ) {
            super.onNestedScroll(c16g0, c16gx, view, i, i2, i3, i4, i5, iArr);
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, X.C16BC
    public final /* bridge */ /* synthetic */ void onNestedScroll(C16G0 c16g0, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScroll(c16g0, (C16GX) view, view2, i, i2, i3, i4, i5, iArr);
    }
}
