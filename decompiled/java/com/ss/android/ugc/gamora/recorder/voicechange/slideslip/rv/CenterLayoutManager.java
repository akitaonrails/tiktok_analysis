package com.ss.android.ugc.gamora.recorder.voicechange.slideslip.rv;

import X.C1664110tPF;
import X.C21673919s1;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes26.dex */
public final class CenterLayoutManager extends LinearLayoutManager {
    public final Context LL;

    public CenterLayoutManager(Context context) {
        super(context, 0, false);
        this.LL = context;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
        C1664110tPF c1664110tPF = new C1664110tPF(this.LL);
        c1664110tPF.LJIILLIIL = ((Number) c1664110tPF.LJIILL.getValue()).floatValue() / 0.4f;
        c1664110tPF.LIZ = i;
        startSmoothScroll(c1664110tPF);
    }
}
