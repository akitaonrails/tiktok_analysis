package com.ss.android.ugc.aweme.ecommerce.search.suggest.vm;

import X.C01GW;
import X.C1935207i2;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchIntermediateViewModelNew extends ViewModel {
    public boolean LLILZIL;
    public final C01GW LL = C1935207i2.LIZ(AFwS196S0000000_10.get$arr$(112));
    public final C01GW LLILLJJLI = C1935207i2.LIZ(AFwS196S0000000_10.get$arr$(114));
    public final C01GW LLILLL = C1935207i2.LIZ(AFwS196S0000000_10.get$arr$(115));
    public final C01GW LLILZ = C1935207i2.LIZ(AFwS196S0000000_10.get$arr$(113));
    public final C01GW LLILZLL = C1935207i2.LIZ(AFwS196S0000000_10.get$arr$(111));

    public final NextLiveData<Integer> vQ2() {
        return (NextLiveData) this.LL.getValue();
    }

    public final NextLiveData<SearchResultParam> wQ2() {
        return (NextLiveData) this.LLILLJJLI.getValue();
    }
}
