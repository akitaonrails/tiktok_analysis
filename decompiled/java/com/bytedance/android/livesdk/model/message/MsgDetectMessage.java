package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public class MsgDetectMessage extends AbstractC1136060ffY {

    @C09CT("d_type")
    public int detectType;

    @C09CT("from_region")
    public String fromRegion;

    @C09CT("t_info")
    public TimeInfo timeInfo;

    @C09CT("trigger_by")
    public int triggerBy;

    @C09CT("t_condition")
    public TriggerCondition triggerCondition;

    public static class TimeInfo {

        @C09CT("api_recv_time_ms")
        public long apiRecvTimeMs;

        @C09CT("api_send_to_goim_ms")
        public long apiSendToGoimMs;

        @C09CT("client_start_ms")
        public long clientStartMs;
    }

    public static class TriggerCondition {

        @C09CT("detect_p2p_msg")
        public Boolean detectP2PMsg;

        @C09CT("detect_room_msg")
        public Boolean detectRoomMsg;

        @C09CT("http_optimize")
        public Boolean httpOptimize;

        @C09CT("uplink_detect_http")
        public Boolean uplinkDetectHTTP;

        @C09CT("uplink_detect_websocket")
        public Boolean uplinkDetectWebsocket;
    }

    public MsgDetectMessage() {
        this.type = C001A.MSG_DETECT_MESSAGE;
    }
}
