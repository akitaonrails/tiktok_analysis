package com.ss.android.ugc.aweme.setting.unit.privacy;

import X.C1070540dxs;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class FindCtxViewModel extends ViewModel {
    public boolean LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public final MutableLiveData<C1070540dxs> LLILZ = new MutableLiveData<>();
    public final MutableLiveData<C1070540dxs> LLILZIL = new MutableLiveData<>();
    public final MutableLiveData<C1070540dxs> LLILZLL = new MutableLiveData<>();

    public final void vQ2(C1070540dxs c1070540dxs) {
        if (Intrinsics.LJFF(c1070540dxs.LIZ, "contact")) {
            this.LLILZ.postValue(c1070540dxs);
        }
        if (Intrinsics.LJFF(c1070540dxs.LIZ, "facebook")) {
            this.LLILZIL.postValue(c1070540dxs);
        }
        if (Intrinsics.LJFF(c1070540dxs.LIZ, "mlbb")) {
            this.LLILZLL.postValue(c1070540dxs);
        }
    }
}
