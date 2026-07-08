package com.ss.android.ugc.aweme.ecommerce.search.bubble.aftersearch;

import X.C08JS;
import X.C1768850w8B;
import X.C19EG;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2232408os;
import X.C2296808zG;
import X.C23250099c;
import X.C341050DYp;
import X.C641000PCg;
import X.C672940QaS;
import X.C672980QaW;
import X.C687460Qxs;
import X.C687470Qxt;
import X.C687490Qxv;
import X.C687500Qxw;
import X.C724240Sb0;
import X.EnumC1768950w8L;
import X.InterfaceC1055110dYz;
import android.os.Bundle;
import com.bytedance.hox.Hox;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.ecommerce.mall.MallServiceManager;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IShopIconService;
import com.ss.android.ugc.aweme.ecommerce.search.bubble.aftersearch.EcAfterSearchFeedBubbleComponent;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONException;

/* JADX INFO: loaded from: classes11.dex */
public final class EcAfterSearchFeedBubbleComponent extends BasePanelComponent {
    public final C687470Qxt LL = new InterfaceC1055110dYz() { // from class: X.0Qxt
        @Override // X.InterfaceC1583780rJg
        public final String getHoxNodeTag() {
            return "";
        }

        @Override // X.InterfaceC1055110dYz
        public final void onNodeHide(Bundle bundle) {
            this.LL.LLILLJJLI.LIZ = false;
        }

        @Override // X.InterfaceC1055110dYz
        public final void onNodeShow(Bundle bundle) throws JSONException {
            EcAfterSearchFeedBubbleComponent ecAfterSearchFeedBubbleComponent = this.LL;
            ecAfterSearchFeedBubbleComponent.LLILLJJLI.LIZ = true;
            ecAfterSearchFeedBubbleComponent.bo();
        }
    };
    public final C687490Qxv LLILLJJLI = new C687490Qxv();
    public final C687500Qxw LLILLL = new Object() { // from class: X.0Qxw
    };

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final void bo() throws JSONException {
        String strLJIILL;
        C687490Qxv c687490Qxv = this.LLILLJJLI;
        if (c687490Qxv.LIZ && c687490Qxv.LIZIZ) {
            C672980QaW.LL.getClass();
            EcSearchQuery ecSearchQuery = C672980QaW.LLILZ;
            if (ecSearchQuery == null || ecSearchQuery.query.length() == 0) {
                return;
            }
            getClass();
            long serverTimeMills = NetworkUtils.getServerTimeMills();
            long j = C687460Qxs.LIZIZ().ecSearchQueryValidCacheSeconds;
            long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
            long j3 = j * j2;
            if (j3 < 0 || serverTimeMills - ecSearchQuery.timestamp <= j3) {
                C641000PCg c641000PCg = C641000PCg.LIZ;
                String str = (ecSearchQuery.hasRequest || C687460Qxs.LIZIZ().newWordRequestDirectly != 1) ? "other" : "first";
                c641000PCg.getClass();
                C641000PCg.LIZ("start", str);
                if (ecSearchQuery.hasRequest || C687460Qxs.LIZIZ().newWordRequestDirectly != 1) {
                    long j4 = ecSearchQuery.lastRequestTime;
                    long j5 = C687460Qxs.LIZIZ().bubbleRequestIntervalSeconds * j2;
                    if (j4 >= 0 && serverTimeMills - j4 < j5) {
                        C641000PCg.LIZ("intercept", "other");
                        return;
                    }
                }
                C641000PCg c641000PCg2 = C641000PCg.LIZ;
                String str2 = (ecSearchQuery.hasRequest || C687460Qxs.LIZIZ().newWordRequestDirectly != 1) ? "other" : "first";
                c641000PCg2.getClass();
                C641000PCg.LIZ("request", str2);
                EcSearchQuery ecSearchQueryCopy = ecSearchQuery.copy(ecSearchQuery.query, ecSearchQuery.timestamp, true, NetworkUtils.getServerTimeMills());
                C672980QaW.LLILZ = ecSearchQueryCopy;
                C23250099c.LIZLLL(C672980QaW.LLILLJJLI, null, null, new C672940QaS(ecSearchQueryCopy, null), 3);
                IShopIconService iShopIconServiceLIZ = MallServiceManager.LIZIZ().LIZ();
                if (iShopIconServiceLIZ != null) {
                    EnumC1768950w8L enumC1768950w8L = EnumC1768950w8L.GENERAL_SEARCH;
                    C2232408os c2232408os = C341050DYp.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[\"");
                    sbLIZ.append(ecSearchQuery.query);
                    sbLIZ.append("\"]");
                    Map mapLIZJ = C2097908Jt.LIZJ(new Pair("after_search_query_list", C2188811AlT.LIZIZ(sbLIZ)));
                    try {
                        Map<String, LinkedList<Map<String, Object>>> map = C341050DYp.LJFF;
                        if (map.isEmpty()) {
                            strLJIILL = C08JS.LIZIZ().LJIILL(mapLIZJ);
                        } else {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                            linkedHashMap.putAll(mapLIZJ);
                            strLJIILL = C08JS.LIZIZ().LJIILL(linkedHashMap);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        strLJIILL = null;
                    }
                    iShopIconServiceLIZ.Pv(enumC1768950w8L, new C1768850w8B(strLJIILL, null, null, null, 14), null);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C672980QaW c672980QaW = C672980QaW.LL;
        C672980QaW.LIZ();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            Hox.LLJILJIL.LIZ(c19egLIZ).wQ2("For You", this.LL);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C672980QaW.LL.getClass();
        C2296808zG.LIZJ(C672980QaW.LLILLJJLI, null);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            Hox.LLJILJIL.LIZ(c19egLIZ).PQ2("For You", this.LL);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        this.LLILLJJLI.LIZIZ = false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() throws JSONException {
        super.onResume();
        this.LLILLJJLI.LIZIZ = true;
        bo();
    }
}
