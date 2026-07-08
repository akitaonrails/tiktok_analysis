package com.ss.lyrax.pushersession;

import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.type.VideoStrategyChannelParams;
import com.ss.bytertc.engine.type.VideoStrategyChannelResult;
import com.ss.bytertc.engine.type.VideoStrategyParams;
import com.ss.bytertc.engine.video.IVideoStrategyResultListener;
import com.ss.bytertc.engine.video.IVideoStrategyRunner;
import com.ss.lyrax.ILyraxEngine;
import com.ss.lyrax.LyraxErrorCode;
import com.ss.lyrax.engine.ILyraxVideoStrategyRunner;
import com.ss.lyrax.engine.LyraxScene;
import com.ss.lyrax.engine.LyraxVideoStrategyChannelParams;
import com.ss.lyrax.engine.LyraxVideoStrategyChannelResult;
import com.ss.lyrax.engine.LyraxVideoStrategyParams;
import com.ss.lyrax.engine.LyraxVideoStrategyResultListener;
import com.ss.lyrax.transcoder.LyraxTranscoderFeaturesConfig;
import com.ss.lyrax.utils.LyraxNativeCleaner;
import com.ss.lyrax.video.ILyraxVideoPlatformWrapper;
import com.ss.lyrax.video.LyraxPreProcessVideoNodeStats;
import com.ss.lyrax.video.LyraxVideoBitrateGearTableItem;
import com.ss.lyrax.video.LyraxVideoDegradeConfig;
import com.ss.lyrax.video.LyraxVideoEncoderProfile;
import com.ss.lyrax.video.LyraxVideoFrame;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxPusherSessionImpl implements ILyraxPusherSession {
    public ILyraxPusherSessionListener listener;
    public final long nativeHandle;

    public static native LyraxErrorCode nativeAddUserMetadata(long j, String str, String str2);

    public static native LyraxErrorCode nativeBindToRoom(long j, String str);

    public static native LyraxErrorCode nativeCacheJoinRoomState(long j);

    public static native void nativeCleanup(long j);

    public static native long nativeCreate(LyraxPusherSessionOption lyraxPusherSessionOption, long j);

    public static native void nativeDestroy(long j);

    public static native LyraxErrorCode nativeEnableCalculateAudioLoudness(long j, boolean z);

    public static native int nativeGetCurrentScene(long j);

    public static native LyraxVideoDegradeConfig[] nativeGetDegradeLevelsNet(long j);

    public static native LyraxVideoDegradeConfig[] nativeGetDegradeLevelsPerf(long j);

    public static native long nativeGetDestroyPusherSession();

    public static native LyraxPusherState nativeGetPusherState(long j);

    public static native int nativeGetSessionVersion(long j);

    public static native String nativeGetStreamInfo(long j, String str);

    public static native LyraxVideoBitrateGearTableItem[] nativeGetVideoBitrateGearTable(long j);

    public static native void nativeInsertStandardLevel(long j, int i, int i2, int i3, int i4);

    public static native boolean nativeIsRunning(long j);

    public static native LyraxErrorCode nativePushVideoFrame(long j, LyraxVideoFrame lyraxVideoFrame);

    public static native void nativeReportFinalLog(long j, String str);

    public static native int nativeResetVideoPerformanceConfig(long j);

    public static native LyraxErrorCode nativeSendSEI(long j, LyraxPusherSEIParam lyraxPusherSEIParam);

    public static native LyraxErrorCode nativeSetAppState(long j, String str);

    public static native LyraxErrorCode nativeSetEncodeOutputSize(long j, int i, int i2);

    public static native LyraxErrorCode nativeSetFeaturesConfig(long j, LyraxTranscoderFeaturesConfig lyraxTranscoderFeaturesConfig);

    public static native LyraxErrorCode nativeSetListener(long j, ILyraxPusherSessionListener iLyraxPusherSessionListener);

    public static native LyraxErrorCode nativeSetSeiCurrentShiftDiffTime(long j, long j2);

    public static native LyraxErrorCode nativeSetVideoBitrate(long j, int i, int i2);

    public static native LyraxErrorCode nativeSetVideoFrameRate(long j, int i);

    public static native int nativeSetVideoPerformanceConfig(long j, int i, int i2, int i3);

    public static native LyraxErrorCode nativeSetVideoSource(long j, ILyraxVideoPlatformWrapper iLyraxVideoPlatformWrapper);

    public static native LyraxErrorCode nativeSetVideoStrategyRunner(long j, ILyraxVideoStrategyRunner iLyraxVideoStrategyRunner);

    public static native LyraxErrorCode nativeStartPush(long j, boolean z);

    public static native LyraxErrorCode nativeStopNormalLiving(long j);

    public static native LyraxErrorCode nativeStopPush(long j, boolean z);

    public static native LyraxErrorCode nativeSwitchScene(long j, int i);

    public static native LyraxErrorCode nativeUnbindFromRoom(long j, String str);

    public static native void nativeUpdateExternalStats(long j, LyraxPreProcessVideoNodeStats lyraxPreProcessVideoNodeStats);

    public static native LyraxErrorCode nativeUpdatePublishedTask(long j);

    @Override // com.ss.lyrax.pushersession.ILyraxPusherSession
    public void dispose() {
        setListener(null);
        nativeCleanup(this.nativeHandle);
        nativeDestroy(this.nativeHandle);
    }

    @Override // com.ss.lyrax.pushersession.ILyraxPusherSession
    public LyraxErrorCode cacheJoinRoomState() {
        long j = this.nativeHandle;
        return j == 0 ? LyraxErrorCode.ALREADY_DISPOSED : nativeCacheJoinRoomState(j);
    }

    public void finalize() throws Throwable {
        try {
            if (Build.VERSION.SDK_INT < 33) {
                LyraxNativeCleaner.nativeApplyFreeFunction(nativeGetDestroyPusherSession(), this.nativeHandle);
            }
            super.finalize();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            super.finalize();
            throw th;
        }
    }

    @Override // com.ss.lyrax.pushersession.ILyraxPusherSession
    public LyraxScene getCurrentScene() {
        long j = this.nativeHandle;
        return j == 0 ? LyraxScene.NONE : LyraxScene.fromId(nativeGetCurrentScene(j));
    }

    @Override // com.ss.lyrax.pushersession.ILyraxPusherSession
    public LyraxVideoEncoderProfile.VideoDegradeLevels getDegradeLevels() {
        LyraxVideoDegradeConfig[] lyraxVideoDegradeConfigArrNativeGetDegradeLevelsNet;
        if (this.nativeHandle == 0) {
            return null;
        }
        LyraxVideoEncoderProfile.VideoDegradeLevels videoDegradeLevels = new LyraxVideoEncoderProfile.VideoDegradeLevels();
        LyraxVideoDegradeConfig[] lyraxVideoDegradeConfigArrNativeGetDegradeLevelsPerf = nativeGetDegradeLevelsPerf(this.nativeHandle);
        if (lyraxVideoDegradeConfigArrNativeGetDegradeLevelsPerf == null || (lyraxVideoDegradeConfigArrNativeGetDegradeLevelsNet = nativeGetDegradeLevelsNet(this.nativeHandle)) == null) {
            return null;
        }
        for (LyraxVideoDegradeConfig lyraxVideoDegradeConfig : lyraxVideoDegradeConfigArrNativeGetDegradeLevelsPerf) {
            videoDegradeLevels.perf.add(lyraxVideoDegradeConfig);
        }
        for (LyraxVideoDegradeConfig lyraxVideoDegradeConfig2 : lyraxVideoDegradeConfigArrNativeGetDegradeLevelsNet) {
            videoDegradeLevels.f441net.add(lyraxVideoDegradeConfig2);
        }
        return videoDegradeLevels;
    }

    @Override // com.ss.lyrax.pushersession.ILyraxPusherSession
    public LyraxPusherState getPusherState() {
        long j = this.nativeHandle;
        return j == 0 ? new LyraxPusherState() : nativeGetPusherState(j);
    }

    @Override // com.ss.lyrax.pushersession.ILyraxPusherSession
    public int getSessionVersion() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0;
        }
        return nativeGetSessionVersion(j);
    }

    @Override // com.ss.lyrax.pushersession.ILyraxPusherSession
    public List<LyraxVideoBitrateGearTableItem> getVideoBitrateGearTable() {
        if (this.nativeHandle == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        LyraxVideoBitrateGearTableItem[] lyraxVideoBitrateGearTableItemArrNativeGetVideoBitrateGearTable = nativeGetVideoBitrateGearTable(this.nativeHandle);
        if (lyraxVideoBitrateGearTableItemArrNativeGetVideoBitrateGearTable != null) {
            for (LyraxVideoBitrateGearTableItem lyraxVideoBitrateGearTableItem : lyraxVideoBitrateGearTableItemArrNativeGetVideoBitrateGearTable) {
                arrayList.add(lyraxVideoBitrateGearTableItem);
            }
        }
        return arrayList;
    }

    @Override // com.ss.lyrax.pushersession.ILyraxPusherSession
    public boolean isRunning() {
        long j = this.nativeHandle;
        if (j == 0) {
            return false;
        }
        return nativeIsRunning(j);
    }

    public LyraxErrorCode stopNormalLiving() {
        long j = this.nativeHandle;
        return j == 0 ? LyraxErrorCode.ALREADY_DISPOSED : nativeStopNormalLiving(j);
    }

    public LyraxErrorCode updatePublishedTask() {
        long j = this.nativeHandle;
        return j == 0 ? LyraxErrorCode.ALREADY_DISPOSED : nativeUpdatePublishedTask(j);
    }

    @Override // com.ss.lyrax.ILyraxObject
    public long getNativePtr() {
        return this.nativeHandle;
    }

    public LyraxPusherSessionImpl(long j) {
        if (j != 0) {
            this.nativeHandle = j;
            LyraxNativeCleaner.register(this, j, nativeGetDestroyPusherSession());
            return;
        }
        throw new IllegalStateException("handle is nullptr");
    }

    @Override // com.ss.lyrax.pushersession.ILyraxPusherSession
    public LyraxErrorCode bindToRoom(String str) {
        long j = this.nativeHandle;
        if (j == 0) {
            return LyraxErrorCode.ALREADY_DISPOSED;
        }
        return nativeBindToRoom(j, str);
    }

    @Override // com.ss.lyrax.pushersession.ILyraxPusherSession
    public LyraxErrorCode enableCalculateAudioLoudness(boolean z) {
        long j = this.nativeHandle;
        if (j == 0) {
            return LyraxErrorCode.ALREADY_DISPOSED;
        }
        return nativeEnableCalculateAudioLoudness(j, z);
    }

    @Override // com.ss.lyrax.pushersession.ILyraxPusherSession
    public String getStreamInfo(String str) {
        long j = this.nativeHandle;
        if (j == 0) {
            return "";
        }
        return nativeGetStreamInfo(j, str);
    }

    @Override // com.ss.lyrax.pushersession.ILyraxPusherSession
    public LyraxErrorCode pushVideoFrame(LyraxVideoFrame lyraxVideoFrame) {
        long j = this.nativeHandle;
        if (j == 0) {
            return LyraxErrorCode.ALREADY_DISPOSED;
        }
        if (lyraxVideoFrame == null) {
            return LyraxErrorCode.INVALID_PARAMS;
        }
        return nativePushVideoFrame(j, lyraxVideoFrame);
    }

    @Override // com.ss.lyrax.pushersession.ILyraxPusherSession
    public void reportFinalLog(String str) {
        long j = this.nativeHandle;
        if (j != 0 && str != null) {
            nativeReportFinalLog(j, str);
        }
    }

    @Override // com.ss.lyrax.pushersession.ILyraxPusherSession
    public LyraxErrorCode resetVideoPerformanceConfig(String str) {
        long j = this.nativeHandle;
        if (j == 0) {
            return LyraxErrorCode.ALREADY_DISPOSED;
        }
        if (nativeResetVideoPerformanceConfig(j) == 0) {
            return LyraxErrorCode.SUCCESS;
        }
        return LyraxErrorCode.FAILURE;
    }

    @Override // com.ss.lyrax.pushersession.ILyraxPusherSession
    public LyraxErrorCode sendSEI(LyraxPusherSEIParam lyraxPusherSEIParam) {
        long j = this.nativeHandle;
        if (j == 0) {
            return LyraxErrorCode.ALREADY_DISPOSED;
        }
        if (lyraxPusherSEIParam == null) {
            return LyraxErrorCode.INVALID_PARAMS;
        }
        return nativeSendSEI(j, lyraxPusherSEIParam);
    }

    @Override // com.ss.lyrax.pushersession.ILyraxPusherSession
    public LyraxErrorCode setAppState(String str) {
        if (this.nativeHandle == 0) {
            return LyraxErrorCode.ALREADY_DISPOSED;
        }
        if (str != null && !str.isEmpty()) {
            return nativeSetAppState(this.nativeHandle, str);
        }
        return LyraxErrorCode.INVALID_PARAMS;
    }

    @Override // com.ss.lyrax.pushersession.ILyraxPusherSession
    public LyraxErrorCode setFeaturesConfig(LyraxTranscoderFeaturesConfig lyraxTranscoderFeaturesConfig) {
        long j = this.nativeHandle;
        if (j == 0) {
            return LyraxErrorCode.ALREADY_DISPOSED;
        }
        return nativeSetFeaturesConfig(j, lyraxTranscoderFeaturesConfig);
    }

    @Override // com.ss.lyrax.pushersession.ILyraxPusherSession
    public LyraxErrorCode setListener(ILyraxPusherSessionListener iLyraxPusherSessionListener) {
        long j = this.nativeHandle;
        if (j == 0) {
            return LyraxErrorCode.ALREADY_DISPOSED;
        }
        this.listener = iLyraxPusherSessionListener;
        return nativeSetListener(j, iLyraxPusherSessionListener);
    }

    @Override // com.ss.lyrax.pushersession.ILyraxPusherSession
    public LyraxErrorCode setSeiCurrentShiftDiffTime(long j) {
        long j2 = this.nativeHandle;
        if (j2 == 0) {
            return LyraxErrorCode.ALREADY_DISPOSED;
        }
        return nativeSetSeiCurrentShiftDiffTime(j2, j);
    }

    @Override // com.ss.lyrax.pushersession.ILyraxPusherSession
    public LyraxErrorCode setVideoFrameRate(int i) {
        long j = this.nativeHandle;
        if (j == 0) {
            return LyraxErrorCode.ALREADY_DISPOSED;
        }
        return nativeSetVideoFrameRate(j, i);
    }

    @Override // com.ss.lyrax.pushersession.ILyraxPusherSession
    public LyraxErrorCode setVideoSource(ILyraxVideoPlatformWrapper iLyraxVideoPlatformWrapper) {
        long j = this.nativeHandle;
        if (j == 0) {
            return LyraxErrorCode.ALREADY_DISPOSED;
        }
        return nativeSetVideoSource(j, iLyraxVideoPlatformWrapper);
    }

    public LyraxErrorCode setVideoStrategyRunner(IVideoStrategyRunner iVideoStrategyRunner) {
        if (this.nativeHandle == 0) {
            return LyraxErrorCode.ALREADY_DISPOSED;
        }
        return nativeSetVideoStrategyRunner(this.nativeHandle, new ILyraxVideoStrategyRunner(iVideoStrategyRunner) { // from class: com.ss.lyrax.pushersession.LyraxPusherSessionImpl.1
            public final IVideoStrategyRunner mRunner;
            public final /* synthetic */ IVideoStrategyRunner val$videoStrategyRunner;

            @Override // com.ss.lyrax.engine.ILyraxVideoStrategyRunner
            public boolean isActive() {
                IVideoStrategyRunner iVideoStrategyRunner2 = this.mRunner;
                if (iVideoStrategyRunner2 == null) {
                    return false;
                }
                return iVideoStrategyRunner2.isActive();
            }

            @Override // com.ss.lyrax.engine.ILyraxVideoStrategyRunner
            public void setResultListener(LyraxVideoStrategyResultListener lyraxVideoStrategyResultListener) {
                IVideoStrategyRunner iVideoStrategyRunner2 = this.mRunner;
                if (iVideoStrategyRunner2 != null) {
                    iVideoStrategyRunner2.setResultListener(new IVideoStrategyResultListener(lyraxVideoStrategyResultListener) { // from class: com.ss.lyrax.pushersession.LyraxPusherSessionImpl.1.1
                        public final LyraxVideoStrategyResultListener mListener;
                        public final /* synthetic */ LyraxVideoStrategyResultListener val$listener;

                        @Override // com.ss.bytertc.engine.video.IVideoStrategyResultListener
                        public void onVideoStrategyResult(VideoStrategyChannelResult[] videoStrategyChannelResultArr) {
                            LyraxVideoStrategyChannelResult[] lyraxVideoStrategyChannelResultArr = new LyraxVideoStrategyChannelResult[videoStrategyChannelResultArr.length];
                            for (int i = 0; i < videoStrategyChannelResultArr.length; i++) {
                                LyraxVideoStrategyChannelResult lyraxVideoStrategyChannelResult = new LyraxVideoStrategyChannelResult();
                                VideoStrategyChannelResult videoStrategyChannelResult = videoStrategyChannelResultArr[i];
                                lyraxVideoStrategyChannelResult.channelIndex = videoStrategyChannelResult.channelIndex;
                                lyraxVideoStrategyChannelResult.perfWidth = videoStrategyChannelResult.perfWidth;
                                lyraxVideoStrategyChannelResult.perfHeight = videoStrategyChannelResult.perfHeight;
                                lyraxVideoStrategyChannelResult.perfFps = videoStrategyChannelResult.perfFps;
                                lyraxVideoStrategyChannelResult.netWidth = videoStrategyChannelResult.netWidth;
                                lyraxVideoStrategyChannelResult.netHeight = videoStrategyChannelResult.netHeight;
                                lyraxVideoStrategyChannelResult.netFps = videoStrategyChannelResult.netFps;
                                lyraxVideoStrategyChannelResult.finalWidth = videoStrategyChannelResult.finalWidth;
                                lyraxVideoStrategyChannelResult.finalHeight = videoStrategyChannelResult.finalHeight;
                                lyraxVideoStrategyChannelResult.finalFps = videoStrategyChannelResult.finalFps;
                                lyraxVideoStrategyChannelResult.finalBps = videoStrategyChannelResult.finalBps;
                                lyraxVideoStrategyChannelResult.maxBps = videoStrategyChannelResult.maxBps;
                                lyraxVideoStrategyChannelResult.minBps = videoStrategyChannelResult.minBps;
                                lyraxVideoStrategyChannelResult.minRequestBps = videoStrategyChannelResult.minRequestBps;
                                lyraxVideoStrategyChannelResultArr[i] = lyraxVideoStrategyChannelResult;
                            }
                            this.mListener.onVideoStrategyResult(lyraxVideoStrategyChannelResultArr);
                        }

                        {
                            this.val$listener = lyraxVideoStrategyResultListener;
                            this.mListener = lyraxVideoStrategyResultListener;
                        }
                    });
                }
            }

            @Override // com.ss.lyrax.engine.ILyraxVideoStrategyRunner
            public void updateFeatures(LyraxVideoStrategyParams lyraxVideoStrategyParams) {
                VideoStrategyParams videoStrategyParams = new VideoStrategyParams();
                videoStrategyParams.mediaTargetBps = lyraxVideoStrategyParams.getMediaTargetBps();
                videoStrategyParams.sceneType = lyraxVideoStrategyParams.getSceneType();
                videoStrategyParams.channelEncInfoTable = new VideoStrategyChannelParams[lyraxVideoStrategyParams.getChannelEncInfoTable().length];
                for (int i = 0; i < lyraxVideoStrategyParams.getChannelEncInfoTable().length; i++) {
                    LyraxVideoStrategyChannelParams lyraxVideoStrategyChannelParams = lyraxVideoStrategyParams.getChannelEncInfoTable()[i];
                    VideoStrategyChannelParams videoStrategyChannelParams = new VideoStrategyChannelParams();
                    videoStrategyChannelParams.channelIndex = lyraxVideoStrategyChannelParams.channelIndex;
                    videoStrategyChannelParams.subscriberMaxDownlinkBps = lyraxVideoStrategyChannelParams.subscriberMaxDownlinkBps;
                    videoStrategyChannelParams.subscriberCount = lyraxVideoStrategyChannelParams.subscriberCount;
                    videoStrategyChannelParams.cfgMaxEncWidth = lyraxVideoStrategyChannelParams.cfgMaxEncWidth;
                    videoStrategyChannelParams.cfgMaxEncHeight = lyraxVideoStrategyChannelParams.cfgMaxEncHeight;
                    videoStrategyChannelParams.cfgMaxEncFps = lyraxVideoStrategyChannelParams.cfgMaxEncFps;
                    videoStrategyChannelParams.cfgMinEncBps = lyraxVideoStrategyChannelParams.cfgMinEncBps;
                    videoStrategyChannelParams.cfgMaxEncBps = lyraxVideoStrategyChannelParams.cfgMaxEncBps;
                    videoStrategyChannelParams.currentEncWidth = lyraxVideoStrategyChannelParams.currentEncWidth;
                    videoStrategyChannelParams.currentEncHeight = lyraxVideoStrategyChannelParams.currentEncHeight;
                    videoStrategyChannelParams.currentEncTargetFps = lyraxVideoStrategyChannelParams.currentEncTargetFps;
                    videoStrategyChannelParams.currentEncTargetBps = lyraxVideoStrategyChannelParams.currentEncTargetBps;
                    videoStrategyParams.channelEncInfoTable[i] = videoStrategyChannelParams;
                }
                IVideoStrategyRunner iVideoStrategyRunner2 = this.mRunner;
                if (iVideoStrategyRunner2 != null) {
                    iVideoStrategyRunner2.updateFeatures(videoStrategyParams);
                }
            }

            {
                this.val$videoStrategyRunner = iVideoStrategyRunner;
                this.mRunner = iVideoStrategyRunner;
            }
        });
    }

    @Override // com.ss.lyrax.pushersession.ILyraxPusherSession
    public LyraxErrorCode startPush(boolean z) {
        long j = this.nativeHandle;
        if (j == 0) {
            return LyraxErrorCode.ALREADY_DISPOSED;
        }
        return nativeStartPush(j, z);
    }

    @Override // com.ss.lyrax.pushersession.ILyraxPusherSession
    public LyraxErrorCode stopPush(boolean z) {
        long j = this.nativeHandle;
        if (j == 0) {
            return LyraxErrorCode.ALREADY_DISPOSED;
        }
        return nativeStopPush(j, z);
    }

    @Override // com.ss.lyrax.pushersession.ILyraxPusherSession
    public LyraxErrorCode switchScene(LyraxScene lyraxScene) {
        long j = this.nativeHandle;
        if (j == 0) {
            return LyraxErrorCode.ALREADY_DISPOSED;
        }
        return nativeSwitchScene(j, lyraxScene.value());
    }

    @Override // com.ss.lyrax.pushersession.ILyraxPusherSession
    public LyraxErrorCode unbindFromRoom(String str) {
        long j = this.nativeHandle;
        if (j == 0) {
            return LyraxErrorCode.ALREADY_DISPOSED;
        }
        return nativeUnbindFromRoom(j, str);
    }

    @Override // com.ss.lyrax.pushersession.ILyraxPusherSession
    public LyraxErrorCode updateExternalStats(LyraxPreProcessVideoNodeStats lyraxPreProcessVideoNodeStats) {
        long j = this.nativeHandle;
        if (j == 0) {
            return LyraxErrorCode.ALREADY_DISPOSED;
        }
        nativeUpdateExternalStats(j, lyraxPreProcessVideoNodeStats);
        return LyraxErrorCode.SUCCESS;
    }

    public static LyraxPusherSessionImpl create(LyraxPusherSessionOption lyraxPusherSessionOption, ILyraxEngine iLyraxEngine) {
        long jNativeCreate;
        if (lyraxPusherSessionOption == null) {
            return null;
        }
        if (iLyraxEngine != null) {
            jNativeCreate = nativeCreate(lyraxPusherSessionOption, iLyraxEngine.getNativePtr());
        } else {
            jNativeCreate = nativeCreate(lyraxPusherSessionOption, 0L);
        }
        if (jNativeCreate == 0) {
            return null;
        }
        return new LyraxPusherSessionImpl(jNativeCreate);
    }

    @Override // com.ss.lyrax.pushersession.ILyraxPusherSession
    public LyraxErrorCode addUserMetadata(String str, String str2) {
        long j = this.nativeHandle;
        if (j == 0) {
            return LyraxErrorCode.ALREADY_DISPOSED;
        }
        return nativeAddUserMetadata(j, str, str2);
    }

    @Override // com.ss.lyrax.pushersession.ILyraxPusherSession
    public LyraxErrorCode setEncodeOutputSize(int i, int i2) {
        long j = this.nativeHandle;
        if (j == 0) {
            return LyraxErrorCode.ALREADY_DISPOSED;
        }
        return nativeSetEncodeOutputSize(j, i, i2);
    }

    @Override // com.ss.lyrax.pushersession.ILyraxPusherSession
    public LyraxErrorCode setVideoBitrate(int i, int i2) {
        long j = this.nativeHandle;
        if (j == 0) {
            return LyraxErrorCode.ALREADY_DISPOSED;
        }
        return nativeSetVideoBitrate(j, i, i2);
    }

    @Override // com.ss.lyrax.pushersession.ILyraxPusherSession
    public LyraxErrorCode insertStandardLevel(int i, int i2, int i3, int i4) {
        long j = this.nativeHandle;
        if (j == 0) {
            return LyraxErrorCode.ALREADY_DISPOSED;
        }
        nativeInsertStandardLevel(j, i, i2, i3, i4);
        return LyraxErrorCode.SUCCESS;
    }

    @Override // com.ss.lyrax.pushersession.ILyraxPusherSession
    public LyraxErrorCode setVideoPerformanceConfig(int i, int i2, int i3, String str) {
        long j = this.nativeHandle;
        if (j == 0) {
            return LyraxErrorCode.ALREADY_DISPOSED;
        }
        if (nativeSetVideoPerformanceConfig(j, i, i2, i3) == 0) {
            return LyraxErrorCode.SUCCESS;
        }
        return LyraxErrorCode.FAILURE;
    }
}
