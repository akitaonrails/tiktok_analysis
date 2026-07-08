package com.lynx.xelement.scroll.coordinator;

import X.AbstractC1319380kRE;
import X.C1319360kRC;
import X.C16G0;
import X.C16GK;
import X.C16GX;
import X.InterfaceC20747116Gn;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes32.dex */
public class ScrollCoordinatorAppBarLayout$Behavior extends AppBarLayout$Behavior {
    public boolean LIZ;
    public boolean LIZIZ;
    public Field LIZJ;
    public Method LIZLLL;
    public Method LJ;
    public Method LJFF;
    public final /* synthetic */ C1319360kRC LJI;

    public final Field LIZ() throws NoSuchFieldException {
        Class<? super Object> superclass;
        Field field = this.LIZJ;
        if (field != null) {
            return field;
        }
        Class<? super Object> superclass2 = getClass().getSuperclass();
        if (superclass2 != null) {
            try {
                superclass = superclass2.getSuperclass();
            } catch (NoSuchFieldException e) {
                TryCatchGuardChecker.doCheck(e);
                Class<? super Object> superclass3 = superclass2.getSuperclass().getSuperclass();
                if (superclass3 != null) {
                    Field declaredField = superclass3.getDeclaredField("flingRunnable");
                    this.LIZJ = declaredField;
                    return declaredField;
                }
            }
        } else {
            superclass = null;
        }
        if (superclass != null) {
            Field declaredField2 = superclass.getDeclaredField("mFlingRunnable");
            this.LIZJ = declaredField2;
            return declaredField2;
        }
        return null;
    }

    public ScrollCoordinatorAppBarLayout$Behavior(C1319360kRC c1319360kRC) {
        this.LJI = c1319360kRC;
        setDragCallback(new C16GK() { // from class: X.16Gp
            @Override // X.C16GK
            public final boolean LIZ(C16GX c16gx) {
                return true;
            }
        });
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

    @Override // com.google.android.material.appbar.HeaderBehavior, X.C16BC
    public final boolean onInterceptTouchEvent(C16G0 c16g0, View view, MotionEvent motionEvent) {
        C16GX c16gx = (C16GX) view;
        this.LIZIZ = this.LIZ;
        if (motionEvent.getAction() == 0 && (!(c16gx instanceof C1319360kRC) || ((C1319360kRC) c16gx).LLJJIJIIJIL)) {
            LIZIZ(c16gx);
        }
        return super.onInterceptTouchEvent(c16g0, c16gx, motionEvent);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
    public final void onStopNestedScroll(C16G0 c16g0, C16GX c16gx, View view, int i) {
        super.onStopNestedScroll(c16g0, c16gx, view, i);
        this.LIZ = false;
        this.LIZIZ = false;
        InterfaceC20747116Gn interfaceC20747116Gn = this.LJI.LLJJIJI;
        if (interfaceC20747116Gn != null) {
            interfaceC20747116Gn.LJIJJLI();
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, X.C16BC
    public final /* bridge */ /* synthetic */ void onStopNestedScroll(C16G0 c16g0, View view, View view2, int i) {
        onStopNestedScroll(c16g0, (C16GX) view, view2, i);
    }

    @Override // X.C16BC
    public final boolean onNestedFling(C16G0 c16g0, View view, View view2, float f, float f2, boolean z) {
        InterfaceC20747116Gn interfaceC20747116Gn = this.LJI.LLJJIJI;
        if (interfaceC20747116Gn != null) {
            interfaceC20747116Gn.LIZJ();
        }
        return super.onNestedFling(c16g0, view, view2, f, f2, z);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
    public final boolean onStartNestedScroll(C16G0 c16g0, C16GX c16gx, View view, View view2, int i, int i2) {
        if (!(c16gx instanceof C1319360kRC) || ((C1319360kRC) c16gx).LLJJIJIIJIL) {
            LIZIZ(c16gx);
        }
        InterfaceC20747116Gn interfaceC20747116Gn = this.LJI.LLJJIJI;
        if (interfaceC20747116Gn != null) {
            interfaceC20747116Gn.LJIJJ();
        }
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
            if (!(c16gx instanceof AbstractC1319380kRE) || ((AbstractC1319380kRE) c16gx).LLJJIII) {
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
            try {
                if (!(c16gx instanceof AbstractC1319380kRE) || ((AbstractC1319380kRE) c16gx).LLJJIII) {
                    super.onNestedScroll(c16g0, c16gx, view2, i, i2, i3, i4, i5);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
    public final void onNestedScroll(C16G0 c16g0, C16GX c16gx, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (!this.LIZIZ) {
            try {
                if (i4 < 0) {
                    if (this.LIZLLL == null) {
                        Class<? super Object> superclass = getClass().getSuperclass().getSuperclass().getSuperclass();
                        Class<?> cls = Integer.TYPE;
                        Method declaredMethod = superclass.getDeclaredMethod("scroll", C16G0.class, View.class, cls, cls, cls);
                        this.LIZLLL = declaredMethod;
                        declaredMethod.setAccessible(true);
                    }
                    if (this.LJ == null) {
                        Method declaredMethod2 = c16gx.getClass().getSuperclass().getSuperclass().getDeclaredMethod("getDownNestedScrollRange", new Class[0]);
                        this.LJ = declaredMethod2;
                        declaredMethod2.setAccessible(true);
                    }
                    iArr[1] = ((Integer) this.LIZLLL.invoke(this, c16g0, c16gx, Integer.valueOf(i4), Integer.valueOf(-((Integer) this.LJ.invoke(c16gx, new Object[0])).intValue()), 0)).intValue();
                    return;
                }
                if (i4 == 0) {
                    if (this.LJFF == null) {
                        Method declaredMethod3 = getClass().getSuperclass().getSuperclass().getDeclaredMethod("updateAccessibilityActions", C16G0.class, C16GX.class);
                        this.LJFF = declaredMethod3;
                        declaredMethod3.setAccessible(true);
                    }
                    this.LJFF.invoke(this, c16g0, c16gx);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}
