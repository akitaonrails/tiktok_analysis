package com.ss.android.ugc.aweme.story.feed.ui.gallery;

import X.AbstractC1585810rMx;
import X.C01GW;
import X.C13LZ;
import X.C1846520y9S;
import X.C20600815jK;
import X.C21673319rv;
import X.C21673919s1;
import X.C21674119s3;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class StoryGalleryLayoutManager extends RecyclerView.LayoutManager {
    public int LLILZIL;
    public View LLJ;
    public ViewOnAttachStateChangeListenerC20604515jv LLJI;
    public boolean LLJIJIL;
    public final C01GW LL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3268));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(455));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(457));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(456));
    public int LLILZLL = -1;
    public int LLIZ = -1;
    public int LLIZLLLIL = -1;

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return this.LLJI != null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -1);
    }

    public final int LJIILL() {
        return getPaddingStart() + ((LJIILLIIL() - getPaddingStart()) / 2);
    }

    public final int LJIILLIIL() {
        return getWidth() - getPaddingEnd();
    }

    public final int LJIILJJIL(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int decoratedMeasuredHeight = getDecoratedMeasuredHeight(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        int i2 = 0;
        if (marginLayoutParams != null) {
            i = marginLayoutParams.topMargin;
        } else {
            i = 0;
        }
        int i3 = decoratedMeasuredHeight + i;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            i2 = marginLayoutParams2.bottomMargin;
        }
        return i3 + i2;
    }

    public final int LJIIZILJ(View view) {
        int marginStart;
        int decoratedMeasuredWidth = getDecoratedMeasuredWidth(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int marginEnd = 0;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        } else {
            marginStart = 0;
        }
        int i = decoratedMeasuredWidth + marginStart;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
        }
        return i + marginEnd;
    }

    public final void LJIJ(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null) {
                Object value = this.LLILLJJLI.getValue();
                float fMax = Math.max(-1.0f, Math.min(1.0f, ((((childAt.getWidth() / 2) - i) + childAt.getLeft()) - LJIILL()) / childAt.getWidth()));
                value.getClass();
                if (fMax > -1.0f && fMax < 1.0f) {
                    float fAbs = ((1 - Math.abs(fMax)) * 0.14999998f) + 0.85f;
                    C786410Ut5.Ob(childAt, fAbs);
                    C786410Ut5.pc(childAt, fAbs);
                } else {
                    C786410Ut5.Ob(childAt, 0.85f);
                    C786410Ut5.pc(childAt, 0.85f);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        Integer numValueOf;
        C20600815jK<InterfaceC1891350zJl> state;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLayoutChildren: childCount: ");
        sbLIZ.append(getChildCount());
        sbLIZ.append(", state itemCount: ");
        sbLIZ.append(c21673919s1.LIZIZ());
        sbLIZ.append(", powerlist state count: ");
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJI;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            numValueOf = Integer.valueOf(state.LJIIIIZZ());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (getItemCount() == 0) {
            return;
        }
        int i = this.LLILZLL;
        if (i != -1) {
            this.LLILZIL = i;
        }
        int i2 = this.LLILZIL;
        if (i2 <= 0) {
            i2 = 0;
        }
        int itemCount = getItemCount() - 1;
        if (i2 > itemCount) {
            i2 = itemCount;
        }
        this.LLILZIL = i2;
        this.LLIZ = i2;
        this.LLIZLLLIL = i2;
        this.LLILZLL = -1;
        View view = this.LLJ;
        if (view != null) {
            view.setSelected(false);
        }
        this.LLJ = null;
        detachAndScrapAttachedViews(c21673319rv);
        View viewLJI = c21673319rv.LJI(this.LLILZIL);
        measureChildWithMargins(viewLJI, 0, 0);
        int paddingStart = (int) (getPaddingStart() + (((LJIILLIIL() - getPaddingStart()) - LJIIZILJ(viewLJI)) / 2.0f));
        int iLJIIZILJ = LJIIZILJ(viewLJI) + paddingStart;
        int i3 = this.LLILZIL;
        this.LLIZ = i3;
        this.LLIZLLLIL = i3;
        if (getLayoutDirection() == 1) {
            LJIILIIL(c21673319rv, C13LZ.LJIIIZ(this.LLILZIL, 0), paddingStart, LJIILLIIL());
            LJIIL(c21673319rv, C13LZ.LJIILJJIL(this.LLILZIL + 1, getItemCount()), getPaddingStart(), paddingStart);
        } else {
            LJIIL(c21673319rv, C13LZ.LJIIIZ(this.LLILZIL, 0), getPaddingStart(), iLJIIZILJ);
            LJIILIIL(c21673319rv, C13LZ.LJIILJJIL(this.LLILZIL + 1, getItemCount()), iLJIIZILJ, LJIILLIIL());
        }
        LJIJ(0);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJI;
        if (viewOnAttachStateChangeListenerC20604515jv2 == null) {
            return;
        }
        ((AbstractC1585810rMx) this.LL.getValue()).LJJIIZI(viewOnAttachStateChangeListenerC20604515jv2, 0, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        int iMin;
        boolean z;
        View childAt;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        int i2 = -i;
        View childAt2 = getChildAt(getChildCount() - 1);
        View childAt3 = getChildAt(0);
        if (getLayoutDirection() == 1) {
            if (i > 0) {
                if (childAt2 != null && getPosition(childAt2) == 0) {
                    iMin = Math.max(0, Math.min(i, (((childAt2.getRight() - childAt2.getLeft()) / 2) + childAt2.getLeft()) - LJIILL()));
                    i2 = -iMin;
                }
            } else if (childAt3 != null && getPosition(childAt3) == getItemCount() - 1) {
                iMin = Math.min(0, Math.max(i, (((childAt3.getRight() - childAt3.getLeft()) / 2) + childAt3.getLeft()) - LJIILL()));
                i2 = -iMin;
            }
        } else if (i > 0) {
            if (childAt2 != null && getPosition(childAt2) == getItemCount() - 1) {
                iMin = Math.max(0, Math.min(i, (((childAt2.getRight() - childAt2.getLeft()) / 2) + childAt2.getLeft()) - LJIILL()));
                i2 = -iMin;
            }
        } else if (childAt3 != null && this.LLIZ == 0) {
            iMin = Math.min(0, Math.max(i, (((childAt3.getRight() - childAt3.getLeft()) / 2) + childAt3.getLeft()) - LJIILL()));
            i2 = -iMin;
        }
        int i3 = -i2;
        if (getChildCount() != 0 && i3 != 0) {
            if (getLayoutDirection() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (i3 <= 0) {
                    for (int childCount = getChildCount() - 1; -1 < childCount; childCount--) {
                        View childAt4 = getChildAt(childCount);
                        if (childAt4 != null) {
                            if (getDecoratedLeft(childAt4) - i3 <= getWidth() - getPaddingRight()) {
                                break;
                            }
                            removeAndRecycleView(childAt4, c21673319rv);
                            this.LLIZLLLIL--;
                        }
                    }
                } else {
                    while (getChildCount() > 0 && (childAt = getChildAt(0)) != null && getDecoratedRight(childAt) - i3 < childAt.getPaddingLeft()) {
                        removeAndRecycleView(childAt, c21673319rv);
                        this.LLIZ++;
                    }
                }
            } else if (i3 <= 0) {
                for (int childCount2 = getChildCount() - 1; -1 < childCount2; childCount2--) {
                    View childAt5 = getChildAt(childCount2);
                    if (childAt5 == null || getDecoratedLeft(childAt5) - i3 <= getWidth() - getPaddingRight()) {
                        break;
                    }
                    removeAndRecycleView(childAt5, c21673319rv);
                    this.LLIZLLLIL++;
                }
            } else {
                while (getChildCount() > 0) {
                    View childAt6 = getChildAt(0);
                    if (childAt6 != null) {
                        if (getDecoratedRight(childAt6) - i3 >= getPaddingLeft()) {
                            break;
                        }
                        removeAndRecycleView(childAt6, c21673319rv);
                        this.LLIZ--;
                    }
                }
            }
        }
        if (getLayoutDirection() == 1) {
            if (i3 > 0) {
                View childAt7 = getChildAt(getChildCount() - 1);
                int position = this.LLIZ;
                int paddingStart = getPaddingStart();
                if (getChildCount() > 0 && childAt7 != null) {
                    position = getPosition(childAt7) - 1;
                    paddingStart = getDecoratedRight(childAt7);
                }
                LJIILIIL(c21673319rv, C13LZ.LJIIIZ(position, 0), paddingStart, LJIILLIIL() + i3);
            } else if (i3 < 0) {
                int position2 = this.LLIZLLLIL;
                int iLJIILLIIL = LJIILLIIL();
                View childAt8 = getChildAt(0);
                if (getChildCount() > 0 && childAt8 != null) {
                    position2 = getPosition(childAt8) + 1;
                    iLJIILLIIL = getDecoratedLeft(childAt8);
                }
                LJIIL(c21673319rv, C13LZ.LJIILJJIL(position2, getItemCount()), getPaddingStart() + i3, iLJIILLIIL);
            }
        } else if (i3 > 0) {
            int position3 = this.LLIZ;
            int paddingStart2 = getPaddingStart();
            View childAt9 = getChildAt(getChildCount() - 1);
            if (getChildCount() > 0 && childAt9 != null) {
                position3 = getPosition(childAt9) + 1;
                paddingStart2 = getDecoratedRight(childAt9);
            }
            LJIILIIL(c21673319rv, C13LZ.LJIILJJIL(position3, getItemCount()), paddingStart2, LJIILLIIL() + i3);
        } else if (i3 < 0) {
            View childAt10 = getChildAt(0);
            int position4 = this.LLIZLLLIL;
            int iLJIILLIIL2 = LJIILLIIL();
            if (getChildCount() > 0 && childAt10 != null) {
                position4 = getPosition(childAt10) - 1;
                iLJIILLIIL2 = getDecoratedLeft(childAt10);
            }
            LJIIL(c21673319rv, C13LZ.LJIIIZ(position4, 0), getPaddingStart() + i3, iLJIILLIIL2);
        }
        LJIJ(i3);
        offsetChildrenHorizontal(i2);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
        if (i < 0) {
            return;
        }
        final Context context = recyclerView.getContext();
        C21674119s3 c21674119s3 = new C21674119s3(context) { // from class: X.19tB
            @Override // X.C21674119s3
            public final float LJIIJJI(DisplayMetrics displayMetrics) {
                return (25.0f / displayMetrics.densityDpi) * 2;
            }

            @Override // X.C21674119s3
            public final int LJIIIZ(int i2, View view) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                RecyclerView.LayoutManager layoutManager = this.LIZJ;
                if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
                    return 0;
                }
                int width = ((layoutManager.getWidth() - layoutManager.getPaddingRight()) - layoutManager.getPaddingLeft()) / 2;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (!(layoutParams instanceof RecyclerView.LayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                    return 0;
                }
                int decoratedRight = layoutManager.getDecoratedRight(view) + marginLayoutParams.getMarginEnd();
                int decoratedLeft = layoutManager.getDecoratedLeft(view) - marginLayoutParams.getMarginStart();
                return width - (decoratedLeft + ((decoratedRight - decoratedLeft) / 2));
            }
        };
        c21674119s3.LIZ = i;
        startSmoothScroll(c21674119s3);
    }

    public final void LJIIL(C21673319rv c21673319rv, C1846520y9S c1846520y9S, int i, int i2) {
        int i3 = i2;
        int i4 = c1846520y9S.LL;
        int i5 = c1846520y9S.LLILLJJLI;
        int i6 = c1846520y9S.LLILLL;
        if (i6 > 0) {
            if (i4 > i5) {
                return;
            }
        } else if (i6 >= 0 || i5 > i4) {
            return;
        }
        while (i3 >= i) {
            View viewLJI = c21673319rv.LJI(i4);
            addView(viewLJI, 0);
            measureChildWithMargins(viewLJI, 0, 0);
            int iLJIIZILJ = LJIIZILJ(viewLJI);
            int iLJIILJJIL = LJIILJJIL(viewLJI);
            int paddingTop = (int) (getPaddingTop() + ((getHeight() - iLJIILJJIL) / 2.0f));
            int i7 = i3 - iLJIIZILJ;
            Rect rect = new Rect();
            rect.set(i7, paddingTop, i3, iLJIILJJIL + paddingTop);
            layoutDecoratedWithMargins(viewLJI, rect.left, rect.top, rect.right, rect.bottom);
            this.LLIZ = i4;
            if (i4 == i5) {
                return;
            }
            i4 += i6;
            i3 = i7;
        }
    }

    public final void LJIILIIL(C21673319rv c21673319rv, C1846520y9S c1846520y9S, int i, int i2) {
        int i3 = i;
        int i4 = c1846520y9S.LL;
        int i5 = c1846520y9S.LLILLJJLI;
        int i6 = c1846520y9S.LLILLL;
        if (i6 > 0) {
            if (i4 > i5) {
                return;
            }
        } else if (i6 >= 0 || i5 > i4) {
            return;
        }
        while (i3 <= i2) {
            View viewLJI = c21673319rv.LJI(i4);
            addView(viewLJI);
            measureChildWithMargins(viewLJI, 0, 0);
            int iLJIIZILJ = LJIIZILJ(viewLJI);
            int iLJIILJJIL = LJIILJJIL(viewLJI);
            int paddingTop = (int) (getPaddingTop() + ((getHeight() - iLJIILJJIL) / 2.0f));
            Rect rect = new Rect();
            rect.set(i3, paddingTop, iLJIIZILJ + i3, iLJIILJJIL + paddingTop);
            layoutDecoratedWithMargins(viewLJI, rect.left, rect.top, rect.right, rect.bottom);
            this.LLIZLLLIL = i4;
            i3 = rect.right;
            if (i4 == i5) {
                return;
            } else {
                i4 += i6;
            }
        }
    }
}
