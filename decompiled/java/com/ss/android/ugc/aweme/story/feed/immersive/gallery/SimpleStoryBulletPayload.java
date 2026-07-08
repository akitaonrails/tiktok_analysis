package com.ss.android.ugc.aweme.story.feed.immersive.gallery;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class SimpleStoryBulletPayload {

    @C09CT("durationMs")
    public final long durationMs;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("interaction_user_list")
    public final List<SimpleStoryInteractionUser> interactionUserList;

    @C09CT("next_cursor")
    public final long nextCursor;

    @C09CT("total")
    public final long total;

    public SimpleStoryBulletPayload() {
        this(0L, false, 0L, null, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleStoryBulletPayload)) {
            return false;
        }
        SimpleStoryBulletPayload simpleStoryBulletPayload = (SimpleStoryBulletPayload) obj;
        return this.total == simpleStoryBulletPayload.total && this.hasMore == simpleStoryBulletPayload.hasMore && this.nextCursor == simpleStoryBulletPayload.nextCursor && Intrinsics.LJFF(this.interactionUserList, simpleStoryBulletPayload.interactionUserList) && this.durationMs == simpleStoryBulletPayload.durationMs;
    }

    public final int hashCode() {
        int iY2 = ((((C786410Ut5.Y2(this.total) * 31) + C786410Ut5.Z2(this.hasMore)) * 31) + C786410Ut5.Y2(this.nextCursor)) * 31;
        List<SimpleStoryInteractionUser> list = this.interactionUserList;
        return ((iY2 + (list == null ? 0 : list.hashCode())) * 31) + C786410Ut5.Y2(this.durationMs);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SimpleStoryBulletPayload(total=");
        sbLIZ.append(this.total);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", nextCursor=");
        sbLIZ.append(this.nextCursor);
        sbLIZ.append(", interactionUserList=");
        sbLIZ.append(this.interactionUserList);
        sbLIZ.append(", durationMs=");
        sbLIZ.append(this.durationMs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SimpleStoryBulletPayload(long j, boolean z, long j2, List<SimpleStoryInteractionUser> list, long j3) {
        this.total = j;
        this.hasMore = z;
        this.nextCursor = j2;
        this.interactionUserList = list;
        this.durationMs = j3;
    }
}
