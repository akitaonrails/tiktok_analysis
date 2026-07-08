package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.livetab.protocol;

import X.C0PZ9;
import X.C0PZS;
import X.C1697810uHb;
import X.C1840707Iv;
import X.C19EG;
import X.C301880BsQ;
import X.C644560PPy;
import X.C646870PYv;
import X.EnumC646900PYy;
import X.EnumC669620QOi;
import android.os.Bundle;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.search.lynx.core.config.OptimizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.config.SearchResultConfig;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.protocol.BaseSearchDynamicTabProtocol;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.tabconfig.SearchTabLynxEventConfig;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.tabconfig.SearchTabPlayConfig;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.livetab.fragment.SearchLiveDynamicTabFragment;
import com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchLiveDynamicTabProtocol implements BaseSearchDynamicTabProtocol {
    public final Class<? extends AbsSearchBaseFragment> LL = SearchLiveDynamicTabFragment.class;

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.protocol.BaseSearchDynamicTabProtocol
    public final String vP2() {
        return EnumC669620QOi.LIVE.getTabName();
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
        C644560PPy.LIZ.getClass();
        int iLJIIL = C644560PPy.LJIIL();
        SearchResultConfig searchResultConfigLIZ = C301880BsQ.LIZ();
        if (searchResultConfigLIZ == null || (nVar = searchResultConfigLIZ.verticalLive) == null || (kVarLJJIIZ = nVar.LJJIIZ("schema")) == null || (strLJIL = kVarLJJIIZ.LJIL()) == null) {
            strLJIL = "aweme://lynxview/?channel=fe_search_vertical_lynx&bundle=vertical-live/template.js&prefix=online/lynx/search-card&use_bdx=1";
        }
        C0PZS.LIZ.getClass();
        return new C646870PYv("live", iLJIIL, strLJIL, "a2270.b0371", true, true, true, false, ((OptimizeConfig) C0PZS.LIZJ.getValue()).verticalLive, new SearchTabPlayConfig(false, true, C1840707Iv.LIZ(), true), null, null, C1697810uHb.LJIIJJI(new SearchTabLynxEventConfig(EnumC646900PYy.FOLLOW_STATE.getLynxEventName()), new SearchTabLynxEventConfig(EnumC646900PYy.BLOCK_STATE.getLynxEventName())), 3200, null);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.protocol.BaseSearchDynamicTabProtocol
    public final Bundle bB1(C19EG c19eg, SearchResultParam searchResultParam, String str) {
        return C0PZ9.LIZ(this, searchResultParam, str);
    }
}
