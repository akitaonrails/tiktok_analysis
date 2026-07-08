package com.ss.android.ugc.aweme.search.pages.core.viewmodel;

import X.C01GW;
import X.C452501pT;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class ScreenSpecsViewModel extends ViewModel {
    public final C01GW LL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(267));

    public final MutableLiveData<Unit> vQ2() {
        return (MutableLiveData) this.LL.getValue();
    }

    public final void LJJLIIIIJ() {
        vQ2().postValue(Unit.LIZ);
    }
}
