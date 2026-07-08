package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public class OfficialChannelModifyMessage extends AbstractC1136060ffY {

    @C09CT("channel_uid")
    public long channelUid;

    @C09CT("end_timestamp")
    public long endTimeStamp;

    public OfficialChannelModifyMessage() {
        this.type = C001A.OFFICIAL_CHANNEL_MODIFY_MESSAGE;
    }
}
