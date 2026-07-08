package com.ss.android.ugc.aweme.feed.widget;

import X.AbstractC1616220sA0;
import X.C04U7;
import X.C1581900rGe;
import X.C1A5L;
import X.C21610619ho;
import X.C2188811AlT;
import X.C2271381DvM;
import X.C2271391DvN;
import X.InterfaceC1581890rGd;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.crash.Npth;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes25.dex */
public class FeedSwipeRefreshLayout extends C21610619ho implements InterfaceC1581890rGd {
    public final C1581900rGe LLLIIII;
    public final Boolean LLLIIIIL;
    public AbstractC1616220sA0 LLLIIIL;
    public boolean LLLIIL;
    public RecyclerView LLLIILIL;

    public FeedSwipeRefreshLayout() {
        throw null;
    }

    public final boolean LJIIJJI() {
        if (!this.LLLIIL) {
            return false;
        }
        AbstractC1616220sA0 abstractC1616220sA0 = this.LLLIIIL;
        if (abstractC1616220sA0 != null && abstractC1616220sA0.getAdapter() != null && this.LLLIIIL.getAdapter().getCount() != 0 && this.LLLIIIL.getCurrentItem() != 0) {
            return false;
        }
        RecyclerView recyclerView = this.LLLIILIL;
        return recyclerView == null || ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zLJI = MethodIDManager.LJI(72012);
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return zDispatchTouchEvent;
    }

    @Override // X.C21610619ho, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (LJIIJJI() && super.onInterceptTouchEvent(motionEvent)) {
            if (this.LLLIIIIL.booleanValue()) {
                AbstractC1616220sA0 abstractC1616220sA0 = this.LLLIIIL;
                if (abstractC1616220sA0 == null) {
                    this.LLLIIII.LJIIIZ("FeedSwipeRefreshLayout mViewPager is null");
                } else {
                    if (abstractC1616220sA0.getAdapter() == null) {
                        C1581900rGe c1581900rGe = this.LLLIIII;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("FeedSwipeRefreshLayout mViewPager.getAdapter() is null");
                        sbLIZ.append(this.LLLIIIL);
                        c1581900rGe.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
                        return true;
                    }
                    if (this.LLLIIIL.getAdapter().getCount() == 0) {
                        C1581900rGe c1581900rGe2 = this.LLLIIII;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("FeedSwipeRefreshLayout mViewPager.getAdapter().getCount() == 0");
                        sbLIZ2.append(this.LLLIIIL);
                        c1581900rGe2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
                        return true;
                    }
                    if (this.LLLIIIL.getCurrentItem() == 0) {
                        C1581900rGe c1581900rGe3 = this.LLLIIII;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("FeedSwipeRefreshLayout mViewPager.getCurrentItem() == 0");
                        sbLIZ3.append(this.LLLIIIL);
                        c1581900rGe3.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ3));
                        return true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // X.C21610619ho, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (LJIIJJI() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1581890rGd
    public void setCanTouch(boolean z) {
        this.LLLIIL = z;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.LLLIILIL = recyclerView;
    }

    @Override // X.InterfaceC1581890rGd
    public void setViewPager(AbstractC1616220sA0 abstractC1616220sA0) {
        if (this.LLLIIIIL.booleanValue()) {
            C1581900rGe c1581900rGe = this.LLLIIII;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("FeedSwipeRefreshLayout setViewPager ");
            sbLIZ.append(abstractC1616220sA0);
            c1581900rGe.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
            if (abstractC1616220sA0 == null) {
                Npth.reportBizException("FeedSwipeRefreshLayout", new Throwable("FeedSwipeRefreshLayout setViewPager is null"), "FeedSwipeRefreshLayout setViewPager is null", (Map<String, String>) new HashMap(), true);
            }
        }
        this.LLLIIIL = abstractC1616220sA0;
    }

    public FeedSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLLIIII = new C1581900rGe("FeedSwipeRefreshLayout");
        this.LLLIIIIL = Boolean.valueOf(((Boolean) C04U7.LIZ.getValue()).booleanValue());
        this.LLLIIL = true;
        C2271391DvN.LIZ(this, (C1A5L) C2271381DvM.LJJI.getValue());
    }
}
