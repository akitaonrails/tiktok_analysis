package com.ss.android.ugc.aweme.shortvideo.mvtemplate.widget;

import X.C21673919s1;
import X.C2189511Amb;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes34.dex */
public final class HorizontalCenterLayoutManager extends LinearLayoutManager {
    public HorizontalCenterLayoutManager(Context context) {
        super(context, 0, false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
        super.smoothScrollToPosition(recyclerView, c21673919s1, i);
        C2189511Amb c2189511Amb = new C2189511Amb(recyclerView.getContext(), 2);
        c2189511Amb.LIZ = i;
        startSmoothScroll(c2189511Amb);
    }
}
