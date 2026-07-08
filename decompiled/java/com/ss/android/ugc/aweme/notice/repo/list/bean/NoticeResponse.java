package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class NoticeResponse extends BaseResponse {

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("notice_list")
    public List<BaseNotice> items;

    @C09CT("last_read_time")
    public long lastReadTime;

    @C09CT("log_pb")
    public LogPbBean logPbBean;

    @C09CT("max_time")
    public long maxTime;

    @C09CT("min_time")
    public long minTime;

    @C09CT("total")
    public int total;

    @C09CT("vcd_merge_total")
    public int vcdMergeTotal;

    @C09CT("vcd_toast_text")
    public String vcdToastText;

    public List<BaseNotice> getItems() {
        return this.items;
    }

    public long getLastReadTime() {
        return this.lastReadTime;
    }

    public long getMaxTime() {
        return this.maxTime;
    }

    public long getMinTime() {
        return this.minTime;
    }

    public int getStatusCode() {
        return this.status_code;
    }

    public int getTotal() {
        return this.total;
    }

    public int getVcdMergeTotal() {
        return this.vcdMergeTotal;
    }

    public String getVcdToastText() {
        return this.vcdToastText;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setItems(List<BaseNotice> list) {
        this.items = list;
    }

    public void setLastReadTime(long j) {
        this.lastReadTime = j;
    }

    public void setMaxTime(long j) {
        this.maxTime = j;
    }

    public void setMinTime(long j) {
        this.minTime = j;
    }

    public void setStatusCode(int i) {
        this.status_code = i;
    }

    public void setTotal(int i) {
        this.total = i;
    }

    public void setVcdMergeTotal(int i) {
        this.vcdMergeTotal = i;
    }

    public void setVcdToastText(String str) {
        this.vcdToastText = str;
    }
}
