package com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.notice.handler;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class MessageRequestNoticeResp extends BaseResponse {

    @C09CT("control_list")
    public final List<B2CPopupWindowControl> controlList;

    public MessageRequestNoticeResp() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MessageRequestNoticeResp) && Intrinsics.LJFF(this.controlList, ((MessageRequestNoticeResp) obj).controlList);
    }

    public final int hashCode() {
        List<B2CPopupWindowControl> list = this.controlList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageRequestNoticeResp(controlList=");
        sbLIZ.append(this.controlList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MessageRequestNoticeResp(List<B2CPopupWindowControl> list) {
        this.controlList = list;
    }
}
