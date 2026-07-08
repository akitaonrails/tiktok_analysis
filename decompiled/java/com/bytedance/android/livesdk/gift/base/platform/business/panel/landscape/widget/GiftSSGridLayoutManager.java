package com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget;

import X.C1128590fTV;
import X.C21673319rv;
import X.C21673919s1;
import Y.ARunnableS117S0100000_17;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.android.livesdk.chatroom.ui.SSGridLayoutManager;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftSSGridLayoutManager extends SSGridLayoutManager {
    public final Runnable LLJ;
    public final boolean LLJI;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return super.canScrollHorizontally() && this.LLJI;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return super.canScrollVertically() && this.LLJI;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutCompleted(C21673919s1 c21673919s1) {
        Runnable runnable;
        super.onLayoutCompleted(c21673919s1);
        int iFindFirstVisibleItemPosition = findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition >= 0 && iFindLastVisibleItemPosition >= 0 && iFindLastVisibleItemPosition >= iFindFirstVisibleItemPosition && (runnable = this.LLJ) != null) {
            runnable.run();
        }
    }

    public GiftSSGridLayoutManager(Context context, ARunnableS117S0100000_17 aRunnableS117S0100000_17) {
        super(2, 0, context);
        this.LLJ = aRunnableS117S0100000_17;
        this.LLJI = true;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.SSGridLayoutManager, androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        if (C1128590fTV.LJIILIIL == 0) {
            C1128590fTV.LJIILIIL = SystemClock.uptimeMillis();
        }
        super.onLayoutChildren(c21673319rv, c21673919s1);
        if (C1128590fTV.LJIILJJIL == 0) {
            C1128590fTV.LJIILJJIL = SystemClock.uptimeMillis();
        }
    }
}
