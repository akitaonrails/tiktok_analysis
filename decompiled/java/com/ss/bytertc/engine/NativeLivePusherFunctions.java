package com.ss.bytertc.engine;

import android.content.Context;
import com.ss.bytertc.engine.data.PreProcessVideoNodeStats;
import com.ss.bytertc.engine.livepusher.InternalLiveProberConfig;
import com.ss.bytertc.engine.livepusher.InternalLivePusherConfig;
import com.ss.bytertc.engine.livepusher.LiveProberEventHandler;
import com.ss.bytertc.engine.livepusher.LivePusherEventHandler;
import com.ss.bytertc.engine.livepusher.LivePusherOption;
import com.ss.bytertc.engine.livepusher.RTMPProbeBandwidthResult;
import com.ss.bytertc.engine.livepusher.StatisticsEventHandler;
import com.ss.bytertc.engine.video.VideoFrame;

/* JADX INFO: loaded from: classes21.dex */
public class NativeLivePusherFunctions {
    public static native long nativeCreateLiveProber(Context context, String str, String str2, LiveProberEventHandler liveProberEventHandler, String str3);

    public static native long nativeCreateLivePusher(Context context, String[] strArr, String str, LivePusherEventHandler livePusherEventHandler, String str2, LivePusherOption livePusherOption);

    public static native void nativeDestroyLiveProber(long j);

    public static native void nativeDestroyLivePusher(long j);

    public static native void nativeEnableAutoReconnect(long j, boolean z);

    public static native int nativeEnablePush(long j);

    public static native void nativeGetBandwidthResult(long j, RTMPProbeBandwidthResult rTMPProbeBandwidthResult);

    public static native int nativePushExternalAudioFrame(long j, byte[] bArr, int i, int i2, int i3, long j2);

    public static native int nativePushExternalByteRtcVideoFrame(long j, VideoFrame videoFrame);

    public static native int nativePushLyraxVideoFrame(long j, VideoFrame videoFrame);

    public static native int nativeRequestIDRFrame(long j);

    public static native int nativeSendSEIMessage(long j, String str, int i, boolean z, boolean z2);

    public static native int nativeSetLiveProberConfig(long j, InternalLiveProberConfig internalLiveProberConfig);

    public static native void nativeSetLivePusherConfig(long j, InternalLivePusherConfig internalLivePusherConfig);

    public static native int nativeSetMetaData(long j, String str);

    public static native int nativeSetSEICurrentShiftDiffTime(long j, long j2);

    public static native void nativeSetStatisticsEventHandler(long j, StatisticsEventHandler statisticsEventHandler);

    public static native void nativeStartAudioCapture(long j);

    public static native int nativeStartProbe(long j);

    public static native int nativeStartPush(long j, boolean z);

    public static native void nativeStartVideoCapture(long j);

    public static native void nativeStopAudioCapture(long j);

    public static native int nativeStopProbe(long j);

    public static native int nativeStopPush(long j);

    public static native void nativeStopVideoCapture(long j);

    public static native int nativeUpdateExternalStats(long j, PreProcessVideoNodeStats preProcessVideoNodeStats);
}
