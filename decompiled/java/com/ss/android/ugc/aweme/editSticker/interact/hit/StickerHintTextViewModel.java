package com.ss.android.ugc.aweme.editSticker.interact.hit;

import X.C122B;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* JADX INFO: loaded from: classes30.dex */
public final class StickerHintTextViewModel extends ViewModel {
    public MutableLiveData<Boolean> LL;
    public MutableLiveData<C122B> LLILLJJLI;

    public final MutableLiveData<Boolean> vQ2() {
        if (this.LL == null) {
            this.LL = new MutableLiveData<>();
        }
        return this.LL;
    }

    public final MutableLiveData<C122B> wQ2() {
        if (this.LLILLJJLI == null) {
            this.LLILLJJLI = new MutableLiveData<>();
        }
        return this.LLILLJJLI;
    }
}
