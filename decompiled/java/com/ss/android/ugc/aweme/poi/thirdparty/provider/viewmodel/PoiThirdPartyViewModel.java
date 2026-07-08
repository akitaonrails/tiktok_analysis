package com.ss.android.ugc.aweme.poi.thirdparty.provider.viewmodel;

import X.EnumC1892960zMM;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* JADX INFO: loaded from: classes29.dex */
public final class PoiThirdPartyViewModel extends ViewModel {
    public final MutableLiveData<EnumC1892960zMM> LL;
    public final MutableLiveData LLILLJJLI;
    public final MutableLiveData<String> LLILLL;
    public Integer LLILZ;
    public String LLILZIL;
    public Integer LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;

    public PoiThirdPartyViewModel() {
        MutableLiveData<EnumC1892960zMM> mutableLiveData = new MutableLiveData<>();
        this.LL = mutableLiveData;
        this.LLILLJJLI = mutableLiveData;
        this.LLILLL = new MutableLiveData<>();
        new MutableLiveData();
    }

    public final void vQ2(EnumC1892960zMM enumC1892960zMM) {
        this.LL.setValue(enumC1892960zMM);
    }
}
