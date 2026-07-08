package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class DynamicPhotoModeInfo implements Serializable {

    @C09CT("da_info")
    public final String daInfo;

    public DynamicPhotoModeInfo() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DynamicPhotoModeInfo) && Intrinsics.LJFF(this.daInfo, ((DynamicPhotoModeInfo) obj).daInfo);
    }

    public int hashCode() {
        String str = this.daInfo;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DynamicPhotoModeInfo(daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DynamicPhotoModeInfo(String str) {
        this.daInfo = str;
    }
}
