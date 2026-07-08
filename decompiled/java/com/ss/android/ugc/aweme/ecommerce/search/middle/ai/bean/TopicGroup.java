package com.ss.android.ugc.aweme.ecommerce.search.middle.ai.bean;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class TopicGroup {

    @C09CT("placement")
    public final Integer placement;

    @C09CT("placement_rank")
    public final Integer placementRank;

    @C09CT("related_tags")
    public final List<Object> relatedTags;

    @C09CT("source")
    public final String source;

    @C09CT("topic")
    public final AISuggestTopic topic;

    public TopicGroup() {
        this(null, null, null, null, null);
    }

    public TopicGroup(AISuggestTopic aISuggestTopic, List<Object> list, String str, Integer num, Integer num2) {
        this.topic = aISuggestTopic;
        this.relatedTags = list;
        this.source = str;
        this.placement = num;
        this.placementRank = num2;
    }
}
