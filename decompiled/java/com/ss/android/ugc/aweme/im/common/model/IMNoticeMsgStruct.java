package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes3.dex */
public final class IMNoticeMsgStruct {

    @C09CT("msg_content")
    public IMFromMessageTips msgContent;

    @C09CT("msg_type")
    public Integer msgType;

    @C09CT("notice_code")
    public String noticeCode;

    @C09CT("position")
    public Integer position;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMNoticeMsgStruct(msgType=");
        sbLIZ.append(this.msgType);
        sbLIZ.append(", noticeCode=");
        sbLIZ.append(this.noticeCode);
        sbLIZ.append(", msgContent=");
        sbLIZ.append(this.msgContent);
        sbLIZ.append(", position=");
        sbLIZ.append(this.position);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IMNoticeMsgStruct(Integer num, String str, IMFromMessageTips iMFromMessageTips, Integer num2) {
        this.msgType = num;
        this.noticeCode = str;
        this.msgContent = iMFromMessageTips;
        this.position = num2;
    }
}
