package com.ss.android.ugc.aweme.search.pages.result.common.core.ui;

import X.C21673319rv;
import X.C21673919s1;
import android.content.Context;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchUserLinearLayoutManager extends WrapLinearLayoutManager {
    public static long LLILZ = -1;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return false;
    }

    public SearchUserLinearLayoutManager(Context context) {
        super(context);
    }

    @Override // com.ss.android.ugc.aweme.views.WrapLinearLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        boolean zLJI = MethodIDManager.LJI(196685);
        long jCurrentTimeMillis = System.currentTimeMillis();
        super.onLayoutChildren(c21673319rv, c21673919s1);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        long j = LLILZ;
        if (jCurrentTimeMillis2 < j) {
            jCurrentTimeMillis2 = j;
        }
        LLILZ = jCurrentTimeMillis2;
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
