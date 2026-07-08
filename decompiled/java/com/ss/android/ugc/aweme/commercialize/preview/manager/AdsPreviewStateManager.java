package com.ss.android.ugc.aweme.commercialize.preview.manager;

import X.AbstractC2215911Bo5;
import X.C0D80;
import X.C0TPP;
import X.C11NJ;
import X.C11PQ;
import X.C11S5;
import X.C1227904rF;
import X.C2097608Jq;
import X.C2215931Bo7;
import X.C2215951Bo9;
import X.InterfaceC2215921Bo6;
import X.InterfaceC334160D8c;
import Y.AfS203S0100000_34;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.commercialize.preview.model.AdsOnDemandQuery;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.AwS683S0100000_34;

/* JADX INFO: loaded from: classes35.dex */
public final class AdsPreviewStateManager implements GenericLifecycleObserver {
    public static List<String> LLJI;
    public static List<String> LLJIJIL;
    public static List<String> LLJILJIL;
    public InterfaceC2215921Bo6 LLILLL;
    public String LLIZ;
    public final C11PQ<AbstractC2215911Bo5> LL = new C11PQ<>();
    public final C11NJ LLILLJJLI = new C11NJ();
    public String LLILZ = "";
    public String LLILZIL = "";
    public String LLILZLL = "";
    public final Keva LLIZLLLIL = Keva.getRepo("ads_preview_keva");
    public String LLJ = "";

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            dispose();
        }
    }

    public final void LIZ() {
        IFeedDebugService iFeedDebugService = (IFeedDebugService) PluggableExtentionKt.pluggableSpi$default(IFeedDebugService.class, false, false, false, 14, null);
        if (iFeedDebugService == null) {
            LIZLLL(C2215931Bo7.LIZ);
            return;
        }
        Type type = new TypeToken<AdsOnDemandQuery>() { // from class: X.1Bo4
        }.getType();
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            String str = this.LLILZLL;
            c1227904rF.getClass();
            AdsOnDemandQuery adsOnDemandQuery = (AdsOnDemandQuery) C1227904rF.LIZJ(str, type);
            if (adsOnDemandQuery != null) {
                if (adsOnDemandQuery.features == null) {
                    if (adsOnDemandQuery.advId != null) {
                        C2097608Jq.LJ();
                    }
                }
                LIZLLL(C2215951Bo9.LIZ);
                new AwS683S0100000_34(this, 0);
                iFeedDebugService.LJJIJIIJI();
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZLLL(C2215931Bo7.LIZ);
    }

    public final void LIZIZ() {
        C0TPP c0tpp = C0TPP.LIZ;
        String str = C0D80.LIZ;
        c0tpp.getClass();
        this.LLILLJJLI.LIZ(((InterfaceC334160D8c) C0TPP.LIZIZ(InterfaceC334160D8c.class, str)).LIZ(this.LLILZ, this.LLILZIL).LJJIJIL(new AfS203S0100000_34(this, 6)).LJL(C11S5.LIZ()).LJJLL(new AfS203S0100000_34(this, 7), new AfS203S0100000_34(this, 8)));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void dispose() {
        this.LLILLJJLI.dispose();
    }

    public final void LIZLLL(AbstractC2215911Bo5 abstractC2215911Bo5) {
        this.LL.onNext(abstractC2215911Bo5);
    }

    public final void LIZJ(List<String> list, List<String> list2) {
        boolean z;
        LLJI = list;
        LLJIJIL = list2;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            this.LLIZLLLIL.storeLong("preview_timestamp", System.currentTimeMillis());
            this.LLIZLLLIL.storeStringArray("preview_adids", (String[]) list.toArray(new String[0]));
        }
        if (list2 != null && !list2.isEmpty()) {
            this.LLIZLLLIL.storeLong("preview_timestamp", System.currentTimeMillis());
            this.LLIZLLLIL.storeStringArray("preview_cids", (String[]) list2.toArray(new String[0]));
        }
    }
}
