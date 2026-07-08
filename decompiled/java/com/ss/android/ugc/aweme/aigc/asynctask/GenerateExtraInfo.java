package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class GenerateExtraInfo {

    @C09CT("content_source")
    public final String contentSource;

    @C09CT("content_type")
    public final String contentType;

    @C09CT("shoot_way")
    public final String shootWay;

    @C09CT("video_duration")
    public final long videoDuration;

    @C09CT("video_uri")
    public final String videoUri;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenerateExtraInfo)) {
            return false;
        }
        GenerateExtraInfo generateExtraInfo = (GenerateExtraInfo) obj;
        return this.videoDuration == generateExtraInfo.videoDuration && Intrinsics.LJFF(this.shootWay, generateExtraInfo.shootWay) && Intrinsics.LJFF(this.contentType, generateExtraInfo.contentType) && Intrinsics.LJFF(this.contentSource, generateExtraInfo.contentSource) && Intrinsics.LJFF(this.videoUri, generateExtraInfo.videoUri);
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Y2(this.videoDuration) * 31) + this.shootWay.hashCode()) * 31) + this.contentType.hashCode()) * 31) + this.contentSource.hashCode()) * 31) + this.videoUri.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GenerateExtraInfo(videoDuration=");
        sbLIZ.append(this.videoDuration);
        sbLIZ.append(", shootWay=");
        sbLIZ.append(this.shootWay);
        sbLIZ.append(", contentType=");
        sbLIZ.append(this.contentType);
        sbLIZ.append(", contentSource=");
        sbLIZ.append(this.contentSource);
        sbLIZ.append(", videoUri=");
        sbLIZ.append(this.videoUri);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GenerateExtraInfo() {
        this(0L, "", "", "", "");
    }

    public GenerateExtraInfo(long j, String str, String str2, String str3, String str4) {
        this.videoDuration = j;
        this.shootWay = str;
        this.contentType = str2;
        this.contentSource = str3;
        this.videoUri = str4;
    }
}
