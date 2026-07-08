package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class CreatorAIComment implements Serializable {

    @C09CT("has_ai_topic")
    public boolean hasAITopic;

    @C09CT("topic_name")
    public String topicName;

    public CreatorAIComment() {
        this(false, "");
    }

    public CreatorAIComment(boolean z, String str) {
        this.hasAITopic = z;
        this.topicName = str;
    }
}
