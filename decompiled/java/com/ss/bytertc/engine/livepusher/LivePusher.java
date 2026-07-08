package com.ss.bytertc.engine.livepusher;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.GLESVersion;
import com.ss.bytertc.engine.RTCVideo;
import com.ss.bytertc.engine.data.ColorSpace;
import com.ss.bytertc.engine.data.PreProcessVideoNodeStats;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.data.VideoRotation;
import com.ss.bytertc.engine.utils.AudioFrame;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.engine.video.VideoFrame;
import com.ss.bytertc.engine.video.impl.LyraxVideoFrame;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public abstract class LivePusher {
    public static Set<LivePusherImpl> livePusherSet = new HashSet();
    public static Lock rtcVideoLock = new ReentrantLock();

    public abstract void doDestroy(boolean z);

    public abstract void enableAutoReconnect(boolean z);

    public abstract int enablePush();

    public abstract LyraxVideoFrame getPooledFrame(VideoPixelFormat videoPixelFormat, int i, int i2, int i3, VideoRotation videoRotation, ColorSpace colorSpace);

    public abstract RTCVideo getRTCVideo();

    public abstract boolean isLyraxFrameEnabled();

    public abstract int pushExternalAudioFrame(AudioFrame audioFrame);

    public abstract int pushExternalVideoFrame(VideoFrame videoFrame);

    public abstract int requestIDRFrame();

    public abstract int sendSEIMessage(String str, int i, boolean z, boolean z2);

    public abstract void setLivePusherConfig(LivePusherConfig livePusherConfig);

    public abstract int setMetaData(String str);

    public abstract int setSEICurrentShiftDiffTime(long j);

    public abstract void setStatisticsEventHandler(IStatisticsEventHandler iStatisticsEventHandler);

    public abstract void startAudioCapture();

    public abstract int startPush(boolean z);

    public abstract void startVideoCapture();

    public abstract void stopAudioCapture();

    public abstract int stopPush();

    public abstract void stopVideoCapture();

    public abstract int updateExternalStats(PreProcessVideoNodeStats preProcessVideoNodeStats);

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (com.ss.bytertc.engine.livepusher.LivePusher.livePusherSet.size() == 1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        r3.doDestroy(r0);
        com.ss.bytertc.engine.livepusher.LivePusher.livePusherSet.remove(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void destroyLivePusher(com.ss.bytertc.engine.livepusher.LivePusher r3) {
        /*
            java.util.concurrent.locks.Lock r0 = com.ss.bytertc.engine.livepusher.LivePusher.rtcVideoLock     // Catch: java.lang.Throwable -> L33
            r0.lock()     // Catch: java.lang.Throwable -> L33
            if (r3 == 0) goto L2d
            java.util.Set<com.ss.bytertc.engine.livepusher.LivePusherImpl> r0 = com.ss.bytertc.engine.livepusher.LivePusher.livePusherSet     // Catch: java.lang.Throwable -> L33
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L33
        Ld:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L2d
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L33
            com.ss.bytertc.engine.livepusher.LivePusherImpl r2 = (com.ss.bytertc.engine.livepusher.LivePusherImpl) r2     // Catch: java.lang.Throwable -> L33
            if (r2 != r3) goto Ld
            java.util.Set<com.ss.bytertc.engine.livepusher.LivePusherImpl> r0 = com.ss.bytertc.engine.livepusher.LivePusher.livePusherSet     // Catch: java.lang.Throwable -> L33
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L33
            r0 = 1
            if (r1 == r0) goto L25
            r0 = 0
        L25:
            r3.doDestroy(r0)     // Catch: java.lang.Throwable -> L33
            java.util.Set<com.ss.bytertc.engine.livepusher.LivePusherImpl> r0 = com.ss.bytertc.engine.livepusher.LivePusher.livePusherSet     // Catch: java.lang.Throwable -> L33
            r0.remove(r2)     // Catch: java.lang.Throwable -> L33
        L2d:
            java.util.concurrent.locks.Lock r0 = com.ss.bytertc.engine.livepusher.LivePusher.rtcVideoLock
            r0.unlock()
            return
        L33:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L33
            java.util.concurrent.locks.Lock r0 = com.ss.bytertc.engine.livepusher.LivePusher.rtcVideoLock
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.engine.livepusher.LivePusher.destroyLivePusher(com.ss.bytertc.engine.livepusher.LivePusher):void");
    }

    public static LivePusher createLivePusher(Context context, String[] strArr, String str, ILivePusherEventHandler iLivePusherEventHandler, Object obj, JSONObject jSONObject) {
        return createLivePusher(context, strArr, str, iLivePusherEventHandler, obj, GLESVersion.GLES_VERSION_2, jSONObject, null);
    }

    public static LivePusher createLivePusher(Context context, String[] strArr, String str, ILivePusherEventHandler iLivePusherEventHandler, Object obj, JSONObject jSONObject, LivePusherOption livePusherOption) {
        return createLivePusher(context, strArr, str, iLivePusherEventHandler, obj, GLESVersion.GLES_VERSION_2, jSONObject, livePusherOption);
    }

    public static LivePusher createLivePusher(Context context, String[] strArr, String str, ILivePusherEventHandler iLivePusherEventHandler, Object obj, GLESVersion gLESVersion, JSONObject jSONObject) {
        return createLivePusher(context, strArr, str, iLivePusherEventHandler, obj, gLESVersion, jSONObject, null);
    }

    public static LivePusher createLivePusher(Context context, String[] strArr, String str, ILivePusherEventHandler iLivePusherEventHandler, Object obj, GLESVersion gLESVersion, JSONObject jSONObject, LivePusherOption livePusherOption) {
        if (context != null && !TextUtils.isEmpty(str)) {
            if (str == null) {
                return null;
            }
            try {
                try {
                    rtcVideoLock.lock();
                    LivePusherImpl livePusherImpl = new LivePusherImpl(context, strArr, str, iLivePusherEventHandler, obj, gLESVersion, jSONObject, livePusherSet.size(), livePusherOption);
                    livePusherSet.add(livePusherImpl);
                    rtcVideoLock.unlock();
                    return livePusherImpl;
                } catch (IllegalStateException e) {
                    TryCatchGuardChecker.doCheck(e);
                    rtcVideoLock.unlock();
                    return null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                rtcVideoLock.unlock();
                throw th;
            }
        }
        LogUtil.e("LivePusher", "createLivePusher: context or app id is empty");
        return null;
    }
}
