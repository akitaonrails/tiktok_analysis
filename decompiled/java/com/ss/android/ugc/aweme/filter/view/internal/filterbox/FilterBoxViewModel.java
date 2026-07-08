package com.ss.android.ugc.aweme.filter.view.internal.filterbox;

import X.C11JL;
import X.C11S5;
import X.C1639800sm2;
import X.C1639880smA;
import X.C1701940uOG;
import X.EnumC1642120spm;
import X.InterfaceC1642140spo;
import X.InterfaceC1642150spp;
import X.InterfaceC1642160spq;
import X.InterfaceC1642570sqV;
import Y.AfS194S0100000_25;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import kotlin.Pair;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class FilterBoxViewModel extends HumbleViewModel implements InterfaceC1642570sqV {
    public final InterfaceC1642160spq LL;
    public final InterfaceC1642150spp LLILLJJLI;
    public final MutableLiveData<Pair<EnumC1642120spm, C1639800sm2>> LLILLL;
    public C11JL LLILZ;
    public InterfaceC1642140spo LLILZIL;

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        C11JL c11jl = this.LLILZ;
        if (c11jl != null) {
            c11jl.dispose();
        }
        this.LLILZ = null;
    }

    @Override // X.InterfaceC1642570sqV
    public final void refreshData() {
        C11JL c11jl = this.LLILZ;
        if (c11jl != null) {
            c11jl.dispose();
        }
        this.LLILZ = null;
        this.LLILZIL = null;
        if (isDestroyed()) {
            return;
        }
        this.LLILLL.setValue(new Pair<>(EnumC1642120spm.LOADING, null));
        this.LLILZ = (C11JL) this.LLILLJJLI.edit().LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS194S0100000_25(this, 3), new AfS194S0100000_25(this, 4));
    }

    @Override // X.InterfaceC1642570sqV
    public final void Df(AwS569S0100000_25 awS569S0100000_25) {
        InterfaceC1642140spo interfaceC1642140spo = this.LLILZIL;
        if (interfaceC1642140spo != null) {
            interfaceC1642140spo.Df(awS569S0100000_25);
        }
    }

    @Override // X.InterfaceC1642570sqV
    public final void Jb0(C1639880smA c1639880smA) {
        InterfaceC1642140spo interfaceC1642140spo = this.LLILZIL;
        if (interfaceC1642140spo != null) {
            interfaceC1642140spo.Ef(c1639880smA);
        }
    }

    @Override // X.InterfaceC1642570sqV
    public final void iJ0(C1639880smA c1639880smA) {
        InterfaceC1642140spo interfaceC1642140spo = this.LLILZIL;
        if (interfaceC1642140spo != null) {
            interfaceC1642140spo.Gf(c1639880smA);
        }
    }

    public FilterBoxViewModel(LifecycleOwner lifecycleOwner, InterfaceC1642160spq interfaceC1642160spq, InterfaceC1642150spp interfaceC1642150spp) {
        super(lifecycleOwner);
        this.LL = interfaceC1642160spq;
        this.LLILLJJLI = interfaceC1642150spp;
        this.LLILLL = new MutableLiveData<>();
    }
}
