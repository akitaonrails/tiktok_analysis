package com.ss.android.ugc.aweme.challenge.model;

import X.C09CT;
import X.C0X12;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public class ChallengeAwemeList extends BaseResponse implements C0X12 {

    @C09CT("cursor")
    public long cursor;

    @C09CT("has_more")
    public int hasMore;

    @C09CT("aweme_list")
    public List<Aweme> items;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("mix_list")
    public List<MixCardStruct> mixList;

    @C09CT("rid")
    public String requestId;

    public boolean isHasMore() {
        return this.hasMore == 1;
    }

    public long getCursor() {
        return this.cursor;
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

    public List<MixCardStruct> getMixList() {
        return this.mixList;
    }

    @Override // X.C0X12
    public String getRequestId() {
        return this.requestId;
    }

    public void setCursor(long j) {
        this.cursor = j;
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

    public void setMixList(List<MixCardStruct> list) {
        this.mixList = list;
    }

    @Override // X.C0X12
    public void setRequestId(String str) {
        this.requestId = str;
    }
}
