package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class RemoteImageDto implements Serializable {

    @C09CT("alt_text")
    public final String altText;

    @C09CT("url")
    public final String url;

    public RemoteImageDto() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteImageDto)) {
            return false;
        }
        RemoteImageDto remoteImageDto = (RemoteImageDto) obj;
        return Intrinsics.LJFF(this.url, remoteImageDto.url) && Intrinsics.LJFF(this.altText, remoteImageDto.altText);
    }

    public int hashCode() {
        String str = this.url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.altText;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RemoteImageDto(url=");
        sbLIZ.append(this.url);
        sbLIZ.append(", altText=");
        sbLIZ.append(this.altText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RemoteImageDto(String str, String str2) {
        this.url = str;
        this.altText = str2;
    }
}
