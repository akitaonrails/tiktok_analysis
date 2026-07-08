package com.ss.android.ugc.feed.platform.performance;

import X.C01GW;
import X.C1566360qra;
import X.C1566370qrb;
import X.C452501pT;
import X.InterfaceC1565950qqv;
import androidx.lifecycle.ViewModel;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes25.dex */
public final class ScopePerformanceVM extends ViewModel {
    public static final /* synthetic */ int LLILLL = 0;
    public final C01GW LL = C452501pT.LIZIZ(new C1566360qra());
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C1566370qrb());

    public final List<InterfaceC1565950qqv> vQ2() {
        return (List) this.LLILLJJLI.getValue();
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((ConcurrentHashMap) this.LL.getValue()).clear();
        vQ2().clear();
    }
}
