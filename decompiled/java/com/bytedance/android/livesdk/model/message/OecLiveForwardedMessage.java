package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class OecLiveForwardedMessage extends AbstractC1136060ffY {

    @C09CT("data")
    public Map<String, String> data;

    @C09CT("message_type")
    public long messageType;

    public OecLiveForwardedMessage() {
        this.type = C001A.OEC_LIVE_FORWARDED_MESSAGE;
        this.data = new LinkedHashMap();
    }
}
