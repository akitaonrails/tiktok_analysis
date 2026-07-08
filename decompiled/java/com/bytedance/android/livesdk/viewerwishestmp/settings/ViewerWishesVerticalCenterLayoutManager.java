package com.bytedance.android.livesdk.viewerwishestmp.settings;

import X.C21673919s1;
import X.C2189511Amb;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes34.dex */
public final class ViewerWishesVerticalCenterLayoutManager extends LinearLayoutManager {
    public final boolean LL;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        if (this.LL) {
            return super.canScrollVertically();
        }
        return false;
    }

    public ViewerWishesVerticalCenterLayoutManager(Context context) {
        super(context, 1, false);
        this.LL = true;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
        super.smoothScrollToPosition(recyclerView, c21673919s1, i);
        C2189511Amb c2189511Amb = new C2189511Amb(recyclerView.getContext(), 1);
        c2189511Amb.LIZ = i;
        startSmoothScroll(c2189511Amb);
    }
}
