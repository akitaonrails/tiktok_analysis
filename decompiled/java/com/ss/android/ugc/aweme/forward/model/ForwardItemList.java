package com.ss.android.ugc.aweme.forward.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Extra;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ForwardItemList {

    @C09CT("error_code")
    public int error_code;

    @C09CT("extra")
    public Extra extra;

    @C09CT("has_more")
    public int hasMore;

    @C09CT("forward_list")
    public List<Aweme> items;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT(alternate = {"max_time"}, value = "max_cursor")
    public long maxCursor;

    @C09CT(alternate = {"min_time"}, value = "min_cursor")
    public long minCursor;

    @C09CT("status_code")
    public int status_code;

    @C09CT("status_msg")
    public String status_msg;

    public int getError_code() {
        return this.error_code;
    }

    public Extra getExtra() {
        return this.extra;
    }

    public int getHasMore() {
        return this.hasMore;
    }

    public List<Aweme> getItems() {
        return this.items;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public long getMaxCursor() {
        return this.maxCursor;
    }

    public long getMinCursor() {
        return this.minCursor;
    }

    public int getStatus_code() {
        return this.status_code;
    }

    public String getStatus_msg() {
        return this.status_msg;
    }

    public void setError_code(int i) {
        this.error_code = i;
    }

    public void setExtra(Extra extra) {
        this.extra = extra;
    }

    public void setHasMore(int i) {
        this.hasMore = i;
    }

    public void setItems(List<Aweme> list) {
        this.items = list;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setMaxCursor(long j) {
        this.maxCursor = j;
    }

    public void setMinCursor(long j) {
        this.minCursor = j;
    }

    public void setStatus_code(int i) {
        this.status_code = i;
    }

    public void setStatus_msg(String str) {
        this.status_msg = str;
    }
}
