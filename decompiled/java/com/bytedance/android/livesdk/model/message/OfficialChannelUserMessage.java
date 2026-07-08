package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class OfficialChannelUserMessage extends AbstractC1136060ffY {

    @C09CT("max_enter_time")
    public long maxEnterTime;

    @C09CT("start_timestamp")
    public long startTimeStamp;

    public OfficialChannelUserMessage() {
        this.type = C001A.OFFICIAL_CHANNEL_USER_MESSAGE;
    }
}
