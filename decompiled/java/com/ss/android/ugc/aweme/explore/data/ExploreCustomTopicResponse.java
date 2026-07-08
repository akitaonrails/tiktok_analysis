package com.ss.android.ugc.aweme.explore.data;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class ExploreCustomTopicResponse implements Serializable {

    @C09CT("custom_related_items_updated_count")
    public String customRelatedItemsUpdatedCount;

    @C09CT("has_red_point")
    public Boolean hasRedPoint;

    @C09CT("custom_topic_id")
    public final Long topicId;

    @C09CT("custom_topic_name")
    public final String topicName;

    public ExploreCustomTopicResponse() {
        this(null, null, Boolean.FALSE, null);
    }

    public final ExploreCustomTopicResponse copy(String str, Long l, Boolean bool, String str2) {
        return new ExploreCustomTopicResponse(str, l, bool, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreCustomTopicResponse)) {
            return false;
        }
        ExploreCustomTopicResponse exploreCustomTopicResponse = (ExploreCustomTopicResponse) obj;
        return Intrinsics.LJFF(this.topicName, exploreCustomTopicResponse.topicName) && Intrinsics.LJFF(this.topicId, exploreCustomTopicResponse.topicId) && Intrinsics.LJFF(this.hasRedPoint, exploreCustomTopicResponse.hasRedPoint) && Intrinsics.LJFF(this.customRelatedItemsUpdatedCount, exploreCustomTopicResponse.customRelatedItemsUpdatedCount);
    }

    public final void setCustomRelatedItemsUpdatedCount(String str) {
        this.customRelatedItemsUpdatedCount = str;
    }

    public final void setHasRedPoint(Boolean bool) {
        this.hasRedPoint = bool;
    }

    public ExploreCustomTopicResponse(String str, Long l, Boolean bool, String str2) {
        this.topicName = str;
        this.topicId = l;
        this.hasRedPoint = bool;
        this.customRelatedItemsUpdatedCount = str2;
    }
}
