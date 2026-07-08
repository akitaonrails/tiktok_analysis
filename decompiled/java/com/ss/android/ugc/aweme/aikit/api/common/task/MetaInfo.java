package com.ss.android.ugc.aweme.aikit.api.common.task;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class MetaInfo implements Serializable {

    @C09CT("bitrate")
    public final Long bitrate;

    @C09CT("definition")
    public final String definition;

    @C09CT("height")
    public final Long height;

    @C09CT("quality")
    public final Long quality;

    @C09CT("size")
    public final Long size;

    @C09CT("width")
    public final Long width;

    public MetaInfo() {
        this(null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetaInfo)) {
            return false;
        }
        MetaInfo metaInfo = (MetaInfo) obj;
        return Intrinsics.LJFF(this.width, metaInfo.width) && Intrinsics.LJFF(this.height, metaInfo.height) && Intrinsics.LJFF(this.size, metaInfo.size) && Intrinsics.LJFF(this.bitrate, metaInfo.bitrate) && Intrinsics.LJFF(this.definition, metaInfo.definition) && Intrinsics.LJFF(this.quality, metaInfo.quality);
    }

    public int hashCode() {
        Long l = this.width;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.height;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.size;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.bitrate;
        int iHashCode4 = (iHashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str = this.definition;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Long l5 = this.quality;
        return iHashCode5 + (l5 != null ? l5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MetaInfo(width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", size=");
        sbLIZ.append(this.size);
        sbLIZ.append(", bitrate=");
        sbLIZ.append(this.bitrate);
        sbLIZ.append(", definition=");
        sbLIZ.append(this.definition);
        sbLIZ.append(", quality=");
        sbLIZ.append(this.quality);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MetaInfo(Long l, Long l2, Long l3, Long l4, String str, Long l5) {
        this.width = l;
        this.height = l2;
        this.size = l3;
        this.bitrate = l4;
        this.definition = str;
        this.quality = l5;
    }
}
