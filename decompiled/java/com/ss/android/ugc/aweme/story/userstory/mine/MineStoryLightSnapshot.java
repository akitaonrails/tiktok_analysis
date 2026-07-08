package com.ss.android.ugc.aweme.story.userstory.mine;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class MineStoryLightSnapshot {

    @C09CT("saved_at_ms")
    public final long savedAtMs;

    @C09CT("stories")
    public final List<StoryEntrySnapshot> stories;

    @C09CT("total_count")
    public final long totalCount;

    @C09CT("uid")
    public final String uid;

    public MineStoryLightSnapshot() {
        this(null, 0L, null, 0L, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MineStoryLightSnapshot)) {
            return false;
        }
        MineStoryLightSnapshot mineStoryLightSnapshot = (MineStoryLightSnapshot) obj;
        return Intrinsics.LJFF(this.uid, mineStoryLightSnapshot.uid) && this.totalCount == mineStoryLightSnapshot.totalCount && Intrinsics.LJFF(this.stories, mineStoryLightSnapshot.stories) && this.savedAtMs == mineStoryLightSnapshot.savedAtMs;
    }

    public final int hashCode() {
        return (((((this.uid.hashCode() * 31) + C786410Ut5.Y2(this.totalCount)) * 31) + this.stories.hashCode()) * 31) + C786410Ut5.Y2(this.savedAtMs);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MineStoryLightSnapshot(uid=");
        sbLIZ.append(this.uid);
        sbLIZ.append(", totalCount=");
        sbLIZ.append(this.totalCount);
        sbLIZ.append(", stories=");
        sbLIZ.append(this.stories);
        sbLIZ.append(", savedAtMs=");
        sbLIZ.append(this.savedAtMs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MineStoryLightSnapshot(String str, long j, List<StoryEntrySnapshot> list, long j2) {
        this.uid = str;
        this.totalCount = j;
        this.stories = list;
        this.savedAtMs = j2;
    }

    public MineStoryLightSnapshot(String str, long j, List list, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) == 0 ? j2 : 0L);
    }
}
