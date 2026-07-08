package com.ss.android.ugc.aweme.prop.presenter;

import X.AbstractC318560CeE;
import X.AbstractC318590CeH;
import X.C0CVP;
import X.C23250099c;
import X.C560530Lyd;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;

/* JADX INFO: loaded from: classes5.dex */
public final class MobileEffectViewModel extends ViewModel {
    public boolean LL;
    public boolean LLILLJJLI;
    public final C560530Lyd<AbstractC318590CeH> LLILLL;
    public final C560530Lyd LLILZ;
    public final MutableLiveData<AbstractC318560CeE> LLILZIL;
    public final MutableLiveData LLILZLL;
    public final MutableLiveData<Boolean> LLIZ;
    public final MutableLiveData LLIZLLLIL;

    public MobileEffectViewModel() {
        C560530Lyd<AbstractC318590CeH> c560530Lyd = new C560530Lyd<>();
        this.LLILLL = c560530Lyd;
        this.LLILZ = c560530Lyd;
        MutableLiveData<AbstractC318560CeE> mutableLiveData = new MutableLiveData<>();
        this.LLILZIL = mutableLiveData;
        this.LLILZLL = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.LLIZ = mutableLiveData2;
        this.LLIZLLLIL = mutableLiveData2;
    }

    public final void vQ2(boolean z) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C0CVP(this, z, null), 3);
    }
}
