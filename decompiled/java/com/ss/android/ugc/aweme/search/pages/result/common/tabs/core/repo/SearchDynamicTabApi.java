package com.ss.android.ugc.aweme.search.pages.result.common.tabs.core.repo;

import X.AbstractC19484711Kz;
import X.C01GW;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C452501pT;
import X.InterfaceC1485505rh;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501170pAR;
import X.InterfaceC2661011f;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.search.SearchTabInfo;
import com.ss.android.ugc.aweme.search.pages.result.common.tabs.core.model.SearchDynamicTabList;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS190S0000000_4;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchDynamicTabApi {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1837));

    public interface ISearchDynamicTabApi {
        @InterfaceC1485505rh
        @InterfaceC1501170pAR("/aweme/v1/search/tab/")
        AbstractC19484711Kz<SearchDynamicTabList> fetchSearchDynamicTabList(@InterfaceC1501100pAK("keyword") String str, @InterfaceC1501100pAK("enter_from") String str2, @InterfaceC1501100pAK("allow_tabs") String str3, @InterfaceC1501100pAK("is_non_personalized_search") Integer num, @InterfaceC1501100pAK("specified_tab_order_list") String str4);
    }

    public static AbstractC19484711Kz LIZ(String str, List list, String str2) {
        StringBuilder sb = new StringBuilder(e3.e);
        new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('\"');
                sbLIZ.append(((SearchTabInfo) obj).tabName);
                sbLIZ.append('\"');
                sb.append(C2188811AlT.LIZIZ(sbLIZ));
                if (i < list.size() - 1) {
                    sb.append(",");
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        sb.append(e3.f);
        return ((ISearchDynamicTabApi) ((InterfaceC2661011f) LIZ.getValue()).create(ISearchDynamicTabApi.class)).fetchSearchDynamicTabList(str, null, sb.toString(), Integer.valueOf(ComplianceServiceProvider.LJI().LJJII() ? 1 : 0), str2);
    }
}
