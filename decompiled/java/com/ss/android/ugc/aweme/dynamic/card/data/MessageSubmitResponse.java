package com.ss.android.ugc.aweme.dynamic.card.data;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes10.dex */
public final class MessageSubmitResponse extends BaseResponse {

    @C09CT("content_pb")
    public final ByteString contentPb;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MessageSubmitResponse) && Intrinsics.LJFF(this.contentPb, ((MessageSubmitResponse) obj).contentPb);
    }

    public final int hashCode() {
        ByteString byteString = this.contentPb;
        if (byteString == null) {
            return 0;
        }
        return byteString.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageSubmitResponse(contentPb=");
        sbLIZ.append(this.contentPb);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MessageSubmitResponse(ByteString byteString) {
        super(0, 0, "", "", "");
        this.contentPb = byteString;
    }
}
