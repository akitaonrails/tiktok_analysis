package com.ss.pusher.core.params;

import X.C09CT;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.google.gson.n;

/* JADX INFO: loaded from: classes21.dex */
public final class UploadBWProbeParams {

    @C09CT("BwProbeDirectSendMode")
    public final int bwProbeDirectSendMode;

    @C09CT("EnableSendLogInfo")
    public final boolean enableSendLogInfo;

    @C09CT("EwmaEstimate")
    public final double ewmaEstimate;

    @C09CT("FixNotifyCrash")
    public final int fixNotifyCrash;

    @C09CT("ProbeBandwidthCalcType")
    public final int probeBandwidthCalcType;

    @C09CT("ReportBbrInfo")
    public final int reportBbrInfo;

    @C09CT("retryCountLimit")
    public final int retryCountLimit;

    @C09CT("RtcProbeParam")
    public n rtcProbeParam;

    @C09CT("SendPacketVersion")
    public final int sendPacketVersion;

    @C09CT("TotalSendPacketSize")
    public final int totalSendPacketSize;

    @C09CT("useHardware")
    public final boolean useHardwareEncode;

    @C09CT("bWTestTime")
    public final int bWTestTime = 10;

    @C09CT("bWTestTimeMS")
    public final int bWTestTimeMS = 3900;

    @C09CT("packetSendValidTimeMS")
    public final int packetSendValidTimeMS = 2000;

    @C09CT("PeakAvgCount")
    public final int peakAvgCount = 1;

    @C09CT("logInterval")
    public final int logInterval = 1;

    @C09CT("logIntervalMS")
    public final int logIntervalMS = 900;

    @C09CT("BottomLine540p")
    public final int bottomLine540p = 500;

    @C09CT("BottomLine720p")
    public final int bottomLine720p = LivePreCreateNextRoomPlayer.ENABLE;

    @C09CT("BottomLine1080p")
    public final int bottomLine1080p = 7000;

    @C09CT("vCodec")
    public final String vCodec = "video/bytevc1";

    @C09CT("defaultBitrate")
    public final int defaultBitrate = 6000000;

    @C09CT("minBitrate")
    public final int minBitrate = 6000000;

    @C09CT("maxBitrate")
    public final int maxBitrate = 6000000;

    @C09CT("dropVideoFrameThresholdB")
    public final int dropVideoFrameThresholdB = 20000;

    @C09CT("openTimeout")
    public final int openTimeOut = 10000;

    @C09CT("prePushStreamThreshold")
    public final int prePushStreamThreshold = 10000;

    @C09CT("prePushStreamDropFrameRange")
    public final double prePushStreamDropFrameRange = 0.5d;

    @C09CT("BottomLine540pBwe")
    public final int bottomLine540pBwe = 500;

    @C09CT("BottomLine720pBwe")
    public final int bottomLine720pBwe = LivePreCreateNextRoomPlayer.ENABLE;

    @C09CT("BottomLine1080pBwe")
    public final int bottomLine1080pBwe = 7000;

    @C09CT("BWProbeBottomLevel")
    public final int bWProbeBottomLevel = 1;

    @C09CT("BWProbeAimLevel")
    public final int bWProbeAimLevel = 1;

    @C09CT("BWProbeTargetKbps")
    public final int bwProbeTargetKbps = 15000;

    @C09CT("SuggestProtocol")
    public final String suggestProtocol = "tls";

    @C09CT("ResultStrategy")
    public final int resultStrategy = 11;

    @C09CT("EwmaHalfLife")
    public final int ewmaHalfLife = 20;

    @C09CT("EwmaWeight")
    public final double ewmaWeight = 60.0d;

    @C09CT("FirstOrderFilterParam")
    public final float firstOrderFilterParam = 0.9f;

    @C09CT("BWProbeRtmpq")
    public final QuicParams quicParams = new QuicParams();

    @C09CT("LevelChooseMode")
    public final int levelChooseMode = 1;

    @C09CT("resultValidTimeMS")
    public final int resultValidTimeMS = -1;

    @C09CT("sampleNumberOfStableResult")
    public final int sampleNumberOfStableResult = 3;

    @C09CT("ProtocolDownGradeDetail")
    public final n protocolDownGradeDetail = new n();

    @C09CT("CallbackAfterStop")
    public final int callbackAfterStop = 1;

    @C09CT("ReleaseOldObject")
    public final int releaseOldObject = 1;

    @C09CT("ReportAtDestruct")
    public final int reportAtDestruct = 1;

    @C09CT("ReportAtStop")
    public final int reportAtStop = 1;

    @C09CT("ReportApiDetail")
    public final int reportApiDetail = 1;
}
