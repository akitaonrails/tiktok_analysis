package com.ss.android.ugc.tools.infosticker.repository.internal.collect;

import X.AbstractC1634360sdG;
import X.C01GW;
import X.C054G;
import X.C09AL;
import X.C0BP7;
import X.C0PEM;
import X.C13LP;
import X.C1413490mt1;
import X.C1462570oAB;
import X.C1465200oEQ;
import X.C15438062q;
import X.C1634630sdh;
import X.C1634690sdn;
import X.C1634700sdo;
import X.C1634720sdq;
import X.C1634730sdr;
import X.C1634770sdv;
import X.C1634780sdw;
import X.C1635160seY;
import X.C1635170seZ;
import X.C1697810uHb;
import X.C19719612Di;
import X.C201955140j;
import X.C2188811AlT;
import X.C2286708xd;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C560530Lyd;
import X.EnumC1465290oEZ;
import X.EnumC1641470soj;
import X.InterfaceC1423450n95;
import X.InterfaceC1640330smt;
import X.InterfaceC1640930snr;
import Y.AComparatorS44S0000000_25;
import Y.AObjectS246S0100000_25;
import Y.AObserverS227S0100000_25;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.StickerSetCategory;
import com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerListViewModel;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class InfoStickerCollectListViewModel extends HumbleViewModel implements InterfaceC1640330smt<Effect>, InterfaceC1423450n95<EffectCategoryResponse, Effect> {
    public final LifecycleOwner LL;
    public final Function1<Effect, Boolean> LLILLJJLI;
    public final InterfaceC1640930snr LLILLL;
    public final String LLILZ;
    public final MutableLiveData<List<Effect>> LLILZIL;
    public final MutableLiveData<EnumC1641470soj> LLILZLL;
    public final MutableLiveData<EnumC1641470soj> LLIZ;
    public final MutableLiveData<List<Pair<EffectCategoryResponse, List<Effect>>>> LLIZLLLIL;
    public final C054G LLJ;
    public C1634770sdv LLJI;
    public Effect LLJIJIL;
    public final LinkedList<Effect> LLJILJIL;
    public final LinkedList<Effect> LLJILJILJ;
    public boolean LLJILLL;
    public final List<Pair<EffectCategoryResponse, List<Effect>>> LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;

    @Override // X.InterfaceC1640330smt
    public final void LLIZLLLIL() {
    }

    @Override // X.InterfaceC1640330smt
    public final void Px2(AbstractC1634360sdG abstractC1634360sdG) {
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

    @Override // X.InterfaceC1640330smt
    public final void se2() {
        if (!this.LLJI.LJ || isDestroyed()) {
            return;
        }
        EnumC1641470soj value = this.LLILZLL.getValue();
        if ((value == null || value == EnumC1641470soj.NONE) && !this.LLJILJILJ.isEmpty()) {
            EnumC1641470soj value2 = this.LLIZ.getValue();
            if (value2 == null || !(value2 == EnumC1641470soj.EMPTY || value2 == EnumC1641470soj.LOADING)) {
                this.LLIZ.setValue(EnumC1641470soj.LOADING);
                C23250099c.LIZLLL(this.LLJ, null, null, new C1634730sdr(this, this.LLJI, null), 3);
            }
        }
    }

    public final List<Effect> vQ2() {
        Effect effect = this.LLJIJIL;
        if (effect == null) {
            return C13LP.LJLIL(this.LLJILJILJ, this.LLJILJIL);
        }
        return C13LP.LJLIL(this.LLJILJILJ, C13LP.LJLIL(this.LLJILJIL, Collections.singletonList(effect)));
    }

    @Override // X.InterfaceC1640330smt
    public final void X1() {
        C1634700sdo c1634700sdo;
        C1634700sdo c1634700sdo2;
        if (isDestroyed()) {
            return;
        }
        EnumC1641470soj value = this.LLILZLL.getValue();
        if ((value == null || !(value == EnumC1641470soj.EMPTY || value == EnumC1641470soj.LOADING)) && !(!this.LLJILJILJ.isEmpty())) {
            C1634630sdh c1634630sdh = C1634630sdh.LIZ;
            String str = this.LLILZ;
            c1634630sdh.getClass();
            if (!C1634690sdn.LIZ() || !Intrinsics.LJFF(str, C1634630sdh.LIZIZ) || (((c1634700sdo = C1634630sdh.LIZJ) != null && c1634700sdo.LIZIZ.isEmpty()) || (c1634700sdo2 = C1634630sdh.LIZJ) == null)) {
                this.LLILZLL.setValue(EnumC1641470soj.LOADING);
                C23250099c.LIZLLL(this.LLJ, null, null, new C1634720sdq(this, this.LLJI, null), 3);
                return;
            }
            this.LLJI = c1634700sdo2.LIZ;
            this.LLJILJILJ.clear();
            this.LLJILJILJ.addAll(c1634700sdo2.LIZIZ);
            xQ2(1, false, vQ2());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("custom_sticker_upload : use collect sticker list cache, size = ");
            sbLIZ.append(c1634700sdo2.LIZIZ.size());
            C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.InterfaceC1640330smt
    public final LiveData<EnumC1641470soj> LJJIJ() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1423450n95
    public final LiveData<List<Pair<EffectCategoryResponse, List<Effect>>>> getCategories() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1640330smt
    public final LiveData<EnumC1641470soj> getLoadMoreState() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1640330smt
    public final LiveData<List<Effect>> he() {
        return this.LLILZIL;
    }

    public final boolean wQ2(Effect effect) {
        if (this.LLJJ.size() <= 0) {
            return false;
        }
        return ((List) ((Pair) ListProtector.get(this.LLJJ, 0)).getSecond()).contains(effect);
    }

    public final void yQ2(List<C1635170seZ> list) {
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS44S0000000_25(2), list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJLLLL) {
            C1635170seZ c1635170seZ = (C1635170seZ) obj;
            if (!C0BP7.LIZ() || !c1635170seZ.LJIILIIL.contains("set_sticker") || C2286708xd.LIZJ(c1635170seZ.LJIILJJIL)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(C1635160seY.LJI((C1635170seZ) it2.next()));
        }
        Function1<Effect, Boolean> function1 = this.LLILLJJLI;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (function1.invoke((Effect) obj2).booleanValue()) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(C13LP.LL(arrayList3, 6));
        if (!arrayList4.isEmpty()) {
            xQ2(0, false, arrayList4);
        }
    }

    public final void xQ2(int i, boolean z, List list) {
        EnumC1641470soj enumC1641470soj;
        List list2 = (List) ((Pair) ListProtector.get(this.LLJJ, i)).getSecond();
        list2.clear();
        list2.addAll(list);
        this.LLIZLLLIL.setValue(this.LLJJ);
        List<Pair<EffectCategoryResponse, List<Effect>>> list3 = this.LLJJ;
        ArrayList arrayList = new ArrayList();
        Iterator<Pair<EffectCategoryResponse, List<Effect>>> it2 = list3.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().getSecond(), arrayList);
        }
        this.LLILZIL.setValue(arrayList);
        if (!z) {
            if (((List) ((Pair) ListProtector.get(this.LLJJ, 0)).getSecond()).isEmpty() && ((List) ((Pair) ListProtector.get(this.LLJJ, 1)).getSecond()).isEmpty()) {
                MutableLiveData<EnumC1641470soj> mutableLiveData = this.LLILZLL;
                if (this.LLJILLL) {
                    enumC1641470soj = EnumC1641470soj.ERROR;
                } else {
                    enumC1641470soj = EnumC1641470soj.EMPTY;
                }
                mutableLiveData.setValue(enumC1641470soj);
            } else {
                this.LLILZLL.setValue(EnumC1641470soj.NONE);
            }
        }
        Collection collection = (Collection) ((Pair) ListProtector.get(this.LLJJ, i)).getSecond();
        if (i == 1) {
            C1634630sdh c1634630sdh = C1634630sdh.LIZ;
            String str = this.LLILZ;
            C1634770sdv c1634770sdv = this.LLJI;
            c1634630sdh.getClass();
            if (C1634690sdn.LIZ() && str != null) {
                if (!Intrinsics.LJFF(str, C1634630sdh.LIZIZ)) {
                    C1634630sdh.LIZJ = null;
                    C1634630sdh.LIZLLL = null;
                    C1634630sdh.LJ = null;
                    C1634630sdh.LIZIZ = str;
                }
                if (C1634630sdh.LIZJ == null) {
                    C1634630sdh.LIZJ = new C1634700sdo(0);
                }
                ArrayList arrayList2 = new ArrayList(new ArrayList(collection));
                Effect effect = (Effect) C13LP.LJJJLL(arrayList2);
                if (effect != null && C1462570oAB.LJ(effect)) {
                    arrayList2.remove(effect);
                }
                C1634700sdo c1634700sdo = C1634630sdh.LIZJ;
                if (c1634700sdo != null) {
                    c1634700sdo.LIZ = c1634770sdv;
                    c1634700sdo.LIZIZ.clear();
                    c1634700sdo.LIZIZ.addAll(arrayList2);
                }
            }
        }
    }

    public InfoStickerCollectListViewModel(Context context, C1465200oEQ c1465200oEQ, AwS604S0100000_25 awS604S0100000_25, C1413490mt1 c1413490mt1, InfoStickerListViewModel infoStickerListViewModel, C560530Lyd c560530Lyd, C560530Lyd c560530Lyd2, String str) {
        MutableLiveData mutableLiveDataLJ;
        super(c1465200oEQ);
        this.LL = c1465200oEQ;
        this.LLILLJJLI = awS604S0100000_25;
        this.LLILLL = c1413490mt1;
        this.LLILZ = str;
        this.LLILZIL = new MutableLiveData<>();
        this.LLILZLL = new MutableLiveData<>();
        this.LLIZ = new MutableLiveData<>();
        this.LLIZLLLIL = new MutableLiveData<>();
        this.LLJ = C2296808zG.LIZ(C0PEM.LIZJ.plus(new C09AL()));
        this.LLJI = new C1634770sdv(0);
        this.LLJILJIL = new LinkedList<>();
        this.LLJILJILJ = new LinkedList<>();
        this.LLJJ = C1697810uHb.LJIILJJIL(new Pair(new EffectCategoryResponse(null, context.getString(2131848829), null, null, null, null, null, null, null, null, null, false, null, 8189, null), new ArrayList()), new Pair(new EffectCategoryResponse(null, context.getString(2131848831), null, null, null, null, null, null, null, null, null, false, null, 8189, null), new ArrayList()));
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 989));
        this.LLJJI = c01gwLIZIZ;
        this.LLJJIII = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(530));
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS569S0100000_25(this, 990));
        this.LLJJIJI = c01gwLIZIZ2;
        C1634780sdw c1634780sdw = (C1634780sdw) c01gwLIZIZ.getValue();
        if (c1634780sdw != null && (mutableLiveDataLJ = c1634780sdw.LJ(EnumC1465290oEZ.NON_GIPHY_INFO_STICKER)) != null) {
            mutableLiveDataLJ.removeObserver(new AObserverS227S0100000_25(this, 117));
            mutableLiveDataLJ.observe(this.LL, (Observer) c01gwLIZIZ2.getValue());
        }
        MutableLiveData mutableLiveData = infoStickerListViewModel.LLJILLL;
        if (mutableLiveData != null) {
            mutableLiveData.observe(this.LL, new AObserverS227S0100000_25(this, 118));
        }
        c560530Lyd.LIZ(c1465200oEQ, new AObjectS246S0100000_25(this, 714));
        c560530Lyd2.LIZ(c1465200oEQ, new AObjectS246S0100000_25(this, 715));
    }
}
