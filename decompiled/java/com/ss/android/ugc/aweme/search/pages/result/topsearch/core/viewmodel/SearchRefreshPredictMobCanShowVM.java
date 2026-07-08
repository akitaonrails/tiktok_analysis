package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel;

import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class SearchRefreshPredictMobCanShowVM extends ViewModel {
    public static final /* synthetic */ int LLILZ = 0;
    public final MutableLiveData<Boolean> LL;
    public final MutableLiveData LLILLJJLI;
    public Boolean LLILLL;

    public final boolean a32() {
        return Intrinsics.LJFF(this.LLILLJJLI.getValue(), Boolean.TRUE);
    }

    public SearchRefreshPredictMobCanShowVM() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(Boolean.TRUE);
        this.LL = mutableLiveData;
        this.LLILLJJLI = mutableLiveData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void vQ2(boolean z) {
        this.LLILLL = (Boolean) this.LLILLJJLI.getValue();
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            this.LL.setValue(Boolean.valueOf(z));
        } else {
            this.LL.postValue(Boolean.valueOf(z));
        }
    }
}
