package com.ss.android.ugc.aweme.im.common.widget.appbar;

import X.C16G0;
import X.C16GN;
import X.C16GR;
import X.C16GW;
import X.C16GY;
import X.C419990GdR;
import Y.AUListenerS158S0300000_31;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.im.common.widget.appbar.IMAppBarLayout$Behavior;
import java.lang.ref.WeakReference;
import u4.q0;

/* JADX INFO: loaded from: classes32.dex */
public class IMAppBarLayout$Behavior extends IMHeaderBehavior<C16GW> {
    public int LJIIIZ;
    public int LJIIJ;
    public ValueAnimator LJIIJJI;
    public int LJIIL;
    public boolean LJIILIIL;
    public float LJIILJJIL;
    public WeakReference<View> LJIILL;

    public IMAppBarLayout$Behavior() {
        this.LJIIL = -1;
    }

    @Override // com.ss.android.ugc.aweme.im.common.widget.appbar.IMHeaderBehavior
    public final int getTopBottomOffsetForScrollingSibling() {
        return getTopAndBottomOffset() + this.LJIIIZ;
    }

    public static final class SavedState extends AbsSavedState {
        public boolean firstVisibleChildAtMinimumHeight;
        public int firstVisibleChildIndex;
        public float firstVisibleChildPercentageShown;
        public static final C16GR Companion = new Object() { // from class: X.16GR
        };
        public static final Parcelable.ClassLoaderCreator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: X.16GP
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new IMAppBarLayout$Behavior.SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IMAppBarLayout$Behavior.SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final IMAppBarLayout$Behavior.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new IMAppBarLayout$Behavior.SavedState(parcel, classLoader);
            }
        };

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            boolean z;
            super(parcel, classLoader);
            this.firstVisibleChildIndex = parcel.readInt();
            this.firstVisibleChildPercentageShown = parcel.readFloat();
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.firstVisibleChildAtMinimumHeight = z;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.firstVisibleChildIndex);
            parcel.writeFloat(this.firstVisibleChildPercentageShown);
            parcel.writeByte(this.firstVisibleChildAtMinimumHeight ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.common.widget.appbar.IMHeaderBehavior
    public final boolean canDragView(View view) {
        View view2;
        WeakReference<View> weakReference = this.LJIILL;
        if (weakReference != null && (view2 = weakReference.get()) != null) {
            if (view2.isShown() && !view2.canScrollVertically(-1)) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.common.widget.appbar.IMHeaderBehavior
    public final int getMaxDragOffset(View view) {
        return -((C16GW) view).getDownNestedScrollRange$im_common_saas_release();
    }

    @Override // com.ss.android.ugc.aweme.im.common.widget.appbar.IMHeaderBehavior
    public final int getScrollRangeForDragFling(View view) {
        return ((C16GW) view).getTotalScrollRange();
    }

    public IMAppBarLayout$Behavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJIIL = -1;
    }

    public final void LJ(C16G0 c16g0, C16GW c16gw) {
        int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
        int childCount = c16gw.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c16gw.getChildAt(i);
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            C16GY c16gy = (C16GY) childAt.getLayoutParams();
            if ((c16gy.LIZ & 32) == 32) {
                top -= ((LinearLayout.LayoutParams) c16gy).topMargin;
                bottom += ((LinearLayout.LayoutParams) c16gy).bottomMargin;
            }
            int i2 = -topBottomOffsetForScrollingSibling;
            if (top <= i2 && bottom >= i2) {
                if (i >= 0) {
                    View childAt2 = c16gw.getChildAt(i);
                    C16GY c16gy2 = (C16GY) childAt2.getLayoutParams();
                    int i3 = c16gy2.LIZ;
                    if ((i3 & 17) == 17) {
                        int i4 = -childAt2.getTop();
                        int minimumHeight = -childAt2.getBottom();
                        if (i == c16gw.getChildCount() - 1) {
                            minimumHeight += c16gw.getTopInset$im_common_saas_release();
                        }
                        if ((i3 & 2) == 2) {
                            minimumHeight += childAt2.getMinimumHeight();
                        } else if ((i3 & 5) == 5) {
                            int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                            if (topBottomOffsetForScrollingSibling < minimumHeight2) {
                                i4 = minimumHeight2;
                            } else {
                                minimumHeight = minimumHeight2;
                            }
                        }
                        if ((i3 & 32) == 32) {
                            i4 += ((LinearLayout.LayoutParams) c16gy2).topMargin;
                            minimumHeight -= ((LinearLayout.LayoutParams) c16gy2).bottomMargin;
                        }
                        if (topBottomOffsetForScrollingSibling < (minimumHeight + i4) / 2) {
                            i4 = minimumHeight;
                        }
                        LIZ(c16g0, c16gw, C419990GdR.LIZIZ(i4, -c16gw.getTotalScrollRange(), 0));
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.common.widget.appbar.IMHeaderBehavior
    public final void onFlingFinished(C16G0 c16g0, View view) {
        LJ(c16g0, (C16GW) view);
    }

    @Override // X.C16BC
    public final Parcelable onSaveInstanceState(C16G0 c16g0, View view) {
        C16GW c16gw = (C16GW) view;
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState(c16g0, c16gw);
        int topAndBottomOffset = getTopAndBottomOffset();
        int childCount = c16gw.getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = c16gw.getChildAt(i);
            int bottom = childAt.getBottom() + topAndBottomOffset;
            if (childAt.getTop() + topAndBottomOffset <= 0 && bottom >= 0) {
                if (parcelableOnSaveInstanceState == null) {
                    parcelableOnSaveInstanceState = AbsSavedState.EMPTY_STATE;
                }
                SavedState savedState = new SavedState(parcelableOnSaveInstanceState);
                savedState.firstVisibleChildIndex = i;
                if (bottom == childAt.getMinimumHeight() + c16gw.getTopInset$im_common_saas_release()) {
                    z = true;
                }
                savedState.firstVisibleChildAtMinimumHeight = z;
                savedState.firstVisibleChildPercentageShown = bottom / childAt.getHeight();
                return savedState;
            }
        }
        return parcelableOnSaveInstanceState;
    }

    public final void LIZ(C16G0 c16g0, C16GW c16gw, int i) {
        int height;
        int iAbs = Math.abs(getTopBottomOffsetForScrollingSibling() - i);
        float fAbs = Math.abs(0.0f);
        if (fAbs > 0.0f) {
            height = Math.round((iAbs / fAbs) * 1000.0f) * 3;
        } else {
            height = (int) (((iAbs / c16gw.getHeight()) + 1.0f) * 150.0f);
        }
        int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
        if (topBottomOffsetForScrollingSibling == i) {
            ValueAnimator valueAnimator = this.LJIIJJI;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator2 = this.LJIIJJI;
        if (valueAnimator2 == null) {
            ValueAnimator valueAnimator3 = new ValueAnimator();
            valueAnimator3.setInterpolator(new DecelerateInterpolator());
            valueAnimator3.addUpdateListener(new AUListenerS158S0300000_31(c16gw, c16g0, this, 0));
            this.LJIIJJI = valueAnimator3;
        } else {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator4 = this.LJIIJJI;
        if (valueAnimator4 == null) {
            return;
        }
        valueAnimator4.setDuration(Math.min(height, 600));
        valueAnimator4.setIntValues(topBottomOffsetForScrollingSibling, i);
        valueAnimator4.start();
    }

    @Override // com.ss.android.ugc.aweme.im.common.widget.appbar.IMViewOffsetBehavior, X.C16BC
    public final boolean onLayoutChild(C16G0 c16g0, View view, int i) {
        boolean z;
        int iRound;
        C16GW c16gw = (C16GW) view;
        super.onLayoutChild(c16g0, c16gw, i);
        int pendingAction$im_common_saas_release = c16gw.getPendingAction$im_common_saas_release();
        int i2 = this.LJIIL;
        if (i2 >= 0 && (pendingAction$im_common_saas_release & 8) == 0) {
            View childAt = c16gw.getChildAt(i2);
            int i3 = -childAt.getBottom();
            if (this.LJIILIIL) {
                iRound = childAt.getMinimumHeight() + c16gw.getTopInset$im_common_saas_release();
            } else {
                iRound = Math.round(childAt.getHeight() * this.LJIILJJIL);
            }
            setHeaderTopBottomOffset(c16g0, c16gw, i3 + iRound);
        } else if (pendingAction$im_common_saas_release != 0) {
            if ((pendingAction$im_common_saas_release & 4) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((pendingAction$im_common_saas_release & 2) != 0) {
                int i4 = -c16gw.getUpNestedPreScrollRange$im_common_saas_release();
                if (z) {
                    LIZ(c16g0, c16gw, i4);
                } else {
                    setHeaderTopBottomOffset(c16g0, c16gw, i4);
                }
            } else if ((pendingAction$im_common_saas_release & 1) != 0) {
                if (z) {
                    LIZ(c16g0, c16gw, 0);
                } else {
                    setHeaderTopBottomOffset(c16g0, c16gw, 0);
                }
            }
        }
        c16gw.LLILZIL = 0;
        this.LJIIL = -1;
        setTopAndBottomOffset(C419990GdR.LIZIZ(getTopAndBottomOffset(), -c16gw.getTotalScrollRange(), 0));
        LJFF(c16g0, c16gw, getTopAndBottomOffset(), 0, true);
        c16gw.LIZIZ(getTopAndBottomOffset());
        return true;
    }

    @Override // X.C16BC
    public final void onRestoreInstanceState(C16G0 c16g0, View view, Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            Parcelable parcelable2 = savedState.mSuperState;
            if (parcelable2 != null) {
                super.onRestoreInstanceState(c16g0, view, parcelable2);
                this.LJIIL = savedState.firstVisibleChildIndex;
                this.LJIILJJIL = savedState.firstVisibleChildPercentageShown;
                this.LJIILIIL = savedState.firstVisibleChildAtMinimumHeight;
                return;
            }
            return;
        }
        super.onRestoreInstanceState(c16g0, view, parcelable);
        this.LJIIL = -1;
    }

    @Override // X.C16BC
    public final void onStopNestedScroll(C16G0 c16g0, View view, View view2, int i) {
        C16GW c16gw = (C16GW) view;
        if (this.LJIIJ == 0 || i == 1) {
            LJ(c16g0, c16gw);
        }
        this.LJIILL = new WeakReference<>(view2);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(X.C16G0 r5, X.C16GW r6, int r7, int r8, boolean r9) {
        /*
            int r3 = java.lang.Math.abs(r7)
            int r2 = r6.getChildCount()
            r1 = 0
        L9:
            if (r1 >= r2) goto Lb4
            android.view.View r4 = r6.getChildAt(r1)
            int r0 = r4.getTop()
            if (r3 < r0) goto Lb0
            int r0 = r4.getBottom()
            if (r3 > r0) goto Lb0
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            X.16GY r0 = (X.C16GY) r0
            int r1 = r0.LIZ
            r0 = r1 & 1
            if (r0 == 0) goto Lae
            int r3 = r4.getMinimumHeight()
            if (r8 <= 0) goto L9c
            r0 = r1 & 12
            if (r0 == 0) goto L9c
            int r2 = -r7
            int r1 = r4.getBottom()
            int r1 = r1 - r3
            int r0 = r6.getTopInset$im_common_saas_release()
            int r1 = r1 - r0
            if (r2 < r1) goto Lae
        L3e:
            r4 = 1
        L3f:
            boolean r0 = r6.LLJI
            if (r0 == 0) goto L5b
            int r3 = r5.getChildCount()
            r2 = 0
        L48:
            if (r2 >= r3) goto L5b
            android.view.View r1 = r5.getChildAt(r2)
            boolean r0 = r1 instanceof X.InterfaceC1338650kwJ
            if (r0 == 0) goto L99
            if (r1 == 0) goto L5b
            int r0 = r1.getScrollY()
            if (r0 <= 0) goto L97
            r4 = 1
        L5b:
            boolean r0 = r6.LLJ
            if (r0 == r4) goto L95
            r6.LLJ = r4
            r6.refreshDrawableState()
            r0 = 1
        L65:
            if (r9 != 0) goto L8e
            if (r0 == 0) goto L91
            java.util.List r4 = r5.LJI(r6)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r3 = r4.size()
            r2 = 0
        L74:
            if (r2 >= r3) goto L91
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r2)
            android.view.View r0 = (android.view.View) r0
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.16G1 r0 = (X.C16G1) r0
            X.16BC r1 = r0.LIZ
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.im.common.widget.appbar.IMAppBarLayout$ScrollingViewBehavior
            if (r0 == 0) goto L92
            com.ss.android.ugc.aweme.im.common.widget.appbar.IMHeaderScrollingViewBehavior r1 = (com.ss.android.ugc.aweme.im.common.widget.appbar.IMHeaderScrollingViewBehavior) r1
            int r0 = r1.LJFF
            if (r0 == 0) goto L91
        L8e:
            r6.jumpDrawablesToCurrentState()
        L91:
            return
        L92:
            int r2 = r2 + 1
            goto L74
        L95:
            r0 = 0
            goto L65
        L97:
            r4 = 0
            goto L5b
        L99:
            int r2 = r2 + 1
            goto L48
        L9c:
            r0 = r1 & 2
            if (r0 == 0) goto Lae
            int r2 = -r7
            int r1 = r4.getBottom()
            int r1 = r1 - r3
            int r0 = r6.getTopInset$im_common_saas_release()
            int r1 = r1 - r0
            if (r2 < r1) goto Lae
            goto L3e
        Lae:
            r4 = 0
            goto L3f
        Lb0:
            int r1 = r1 + 1
            goto L9
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.common.widget.appbar.IMAppBarLayout$Behavior.LJFF(X.16G0, X.16GW, int, int, boolean):void");
    }

    public final void LIZIZ(C16G0 c16g0, C16GW c16gw, View view, int i, int i2) {
        boolean z = true;
        if (i < 0) {
            setHeaderTopBottomOffset(c16g0, c16gw, getTopBottomOffsetForScrollingSibling() - i, -c16gw.getDownNestedScrollRange$im_common_saas_release(), 0);
            if (i2 == 1 && getTopBottomOffsetForScrollingSibling() == 0) {
                q0.LJJIII(1, view);
            }
        }
        if (c16gw.LLJI) {
            if (view.getScrollY() <= 0) {
                z = false;
            }
            if (c16gw.LLJ != z) {
                c16gw.LLJ = z;
                c16gw.refreshDrawableState();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.common.widget.appbar.IMHeaderBehavior
    /* JADX INFO: renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    public int setHeaderTopBottomOffset(C16G0 c16g0, C16GW c16gw, int i, int i2, int i3) {
        int iSignum;
        int i4;
        C16G0 c16g02;
        int topInset$im_common_saas_release;
        int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
        if (i2 != 0 && topBottomOffsetForScrollingSibling >= i2 && topBottomOffsetForScrollingSibling <= i3) {
            int iLIZIZ = C419990GdR.LIZIZ(i, i2, i3);
            if (topBottomOffsetForScrollingSibling == iLIZIZ) {
                return 0;
            }
            if (c16gw.LLILZ) {
                int iAbs = Math.abs(iLIZIZ);
                int childCount = c16gw.getChildCount();
                int i5 = 0;
                while (true) {
                    if (i5 >= childCount) {
                        break;
                    }
                    View childAt = c16gw.getChildAt(i5);
                    C16GY c16gy = (C16GY) childAt.getLayoutParams();
                    Interpolator interpolator = c16gy.LIZIZ;
                    if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                        if (interpolator != null) {
                            int i6 = c16gy.LIZ;
                            if ((i6 & 1) != 0) {
                                topInset$im_common_saas_release = childAt.getHeight() + ((LinearLayout.LayoutParams) c16gy).topMargin + ((LinearLayout.LayoutParams) c16gy).bottomMargin;
                                if ((i6 & 2) != 0) {
                                    topInset$im_common_saas_release -= childAt.getMinimumHeight();
                                }
                            } else {
                                topInset$im_common_saas_release = 0;
                            }
                            if (childAt.getFitsSystemWindows()) {
                                topInset$im_common_saas_release -= c16gw.getTopInset$im_common_saas_release();
                            }
                            if (topInset$im_common_saas_release > 0) {
                                float f = topInset$im_common_saas_release;
                                iSignum = Integer.signum(iLIZIZ) * (childAt.getTop() + Math.round(f * interpolator.getInterpolation((iAbs - childAt.getTop()) / f)));
                            }
                        }
                    } else {
                        i5++;
                    }
                }
                iSignum = iLIZIZ;
            } else {
                iSignum = iLIZIZ;
            }
            boolean topAndBottomOffset = setTopAndBottomOffset(iSignum);
            int i7 = topBottomOffsetForScrollingSibling - iLIZIZ;
            this.LJIIIZ = iLIZIZ - iSignum;
            if (!topAndBottomOffset && c16gw.LLILZ) {
                ViewParent parent = c16gw.getParent();
                if ((parent instanceof C16G0) && (c16g02 = (C16G0) parent) != null) {
                    c16g02.LIZLLL(c16gw);
                }
            }
            c16gw.LIZIZ(getTopAndBottomOffset());
            if (iLIZIZ < topBottomOffsetForScrollingSibling) {
                i4 = -1;
            } else {
                i4 = 1;
            }
            LJFF(c16g0, c16gw, iLIZIZ, i4, false);
            return i7;
        }
        this.LJIIIZ = 0;
        return 0;
    }

    @Override // X.C16BC
    /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public boolean onStartNestedScroll(C16G0 c16g0, C16GW c16gw, View view, View view2, int i, int i2) {
        boolean z = false;
        if ((i & 2) != 0 && (c16gw.LLJI || (c16gw.getTotalScrollRange() != 0 && c16g0.getHeight() - view.getHeight() <= c16gw.getHeight()))) {
            z = true;
        }
        if (z) {
            ValueAnimator valueAnimator = this.LJIIJJI;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (i2 == 0) {
                C16GN c16gn = this.LIZJ;
                if (c16gn != null) {
                    HandlerHook.viewRemoveCallbacks(c16gw, c16gn);
                }
                this.LIZJ = null;
                OverScroller overScroller = this.LIZLLL;
                if (overScroller != null && !overScroller.isFinished()) {
                    overScroller.abortAnimation();
                }
            }
        }
        this.LJIILL = null;
        this.LJIIJ = i2;
        return z;
    }

    @Override // X.C16BC
    public final boolean onMeasureChild(C16G0 c16g0, View view, int i, int i2, int i3, int i4) {
        if (((ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == -2) {
            c16g0.LJIILIIL(view, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }
        return super.onMeasureChild(c16g0, view, i, i2, i3, i4);
    }

    @Override // X.C16BC
    public final void onNestedPreScroll(C16G0 c16g0, View view, View view2, int i, int i2, int[] iArr, int i3) {
        int i4;
        int downNestedPreScrollRange$im_common_saas_release;
        C16GW c16gw = (C16GW) view;
        if (i2 != 0) {
            if (i2 < 0) {
                i4 = -c16gw.getTotalScrollRange();
                downNestedPreScrollRange$im_common_saas_release = c16gw.getDownNestedPreScrollRange$im_common_saas_release() + i4;
            } else {
                i4 = -c16gw.getUpNestedPreScrollRange$im_common_saas_release();
                downNestedPreScrollRange$im_common_saas_release = 0;
            }
            if (i4 != downNestedPreScrollRange$im_common_saas_release) {
                iArr[1] = setHeaderTopBottomOffset(c16g0, c16gw, getTopBottomOffsetForScrollingSibling() - i2, i4, downNestedPreScrollRange$im_common_saas_release);
                if (i3 == 1) {
                    int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
                    if (i2 < 0) {
                        if (topBottomOffsetForScrollingSibling != 0) {
                            return;
                        }
                    } else if (topBottomOffsetForScrollingSibling != (-c16gw.getDownNestedScrollRange$im_common_saas_release())) {
                        return;
                    }
                    q0.LJJIII(1, view2);
                }
            }
        }
    }

    @Override // X.C16BC
    public final /* bridge */ /* synthetic */ void onNestedScroll(C16G0 c16g0, View view, View view2, int i, int i2, int i3, int i4, int i5) {
        LIZIZ(c16g0, (C16GW) view, view2, i4, i5);
    }

    @Override // X.C16BC
    public final void onNestedScroll(C16G0 c16g0, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        LIZIZ(c16g0, (C16GW) view, view2, i4, i5);
    }
}
