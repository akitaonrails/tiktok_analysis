package com.ss.android.ugc.aweme.story.highlights.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StoryHighlightDeleteResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("deleted_collection_detail")
    public final StoryHighlightCollection deletedCollectionDetail;

    public StoryHighlightDeleteResponse() {
        this(null);
    }

    public final StoryHighlightDeleteResponse copy(StoryHighlightCollection storyHighlightCollection) {
        return new StoryHighlightDeleteResponse(storyHighlightCollection);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StoryHighlightDeleteResponse) && Intrinsics.LJFF(this.deletedCollectionDetail, ((StoryHighlightDeleteResponse) obj).deletedCollectionDetail);
    }

    public int hashCode() {
        StoryHighlightCollection storyHighlightCollection = this.deletedCollectionDetail;
        if (storyHighlightCollection == null) {
            return 0;
        }
        return storyHighlightCollection.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryHighlightDeleteResponse(deletedCollectionDetail=");
        sbLIZ.append(this.deletedCollectionDetail);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final StoryHighlightCollection getDeletedCollectionDetail() {
        return this.deletedCollectionDetail;
    }

    public StoryHighlightDeleteResponse(StoryHighlightCollection storyHighlightCollection) {
        this.deletedCollectionDetail = storyHighlightCollection;
    }
}
