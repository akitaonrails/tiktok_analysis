package com.ss.android.ugc.aweme.landpage.embedded.behavior;

import X.C098200Yq;
import X.C16BC;
import X.C16G0;
import X.C16G1;
import X.C189200o6;
import X.C786410Ut5;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Unit;

/* JADX INFO: loaded from: classes32.dex */
public final class EmbeddedLandingPageBehavior<T extends View> extends C16BC<T> {
    public final SwipeToScrollDownBehavior<T> LIZ = new SwipeToScrollDownBehavior<>();
    public final BottomSheetBehavior<T> LIZIZ = new BottomSheetBehavior<>();
    public C16BC<T> LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public int LJI;
    public int LJII;

    @Override // X.C16BC
    public final void onDetachedFromLayoutParams() {
        this.LIZ.onDetachedFromLayoutParams();
        this.LIZIZ.onDetachedFromLayoutParams();
    }

    @Override // X.C16BC
    public final void onAttachedToLayoutParams(C16G1 c16g1) {
        this.LIZ.onAttachedToLayoutParams(c16g1);
        this.LIZIZ.onAttachedToLayoutParams(c16g1);
    }

    @Override // X.C16BC
    public final Parcelable onSaveInstanceState(C16G0 c16g0, T t) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIJL(bundle, "swipe_saved_state", this.LIZ.onSaveInstanceState(c16g0, t));
        C786410Ut5.LJJIJL(bundle, "bottom_sheet_saved_state", this.LIZIZ.onSaveInstanceState(c16g0, t));
        return bundle;
    }

    @Override // X.C16BC
    public final boolean onInterceptTouchEvent(C16G0 c16g0, T t, MotionEvent motionEvent) {
        boolean zOnInterceptTouchEvent;
        if (!this.LIZLLL) {
            return super.onInterceptTouchEvent(c16g0, t, motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return super.onInterceptTouchEvent(c16g0, t, motionEvent);
                    }
                } else {
                    int iAbs = Math.abs(((int) motionEvent.getX()) - this.LJI);
                    int iAbs2 = Math.abs(((int) motionEvent.getY()) - this.LJII);
                    if (iAbs > iAbs2) {
                        if (this.LJFF && this.LIZ.onInterceptTouchEvent(c16g0, t, motionEvent)) {
                            this.LIZJ = this.LIZ;
                            return true;
                        }
                    } else if (iAbs2 > iAbs && this.LJ && this.LIZIZ.onInterceptTouchEvent(c16g0, t, motionEvent)) {
                        this.LIZJ = this.LIZIZ;
                        return true;
                    }
                    return super.onInterceptTouchEvent(c16g0, t, motionEvent);
                }
            }
            C16BC<T> c16bc = this.LIZJ;
            if (c16bc != null) {
                zOnInterceptTouchEvent = c16bc.onTouchEvent(c16g0, t, motionEvent);
            } else {
                zOnInterceptTouchEvent = super.onInterceptTouchEvent(c16g0, t, motionEvent);
            }
            this.LIZJ = null;
            return zOnInterceptTouchEvent;
        }
        this.LJI = (int) motionEvent.getX();
        this.LJII = (int) motionEvent.getY();
        boolean zOnInterceptTouchEvent2 = this.LIZ.onInterceptTouchEvent(c16g0, t, motionEvent);
        boolean zOnInterceptTouchEvent3 = this.LIZIZ.onInterceptTouchEvent(c16g0, t, motionEvent);
        if (zOnInterceptTouchEvent2 || zOnInterceptTouchEvent3) {
            return true;
        }
        return false;
    }

    @Override // X.C16BC
    public final boolean onLayoutChild(C16G0 c16g0, T t, int i) {
        C16BC<T> c16bc = this.LIZJ;
        if (c16bc != null) {
            return c16bc.onLayoutChild(c16g0, t, i);
        }
        int top = t.getTop();
        this.LIZ.onLayoutChild(c16g0, t, i);
        t.offsetTopAndBottom(top - t.getTop());
        this.LIZIZ.onLayoutChild(c16g0, t, i);
        return true;
    }

    @Override // X.C16BC
    public final void onRestoreInstanceState(C16G0 c16g0, T t, Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        Parcelable parcelable2 = bundle.getParcelable("swipe_saved_state");
        if (parcelable2 != null) {
            try {
                this.LIZ.onRestoreInstanceState(c16g0, t, parcelable2);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        Parcelable parcelable3 = bundle.getParcelable("bottom_sheet_saved_state");
        if (parcelable3 != null) {
            try {
                this.LIZIZ.onRestoreInstanceState(c16g0, t, parcelable3);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
        }
    }

    @Override // X.C16BC
    public final boolean onTouchEvent(C16G0 c16g0, T t, MotionEvent motionEvent) {
        boolean zOnTouchEvent;
        if (!this.LIZLLL) {
            return super.onTouchEvent(c16g0, t, motionEvent);
        }
        C16BC<T> c16bc = this.LIZJ;
        if (c16bc != null) {
            zOnTouchEvent = c16bc.onTouchEvent(c16g0, t, motionEvent);
        } else {
            zOnTouchEvent = super.onTouchEvent(c16g0, t, motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1 && actionMasked != 3) {
            return zOnTouchEvent;
        }
        this.LIZJ = null;
        return zOnTouchEvent;
    }

    @Override // X.C16BC
    public final void onStopNestedScroll(C16G0 c16g0, T t, View view, int i) {
        if (this.LJ && this.LIZLLL) {
            this.LIZIZ.onStopNestedScroll(c16g0, t, view, i);
        } else {
            super.onStopNestedScroll(c16g0, t, view, i);
        }
    }

    @Override // X.C16BC
    public final boolean onNestedPreFling(C16G0 c16g0, T t, View view, float f, float f2) {
        if (this.LJ && this.LIZLLL) {
            return this.LIZIZ.onNestedPreFling(c16g0, t, view, f, f2);
        }
        return super.onNestedPreFling(c16g0, t, view, f, f2);
    }

    @Override // X.C16BC
    public final boolean onStartNestedScroll(C16G0 c16g0, T t, View view, View view2, int i, int i2) {
        if (this.LJ && this.LIZLLL) {
            return this.LIZIZ.onStartNestedScroll(c16g0, t, view, view2, i, i2);
        }
        return super.onStartNestedScroll(c16g0, t, view, view2, i, i2);
    }

    @Override // X.C16BC
    public final void onNestedPreScroll(C16G0 c16g0, T t, View view, int i, int i2, int[] iArr, int i3) {
        if (this.LJ && this.LIZLLL) {
            this.LIZIZ.onNestedPreScroll(c16g0, t, view, i, i2, iArr, i3);
        } else {
            super.onNestedPreScroll(c16g0, t, view, i, i2, iArr, i3);
        }
    }

    @Override // X.C16BC
    public final void onNestedScroll(C16G0 c16g0, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.LJ && this.LIZLLL) {
            this.LIZIZ.onNestedScroll(c16g0, t, view, i, i2, i3, i4, i5, iArr);
        } else {
            super.onNestedScroll(c16g0, t, view, i, i2, i3, i4, i5, iArr);
        }
    }
}
