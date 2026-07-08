package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import X.C1201190hMb;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class SearchUserList extends SearchApiResult {

    @C09CT("cursor")
    public int cursor;

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("user_list")
    public List<SearchUser> userList;

    @Override // com.ss.android.ugc.aweme.discover.model.SearchApiResult, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int getCursor() {
        return this.cursor;
    }

    public List<SearchUser> getUserList() {
        return this.userList;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public void setCursor(int i) {
        this.cursor = i;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setUserList(List<SearchUser> list) {
        this.userList = list;
    }
}
