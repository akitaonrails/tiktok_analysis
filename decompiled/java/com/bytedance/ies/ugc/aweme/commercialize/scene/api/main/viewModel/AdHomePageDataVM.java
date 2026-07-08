package com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel;

import X.C1030680cva;
import X.C740360T2k;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* JADX INFO: loaded from: classes17.dex */
public final class AdHomePageDataVM extends ViewModel {
    public static final /* synthetic */ int LLILZLL = 0;
    public boolean LL;
    public final MutableLiveData<C740360T2k> LLILLJJLI = new MutableLiveData<>();
    public final MutableLiveData<Float> LLILLL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLILZ = new MutableLiveData<>();
    public boolean LLILZIL;

    public final boolean wQ2() {
        C740360T2k value = this.LLILLJJLI.getValue();
        return (value == null || value.LIZ == 4 || C1030680cva.LJIJ(value.LIZIZ)) ? false : true;
    }
}
