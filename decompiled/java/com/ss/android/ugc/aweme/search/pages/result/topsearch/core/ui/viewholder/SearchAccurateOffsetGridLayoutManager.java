package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.viewholder;

import X.AbstractC21673619ry;
import X.C0BRC;
import X.C0P5O;
import X.C0PVB;
import X.C21673319rv;
import X.C21673919s1;
import X.C21681919tJ;
import X.C2188811AlT;
import X.C272290Aln;
import X.C823050WQl;
import Y.ARunnableS109S0100000_9;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.SearchGridLayoutManager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class SearchAccurateOffsetGridLayoutManager extends SearchGridLayoutManager {
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public List<Integer> LLJILLL;
    public RecyclerView LLJJ;
    public boolean LLJJI;
    public final Map<Integer, Integer> LLJJIII;

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollOffset(C21673919s1 c21673919s1) {
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iIntValue;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        if (!C0BRC.LIZ()) {
            return super.computeVerticalScrollOffset(c21673919s1);
        }
        int i2 = 0;
        if (getChildCount() == 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (childAt == null) {
            return super.computeVerticalScrollOffset(c21673919s1);
        }
        int position = getPosition(childAt);
        int decoratedTop = getDecoratedTop(childAt);
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            i = marginLayoutParams2.topMargin;
        } else {
            i = 0;
        }
        int i3 = decoratedTop - i;
        int paddingTop = (-i3) + getPaddingTop();
        for (int i4 = 0; i4 < position; i4++) {
            Integer num = (Integer) ((LinkedHashMap) this.LLJJIII).get(Integer.valueOf(i4));
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            paddingTop += iIntValue;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("computeVerticalScrollOffset, scrolledY = ");
        sbLIZ.append(paddingTop);
        sbLIZ.append(", paddingTop = ");
        sbLIZ.append(getPaddingTop());
        sbLIZ.append(", topYOfFirstChild = ");
        sbLIZ.append(i3);
        sbLIZ.append(", firstChild.marginTop = ");
        ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            i2 = marginLayoutParams.topMargin;
        }
        sbLIZ.append(i2);
        sbLIZ.append(", topYOfFirstChild = ");
        sbLIZ.append(getDecoratedTop(childAt));
        C2188811AlT.LIZIZ(sbLIZ);
        return paddingTop;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.SearchGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.LLJJ = recyclerView;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutCompleted(C21673919s1 c21673919s1) {
        int i;
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i3;
        int i4;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        super.onLayoutCompleted(c21673919s1);
        if (!C0BRC.LIZ()) {
            return;
        }
        int iFindFirstVisibleItemPosition = findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition >= 0 && iFindLastVisibleItemPosition >= 0 && iFindLastVisibleItemPosition >= iFindFirstVisibleItemPosition) {
            if (((Boolean) C272290Aln.LIZ.getValue()).booleanValue()) {
                for (int i5 = iFindFirstVisibleItemPosition; i5 < iFindLastVisibleItemPosition; i5++) {
                    View childAt = getChildAt(i5 - iFindFirstVisibleItemPosition);
                    if (childAt != null) {
                        if (((C21681919tJ) childAt.getLayoutParams()).LL == 0) {
                            Map<Integer, Integer> map = this.LLJJIII;
                            Integer numValueOf = Integer.valueOf(i5);
                            int decoratedMeasuredHeight = getDecoratedMeasuredHeight(childAt);
                            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                                i3 = marginLayoutParams4.topMargin;
                            } else {
                                i3 = 0;
                            }
                            int i6 = decoratedMeasuredHeight + i3;
                            ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                                i4 = marginLayoutParams3.bottomMargin;
                            } else {
                                i4 = 0;
                            }
                            map.put(numValueOf, Integer.valueOf(i6 + i4));
                        } else {
                            this.LLJJIII.put(Integer.valueOf(i5), 0);
                        }
                    }
                }
                return;
            }
            while (iFindFirstVisibleItemPosition < iFindLastVisibleItemPosition) {
                View childAt2 = getChildAt(iFindFirstVisibleItemPosition);
                if (childAt2 != null) {
                    if (((C21681919tJ) childAt2.getLayoutParams()).LL == 0) {
                        Map<Integer, Integer> map2 = this.LLJJIII;
                        Integer numValueOf2 = Integer.valueOf(iFindFirstVisibleItemPosition);
                        int decoratedMeasuredHeight2 = getDecoratedMeasuredHeight(childAt2);
                        ViewGroup.LayoutParams layoutParams3 = childAt2.getLayoutParams();
                        if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                            i = marginLayoutParams2.topMargin;
                        } else {
                            i = 0;
                        }
                        int i7 = decoratedMeasuredHeight2 + i;
                        ViewGroup.LayoutParams layoutParams4 = childAt2.getLayoutParams();
                        if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                            i2 = marginLayoutParams.bottomMargin;
                        } else {
                            i2 = 0;
                        }
                        map2.put(numValueOf2, Integer.valueOf(i7 + i2));
                    } else {
                        this.LLJJIII.put(Integer.valueOf(iFindFirstVisibleItemPosition), 0);
                    }
                }
                iFindFirstVisibleItemPosition++;
            }
        }
    }

    public SearchAccurateOffsetGridLayoutManager(Context context, int i) {
        super(i, 1, context, false);
        this.LLJILJIL = true;
        this.LLJJIII = new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.views.WrapGridLayoutManager, androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        AbstractC21673619ry adapter;
        RecyclerView.ViewHolder viewHolderFindViewHolderForLayoutPosition;
        C0PVB c0pvb;
        try {
            if (this.LLJILJILJ) {
                C0P5O.LIZ.getClass();
                if (C0P5O.LIZ().enableManualDiff == 1) {
                    if (!this.LLJILJIL) {
                        return;
                    }
                    this.LLJILJIL = false;
                    int iFindLastVisibleItemPosition = findLastVisibleItemPosition();
                    RecyclerView recyclerView = this.LLJJ;
                    AbstractC21673619ry<RecyclerView.ViewHolder> abstractC21673619ry = null;
                    if (recyclerView != null) {
                        adapter = recyclerView.getAdapter();
                    } else {
                        adapter = null;
                    }
                    if ((adapter instanceof C0PVB) && (c0pvb = (C0PVB) adapter) != null) {
                        abstractC21673619ry = c0pvb.LL;
                    }
                    if (iFindLastVisibleItemPosition >= 0) {
                        int i = 0;
                        while (true) {
                            RecyclerView recyclerView2 = this.LLJJ;
                            if (recyclerView2 != null && (viewHolderFindViewHolderForLayoutPosition = recyclerView2.findViewHolderForLayoutPosition(i)) != null) {
                                List<Integer> list = this.LLJILLL;
                                if (list != null && list.contains(Integer.valueOf(i))) {
                                    if (this.LLJJI && i == 0 && (viewHolderFindViewHolderForLayoutPosition instanceof SearchVideoHolder)) {
                                        C823050WQl.LIZJ().execute(new ARunnableS109S0100000_9((SearchVideoHolder) viewHolderFindViewHolderForLayoutPosition, 212));
                                    }
                                    if (abstractC21673619ry != null) {
                                        abstractC21673619ry.onViewAttachedToWindow(viewHolderFindViewHolderForLayoutPosition);
                                    }
                                } else if (abstractC21673619ry != null) {
                                    abstractC21673619ry.onBindViewHolder(viewHolderFindViewHolderForLayoutPosition, i);
                                    abstractC21673619ry.onViewAttachedToWindow(viewHolderFindViewHolderForLayoutPosition);
                                }
                            }
                            if (i != iFindLastVisibleItemPosition) {
                                i++;
                            } else {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
            super.onLayoutChildren(c21673319rv, c21673919s1);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            super.onLayoutChildren(c21673319rv, c21673919s1);
        }
    }
}
