package com.ss.android.ugc.tools.infosticker.view.internal.main;

import X.AbstractC1634360sdG;
import X.C11NJ;
import X.C11S5;
import X.C1465200oEQ;
import X.C1701940uOG;
import X.EnumC1641470soj;
import X.InterfaceC1633960scc;
import X.InterfaceC1636810shD;
import Y.AfS194S0100000_25;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
public final class InfoStickerListMetaViewModel extends HumbleViewModel implements InterfaceC1636810shD {
    public final InterfaceC1633960scc LL;
    public final boolean LLILLJJLI;
    public final C11NJ LLILLL;
    public final MutableLiveData<List<AbstractC1634360sdG>> LLILZ;
    public final MutableLiveData LLILZIL;
    public final MutableLiveData<EnumC1641470soj> LLILZLL;
    public final MutableLiveData LLIZ;

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC1636810shD
    public final void Ur1() {
        if (isDestroyed()) {
            return;
        }
        EnumC1641470soj value = this.LLILZLL.getValue();
        if (value == null || value != EnumC1641470soj.LOADING) {
            this.LLILZLL.setValue(EnumC1641470soj.LOADING);
            this.LLILLL.LIZ(this.LL.LIZIZ(this.LLILLJJLI).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS194S0100000_25(this, 117), new AfS194S0100000_25(this, 118)));
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLILLL.LJ();
    }

    @Override // X.InterfaceC1636810shD
    public final LiveData<EnumC1641470soj> LJJIJ() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1636810shD
    public final MutableLiveData uJ0() {
        return this.LLILZIL;
    }

    public InfoStickerListMetaViewModel(C1465200oEQ c1465200oEQ, InterfaceC1633960scc interfaceC1633960scc, boolean z) {
        super(c1465200oEQ);
        this.LL = interfaceC1633960scc;
        this.LLILLJJLI = z;
        this.LLILLL = new C11NJ();
        MutableLiveData<List<AbstractC1634360sdG>> mutableLiveData = new MutableLiveData<>();
        this.LLILZ = mutableLiveData;
        this.LLILZIL = mutableLiveData;
        MutableLiveData<EnumC1641470soj> mutableLiveData2 = new MutableLiveData<>();
        this.LLILZLL = mutableLiveData2;
        this.LLIZ = mutableLiveData2;
    }
}
