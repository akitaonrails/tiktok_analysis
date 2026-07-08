package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.musictab.protocol;

import X.C0PZ9;
import X.C0PZS;
import X.C19EG;
import X.C301880BsQ;
import X.C644560PPy;
import X.C646870PYv;
import X.EnumC669620QOi;
import android.os.Bundle;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.search.lynx.core.config.OptimizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.config.SearchResultConfig;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.protocol.BaseSearchDynamicTabProtocol;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.tabconfig.SearchTabPlayConfig;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.musictab.fragment.SearchMusicDynamicTabFragment;
import com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMusicDynamicTabProtocol implements BaseSearchDynamicTabProtocol {
    public final Class<? extends AbsSearchBaseFragment> LL = SearchMusicDynamicTabFragment.class;

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.protocol.BaseSearchDynamicTabProtocol
    public final String vP2() {
        return EnumC669620QOi.SOUND.getTabName();
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
        int iLJIJ = C644560PPy.LJIJ();
        SearchResultConfig searchResultConfigLIZ = C301880BsQ.LIZ();
        if (searchResultConfigLIZ == null || (nVar = searchResultConfigLIZ.verticalSounds) == null || (kVarLJJIIZ = nVar.LJJIIZ("schema")) == null || (strLJIL = kVarLJJIIZ.LJIL()) == null) {
            strLJIL = "aweme://lynxview/?channel=fe_search_vertical_lynx&bundle=vertical-sounds/template.js&prefix=online/lynx/search-card&use_bdx=1";
        }
        C0PZS.LIZ.getClass();
        return new C646870PYv("music", iLJIJ, strLJIL, "a2270.b0391", true, true, true, false, ((OptimizeConfig) C0PZS.LIZJ.getValue()).verticalSounds, new SearchTabPlayConfig(true, false, false, false), null, null, null, 7296, null);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.protocol.BaseSearchDynamicTabProtocol
    public final Bundle bB1(C19EG c19eg, SearchResultParam searchResultParam, String str) {
        return C0PZ9.LIZ(this, searchResultParam, str);
    }
}
