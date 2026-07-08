package com.ss.android.ugc.aweme.feed.model.story.highlights;

import X.C09CT;
import X.C786410Ut5;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StoryHighlightInfo implements Serializable {

    @C09CT("collection_ids")
    public final List<String> collectionIds;

    @C09CT("container_collection_info")
    public final StoryHighlightCollection containerCollectionInfo;

    @C09CT("primary_collection_info")
    public final StoryHighlightCollection primaryCollectionInfo;
    public transient boolean sharedFromHighlightImmersiveFeed;
    public transient boolean sharedFromProfile;

    public StoryHighlightInfo() {
        this(null, null, null, false, false);
    }

    public final StoryHighlightInfo copy(StoryHighlightCollection storyHighlightCollection, StoryHighlightCollection storyHighlightCollection2, List<String> list, boolean z, boolean z2) {
        return new StoryHighlightInfo(storyHighlightCollection, storyHighlightCollection2, list, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryHighlightInfo)) {
            return false;
        }
        StoryHighlightInfo storyHighlightInfo = (StoryHighlightInfo) obj;
        return Intrinsics.LJFF(this.primaryCollectionInfo, storyHighlightInfo.primaryCollectionInfo) && Intrinsics.LJFF(this.containerCollectionInfo, storyHighlightInfo.containerCollectionInfo) && Intrinsics.LJFF(this.collectionIds, storyHighlightInfo.collectionIds) && this.sharedFromProfile == storyHighlightInfo.sharedFromProfile && this.sharedFromHighlightImmersiveFeed == storyHighlightInfo.sharedFromHighlightImmersiveFeed;
    }

    public int hashCode() {
        StoryHighlightCollection storyHighlightCollection = this.primaryCollectionInfo;
        int iHashCode = (storyHighlightCollection == null ? 0 : storyHighlightCollection.hashCode()) * 31;
        StoryHighlightCollection storyHighlightCollection2 = this.containerCollectionInfo;
        int iHashCode2 = (iHashCode + (storyHighlightCollection2 == null ? 0 : storyHighlightCollection2.hashCode())) * 31;
        List<String> list = this.collectionIds;
        return ((((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.sharedFromProfile)) * 31) + C786410Ut5.Z2(this.sharedFromHighlightImmersiveFeed);
    }

    public final void setSharedFromHighlightImmersiveFeed(boolean z) {
        this.sharedFromHighlightImmersiveFeed = z;
    }

    public final void setSharedFromProfile(boolean z) {
        this.sharedFromProfile = z;
    }

    public StoryHighlightInfo(StoryHighlightCollection storyHighlightCollection, StoryHighlightCollection storyHighlightCollection2, List<String> list, boolean z, boolean z2) {
        this.primaryCollectionInfo = storyHighlightCollection;
        this.containerCollectionInfo = storyHighlightCollection2;
        this.collectionIds = list;
        this.sharedFromProfile = z;
        this.sharedFromHighlightImmersiveFeed = z2;
    }
}
