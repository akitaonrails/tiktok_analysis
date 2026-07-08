package com.ss.android.ugc.aweme.tablet.impl.business.split.split;

import X.C1389340mG4;
import X.C14K9;
import X.C20094213jo;
import X.C21586019dq;
import X.C21586419du;
import X.C21586519dv;
import X.C21586619dw;
import X.C21587019e0;
import X.C21587119e1;
import X.C21599719g3;
import X.C21600219g8;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C800330VaR;
import X.InterfaceC1294060jmO;
import X.InterfaceC21586919dz;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tablet.impl.business.split.split.DrawerLayout;
import java.util.ArrayList;
import java.util.List;
import u4.q0;

/* JADX INFO: loaded from: classes34.dex */
public final class DrawerLayout extends ViewGroup {
    public static final int[] LLJLIL = {R.attr.colorPrimaryDark};
    public static final int[] LLJLILLLLZIIL = {R.attr.layout_gravity};
    public float LL;
    public final int LLILLJJLI;
    public int LLILLL;
    public float LLILZ;
    public final Paint LLILZIL;
    public final C21586019dq LLILZLL;
    public final C21586019dq LLIZ;
    public final C21586519dv LLIZLLLIL;
    public final C21586519dv LLJ;
    public int LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public boolean LLJJIII;
    public InterfaceC21586919dz LLJJIJI;
    public List<InterfaceC21586919dz> LLJJIJIIJIL;
    public float LLJJIJIL;
    public float LLJJJ;
    public Drawable LLJJJIL;
    public Object LLJJJJ;
    public boolean LLJJJJJIL;
    public final ArrayList<View> LLJJJJLIIL;
    public Rect LLJJL;
    public Matrix LLJJLIIIJLLLLLLLZ;
    public final C21586419du LLJL;

    public static /* synthetic */ void getMLockModeEnd$annotations() {
    }

    public static /* synthetic */ void getMLockModeLeft$annotations() {
    }

    public static /* synthetic */ void getMLockModeRight$annotations() {
    }

    public static /* synthetic */ void getMLockModeStart$annotations() {
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
    }

    public final boolean LJIIJ() {
        C21586419du c21586419du = this.LLJL;
        if (c21586419du != null) {
            return c21586419du.LIZ.LJIIJJI(8388613);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C21586619dw();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.LLJIJIL) {
            return;
        }
        super.requestLayout();
    }

    public final View LJFF() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((C21586619dw) childAt.getLayoutParams()).LIZLLL & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public final View LJI() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (LJIILIIL(childAt)) {
                if (!LJIILIIL(childAt)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("View ");
                    sbLIZ.append(childAt);
                    sbLIZ.append(" is not a drawer");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    strLIZIZ.toString();
                    throw new IllegalArgumentException(strLIZIZ);
                }
                if (((C21586619dw) childAt.getLayoutParams()).LIZIZ > 0.0f) {
                    return childAt;
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            fMax = Math.max(fMax, ((C21586619dw) getChildAt(i).getLayoutParams()).LIZIZ);
        }
        this.LLILZ = fMax;
        boolean zLJIIIIZZ = this.LLILZLL.LJIIIIZZ();
        boolean zLJIIIIZZ2 = this.LLIZ.LJIIIIZZ();
        if (zLJIIIIZZ || zLJIIIIZZ2) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLJILJIL = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJILJIL = true;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C21586619dw c21586619dw = (C21586619dw) getChildAt(i).getLayoutParams();
            int i2 = c21586619dw.LIZLLL;
            if (i2 != 1) {
                boolean z = i2 == 2;
                if (0 == 0 && !z) {
                }
            }
            savedState.openDrawerGravity = c21586619dw.LIZ;
            break;
        }
        savedState.lockModeLeft = this.LLJILJILJ;
        savedState.lockModeRight = this.LLJILLL;
        savedState.lockModeStart = this.LLJJ;
        savedState.lockModeEnd = this.LLJJI;
        return savedState;
    }

    public final float getDrawerElevation() {
        return this.LL;
    }

    public final Drawable getStatusBarBackgroundDrawable() {
        return this.LLJJJIL;
    }

    public static final class SavedState extends AbsSavedState {
        public int lockModeEnd;
        public int lockModeLeft;
        public int lockModeRight;
        public int lockModeStart;
        public int openDrawerGravity;
        public static final C21587119e1 Companion = new Object() { // from class: X.19e1
        };
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: X.19dy
            public static DrawerLayout.SavedState[] LIZ(int i) {
                return LIZ(i);
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new DrawerLayout.SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return LIZ(i);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final DrawerLayout.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new DrawerLayout.SavedState(parcel, classLoader);
            }
        };

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.openDrawerGravity = parcel.readInt();
            this.lockModeLeft = parcel.readInt();
            this.lockModeRight = parcel.readInt();
            this.lockModeStart = parcel.readInt();
            this.lockModeEnd = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.openDrawerGravity);
            parcel.writeInt(this.lockModeLeft);
            parcel.writeInt(this.lockModeRight);
            parcel.writeInt(this.lockModeStart);
            parcel.writeInt(this.lockModeEnd);
        }
    }

    public static boolean LJIIIZ(View view) {
        if (((C21586619dw) view.getLayoutParams()).LIZ == 0) {
            return true;
        }
        return false;
    }

    public static boolean LJIIL(View view) {
        if (LJIILIIL(view)) {
            if ((((C21586619dw) view.getLayoutParams()).LIZLLL & 1) == 1) {
                return true;
            }
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("View ");
        sbLIZ.append(view);
        sbLIZ.append(" is not a drawer");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public static boolean LJIILIIL(View view) {
        int absoluteGravity = Gravity.getAbsoluteGravity(((C21586619dw) view.getLayoutParams()).LIZ, view.getLayoutDirection());
        if ((absoluteGravity & 3) != 0 || (absoluteGravity & 5) != 0) {
            return true;
        }
        return false;
    }

    public final void LIZLLL(boolean z) {
        boolean zLJIJJLI;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C21586619dw c21586619dw = (C21586619dw) childAt.getLayoutParams();
            if (LJIILIIL(childAt) && (!z || c21586619dw.LIZJ)) {
                int width = childAt.getWidth();
                if (LIZ(childAt, 3)) {
                    zLJIJJLI = this.LLILZLL.LJIJJLI(-width, childAt.getTop(), childAt);
                } else {
                    zLJIJJLI = this.LLIZ.LJIJJLI(getWidth(), childAt.getTop(), childAt);
                }
                z2 |= zLJIJJLI;
                c21586619dw.LIZJ = false;
            }
        }
        C21586519dv c21586519dv = this.LLIZLLLIL;
        HandlerHook.viewRemoveCallbacks(c21586519dv.LIZLLL, c21586519dv.LIZJ);
        C21586519dv c21586519dv2 = this.LLJ;
        HandlerHook.viewRemoveCallbacks(c21586519dv2.LIZLLL, c21586519dv2.LIZJ);
        if (z2) {
            invalidate();
        }
    }

    public final View LJ(int i) {
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((LJIIIIZZ(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    public final int LJII(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        if (LJIILIIL(view)) {
            int i5 = ((C21586619dw) view.getLayoutParams()).LIZ;
            int layoutDirection = getLayoutDirection();
            if (i5 != 3) {
                if (i5 != 5) {
                    if (i5 != 8388611) {
                        if (i5 == 8388613) {
                            i = this.LLJJI;
                            if (i == 3) {
                                if (layoutDirection == 0) {
                                    i = this.LLJILLL;
                                } else {
                                    i = this.LLJILJILJ;
                                }
                                if (i == 3) {
                                    return 0;
                                }
                            }
                        } else {
                            return 0;
                        }
                    } else {
                        i = this.LLJJ;
                        if (i == 3) {
                            if (layoutDirection == 0) {
                                i4 = this.LLJILJILJ;
                            } else {
                                i4 = this.LLJILLL;
                            }
                            if (i4 != 3) {
                                return i4;
                            }
                            return 0;
                        }
                    }
                } else {
                    i = this.LLJILLL;
                    if (i == 3) {
                        if (layoutDirection == 0) {
                            i3 = this.LLJJI;
                        } else {
                            i3 = this.LLJJ;
                        }
                        if (i3 != 3) {
                            return i3;
                        }
                        return 0;
                    }
                }
            } else {
                i = this.LLJILJILJ;
                if (i == 3) {
                    if (layoutDirection == 0) {
                        i2 = this.LLJJ;
                    } else {
                        i2 = this.LLJJI;
                    }
                    if (i2 != 3) {
                        return i2;
                    }
                    return 0;
                }
            }
            return i;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("View ");
        sbLIZ.append(view);
        sbLIZ.append(" is not a drawer");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public final int LJIIIIZZ(View view) {
        return Gravity.getAbsoluteGravity(((C21586619dw) view.getLayoutParams()).LIZ, getLayoutDirection());
    }

    public final boolean LJIIJJI(int i) {
        View viewLJ = LJ(i);
        if (viewLJ != null) {
            return LJIIL(viewLJ);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof C21586619dw) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() != 10 && this.LLILZ > 0.0f) {
            int childCount = getChildCount();
            if (childCount != 0) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                for (int i = childCount - 1; -1 < i; i--) {
                    View childAt = getChildAt(i);
                    if (this.LLJJL == null) {
                        this.LLJJL = new Rect();
                    }
                    childAt.getHitRect(this.LLJJL);
                    if (this.LLJJL.contains((int) x, (int) y) && !LJIIIZ(childAt)) {
                        if (!childAt.getMatrix().isIdentity()) {
                            float scrollX = getScrollX() - childAt.getLeft();
                            float scrollY = getScrollY() - childAt.getTop();
                            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                            motionEventObtain.offsetLocation(scrollX, scrollY);
                            Matrix matrix = childAt.getMatrix();
                            if (!matrix.isIdentity()) {
                                if (this.LLJJLIIIJLLLLLLLZ == null) {
                                    this.LLJJLIIIJLLLLLLLZ = new Matrix();
                                }
                                matrix.invert(this.LLJJLIIIJLLLLLLLZ);
                                motionEventObtain.transform(this.LLJJLIIIJLLLLLLLZ);
                            }
                            zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEventObtain);
                            motionEventObtain.recycle();
                        } else {
                            float scrollX2 = getScrollX() - childAt.getLeft();
                            float scrollY2 = getScrollY() - childAt.getTop();
                            motionEvent.offsetLocation(scrollX2, scrollY2);
                            zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                            motionEvent.offsetLocation(-scrollX2, -scrollY2);
                        }
                        if (zDispatchGenericMotionEvent) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        int i;
        boolean z;
        C21600219g8 c21600219g8;
        boolean z2;
        boolean z3;
        C21586419du c21586419du = this.LLJL;
        if (c21586419du != null && motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getActionMasked())) != null) {
            if (numValueOf.intValue() == 0) {
                c21586419du.LIZLLL = motionEvent.getX();
                c21586419du.LJ = motionEvent.getY();
                c21586419du.LJI = false;
                c21586419du.LJII = 0;
                if (c21586419du.LIZJ(motionEvent, ((Number) c21586419du.LJIIIZ.getValue()).intValue()) != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                c21586419du.LJIIIIZZ = z3;
                if (!z3) {
                    c21586419du.LIZ.getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (numValueOf.intValue() == 2 && !c21586419du.LJIIIIZZ) {
                float x = motionEvent.getX() - c21586419du.LIZLLL;
                float y = motionEvent.getY() - c21586419du.LJ;
                if (C21586419du.LIZ(c21586419du, x, y)) {
                    if (c21586419du.LJII == 0) {
                        if (c21586419du.LJI) {
                            i = 1;
                        } else {
                            i = 2;
                        }
                        c21586419du.LJII = i;
                        if (i == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        float fAbs = Math.abs(x);
                        float fAbs2 = Math.abs(y) * 2;
                        if (c21586419du.LIZ.LJIIJJI(8388613)) {
                            View viewLIZJ = c21586419du.LIZJ(motionEvent, ((Number) c21586419du.LJIIJ.getValue()).intValue());
                            if ((viewLIZJ instanceof C21599719g3) && (c21600219g8 = (C21600219g8) viewLIZJ) != null) {
                                if (c21586419du.LIZ.getLayoutDirection() == 1) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (!z2 ? !c21600219g8.canScrollHorizontally(1) : !c21600219g8.canScrollHorizontally(-1)) {
                                    if (!c21586419du.LIZLLL(x)) {
                                        c21586419du.LIZ.getParent().requestDisallowInterceptTouchEvent(true);
                                        return false;
                                    }
                                }
                                if (c21586419du.LIZ.getLayoutDirection() != 1 ? !c21600219g8.canScrollHorizontally(-1) : !c21600219g8.canScrollHorizontally(1)) {
                                    if (c21586419du.LIZLLL(x)) {
                                        c21586419du.LIZ.getParent().requestDisallowInterceptTouchEvent(z);
                                        return false;
                                    }
                                }
                                c21586419du.LIZ.getParent().requestDisallowInterceptTouchEvent(z);
                            } else {
                                if (fAbs2 <= fAbs) {
                                    if (!c21586419du.LIZLLL(x)) {
                                        c21586419du.LIZ.getParent().requestDisallowInterceptTouchEvent(true);
                                        return false;
                                    }
                                    c21586419du.LIZ.getParent().requestDisallowInterceptTouchEvent(z);
                                    return false;
                                }
                                c21586419du.LIZ.getParent().requestDisallowInterceptTouchEvent(z);
                                return false;
                            }
                        } else {
                            c21586419du.LIZ.getParent().requestDisallowInterceptTouchEvent(z);
                            return false;
                        }
                    }
                } else {
                    c21586419du.LIZ.getParent().requestDisallowInterceptTouchEvent(true);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C21586619dw) {
            return new C21586619dw((C21586619dw) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C21586619dw((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C21586619dw(layoutParams);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Object obj;
        int systemWindowInsetTop;
        super.onDraw(canvas);
        if (this.LLJJJJJIL && this.LLJJJIL != null && (obj = this.LLJJJJ) != null && (systemWindowInsetTop = ((WindowInsets) obj).getSystemWindowInsetTop()) > 0) {
            this.LLJJJIL.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.LLJJJIL.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0131, code lost:
    
        if (r1.LIZLLL(r3) != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tablet.impl.business.split.split.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View viewLJ;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mSuperState);
        int i = savedState.openDrawerGravity;
        if (i != 0 && (viewLJ = LJ(i)) != null) {
            LJIILL(viewLJ, true);
        }
        int i2 = savedState.lockModeLeft;
        if (i2 != 3) {
            LJIILLIIL(i2, 3);
        }
        int i3 = savedState.lockModeRight;
        if (i3 != 3) {
            LJIILLIIL(i3, 5);
        }
        int i4 = savedState.lockModeStart;
        if (i4 != 3) {
            LJIILLIIL(i4, 8388611);
        }
        int i5 = savedState.lockModeEnd;
        if (i5 != 3) {
            LJIILLIIL(i5, 8388613);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            X.19dq r0 = r7.LLILZLL
            r0.LJIILIIL(r8)
            X.19dq r0 = r7.LLIZ
            r0.LJIILIIL(r8)
            int r0 = r8.getAction()
            r1 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            r2 = 1
            if (r1 == 0) goto L5c
            if (r1 == r2) goto L1f
            r0 = 3
            if (r1 != r0) goto L1e
            r7.LIZLLL(r2)
            r7.LLJJIII = r3
        L1e:
            return r2
        L1f:
            float r6 = r8.getX()
            float r5 = r8.getY()
            X.19dq r4 = r7.LLILZLL
            int r1 = (int) r6
            int r0 = (int) r5
            android.view.View r0 = r4.LJIIJJI(r1, r0)
            if (r0 == 0) goto L57
            boolean r0 = LJIIIZ(r0)
            if (r0 == 0) goto L57
            float r0 = r7.LLJJIJIL
            float r6 = r6 - r0
            float r0 = r7.LLJJJ
            float r5 = r5 - r0
            X.19dq r0 = r7.LLILZLL
            int r0 = r0.LIZIZ
            float r6 = r6 * r6
            float r5 = r5 * r5
            float r6 = r6 + r5
            int r0 = r0 * r0
            float r0 = (float) r0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto L57
            android.view.View r0 = r7.LJFF()
            if (r0 == 0) goto L57
            int r1 = r7.LJII(r0)
            r0 = 2
            if (r1 != r0) goto L58
        L57:
            r3 = 1
        L58:
            r7.LIZLLL(r3)
            return r2
        L5c:
            float r1 = r8.getX()
            float r0 = r8.getY()
            r7.LLJJIJIL = r1
            r7.LLJJJ = r0
            r7.LLJJIII = r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tablet.impl.business.split.split.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        C21586419du c21586419du = this.LLJL;
        if (c21586419du != null) {
            c21586419du.LJI = z;
        }
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            LIZLLL(true);
        }
    }

    public final void setDrawerElevation(float f) {
        this.LL = f;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (LJIILIIL(childAt)) {
                C14K9.LJIJ(childAt, this.LL);
            }
        }
    }

    @InterfaceC1294060jmO
    public final void setDrawerListener(InterfaceC21586919dz interfaceC21586919dz) {
        List<InterfaceC21586919dz> list;
        InterfaceC21586919dz interfaceC21586919dz2 = this.LLJJIJI;
        if (interfaceC21586919dz2 != null && (list = this.LLJJIJIIJIL) != null) {
            ((ArrayList) list).remove(interfaceC21586919dz2);
        }
        if (interfaceC21586919dz != null) {
            if (this.LLJJIJIIJIL == null) {
                this.LLJJIJIIJIL = new ArrayList();
            }
            ((ArrayList) this.LLJJIJIIJIL).add(interfaceC21586919dz);
        }
        this.LLJJIJI = interfaceC21586919dz;
    }

    public final void setDrawerLockMode(int i) {
        LJIILLIIL(i, 3);
        LJIILLIIL(i, 5);
    }

    public final void setScrimColor(int i) {
        this.LLILLL = i;
        invalidate();
    }

    public final void setSplitDragType(int i) {
        C21586019dq c21586019dq;
        C21586419du c21586419du = this.LLJL;
        if (c21586419du != null && c21586419du.LJFF != i) {
            c21586419du.LJFF = i;
            if (i != 0) {
                if (i != 1 && i != 2) {
                    return;
                }
                c21586419du.LIZ.LJIILLIIL(3, 8388613);
                int i2 = c21586419du.LJFF;
                if (i2 == 0 || (c21586019dq = c21586419du.LIZIZ) == null) {
                    return;
                }
                int i3 = c21586019dq.LJIILL;
                if (i2 == 1) {
                    i3 = C1389340mG4.LIZJ(null, null).LIZIZ;
                }
                C21586019dq c21586019dq2 = c21586419du.LIZIZ;
                if (i3 == c21586019dq2.LJIILJJIL) {
                    return;
                }
                c21586019dq2.LJIILJJIL = i3;
                return;
            }
            c21586419du.LIZ.LJIILLIIL(1, 8388613);
        }
    }

    public final void setStatusBarBackground(int i) {
        Drawable drawableLIZIZ;
        if (i != 0) {
            drawableLIZIZ = C800330VaR.LIZIZ(getContext(), i);
        } else {
            drawableLIZIZ = null;
        }
        this.LLJJJIL = drawableLIZIZ;
        invalidate();
    }

    public final void setStatusBarBackgroundColor(int i) {
        this.LLJJJIL = new ColorDrawable(i);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C21586619dw(getContext(), attributeSet);
    }

    public final void setStatusBarBackground(Drawable drawable) {
        this.LLJJJIL = drawable;
        invalidate();
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        new C20094213jo() { // from class: X.13kB
            @Override // X.C20094213jo
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                if (view.getImportantForAccessibility() != 4 && view.getImportantForAccessibility() != 2) {
                    return;
                }
                accessibilityNodeInfoCompat.setParent(null);
            }
        };
        this.LLILLL = -1728053248;
        this.LLILZIL = new Paint();
        this.LLJILJIL = true;
        this.LLJILJILJ = 3;
        this.LLJILLL = 3;
        this.LLJJ = 3;
        this.LLJJI = 3;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.LLILLJJLI = (int) ((64 * f) + 0.5f);
        float f2 = 400 * f;
        C21586519dv c21586519dv = new C21586519dv(this, 3);
        this.LLIZLLLIL = c21586519dv;
        C21586519dv c21586519dv2 = new C21586519dv(this, 5);
        this.LLJ = c21586519dv2;
        C21586019dq c21586019dqLJIIJ = C21586019dq.LJIIJ(this, c21586519dv);
        this.LLILZLL = c21586019dqLJIIJ;
        c21586019dqLJIIJ.LJIILLIIL = 1;
        c21586019dqLJIIJ.LJIILIIL = f2;
        c21586519dv.LIZIZ = c21586019dqLJIIJ;
        C21586019dq c21586019dqLJIIJ2 = C21586019dq.LJIIJ(this, c21586519dv2);
        this.LLIZ = c21586019dqLJIIJ2;
        c21586019dqLJIIJ2.LJIILLIIL = 2;
        c21586019dqLJIIJ2.LJIILIIL = f2;
        c21586519dv2.LIZIZ = c21586019dqLJIIJ2;
        setFocusableInTouchMode(true);
        setImportantForAccessibility(1);
        q0.LJIJ(this, new C20094213jo() { // from class: X.13jt
            {
                new Rect();
            }

            @Override // X.C20094213jo
            public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                if (accessibilityEvent.getEventType() == 32) {
                    accessibilityEvent.getText();
                    View viewLJI = this.LIZ.LJI();
                    if (viewLJI != null) {
                        int iLJIIIIZZ = this.LIZ.LJIIIIZZ(viewLJI);
                        DrawerLayout drawerLayout = this.LIZ;
                        drawerLayout.getClass();
                        Gravity.getAbsoluteGravity(iLJIIIIZZ, drawerLayout.getLayoutDirection());
                        return true;
                    }
                    return true;
                }
                return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }

            @Override // X.C20094213jo
            public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                accessibilityEvent.setClassName("com.ss.android.ugc.aweme.tablet.impl.business.split.split.DrawerLayout");
            }

            @Override // X.C20094213jo
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setClassName("com.ss.android.ugc.aweme.tablet.impl.business.split.split.DrawerLayout");
                accessibilityNodeInfoCompat.setFocusable(false);
                accessibilityNodeInfoCompat.setFocused(false);
                accessibilityNodeInfoCompat.removeAction(C20092413jW.LJ);
                accessibilityNodeInfoCompat.removeAction(C20092413jW.LJFF);
            }

            @Override // X.C20094213jo
            public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
        });
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: X.19dx
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    boolean z;
                    DrawerLayout drawerLayout = (DrawerLayout) view;
                    boolean z2 = true;
                    if (windowInsets.getSystemWindowInsetTop() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    drawerLayout.LLJJJJ = windowInsets;
                    drawerLayout.LLJJJJJIL = z;
                    if (z || drawerLayout.getBackground() != null) {
                        z2 = false;
                    }
                    drawerLayout.setWillNotDraw(z2);
                    drawerLayout.requestLayout();
                    return windowInsets.consumeSystemWindowInsets();
                }
            });
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(LLJLIL);
            try {
                this.LLJJJIL = typedArrayObtainStyledAttributes.getDrawable(0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.LL = 10 * f;
        this.LLJJJJLIIL = new ArrayList<>();
        this.LLJL = new C21586419du(this, c21586019dqLJIIJ2);
    }

    public final boolean LIZ(View view, int i) {
        if ((LJIIIIZZ(view) & i) == i) {
            return true;
        }
        return false;
    }

    public final void LIZIZ(int i, boolean z) {
        View viewLJ = LJ(i);
        if (viewLJ != null) {
            LIZJ(viewLJ, z);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No drawer view found with gravity ");
        sbLIZ.append(C21587019e0.LIZ(i));
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZJ(View view, boolean z) {
        if (LJIILIIL(view)) {
            C21586619dw c21586619dw = (C21586619dw) view.getLayoutParams();
            if (this.LLJILJIL) {
                c21586619dw.LIZIZ = 0.0f;
                c21586619dw.LIZLLL = 0;
            } else if (z) {
                c21586619dw.LIZLLL |= 4;
                if (LIZ(view, 3)) {
                    this.LLILZLL.LJIJJLI(-view.getWidth(), view.getTop(), view);
                } else {
                    this.LLIZ.LJIJJLI(getWidth(), view.getTop(), view);
                }
            } else {
                LJIILJJIL(view, 0.0f);
                LJIJI(0, view);
                C786410Ut5.LJLLLLLL(4, view);
            }
            invalidate();
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("View ");
        sbLIZ.append(view);
        sbLIZ.append(" is not a sliding drawer");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public final void LJIILJJIL(View view, float f) {
        float f2 = ((C21586619dw) view.getLayoutParams()).LIZIZ;
        float width = view.getWidth();
        int i = ((int) (width * f)) - ((int) (f2 * width));
        if (!LIZ(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        LJIIZILJ(view, f);
    }

    public final void LJIILL(View view, boolean z) {
        if (LJIILIIL(view)) {
            C21586619dw c21586619dw = (C21586619dw) view.getLayoutParams();
            if (this.LLJILJIL) {
                c21586619dw.LIZIZ = 1.0f;
                c21586619dw.LIZLLL = 1;
                LJIJ(view, true);
            } else if (z) {
                c21586619dw.LIZLLL |= 2;
                if (LIZ(view, 3)) {
                    this.LLILZLL.LJIJJLI(0, view.getTop(), view);
                } else {
                    this.LLIZ.LJIJJLI(getWidth() - view.getWidth(), view.getTop(), view);
                }
            } else {
                LJIILJJIL(view, 1.0f);
                LJIJI(0, view);
                C786410Ut5.LJLLLLLL(0, view);
            }
            invalidate();
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("View ");
        sbLIZ.append(view);
        sbLIZ.append(" is not a sliding drawer");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public final void LJIILLIIL(int i, int i2) {
        C21586019dq c21586019dq;
        View viewLJ;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        if (i2 != 3) {
            if (i2 != 5) {
                if (i2 != 8388611) {
                    if (i2 == 8388613) {
                        this.LLJJI = i;
                    }
                } else {
                    this.LLJJ = i;
                }
            } else {
                this.LLJILLL = i;
            }
        } else {
            this.LLJILJILJ = i;
        }
        if (i != 0) {
            if (absoluteGravity == 3) {
                c21586019dq = this.LLILZLL;
            } else {
                c21586019dq = this.LLIZ;
            }
            c21586019dq.LIZIZ();
            if (i != 1) {
                if (i == 2 && (viewLJ = LJ(absoluteGravity)) != null) {
                    LJIILL(viewLJ, true);
                    return;
                }
                return;
            }
            View viewLJ2 = LJ(absoluteGravity);
            if (viewLJ2 == null) {
                return;
            }
            LIZJ(viewLJ2, true);
        }
    }

    public final void LJIIZILJ(View view, float f) {
        C21586619dw c21586619dw = (C21586619dw) view.getLayoutParams();
        if (f == c21586619dw.LIZIZ) {
            return;
        }
        c21586619dw.LIZIZ = f;
        List<InterfaceC21586919dz> list = this.LLJJIJIIJIL;
        if (list != null) {
            for (int size = ((ArrayList) list).size() - 1; -1 < size; size--) {
                ((InterfaceC21586919dz) ListProtector.get(this.LLJJIJIIJIL, size)).LIZ(f);
            }
        }
    }

    public final void LJIJ(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (z ? childAt != view : LJIILIIL(childAt)) {
                childAt.setImportantForAccessibility(4);
            } else {
                childAt.setImportantForAccessibility(1);
            }
        }
    }

    public final void LJIJI(int i, View view) {
        int i2;
        boolean z;
        View rootView;
        int i3 = this.LLILZLL.LIZ;
        int i4 = this.LLIZ.LIZ;
        if (i3 != 1 && i4 != 1) {
            i2 = 2;
            if (i3 != 2 && i4 != 2) {
                i2 = 0;
            }
        } else {
            i2 = 1;
        }
        if (view != null && i == 0) {
            float f = ((C21586619dw) view.getLayoutParams()).LIZIZ;
            if (f == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C21586619dw c21586619dw = (C21586619dw) view.getLayoutParams();
                if ((c21586619dw.LIZLLL & 1) == 1) {
                    c21586619dw.LIZLLL = 0;
                    List<InterfaceC21586919dz> list = this.LLJJIJIIJIL;
                    if (list != null) {
                        for (int size = ((ArrayList) list).size() - 1; -1 < size; size--) {
                            ((InterfaceC21586919dz) ListProtector.get(this.LLJJIJIIJIL, size)).LLLLLZ();
                        }
                    }
                    LJIJ(view, false);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f == 1.0f) {
                C21586619dw c21586619dw2 = (C21586619dw) view.getLayoutParams();
                if ((c21586619dw2.LIZLLL & 1) == 0) {
                    c21586619dw2.LIZLLL = 1;
                    List<InterfaceC21586919dz> list2 = this.LLJJIJIIJIL;
                    if (list2 != null) {
                        for (int size2 = ((ArrayList) list2).size() - 1; -1 < size2; size2--) {
                            ((InterfaceC21586919dz) ListProtector.get(this.LLJJIJIIJIL, size2)).S0();
                        }
                    }
                    LJIJ(view, true);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i2 != this.LLJI) {
            this.LLJI = i2;
            List<InterfaceC21586919dz> list3 = this.LLJJIJIIJIL;
            if (list3 != null) {
                for (int size3 = ((ArrayList) list3).size() - 1; -1 < size3; size3--) {
                    ((InterfaceC21586919dz) ListProtector.get(this.LLJJIJIIJIL, size3)).LIZIZ();
                }
            }
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && LJI() != null) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            View viewLJI = LJI();
            if (viewLJI == null) {
                return false;
            }
            if (LJII(viewLJI) == 0) {
                LIZLLL(false);
            }
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (isInEditMode()) {
                if (mode == 0) {
                    size = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
                }
                if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                    size2 = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        if (this.LLJJJJ != null && getFitsSystemWindows()) {
            z = true;
        } else {
            z = false;
        }
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C21586619dw c21586619dw = (C21586619dw) childAt.getLayoutParams();
                if (z) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(c21586619dw.LIZ, layoutDirection);
                    if (childAt.getFitsSystemWindows()) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.LLJJJJ;
                        if (absoluteGravity != 3) {
                            if (absoluteGravity == 5) {
                                windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                            }
                        } else {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) this.LLJJJJ;
                        if (absoluteGravity != 3) {
                            if (absoluteGravity == 5) {
                                windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                            }
                        } else {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) c21586619dw).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) c21586619dw).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) c21586619dw).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) c21586619dw).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (LJIIIZ(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) c21586619dw).leftMargin) - ((ViewGroup.MarginLayoutParams) c21586619dw).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) c21586619dw).topMargin) - ((ViewGroup.MarginLayoutParams) c21586619dw).bottomMargin, 1073741824));
                } else if (LJIILIIL(childAt)) {
                    float fLJIIIIZZ = C14K9.LJIIIIZZ(childAt);
                    float f = this.LL;
                    if (fLJIIIIZZ != f) {
                        C14K9.LJIJ(childAt, f);
                    }
                    int iLJIIIIZZ = LJIIIIZZ(childAt) & 7;
                    if (iLJIIIIZZ == 3) {
                        if (!z2) {
                            z2 = true;
                            childAt.measure(ViewGroup.getChildMeasureSpec(i, this.LLILLJJLI + ((ViewGroup.MarginLayoutParams) c21586619dw).leftMargin + ((ViewGroup.MarginLayoutParams) c21586619dw).rightMargin, ((ViewGroup.MarginLayoutParams) c21586619dw).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) c21586619dw).topMargin + ((ViewGroup.MarginLayoutParams) c21586619dw).bottomMargin, ((ViewGroup.MarginLayoutParams) c21586619dw).height));
                        } else {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Child drawer has absolute gravity ");
                            sbLIZ.append(C21587019e0.LIZ(iLJIIIIZZ));
                            sbLIZ.append(" but this DrawerLayout already has a drawer view along that edge");
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            strLIZIZ.toString();
                            throw new IllegalStateException(strLIZIZ);
                        }
                    } else if (!z3) {
                        z3 = true;
                        childAt.measure(ViewGroup.getChildMeasureSpec(i, this.LLILLJJLI + ((ViewGroup.MarginLayoutParams) c21586619dw).leftMargin + ((ViewGroup.MarginLayoutParams) c21586619dw).rightMargin, ((ViewGroup.MarginLayoutParams) c21586619dw).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) c21586619dw).topMargin + ((ViewGroup.MarginLayoutParams) c21586619dw).bottomMargin, ((ViewGroup.MarginLayoutParams) c21586619dw).height));
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Child drawer has absolute gravity ");
                        sbLIZ2.append(C21587019e0.LIZ(iLJIIIIZZ));
                        sbLIZ2.append(" but this DrawerLayout already has a drawer view along that edge");
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        strLIZIZ2.toString();
                        throw new IllegalStateException(strLIZIZ2);
                    }
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Child ");
                    sbLIZ3.append(childAt);
                    sbLIZ3.append(" at index ");
                    sbLIZ3.append(i3);
                    sbLIZ3.append(" does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (LJIILIIL(childAt)) {
                if (LJIIL(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            } else {
                this.LLJJJJLIIL.add(childAt);
            }
        }
        if (!z) {
            int size = this.LLJJJJLIIL.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = (View) ListProtector.get(this.LLJJJJLIIL, i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        this.LLJJJJLIIL.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (LJFF() == null && !LJIILIIL(view)) {
            view.setImportantForAccessibility(1);
        } else {
            view.setImportantForAccessibility(4);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Drawable background;
        int height = getHeight();
        boolean zLJIIIZ = LJIIIZ(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i = 0;
        if (zLJIIIZ) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && LJIILIIL(childAt) && childAt.getHeight() >= height) {
                    if (LIZ(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        float f = this.LLILZ;
        if (f > 0.0f && zLJIIIZ) {
            this.LLILZIL.setColor((((int) ((((-16777216) & r2) >>> 24) * f)) << 24) | (this.LLILLL & 16777215));
            canvas.drawRect(i, 0.0f, width, getHeight(), this.LLILZIL);
        }
        return zDrawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        float f;
        boolean z2;
        int i6;
        this.LLJIJIL = true;
        int i7 = i3 - i;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C21586619dw c21586619dw = (C21586619dw) childAt.getLayoutParams();
                if (LJIIIZ(childAt)) {
                    int i9 = ((ViewGroup.MarginLayoutParams) c21586619dw).leftMargin;
                    childAt.layout(i9, ((ViewGroup.MarginLayoutParams) c21586619dw).topMargin, childAt.getMeasuredWidth() + i9, ((ViewGroup.MarginLayoutParams) c21586619dw).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (LIZ(childAt, 3)) {
                        float f2 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (c21586619dw.LIZIZ * f2));
                        f = (measuredWidth + i5) / f2;
                    } else {
                        float f3 = measuredWidth;
                        i5 = i7 - ((int) (c21586619dw.LIZIZ * f3));
                        f = (i7 - i5) / f3;
                    }
                    if (f == c21586619dw.LIZIZ) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean z3 = !z2;
                    int i10 = c21586619dw.LIZ & 112;
                    if (i10 != 16) {
                        if (i10 != 48) {
                            if (i10 != 80) {
                                int i11 = ((ViewGroup.MarginLayoutParams) c21586619dw).topMargin;
                                childAt.layout(i5, i11, measuredWidth + i5, measuredHeight + i11);
                            } else {
                                int i12 = i4 - i2;
                                childAt.layout(i5, (i12 - ((ViewGroup.MarginLayoutParams) c21586619dw).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i12 - ((ViewGroup.MarginLayoutParams) c21586619dw).bottomMargin);
                            }
                        } else {
                            int i13 = ((ViewGroup.MarginLayoutParams) c21586619dw).topMargin;
                            childAt.layout(i5, i13, measuredWidth + i5, measuredHeight + i13);
                        }
                    } else {
                        int i14 = i4 - i2;
                        int i15 = (i14 - measuredHeight) / 2;
                        int i16 = ((ViewGroup.MarginLayoutParams) c21586619dw).topMargin;
                        if (i15 < i16) {
                            i15 = i16;
                        } else {
                            int i17 = i15 + measuredHeight;
                            int i18 = i14 - ((ViewGroup.MarginLayoutParams) c21586619dw).bottomMargin;
                            if (i17 > i18) {
                                i15 = i18 - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i15, measuredWidth + i5, measuredHeight + i15);
                    }
                    if (z3) {
                        LJIIZILJ(childAt, f);
                    }
                    if (c21586619dw.LIZIZ > 0.0f) {
                        i6 = 0;
                    } else {
                        i6 = 4;
                    }
                    if (childAt.getVisibility() != i6) {
                        C786410Ut5.LJLLLLLL(i6, childAt);
                    }
                }
            }
        }
        this.LLJIJIL = false;
        this.LLJILJIL = false;
    }
}
