package com.ss.android.ugc.aweme.story.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class StoryBulletListResponse extends BaseResponse {
    public long LL;
    public final String LLILLJJLI;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("interaction_user_list")
    public final List<StoryInteractionUser> interactionUserList;

    @C09CT("next_cursor")
    public final long nextCursor;

    @C09CT("total")
    public final long total;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryBulletListResponse)) {
            return false;
        }
        StoryBulletListResponse storyBulletListResponse = (StoryBulletListResponse) obj;
        return this.total == storyBulletListResponse.total && this.hasMore == storyBulletListResponse.hasMore && this.nextCursor == storyBulletListResponse.nextCursor && Intrinsics.LJFF(this.interactionUserList, storyBulletListResponse.interactionUserList) && this.LL == storyBulletListResponse.LL && Intrinsics.LJFF(this.LLILLJJLI, storyBulletListResponse.LLILLJJLI);
    }

    public final int hashCode() {
        int iY2 = ((((C786410Ut5.Y2(this.total) * 31) + C786410Ut5.Z2(this.hasMore)) * 31) + C786410Ut5.Y2(this.nextCursor)) * 31;
        List<StoryInteractionUser> list = this.interactionUserList;
        return ((((iY2 + (list == null ? 0 : list.hashCode())) * 31) + C786410Ut5.Y2(this.LL)) * 31) + this.LLILLJJLI.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryBulletListResponse(total=");
        sbLIZ.append(this.total);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", nextCursor=");
        sbLIZ.append(this.nextCursor);
        sbLIZ.append(", interactionUserList=");
        sbLIZ.append(this.interactionUserList);
        sbLIZ.append(", durationMs=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", javaClassName=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StoryBulletListResponse(long j, boolean z, long j2, List<StoryInteractionUser> list, long j3, String str) {
        this.total = j;
        this.hasMore = z;
        this.nextCursor = j2;
        this.interactionUserList = list;
        this.LL = j3;
        this.LLILLJJLI = str;
    }
}
