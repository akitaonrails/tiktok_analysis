package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class OecLiveHotRoomMessage extends AbstractC1136060ffY {

    @C09CT("expire_at")
    public long expireAt;

    @C09CT("path_map")
    public Map<String, String> pathMap;

    @Override // X.AbstractC1136060ffY, com.ss.ugc.live.sdk.message.data.IMessage
    public final int getIntType() {
        return 100005;
    }

    public OecLiveHotRoomMessage() {
        this.type = C001A.OEC_LIVE_HOT_ROOM_MESSAGE;
        this.pathMap = new LinkedHashMap();
    }
}
