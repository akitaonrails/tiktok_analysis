package com.bytedance.ies.xelement.viewpager;

import X.AbstractC1319370kRD;
import X.C16G0;
import X.C16GK;
import X.C16GX;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes32.dex */
public class CustomAppBarLayout$Behavior extends AppBarLayout$Behavior {
    public boolean LIZ;
    public boolean LIZIZ;
    public Method LIZJ;
    public Method LIZLLL;
    public Method LJ;

    public CustomAppBarLayout$Behavior() {
        setDragCallback(new C16GK() { // from class: X.16Gl
            @Override // X.C16GK
            public final boolean LIZ(C16GX c16gx) {
                if ((c16gx instanceof AbstractC1319370kRD) && !((AbstractC1319370kRD) c16gx).LLJJIII && this.LIZ.getTopAndBottomOffset() / c16gx.getTotalScrollRange() <= -1) {
                    return false;
                }
                return true;
            }
        });
    }

    public final Field LIZ() {
        Class<? super Object> superclass;
        Class<? super Object> superclass2 = getClass().getSuperclass();
        if (superclass2 != null) {
            try {
                superclass = superclass2.getSuperclass();
            } catch (NoSuchFieldException e) {
                TryCatchGuardChecker.doCheck(e);
                Class<? super Object> superclass3 = superclass2.getSuperclass().getSuperclass();
                if (superclass3 != null) {
                    return superclass3.getDeclaredField("flingRunnable");
                }
            }
        } else {
            superclass = null;
        }
        if (superclass != null) {
            return superclass.getDeclaredField("mFlingRunnable");
        }
        return null;
    }

    public final void LIZIZ(C16GX c16gx) {
        try {
            Field fieldLIZ = LIZ();
            if (fieldLIZ != null) {
                fieldLIZ.setAccessible(true);
                Runnable runnable = (Runnable) fieldLIZ.get(this);
                if (runnable != null) {
                    HandlerHook.viewRemoveCallbacks(c16gx, runnable);
                    fieldLIZ.set(this, null);
                }
            }
            Class<? super Object> superclass = getClass().getSuperclass();
            if (superclass != null) {
                superclass.getSuperclass();
            }
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (NoSuchFieldException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public CustomAppBarLayout$Behavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setDragCallback(new C16GK() { // from class: X.16Gl
            @Override // X.C16GK
            public final boolean LIZ(C16GX c16gx) {
                if ((c16gx instanceof AbstractC1319370kRD) && !((AbstractC1319370kRD) c16gx).LLJJIII && this.LIZ.getTopAndBottomOffset() / c16gx.getTotalScrollRange() <= -1) {
                    return false;
                }
                return true;
            }
        });
    }

    @Override // com.google.android.material.appbar.HeaderBehavior, X.C16BC
    public final boolean onInterceptTouchEvent(C16G0 c16g0, View view, MotionEvent motionEvent) {
        C16GX c16gx = (C16GX) view;
        this.LIZIZ = this.LIZ;
        if (motionEvent.getActionMasked() == 0) {
            LIZIZ(c16gx);
        }
        if (c16gx != null && (c16gx instanceof AbstractC1319370kRD) && !((AbstractC1319370kRD) c16gx).LLJJIJI) {
            return true;
        }
        return super.onInterceptTouchEvent(c16g0, c16gx, motionEvent);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
    public final void onStopNestedScroll(C16G0 c16g0, C16GX c16gx, View view, int i) {
        super.onStopNestedScroll(c16g0, c16gx, view, i);
        this.LIZ = false;
        this.LIZIZ = false;
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, X.C16BC
    public final /* bridge */ /* synthetic */ void onStopNestedScroll(C16G0 c16g0, View view, View view2, int i) {
        onStopNestedScroll(c16g0, (C16GX) view, view2, i);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
    public final boolean onStartNestedScroll(C16G0 c16g0, C16GX c16gx, View view, View view2, int i, int i2) {
        LIZIZ(c16gx);
        return super.onStartNestedScroll(c16g0, c16gx, view, view2, i, i2);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, X.C16BC
    public final /* bridge */ /* synthetic */ boolean onStartNestedScroll(C16G0 c16g0, View view, View view2, View view3, int i, int i2) {
        return onStartNestedScroll(c16g0, (C16GX) view, view2, view3, i, i2);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
    public final void onNestedPreScroll(C16G0 c16g0, C16GX c16gx, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            this.LIZ = true;
        }
        if (!this.LIZIZ) {
            if (c16gx == null || !(c16gx instanceof AbstractC1319370kRD) || ((AbstractC1319370kRD) c16gx).LLJJIJI) {
                super.onNestedPreScroll(c16g0, c16gx, view, i, i2, iArr, i3);
            }
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, X.C16BC
    public final /* bridge */ /* synthetic */ void onNestedPreScroll(C16G0 c16g0, View view, View view2, int i, int i2, int[] iArr, int i3) {
        onNestedPreScroll(c16g0, (C16GX) view, view2, i, i2, iArr, i3);
    }

    @Override // X.C16BC
    public final void onNestedScroll(C16G0 c16g0, View view, View view2, int i, int i2, int i3, int i4, int i5) {
        C16GX c16gx = (C16GX) view;
        if (!this.LIZIZ) {
            if (c16gx != null) {
                try {
                    if ((c16gx instanceof AbstractC1319370kRD) && !((AbstractC1319370kRD) c16gx).LLJJIJI) {
                        return;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return;
                }
            }
            super.onNestedScroll(c16g0, c16gx, view2, i, i2, i3, i4, i5);
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
    public final void onNestedScroll(C16G0 c16g0, C16GX c16gx, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (!this.LIZIZ) {
            try {
                if (i4 < 0) {
                    if (this.LIZJ == null) {
                        Class<? super Object> superclass = getClass().getSuperclass().getSuperclass().getSuperclass();
                        Class<?> cls = Integer.TYPE;
                        Method declaredMethod = superclass.getDeclaredMethod("scroll", C16G0.class, View.class, cls, cls, cls);
                        this.LIZJ = declaredMethod;
                        declaredMethod.setAccessible(true);
                    }
                    if (this.LIZLLL == null) {
                        Method declaredMethod2 = c16gx.getClass().getSuperclass().getSuperclass().getDeclaredMethod("getDownNestedScrollRange", new Class[0]);
                        this.LIZLLL = declaredMethod2;
                        declaredMethod2.setAccessible(true);
                    }
                    iArr[1] = ((Integer) this.LIZJ.invoke(this, c16g0, c16gx, Integer.valueOf(i4), Integer.valueOf(-((Integer) this.LIZLLL.invoke(c16gx, new Object[0])).intValue()), 0)).intValue();
                    return;
                }
                if (i4 == 0) {
                    if (this.LJ == null) {
                        Method declaredMethod3 = getClass().getSuperclass().getSuperclass().getDeclaredMethod("updateAccessibilityActions", C16G0.class, C16GX.class);
                        this.LJ = declaredMethod3;
                        declaredMethod3.setAccessible(true);
                    }
                    this.LJ.invoke(this, c16g0, c16gx);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}
