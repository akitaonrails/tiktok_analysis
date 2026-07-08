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
public final class StoryHighlightListForAwemeResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("collections")
    public final List<StoryHighlightCollection> collections;

    @C09CT("included_in_collection_ids")
    public final List<String> includedInCollectionIds;

    public StoryHighlightListForAwemeResponse() {
        this(null, null, 3, null);
    }

    public final StoryHighlightListForAwemeResponse copy(List<StoryHighlightCollection> list, List<String> list2) {
        return new StoryHighlightListForAwemeResponse(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryHighlightListForAwemeResponse)) {
            return false;
        }
        StoryHighlightListForAwemeResponse storyHighlightListForAwemeResponse = (StoryHighlightListForAwemeResponse) obj;
        return Intrinsics.LJFF(this.collections, storyHighlightListForAwemeResponse.collections) && Intrinsics.LJFF(this.includedInCollectionIds, storyHighlightListForAwemeResponse.includedInCollectionIds);
    }

    public int hashCode() {
        return (this.collections.hashCode() * 31) + this.includedInCollectionIds.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryHighlightListForAwemeResponse(collections=");
        sbLIZ.append(this.collections);
        sbLIZ.append(", includedInCollectionIds=");
        sbLIZ.append(this.includedInCollectionIds);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isEmpty() {
        return this.collections.isEmpty() && this.includedInCollectionIds.isEmpty();
    }

    public final List<StoryHighlightCollection> getCollections() {
        return this.collections;
    }

    public final List<String> getIncludedInCollectionIds() {
        return this.includedInCollectionIds;
    }

    public StoryHighlightListForAwemeResponse(List<StoryHighlightCollection> list, List<String> list2) {
        this.collections = list;
        this.includedInCollectionIds = list2;
    }

    public StoryHighlightListForAwemeResponse(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}
