package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.viewholder;

import X.AbstractC21673619ry;
import X.C21565219aU;
import X.C21565319aV;
import X.C21673319rv;
import X.C21673919s1;
import X.C21677719sd;
import X.C21677819se;
import X.C679470Qkz;
import X.InterfaceC1811800xFS;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public class VisualSearchStickyGridLayoutManager extends SearchAccurateOffsetGridLayoutManager {
    public static final C21565219aU LLJJIJIL = new C21565219aU(Float.valueOf(0.0f), 30);
    public final C21677719sd LLJJIJI;
    public final float LLJJIJIIJIL;

    public final void LJIJJLI(C21673319rv c21673319rv) {
        int i;
        int i2;
        RecyclerView.LayoutParams layoutParams;
        int absoluteAdapterPosition;
        int itemViewType;
        C21677719sd c21677719sd = this.LLJJIJI;
        int i3 = 0;
        View childAt = c21677719sd.LIZ.getChildAt(0);
        if (childAt != null) {
            int itemViewType2 = c21677719sd.LIZ.getItemViewType(childAt);
            ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
            if (layoutParams2 instanceof RecyclerView.LayoutParams) {
                layoutParams = (RecyclerView.LayoutParams) layoutParams2;
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                absoluteAdapterPosition = layoutParams.getAbsoluteAdapterPosition();
            } else {
                absoluteAdapterPosition = -1;
            }
            if (!c21677719sd.LIZ(itemViewType2)) {
                int i4 = absoluteAdapterPosition - 1;
                while (true) {
                    if (-1 >= i4) {
                        break;
                    }
                    AbstractC21673619ry<?> abstractC21673619ry = c21677719sd.LIZLLL;
                    if (abstractC21673619ry != null) {
                        itemViewType = abstractC21673619ry.getItemViewType(i4);
                    } else {
                        itemViewType = 0;
                    }
                    if (!c21677719sd.LIZ(itemViewType)) {
                        i4--;
                    } else if (c21673319rv != null) {
                        childAt = c21673319rv.LJI(i4);
                    }
                }
                childAt = null;
            }
        } else {
            childAt = null;
        }
        if (childAt == null) {
            childAt = null;
        } else {
            c21677719sd.LIZ.addView(childAt, 0);
            c21677719sd.LIZ.measureChildWithMargins(childAt, 0, 0);
            ((ArrayList) c21677719sd.LIZJ).clear();
            int childCount = c21677719sd.LIZ.getChildCount();
            for (int i5 = 1; i5 < childCount; i5++) {
                View childAt2 = c21677719sd.LIZ.getChildAt(i5);
                if (childAt2 != null && c21677719sd.LIZ(c21677719sd.LIZ.getItemViewType(childAt2))) {
                    ((ArrayList) c21677719sd.LIZJ).add(childAt2);
                }
            }
            ArrayList arrayList = (ArrayList) c21677719sd.LIZJ;
            arrayList.remove(childAt);
            int decoratedMeasuredHeight = c21677719sd.LIZ.getDecoratedMeasuredHeight(childAt);
            int decoratedTop = c21677719sd.LIZ.getDecoratedTop(childAt);
            int size = arrayList.size();
            int i6 = 0;
            while (true) {
                if (i6 < size) {
                    View view = (View) ListProtector.get(arrayList, i6);
                    int decoratedTop2 = c21677719sd.LIZ.getDecoratedTop(view);
                    C21677819se c21677819se = c21677719sd.LIZIZ.get(Integer.valueOf(c21677719sd.LIZ.getItemViewType(view)));
                    if (c21677819se != null) {
                        i2 = c21677819se.LIZ;
                    } else {
                        i2 = 0;
                    }
                    int i7 = decoratedTop2 - i2;
                    if (i7 >= decoratedTop && i7 <= decoratedMeasuredHeight) {
                        i = i7 - decoratedMeasuredHeight;
                        break;
                    }
                    i6++;
                } else {
                    i = 0;
                    break;
                }
            }
            RecyclerView.LayoutManager layoutManager = c21677719sd.LIZ;
            layoutManager.layoutDecoratedWithMargins(childAt, layoutManager.getPaddingStart(), i, c21677719sd.LIZ.getPaddingStart() + c21677719sd.LIZ.getDecoratedMeasuredWidth(childAt), i + decoratedMeasuredHeight);
        }
        if (this.LLJJIJIIJIL > 0.0f) {
            int childCount2 = getChildCount();
            while (true) {
                if (i3 >= childCount2) {
                    break;
                }
                View childAt3 = getChildAt(i3);
                if (childAt3 != null && !Intrinsics.LJFF(childAt3, childAt)) {
                    if (this.LLJJIJI.LIZ(getItemViewType(childAt3))) {
                        childAt3.setOutlineProvider(LLJJIJIL);
                        childAt3.setClipToOutline(true);
                    }
                    if (childAt != null && childAt.getBottom() <= childAt3.getBottom() && childAt.getBottom() - this.LLJJIJIIJIL >= childAt3.getTop()) {
                        float bottom = childAt3.getBottom() - childAt.getBottom();
                        float f = this.LLJJIJIIJIL;
                        if (bottom <= f) {
                            float bottom2 = f - (childAt3.getBottom() - childAt.getBottom());
                            if (bottom2 > 0.0f) {
                                C21565319aV.LIZJ(childAt, null, null, null, Float.valueOf(bottom2), Float.valueOf(bottom2));
                                return;
                            }
                        }
                    }
                }
                i3++;
            }
            C21565219aU c21565219aU = LLJJIJIL;
            if (childAt == null) {
                return;
            }
            childAt.setOutlineProvider(c21565219aU);
            childAt.setClipToOutline(true);
        }
    }

    public final void LJIL(C21673319rv c21673319rv) {
        C21677719sd c21677719sd = this.LLJJIJI;
        if (c21673319rv == null) {
            c21677719sd.getClass();
            return;
        }
        int childCount = c21677719sd.LIZ.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c21677719sd.LIZ.getChildAt(i);
            if (childAt != null && c21677719sd.LIZ(c21677719sd.LIZ.getItemViewType(childAt)) && c21677719sd.LIZ.getDecoratedTop(childAt) <= 0) {
                c21677719sd.LIZ.removeAndRecycleView(childAt, c21673319rv);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.viewholder.SearchAccurateOffsetGridLayoutManager, com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.SearchGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.LLJJIJI.getClass();
        if (recyclerView != null) {
            recyclerView.setChildDrawingOrderCallback(new InterfaceC1811800xFS() { // from class: X.19sf
                @Override // X.InterfaceC1811800xFS
                public final int LIZ(int i, int i2) {
                    return (i - 1) - i2;
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.views.WrapGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAdapterChanged(AbstractC21673619ry<?> abstractC21673619ry, AbstractC21673619ry<?> abstractC21673619ry2) {
        super.onAdapterChanged(abstractC21673619ry, abstractC21673619ry2);
        this.LLJJIJI.LIZLLL = abstractC21673619ry2;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.viewholder.SearchAccurateOffsetGridLayoutManager, com.ss.android.ugc.aweme.views.WrapGridLayoutManager, androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        if (!this.LLJJIJI.LIZIZ.isEmpty() && getOrientation() == 1) {
            LJIL(c21673319rv);
            super.onLayoutChildren(c21673319rv, c21673919s1);
            LJIJJLI(c21673319rv);
            return;
        }
        super.onLayoutChildren(c21673319rv, c21673919s1);
    }

    public VisualSearchStickyGridLayoutManager(Context context, int i, Map map) {
        super(context, i);
        this.LLJJIJIIJIL = C679470Qkz.LLILLL;
        this.LLJJIJI = new C21677719sd(this, map);
    }

    @Override // com.ss.android.ugc.aweme.views.WrapGridLayoutManager, androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        if (this.LLJJIJI.LIZIZ.isEmpty()) {
            return super.scrollVerticallyBy(i, c21673319rv, c21673919s1);
        }
        LJIL(c21673319rv);
        int iScrollVerticallyBy = super.scrollVerticallyBy(i, c21673319rv, c21673919s1);
        LJIJJLI(c21673319rv);
        return iScrollVerticallyBy;
    }
}
