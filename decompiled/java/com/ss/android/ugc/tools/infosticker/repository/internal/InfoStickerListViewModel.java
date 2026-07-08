package com.ss.android.ugc.tools.infosticker.repository.internal;

import X.AbstractC1634360sdG;
import X.AbstractC19484711Kz;
import X.C01GW;
import X.C11NZ;
import X.C11PQ;
import X.C11S5;
import X.C13LP;
import X.C1465200oEQ;
import X.C15438062q;
import X.C1632480saE;
import X.C1634350sdF;
import X.C1634450sdP;
import X.C1638730skJ;
import X.C1701940uOG;
import X.C19475111Hh;
import X.C19475711Hn;
import X.C201955140j;
import X.C452501pT;
import X.C560530Lyd;
import X.InterfaceC1423450n95;
import X.InterfaceC1441305kZ;
import X.InterfaceC1633960scc;
import Y.AfS194S0100000_25;
import Y.AkS486S0100000_25;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerListViewModel;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class InfoStickerListViewModel extends BaseInfoStickerListViewModel<Effect> implements InterfaceC1423450n95<EffectCategoryResponse, Effect> {
    public final InterfaceC1633960scc LLILZIL;
    public final Function1<Effect, Boolean> LLILZLL;
    public final Function1<EffectCategoryResponse, Boolean> LLIZ;
    public final Function1<Effect, Boolean> LLIZLLLIL;
    public final boolean LLJ;
    public final C11NZ<C1638730skJ<EffectCategoryResponse, Effect>> LLJI;
    public final boolean LLJIJIL;
    public final MutableLiveData<List<Pair<EffectCategoryResponse, List<Effect>>>> LLJILJIL;
    public final C01GW LLJILJILJ;
    public final MutableLiveData LLJILLL;
    public C1634350sdF LLJJ;
    public final List<Pair<Integer, Effect>> LLJJI;
    public C1638730skJ<EffectCategoryResponse, Effect> LLJJIII;
    public final C11PQ<C1638730skJ<EffectCategoryResponse, Effect>> LLJJIJI;
    public final C19475711Hn LLJJIJIIJIL;

    public InfoStickerListViewModel() {
        throw null;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final AbstractC19484711Kz<List<Effect>> wQ2() {
        C11NZ c11nzLIZ = this.LLJI;
        if (c11nzLIZ == null) {
            InterfaceC1633960scc interfaceC1633960scc = this.LLILZIL;
            C1634350sdF c1634350sdF = this.LLJJ;
            if (c1634350sdF == null) {
                "ListMeta not fetched yet".toString();
                throw new IllegalArgumentException("ListMeta not fetched yet");
            }
            c11nzLIZ = interfaceC1633960scc.LIZ(c1634350sdF);
        }
        return new C19475111Hh(c11nzLIZ.LJJJLZIJ(C11S5.LJ).LJJIJIIJIL(new AfS194S0100000_25(this, 98)).LJJJJZI(new AkS486S0100000_25(this, 10)).LJJJLZIJ(C1701940uOG.LIZIZ()));
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final AbstractC19484711Kz<List<Effect>> xQ2() throws NoSuchMethodException {
        throw new NoSuchMethodException("Category sticker list does not support load more action.");
    }

    @Override // X.InterfaceC1423450n95
    public final LiveData<List<Pair<EffectCategoryResponse, List<Effect>>>> getCategories() {
        return this.LLJILJIL;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, X.InterfaceC1640330smt
    public final void Px2(AbstractC1634360sdG abstractC1634360sdG) {
        if (abstractC1634360sdG instanceof C1634350sdF) {
            this.LLJJ = (C1634350sdF) abstractC1634360sdG;
            X1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<Effect> yQ2(List<? extends Effect> list) {
        Function1<Effect, Boolean> function1 = this.LLILZLL;
        if (function1 != C1634450sdP.LIZ) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (function1.invoke((Effect) obj).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return list;
    }

    public final List<Pair<EffectCategoryResponse, List<Effect>>> zQ2(C1638730skJ<EffectCategoryResponse, Effect> c1638730skJ) {
        List<Pair<EffectCategoryResponse, List<Effect>>> list = c1638730skJ.LIZIZ;
        ArrayList<Pair> arrayList = new ArrayList();
        for (Pair<EffectCategoryResponse, List<Effect>> pair : list) {
            if (this.LLIZ.invoke(pair.getFirst()).booleanValue()) {
                arrayList.add(pair);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (Pair pair2 : arrayList) {
            arrayList2.add(new Pair(pair2.getFirst(), yQ2((List) pair2.getSecond())));
        }
        return arrayList2;
    }

    public final List AQ2(Integer num, List list) {
        List<Effect> listYQ2 = yQ2(list);
        if (this.LLIZLLLIL != C1634450sdP.LIZ && num != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int iIntValue = num.intValue();
            for (int i = 0; i < iIntValue; i++) {
                Object objLJJJLZIJ = C13LP.LJJJLZIJ(i, listYQ2);
                if (objLJJJLZIJ != null) {
                    if (this.LLIZLLLIL.invoke((Effect) objLJJJLZIJ).booleanValue()) {
                        arrayList.add(objLJJJLZIJ);
                    } else {
                        arrayList2.add(objLJJJLZIJ);
                    }
                }
            }
            int iMin = Math.min(num.intValue(), listYQ2.size());
            List listLJLIL = C13LP.LJLIL(arrayList2, arrayList);
            List listLJJJJIZL = C13LP.LJJJJIZL(listYQ2, iMin);
            Function1<Effect, Boolean> function1 = this.LLIZLLLIL;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : listLJJJJIZL) {
                if (!function1.invoke((Effect) obj).booleanValue()) {
                    arrayList3.add(obj);
                }
            }
            List listLJLIL2 = C13LP.LJLIL(arrayList3, listLJLIL);
            C1632480saE c1632480saE = C1632480saE.LIZIZ;
            StringBuilder sb = new StringBuilder("InfoStickerListViewModel Moved interactive stickers to the front. Before: ");
            sb.append(listYQ2.size());
            sb.append(' ');
            List listLL = C13LP.LL(listYQ2, iMin);
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(listLL, 10));
            Iterator it2 = listLL.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((Effect) it2.next()).getName());
            }
            sb.append(arrayList4);
            sb.append(" After: ");
            sb.append(((ArrayList) listLJLIL2).size());
            sb.append(' ');
            List listLL2 = C13LP.LL(listLJLIL2, iMin);
            ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(listLL2, 10));
            Iterator it3 = listLL2.iterator();
            while (it3.hasNext()) {
                arrayList5.add(((Effect) it3.next()).getName());
            }
            sb.append(arrayList5);
            C201955140j.LIZJ(c1632480saE, sb.toString());
            return listLJLIL2;
        }
        return listYQ2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoStickerListViewModel(C1465200oEQ c1465200oEQ, InterfaceC1633960scc interfaceC1633960scc, Function1 function1, Function1 function12, Function1 function13, C19475711Hn c19475711Hn, boolean z, C560530Lyd c560530Lyd, int i) {
        boolean z2;
        super(c1465200oEQ);
        function1 = (i & 4) != 0 ? C1634450sdP.LIZ : function1;
        function12 = (i & 8) != 0 ? AFwS266S0000000_25.get$arr$(496) : function12;
        function13 = (i & 16) != 0 ? C1634450sdP.LIZ : function13;
        if ((i & 32) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        c19475711Hn = (i & 64) != 0 ? null : c19475711Hn;
        z = (i & 128) != 0 ? false : z;
        c560530Lyd = (i & 256) != 0 ? new C560530Lyd() : c560530Lyd;
        this.LLILZIL = interfaceC1633960scc;
        this.LLILZLL = function1;
        this.LLIZ = function12;
        this.LLIZLLLIL = function13;
        this.LLJ = z2;
        this.LLJI = c19475711Hn;
        this.LLJIJIL = z;
        this.LLJILJIL = new MutableLiveData<>();
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(509));
        this.LLJILJILJ = c01gwLIZIZ;
        this.LLJILLL = (MutableLiveData) c01gwLIZIZ.getValue();
        this.LLJJI = new ArrayList();
        C11PQ<C1638730skJ<EffectCategoryResponse, Effect>> c11pq = new C11PQ<>();
        this.LLJJIJI = c11pq;
        this.LLJJIJIIJIL = new C19475711Hn(c11pq);
        c560530Lyd.LIZ(c1465200oEQ, new InterfaceC1441305kZ() { // from class: X.0Cwz
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                InfoStickerListViewModel infoStickerListViewModel = this.LL;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                infoStickerListViewModel.getClass();
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C330160Cww(infoStickerListViewModel, zBooleanValue, null), 3);
            }
        });
    }
}
