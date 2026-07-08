package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.poitab.protocol;

import X.C0PZ9;
import X.C0PZS;
import X.C1101104Sj;
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
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.poitab.fragment.SearchPlaceContainerFragment;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.poitab.fragment.SearchPlaceDynamicTabFragment;
import com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchPlaceDynamicTabProtocol implements BaseSearchDynamicTabProtocol {
    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.protocol.BaseSearchDynamicTabProtocol
    public final Class<? extends AbsSearchBaseFragment> LLJIJIL() {
        return ((Number) C1101104Sj.LIZ.getValue()).intValue() == 1 ? SearchPlaceContainerFragment.class : SearchPlaceDynamicTabFragment.class;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.protocol.BaseSearchDynamicTabProtocol
    public final String vP2() {
        return EnumC669620QOi.PLACE.getTabName();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.protocol.BaseSearchDynamicTabProtocol
    public final C646870PYv Ij0(String str) {
        String strLJIL;
        n nVar;
        k kVarLJJIIZ;
        String tabName = EnumC669620QOi.PLACE.getTabName();
        int iLJIILL = C644560PPy.LJIILL();
        SearchResultConfig searchResultConfigLIZ = C301880BsQ.LIZ();
        if (searchResultConfigLIZ == null || (nVar = searchResultConfigLIZ.verticalPlace) == null || (kVarLJJIIZ = nVar.LJJIIZ("schema")) == null || (strLJIL = kVarLJJIIZ.LJIL()) == null) {
            strLJIL = "aweme://lynxview/?channel=fe_search_vertical_lynx&target_handler=search_vertical&bundle=vertical-poi/template.js&use_spark=1&preload_storage_keys=[tt_poi_search_permission]&ab_params=enable_search_network_jsb,show_poi_vertical_search,show_poi_vertical_search_collect,vertical_search_single_feedback,show_single_feedback_V2,tt_search_pressed_state,search_rounded_corners_UI_style_optimization,search_aid_feedback,enable_new_poi_card,refactor_search_vertical&surl=https://lf-main-gecko-source.tiktokcdn.com/obj/byte-gurd-source-sg/8/gecko/resource/fe_search_vertical_lynx/vertical-poi/template.js";
        }
        C0PZS.LIZ.getClass();
        return new C646870PYv(tabName, iLJIILL, strLJIL, "a2270.b0055", true, true, true, true, ((OptimizeConfig) C0PZS.LIZJ.getValue()).verticalPlace, new SearchTabPlayConfig(false, false, false, false), null, null, null, 7168, null);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.protocol.BaseSearchDynamicTabProtocol
    public final Bundle bB1(C19EG c19eg, SearchResultParam searchResultParam, String str) {
        return C0PZ9.LIZ(this, searchResultParam, str);
    }
}
