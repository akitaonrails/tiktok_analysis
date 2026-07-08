package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import X.C1201190hMb;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchUserHorizontalLoadMoreData extends SearchApiResult {

    @C09CT("aweme_list")
    public List<? extends Aweme> awemeList;

    @Override // com.ss.android.ugc.aweme.discover.model.SearchApiResult, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final void setAwemeList(List<? extends Aweme> list) {
        this.awemeList = list;
    }
}
