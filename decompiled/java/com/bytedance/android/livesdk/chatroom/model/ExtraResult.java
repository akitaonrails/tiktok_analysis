package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class ExtraResult {

    @C09CT("finished_perception_msg")
    public final String finishedPerceptionMsg;

    @C09CT("punish_info")
    public final PunishEventInfo punishInfo;

    public ExtraResult() {
        this(null, null);
    }

    public ExtraResult(String str, PunishEventInfo punishEventInfo) {
        this.finishedPerceptionMsg = str;
        this.punishInfo = punishEventInfo;
    }
}
