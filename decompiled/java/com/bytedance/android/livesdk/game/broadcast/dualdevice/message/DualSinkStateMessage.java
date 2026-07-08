package com.bytedance.android.livesdk.game.broadcast.dualdevice.message;

import X.C09CT;
import X.C2188811AlT;
import X.EnumC742780TBs;

/* JADX INFO: loaded from: classes13.dex */
public final class DualSinkStateMessage extends DualBaseMessage {

    @C09CT("auto_translation_enable")
    public Integer autoTranslationEnable;

    @C09CT("duration_sec")
    public Long durationSec;

    @C09CT("live_state")
    public int liveState;

    @C09CT("pause_sec")
    public Long pauseSec;

    @C09CT("room_id")
    public String roomId;

    @C09CT("rtc_room_id")
    public String rtcRoomId;

    @Override // com.bytedance.android.livesdk.game.broadcast.dualdevice.message.DualBaseMessage
    public final int LIZ() {
        return EnumC742780TBs.DUAL_SINK_STATE_MESSAGE.getMessageType();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DualSinkStateMessage{ liveState = ");
        sbLIZ.append(this.liveState);
        sbLIZ.append(",roomId = ");
        sbLIZ.append(this.roomId);
        sbLIZ.append(" ,rtcRoomId = ");
        sbLIZ.append(this.rtcRoomId);
        sbLIZ.append(",durationSec = ");
        sbLIZ.append(this.durationSec);
        sbLIZ.append(",pauseSec = ");
        sbLIZ.append(this.pauseSec);
        sbLIZ.append(",autoTranslationEnable = ");
        sbLIZ.append(this.autoTranslationEnable);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
