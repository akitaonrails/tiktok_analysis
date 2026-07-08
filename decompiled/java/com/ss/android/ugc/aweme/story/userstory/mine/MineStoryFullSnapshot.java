package com.ss.android.ugc.aweme.story.userstory.mine;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class MineStoryFullSnapshot {

    @C09CT("aweme")
    public final Aweme aweme;

    @C09CT("saved_at_ms")
    public final long savedAtMs;

    @C09CT("uid")
    public final String uid;

    public MineStoryFullSnapshot() {
        this("", null, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MineStoryFullSnapshot)) {
            return false;
        }
        MineStoryFullSnapshot mineStoryFullSnapshot = (MineStoryFullSnapshot) obj;
        return Intrinsics.LJFF(this.uid, mineStoryFullSnapshot.uid) && Intrinsics.LJFF(this.aweme, mineStoryFullSnapshot.aweme) && this.savedAtMs == mineStoryFullSnapshot.savedAtMs;
    }

    public final int hashCode() {
        int iHashCode = this.uid.hashCode() * 31;
        Aweme aweme = this.aweme;
        return ((iHashCode + (aweme == null ? 0 : aweme.hashCode())) * 31) + C786410Ut5.Y2(this.savedAtMs);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MineStoryFullSnapshot(uid=");
        sbLIZ.append(this.uid);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.aweme);
        sbLIZ.append(", savedAtMs=");
        sbLIZ.append(this.savedAtMs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MineStoryFullSnapshot(String str, Aweme aweme, long j) {
        this.uid = str;
        this.aweme = aweme;
        this.savedAtMs = j;
    }
}
