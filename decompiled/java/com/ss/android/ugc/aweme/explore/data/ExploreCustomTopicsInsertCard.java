package com.ss.android.ugc.aweme.explore.data;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreCustomTopicsInsertCard implements Serializable {

    @C09CT("explore_custom_topics")
    public final List<ExploreCustomTopicStruct> exploreCustomTopics;
    public LogPbBean logPbBean;
    public String requestId;

    public ExploreCustomTopicsInsertCard() {
        this(null, 1, null);
    }

    public ExploreCustomTopicsInsertCard(List<ExploreCustomTopicStruct> list) {
        this.exploreCustomTopics = list;
    }

    public final void setLogPbBean(LogPbBean logPbBean) {
        this.logPbBean = logPbBean;
    }

    public final void setRequestId(String str) {
        this.requestId = str;
    }

    public ExploreCustomTopicsInsertCard(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
