package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdk.game.model.PlayTogetherBasicInfo;

/* JADX INFO: loaded from: classes.dex */
public final class PlayTogetherMessage extends AbstractC1136060ffY {

    @C09CT("basic_info")
    public PlayTogetherBasicInfo basicInfo;

    @C09CT("list_change_content")
    public PlayTogetherListChangeContent listChangeContent;

    @C09CT("message_type")
    public int messageType;

    @C09CT("permit_notice_content")
    public PlayTogetherPermitNoticeContent permitNoticeContent;

    public PlayTogetherMessage() {
        this.type = C001A.PLAY_TOGETHER_MESSAGE;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("messageType: ");
        sbLIZ.append(this.messageType);
        sbLIZ.append(" \n basicInfo: ");
        sbLIZ.append(this.basicInfo);
        sbLIZ.append(" \n listChangeContent: ");
        sbLIZ.append(this.listChangeContent);
        sbLIZ.append(" \n permitNoticeContent: ");
        sbLIZ.append(this.permitNoticeContent);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
