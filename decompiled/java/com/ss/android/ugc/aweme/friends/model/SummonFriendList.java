package com.ss.android.ugc.aweme.friends.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class SummonFriendList extends BaseResponse {

    @C09CT("cursor")
    public long cursor;

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("user_list")
    public List<SummonFriendItem> items;

    @C09CT("input_keyword")
    public String keyword;

    @C09CT("log_pb")
    public LogPbBean logPbBean;

    @C09CT("rid")
    public String requestId;

    public long getCursor() {
        return this.cursor;
    }

    public List<SummonFriendItem> getItems() {
        return this.items;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public LogPbBean getLogPbBean() {
        return this.logPbBean;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public void setCursor(long j) {
        this.cursor = j;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setItems(List<SummonFriendItem> list) {
        this.items = list;
    }

    public void setKeyword(String str) {
        this.keyword = str;
    }

    public void setLogPbBean(LogPbBean logPbBean) {
        this.logPbBean = logPbBean;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public SummonFriendList(List<SummonFriendItem> list, long j, boolean z, String str) {
        this.items = list;
        this.cursor = j;
        this.hasMore = z;
        this.keyword = str;
    }
}
