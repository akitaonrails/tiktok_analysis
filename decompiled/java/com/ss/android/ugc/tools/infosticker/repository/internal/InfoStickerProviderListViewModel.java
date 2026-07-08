package com.ss.android.ugc.tools.infosticker.repository.internal;

import X.AbstractC1634360sdG;
import X.AbstractC19484711Kz;
import X.C01GW;
import X.C0LCS;
import X.C11ON;
import X.C1413490mt1;
import X.C1465200oEQ;
import X.C1634470sdR;
import X.C19482011Jy;
import X.C452501pT;
import X.EnumC1641420soe;
import X.EnumC1641470soj;
import X.InterfaceC1487280oo2;
import X.InterfaceC1634040sck;
import X.InterfaceC1634480sdS;
import X.InterfaceC1640420sn2;
import X.InterfaceC1640680snS;
import X.InterfaceC1640930snr;
import Y.AObserverS227S0100000_25;
import Y.AfS187S0100000_18;
import Y.AkS486S0100000_25;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.StickerSetCategory;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public class InfoStickerProviderListViewModel extends HumbleViewModel implements InterfaceC1640680snS<ProviderEffect>, InterfaceC1640420sn2<ProviderEffect> {
    public final LifecycleOwner LL;
    public final InterfaceC1634040sck LLILLJJLI;
    public final InterfaceC1640930snr LLILLL;
    public final String LLILZ;
    public int LLILZIL;
    public final MutableLiveData<String> LLILZLL;
    public final C01GW LLIZ;
    public final ProviderStateViewModel LLIZLLLIL;
    public SearchListViewModel LLJ;
    public ProviderStateViewModel LLJI;
    public boolean LLJIJIL;
    public String LLJILJIL;
    public final MutableLiveData<List<ProviderEffect>> LLJILJILJ;
    public final MutableLiveData<EnumC1641470soj> LLJILLL;
    public final MutableLiveData<EnumC1641470soj> LLJJ;
    public final MutableLiveData<Object> LLJJI;
    public final MutableLiveData<Map<ProviderEffect, Pair<EnumC1641420soe, Integer>>> LLJJIII;
    public final MutableLiveData<C0LCS<List<ProviderEffect>>> LLJJIJI;
    public final MutableLiveData<C0LCS<List<ProviderEffect>>> LLJJIJIIJIL;
    public final MutableLiveData<String> LLJJIJIL;
    public final AObserverS227S0100000_25 LLJJJ;
    public final AObserverS227S0100000_25 LLJJJIL;
    public final AObserverS227S0100000_25 LLJJJJ;
    public final AObserverS227S0100000_25 LLJJJJJIL;
    public final AObserverS227S0100000_25 LLJJJJLIIL;
    public final AObserverS227S0100000_25 LLJJL;
    public final AObserverS227S0100000_25 LLJJLIIIJLLLLLLLZ;

    public static class SearchListViewModel extends BaseInfoStickerListViewModel<ProviderEffect> {
        public final InterfaceC1634040sck LLILZIL;
        public final String LLILZLL;
        public final InterfaceC1640930snr LLIZ;
        public final Function0<Unit> LLIZLLLIL;
        public InterfaceC1634480sdS<ProviderEffect, ProviderEffectModel> LLJ;
        public final MutableLiveData<Object> LLJI;

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            super.onStateChanged(lifecycleOwner, event);
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
        public AbstractC19484711Kz<List<ProviderEffect>> wQ2() {
            InterfaceC1634480sdS<ProviderEffect, ProviderEffectModel> interfaceC1634480sdSLIZJ = this.LLILZIL.LIZJ(this.LLILZLL);
            this.LLJ = interfaceC1634480sdSLIZJ;
            this.LLIZLLLIL.invoke();
            System.currentTimeMillis();
            return interfaceC1634480sdSLIZJ.LIZ().LJIILL(new AfS187S0100000_18(this, 51)).LJIL(new AkS486S0100000_25(this, 11));
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
        public final AbstractC19484711Kz<List<ProviderEffect>> xQ2() {
            C19482011Jy c19482011JyLIZ;
            InterfaceC1634480sdS<ProviderEffect, ProviderEffectModel> interfaceC1634480sdS = this.LLJ;
            return (interfaceC1634480sdS == null || (c19482011JyLIZ = interfaceC1634480sdS.LIZ()) == null) ? AbstractC19484711Kz.LJIILLIIL(new IllegalStateException("Illegal method invoke order, should request data before request more.")) : c19482011JyLIZ.LJIILL(new AfS187S0100000_18(this, 52)).LJIL(new InterfaceC1487280oo2() { // from class: X.0gJN
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    return ((Pair) obj).getFirst();
                }
            });
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, X.InterfaceC1640330smt
        public final LiveData<Object> getExtraData() {
            return this.LLJI;
        }

        public SearchListViewModel(LifecycleOwner lifecycleOwner, InterfaceC1634040sck interfaceC1634040sck, String str, InterfaceC1640930snr interfaceC1640930snr, Function0<Unit> function0) {
            super(lifecycleOwner);
            this.LLILZIL = interfaceC1634040sck;
            this.LLILZLL = str;
            this.LLIZ = interfaceC1640930snr;
            this.LLIZLLLIL = function0;
            this.LLJI = new MutableLiveData<>();
        }
    }

    public static class TrendListViewModel extends BaseInfoStickerListViewModel<ProviderEffect> {
        public final InterfaceC1634040sck LLILZIL;
        public InterfaceC1634480sdS<ProviderEffect, ProviderEffectModel> LLILZLL;
        public final MutableLiveData<Object> LLIZ;

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            super.onStateChanged(lifecycleOwner, event);
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
        public final AbstractC19484711Kz<List<ProviderEffect>> wQ2() {
            InterfaceC1634480sdS<ProviderEffect, ProviderEffectModel> interfaceC1634480sdSLJ = this.LLILZIL.LJ();
            this.LLILZLL = interfaceC1634480sdSLJ;
            System.currentTimeMillis();
            return interfaceC1634480sdSLJ.LIZ().LJIILL(new AfS187S0100000_18(this, 53)).LJIL(new InterfaceC1487280oo2() { // from class: X.0gJO
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    return ((Pair) obj).getFirst();
                }
            });
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
        public final AbstractC19484711Kz<List<ProviderEffect>> xQ2() {
            C19482011Jy c19482011JyLIZ;
            InterfaceC1634480sdS<ProviderEffect, ProviderEffectModel> interfaceC1634480sdS = this.LLILZLL;
            return (interfaceC1634480sdS == null || (c19482011JyLIZ = interfaceC1634480sdS.LIZ()) == null) ? AbstractC19484711Kz.LJIILLIIL(new IllegalStateException("Illegal method invoke order, should request data before request more.")) : c19482011JyLIZ.LJIILL(new AfS187S0100000_18(this, 54)).LJIL(new InterfaceC1487280oo2() { // from class: X.0gJP
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    return ((Pair) obj).getFirst();
                }
            });
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, X.InterfaceC1640330smt
        public final LiveData<Object> getExtraData() {
            return this.LLIZ;
        }

        public TrendListViewModel(LifecycleOwner lifecycleOwner, InterfaceC1634040sck interfaceC1634040sck, InterfaceC1640930snr interfaceC1640930snr) {
            super(lifecycleOwner);
            this.LLILZIL = interfaceC1634040sck;
            this.LLIZ = new MutableLiveData<>();
        }
    }

    @Override // X.InterfaceC1640330smt
    public final void LLIZLLLIL() {
    }

    @Override // X.InterfaceC1640330smt
    public final void Px2(AbstractC1634360sdG abstractC1634360sdG) {
    }

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC1640330smt
    public final void tw(StickerSetCategory stickerSetCategory) {
    }

    public void BQ2() {
        if (this.LLJIJIL) {
            return;
        }
        zQ2(this.LLJ, this.LLJI);
        yQ2(vQ2(), wQ2());
        this.LLILZLL.setValue(C1634470sdR.LIZ(vQ2().LLIZ.getValue()));
        this.LLJIJIL = true;
    }

    @Override // X.InterfaceC1640330smt
    public final void X1() {
        if (this.LLJIJIL) {
            vQ2().X1();
            return;
        }
        SearchListViewModel searchListViewModel = this.LLJ;
        if (searchListViewModel != null) {
            searchListViewModel.X1();
        }
    }

    @Override // X.InterfaceC1640680snS
    public final void init() {
        if (this.LLILZ.length() == 0) {
            BQ2();
        } else {
            Ep(this.LLILZ);
        }
        wQ2().LLILLJJLI.observe(this.LL, this.LLJJL);
        wQ2().LLILLL.observe(this.LL, this.LLJJLIIIJLLLLLLLZ);
    }

    @Override // X.InterfaceC1640330smt
    public final void se2() {
        if (this.LLJIJIL) {
            vQ2().se2();
            return;
        }
        SearchListViewModel searchListViewModel = this.LLJ;
        if (searchListViewModel != null) {
            searchListViewModel.se2();
        }
    }

    public TrendListViewModel vQ2() {
        return (TrendListViewModel) this.LLIZ.getValue();
    }

    @Override // X.InterfaceC1640680snS
    public final MutableLiveData Ff() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC1640420sn2
    public final MutableLiveData KI1() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC1640330smt
    public final LiveData<EnumC1641470soj> LJJIJ() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1640420sn2
    public final MutableLiveData V60() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC1640330smt
    public final LiveData<Object> getExtraData() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC1640330smt
    public final LiveData<EnumC1641470soj> getLoadMoreState() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC1640680snS
    public final MutableLiveData getSubtitle() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1640330smt
    public final LiveData<List<ProviderEffect>> he() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1640420sn2
    public final MutableLiveData nN1() {
        return this.LLJJIII;
    }

    public ProviderStateViewModel wQ2() {
        return this.LLIZLLLIL;
    }

    public static class ProviderStateViewModel extends BaseInfoStickerStateViewModel<ProviderEffect> {
        public final InterfaceC1634040sck LLILZIL;

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            super.onStateChanged(lifecycleOwner, event);
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel
        /* JADX INFO: renamed from: xQ2, reason: merged with bridge method [inline-methods] */
        public C11ON vQ2(ProviderEffect providerEffect) {
            return this.LLILZIL.LIZLLL(providerEffect).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0saq
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    EnumC1641420soe enumC1641420soe;
                    C1632850sap c1632850sap = (C1632850sap) obj;
                    ProviderEffect providerEffect2 = c1632850sap.LIZ;
                    int i = C1632870sar.LIZ[c1632850sap.LIZIZ.LIZ.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i != 5) {
                                        enumC1641420soe = EnumC1641420soe.UNKNOWN;
                                    } else {
                                        enumC1641420soe = EnumC1641420soe.DOWNLOAD_FAILED;
                                    }
                                } else {
                                    enumC1641420soe = EnumC1641420soe.DOWNLOAD_SUCCESS;
                                }
                            } else {
                                enumC1641420soe = EnumC1641420soe.NOT_DOWNLOAD;
                            }
                        } else {
                            enumC1641420soe = EnumC1641420soe.DOWNLOADING;
                        }
                    } else {
                        enumC1641420soe = EnumC1641420soe.UNKNOWN;
                    }
                    return new C1634100scq(providerEffect2, enumC1641420soe, c1632850sap.LIZJ);
                }
            });
        }

        public ProviderStateViewModel(LifecycleOwner lifecycleOwner, InterfaceC1634040sck interfaceC1634040sck) {
            super(lifecycleOwner);
            this.LLILZIL = interfaceC1634040sck;
        }
    }

    public void AQ2(String str) {
        Object value;
        MutableLiveData<Object> mutableLiveData;
        LiveData liveData;
        LiveData liveData2;
        LiveData liveData3;
        if (!this.LLJIJIL && Intrinsics.LJFF(this.LLJILJIL, str)) {
            return;
        }
        if (this.LLJIJIL) {
            zQ2(vQ2(), wQ2());
        }
        if (!Intrinsics.LJFF(this.LLJILJIL, str)) {
            if (!this.LLJIJIL) {
                zQ2(this.LLJ, this.LLJI);
            }
            ProviderStateViewModel providerStateViewModel = this.LLJI;
            if (providerStateViewModel != null && (liveData3 = providerStateViewModel.LLILLJJLI) != null) {
                liveData3.removeObserver(this.LLJJL);
            }
            ProviderStateViewModel providerStateViewModel2 = this.LLJI;
            if (providerStateViewModel2 != null && (liveData2 = providerStateViewModel2.LLILLL) != null) {
                liveData2.removeObserver(this.LLJJLIIIJLLLLLLLZ);
            }
            SearchListViewModel searchListViewModel = this.LLJ;
            if (searchListViewModel != null) {
                searchListViewModel.onDestroy();
            }
            ProviderStateViewModel providerStateViewModel3 = this.LLJI;
            if (providerStateViewModel3 != null) {
                providerStateViewModel3.onDestroy();
            }
            xQ2(str);
            ProviderStateViewModel providerStateViewModel4 = new ProviderStateViewModel(this.LL, this.LLILLJJLI);
            this.LLJI = providerStateViewModel4;
            LiveData liveData4 = providerStateViewModel4.LLILLJJLI;
            if (liveData4 != null) {
                liveData4.observe(this.LL, this.LLJJL);
            }
            ProviderStateViewModel providerStateViewModel5 = this.LLJI;
            if (providerStateViewModel5 != null && (liveData = providerStateViewModel5.LLILLL) != null) {
                liveData.observe(this.LL, this.LLJJLIIIJLLLLLLLZ);
            }
        } else {
            MutableLiveData<String> mutableLiveData2 = this.LLILZLL;
            SearchListViewModel searchListViewModel2 = this.LLJ;
            if (searchListViewModel2 != null && (mutableLiveData = searchListViewModel2.LLJI) != null) {
                value = mutableLiveData.getValue();
            } else {
                value = null;
            }
            mutableLiveData2.setValue(C1634470sdR.LIZ(value));
        }
        yQ2(this.LLJ, this.LLJI);
        this.LLJIJIL = false;
        this.LLJILJIL = str;
    }

    @Override // X.InterfaceC1640680snS
    public final void Ep(String str) {
        if (str != null && str.length() != 0) {
            AQ2(str);
        } else {
            BQ2();
        }
        this.LLJJIJIL.setValue(str);
    }

    @Override // X.InterfaceC1640420sn2
    public final void r22(ProviderEffect providerEffect) {
        if (this.LLJIJIL) {
            wQ2().r22(providerEffect);
            return;
        }
        ProviderStateViewModel providerStateViewModel = this.LLJI;
        if (providerStateViewModel == null) {
            return;
        }
        providerStateViewModel.r22(providerEffect);
    }

    public void xQ2(String str) {
        SearchListViewModel searchListViewModel = new SearchListViewModel(this.LL, this.LLILLJJLI, str, this.LLILLL, new AwS569S0100000_25(this, 738));
        searchListViewModel.X1();
        this.LLJ = searchListViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void CQ2(MutableLiveData mutableLiveData, List list) {
        ArrayList arrayList;
        Collection collection;
        C0LCS c0lcs = (C0LCS) mutableLiveData.getValue();
        if (c0lcs != null && (collection = (Collection) c0lcs.LIZIZ()) != null) {
            arrayList = new ArrayList(collection);
        } else {
            arrayList = new ArrayList();
        }
        arrayList.addAll(list);
        mutableLiveData.setValue(new C0LCS(arrayList));
    }

    public final void yQ2(BaseInfoStickerListViewModel baseInfoStickerListViewModel, ProviderStateViewModel providerStateViewModel) {
        LiveData liveData;
        if (baseInfoStickerListViewModel != null) {
            LiveData liveData2 = baseInfoStickerListViewModel.LL;
            if (liveData2 != null) {
                liveData2.observe(this.LL, this.LLJJJ);
            }
            MutableLiveData<EnumC1641470soj> mutableLiveData = baseInfoStickerListViewModel.LLILLJJLI;
            if (mutableLiveData != null) {
                mutableLiveData.observe(this.LL, this.LLJJJIL);
            }
            MutableLiveData<EnumC1641470soj> mutableLiveData2 = baseInfoStickerListViewModel.LLILLL;
            if (mutableLiveData2 != null) {
                mutableLiveData2.observe(this.LL, this.LLJJJJ);
            }
            LiveData<Object> extraData = baseInfoStickerListViewModel.getExtraData();
            if (extraData != null) {
                extraData.observe(this.LL, this.LLJJJJJIL);
            }
        }
        if (providerStateViewModel != null && (liveData = providerStateViewModel.LL) != null) {
            liveData.observe(this.LL, this.LLJJJJLIIL);
        }
    }

    public final void zQ2(BaseInfoStickerListViewModel baseInfoStickerListViewModel, ProviderStateViewModel providerStateViewModel) {
        LiveData liveData;
        if (baseInfoStickerListViewModel != null) {
            LiveData liveData2 = baseInfoStickerListViewModel.LL;
            if (liveData2 != null) {
                liveData2.removeObserver(this.LLJJJ);
            }
            MutableLiveData<EnumC1641470soj> mutableLiveData = baseInfoStickerListViewModel.LLILLJJLI;
            if (mutableLiveData != null) {
                mutableLiveData.removeObserver(this.LLJJJIL);
            }
            MutableLiveData<EnumC1641470soj> mutableLiveData2 = baseInfoStickerListViewModel.LLILLL;
            if (mutableLiveData2 != null) {
                mutableLiveData2.removeObserver(this.LLJJJJ);
            }
            LiveData<Object> extraData = baseInfoStickerListViewModel.getExtraData();
            if (extraData != null) {
                extraData.removeObserver(this.LLJJJJJIL);
            }
        }
        if (providerStateViewModel != null && (liveData = providerStateViewModel.LL) != null) {
            liveData.removeObserver(this.LLJJJJLIIL);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoStickerProviderListViewModel(C1465200oEQ c1465200oEQ, InterfaceC1634040sck interfaceC1634040sck, C1413490mt1 c1413490mt1, int i) {
        super(c1465200oEQ);
        c1413490mt1 = (i & 4) != 0 ? null : c1413490mt1;
        String str = (i & 8) != 0 ? "" : null;
        this.LL = c1465200oEQ;
        this.LLILLJJLI = interfaceC1634040sck;
        this.LLILLL = c1413490mt1;
        this.LLILZ = str;
        this.LLILZIL = 0;
        this.LLILZLL = new MutableLiveData<>();
        this.LLIZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 739));
        this.LLIZLLLIL = new ProviderStateViewModel(c1465200oEQ, interfaceC1634040sck);
        this.LLJILJIL = "";
        this.LLJILJILJ = new MutableLiveData<>();
        this.LLJILLL = new MutableLiveData<>();
        this.LLJJ = new MutableLiveData<>();
        this.LLJJI = new MutableLiveData<>();
        this.LLJJIII = new MutableLiveData<>();
        this.LLJJIJI = new MutableLiveData<>();
        this.LLJJIJIIJIL = new MutableLiveData<>();
        this.LLJJIJIL = new MutableLiveData<>();
        this.LLJJJ = new AObserverS227S0100000_25(this, 98);
        this.LLJJJIL = new AObserverS227S0100000_25(this, 107);
        this.LLJJJJ = new AObserverS227S0100000_25(this, 99);
        this.LLJJJJJIL = new AObserverS227S0100000_25(this, 114);
        this.LLJJJJLIIL = new AObserverS227S0100000_25(this, 109);
        this.LLJJL = new AObserverS227S0100000_25(this, 108);
        this.LLJJLIIIJLLLLLLLZ = new AObserverS227S0100000_25(this, 115);
    }
}
