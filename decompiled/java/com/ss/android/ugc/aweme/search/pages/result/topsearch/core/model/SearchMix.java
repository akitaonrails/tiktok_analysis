package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.C09CT;
import X.C321460Ciu;
import X.InterfaceC594520NTm;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class SearchMix extends SearchApiResult implements InterfaceC594520NTm {
    public final int LL = C321460Ciu.LIZ();

    @C09CT("aweme_list")
    public List<Aweme> awemeList;

    @C09CT("cursor")
    public int cursor;

    @C09CT("feedback_type")
    public String feedbackType;

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("search_item_list")
    public List<SearchItemStruct> searchItemList;

    public final List<RelevantClip> LJ() {
        SearchAwemeInfo searchAwemeInfo;
        ArrayList arrayList = new ArrayList();
        List<SearchItemStruct> list = this.searchItemList;
        if (list != null) {
            for (SearchItemStruct searchItemStruct : list) {
                if (searchItemStruct != null && (searchAwemeInfo = searchItemStruct.searchAwemeInfo) != null) {
                    arrayList.add(searchAwemeInfo.relevantClip);
                }
            }
        }
        return arrayList;
    }

    public final List<SearchAwemeInfo> LJI() {
        ArrayList arrayList = new ArrayList();
        List<SearchItemStruct> list = this.searchItemList;
        if (list != null && list.size() != 0) {
            Iterator<SearchItemStruct> it2 = this.searchItemList.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().searchAwemeInfo);
            }
        }
        return arrayList;
    }

    public final List<Aweme> getAwemeList() {
        Aweme aweme;
        ArrayList arrayList = new ArrayList();
        List<SearchItemStruct> list = this.searchItemList;
        if (list == null || list.size() == 0) {
            return this.awemeList;
        }
        for (SearchItemStruct searchItemStruct : this.searchItemList) {
            if (searchItemStruct != null && (aweme = searchItemStruct.aweme) != null) {
                arrayList.add(aweme);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC594520NTm
    public final int retrieveIncrementalId() {
        return this.LL;
    }
}
