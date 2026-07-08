package com.ss.android.ugc.aweme.aikit.api.common.task;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PreviewInfo implements Serializable {

    @C09CT("data")
    public final String data;

    @C09CT("meta_key")
    public final String metaKey;

    @C09CT("preview_type")
    public final Long previewType;

    public PreviewInfo() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewInfo)) {
            return false;
        }
        PreviewInfo previewInfo = (PreviewInfo) obj;
        return Intrinsics.LJFF(this.data, previewInfo.data) && Intrinsics.LJFF(this.previewType, previewInfo.previewType) && Intrinsics.LJFF(this.metaKey, previewInfo.metaKey);
    }

    public int hashCode() {
        String str = this.data;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.previewType;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.metaKey;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreviewInfo(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", previewType=");
        sbLIZ.append(this.previewType);
        sbLIZ.append(", metaKey=");
        sbLIZ.append(this.metaKey);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PreviewInfo(String str, Long l, String str2) {
        this.data = str;
        this.previewType = l;
        this.metaKey = str2;
    }
}
