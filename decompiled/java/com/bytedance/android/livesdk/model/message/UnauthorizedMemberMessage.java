package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class UnauthorizedMemberMessage extends AbstractC1136060ffY {

    @C09CT("action")
    public int action;

    @C09CT("enter_text")
    public Text enterText;

    @C09CT("nick_name")
    public String nickName;

    @C09CT("nick_name_prefix")
    public Text nickNamePrefix;

    @C09CT("public_area_common")
    public PublicAreaMessageCommon publicAreaCommon;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return this.action == 1 || super.canText();
    }

    public UnauthorizedMemberMessage() {
        this.type = C001A.LIVE_UNAUTHORIZED_MEMBER_MESSAGE;
        this.nickName = "";
    }
}
