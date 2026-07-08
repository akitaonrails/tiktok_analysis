package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.phototab.protocol;

import X.C0PZ9;
import X.C1697810uHb;
import X.C19EG;
import X.C301880BsQ;
import X.C644560PPy;
import X.C646870PYv;
import X.EnumC646900PYy;
import X.EnumC669620QOi;
import android.os.Bundle;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.search.lynx.core.config.SearchResultConfig;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.protocol.BaseSearchDynamicTabProtocol;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.tabconfig.SearchTabLynxEventConfig;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.tabconfig.SearchTabPlayConfig;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.phototab.fragment.SearchPhotoDynamicTabFragment;
import com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchPhotoDynamicTabProtocol implements BaseSearchDynamicTabProtocol {
    public final Class<? extends AbsSearchBaseFragment> LL = SearchPhotoDynamicTabFragment.class;

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.protocol.BaseSearchDynamicTabProtocol
    public final String vP2() {
        return EnumC669620QOi.PHOTO.getTabName();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.protocol.BaseSearchDynamicTabProtocol
    public final Class<? extends AbsSearchBaseFragment> LLJIJIL() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.protocol.BaseSearchDynamicTabProtocol
    public final C646870PYv Ij0(String str) {
        String strLJIL;
        n nVar;
        k kVarLJJIIZ;
        String tabName = EnumC669620QOi.PHOTO.getTabName();
        C644560PPy.LIZ.getClass();
        int iLJIILJJIL = C644560PPy.LJIILJJIL();
        SearchResultConfig searchResultConfigLIZ = C301880BsQ.LIZ();
        if (searchResultConfigLIZ == null || (nVar = searchResultConfigLIZ.verticalPhoto) == null || (kVarLJJIIZ = nVar.LJJIIZ("schema")) == null || (strLJIL = kVarLJJIIZ.LJIL()) == null) {
            strLJIL = "aweme://lynxview/?channel=fe_search_vertical_lynx&bundle=vertical-photolog/template.js&dynamic=3&target_handler=search_vertical&surl=https://lf-main-gecko-source.tiktokcdn.com/obj/byte-gurd-source-sg/8/gecko/resource/fe_search_vertical_lynx/vertical-photolog/template.js";
        }
        return new C646870PYv(tabName, iLJIILJJIL, strLJIL, null, true, true, true, false, 10, new SearchTabPlayConfig(false, false, false, false), "mt_photo", null, C1697810uHb.LJIIJJI(new SearchTabLynxEventConfig(EnumC646900PYy.FOLLOW_STATE.getLynxEventName()), new SearchTabLynxEventConfig(EnumC646900PYy.AWEME_COLLECT_STATE.getLynxEventName()), new SearchTabLynxEventConfig(EnumC646900PYy.DIGG_STATE.getLynxEventName())), 2184, null);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.protocol.BaseSearchDynamicTabProtocol
    public final Bundle bB1(C19EG c19eg, SearchResultParam searchResultParam, String str) {
        return C0PZ9.LIZ(this, searchResultParam, str);
    }
}
