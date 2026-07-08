package com.ss.android.ugc.aweme.story.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class StoryViewInfoResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("play_vv")
    public final long playVideoViewers;

    public final StoryViewInfoResponse copy(long j) {
        return new StoryViewInfoResponse(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StoryViewInfoResponse) && this.playVideoViewers == ((StoryViewInfoResponse) obj).playVideoViewers;
    }

    public int hashCode() {
        return C786410Ut5.Y2(this.playVideoViewers);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryViewInfoResponse(playVideoViewers=");
        sbLIZ.append(this.playVideoViewers);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StoryViewInfoResponse() {
        this(0L);
    }

    public final long getPlayVideoViewers() {
        return this.playVideoViewers;
    }

    public StoryViewInfoResponse(long j) {
        this.playVideoViewers = j;
    }
}
