package com.ss.android.ugc.aweme.im.common.widget.appbar;

import X.C16BC;
import X.C16G0;
import X.C16G1;
import X.C16GW;
import X.C419990GdR;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class IMAppBarLayout$ScrollingViewBehavior extends IMHeaderScrollingViewBehavior {
    public IMAppBarLayout$ScrollingViewBehavior() {
    }

    @Override // com.ss.android.ugc.aweme.im.common.widget.appbar.IMHeaderScrollingViewBehavior
    public final View LIZ(List<? extends View> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (ListProtector.get(list, i) instanceof C16GW) {
                return (View) ListProtector.get(list, i);
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.common.widget.appbar.IMHeaderScrollingViewBehavior
    public final float LIZIZ(View view) {
        int topBottomOffsetForScrollingSibling;
        int i;
        if (view instanceof C16GW) {
            C16GW c16gw = (C16GW) view;
            int totalScrollRange = c16gw.getTotalScrollRange();
            int downNestedPreScrollRange$im_common_saas_release = c16gw.getDownNestedPreScrollRange$im_common_saas_release();
            C16BC c16bc = ((C16G1) c16gw.getLayoutParams()).LIZ;
            if (c16bc instanceof IMAppBarLayout$Behavior) {
                topBottomOffsetForScrollingSibling = ((IMHeaderBehavior) c16bc).getTopBottomOffsetForScrollingSibling();
            } else {
                topBottomOffsetForScrollingSibling = 0;
            }
            if ((downNestedPreScrollRange$im_common_saas_release == 0 || totalScrollRange + topBottomOffsetForScrollingSibling > downNestedPreScrollRange$im_common_saas_release) && (i = totalScrollRange - downNestedPreScrollRange$im_common_saas_release) != 0) {
                return (topBottomOffsetForScrollingSibling / i) + 1.0f;
            }
        }
        return 0.0f;
    }

    @Override // com.ss.android.ugc.aweme.im.common.widget.appbar.IMHeaderScrollingViewBehavior
    public final int LIZJ(View view) {
        if (view instanceof C16GW) {
            return ((C16GW) view).getTotalScrollRange();
        }
        return view.getMeasuredHeight();
    }

    public IMAppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.IMScrollingViewBehavior_Layout);
        this.LJFF = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.IMScrollingViewBehavior_Layout_behavior_overlapTop, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // X.C16BC
    public final boolean layoutDependsOn(C16G0 c16g0, View view, View view2) {
        return view2 instanceof C16GW;
    }

    @Override // X.C16BC
    public final boolean onDependentViewChanged(C16G0 c16g0, View view, View view2) {
        boolean z;
        int iLIZIZ;
        C16BC c16bc = ((C16G1) view2.getLayoutParams()).LIZ;
        if (c16bc instanceof IMAppBarLayout$Behavior) {
            int bottom = (view2.getBottom() - view.getTop()) + ((IMAppBarLayout$Behavior) c16bc).LJIIIZ + this.LJ;
            if (this.LJFF == 0) {
                iLIZIZ = 0;
            } else {
                float fLIZIZ = LIZIZ(view2);
                int i = this.LJFF;
                iLIZIZ = C419990GdR.LIZIZ((int) (fLIZIZ * i), 0, i);
            }
            view.offsetTopAndBottom(bottom - iLIZIZ);
        }
        if (view2 instanceof C16GW) {
            C16GW c16gw = (C16GW) view2;
            if (c16gw.LLJI) {
                if (view.getScrollY() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (c16gw.LLJ != z) {
                    c16gw.LLJ = z;
                    c16gw.refreshDrawableState();
                }
            }
        }
        return false;
    }

    @Override // X.C16BC
    public final boolean onRequestChildRectangleOnScreen(C16G0 c16g0, View view, Rect rect, boolean z) {
        View viewLIZ = LIZ(c16g0.LJFF(view));
        if (viewLIZ != null) {
            rect.offset(view.getLeft(), view.getTop());
            Rect rect2 = this.LIZJ;
            rect2.set(0, 0, c16g0.getWidth(), c16g0.getHeight());
            if (!rect2.contains(rect)) {
                ((C16GW) viewLIZ).LIZLLL(false, !z, true);
                return true;
            }
        }
        return false;
    }
}
