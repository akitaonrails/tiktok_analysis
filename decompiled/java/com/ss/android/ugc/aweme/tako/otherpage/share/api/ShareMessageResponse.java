package com.ss.android.ugc.aweme.tako.otherpage.share.api;

import X.AbstractC2126608Uu;
import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class ShareMessageResponse extends AbstractC2126608Uu {

    @C09CT("dm_msg_content")
    public String dmMsgContent;

    @C09CT("extra")
    public Extra ext;

    @C09CT("status_code")
    public int statusCode;

    public ShareMessageResponse() {
        this(null, 0, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareMessageResponse)) {
            return false;
        }
        ShareMessageResponse shareMessageResponse = (ShareMessageResponse) obj;
        return Intrinsics.LJFF(this.ext, shareMessageResponse.ext) && this.statusCode == shareMessageResponse.statusCode && Intrinsics.LJFF(this.dmMsgContent, shareMessageResponse.dmMsgContent);
    }

    public final int hashCode() {
        Extra extra = this.ext;
        return ((((extra == null ? 0 : extra.hashCode()) * 31) + this.statusCode) * 31) + this.dmMsgContent.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShareMessageResponse(ext=");
        sbLIZ.append(this.ext);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", dmMsgContent=");
        sbLIZ.append(this.dmMsgContent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ShareMessageResponse(Extra extra, int i, String str) {
        this.ext = extra;
        this.statusCode = i;
        this.dmMsgContent = str;
    }
}
