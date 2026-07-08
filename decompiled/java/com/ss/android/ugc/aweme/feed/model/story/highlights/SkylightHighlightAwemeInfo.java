package com.ss.android.ugc.aweme.feed.model.story.highlights;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class SkylightHighlightAwemeInfo implements Serializable {

    @C09CT("aweme_id")
    public final Long awemeId;

    @C09CT("is_viewed")
    public final Boolean isViewed;

    @C09CT("highlight_collection_info")
    public final StoryHighlightInfo storyHighlightInfo;

    public SkylightHighlightAwemeInfo() {
        this(null, Boolean.FALSE, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkylightHighlightAwemeInfo)) {
            return false;
        }
        SkylightHighlightAwemeInfo skylightHighlightAwemeInfo = (SkylightHighlightAwemeInfo) obj;
        return Intrinsics.LJFF(this.awemeId, skylightHighlightAwemeInfo.awemeId) && Intrinsics.LJFF(this.isViewed, skylightHighlightAwemeInfo.isViewed) && Intrinsics.LJFF(this.storyHighlightInfo, skylightHighlightAwemeInfo.storyHighlightInfo);
    }

    public int hashCode() {
        Long l = this.awemeId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Boolean bool = this.isViewed;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        StoryHighlightInfo storyHighlightInfo = this.storyHighlightInfo;
        return iHashCode2 + (storyHighlightInfo != null ? storyHighlightInfo.hashCode() : 0);
    }

    public final Boolean isViewed() {
        return this.isViewed;
    }

    public SkylightHighlightAwemeInfo(Long l, Boolean bool, StoryHighlightInfo storyHighlightInfo) {
        this.awemeId = l;
        this.isViewed = bool;
        this.storyHighlightInfo = storyHighlightInfo;
    }
}
