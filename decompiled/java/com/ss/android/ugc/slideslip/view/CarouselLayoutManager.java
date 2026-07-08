package com.ss.android.ugc.slideslip.view;

import X.AbstractC21674019s2;
import X.C01GW;
import X.C21673919s1;
import X.C452501pT;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class CarouselLayoutManager extends LinearLayoutManager {
    public final Function0<Float> LL;
    public final Context LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public final C01GW LLILZIL;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return !this.LLILZ && this.LLILLL && super.canScrollHorizontally();
    }

    public CarouselLayoutManager(Context context, AwS560S0100000_16 awS560S0100000_16, boolean z) {
        super(context, 0, z);
        this.LL = awS560S0100000_16;
        this.LLILLJJLI = context;
        this.LLILLL = true;
        this.LLILZIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 734));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
        ((AbstractC21674019s2) this.LLILZIL.getValue()).LIZ = i;
        startSmoothScroll((AbstractC21674019s2) this.LLILZIL.getValue());
    }
}
