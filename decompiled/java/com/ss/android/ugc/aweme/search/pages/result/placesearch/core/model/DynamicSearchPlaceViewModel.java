package com.ss.android.ugc.aweme.search.pages.result.placesearch.core.model;

import X.C645500PTo;
import X.InterfaceC644450PPn;
import X.InterfaceC736910SvR;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.search.common.utils.SearchLocationCacheData;
import com.ss.android.ugc.aweme.search.pages.result.common.core.viewmodel.DynamicSearchBaseViewModel;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApi;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchRequestParam;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes11.dex */
public final class DynamicSearchPlaceViewModel extends DynamicSearchBaseViewModel {
    public String LL;

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.viewmodel.DynamicSearchBaseViewModel
    public final InterfaceC736910SvR<InterfaceC644450PPn> wQ2() {
        return new InterfaceC736910SvR<InterfaceC644450PPn>() { // from class: X.0PPl
            public final C644390PPh LL = new InterfaceC644450PPn() { // from class: X.0PPh
                @Override // X.InterfaceC644450PPn
                public final n LLZZZIL(SearchRequestParam searchRequestParam) {
                    SearchApi.LIZ.getClass();
                    try {
                        SearchApi.RealApi realApiLIZ = SearchApi.LIZ();
                        String str = searchRequestParam.keyword;
                        long j = searchRequestParam.cursor;
                        int i = searchRequestParam.count;
                        String str2 = searchRequestParam.searchSource;
                        String str3 = searchRequestParam.searchId;
                        String str4 = searchRequestParam.lastSearchId;
                        String str5 = searchRequestParam.searchContext;
                        String str6 = searchRequestParam.personalContextInfo;
                        Integer num = searchRequestParam.isNonPersonalizedSearch;
                        String str7 = searchRequestParam.sugGenerateType;
                        Long l = searchRequestParam.searchSessionId;
                        String str8 = searchRequestParam.endToEndSearchSessionId;
                        SearchLocationCacheData.LIZ.getClass();
                        return realApiLIZ.searchPlaceList(str, j, i, str2, str3, str4, str5, str6, num, str7, l, str8, SearchLocationCacheData.LIZLLL(SearchLocationCacheData.LJI, SearchLocationCacheData.LIZIZ, "place", "request"), searchRequestParam.currentLocationStatus, Integer.valueOf(searchRequestParam.LIZLLL), searchRequestParam.poiCardIdList, searchRequestParam.LIZJ).get();
                    } catch (ExecutionException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw AbstractC2126608Uu.getCompatibleException(e);
                    }
                }
            };

            @Override // X.InterfaceC736910SvR
            public final void release() {
            }

            @Override // X.InterfaceC736910SvR
            public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
                return this.LL;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.viewmodel.DynamicSearchBaseViewModel, com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.viewmodel.AbstractSearchDynamicTabViewModel
    public final void vQ2(SearchRequestParam searchRequestParam) {
        searchRequestParam.LIZLLL = C645500PTo.LIZIZ() ? 1 : 0;
        super.vQ2(searchRequestParam);
    }
}
