package com.google.android.material.appbar;

import X.C16BC;
import X.C16G0;
import X.C16G1;
import X.C16GX;
import X.C20092413jW;
import X.C419990GdR;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.util.ArrayList;
import java.util.List;
import u4.q0;

/* JADX INFO: loaded from: classes32.dex */
public class AppBarLayout$ScrollingViewBehavior extends HeaderScrollingViewBehavior {
    public AppBarLayout$ScrollingViewBehavior() {
    }

    @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
    public final View LIZ(List list) {
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) ListProtector.get(arrayList, i);
            if (view instanceof C16GX) {
                return view;
            }
        }
        return null;
    }

    @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
    public final float LIZIZ(View view) {
        int topBottomOffsetForScrollingSibling;
        int i;
        if (view instanceof C16GX) {
            C16GX c16gx = (C16GX) view;
            int totalScrollRange = c16gx.getTotalScrollRange();
            int downNestedPreScrollRange = c16gx.getDownNestedPreScrollRange();
            C16BC c16bc = ((C16G1) c16gx.getLayoutParams()).LIZ;
            if (c16bc instanceof AppBarLayout$BaseBehavior) {
                topBottomOffsetForScrollingSibling = ((HeaderBehavior) c16bc).getTopBottomOffsetForScrollingSibling();
            } else {
                topBottomOffsetForScrollingSibling = 0;
            }
            if ((downNestedPreScrollRange == 0 || totalScrollRange + topBottomOffsetForScrollingSibling > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                return (topBottomOffsetForScrollingSibling / i) + 1.0f;
            }
        }
        return 0.0f;
    }

    @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
    public final int LIZJ(View view) {
        if (view instanceof C16GX) {
            return ((C16GX) view).getTotalScrollRange();
        }
        return view.getMeasuredHeight();
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ScrollingViewBehavior_Layout);
        this.LIZLLL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // X.C16BC
    public final boolean layoutDependsOn(C16G0 c16g0, View view, View view2) {
        return view2 instanceof C16GX;
    }

    @Override // X.C16BC
    public boolean onDependentViewChanged(C16G0 c16g0, View view, View view2) {
        int iLIZIZ;
        C16BC c16bc = ((C16G1) view2.getLayoutParams()).LIZ;
        if (c16bc instanceof AppBarLayout$BaseBehavior) {
            int bottom = (view2.getBottom() - view.getTop()) + ((AppBarLayout$BaseBehavior) c16bc).offsetDelta + this.LIZJ;
            if (this.LIZLLL == 0) {
                iLIZIZ = 0;
            } else {
                float fLIZIZ = LIZIZ(view2);
                int i = this.LIZLLL;
                iLIZIZ = C419990GdR.LIZIZ((int) (fLIZIZ * i), 0, i);
            }
            view.offsetTopAndBottom(bottom - iLIZIZ);
        }
        if (view2 instanceof C16GX) {
            C16GX c16gx = (C16GX) view2;
            if (c16gx.LLJIJIL) {
                c16gx.LJFF(c16gx.LJI(view));
            }
        }
        return false;
    }

    @Override // X.C16BC
    public final void onDependentViewRemoved(C16G0 c16g0, View view, View view2) {
        if (view2 instanceof C16GX) {
            q0.LJIILJJIL(C20092413jW.LJIILJJIL.LIZ(), c16g0);
            q0.LJIIJJI(0, c16g0);
            q0.LJIILJJIL(C20092413jW.LJIILL.LIZ(), c16g0);
            q0.LJIIJJI(0, c16g0);
        }
    }

    @Override // X.C16BC
    public final boolean onRequestChildRectangleOnScreen(C16G0 c16g0, View view, Rect rect, boolean z) {
        ArrayList arrayList = (ArrayList) c16g0.LJFF(view);
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            View view2 = (View) ListProtector.get(arrayList, i);
            if (view2 instanceof C16GX) {
                C16GX c16gx = (C16GX) view2;
                if (c16gx != null) {
                    rect.offset(view.getLeft(), view.getTop());
                    Rect rect2 = this.LIZ;
                    rect2.set(0, 0, c16g0.getWidth(), c16g0.getHeight());
                    if (!rect2.contains(rect)) {
                        c16gx.LJ(false, !z, true);
                        return true;
                    }
                }
            } else {
                i++;
            }
        }
        return false;
    }
}
