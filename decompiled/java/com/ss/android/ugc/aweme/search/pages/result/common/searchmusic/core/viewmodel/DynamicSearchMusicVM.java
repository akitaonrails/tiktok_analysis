package com.ss.android.ugc.aweme.search.pages.result.common.searchmusic.core.viewmodel;

import X.InterfaceC644450PPn;
import X.InterfaceC736910SvR;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.search.pages.result.common.core.viewmodel.DynamicSearchBaseViewModel;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApi;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchRequestParam;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes11.dex */
public final class DynamicSearchMusicVM extends DynamicSearchBaseViewModel {
    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.viewmodel.DynamicSearchBaseViewModel
    public final InterfaceC736910SvR<InterfaceC644450PPn> wQ2() {
        return new InterfaceC736910SvR<InterfaceC644450PPn>() { // from class: X.0PPk
            public final C644380PPg LL = new InterfaceC644450PPn() { // from class: X.0PPg
                @Override // X.InterfaceC644450PPn
                public final n LLZZZIL(SearchRequestParam searchRequestParam) {
                    int filterBy;
                    int sortType;
                    LinkedHashMap<String, Integer> linkedHashMap;
                    SearchApi.LIZ.getClass();
                    try {
                        SearchApi.RealApi realApiLIZ = SearchApi.LIZ();
                        long j = searchRequestParam.cursor;
                        String str = searchRequestParam.keyword;
                        String str2 = searchRequestParam.enterFrom;
                        int i = searchRequestParam.count;
                        int i2 = searchRequestParam.hotSearch;
                        String str3 = searchRequestParam.searchId;
                        String str4 = searchRequestParam.lastSearchId;
                        String str5 = searchRequestParam.searchSource;
                        int i3 = searchRequestParam.correctType;
                        C0PSG c0psg = searchRequestParam.LIZ;
                        int i4 = 1;
                        if (c0psg == null || c0psg.isDefaultOption()) {
                            i4 = 0;
                        }
                        C0PSG c0psg2 = searchRequestParam.LIZ;
                        if (c0psg2 != null) {
                            filterBy = c0psg2.getFilterBy();
                        } else {
                            filterBy = 0;
                        }
                        C0PSG c0psg3 = searchRequestParam.LIZ;
                        if (c0psg3 != null) {
                            sortType = c0psg3.getSortType();
                        } else {
                            sortType = 0;
                        }
                        C0PSG c0psg4 = searchRequestParam.LIZ;
                        if (c0psg4 == null || (linkedHashMap = c0psg4.activityToFieldMap()) == null) {
                            linkedHashMap = new LinkedHashMap<>();
                        }
                        return realApiLIZ.searchDynamicMusicList(j, str, str2, i, i2, str3, str4, "music", str5, i3, i4, filterBy, sortType, linkedHashMap, searchRequestParam.searchContext, searchRequestParam.personalContextInfo, searchRequestParam.isNonPersonalizedSearch, searchRequestParam.sugGenerateType, searchRequestParam.searchSessionId, searchRequestParam.endToEndSearchSessionId, searchRequestParam.LIZJ).get();
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
}
