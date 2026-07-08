package com.ss.android.ugc.aweme.arch.widgets.base;

import X.C2487409ou;
import X.C786410Ut5;
import Y.ARunnableS88S0200000_19;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ChangeLiveData<T> extends NextLiveData<T> {
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData, androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void postValue(T t) {
        if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
            setValue(t);
        } else {
            C2487409ou.LIZJ(new ARunnableS88S0200000_19(this, t, 6));
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData, androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void setValue(T t) {
        if (!Intrinsics.LJFF(getValue(), t)) {
            super.setValue(t);
        }
    }
}
