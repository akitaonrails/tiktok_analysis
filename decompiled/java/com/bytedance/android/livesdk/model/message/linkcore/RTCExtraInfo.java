package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RTCExtraInfo {

    @C09CT("byte_rtc_ext_info")
    public ByteRTCExtInfo byteRtcExtInfo;

    @C09CT("live_rtc_engine_config")
    public RTCEngineConfig config;

    @C09CT("interact_client_type")
    public int interactClientType;

    @C09CT("rtc_bitrate_map")
    public RTCBitRateMap rtcBitRateMap;

    @C09CT("rtc_business_id")
    public String rtcBusinessId;

    @C09CT("rtc_fps")
    public int rtcFps;

    @C09CT("extra")
    public RTCInfoExtra rtcInfoExtra;

    @C09CT("rtc_mix_base")
    public RTCMixBase rtcMixBase;

    @C09CT("rtc_other")
    public RTCOther rtcOther;

    @C09CT("live_rtc_video_param")
    public List<RTCLiveVideoParam> rtcVideoParam;

    public RTCExtraInfo() {
        this(null, null, null, 0, null, null, null, null, null, 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RTCExtraInfo(config=");
        sbLIZ.append(this.config);
        sbLIZ.append(", rtcVideoParam=");
        sbLIZ.append(this.rtcVideoParam);
        sbLIZ.append(", rtcBitRateMap=");
        sbLIZ.append(this.rtcBitRateMap);
        sbLIZ.append(", rtcFps=");
        sbLIZ.append(this.rtcFps);
        sbLIZ.append(", rtcMixBase=");
        sbLIZ.append(this.rtcMixBase);
        sbLIZ.append(", byteRtcExtInfo=");
        sbLIZ.append(this.byteRtcExtInfo);
        sbLIZ.append(", rtcInfoExtra=");
        sbLIZ.append(this.rtcInfoExtra);
        sbLIZ.append(", rtcBusinessId=");
        sbLIZ.append(this.rtcBusinessId);
        sbLIZ.append(", rtcOther=");
        sbLIZ.append(this.rtcOther);
        sbLIZ.append(", interactClientType=");
        sbLIZ.append(this.interactClientType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RTCExtraInfo(RTCEngineConfig rTCEngineConfig, List<RTCLiveVideoParam> list, RTCBitRateMap rTCBitRateMap, int i, RTCMixBase rTCMixBase, ByteRTCExtInfo byteRTCExtInfo, RTCInfoExtra rTCInfoExtra, String str, RTCOther rTCOther, int i2) {
        this.config = rTCEngineConfig;
        this.rtcVideoParam = list;
        this.rtcBitRateMap = rTCBitRateMap;
        this.rtcFps = i;
        this.rtcMixBase = rTCMixBase;
        this.byteRtcExtInfo = byteRTCExtInfo;
        this.rtcInfoExtra = rTCInfoExtra;
        this.rtcBusinessId = str;
        this.rtcOther = rTCOther;
        this.interactClientType = i2;
    }
}
