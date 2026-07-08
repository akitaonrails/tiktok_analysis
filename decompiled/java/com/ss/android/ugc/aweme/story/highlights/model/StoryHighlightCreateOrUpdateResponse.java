package com.ss.android.ugc.aweme.story.highlights.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StoryHighlightCreateOrUpdateResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("container_aweme")
    public final Aweme collectionContainerAweme;

    @C09CT("collection_detail")
    public final StoryHighlightCollection collectionDetail;

    @C09CT("updated_primary_collection")
    public final PrimaryCollectionCache primaryCollectionCache;

    @C09CT("updated_container_aweme")
    public final Aweme updatedContainerAweme;

    public StoryHighlightCreateOrUpdateResponse() {
        this(null, null, null, null);
    }

    public final StoryHighlightCreateOrUpdateResponse copy(StoryHighlightCollection storyHighlightCollection, PrimaryCollectionCache primaryCollectionCache, Aweme aweme, Aweme aweme2) {
        return new StoryHighlightCreateOrUpdateResponse(storyHighlightCollection, primaryCollectionCache, aweme, aweme2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryHighlightCreateOrUpdateResponse)) {
            return false;
        }
        StoryHighlightCreateOrUpdateResponse storyHighlightCreateOrUpdateResponse = (StoryHighlightCreateOrUpdateResponse) obj;
        return Intrinsics.LJFF(this.collectionDetail, storyHighlightCreateOrUpdateResponse.collectionDetail) && Intrinsics.LJFF(this.primaryCollectionCache, storyHighlightCreateOrUpdateResponse.primaryCollectionCache) && Intrinsics.LJFF(this.collectionContainerAweme, storyHighlightCreateOrUpdateResponse.collectionContainerAweme) && Intrinsics.LJFF(this.updatedContainerAweme, storyHighlightCreateOrUpdateResponse.updatedContainerAweme);
    }

    public int hashCode() {
        StoryHighlightCollection storyHighlightCollection = this.collectionDetail;
        int iHashCode = (storyHighlightCollection == null ? 0 : storyHighlightCollection.hashCode()) * 31;
        PrimaryCollectionCache primaryCollectionCache = this.primaryCollectionCache;
        int iHashCode2 = (iHashCode + (primaryCollectionCache == null ? 0 : primaryCollectionCache.hashCode())) * 31;
        Aweme aweme = this.collectionContainerAweme;
        int iHashCode3 = (iHashCode2 + (aweme == null ? 0 : aweme.hashCode())) * 31;
        Aweme aweme2 = this.updatedContainerAweme;
        return iHashCode3 + (aweme2 != null ? aweme2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryHighlightCreateOrUpdateResponse(collectionDetail=");
        sbLIZ.append(this.collectionDetail);
        sbLIZ.append(", primaryCollectionCache=");
        sbLIZ.append(this.primaryCollectionCache);
        sbLIZ.append(", collectionContainerAweme=");
        sbLIZ.append(this.collectionContainerAweme);
        sbLIZ.append(", updatedContainerAweme=");
        sbLIZ.append(this.updatedContainerAweme);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Aweme getCollectionContainerAweme() {
        return this.collectionContainerAweme;
    }

    public final StoryHighlightCollection getCollectionDetail() {
        return this.collectionDetail;
    }

    public final PrimaryCollectionCache getPrimaryCollectionCache() {
        return this.primaryCollectionCache;
    }

    public final Aweme getUpdatedContainerAweme() {
        return this.updatedContainerAweme;
    }

    public static final class PrimaryCollectionCache implements Serializable {
        public static final int $stable = 8;

        @C09CT("aweme_id")
        public final String awemeId;

        @C09CT("primary_collection_info")
        public final StoryHighlightCollection primaryCollectionInfo;

        public PrimaryCollectionCache() {
            this(null, null);
        }

        public PrimaryCollectionCache(String str, StoryHighlightCollection storyHighlightCollection) {
            this.awemeId = str;
            this.primaryCollectionInfo = storyHighlightCollection;
        }
    }

    public StoryHighlightCreateOrUpdateResponse(StoryHighlightCollection storyHighlightCollection, PrimaryCollectionCache primaryCollectionCache, Aweme aweme, Aweme aweme2) {
        this.collectionDetail = storyHighlightCollection;
        this.primaryCollectionCache = primaryCollectionCache;
        this.collectionContainerAweme = aweme;
        this.updatedContainerAweme = aweme2;
    }
}
