package com.ss.lyrax;

import X.C2188811AlT;
import com.bytedance.realx.base.Logging;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.lyrax.audio.LyraxAudioPropertiesConfig;
import com.ss.lyrax.engine.ILyraxEngineListener;
import com.ss.lyrax.engine.ILyraxVideoStrategyRunner;
import com.ss.lyrax.engine.LyraxAttributeKey;
import com.ss.lyrax.engine.LyraxEngineImpl;
import com.ss.lyrax.engine.LyraxEngineOption;
import com.ss.lyrax.engine.LyraxMediaEnhanceConfig;
import com.ss.lyrax.engine.LyraxScene;
import com.ss.lyrax.engine.LyraxStrategyGrade;
import com.ss.lyrax.net.LyraxNetProberOption;
import com.ss.lyrax.publisher.LyraxPublisherOption;
import com.ss.lyrax.room.LyraxRoomOption;
import com.ss.lyrax.subscriber.LyraxSubscriberOption;
import com.ss.lyrax.utils.LyraxValue;
import com.ss.lyrax.utils.loader.LyraxNativeLibraryLoader;
import com.ss.lyrax.utils.loader.LyraxNativeLibraryLoaderImpl;
import com.ss.lyrax.video.AbsLyraxVideoPlatformWrapper;
import com.ss.lyrax.video.ILyraxVideoPlatformWrapper;
import com.ss.lyrax.video.LyraxVideoBitrateGearTableItem;
import com.ss.lyrax.video.LyraxVideoCodecConfig;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public abstract class ILyraxEngine implements ILyraxObject {
    public static LyraxNativeLibraryLoader mRtcNativeLibraryLoader = new LyraxNativeLibraryLoaderImpl();

    public abstract ILyraxNetProber createNetProber(LyraxNetProberOption lyraxNetProberOption);

    public abstract ILyraxPublisher createPublisher(LyraxPublisherOption lyraxPublisherOption);

    public abstract ILyraxRoom createRoom(LyraxRoomOption lyraxRoomOption);

    public abstract ILyraxSubscriber createSubscriber(LyraxSubscriberOption lyraxSubscriberOption);

    public abstract LyraxErrorCode disableDownlinkAudioSelection();

    public abstract void dispose();

    public abstract LyraxErrorCode enableAudioPropertiesReport(LyraxAudioPropertiesConfig lyraxAudioPropertiesConfig);

    public abstract LyraxErrorCode enableDownlinkAudioSelection(int i);

    public abstract ILyraxAudio getAudioModule();

    public abstract long getNetworkTimeInfo();

    public abstract ILyraxVideo getVideoModule();

    public abstract List<LyraxVideoCodecConfig> getVideoTargetDecoderDescriptions();

    public abstract LyraxErrorCode reportAPICall(String str, String str2);

    public abstract LyraxErrorCode reportSDKCallback(String str, String str2);

    public abstract LyraxErrorCode setBusinessID(String str);

    public abstract LyraxErrorCode setCellularEnhancement(LyraxMediaEnhanceConfig lyraxMediaEnhanceConfig);

    public abstract LyraxErrorCode setInAnchorNet(boolean z);

    public abstract LyraxErrorCode setListener(ILyraxEngineListener iLyraxEngineListener);

    public abstract LyraxErrorCode setLyraxAttribute(LyraxAttributeKey lyraxAttributeKey, LyraxValue lyraxValue);

    public abstract LyraxErrorCode setLyraxScene(LyraxScene lyraxScene);

    public abstract LyraxErrorCode setPerformanceGrade(LyraxStrategyGrade lyraxStrategyGrade);

    public abstract LyraxErrorCode setStrategyInfo(String str);

    public abstract LyraxErrorCode setVideoBitrateGearTable(List<LyraxVideoBitrateGearTableItem> list);

    public abstract LyraxErrorCode setVideoStrategyRunner(ILyraxVideoStrategyRunner iLyraxVideoStrategyRunner);

    public int unbindVideoPlatformWrapper() {
        ILyraxVideo videoModule = getVideoModule();
        return videoModule == null ? LyraxErrorCode.INVALID_STATE.value() : videoModule.unbindVideoPlatformWrapper();
    }

    public static ILyraxEngine create(LyraxEngineOption lyraxEngineOption) {
        try {
            return new LyraxEngineImpl(lyraxEngineOption);
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void setNativeLibraryLoader(LyraxNativeLibraryLoader lyraxNativeLibraryLoader) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set rtc native library loader");
        sbLIZ.append(lyraxNativeLibraryLoader);
        Logging.i("ILyraxEngine", C2188811AlT.LIZIZ(sbLIZ));
        mRtcNativeLibraryLoader = lyraxNativeLibraryLoader;
    }

    public int bindVideoPlatformWrapper(ILyraxVideoPlatformWrapper iLyraxVideoPlatformWrapper) {
        ILyraxVideo videoModule = getVideoModule();
        if (videoModule == null) {
            return LyraxErrorCode.INVALID_STATE.value();
        }
        if (!(iLyraxVideoPlatformWrapper instanceof AbsLyraxVideoPlatformWrapper)) {
            return LyraxErrorCode.INVALID_PARAMS.value();
        }
        return videoModule.bindVideoPlatformWrapper((AbsLyraxVideoPlatformWrapper) iLyraxVideoPlatformWrapper);
    }
}
