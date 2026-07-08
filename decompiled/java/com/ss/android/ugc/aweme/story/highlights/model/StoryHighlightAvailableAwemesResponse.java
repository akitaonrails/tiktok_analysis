package com.ss.android.ugc.aweme.story.highlights.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class StoryHighlightAvailableAwemesResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("aweme_ids")
    public final List<String> awemeIds;

    @C09CT("aweme_previews")
    public final List<StoryHighlightAwemePreview> awemePreviews;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("next_cursor")
    public final long nextCursor;

    public StoryHighlightAvailableAwemesResponse() {
        this(null, 0L, false, null, 15, null);
    }

    public final StoryHighlightAvailableAwemesResponse copy(List<StoryHighlightAwemePreview> list, long j, boolean z, List<String> list2) {
        return new StoryHighlightAvailableAwemesResponse(list, j, z, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryHighlightAvailableAwemesResponse)) {
            return false;
        }
        StoryHighlightAvailableAwemesResponse storyHighlightAvailableAwemesResponse = (StoryHighlightAvailableAwemesResponse) obj;
        return Intrinsics.LJFF(this.awemePreviews, storyHighlightAvailableAwemesResponse.awemePreviews) && this.nextCursor == storyHighlightAvailableAwemesResponse.nextCursor && this.hasMore == storyHighlightAvailableAwemesResponse.hasMore && Intrinsics.LJFF(this.awemeIds, storyHighlightAvailableAwemesResponse.awemeIds);
    }

    public int hashCode() {
        return (((((this.awemePreviews.hashCode() * 31) + C786410Ut5.Y2(this.nextCursor)) * 31) + C786410Ut5.Z2(this.hasMore)) * 31) + this.awemeIds.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryHighlightAvailableAwemesResponse(awemePreviews=");
        sbLIZ.append(this.awemePreviews);
        sbLIZ.append(", nextCursor=");
        sbLIZ.append(this.nextCursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", awemeIds=");
        sbLIZ.append(this.awemeIds);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<String> getAwemeIds() {
        return this.awemeIds;
    }

    public final List<StoryHighlightAwemePreview> getAwemePreviews() {
        return this.awemePreviews;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final long getNextCursor() {
        return this.nextCursor;
    }

    public StoryHighlightAvailableAwemesResponse(List<StoryHighlightAwemePreview> list, long j, boolean z, List<String> list2) {
        this.awemePreviews = list;
        this.nextCursor = j;
        this.hasMore = z;
        this.awemeIds = list2;
    }

    public StoryHighlightAvailableAwemesResponse(List list, long j, boolean z, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? false : z, (i & 8) != 0 ? C13BV.INSTANCE : list2);
    }
}
