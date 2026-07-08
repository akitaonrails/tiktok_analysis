package com.ss.android.ugc.aweme.sticker.view.internal.search;

import X.AbstractC1406770miB;
import X.AbstractC1629900sW4;
import X.C090D;
import X.C090E;
import X.C0PEM;
import X.C1629910sW5;
import X.C1629950sW9;
import X.C1633110sbF;
import X.C1701940uOG;
import X.C1DRG;
import X.C23250099c;
import X.InterfaceC1624480sNK;
import X.InterfaceC1625410sOp;
import X.InterfaceC1629850sVz;
import X.InterfaceC1635560sfC;
import X.InterfaceC1636820shE;
import Y.AObserverS121S0300000_3;
import Y.AObserverS225S0100000_22;
import Y.AObserverS227S0100000_25;
import Y.AfS172S0100000_3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import duk.p;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes26.dex */
public class SearchStickerViewModel extends StickerListViewModel implements InterfaceC1636820shE {
    public final MutableLiveData<C1629950sW9> LLJJJIL;
    public final MutableLiveData<Pair<String, List<String>>> LLJJJJ;
    public final MutableLiveData<AbstractC1406770miB> LLJJJJJIL;
    public final MutableLiveData<C090E> LLJJJJLIIL;
    public final MutableLiveData<String> LLJJL;
    public final MutableLiveData<List<String>> LLJJLIIIJLLLLLLLZ;
    public C1633110sbF LLJL;
    public long LLJLIL;
    public final MutableLiveData<Boolean> LLJLILLLLZIIL;
    public final MutableLiveData<String> LLJLL;
    public AbstractC1629900sW4 LLJLLIL;
    public final MutableLiveData LLJLLL;
    public final MutableLiveData LLJZ;
    public final MutableLiveData LLJZIJLIL;
    public final MutableLiveData LLL;
    public final MutableLiveData LLLF;
    public String LLLFF;

    public SearchStickerViewModel() {
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, X.InterfaceC1631540sYi
    public final void XH2(String str) {
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void CQ2() {
        this.LLJLILLLLZIIL.setValue(Boolean.TRUE);
    }

    @Override // X.InterfaceC1636820shE
    public final C1633110sbF Qq0() {
        C1633110sbF c1633110sbF = this.LLJL;
        return c1633110sbF == null ? new C1633110sbF(this.LL.LJJLIIIJJIZ().LIZ, "", 0, null, null, 1978) : c1633110sbF;
    }

    @Override // X.InterfaceC1636820shE
    public final void bJ() {
        this.LLJLL.setValue("");
        this.LLJLLIL = C1629910sW5.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel
    public final InterfaceC1629850sVz<Effect> yQ2() {
        return new InterfaceC1629850sVz<Effect>() { // from class: X.0mlB
            public final HashMap<String, Integer> LIZ = new HashMap<>();

            @Override // X.InterfaceC1629850sVz
            public final int Gp(Effect effect) {
                Integer num;
                Effect effect2 = effect;
                if (effect2 != null && (num = this.LIZ.get(effect2.getId())) != null) {
                    return num.intValue();
                }
                return -1;
            }

            @Override // X.InterfaceC1629850sVz
            public final void LIZ(int i, List list) {
                if (list.isEmpty()) {
                    this.LIZ.clear();
                    return;
                }
                int i2 = 0;
                for (Object obj : list) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        this.LIZ.put(((Effect) obj).getId(), Integer.valueOf(i2 + i));
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        };
    }

    @Override // X.InterfaceC1636820shE
    public final AbstractC1629900sW4 a02() {
        return this.LLJLLIL;
    }

    @Override // X.InterfaceC1636820shE
    public final MutableLiveData eJ1() {
        return this.LLJZ;
    }

    @Override // X.InterfaceC1636820shE
    public final MutableLiveData gB0() {
        return this.LLJZIJLIL;
    }

    @Override // X.InterfaceC1636820shE
    public final String getHost() {
        return this.LLLFF;
    }

    @Override // X.InterfaceC1636820shE
    public final /* bridge */ /* synthetic */ MutableLiveData getKeyword() {
        return this.LLJLL;
    }

    @Override // X.InterfaceC1636820shE
    public final MutableLiveData n02() {
        return this.LLJLLL;
    }

    @Override // X.InterfaceC1636820shE
    public final MutableLiveData nQ() {
        return this.LLL;
    }

    @Override // X.InterfaceC1636820shE
    public final LiveData<List<String>> qZ() {
        return this.LLLF;
    }

    @Override // X.InterfaceC1636820shE
    public void AA2(C1633110sbF c1633110sbF) {
        this.LLJLL.setValue(c1633110sbF.LIZJ);
        this.LLJL = c1633110sbF;
        this.LLJLIL = System.currentTimeMillis();
        this.LL.getStickerRepository().LJ(c1633110sbF);
    }

    @Override // X.InterfaceC1636820shE
    public final void setEnterMethod(String str) {
        this.LLJJL.setValue(str);
    }

    public SearchStickerViewModel(LifecycleOwner lifecycleOwner, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1625410sOp interfaceC1625410sOp, InterfaceC1635560sfC interfaceC1635560sfC, C1DRG c1drg) {
        super(lifecycleOwner, interfaceC1624480sNK, interfaceC1625410sOp, interfaceC1635560sfC, c1drg, null, false, 32);
        MutableLiveData<C1629950sW9> mutableLiveData = new MutableLiveData<>();
        this.LLJJJIL = mutableLiveData;
        this.LLJJJJ = new MutableLiveData<>();
        MutableLiveData<AbstractC1406770miB> mutableLiveData2 = new MutableLiveData<>();
        this.LLJJJJJIL = mutableLiveData2;
        MutableLiveData<C090E> mutableLiveData3 = new MutableLiveData<>();
        this.LLJJJJLIIL = mutableLiveData3;
        this.LLJJL = new MutableLiveData<>();
        MutableLiveData<List<String>> mutableLiveData4 = new MutableLiveData<>();
        this.LLJJLIIIJLLLLLLLZ = mutableLiveData4;
        MutableLiveData<Boolean> mutableLiveData5 = new MutableLiveData<>();
        this.LLJLILLLLZIIL = mutableLiveData5;
        this.LLJLL = new MutableLiveData<>();
        this.LLJLLIL = C1629910sW5.LIZ;
        this.LLJLLL = mutableLiveData;
        this.LLJZ = mutableLiveData2;
        this.LLJZIJLIL = mutableLiveData3;
        this.LLL = mutableLiveData5;
        this.LLLF = mutableLiveData4;
        this.LLLFF = "";
        interfaceC1624480sNK.getStickerRepository().LJFF().LJIIZILJ().observe(lifecycleOwner, new AObserverS227S0100000_25(this, 143));
        interfaceC1624480sNK.getStickerRepository().LJFF().LJIILLIIL().observe(lifecycleOwner, new AObserverS225S0100000_22(this, 197));
        interfaceC1624480sNK.getStickerRepository().LJFF().LJIIJ(null, false, true, false).observe(lifecycleOwner, new AObserverS121S0300000_3(interfaceC1624480sNK, lifecycleOwner, this, 5));
        p pVarLJJJJIZL = interfaceC1624480sNK.LJJJJIZL();
        if (pVarLJJJJIZL != null) {
            this.LLIZ.LIZ(pVarLJJJJIZL.LIZJ().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS172S0100000_3(this, 114)));
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C090D(0, this, null), 2);
    }
}
