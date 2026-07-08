package com.bytedance.touchpoint.data.datasource.bytesync;

import X.C09CT;
import com.bytedance.touchpoint.api.model.TouchPoint;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class ByteSyncEvent {

    @C09CT("action_type")
    public final Integer actionType;

    @C09CT("deep_link")
    public final String deepLink;

    @C09CT("expire_at")
    public final Integer expireTimeStamp;

    @C09CT("touch_points")
    public final List<TouchPoint> touchPoints;

    public ByteSyncEvent() {
        this(0, 0, null, null);
    }

    public ByteSyncEvent(Integer num, Integer num2, List<TouchPoint> list, String str) {
        this.actionType = num;
        this.expireTimeStamp = num2;
        this.touchPoints = list;
        this.deepLink = str;
    }
}
