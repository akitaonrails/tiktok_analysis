package com.ss.android.ugc.aweme.story.inbox;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class InsertStory implements Serializable {
    public static final int $stable = 0;

    @C09CT("story_id")
    public final long storyId;

    @C09CT("user_id")
    public final long userId;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InsertStory(userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", storyId=");
        sbLIZ.append(this.storyId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public InsertStory(long j, long j2) {
        this.userId = j;
        this.storyId = j2;
    }
}
