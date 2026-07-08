package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class GroupLayoutDataResponse extends BaseResponse {

    @C09CT("layout")
    public final QRCodeGroupChatLayout layout;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GroupLayoutDataResponse) && Intrinsics.LJFF(this.layout, ((GroupLayoutDataResponse) obj).layout);
    }

    public final int hashCode() {
        QRCodeGroupChatLayout qRCodeGroupChatLayout = this.layout;
        if (qRCodeGroupChatLayout == null) {
            return 0;
        }
        return qRCodeGroupChatLayout.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupLayoutDataResponse(layout=");
        sbLIZ.append(this.layout);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GroupLayoutDataResponse(QRCodeGroupChatLayout qRCodeGroupChatLayout) {
        this.layout = qRCodeGroupChatLayout;
    }
}
