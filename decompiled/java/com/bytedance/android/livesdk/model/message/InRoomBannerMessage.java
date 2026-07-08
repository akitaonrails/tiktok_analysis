package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.google.gson.n;

/* JADX INFO: loaded from: classes.dex */
public class InRoomBannerMessage extends AbstractC1136060ffY {

    @C09CT("action_type")
    public Integer actionType;

    @C09CT("extra")
    public n extra;

    @C09CT("position")
    public int position = 1;

    @Override // X.AbstractC1136060ffY, com.ss.ugc.live.sdk.message.data.IMessage
    public final int consumingStrategy() {
        return 1;
    }

    public InRoomBannerMessage() {
        this.type = C001A.IN_ROOM_BANNER_MESSAGE;
    }
}
