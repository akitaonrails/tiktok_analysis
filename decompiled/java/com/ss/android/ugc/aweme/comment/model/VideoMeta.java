package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class VideoMeta implements Serializable {

    @C09CT("bitrate")
    public final Long bitrate;

    @C09CT("definition")
    public final String definition;

    @C09CT("file_id")
    public final String fileId;

    @C09CT("quality")
    public final String quality;

    @C09CT("real_bitrate")
    public final Long realBitrate;

    @C09CT("size")
    public final Long size;

    @C09CT("vtype")
    public final String vtype;

    public VideoMeta() {
        this(null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoMeta)) {
            return false;
        }
        VideoMeta videoMeta = (VideoMeta) obj;
        return Intrinsics.LJFF(this.definition, videoMeta.definition) && Intrinsics.LJFF(this.quality, videoMeta.quality) && Intrinsics.LJFF(this.vtype, videoMeta.vtype) && Intrinsics.LJFF(this.bitrate, videoMeta.bitrate) && Intrinsics.LJFF(this.size, videoMeta.size) && Intrinsics.LJFF(this.fileId, videoMeta.fileId) && Intrinsics.LJFF(this.realBitrate, videoMeta.realBitrate);
    }

    public int hashCode() {
        String str = this.definition;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.quality;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.vtype;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.bitrate;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.size;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str4 = this.fileId;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l3 = this.realBitrate;
        return iHashCode6 + (l3 != null ? l3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoMeta(definition=");
        sbLIZ.append(this.definition);
        sbLIZ.append(", quality=");
        sbLIZ.append(this.quality);
        sbLIZ.append(", vtype=");
        sbLIZ.append(this.vtype);
        sbLIZ.append(", bitrate=");
        sbLIZ.append(this.bitrate);
        sbLIZ.append(", size=");
        sbLIZ.append(this.size);
        sbLIZ.append(", fileId=");
        sbLIZ.append(this.fileId);
        sbLIZ.append(", realBitrate=");
        sbLIZ.append(this.realBitrate);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VideoMeta(String str, String str2, String str3, Long l, Long l2, String str4, Long l3) {
        this.definition = str;
        this.quality = str2;
        this.vtype = str3;
        this.bitrate = l;
        this.size = l2;
        this.fileId = str4;
        this.realBitrate = l3;
    }
}
