package com.ss.android.ugc.aweme.search.pages.middlepage.core.repo;

import X.C01GW;
import X.C15O7;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.discover.model.suggest.TopHistoryWordsResponse;
import com.ss.android.ugc.aweme.search.model.HistoryListDataResponse;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class HistoryWordsApi {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(268));

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.search.pages.middlepage.core.repo.HistoryWordsApi$HistoryWordsApi, reason: collision with other inner class name */
    public interface InterfaceC0019HistoryWordsApi {
        @InterfaceC1501240pAY("/aweme/v1/search/history/")
        @InterfaceC1501300pAe
        Object getSearchHistory(@InterfaceC1501100pAK("history_list") String str, InterfaceC1364105Vn<? super HistoryListDataResponse> interfaceC1364105Vn);

        @InterfaceC1501240pAY("/aweme/v1/search/top_history_words/")
        @InterfaceC1501300pAe
        C15O7<TopHistoryWordsResponse> getTopHistoryWords(@InterfaceC1501100pAK("from_group_id") String str, @InterfaceC1501100pAK("req_source") String str2, @InterfaceC1501100pAK("need_top_history") Integer num, @InterfaceC1501100pAK("history_list_v2") String str3, @InterfaceC1501100pAK("history_list_timestamp") String str4, @InterfaceC1501100pAK("top_history_words") String str5, @InterfaceC1501100pAK("recent_del_history_words") String str6);
    }
}
