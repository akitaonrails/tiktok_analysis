package com.ss.android.ugc.aweme.video.preload;

import X.C1476830oXB;
import X.C1477160oXi;
import X.EnumC2281141EQm;
import X.InterfaceC1469840oLu;
import X.InterfaceC1471450oOV;
import X.InterfaceC1472690oQV;
import X.InterfaceC1474850oTz;
import X.InterfaceC1474890oU3;
import X.InterfaceC1474910oU5;
import X.InterfaceC1474920oU6;
import X.InterfaceC1475250oUd;
import X.InterfaceC1475350oUn;
import X.InterfaceC1475520oV4;
import X.InterfaceC1476900oXI;
import X.InterfaceC1482820ogq;
import com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public interface IVideoPreloadConfig {
    boolean canPreload();

    InterfaceC1475250oUd createVideoUrlProcessor();

    boolean enableLoadMorePreload();

    boolean forbidBypassCookie();

    InterfaceC1475350oUn getAppLog();

    IPreloaderExperiment getExperiment();

    InterfaceC1474920oU6 getKVStorageProvider();

    InterfaceC1474890oU3 getMLServiceSpeedModel();

    InterfaceC1469840oLu getNetClient();

    int getNetworkRttMs();

    int getNetworkType();

    InterfaceC1475520oV4 getPlayerEventReportService();

    InterfaceC1482820ogq getPreloadStrategy();

    C1476830oXB getProperBitrateForDash(SimVideoUrlModel simVideoUrlModel, InterfaceC1476900oXI interfaceC1476900oXI, boolean z, int i);

    EnumC2281141EQm getProperResolution(String str, InterfaceC1476900oXI interfaceC1476900oXI);

    InterfaceC1471450oOV getQOSSpeedUpService();

    Map<String, String> getRequestHeader(String str);

    C1477160oXi getSelectedBitrateForColdBoot(SimVideoUrlModel simVideoUrlModel);

    InterfaceC1472690oQV getSensitiveSceneTransmitter();

    InterfaceC1474850oTz getSpeedManager();

    InterfaceC1474910oU5 getVideoCachePlugin();

    boolean isDashABREnabled();

    boolean isOpenDataFreeMode();

    boolean isPlayerPreferchCaption();

    boolean isPlayerPreferchTtsAudio();

    boolean isPreloadV3Enabled();

    float playerPreferchCaptionSize();

    float playerPreferchTtsAudioSize();

    String preloadConfigJsonInScene();

    boolean useSyncPreloadStyle();
}
