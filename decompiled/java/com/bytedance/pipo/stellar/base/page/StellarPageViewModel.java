package com.bytedance.pipo.stellar.base.page;

import X.AnonymousClass0956;
import X.C098200Yq;
import X.C0PEM;
import X.C0X52;
import X.C1227904rF;
import X.C1488000opC;
import X.C1716280ulO;
import X.C1717770unn;
import X.C1718110uoL;
import X.C1719820ur6;
import X.C1719840ur8;
import X.C1719870urB;
import X.C1720030urR;
import X.C1776150wJx;
import X.C189200o6;
import X.C2097608Jq;
import X.C23250099c;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1717730unj;
import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.pipo.stellar.base.dynamic.page.DynamicPageViewModel;
import com.bytedance.pipo.stellar.base.model.CardDO;
import com.bytedance.pipo.stellar.base.resourceloader.StellarChunk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.foundation.network.interceptor.NetworkMonitorHandler;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS43S0310000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes27.dex */
public final class StellarPageViewModel extends DynamicPageViewModel<C1720030urR> {
    public static final /* synthetic */ int LLJILLL = 0;
    public C1719840ur8 LL;
    public StellarChunk LLILLJJLI;
    public boolean LLILZIL;
    public long LLIZ;
    public AnonymousClass0956 LLIZLLLIL;
    public AnonymousClass0956 LLJ;
    public int LLJI;
    public boolean LLJIJIL;
    public final C1716280ulO LLILLL = new C1716280ulO();
    public final Map<String, String> LLILZ = new LinkedHashMap();
    public final long LLILZLL = System.currentTimeMillis();
    public long LLJILJIL = System.currentTimeMillis();
    public final C1776150wJx LLJILJILJ = new C1776150wJx(CoroutineExceptionHandler.LJJLIL, this, 0);

    public final void BQ2() {
        String str;
        C1716280ulO c1716280ulO = this.LLILLL;
        C1719840ur8 c1719840ur8 = this.LL;
        c1716280ulO.getClass();
        if (c1719840ur8 == null || (str = c1719840ur8.LLJJI) == null) {
            return;
        }
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        PageFinder pageFinderVia = PageFinder.via(str);
        BcmParams bcmParams = new BcmParams();
        String str2 = c1716280ulO.LJI.get("active_scenario");
        if (str2 != null) {
            bcmParams.put("active_scenario", str2);
        }
        btmSDK.setBcmPageParams(pageFinderVia, bcmParams, null);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1720030urR(0);
    }

    public static boolean yQ2(CardDO cardDO) {
        String cardData = cardDO.getCardData();
        if (cardData == null || cardData.length() == 0 || Intrinsics.LJFF(cardDO.getCardShow(), CardStruct.IStatusCode.DEFAULT)) {
            return false;
        }
        return true;
    }

    public static Map zQ2(String str) {
        Object c098200Yq;
        Object obj = null;
        if (str == null) {
            return null;
        }
        try {
            Type type = new TypeToken<Map<String, Object>>() { // from class: X.0ur9
            }.getType();
            C1227904rF c1227904rF = C1227904rF.LIZ;
            String strDecode = Uri.decode(str);
            strDecode.toString();
            c1227904rF.getClass();
            c098200Yq = (Map) C1227904rF.LIZJ(strDecode, type);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (Map) obj;
    }

    public final void CQ2(C1719840ur8 c1719840ur8) {
        long jCurrentTimeMillis;
        String str;
        String str2;
        String str3;
        Long l;
        this.LL = c1719840ur8;
        if (c1719840ur8 != null && (l = c1719840ur8.LLJJJ) != null) {
            jCurrentTimeMillis = l.longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.LLJILJIL = jCurrentTimeMillis;
        C1716280ulO c1716280ulO = this.LLILLL;
        String str4 = null;
        if (c1719840ur8 != null) {
            str = c1719840ur8.LLILZIL;
            str2 = c1719840ur8.LLILLJJLI;
            str3 = c1719840ur8.LLILLL;
            str4 = c1719840ur8.LLILZ;
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        c1716280ulO.LIZIZ = str2;
        c1716280ulO.LIZJ = str4;
        c1716280ulO.LIZLLL = str3;
        if (str != null && str.length() > 0) {
            c1716280ulO.LIZ = str;
        }
    }

    public final void wQ2(Map<String, String> map) {
        long jCurrentTimeMillis;
        String str;
        String str2;
        Long l;
        C1719840ur8 c1719840ur8 = this.LL;
        if (c1719840ur8 != null && (l = c1719840ur8.LLJJJ) != null) {
            jCurrentTimeMillis = l.longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.LLJILJIL = jCurrentTimeMillis;
        this.LLJI = 0;
        this.LLJIJIL = false;
        AnonymousClass0956 anonymousClass0956 = this.LLJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09562 = this.LLIZLLLIL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        setState(AFwS268S0000000_26.get$arr$(36));
        C1719840ur8 c1719840ur82 = this.LL;
        if (c1719840ur82 != null && (str = c1719840ur82.LLIZ) != null && (str2 = c1719840ur82.LLIZLLLIL) != null) {
            this.LLIZLLLIL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ.plus(this.LLJILJILJ), null, new C1719820ur6(this, str, str2, vQ2(c1719840ur82.LLJI, map), null), 2);
        }
    }

    public static Map vQ2(String str, Map map) {
        Map mapZQ2 = zQ2(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (mapZQ2 == null) {
            mapZQ2 = C2097608Jq.LJ();
        }
        linkedHashMap.putAll(mapZQ2);
        if (map == null) {
            map = C2097608Jq.LJ();
        }
        linkedHashMap.putAll(map);
        C1488000opC c1488000opC = C1488000opC.LIZ;
        Context applicationContext = C1717770unn.LIZJ().getApplicationContext();
        c1488000opC.getClass();
        linkedHashMap.putAll(C1488000opC.LIZ(applicationContext));
        return linkedHashMap;
    }

    public final void DQ2(long j, String str) {
        String str2;
        C1716280ulO c1716280ulO = this.LLILLL;
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("quit_type", str);
        if (this.LLILZIL) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[1] = new Pair("is_load_data", str2);
        pairArr[2] = new Pair("stay_time", String.valueOf(j));
        pairArr[3] = new Pair("event_type", "leave");
        c1716280ulO.LIZJ("pipo_page_stay", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public final void xQ2(StellarChunk stellarChunk, boolean z) {
        StellarChunk stellarChunkLIZ;
        Map<String, Object> map;
        CardDO cardDO;
        this.LLILZIL = true;
        if (!z) {
            this.LLIZ = System.currentTimeMillis() - this.LLILZLL;
        }
        if (stellarChunk != null) {
            stellarChunkLIZ = C1719870urB.LIZ(stellarChunk, this.LLILLJJLI);
        } else {
            stellarChunkLIZ = null;
        }
        this.LLILLJJLI = stellarChunkLIZ;
        C1716280ulO c1716280ulO = this.LLILLL;
        if (stellarChunkLIZ != null) {
            map = stellarChunkLIZ.trackingParams;
        } else {
            map = null;
        }
        c1716280ulO.getClass();
        c1716280ulO.LJI = C1716280ulO.LIZ(map);
        C1716280ulO c1716280ulO2 = this.LLILLL;
        c1716280ulO2.getClass();
        c1716280ulO2.LJFF = "1";
        if (stellarChunkLIZ != null && (cardDO = stellarChunkLIZ.errorComponent) != null && yQ2(cardDO)) {
            this.LLJIJIL = false;
            AnonymousClass0956 anonymousClass0956 = this.LLJ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
        } else {
            cardDO = null;
        }
        setState(new AwS43S0310000_26(z, stellarChunkLIZ, cardDO, stellarChunk, 0));
    }

    public final Object AQ2(String str, String str2, Map<String, ? extends Object> map, String str3, List<String> list, Long l, InterfaceC1364105Vn<? super C0X52<BaseResponse<StellarChunk>>> interfaceC1364105Vn) {
        String str4;
        String str5;
        String str6;
        String str7;
        StellarPageApi.LIZ.getClass();
        InterfaceC1717730unj interfaceC1717730unjCreateBuilder = C1717770unn.LJIIJ().createBuilder(str);
        interfaceC1717730unjCreateBuilder.LIZIZ(new NetworkMonitorHandler());
        StellarPageApi stellarPageApi = (StellarPageApi) interfaceC1717730unjCreateBuilder.build().create(StellarPageApi.class);
        C1719840ur8 c1719840ur8 = this.LL;
        if (c1719840ur8 == null || (str4 = c1719840ur8.LLILZLL) == null) {
            str4 = "";
        }
        String str8 = null;
        if (c1719840ur8 != null) {
            str5 = c1719840ur8.LL;
            str6 = c1719840ur8.LLILLJJLI;
        } else {
            str5 = null;
            str6 = null;
        }
        String priorityRegion = C1717770unn.LJIIIIZZ().getPriorityRegion();
        String currentLocaleStr = C1717770unn.LIZLLL().getCurrentLocaleStr(C1717770unn.LIZJ().getApplicationContext());
        C1718110uoL.LIZ.getClass();
        String strLIZ = C1718110uoL.LIZ("");
        C1719840ur8 c1719840ur82 = this.LL;
        if (c1719840ur82 != null) {
            str7 = c1719840ur82.LLJ;
            str8 = c1719840ur82.LLJILJILJ;
        } else {
            str7 = null;
        }
        return stellarPageApi.getPageData(str2, str4, new StellarPageRequestWrapper(new StellarPageRequest(null, "android", str7, priorityRegion, currentLocaleStr, str8, null, list, str5, str6, strLIZ, null, map, null, str3, null, l)), interfaceC1364105Vn);
    }
}
