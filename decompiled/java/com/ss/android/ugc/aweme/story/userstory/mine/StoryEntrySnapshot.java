package com.ss.android.ugc.aweme.story.userstory.mine;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class StoryEntrySnapshot {

    @C09CT("aid")
    public final String aid;

    @C09CT("create_time")
    public final long createTime;

    @C09CT("viewed")
    public final boolean viewed;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryEntrySnapshot)) {
            return false;
        }
        StoryEntrySnapshot storyEntrySnapshot = (StoryEntrySnapshot) obj;
        return Intrinsics.LJFF(this.aid, storyEntrySnapshot.aid) && this.viewed == storyEntrySnapshot.viewed && this.createTime == storyEntrySnapshot.createTime;
    }

    public final int hashCode() {
        return (((this.aid.hashCode() * 31) + C786410Ut5.Z2(this.viewed)) * 31) + C786410Ut5.Y2(this.createTime);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryEntrySnapshot(aid=");
        sbLIZ.append(this.aid);
        sbLIZ.append(", viewed=");
        sbLIZ.append(this.viewed);
        sbLIZ.append(", createTime=");
        sbLIZ.append(this.createTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StoryEntrySnapshot() {
        this("", false, 0L);
    }

    public StoryEntrySnapshot(String str, boolean z, long j) {
        this.aid = str;
        this.viewed = z;
        this.createTime = j;
    }
}
