package com.bytedance.effectcreatormobile.infrastructure.ui.view;

import X.AbstractC21674019s2;
import X.C01GW;
import X.C21673919s1;
import X.C452501pT;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class CenterLayoutManager extends LinearLayoutManager {
    public final Context LL;
    public final boolean LLILLJJLI;
    public final C01GW LLILLL;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return super.canScrollHorizontally() && this.LLILLJJLI;
    }

    public CenterLayoutManager(Context context) {
        super(context, 0, false);
        this.LL = context;
        this.LLILLJJLI = true;
        this.LLILLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 19));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
        ((AbstractC21674019s2) this.LLILLL.getValue()).LIZ = i;
        startSmoothScroll((AbstractC21674019s2) this.LLILLL.getValue());
    }
}
