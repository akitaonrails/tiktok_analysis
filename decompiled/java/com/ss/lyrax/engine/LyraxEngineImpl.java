package com.ss.lyrax.engine;

import X.C2188811AlT;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.realx.base.Logging;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.ss.bytertc.engine.GLESVersion;
import com.ss.bytertc.engine.loader.LyraxPluginConfig;
import com.ss.bytertc.engine.utils.AppMonitor;
import com.ss.lyrax.ILyraxAudio;
import com.ss.lyrax.ILyraxEngine;
import com.ss.lyrax.ILyraxNetProber;
import com.ss.lyrax.ILyraxPublisher;
import com.ss.lyrax.ILyraxRoom;
import com.ss.lyrax.ILyraxSubscriber;
import com.ss.lyrax.ILyraxVideo;
import com.ss.lyrax.LyraxErrorCode;
import com.ss.lyrax.audio.LyraxAudioImpl;
import com.ss.lyrax.audio.LyraxAudioPropertiesConfig;
import com.ss.lyrax.engine.LyraxEglEnvironment;
import com.ss.lyrax.net.LyraxNetProberImpl;
import com.ss.lyrax.net.LyraxNetProberOption;
import com.ss.lyrax.publisher.LyraxPublisherImpl;
import com.ss.lyrax.publisher.LyraxPublisherOption;
import com.ss.lyrax.room.LyraxRoomImpl;
import com.ss.lyrax.room.LyraxRoomOption;
import com.ss.lyrax.stream.LyraxStreamIndex;
import com.ss.lyrax.subscriber.LyraxSubscriberImpl;
import com.ss.lyrax.subscriber.LyraxSubscriberOption;
import com.ss.lyrax.utils.LyraxNativeCleaner;
import com.ss.lyrax.utils.LyraxValue;
import com.ss.lyrax.utils.loader.LyraxNativeLibraryLoader;
import com.ss.lyrax.utils.loader.LyraxNativeLibraryLoaderInfo;
import com.ss.lyrax.video.AbsLyraxVideoPlatformWrapper;
import com.ss.lyrax.video.ILyraxVideoPlatformWrapper;
import com.ss.lyrax.video.LyraxVideoBitrateGearTableItem;
import com.ss.lyrax.video.LyraxVideoCodecConfig;
import com.ss.lyrax.video.LyraxVideoImpl;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxEngineImpl extends ILyraxEngine {
    public static boolean mLibraryLoaded;
    public AppMonitor.Callback appStateCallback = new AppMonitor.Callback() { // from class: X.0jLh
        @Override // com.ss.bytertc.engine.utils.AppMonitor.Callback
        public final void callback(int i) {
            this.LIZ.lambda$new$0(i);
        }
    };
    public final long handle;
    public Context mContext;
    public ILyraxVideo videoModule;
    public static LyraxNativeLibraryLoaderInfo sRtcLoaderInfo = new LyraxNativeLibraryLoaderInfo();
    public static volatile GLESVersion mRootGlesVersion = GLESVersion.GLES_VERSION_UNKNOWN;
    public static final Map<LyraxNativeLibraryLoadStatus, String> sRtcLoadStatReports = new ConcurrentHashMap();

    public static native LyraxErrorCode nativeBindVideoPlatformWrapper(long j, AbsLyraxVideoPlatformWrapper absLyraxVideoPlatformWrapper);

    public static native String nativeBuildRemoteVideoRenderId(String str, int i);

    public static native long nativeCreateEngine(LyraxEngineOption lyraxEngineOption);

    public static native long nativeCreateNetProber(long j, LyraxNetProberOption lyraxNetProberOption);

    public static native long nativeCreatePublisher(long j, LyraxPublisherOption lyraxPublisherOption);

    public static native long nativeCreateRoom(long j, LyraxRoomOption lyraxRoomOption);

    public static native long nativeCreateSubscriber(long j, LyraxSubscriberOption lyraxSubscriberOption);

    public static native LyraxErrorCode nativeDisableDownlinkAudioSelection(long j);

    public static native void nativeDispose(long j);

    public static native LyraxErrorCode nativeEnableAudioPropertiesReport(long j, LyraxAudioPropertiesConfig lyraxAudioPropertiesConfig);

    public static native LyraxErrorCode nativeEnableDownlinkAudioSelection(long j, int i);

    public static native boolean nativeEquals(long j, long j2);

    public static native long nativeGetAudioModule(long j);

    public static native long nativeGetDestroyEngine();

    public static native long nativeGetNetworkTimeInfo(long j);

    public static native long nativeGetVideoModule(long j);

    public static native List<LyraxVideoCodecConfig> nativeGetVideoTargetDecoderDescriptions(long j);

    public static native LyraxErrorCode nativeReportAPICall(long j, String str, String str2);

    public static native LyraxErrorCode nativeReportSDKCallback(long j, String str, String str2);

    public static native LyraxErrorCode nativeSetBusinessID(long j, String str);

    public static native LyraxErrorCode nativeSetCellularEnhancement(long j, LyraxMediaEnhanceConfig lyraxMediaEnhanceConfig);

    public static native LyraxErrorCode nativeSetInAnchorNet(long j, boolean z);

    public static native LyraxErrorCode nativeSetListener(long j, ILyraxEngineListener iLyraxEngineListener);

    public static native LyraxErrorCode nativeSetLyraxAttribute(long j, LyraxAttributeKey lyraxAttributeKey, LyraxValue lyraxValue);

    public static native LyraxErrorCode nativeSetLyraxScene(long j, LyraxScene lyraxScene);

    public static native LyraxErrorCode nativeSetPerformanceGrade(long j, LyraxStrategyGrade lyraxStrategyGrade);

    public static native LyraxErrorCode nativeSetStrategyInfo(long j, String str);

    public static native LyraxErrorCode nativeSetVideoBitrateGearTable(long j, List<LyraxVideoBitrateGearTableItem> list);

    public static native LyraxErrorCode nativeSetVideoStrategyRunner(long j, ILyraxVideoStrategyRunner iLyraxVideoStrategyRunner);

    public static native LyraxErrorCode nativeUnbindVideoPlatformWrapper(long j);

    @Override // com.ss.lyrax.ILyraxEngine
    public synchronized ILyraxVideo getVideoModule() {
        if (this.videoModule == null) {
            long jNativeGetVideoModule = nativeGetVideoModule(this.handle);
            if (jNativeGetVideoModule == 0) {
                return null;
            }
            this.videoModule = new LyraxVideoImpl(jNativeGetVideoModule);
        }
        return this.videoModule;
    }

    static {
        loadSoFile();
    }

    @Override // com.ss.lyrax.ILyraxEngine
    public LyraxErrorCode disableDownlinkAudioSelection() {
        return nativeDisableDownlinkAudioSelection(this.handle);
    }

    @Override // com.ss.lyrax.ILyraxEngine
    public void dispose() {
        reportAPICall("java_dispose", "lyrax java engine dispose");
        AppMonitor appMonitor = AppMonitor.get(this.mContext);
        appMonitor.unRegister(this.appStateCallback);
        appMonitor.release(this.mContext);
        nativeDispose(this.handle);
    }

    public void finalize() throws Throwable {
        try {
            if (Build.VERSION.SDK_INT < 33) {
                LyraxNativeCleaner.nativeApplyFreeFunction(nativeGetDestroyEngine(), this.handle);
            }
            super.finalize();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            super.finalize();
            throw th;
        }
    }

    @Override // com.ss.lyrax.ILyraxEngine
    public ILyraxAudio getAudioModule() {
        long jNativeGetAudioModule = nativeGetAudioModule(this.handle);
        if (jNativeGetAudioModule == 0) {
            return null;
        }
        return new LyraxAudioImpl(jNativeGetAudioModule);
    }

    @Override // com.ss.lyrax.ILyraxEngine
    public long getNetworkTimeInfo() {
        return nativeGetNetworkTimeInfo(this.handle);
    }

    @Override // com.ss.lyrax.ILyraxEngine
    public List<LyraxVideoCodecConfig> getVideoTargetDecoderDescriptions() {
        return nativeGetVideoTargetDecoderDescriptions(this.handle);
    }

    @Override // com.ss.lyrax.ILyraxEngine
    public int unbindVideoPlatformWrapper() {
        return nativeUnbindVideoPlatformWrapper(this.handle).value();
    }

    public static void loadSoFile() {
        String soLibraryName = LyraxPluginConfig.getSoLibraryName();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[LYRAX_SO_LOAD] LyraxEngineImpl.loadSoFile: soName=");
        sbLIZ.append(soLibraryName);
        sbLIZ.append(", pluginState=");
        sbLIZ.append(LyraxPluginConfig.getPluginState());
        LyraxPluginConfig.safeLogW("LyraxEngineImpl", C2188811AlT.LIZIZ(sbLIZ));
        Map<LyraxNativeLibraryLoadStatus, String> map = sRtcLoadStatReports;
        map.clear();
        if (mLibraryLoaded) {
            map.put(LyraxNativeLibraryLoadStatus.ALREADY_LOADED, soLibraryName);
        } else {
            LyraxNativeLibraryLoader lyraxNativeLibraryLoader = ILyraxEngine.mRtcNativeLibraryLoader;
            if (lyraxNativeLibraryLoader != null) {
                mLibraryLoaded = true;
                boolean zLoad = lyraxNativeLibraryLoader.load("bytenn") & true;
                mLibraryLoaded = zLoad;
                boolean zLoad2 = zLoad & ILyraxEngine.mRtcNativeLibraryLoader.load(soLibraryName);
                mLibraryLoaded = zLoad2;
                if (zLoad2) {
                    map.put(LyraxNativeLibraryLoadStatus.LOADED_SUCCESS, soLibraryName);
                } else {
                    map.put(LyraxNativeLibraryLoadStatus.LOADED_ERROR, soLibraryName);
                }
                sRtcLoaderInfo.setLoaderClassName(ILyraxEngine.mRtcNativeLibraryLoader.getClass().getSimpleName());
            } else {
                try {
                    INVOKESTATIC_com_ss_lyrax_engine_LyraxEngineImpl_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("bytenn");
                    INVOKESTATIC_com_ss_lyrax_engine_LyraxEngineImpl_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(soLibraryName);
                    mLibraryLoaded = true;
                    map.put(LyraxNativeLibraryLoadStatus.LOADED_SUCCESS, soLibraryName);
                    sRtcLoaderInfo.setLoaderClassName("System.loader");
                } catch (UnsatisfiedLinkError e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Failed to load native library: ");
                    sbLIZ2.append(soLibraryName);
                    Logging.e("LyraxEngineImpl", C2188811AlT.LIZIZ(sbLIZ2), e);
                }
                sRtcLoadStatReports.put(LyraxNativeLibraryLoadStatus.LOADED_ERROR, soLibraryName);
            }
            sRtcLoaderInfo.setLoadResult(mLibraryLoaded);
            sRtcLoaderInfo.setLoadTimeStampMs(System.currentTimeMillis());
        }
        sRtcLoaderInfo.loadLibrary();
    }

    @Override // com.ss.lyrax.ILyraxObject
    public long getNativePtr() {
        return this.handle;
    }

    public LyraxEngineImpl(LyraxEngineOption lyraxEngineOption) {
        if (lyraxEngineOption.forceInitEnv) {
            LyraxAndroidOption lyraxAndroidOption = lyraxEngineOption.androidOption;
            LyraxEglEnvironment.init(lyraxAndroidOption.eglContext, lyraxAndroidOption.glesVersion, new LyraxEglEnvironment.EglInitEventListener() { // from class: com.ss.lyrax.engine.LyraxEngineImpl.1
                @Override // com.ss.lyrax.engine.LyraxEglEnvironment.EglInitEventListener
                public void onInitializedEngineEGL(GLESVersion gLESVersion) {
                    LyraxEngineImpl.mRootGlesVersion = gLESVersion;
                }
            });
        }
        long jNativeCreateEngine = nativeCreateEngine(lyraxEngineOption);
        this.handle = jNativeCreateEngine;
        if (jNativeCreateEngine != 0) {
            this.mContext = lyraxEngineOption.androidOption.context;
            LyraxNativeCleaner.register(this, jNativeCreateEngine, nativeGetDestroyEngine());
            AppMonitor.get(lyraxEngineOption.androidOption.context).register(lyraxEngineOption.androidOption.context, this.appStateCallback);
            if (lyraxEngineOption.forceInitEnv) {
                getAudioModule();
                return;
            }
            return;
        }
        throw new IllegalStateException("Failed to create LyraxEngine");
    }

    public static void INVOKESTATIC_com_ss_lyrax_engine_LyraxEngineImpl_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(int i) {
        String str;
        if (getNativePtr() != 0) {
            if (i == 1) {
                str = "active";
            } else {
                str = "background";
            }
            setLyraxAttribute(LyraxAttributeKey.APP_STATE, new LyraxValue(str));
        }
    }

    @Override // com.ss.lyrax.ILyraxEngine
    public int bindVideoPlatformWrapper(ILyraxVideoPlatformWrapper iLyraxVideoPlatformWrapper) {
        if (!(iLyraxVideoPlatformWrapper instanceof AbsLyraxVideoPlatformWrapper)) {
            return LyraxErrorCode.INVALID_PARAMS.value();
        }
        return nativeBindVideoPlatformWrapper(this.handle, (AbsLyraxVideoPlatformWrapper) iLyraxVideoPlatformWrapper).value();
    }

    @Override // com.ss.lyrax.ILyraxEngine
    public ILyraxNetProber createNetProber(LyraxNetProberOption lyraxNetProberOption) {
        long jNativeCreateNetProber = nativeCreateNetProber(this.handle, lyraxNetProberOption);
        if (jNativeCreateNetProber == 0) {
            return null;
        }
        return new LyraxNetProberImpl(jNativeCreateNetProber);
    }

    @Override // com.ss.lyrax.ILyraxEngine
    public ILyraxPublisher createPublisher(LyraxPublisherOption lyraxPublisherOption) {
        long jNativeCreatePublisher = nativeCreatePublisher(this.handle, lyraxPublisherOption);
        if (jNativeCreatePublisher == 0) {
            return null;
        }
        return new LyraxPublisherImpl(jNativeCreatePublisher);
    }

    @Override // com.ss.lyrax.ILyraxEngine
    public ILyraxRoom createRoom(LyraxRoomOption lyraxRoomOption) {
        long jNativeCreateRoom = nativeCreateRoom(this.handle, lyraxRoomOption);
        if (jNativeCreateRoom == 0) {
            return null;
        }
        return new LyraxRoomImpl(jNativeCreateRoom);
    }

    @Override // com.ss.lyrax.ILyraxEngine
    public ILyraxSubscriber createSubscriber(LyraxSubscriberOption lyraxSubscriberOption) {
        long jNativeCreateSubscriber = nativeCreateSubscriber(this.handle, lyraxSubscriberOption);
        if (jNativeCreateSubscriber == 0) {
            return null;
        }
        return new LyraxSubscriberImpl(jNativeCreateSubscriber);
    }

    @Override // com.ss.lyrax.ILyraxEngine
    public LyraxErrorCode enableAudioPropertiesReport(LyraxAudioPropertiesConfig lyraxAudioPropertiesConfig) {
        return nativeEnableAudioPropertiesReport(this.handle, lyraxAudioPropertiesConfig);
    }

    @Override // com.ss.lyrax.ILyraxEngine
    public LyraxErrorCode enableDownlinkAudioSelection(int i) {
        return nativeEnableDownlinkAudioSelection(this.handle, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof LyraxEngineImpl)) {
            return nativeEquals(this.handle, ((LyraxEngineImpl) obj).handle);
        }
        return false;
    }

    @Override // com.ss.lyrax.ILyraxEngine
    public LyraxErrorCode setBusinessID(String str) {
        return nativeSetBusinessID(this.handle, str);
    }

    @Override // com.ss.lyrax.ILyraxEngine
    public LyraxErrorCode setCellularEnhancement(LyraxMediaEnhanceConfig lyraxMediaEnhanceConfig) {
        return nativeSetCellularEnhancement(this.handle, lyraxMediaEnhanceConfig);
    }

    @Override // com.ss.lyrax.ILyraxEngine
    public LyraxErrorCode setInAnchorNet(boolean z) {
        return nativeSetInAnchorNet(this.handle, z);
    }

    @Override // com.ss.lyrax.ILyraxEngine
    public LyraxErrorCode setListener(ILyraxEngineListener iLyraxEngineListener) {
        if (iLyraxEngineListener != null) {
            for (Map.Entry<LyraxNativeLibraryLoadStatus, String> entry : sRtcLoadStatReports.entrySet()) {
                iLyraxEngineListener.onNativeLibraryLoadInfo(entry.getKey(), entry.getValue());
            }
            iLyraxEngineListener.onInitializedEngineEGL(mRootGlesVersion);
        }
        return nativeSetListener(this.handle, iLyraxEngineListener);
    }

    @Override // com.ss.lyrax.ILyraxEngine
    public LyraxErrorCode setLyraxScene(LyraxScene lyraxScene) {
        return nativeSetLyraxScene(this.handle, lyraxScene);
    }

    @Override // com.ss.lyrax.ILyraxEngine
    public LyraxErrorCode setPerformanceGrade(LyraxStrategyGrade lyraxStrategyGrade) {
        return nativeSetPerformanceGrade(this.handle, lyraxStrategyGrade);
    }

    @Override // com.ss.lyrax.ILyraxEngine
    public LyraxErrorCode setStrategyInfo(String str) {
        return nativeSetStrategyInfo(this.handle, str);
    }

    @Override // com.ss.lyrax.ILyraxEngine
    public LyraxErrorCode setVideoBitrateGearTable(List<LyraxVideoBitrateGearTableItem> list) {
        return nativeSetVideoBitrateGearTable(this.handle, list);
    }

    @Override // com.ss.lyrax.ILyraxEngine
    public LyraxErrorCode setVideoStrategyRunner(ILyraxVideoStrategyRunner iLyraxVideoStrategyRunner) {
        return nativeSetVideoStrategyRunner(this.handle, iLyraxVideoStrategyRunner);
    }

    public static String buildRemoteVideoRenderId(String str, LyraxStreamIndex lyraxStreamIndex) {
        if (str == null) {
            str = "";
        }
        if (lyraxStreamIndex == null) {
            lyraxStreamIndex = LyraxStreamIndex.kMain;
        }
        return nativeBuildRemoteVideoRenderId(str, lyraxStreamIndex.value());
    }

    @Override // com.ss.lyrax.ILyraxEngine
    public LyraxErrorCode reportAPICall(String str, String str2) {
        return nativeReportAPICall(this.handle, str, str2);
    }

    @Override // com.ss.lyrax.ILyraxEngine
    public LyraxErrorCode reportSDKCallback(String str, String str2) {
        return nativeReportSDKCallback(this.handle, str, str2);
    }

    @Override // com.ss.lyrax.ILyraxEngine
    public LyraxErrorCode setLyraxAttribute(LyraxAttributeKey lyraxAttributeKey, LyraxValue lyraxValue) {
        return nativeSetLyraxAttribute(this.handle, lyraxAttributeKey, lyraxValue);
    }
}
