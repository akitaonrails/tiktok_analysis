package com.ss.android.ugc.aweme.feed.model.video;

import X.C1440005kM;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LandscapeVideoChangeEvent implements IEvent {
    public final String aid;
    public final Video video;

    public final LandscapeVideoChangeEvent copy(String str, Video video) {
        return new LandscapeVideoChangeEvent(str, video);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LandscapeVideoChangeEvent)) {
            return false;
        }
        LandscapeVideoChangeEvent landscapeVideoChangeEvent = (LandscapeVideoChangeEvent) obj;
        return Intrinsics.LJFF(this.aid, landscapeVideoChangeEvent.aid) && Intrinsics.LJFF(this.video, landscapeVideoChangeEvent.video);
    }

    public int hashCode() {
        int iHashCode = this.aid.hashCode() * 31;
        Video video = this.video;
        return iHashCode + (video == null ? 0 : video.hashCode());
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C1440005kM.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C1440005kM.LIZIZ(this);
        return this;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LandscapeVideoChangeEvent(aid=");
        sbLIZ.append(this.aid);
        sbLIZ.append(", video=");
        sbLIZ.append(this.video);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getAid() {
        return this.aid;
    }

    public final Video getVideo() {
        return this.video;
    }

    public LandscapeVideoChangeEvent(String str, Video video) {
        this.aid = str;
        this.video = video;
    }
}
