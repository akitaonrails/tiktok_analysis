package com.ss.android.ugc.aweme.upvote.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes.dex */
public final class UpvoteDeleteResult {

    @C09CT("sync_delete_video")
    public final boolean syncDeleteVideo;

    public UpvoteDeleteResult() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpvoteDeleteResult) && this.syncDeleteVideo == ((UpvoteDeleteResult) obj).syncDeleteVideo;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.syncDeleteVideo);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpvoteDeleteResult(syncDeleteVideo=");
        sbLIZ.append(this.syncDeleteVideo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UpvoteDeleteResult(boolean z) {
        this.syncDeleteVideo = z;
    }
}
