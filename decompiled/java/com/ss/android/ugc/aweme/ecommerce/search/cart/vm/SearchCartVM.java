package com.ss.android.ugc.aweme.ecommerce.search.cart.vm;

import X.AnonymousClass0186;
import X.C098200Yq;
import X.C11S5;
import X.C13SZ;
import X.C1701940uOG;
import X.C1741890vQh;
import X.C189200o6;
import X.C2097608Jq;
import X.C683340QrE;
import X.C683390QrJ;
import X.C683400QrK;
import X.EnumC668970QLv;
import X.InterfaceC0148002o;
import X.InterfaceC668960QLu;
import Y.AfS44S1100000_10;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.cart.repo.SearchCartApi;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS25S0001000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS61S1000000_10;
import kotlin.jvm.internal.AwS98S0110000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchCartVM extends AssemViewModel<C683390QrJ> implements InterfaceC668960QLu {
    public static final /* synthetic */ int LL = 0;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C683390QrJ(0);
    }

    @Override // X.InterfaceC668960QLu
    public final void L01(View view) {
        if (view != null) {
            setState(new AwS589S0100000_10(view, 24));
        }
        boolean z = true;
        Pair[] pairArr = new Pair[1];
        if (view != null) {
            z = false;
        }
        pairArr[0] = new Pair("view_is_null", Boolean.valueOf(z));
        AnonymousClass0186.LIZ("vm_updateCanvasView", C2097608Jq.LJIIJ(pairArr));
    }

    public final void yQ2(View view) {
        if (view != null) {
            setState(new AwS589S0100000_10(view, 25));
        }
        boolean z = true;
        Pair[] pairArr = new Pair[1];
        if (view != null) {
            z = false;
        }
        pairArr[0] = new Pair("view_is_null", Boolean.valueOf(z));
        AnonymousClass0186.LIZ("vm_updateLynxContainerView", C2097608Jq.LJIIJ(pairArr));
    }

    @Override // X.InterfaceC668960QLu
    public final void Xh0(boolean z, EnumC668970QLv enumC668970QLv) {
        setState(new AwS98S0110000_10(z, enumC668970QLv, 0));
        AnonymousClass0186.LIZ("vm_enableEntranceShow", C2097608Jq.LJIIJ(new Pair("enable", Boolean.valueOf(z)), new Pair("source", enumC668970QLv.getChangeSource())));
    }

    public final void wQ2(String str, String str2) {
        setState(new AwS61S1000000_10(str, 1));
        SearchCartApi.LIZ.getClass();
        disposeOnClear(C683400QrK.LIZIZ.searchCartEntryEcom(str2).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS44S1100000_10(this, str, 0), new AfS44S1100000_10(this, str, 1)));
        AnonymousClass0186.LIZ("vm_requestCartInfo", C2097608Jq.LJIIJ(new Pair("source", str), new Pair("searchChannel", str2)));
        C683340QrE c683340QrE = C683340QrE.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("search_channel", str2);
        linkedHashMap.put("trigger_type", str);
        linkedHashMap.put("is_login", "1");
        c683340QrE.getClass();
        C683340QrE.LIZ("rd_tiktokec_cart_request_send", linkedHashMap);
    }

    public final void xQ2(int i, String str) {
        setState(new AwS25S0001000_10(i, 19));
        AnonymousClass0186.LIZ("vm_updateCartItemCount", C2097608Jq.LJIIJ(new Pair("source", str), new Pair("count", Integer.valueOf(i))));
    }

    public final void vQ2(String str, String str2, Long l, Throwable th) {
        String string;
        String strLIZIZ;
        String str3 = "";
        setState(new AwS61S1000000_10(str, str2, th, 0));
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("source", str), new Pair("reason", str2));
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("msg", "vm_onRequestCartFailed");
            linkedHashMap.putAll(mapLJIIJ);
            if (th == null || (strLIZIZ = C13SZ.LIZIZ(th)) == null) {
                strLIZIZ = "";
            }
            linkedHashMap.put("exception", strLIZIZ);
            C1741890vQh.LJIIIIZZ(linkedHashMap);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
        C683340QrE c683340QrE = C683340QrE.LIZ;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("trigger_type", str);
        String str4 = "1";
        linkedHashMap2.put("is_login", "1");
        linkedHashMap2.put("is_success", CardStruct.IStatusCode.DEFAULT);
        if (l != null && (string = l.toString()) != null) {
            str3 = string;
        }
        linkedHashMap2.put("code", str3);
        linkedHashMap2.put("msg", str2);
        if (th != null) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap2.put("error_type", str4);
        c683340QrE.getClass();
        C683340QrE.LIZ("rd_tiktokec_cart_request_end", linkedHashMap2);
    }
}
