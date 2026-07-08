package com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.packages;

import X.AbstractC316870CbV;
import X.C0IJT;
import X.C1149560g1K;
import X.C1151190g3x;
import X.C1151360g4E;
import X.C1151410g4J;
import X.C1151430g4L;
import X.C1161920gLG;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C1548820qPI;
import X.C1804820x4C;
import X.C1804840x4E;
import X.C1807650x8l;
import X.C1815960xMA;
import X.C2217381BqS;
import X.C23250099c;
import X.C262100zr;
import X.C316650Cb9;
import X.C317290CcB;
import X.C474500IjA;
import X.C500260Jjc;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1141530foN;
import X.InterfaceC1364105Vn;
import X.InterfaceC1816020xMG;
import X.InterfaceC1816030xMH;
import X.InterfaceC1891350zJl;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.firstrecharge.RechargePanelExchangeParams;
import com.bytedance.android.livesdk.firstrecharge.RechargePanelInputParams;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.PackageListAbility;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.PanelHostAbility;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS36S1110000_17;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class PackageListViewModel extends AssemListViewModel<C1815960xMA, InterfaceC1816030xMH, Integer> implements PackageListAbility, InterfaceC1141530foN {
    public final PanelHostAbility LL;
    public final TouchPointAbility LLILLJJLI;
    public final MutableLiveData<InterfaceC1816020xMG> LLILLL = new MutableLiveData<>();
    public final MutableLiveData<Integer> LLILZ = new MutableLiveData<>();
    public boolean LLILZIL;
    public boolean LLILZLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C1548820qPI.LIZLLL("cancel_recharge_v3_retention_popup_switch_tab", this);
        C1548820qPI.LIZLLL("cancel_recharge_v3_retention_popup_pay", this);
        C1548820qPI.LIZLLL("cancel_recharge_v3_retention_popup_cancel", this);
        AssemViewModel.selectSubscribe$default(this, new C2217381BqS() { // from class: X.0xMD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1815960xMA) obj).LL;
            }
        }, null, null, null, new AwS606S0100000_27(this, 70), 14, null);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        RechargePanelInputParams inputParams = this.LL.getInputParams();
        return new C1815960xMA(C1149560g1K.LIZJ(inputParams != null ? inputParams.exchangeParams : null), 251);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.PackageListAbility
    public final String Iv0() {
        return ((C1815960xMA) getState()).LLIZ;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C1548820qPI.LJIIIIZZ("cancel_recharge_v3_retention_popup_switch_tab", this);
        C1548820qPI.LJIIIIZZ("cancel_recharge_v3_retention_popup_pay", this);
        C1548820qPI.LJIIIIZZ("cancel_recharge_v3_retention_popup_cancel", this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.PackageListAbility
    public final C1804840x4E uD1() {
        return ((C1815960xMA) getState()).LLILZ;
    }

    @Override // com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.PackageListAbility
    public final /* bridge */ /* synthetic */ MutableLiveData pV1() {
        return this.LLILLL;
    }

    @Override // com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.PackageListAbility
    public final /* bridge */ /* synthetic */ MutableLiveData rT1() {
        return this.LLILZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.PackageListAbility
    public final HashMap<String, Object> UB2(C1804840x4E c1804840x4E) {
        String strLJIIIIZZ;
        int i;
        C1804820x4C c1804820x4C;
        C1815960xMA c1815960xMA = (C1815960xMA) getState();
        c1815960xMA.getClass();
        HashMap<String, Object> map = new HashMap<>();
        if ((c1804840x4E == null && (c1804840x4E = c1815960xMA.LLILZ) == null) || (strLJIIIIZZ = c1804840x4E.LJIIIIZZ()) == null) {
            strLJIIIIZZ = "tiktok";
        }
        String str = c1815960xMA.LLIZ;
        if (str == null) {
            i = 0;
        } else {
            strLJIIIIZZ = str;
            i = 1;
        }
        map.put("panel_channel", strLJIIIIZZ);
        map.put("recharge_v3_version", Integer.valueOf(((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).getRechargeService().LIZJ()));
        Boolean boolValueOf = null;
        if ((c1804840x4E instanceof C1804820x4C) && (c1804820x4C = (C1804820x4C) c1804840x4E) != null) {
            boolValueOf = Boolean.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(c1804820x4C.LJJ())));
        }
        map.put("has_pipo_recharge_before", Integer.valueOf(C500260Jjc.LJJJI(boolValueOf) ? 1 : 0));
        map.put("switch_panel_type", C1151360g4E.LJ(strLJIIIIZZ, c1804840x4E));
        map.put("is_switch_panel_type", Integer.valueOf(i));
        return map;
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        if (Intrinsics.LJFF(c262100zr.LIZ, "cancel_recharge_v3_retention_popup_switch_tab") || Intrinsics.LJFF(c262100zr.LIZ, "cancel_recharge_v3_retention_popup_pay") || Intrinsics.LJFF(c262100zr.LIZ, "cancel_recharge_v3_retention_popup_cancel")) {
            C23250099c.LIZLLL(getAssemVMScope(), null, null, new C1807650x8l(this, c262100zr, null), 3);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1816030xMH> c627660Ojc) {
        setState(new AwS606S0100000_27(c627660Ojc, (C627660Ojc<InterfaceC1816030xMH>) 69));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e8  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Integer>> r10) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.packages.PackageListViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public final void wQ2(InterfaceC1816020xMG interfaceC1816020xMG) {
        ?? arrayList;
        this.LL.lW0();
        List<InterfaceC1891350zJl> listListGetAll = listGetAll();
        if (listListGetAll != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(listListGetAll, 10));
            for (InterfaceC1891350zJl interfaceC1891350zJlLJIIL : listListGetAll) {
                if (Intrinsics.LJFF(interfaceC1891350zJlLJIIL, interfaceC1816020xMG)) {
                    interfaceC1891350zJlLJIIL = interfaceC1816020xMG.LJIJI();
                } else if (interfaceC1891350zJlLJIIL instanceof InterfaceC1816020xMG) {
                    interfaceC1891350zJlLJIIL = ((InterfaceC1816020xMG) interfaceC1891350zJlLJIIL).LJIIL();
                }
                arrayList.add(interfaceC1891350zJlLJIIL);
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        listSetItems(arrayList);
    }

    public PackageListViewModel(PanelHostAbility panelHostAbility, TouchPointAbility touchPointAbility) {
        this.LL = panelHostAbility;
        this.LLILLJJLI = touchPointAbility;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Integer num, InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        num.intValue();
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        IllegalStateException illegalStateException = new IllegalStateException("load more not supported");
        c317290CcB.getClass();
        return new C316650Cb9(illegalStateException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList vQ2(String str, C1804840x4E c1804840x4E) {
        boolean z;
        List listLIZ;
        Integer numValueOf;
        RechargePanelExchangeParams rechargePanelExchangeParams;
        List listLIZ2;
        List listLIZ3;
        Integer numValueOf2;
        String strLJIIIIZZ = str;
        if (c1804840x4E != null && c1804840x4E.LJIJJ()) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String str2 = "tiktok";
        Map<String, String> logExtra = null;
        if (strLJIIIIZZ == null && (c1804840x4E == null || (strLJIIIIZZ = c1804840x4E.LJIIIIZZ()) == null)) {
            strLJIIIIZZ = "tiktok";
        }
        if (Intrinsics.LJFF(strLJIIIIZZ, "tiktok")) {
            str2 = "google_play";
        }
        if (z) {
            if (c1804840x4E != null) {
                Diamond diamond = (Diamond) C13LP.LJJJLL(c1804840x4E.LJIIJJI(strLJIIIIZZ, false));
                if (diamond != null) {
                    numValueOf2 = Integer.valueOf(diamond.id);
                } else {
                    numValueOf2 = null;
                }
                listLIZ2 = C1151430g4L.LIZ(c1804840x4E, numValueOf2, strLJIIIIZZ);
                listLIZ3 = C1151430g4L.LIZ(c1804840x4E, -1, str2);
            } else {
                listLIZ2 = C13BV.INSTANCE;
                listLIZ3 = C13BV.INSTANCE;
            }
            arrayList2.addAll(listLIZ2);
            arrayList.addAll(listLIZ3);
        } else {
            if (c1804840x4E != null) {
                Diamond diamond2 = (Diamond) C13LP.LJJJLL(c1804840x4E.LJIIJJI(null, false));
                if (diamond2 != null) {
                    numValueOf = Integer.valueOf(diamond2.id);
                } else {
                    numValueOf = null;
                }
                listLIZ = C1151430g4L.LIZ(c1804840x4E, numValueOf, null);
            } else {
                listLIZ = C13BV.INSTANCE;
            }
            arrayList2.addAll(listLIZ);
        }
        RechargePanelInputParams inputParams = this.LL.getInputParams();
        if (inputParams != null) {
            rechargePanelExchangeParams = inputParams.exchangeParams;
        } else {
            rechargePanelExchangeParams = null;
        }
        if (!((C1815960xMA) getState()).LLILLJJLI && ((C1815960xMA) getState()).LLILLL && rechargePanelExchangeParams != null) {
            if (!this.LLILZLL) {
                RechargePanelInputParams inputParams2 = this.LL.getInputParams();
                TouchPointAbility touchPointAbility = this.LLILLJJLI;
                if (touchPointAbility != null) {
                    logExtra = touchPointAbility.getLogExtra();
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_exchange_show");
                C1151190g3x.LIZIZ(c474500IjALIZ, inputParams2, logExtra, false);
                c474500IjALIZ.LIZ();
                this.LLILZLL = true;
            }
            C1151410g4J c1151410g4J = new C1151410g4J("", 1L, C1149560g1K.LIZ(1L, rechargePanelExchangeParams), false);
            if (!arrayList2.isEmpty()) {
                ListProtector.add(arrayList2, 0, c1151410g4J);
            }
            if (z) {
                if (true ^ arrayList.isEmpty()) {
                    ListProtector.add(arrayList, 0, c1151410g4J);
                }
                HashMap map = new HashMap();
                map.put(strLJIIIIZZ, arrayList2);
                map.put(str2, arrayList);
                setStateImmediate(new AwS606S0100000_27(map, (HashMap<String, ArrayList<InterfaceC1816020xMG>>) 484));
            }
        } else if (z) {
            HashMap map2 = new HashMap();
            map2.put(strLJIIIIZZ, arrayList2);
            map2.put(str2, arrayList);
            setStateImmediate(new AwS606S0100000_27(map2, (HashMap<String, ArrayList<InterfaceC1816020xMG>>) 484));
        }
        return arrayList2;
    }

    @Override // com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.PackageListAbility
    public final void xo2(String str, boolean z) {
        withState(new AwS36S1110000_17(str, z, this, 0));
    }
}
