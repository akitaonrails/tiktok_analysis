package com.ss.android.ugc.aweme.story.highlights.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StoryHighlightGetDetailResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("aweme_previews")
    public final List<StoryHighlightAwemePreview> awemePreviews;

    @C09CT("collection_detail")
    public final StoryHighlightCollection collectionDetail;

    public StoryHighlightGetDetailResponse() {
        this(null, null, 3, null);
    }

    public final StoryHighlightGetDetailResponse copy(StoryHighlightCollection storyHighlightCollection, List<StoryHighlightAwemePreview> list) {
        return new StoryHighlightGetDetailResponse(storyHighlightCollection, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryHighlightGetDetailResponse)) {
            return false;
        }
        StoryHighlightGetDetailResponse storyHighlightGetDetailResponse = (StoryHighlightGetDetailResponse) obj;
        return Intrinsics.LJFF(this.collectionDetail, storyHighlightGetDetailResponse.collectionDetail) && Intrinsics.LJFF(this.awemePreviews, storyHighlightGetDetailResponse.awemePreviews);
    }

    public int hashCode() {
        StoryHighlightCollection storyHighlightCollection = this.collectionDetail;
        return ((storyHighlightCollection == null ? 0 : storyHighlightCollection.hashCode()) * 31) + this.awemePreviews.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryHighlightGetDetailResponse(collectionDetail=");
        sbLIZ.append(this.collectionDetail);
        sbLIZ.append(", awemePreviews=");
        sbLIZ.append(this.awemePreviews);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<StoryHighlightAwemePreview> getAwemePreviews() {
        return this.awemePreviews;
    }

    public final StoryHighlightCollection getCollectionDetail() {
        return this.collectionDetail;
    }

    public StoryHighlightGetDetailResponse(StoryHighlightCollection storyHighlightCollection, List<StoryHighlightAwemePreview> list) {
        this.collectionDetail = storyHighlightCollection;
        this.awemePreviews = list;
    }

    public StoryHighlightGetDetailResponse(StoryHighlightCollection storyHighlightCollection, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : storyHighlightCollection, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
