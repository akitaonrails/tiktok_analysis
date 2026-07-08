package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class VideoItem implements Serializable {

    @C09CT("backup_url")
    public final String backupUrl;

    @C09CT("extra_attrs")
    public final String extraAttrs;

    @C09CT("main_url")
    public final String mainUrl;

    @C09CT("video_meta")
    public final VideoMeta videoMeta;

    public VideoItem() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoItem)) {
            return false;
        }
        VideoItem videoItem = (VideoItem) obj;
        return Intrinsics.LJFF(this.mainUrl, videoItem.mainUrl) && Intrinsics.LJFF(this.backupUrl, videoItem.backupUrl) && Intrinsics.LJFF(this.videoMeta, videoItem.videoMeta) && Intrinsics.LJFF(this.extraAttrs, videoItem.extraAttrs);
    }

    public int hashCode() {
        String str = this.mainUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.backupUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        VideoMeta videoMeta = this.videoMeta;
        int iHashCode3 = (iHashCode2 + (videoMeta == null ? 0 : videoMeta.hashCode())) * 31;
        String str3 = this.extraAttrs;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoItem(mainUrl=");
        sbLIZ.append(this.mainUrl);
        sbLIZ.append(", backupUrl=");
        sbLIZ.append(this.backupUrl);
        sbLIZ.append(", videoMeta=");
        sbLIZ.append(this.videoMeta);
        sbLIZ.append(", extraAttrs=");
        sbLIZ.append(this.extraAttrs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VideoItem(String str, String str2, VideoMeta videoMeta, String str3) {
        this.mainUrl = str;
        this.backupUrl = str2;
        this.videoMeta = videoMeta;
        this.extraAttrs = str3;
    }
}
