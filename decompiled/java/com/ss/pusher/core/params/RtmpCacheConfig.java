package com.ss.pusher.core.params;

import X.C09CT;
import X.C173600la;

/* JADX INFO: loaded from: classes21.dex */
public final class RtmpCacheConfig {

    @C09CT("drop_encode_fps")
    public final boolean dropEncodeFps;

    @C09CT("bw_est_cfg")
    public final BwEstCfg rtmpBwEstCfg = new BwEstCfg();

    @C09CT("lw_reconnect_cfg")
    public final LWReconnectCfg rtmpReconnectCfg = new LWReconnectCfg();
    public int LIZ = Integer.MAX_VALUE;

    @C09CT("min_video_fps")
    public int minVideoFps = Integer.MAX_VALUE;

    @C09CT("max_video_fps")
    public int maxVideoFps = Integer.MAX_VALUE;

    @C09CT("max_interleave_delta")
    public final int maxInterLeaveDelta = 1000000;

    @C09CT("drop_video_frame_threshold_I")
    public final int dropVideoFrameThresholdI = Integer.MAX_VALUE;

    @C09CT("drop_video_frame_threshold_P")
    public final int dropVideoFrameThresholdP = Integer.MAX_VALUE;

    @C09CT("drop_video_frame_threshold_B")
    public final int dropVideoFrameThresholdB = Integer.MAX_VALUE;

    @C09CT("audio_send_stall_threshold")
    public final int audioSendStallThreshold = 200;

    @C09CT("video_send_stall_threshold")
    public final int videoSendStallThreshold = 200;

    @C09CT("log_interval_ms")
    public final int logIntervalMS = Integer.MAX_VALUE;

    @C09CT("android_net_info_opt")
    public final int androidNetInfoOpt = Integer.MAX_VALUE;

    @C09CT("enable_report_stall_log")
    public final int enableReportStallLog = 1;

    @C09CT("use_pkt_inTime")
    public final int usePktInTime = Integer.MAX_VALUE;

    @C09CT("enable_report_net_info")
    public final int enablereportNetInfo = Integer.MAX_VALUE;

    @C09CT("enable_refactor_report_net_info")
    public final int enableRefactorReportNetInfo = 1;

    @C09CT("enable_fps_adjust")
    public final int enableFpsAdjust = Integer.MAX_VALUE;

    @C09CT("open_timeout")
    public final int openTimeOut = Integer.MAX_VALUE;

    @C09CT("read_write_timeout")
    public final int rwTimeOut = Integer.MAX_VALUE;

    @C09CT("rtmp_time_rotation")
    public final int rtmpTimeRotation = Integer.MAX_VALUE;

    @C09CT("enable_rtmp_stopPoll")
    public final int enableRtmpStopPoll = Integer.MAX_VALUE;

    @C09CT("enable_report_bw_time")
    public final int enableReportBwTime = 1;

    @C09CT("bw_time_report_threshold")
    public final int bwTimeReportThreshold = Integer.MAX_VALUE;

    @C09CT("bw_time_report_keep_win")
    public final int bwTimeReportKeepWin = Integer.MAX_VALUE;

    @C09CT("disable_dns_parse_with_ip")
    public final int disableDnsParseWithIp = Integer.MAX_VALUE;

    @C09CT("disable_drop_frame")
    public final int disableDropFrame = Integer.MAX_VALUE;

    @C09CT("change_drop_frame_order")
    public final int changeDropFrameOrder = Integer.MAX_VALUE;

    @C09CT("bw_keep_win_for_fps")
    public final int bwKeepWinForFps = Integer.MAX_VALUE;

    @C09CT("chunk_send_opt")
    public final int chunkSendOpt = Integer.MAX_VALUE;

    @C09CT("set_fps_opt")
    public final int setFpsOpt = Integer.MAX_VALUE;

    @C09CT("max_fps_factor")
    public final double maxFpsFactor = Double.MAX_VALUE;

    @C09CT("min_fps_factor")
    public final double minFpsFactor = Double.MAX_VALUE;

    @C09CT("rtmps_noblock_io")
    public final int rtmpsNoblockIo = Integer.MAX_VALUE;

    public final boolean LIZ() {
        return C173600la.LIZ(Integer.valueOf(this.enableFpsAdjust)) && this.enableFpsAdjust > 0;
    }
}
