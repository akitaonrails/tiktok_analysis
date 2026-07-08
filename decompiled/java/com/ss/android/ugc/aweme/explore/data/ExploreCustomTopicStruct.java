package com.ss.android.ugc.aweme.explore.data;

import X.C09CT;
import X.C15U0;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreCustomTopicStruct implements Serializable {
    public static final C15U0 Companion = new Object() { // from class: X.15U0
    };
    public LogPbBean logPbBean;

    @C09CT("custom_related_items_count")
    public final String relatedItemsCount;
    public String requestId;

    @C09CT("topic_awemes")
    public final List<Aweme> topicAwemes;

    @C09CT("custom_topic_id")
    public final Long topicId;

    @C09CT("custom_topic_name")
    public final String topicName;

    public ExploreCustomTopicStruct() {
        this(null, null, null, null);
    }

    public final ExploreCustomTopicStruct copy(Long l, String str, String str2, List<? extends Aweme> list) {
        return new ExploreCustomTopicStruct(l, str, str2, list);
    }

    public final void setLogPbBean(LogPbBean logPbBean) {
        this.logPbBean = logPbBean;
    }

    public final void setRequestId(String str) {
        this.requestId = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExploreCustomTopicStruct(Long l, String str, String str2, List<? extends Aweme> list) {
        this.topicId = l;
        this.topicName = str;
        this.relatedItemsCount = str2;
        this.topicAwemes = list;
    }
}
