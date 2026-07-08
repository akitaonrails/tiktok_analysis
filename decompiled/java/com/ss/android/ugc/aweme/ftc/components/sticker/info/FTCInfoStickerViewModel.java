package com.ss.android.ugc.aweme.ftc.components.sticker.info;

import X.C1452730nuJ;
import X.C1453160nv0;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* JADX INFO: loaded from: classes30.dex */
public class FTCInfoStickerViewModel extends ViewModel {
    public MutableLiveData<C1452730nuJ> LL;
    public MutableLiveData<C1453160nv0> LLILLJJLI;
    public MutableLiveData<Boolean> LLILLL;
    public MutableLiveData<Boolean> LLILZ;

    public final MutableLiveData<C1453160nv0> vQ2() {
        if (this.LLILLJJLI == null) {
            this.LLILLJJLI = new MutableLiveData<>();
        }
        return this.LLILLJJLI;
    }

    public final MutableLiveData<C1452730nuJ> vW1() {
        if (this.LL == null) {
            this.LL = new MutableLiveData<>();
        }
        return this.LL;
    }
}
