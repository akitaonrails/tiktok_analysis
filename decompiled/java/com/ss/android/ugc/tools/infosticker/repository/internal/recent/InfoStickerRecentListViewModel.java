package com.ss.android.ugc.tools.infosticker.repository.internal.recent;

import X.AbstractC19484711Kz;
import X.C01GW;
import X.C0PEM;
import X.C1413490mt1;
import X.C1465200oEQ;
import X.C1634500sdU;
import X.C1634780sdw;
import X.C1698380uIW;
import X.C19719612Di;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.EnumC1465290oEZ;
import X.EnumC1641470soj;
import X.InterfaceC1423450n95;
import X.InterfaceC1640930snr;
import X.InterfaceC300801Eo;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes26.dex */
public final class InfoStickerRecentListViewModel extends BaseInfoStickerListViewModel<Effect> implements InterfaceC1423450n95<EffectCategoryResponse, Effect> {
    public final Context LLILZIL;
    public final LifecycleOwner LLILZLL;
    public final Function1<Effect, Boolean> LLIZ;
    public final InterfaceC1640930snr LLIZLLLIL;
    public final MutableLiveData<List<Pair<EffectCategoryResponse, List<Effect>>>> LLJ;
    public final MutableLiveData<List<Pair<EffectCategoryResponse, List<Effect>>>> LLJI;
    public final C01GW LLJIJIL;

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final AbstractC19484711Kz<List<Effect>> wQ2() {
        return AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0sdT
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<List<Effect>> interfaceC2329309At) {
            }
        });
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final AbstractC19484711Kz<List<Effect>> xQ2() throws NoSuchMethodException {
        throw new NoSuchMethodException("Category sticker list does not support load more action.");
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, X.InterfaceC1640330smt
    public final void X1() {
        MutableLiveData mutableLiveDataLJ;
        C1634780sdw c1634780sdw;
        MutableLiveData mutableLiveDataLJ2;
        if (isDestroyed()) {
            return;
        }
        EnumC1641470soj value = this.LLILLJJLI.getValue();
        if (value == null || !(value == EnumC1641470soj.EMPTY || value == EnumC1641470soj.LOADING)) {
            List list = (List) this.LL.getValue();
            if (list == null || !(true ^ list.isEmpty())) {
                this.LLILLJJLI.setValue(EnumC1641470soj.LOADING);
                C1634780sdw c1634780sdw2 = (C1634780sdw) this.LLJIJIL.getValue();
                if (c1634780sdw2 == null || (mutableLiveDataLJ = c1634780sdw2.LJ(EnumC1465290oEZ.CUSTOM_STICKER)) == null || (c1634780sdw = (C1634780sdw) this.LLJIJIL.getValue()) == null || (mutableLiveDataLJ2 = c1634780sdw.LJ(EnumC1465290oEZ.NON_GIPHY_INFO_STICKER)) == null) {
                    return;
                }
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), new C1698380uIW(CoroutineExceptionHandler.LJJLIL, this, 2), null, new C1634500sdU(mutableLiveDataLJ, this, mutableLiveDataLJ2, null), 2);
            }
        }
    }

    @Override // X.InterfaceC1423450n95
    public final /* bridge */ /* synthetic */ LiveData<List<Pair<EffectCategoryResponse, List<Effect>>>> getCategories() {
        return this.LLJI;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void yQ2(List<? extends Pair<? extends EffectCategoryResponse, ? extends List<? extends Effect>>> list) {
        EnumC1641470soj enumC1641470soj;
        this.LLJ.setValue(list);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI((Iterable) ((Pair) it2.next()).getSecond(), arrayList);
        }
        this.LL.setValue(arrayList);
        MutableLiveData<EnumC1641470soj> mutableLiveData = this.LLILLJJLI;
        if (arrayList.isEmpty()) {
            enumC1641470soj = EnumC1641470soj.EMPTY;
        } else {
            enumC1641470soj = EnumC1641470soj.NONE;
        }
        mutableLiveData.setValue(enumC1641470soj);
    }

    public InfoStickerRecentListViewModel(Context context, C1465200oEQ c1465200oEQ, AwS604S0100000_25 awS604S0100000_25, C1413490mt1 c1413490mt1) {
        super(c1465200oEQ);
        this.LLILZIL = context;
        this.LLILZLL = c1465200oEQ;
        this.LLIZ = awS604S0100000_25;
        this.LLIZLLLIL = c1413490mt1;
        MutableLiveData<List<Pair<EffectCategoryResponse, List<Effect>>>> mutableLiveData = new MutableLiveData<>();
        this.LLJ = mutableLiveData;
        this.LLJI = mutableLiveData;
        this.LLJIJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 740));
    }
}
