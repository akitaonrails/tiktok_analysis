package com.ss.android.ugc.aweme.series.feed.tab.toptab;

import X.C01GW;
import X.C11NJ;
import X.C1567820qtw;
import X.C1573070r2P;
import X.C452501pT;
import X.C622680Oba;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesTopTabVM extends ViewModel {
    public C1573070r2P LLILLL;
    public final MutableLiveData<C1567820qtw<Boolean>> LL = new MutableLiveData<>(null);
    public final C11NJ LLILLJJLI = new C11NJ();
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(305));

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LLILLJJLI.dispose();
        C1573070r2P c1573070r2P = this.LLILLL;
        if (c1573070r2P != null) {
            C622680Oba.LIZLLL(c1573070r2P);
        }
        super.onCleared();
    }
}
