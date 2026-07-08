package com.ss.android.ugc.aweme.ecommerce.search.suggest.api;

import X.AbstractC2126608Uu;
import X.C01GW;
import X.C0QER;
import X.C0QES;
import X.C0QSR;
import X.C0QXU;
import X.C0QXV;
import X.C1ER1;
import X.C2232408os;
import X.C315220CXg;
import X.C341050DYp;
import X.C452501pT;
import X.C669590QOf;
import X.C669750QOv;
import X.C672650QZz;
import X.C674800QdS;
import X.InterfaceC1485505rh;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501240pAY;
import X.InterfaceC676470Qg9;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.gson.n;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchNewUserApi {
    public static final EcSearchNewUserApi LIZ = new EcSearchNewUserApi();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(106));

    public interface RealApi {
        @InterfaceC1501240pAY("/aweme/v1/search/new_user/ecom/")
        @InterfaceC1485505rh
        ListenableFuture<n> fetchEcSearchNewUserData(@InterfaceC1501100pAK("search_channel") String str, @InterfaceC1501100pAK("search_source") String str2, @InterfaceC1501100pAK("source") String str3, @InterfaceC1501120pAM("cursor") long j, @InterfaceC1501120pAM("count") int i, @InterfaceC1501100pAK("origin_is_mall_tab") String str4, @InterfaceC1501100pAK("traffic_source_list") String str5, @InterfaceC1501100pAK("search_context") String str6, @InterfaceC1501100pAK("enter_from") String str7, @InterfaceC1501100pAK("search_id") String str8, @InterfaceC1501100pAK("last_search_id") String str9, @InterfaceC1501100pAK("search_session_id") String str10, @InterfaceC1501100pAK("ec_search_session_id") String str11, @InterfaceC1501100pAK("user_rt_acts") String str12, @InterfaceC1501100pAK("passThroughParams") String str13, @InterfaceC1501100pAK("end_to_end_search_session_id") Long l);
    }

    public static n LIZ(C0QER c0qer) {
        String strLIZJ;
        String enterSearchFrom;
        Long endToEndSession;
        String paramByName;
        String ecSearchSessionId;
        C1ER1 c1er1 = C1ER1.LIZIZ;
        if (c1er1.LLIIIL()) {
            InterfaceC676470Qg9 interfaceC676470Qg9Y0 = c1er1.y0();
            if (interfaceC676470Qg9Y0 != null) {
                strLIZJ = interfaceC676470Qg9Y0.LIZ();
            } else {
                strLIZJ = null;
            }
        } else {
            C01GW<C669750QOv> c01gw = C669750QOv.LIZLLL;
            strLIZJ = C669590QOf.LIZ().LIZJ();
        }
        String value = C0QXU.CHANNEL_NEW_USER.getValue();
        String value2 = C0QXV.SOURCE_MIDDLE_PAGE_NEW_USER.getValue();
        String strLJLIL = a0.LJLIL(C0QSR.LIZ(c0qer), '[', ']');
        String str = "";
        if (c0qer == null || (enterSearchFrom = c0qer.getEnterSearchFrom()) == null) {
            enterSearchFrom = "";
        }
        String latestSearchId = c1er1.getLatestSearchId();
        C0QES c0qes = C0QES.LIZ;
        if (c0qer != null) {
            endToEndSession = c0qer.getEndToEndSession();
        } else {
            endToEndSession = null;
        }
        C674800QdS c674800QdS = new C674800QdS("", "middle_page", value2, 0, 0, "", latestSearchId, 0L, 0, enterSearchFrom, value, null, null, null, null, null, null, strLJLIL, null, null, 0, null, null, null, null, C0QES.LIZ(c0qes, endToEndSession, false, 6), null, null, null, null, null, null, null, null, null);
        if (c0qer == null || (paramByName = c0qer.getSearchSessionId()) == null) {
            paramByName = C315220CXg.LIZ().getParamByName("search_session_id");
        }
        c674800QdS.setSearchSessionId(paramByName);
        if (c0qer == null || (ecSearchSessionId = c0qer.getEcSearchSessionId()) == null) {
            ecSearchSessionId = "";
        }
        c674800QdS.setEcSearchSessionId(ecSearchSessionId);
        String paramByName2 = C315220CXg.LIZ().getParamByName("origin_is_mall_tab");
        if (paramByName2 == null) {
            paramByName2 = "";
        }
        c674800QdS.setOriginIsMallTab(paramByName2);
        c674800QdS.setSearchContext(strLIZJ);
        C672650QZz.LIZ.getClass();
        c674800QdS.setPassThroughParams(C672650QZz.LIZLLL(c0qer, "middle_new_customer_api_params"));
        try {
            RealApi realApi = (RealApi) LIZIZ.getValue();
            String str2 = c674800QdS.searchChannel;
            if (str2 != null) {
                str = str2;
            }
            String str3 = c674800QdS.source;
            String str4 = c674800QdS.searchSource;
            String str5 = c674800QdS.originIsMallTab;
            String str6 = c674800QdS.trafficSourceList;
            String str7 = c674800QdS.searchContext;
            String str8 = c674800QdS.enterFrom;
            String str9 = c674800QdS.searchId;
            String str10 = c674800QdS.lastSearchId;
            String str11 = c674800QdS.searchSessionId;
            String str12 = c674800QdS.ecSearchSessionId;
            C2232408os c2232408os = C341050DYp.LIZ;
            return realApi.fetchEcSearchNewUserData(str, str4, str3, 0L, 3, str5, str6, str7, str8, str9, str10, str11, str12, C341050DYp.LIZ(null), c674800QdS.passThroughParams, c674800QdS.endToEndSearchSessionId).get();
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }
}
