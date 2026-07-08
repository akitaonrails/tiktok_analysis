package com.ss.android.ugc.tools.infosticker.repository.internal;

import X.AbstractC1634360sdG;
import X.AbstractC19484711Kz;
import X.C0PEM;
import X.C11NJ;
import X.C11S5;
import X.C13BV;
import X.C1465200oEQ;
import X.C1634340sdE;
import X.C1634420sdM;
import X.C1634440sdO;
import X.C1701940uOG;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.EnumC1641470soj;
import X.InterfaceC1423450n95;
import X.InterfaceC1633960scc;
import X.InterfaceC1634300sdA;
import X.InterfaceC1640330smt;
import X.InterfaceC300801Eo;
import X.InterfaceC420801kM;
import Y.AfS194S0100000_25;
import Y.AkS468S0100000_3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.StickerSetCategory;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class InfoStickerRecommendTabViewModel extends HumbleViewModel implements InterfaceC1640330smt<Effect>, InterfaceC1423450n95<EffectCategoryResponse, Effect> {
    public final LifecycleOwner LL;
    public final InterfaceC1633960scc LLILLJJLI;
    public final InterfaceC1634300sdA LLILLL;
    public final Function1<Effect, Boolean> LLILZ;
    public final MutableLiveData<List<Effect>> LLILZIL;
    public final MutableLiveData<List<Pair<EffectCategoryResponse, List<Effect>>>> LLILZLL;
    public final MutableLiveData<EnumC1641470soj> LLIZ;
    public final MutableLiveData<EnumC1641470soj> LLIZLLLIL;
    public final MutableLiveData<AbstractC19484711Kz<List<Effect>>> LLJ;
    public final MutableLiveData<Effect> LLJI;
    public C11NJ LLJIJIL;
    public C1634340sdE LLJILJIL;

    @Override // X.InterfaceC1640330smt
    public final void LLIZLLLIL() {
    }

    @Override // X.InterfaceC1640330smt
    public final LiveData<Object> getExtraData() {
        return null;
    }

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC1640330smt
    public final void tw(StickerSetCategory stickerSetCategory) {
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        C11NJ c11nj = this.LLJIJIL;
        if (c11nj != null) {
            c11nj.dispose();
        }
        this.LLJIJIL = null;
    }

    @Override // X.InterfaceC1640330smt
    public final void X1() {
        AbstractC19484711Kz next;
        if (isDestroyed()) {
            return;
        }
        EnumC1641470soj value = this.LLIZ.getValue();
        if (value == null || !(value == EnumC1641470soj.EMPTY || value == EnumC1641470soj.LOADING)) {
            List<Effect> value2 = this.LLILZIL.getValue();
            if (value2 == null || !(true ^ value2.isEmpty())) {
                this.LLIZ.setValue(EnumC1641470soj.LOADING);
                C1634340sdE c1634340sdE = this.LLJILJIL;
                if (c1634340sdE == null) {
                    next = AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.01Eq
                        @Override // X.InterfaceC300801Eo
                        public final void subscribe(InterfaceC2329309At<List<Effect>> interfaceC2329309At) {
                        }
                    });
                } else {
                    next = this.LLILLJJLI.LJ(c1634340sdE).next();
                    if (this.LLILZ != C1634440sdO.LIZ) {
                        next = next.LJIL(new AkS468S0100000_3(this, 16));
                    }
                }
                InterfaceC420801kM interfaceC420801kMLJJIIZ = next.LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS194S0100000_25(this, 101), new AfS194S0100000_25(this, 102));
                C11NJ c11nj = this.LLJIJIL;
                if (c11nj == null) {
                    c11nj = new C11NJ();
                    this.LLJIJIL = c11nj;
                }
                c11nj.LIZ(interfaceC420801kMLJJIIZ);
            }
        }
    }

    @Override // X.InterfaceC1640330smt
    public final void se2() throws NoSuchMethodException {
        if (!isDestroyed()) {
            throw new NoSuchMethodException("Category sticker list does not support load more action.");
        }
    }

    @Override // X.InterfaceC1640330smt
    public final LiveData<EnumC1641470soj> LJJIJ() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1423450n95
    public final LiveData<List<Pair<EffectCategoryResponse, List<Effect>>>> getCategories() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1640330smt
    public final LiveData<EnumC1641470soj> getLoadMoreState() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1640330smt
    public final LiveData<List<Effect>> he() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1640330smt
    public final void Px2(AbstractC1634360sdG abstractC1634360sdG) {
        if ((abstractC1634360sdG instanceof C1634340sdE) && abstractC1634360sdG != null) {
            C1634340sdE c1634340sdE = (C1634340sdE) abstractC1634360sdG;
            if (c1634340sdE.LJII != null) {
                this.LLJILJIL = c1634340sdE;
                X1();
            }
        }
    }

    public final void vQ2(List<? extends Effect> list) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1634420sdM(this, list, null), 3);
    }

    public InfoStickerRecommendTabViewModel(C1465200oEQ c1465200oEQ, InterfaceC1633960scc interfaceC1633960scc, InterfaceC1634300sdA interfaceC1634300sdA, AwS604S0100000_25 awS604S0100000_25) {
        super(c1465200oEQ);
        this.LL = c1465200oEQ;
        this.LLILLJJLI = interfaceC1633960scc;
        this.LLILLL = interfaceC1634300sdA;
        this.LLILZ = awS604S0100000_25;
        MutableLiveData<List<Effect>> mutableLiveData = new MutableLiveData<>();
        this.LLILZIL = mutableLiveData;
        this.LLILZLL = new MutableLiveData<>();
        this.LLIZ = new MutableLiveData<>();
        MutableLiveData<EnumC1641470soj> mutableLiveData2 = new MutableLiveData<>();
        this.LLIZLLLIL = mutableLiveData2;
        this.LLJ = new MutableLiveData<>();
        this.LLJI = new MutableLiveData<>();
        mutableLiveData.setValue(C13BV.INSTANCE);
        mutableLiveData2.setValue(EnumC1641470soj.NONE);
    }
}
