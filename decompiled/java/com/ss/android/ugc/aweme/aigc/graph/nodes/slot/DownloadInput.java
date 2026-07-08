package com.ss.android.ugc.aweme.aigc.graph.nodes.slot;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class DownloadInput {

    @C09CT("type")
    public final Integer type;

    @C09CT("url")
    public final String url;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadInput)) {
            return false;
        }
        DownloadInput downloadInput = (DownloadInput) obj;
        return Intrinsics.LJFF(this.url, downloadInput.url) && Intrinsics.LJFF(this.type, downloadInput.type);
    }

    public final int hashCode() {
        int iHashCode = this.url.hashCode() * 31;
        Integer num = this.type;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DownloadInput(url=");
        sbLIZ.append(this.url);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DownloadInput() {
        this("", 3);
    }

    public DownloadInput(String str, Integer num) {
        this.url = str;
        this.type = num;
    }
}
