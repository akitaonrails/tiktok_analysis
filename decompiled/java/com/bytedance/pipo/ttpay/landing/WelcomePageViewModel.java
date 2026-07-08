package com.bytedance.pipo.ttpay.landing;

import X.C098200Yq;
import X.C1559260qg8;
import X.C1716310ulR;
import X.C1717770unn;
import X.C1719770ur1;
import X.C1720020urQ;
import X.C189200o6;
import X.C2097608Jq;
import X.C723600SZy;
import X.InterfaceC0148002o;
import com.bytedance.pipo.stellar.base.dynamic.page.DynamicPageViewModel;
import com.bytedance.pipo.stellar.base.resourceloader.StellarChunk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes27.dex */
public final class WelcomePageViewModel extends DynamicPageViewModel<C1720020urQ> {
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, C1719770ur1.class, "KEY_ARG_LANDING"), true);
    public final Map<String, String> LLILLJJLI = new LinkedHashMap();
    public StellarChunk LLILLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1720020urQ(0);
    }

    public final Map<String, String> vQ2() {
        String str;
        String str2;
        String str3;
        Map<String, String> map = this.LLILLJJLI;
        String str4 = "";
        if (map != null) {
            C1719770ur1 c1719770ur1 = (C1719770ur1) this.LL.getValue();
            if (c1719770ur1 == null || (str3 = c1719770ur1.LL) == null) {
                str3 = "";
            }
            map.put("enter_from", str3);
        }
        Map<String, String> map2 = this.LLILLJJLI;
        if (map2 != null) {
            C1719770ur1 c1719770ur12 = (C1719770ur1) this.LL.getValue();
            if (c1719770ur12 == null || (str2 = c1719770ur12.LLILLJJLI) == null) {
                str2 = "";
            }
            map2.put("previous_page_id", str2);
        }
        Map<String, String> map3 = this.LLILLJJLI;
        if (map3 != null) {
            C1719770ur1 c1719770ur13 = (C1719770ur1) this.LL.getValue();
            if (c1719770ur13 != null && (str = c1719770ur13.LLILLL) != null) {
                str4 = str;
            }
            map3.put("trace_id", str4);
        }
        Map<String, String> map4 = this.LLILLJJLI;
        if (map4 != null) {
            map4.put("timestamp_collect", String.valueOf(System.currentTimeMillis()));
        }
        Map<String, String> map5 = this.LLILLJJLI;
        if (map5 != null) {
            map5.put("country_code", C1717770unn.LJIIIIZZ().getPriorityRegion());
        }
        return this.LLILLJJLI;
    }

    public final void xQ2(Map<String, String> map) {
        Map<String, String> mapVQ2 = vQ2();
        if (mapVQ2 != null) {
            map.putAll(mapVQ2);
        }
        map.put("event_type", "leave");
        C1716310ulR.LIZ.getClass();
        C1716310ulR.LIZLLL("pipo_page_stay", map);
    }

    public static void wQ2(int i, String str) {
        try {
            C1716310ulR c1716310ulR = C1716310ulR.LIZ;
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("load_result", String.valueOf(i)), new Pair("url", str), new Pair("page_id", "landing_page"));
            c1716310ulR.getClass();
            C1716310ulR.LIZLLL("rd_pipo_lottie_download", mapLJIIIIZZ);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
