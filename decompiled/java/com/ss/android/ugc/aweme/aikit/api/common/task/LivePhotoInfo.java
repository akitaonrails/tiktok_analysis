package com.ss.android.ugc.aweme.aikit.api.common.task;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class LivePhotoInfo implements Serializable {

    @C09CT("duration")
    public final Double duration;

    @C09CT("live_photo_type")
    public final Long livePhotoType;

    @C09CT("original")
    public final Long original;

    @C09CT("video_id")
    public final String videoId;

    public LivePhotoInfo() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LivePhotoInfo)) {
            return false;
        }
        LivePhotoInfo livePhotoInfo = (LivePhotoInfo) obj;
        return Intrinsics.LJFF(this.videoId, livePhotoInfo.videoId) && Intrinsics.LJFF(this.duration, livePhotoInfo.duration) && Intrinsics.LJFF(this.original, livePhotoInfo.original) && Intrinsics.LJFF(this.livePhotoType, livePhotoInfo.livePhotoType);
    }

    public int hashCode() {
        String str = this.videoId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d = this.duration;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Long l = this.original;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.livePhotoType;
        return iHashCode3 + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LivePhotoInfo(videoId=");
        sbLIZ.append(this.videoId);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", original=");
        sbLIZ.append(this.original);
        sbLIZ.append(", livePhotoType=");
        sbLIZ.append(this.livePhotoType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LivePhotoInfo(String str, Double d, Long l, Long l2) {
        this.videoId = str;
        this.duration = d;
        this.original = l;
        this.livePhotoType = l2;
    }
}
