package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes36.dex */
public final class UpdateStatusReqMessage {

    @C09CT("battery_level")
    public float batteryLevel;

    @C09CT("battery_value")
    public float batteryValue;

    @C09CT("bit_rate")
    public long bitRate;

    @C09CT("camera_target_fps")
    public float cameraTargetFps;

    @C09CT("cpu_rate")
    public float cpuRate;

    @C09CT("cpu_speed")
    public float cpuSpeed;

    @C09CT("drop_3_duration_ratio")
    public float drop3DurationRatio;

    @C09CT("drop_count")
    public long dropCount;

    @C09CT("effect_process_time")
    public float effectProcessTime;

    @C09CT("frame_rate")
    public long frameRate;

    @C09CT("is_charging")
    public long isCharging;

    @C09CT("is_hw")
    public long isHw;

    @C09CT("memory_usage_rate_android")
    public float memoryUsageRateAndroid;

    @C09CT("memory_usage_rate_ios")
    public float memoryUsageRateIos;

    @C09CT("out_cap_fps")
    public float outCapFps;

    @C09CT("pss_app_usage")
    public float pssAppUsage;

    @C09CT("push_fps")
    public float pushFps;

    @C09CT("realtime_cpu_speed_score_host")
    public float realtimeCpuSpeedScoreHost;

    @C09CT("realtime_effect_process_score")
    public float realtimeEffectProcessScore;

    @C09CT("realtime_performance_host_score")
    public float realtimePerformanceHostScore;

    @C09CT("realtime_performance_normalized_host_score")
    public float realtimePerformanceNormalizedHostScore;

    @C09CT("realtime_stream_drop_score")
    public float realtimeStreamDropScore;

    @C09CT("realtime_thermal_score_host")
    public float realtimeThermalScoreHost;

    @C09CT("reason_no")
    public long reasonNo;

    @C09CT("reconnect_count")
    public long reconnectCount;

    @C09CT("report_mode")
    public long reportMode;

    @C09CT("resolution_height")
    public long resolutionHeight;

    @C09CT("resolution_width")
    public long resolutionWidth;

    @C09CT("room_id")
    public long roomId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public long status;

    @C09CT("stream_id")
    public long streamId;

    @C09CT("thermal_level")
    public long thermalLevel;

    @C09CT("thermal_value")
    public float thermalValue;

    @C09CT("transport_send_video_stall_count")
    public long transportSendVideoStallCount;

    @C09CT("transport_send_video_stall_time")
    public long transportSendVideoStallTime;

    @C09CT("ui_fps")
    public float uiFps;

    @C09CT("volume")
    public float volume;

    @C09CT("source")
    public String source = "";

    @C09CT("broadcast_scene")
    public String broadcastScene = "";

    @C09CT("push_param_invalid")
    public String pushParamInvalid = "";

    @C09CT("event_key")
    public String eventKey = "";

    @C09CT("camera_mode")
    public String cameraMode = "";

    @C09CT("pusher_type")
    public String pusherType = "";

    @C09CT("request_time_ms")
    public String requestTimeMs = "";
}
