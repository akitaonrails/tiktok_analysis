package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public class InRoomBannerRefreshMessage extends AbstractC1136060ffY {

    @C09CT("max_delay_seconds")
    public int delaySeconds;

    @C09CT("only_anchor")
    public boolean onlyAnchor;

    @Override // X.AbstractC1136060ffY, com.ss.ugc.live.sdk.message.data.IMessage
    public final int consumingStrategy() {
        return 1;
    }

    public InRoomBannerRefreshMessage() {
        this.type = C001A.IN_ROOM_BANNER_REFRESH_MESSAGE;
    }
}
