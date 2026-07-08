package com.ss.bytertc.engine.livepusher;

import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import android.content.Context;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.GLESVersion;
import com.ss.bytertc.engine.NativeLivePusherFunctions;
import com.ss.bytertc.engine.RTCRoomImpl;
import com.ss.bytertc.engine.RTCVideo;
import com.ss.bytertc.engine.data.ColorSpace;
import com.ss.bytertc.engine.data.PreProcessVideoNodeStats;
import com.ss.bytertc.engine.data.ReturnStatus;
import com.ss.bytertc.engine.data.VideoFrameType;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.data.VideoRotation;
import com.ss.bytertc.engine.engineimpl.RTCVideoImpl;
import com.ss.bytertc.engine.livepusher.LivePusherImpl;
import com.ss.bytertc.engine.utils.AudioFrame;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.engine.video.VideoFrame;
import com.ss.bytertc.engine.video.builder.GLTextureVideoFrameBuilder;
import com.ss.bytertc.engine.video.impl.LyraxVideoFrame;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class LivePusherImpl extends LivePusher {
    public static int rtcVideoInstanceCount;
    public final int MAX_URL_LENGTH;
    public final String kUrlRoomIdKey;
    public final String kUrlUserIdKey;
    public Context mContext;
    public LivePusherEventHandler mExLivePusherEventHandler;
    public StatisticsEventHandler mExStatisticsEventHandler;
    public final ReentrantReadWriteLock.ReadLock mJniReadLock;
    public final ReentrantReadWriteLock.WriteLock mJniWriteLock;
    public ILivePusherEventHandler mLivePusherEventHandler;
    public long mNativeEngine;
    public final ReentrantReadWriteLock mReadWriteLock;
    public RTCVideo mRtcVideo;
    public IStatisticsEventHandler mStatisticsEventHandler;

    @Override // com.ss.bytertc.engine.livepusher.LivePusher
    public int enablePush() {
        LogUtil.d("LivePusherImpl", "enablePush");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("LivePusherImpl", "native engine is invalid, enablePush failed.");
                this.mJniReadLock.unlock();
                return -1;
            }
            int iNativeEnablePush = NativeLivePusherFunctions.nativeEnablePush(this.mNativeEngine);
            this.mJniReadLock.unlock();
            return iNativeEnablePush;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    public boolean engineInvalid() {
        return this.mNativeEngine == 0;
    }

    @Override // com.ss.bytertc.engine.livepusher.LivePusher
    public RTCVideo getRTCVideo() {
        LogUtil.d("LivePusherImpl", "getRTCVideo");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("LivePusherImpl", "native engine is invalid, getRTCVideo failed.");
                this.mJniReadLock.unlock();
                return null;
            }
            RTCVideo rTCVideo = this.mRtcVideo;
            this.mJniReadLock.unlock();
            return rTCVideo;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.livepusher.LivePusher
    public boolean isLyraxFrameEnabled() {
        RTCVideo rTCVideo = this.mRtcVideo;
        if (rTCVideo != null) {
            return rTCVideo.isLyraxFrameEnabled();
        }
        return false;
    }

    @Override // com.ss.bytertc.engine.livepusher.LivePusher
    public int requestIDRFrame() {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("LivePusherImpl", "native engine is invalid, requestIDRFrame failed.");
                this.mJniReadLock.unlock();
                return -1;
            }
            int iNativeRequestIDRFrame = NativeLivePusherFunctions.nativeRequestIDRFrame(this.mNativeEngine);
            this.mJniReadLock.unlock();
            return iNativeRequestIDRFrame;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.livepusher.LivePusher
    public void startAudioCapture() {
        LogUtil.d("LivePusherImpl", "startAudioCapture");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("LivePusherImpl", "native engine is invalid, startAudioCapture failed.");
                this.mJniReadLock.unlock();
            } else {
                NativeLivePusherFunctions.nativeStartAudioCapture(this.mNativeEngine);
                this.mJniReadLock.unlock();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.livepusher.LivePusher
    public void startVideoCapture() {
        LogUtil.d("LivePusherImpl", "startVideoCapture");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("LivePusherImpl", "native engine is invalid, startVideoCapture failed.");
                this.mJniReadLock.unlock();
            } else {
                NativeLivePusherFunctions.nativeStartVideoCapture(this.mNativeEngine);
                this.mJniReadLock.unlock();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.livepusher.LivePusher
    public void stopAudioCapture() {
        LogUtil.d("LivePusherImpl", "stopAudioCapture");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("LivePusherImpl", "native engine is invalid, stopAudioCapture failed.");
                this.mJniReadLock.unlock();
            } else {
                NativeLivePusherFunctions.nativeStopAudioCapture(this.mNativeEngine);
                this.mJniReadLock.unlock();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.livepusher.LivePusher
    public int stopPush() {
        LogUtil.d("LivePusherImpl", "stopPush");
        this.mJniReadLock.lock();
        try {
            try {
                if (this.mStatisticsEventHandler != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("event_key", "rtcApi");
                    jSONObject.put("api", "stopPush");
                    jSONObject.put("engineInvalid", engineInvalid());
                    jSONObject.put("livePusherImpl", this);
                    this.mStatisticsEventHandler.onLogMonitor(C786410Ut5.J3(jSONObject));
                }
                if (engineInvalid()) {
                    LogUtil.e("LivePusherImpl", "native engine is invalid, stopPush failed.");
                    this.mJniReadLock.unlock();
                    return -1;
                }
                int iNativeStopPush = NativeLivePusherFunctions.nativeStopPush(this.mNativeEngine);
                this.mJniReadLock.unlock();
                return iNativeStopPush;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.livepusher.LivePusher
    public void stopVideoCapture() {
        LogUtil.d("LivePusherImpl", "stopVideoCapture");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("LivePusherImpl", "native engine is invalid, stopVideoCapture failed.");
                this.mJniReadLock.unlock();
            } else {
                NativeLivePusherFunctions.nativeStopVideoCapture(this.mNativeEngine);
                this.mJniReadLock.unlock();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    public ILivePusherEventHandler getLivePusherEventHandler() {
        return this.mLivePusherEventHandler;
    }

    public IStatisticsEventHandler getStatisticsEventHandler() {
        return this.mStatisticsEventHandler;
    }

    private boolean checkUrls(String[] strArr) {
        String str;
        if (strArr == null || strArr.length == 0 || (str = strArr[0]) == null || str.isEmpty() || str.length() > 2048) {
            return false;
        }
        HashMap map = new HashMap();
        for (String str2 : str.split("&")) {
            String[] strArrSplit = str2.split("=");
            if (strArrSplit.length == 2) {
                if (strArrSplit[0].equals("rtcRoomId")) {
                    map.put("rtcRoomId", strArrSplit[1]);
                }
                if (strArrSplit[0].equals("rtcUserId")) {
                    map.put("rtcUserId", strArrSplit[1]);
                }
            }
        }
        if (!map.containsKey("rtcRoomId") || !map.containsKey("rtcUserId")) {
            return false;
        }
        return true;
    }

    @Override // com.ss.bytertc.engine.livepusher.LivePusher
    public void doDestroy(boolean z) {
        RTCRoomImpl rTCRoomImpl;
        LogUtil.d("LivePusherImpl", "destroy LivePusherImpl.");
        this.mJniWriteLock.lock();
        try {
            try {
                if (this.mStatisticsEventHandler != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("event_key", "rtcApi");
                    jSONObject.put("api", "doDestroy");
                    jSONObject.put("engineInvalid", engineInvalid());
                    jSONObject.put("livePusherImpl", this);
                    this.mStatisticsEventHandler.onLogMonitor(C786410Ut5.J3(jSONObject));
                }
                if (engineInvalid()) {
                    LogUtil.e("LivePusherImpl", "native engine is invalid, no need to destroy now.");
                    this.mJniWriteLock.unlock();
                    return;
                }
                long j = this.mNativeEngine;
                this.mNativeEngine = 0L;
                this.mJniWriteLock.unlock();
                RTCVideo rTCVideo = this.mRtcVideo;
                if (rTCVideo != null && (rTCRoomImpl = (RTCRoomImpl) rTCVideo.getLivePusherRoom()) != null) {
                    rTCRoomImpl.invalidRoomWithoutDestroy();
                }
                NativeLivePusherFunctions.nativeDestroyLivePusher(j);
                int i = rtcVideoInstanceCount - 1;
                rtcVideoInstanceCount = i;
                if (z && this.mRtcVideo != null && i <= 0) {
                    RTCVideo.destroyRTCVideo();
                    this.mRtcVideo = null;
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniWriteLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.livepusher.LivePusher
    public void enableAutoReconnect(boolean z) {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("LivePusherImpl", "native engine is invalid, enableAutoReconnect failed.");
                this.mJniReadLock.unlock();
            } else {
                NativeLivePusherFunctions.nativeEnableAutoReconnect(this.mNativeEngine, z);
                this.mJniReadLock.unlock();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.livepusher.LivePusher
    public int pushExternalAudioFrame(AudioFrame audioFrame) {
        int iNativePushExternalAudioFrame;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("LivePusherImpl", "native engine is invalid, pushExternalAudioFrame failed.");
                iNativePushExternalAudioFrame = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativePushExternalAudioFrame = NativeLivePusherFunctions.nativePushExternalAudioFrame(this.mNativeEngine, audioFrame.buffer, audioFrame.samples, audioFrame.sampleRate.value(), audioFrame.channel.value(), audioFrame.timestamp_us);
            }
            this.mJniReadLock.unlock();
            return iNativePushExternalAudioFrame;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.livepusher.LivePusher
    public int pushExternalVideoFrame(final VideoFrame videoFrame) {
        int iNativePushExternalByteRtcVideoFrame;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("LivePusherImpl", "pushExternalVideoFrame: native engine is invalid, pushExternalVideoFrame failed.");
                videoFrame.release();
                iNativePushExternalByteRtcVideoFrame = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (videoFrame == null) {
                LogUtil.i("LivePusherImpl", "pushExternalVideoFrame: videoFrame is null, drop frame.");
                iNativePushExternalByteRtcVideoFrame = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (videoFrame instanceof LyraxVideoFrame) {
                iNativePushExternalByteRtcVideoFrame = NativeLivePusherFunctions.nativePushLyraxVideoFrame(this.mNativeEngine, (LyraxVideoFrame) videoFrame);
            } else if (videoFrame.getFrameType() != VideoFrameType.RAW_MEMORY && !videoFrame.hasReleaseCallback()) {
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                videoFrame.retain();
                GLTextureVideoFrameBuilder gLTextureVideoFrameBuilder = new GLTextureVideoFrameBuilder(videoFrame.getPixelFormat());
                gLTextureVideoFrameBuilder.setTextureID(videoFrame.getTextureID());
                gLTextureVideoFrameBuilder.setTextureMatrix(videoFrame.getTextureMatrix());
                gLTextureVideoFrameBuilder.setEGLContext(videoFrame.getEGLContext());
                gLTextureVideoFrameBuilder.setColorSpace(videoFrame.getColorSpace());
                gLTextureVideoFrameBuilder.setWidth(videoFrame.getWidth());
                gLTextureVideoFrameBuilder.setHeight(videoFrame.getHeight());
                gLTextureVideoFrameBuilder.setRotation(videoFrame.getRotation());
                gLTextureVideoFrameBuilder.setExternalDataInfo(videoFrame.getExternalDataInfo());
                gLTextureVideoFrameBuilder.setExternalDataArray(videoFrame.getExternalDataArray());
                gLTextureVideoFrameBuilder.setSupplementaryInfo(videoFrame.getSupplementaryInfo());
                gLTextureVideoFrameBuilder.setTimeStampUs(videoFrame.getTimeStampUs());
                gLTextureVideoFrameBuilder.setReleaseCallback(new Runnable() { // from class: X.0jLW
                    @Override // java.lang.Runnable
                    public final void run() {
                        LivePusherImpl.lambda$pushExternalVideoFrame$0(videoFrame, countDownLatch);
                    }
                });
                VideoFrame videoFrameBuild = gLTextureVideoFrameBuilder.build();
                iNativePushExternalByteRtcVideoFrame = NativeLivePusherFunctions.nativePushExternalByteRtcVideoFrame(this.mNativeEngine, videoFrameBuild);
                videoFrameBuild.release();
                if (!ThreadUtils.awaitUninterruptibly(countDownLatch, 1000L)) {
                    LogUtil.w("LivePusherImpl", "pushExternalVideoFrame: pushExternalVideoFrame timeout.");
                }
            } else {
                iNativePushExternalByteRtcVideoFrame = NativeLivePusherFunctions.nativePushExternalByteRtcVideoFrame(this.mNativeEngine, videoFrame);
            }
            this.mJniReadLock.unlock();
            return iNativePushExternalByteRtcVideoFrame;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.livepusher.LivePusher
    public void setLivePusherConfig(LivePusherConfig livePusherConfig) {
        LogUtil.d("LivePusherImpl", "setLivePusherConfig");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("LivePusherImpl", "native engine is invalid, setLivePusherConfig failed.");
                this.mJniReadLock.unlock();
            } else {
                NativeLivePusherFunctions.nativeSetLivePusherConfig(this.mNativeEngine, new InternalLivePusherConfig(livePusherConfig));
                this.mJniReadLock.unlock();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.livepusher.LivePusher
    public int setMetaData(String str) {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("LivePusherImpl", "native engine is invalid, setMetaData failed.");
                this.mJniReadLock.unlock();
                return -1;
            }
            int iNativeSetMetaData = NativeLivePusherFunctions.nativeSetMetaData(this.mNativeEngine, str);
            this.mJniReadLock.unlock();
            return iNativeSetMetaData;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.livepusher.LivePusher
    public int setSEICurrentShiftDiffTime(long j) {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("LivePusherImpl", "native engine is invalid, setSEICurrentShiftDiffTime failed.");
                this.mJniReadLock.unlock();
                return -1;
            }
            int iNativeSetSEICurrentShiftDiffTime = NativeLivePusherFunctions.nativeSetSEICurrentShiftDiffTime(this.mNativeEngine, j);
            this.mJniReadLock.unlock();
            return iNativeSetSEICurrentShiftDiffTime;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.livepusher.LivePusher
    public void setStatisticsEventHandler(IStatisticsEventHandler iStatisticsEventHandler) {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("LivePusherImpl", "native engine is invalid, setStatisticsEventHandler failed.");
                this.mJniReadLock.unlock();
                return;
            }
            this.mStatisticsEventHandler = iStatisticsEventHandler;
            if (iStatisticsEventHandler == null) {
                NativeLivePusherFunctions.nativeSetStatisticsEventHandler(this.mNativeEngine, null);
            } else {
                NativeLivePusherFunctions.nativeSetStatisticsEventHandler(this.mNativeEngine, this.mExStatisticsEventHandler);
            }
            this.mJniReadLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.livepusher.LivePusher
    public int startPush(boolean z) {
        LogUtil.d("LivePusherImpl", "startPush");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("LivePusherImpl", "native engine is invalid, startPush failed.");
                this.mJniReadLock.unlock();
                return -1;
            }
            int iNativeStartPush = NativeLivePusherFunctions.nativeStartPush(this.mNativeEngine, z);
            this.mJniReadLock.unlock();
            return iNativeStartPush;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.livepusher.LivePusher
    public int updateExternalStats(PreProcessVideoNodeStats preProcessVideoNodeStats) {
        int iNativeUpdateExternalStats;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("LivePusherImpl", "native engine is invalid, updateExternalStats failed.");
                iNativeUpdateExternalStats = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeUpdateExternalStats = NativeLivePusherFunctions.nativeUpdateExternalStats(this.mNativeEngine, preProcessVideoNodeStats);
            }
            this.mJniReadLock.unlock();
            return iNativeUpdateExternalStats;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    public static /* synthetic */ void lambda$pushExternalVideoFrame$0(VideoFrame videoFrame, CountDownLatch countDownLatch) {
        C1C7U.LIZ("LivePusherImpl@b930.pushExternalVideoFrame$1L");
        videoFrame.release();
        countDownLatch.countDown();
        C1C7U.LIZIZ("LivePusherImpl@b930.pushExternalVideoFrame$1L");
    }

    private JSONObject parametersAppendUrls(JSONObject jSONObject, String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            if (jSONObject == null) {
                try {
                    jSONObject = new JSONObject();
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    LogUtil.w("LivePusherImpl", "parameters json object append urls failed", e);
                }
            }
            JSONArray jSONArray = new JSONArray();
            for (String str : strArr) {
                jSONArray.put(str);
            }
            jSONObject.put("rtc.live_pusher_urls", jSONArray);
            return jSONObject;
        }
        return jSONObject;
    }

    @Override // com.ss.bytertc.engine.livepusher.LivePusher
    public int sendSEIMessage(String str, int i, boolean z, boolean z2) {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("LivePusherImpl", "native engine is invalid, sendSeiMessage failed.");
                this.mJniReadLock.unlock();
                return -1;
            }
            int iNativeSendSEIMessage = NativeLivePusherFunctions.nativeSendSEIMessage(this.mNativeEngine, str, i, z, z2);
            this.mJniReadLock.unlock();
            return iNativeSendSEIMessage;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.livepusher.LivePusher
    public LyraxVideoFrame getPooledFrame(VideoPixelFormat videoPixelFormat, int i, int i2, int i3, VideoRotation videoRotation, ColorSpace colorSpace) {
        RTCVideo rTCVideo = this.mRtcVideo;
        if (rTCVideo != null) {
            return rTCVideo.getPooledFrame(videoPixelFormat, i, i2, i3, videoRotation, colorSpace);
        }
        return null;
    }

    public LivePusherImpl(Context context, String[] strArr, String str, ILivePusherEventHandler iLivePusherEventHandler, Object obj, GLESVersion gLESVersion, JSONObject jSONObject, int i, LivePusherOption livePusherOption) {
        String strJ3;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWriteLock = reentrantReadWriteLock;
        this.mJniReadLock = reentrantReadWriteLock.readLock();
        this.mJniWriteLock = reentrantReadWriteLock.writeLock();
        this.MAX_URL_LENGTH = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
        this.kUrlRoomIdKey = "rtcRoomId";
        this.kUrlUserIdKey = "rtcUserId";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create LivePusherImpl with appId: ");
        sbLIZ.append(str);
        LogUtil.d("LivePusherImpl", C2188811AlT.LIZIZ(sbLIZ));
        if (str != null && checkUrls(strArr)) {
            this.mContext = C786410Ut5.N3(context);
            JSONObject jSONObjectParametersAppendUrls = parametersAppendUrls(jSONObject, strArr);
            RTCVideo rTCVideoCreateRTCVideo = RTCVideo.createRTCVideo(this.mContext, str, null, obj, gLESVersion, jSONObjectParametersAppendUrls);
            this.mRtcVideo = rTCVideoCreateRTCVideo;
            if (iLivePusherEventHandler != null) {
                if (rTCVideoCreateRTCVideo != null) {
                    iLivePusherEventHandler.onInitializedEngineEGL(((RTCVideoImpl) rTCVideoCreateRTCVideo).getGLESVersion());
                } else {
                    iLivePusherEventHandler.onInitializedEngineEGL(GLESVersion.GLES_VERSION_UNKNOWN);
                }
            }
            rtcVideoInstanceCount++;
            this.mLivePusherEventHandler = iLivePusherEventHandler;
            this.mExLivePusherEventHandler = new LivePusherEventHandler(this);
            this.mExStatisticsEventHandler = new StatisticsEventHandler(this);
            try {
                Context contextN3 = C786410Ut5.N3(this.mContext);
                LivePusherEventHandler livePusherEventHandler = this.mExLivePusherEventHandler;
                if (jSONObjectParametersAppendUrls == null) {
                    strJ3 = "";
                } else {
                    strJ3 = C786410Ut5.J3(jSONObjectParametersAppendUrls);
                }
                this.mNativeEngine = NativeLivePusherFunctions.nativeCreateLivePusher(contextN3, strArr, str, livePusherEventHandler, strJ3, livePusherOption);
                if (engineInvalid() && i == 0) {
                    RTCVideo.destroyRTCVideo();
                    this.mRtcVideo = null;
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("exception info:");
                sbLIZ2.append(e.getStackTrace().toString());
                throw new UnsatisfiedLinkError(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
    }
}
