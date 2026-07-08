package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.message.CommonMessageData;

/* JADX INFO: loaded from: classes.dex */
public class DiggMessage extends AbstractC1136060ffY {

    @C09CT("color")
    public int color;

    @C09CT("digg_count")
    public int diggCount;

    @C09CT("duration")
    public int duration;

    @C09CT("icon")
    public String icon;

    @C09CT("user")
    public User user;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return this.user != null;
    }

    @Override // X.AbstractC1136060ffY
    public final boolean supportDisplayText() {
        CommonMessageData commonMessageData = this.baseMessage;
        return (commonMessageData == null || commonMessageData.displayText == null) ? false : true;
    }

    public DiggMessage() {
        this.type = C001A.DIGG;
    }
}
