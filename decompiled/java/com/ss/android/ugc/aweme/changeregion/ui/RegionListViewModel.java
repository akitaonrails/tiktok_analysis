package com.ss.android.ugc.aweme.changeregion.ui;

import X.C11JF;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.changeregion.sdk.model.Country;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class RegionListViewModel extends ViewModel {
    public final MutableLiveData<List<Country>> LL = new MutableLiveData<>();
    public final MutableLiveData<String> LLILLJJLI = new MutableLiveData<>();
    public C11JF LLILLL;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        C11JF c11jf = this.LLILLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        super.onCleared();
    }
}
