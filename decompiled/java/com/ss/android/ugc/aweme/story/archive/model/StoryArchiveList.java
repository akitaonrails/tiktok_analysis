package com.ss.android.ugc.aweme.story.archive.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class StoryArchiveList extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("items")
    public final List<Aweme> items;

    @C09CT("max_cursor")
    public final long maxCursor;

    @C09CT("min_cursor")
    public final long minCursor;

    public final StoryArchiveList copy(List<Aweme> list, long j, long j2, boolean z) {
        return new StoryArchiveList(list, j, j2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryArchiveList)) {
            return false;
        }
        StoryArchiveList storyArchiveList = (StoryArchiveList) obj;
        return Intrinsics.LJFF(this.items, storyArchiveList.items) && this.minCursor == storyArchiveList.minCursor && this.maxCursor == storyArchiveList.maxCursor && this.hasMore == storyArchiveList.hasMore;
    }

    public int hashCode() {
        List<Aweme> list = this.items;
        return ((((((list == null ? 0 : list.hashCode()) * 31) + C786410Ut5.Y2(this.minCursor)) * 31) + C786410Ut5.Y2(this.maxCursor)) * 31) + C786410Ut5.Z2(this.hasMore);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryArchiveList(items=");
        sbLIZ.append(this.items);
        sbLIZ.append(", minCursor=");
        sbLIZ.append(this.minCursor);
        sbLIZ.append(", maxCursor=");
        sbLIZ.append(this.maxCursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<Aweme> getItems() {
        return this.items;
    }

    public final long getMaxCursor() {
        return this.maxCursor;
    }

    public final long getMinCursor() {
        return this.minCursor;
    }

    public StoryArchiveList(List<Aweme> list, long j, long j2, boolean z) {
        this.items = list;
        this.minCursor = j;
        this.maxCursor = j2;
        this.hasMore = z;
    }
}
