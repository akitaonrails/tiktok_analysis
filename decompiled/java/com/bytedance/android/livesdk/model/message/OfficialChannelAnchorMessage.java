package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public class OfficialChannelAnchorMessage extends AbstractC1136060ffY {

    @C09CT("end_timestamp")
    public long endTimeStamp;

    @C09CT("exist_linkmic")
    public boolean existLinkmic;

    @C09CT("linkmic_type")
    public int linkmicType;

    @C09CT("role_type")
    public int roleType;

    @C09CT("start_timestamp")
    public long startTimeStamp;

    public OfficialChannelAnchorMessage() {
        this.type = C001A.OFFICIAL_CHANNEL_ANCHOR_MESSAGE;
    }
}
