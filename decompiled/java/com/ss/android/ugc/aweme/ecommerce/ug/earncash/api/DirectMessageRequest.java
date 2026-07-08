package com.ss.android.ugc.aweme.ecommerce.ug.earncash.api;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class DirectMessageRequest {

    @C09CT("direct_message_raw_data")
    public final List<DirectMessageRawData> directMessageRawData;

    public DirectMessageRequest() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DirectMessageRequest) && Intrinsics.LJFF(this.directMessageRawData, ((DirectMessageRequest) obj).directMessageRawData);
    }

    public final int hashCode() {
        List<DirectMessageRawData> list = this.directMessageRawData;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DirectMessageRequest(directMessageRawData=");
        sbLIZ.append(this.directMessageRawData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DirectMessageRequest(List<DirectMessageRawData> list) {
        this.directMessageRawData = list;
    }
}
