package com.ss.android.ugc.aweme.search.pages.middlepage.core.viewmodel;

import X.C01GW;
import X.C1935507i5;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchIntermediateViewModelNew extends ViewModel {
    public boolean LLILZ;
    public Boolean LLIZ;
    public final C01GW LL = C1935507i5.LIZ(AFwS196S0000000_10.get$arr$(273));
    public final C01GW LLILLJJLI = C1935507i5.LIZ(AFwS196S0000000_10.get$arr$(274));
    public final C01GW LLILLL = C1935507i5.LIZ(AFwS196S0000000_10.get$arr$(276));
    public final C01GW LLILZIL = C1935507i5.LIZ(AFwS196S0000000_10.get$arr$(272));
    public final C01GW LLILZLL = C1935507i5.LIZ(AFwS196S0000000_10.get$arr$(275));

    public final NextLiveData<Integer> vQ2() {
        return (NextLiveData) this.LL.getValue();
    }

    public final NextLiveData<SearchResultParam> wQ2() {
        return (NextLiveData) this.LLILLJJLI.getValue();
    }
}
