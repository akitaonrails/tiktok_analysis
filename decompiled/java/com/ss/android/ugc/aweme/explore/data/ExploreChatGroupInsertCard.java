package com.ss.android.ugc.aweme.explore.data;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreChatGroupInsertCard implements Serializable {

    @C09CT("explore_chat_groups")
    public final List<ExploreChatGroupStruct> exploreChatGroups;
    public LogPbBean logPbBean;
    public String requestId;

    public ExploreChatGroupInsertCard() {
        this(new ArrayList());
    }

    public ExploreChatGroupInsertCard(List<ExploreChatGroupStruct> list) {
        this.exploreChatGroups = list;
    }

    public final void setLogPbBean(LogPbBean logPbBean) {
        this.logPbBean = logPbBean;
    }

    public final void setRequestId(String str) {
        this.requestId = str;
    }
}
