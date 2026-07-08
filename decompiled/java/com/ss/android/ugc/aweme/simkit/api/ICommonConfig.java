package com.ss.android.ugc.aweme.simkit.api;

import X.C0XA1;
import X.InterfaceC1477050oXX;
import X.InterfaceC1477240oXq;
import X.InterfaceC1477620oYS;
import X.InterfaceC1477730oYd;
import com.ss.android.ugc.aweme.simkit.model.FeedCacheStrategyConfig;
import com.ss.android.ugc.aweme.simkit.model.LoudnessStrategyConfig;
import com.ss.android.ugc.aweme.simkit.model.SceneLoudnessConfig;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.ss.android.ugc.aweme.simkit.model.superresolution.SuperResolutionStrategyConfigV2;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public interface ICommonConfig {
    boolean checkIsBytevc1InCache(SimVideoUrlModel simVideoUrlModel);

    double getBitrateSwitchThreshold();

    List<InterfaceC1477240oXq> getColdBootVideoUrlHooks();

    C0XA1 getCommonParamsProcessor();

    int getDefaultCDNTimeoutTime();

    RateSettingsResponse getDefaultRateSettingsResponse();

    FeedCacheStrategyConfig getFeedCacheStrategyConfig();

    InterfaceC1477620oYS getForceSuperResolutionListener();

    String getIncompleteLocalVideoPath(SimVideoUrlModel simVideoUrlModel);

    int getLastNetworkSpeed();

    String getLocalVideoPath(SimVideoUrlModel simVideoUrlModel);

    String getLocalVideoPath(String str);

    LoudnessStrategyConfig getLoudnessStrategyConfig();

    RateSettingsResponse getRateSettingsResponse();

    SceneLoudnessConfig getSceneLoudnessConfig();

    float getSrTimeParam();

    InterfaceC1477050oXX getSuperResolutionStrategy();

    SuperResolutionStrategyConfigV2 getSuperResolutionStrategyConfigV2();

    InterfaceC1477730oYd getVideoUrlHookHook();

    List<InterfaceC1477240oXq> getVideoUrlHooks();

    boolean isCloseSimKitReporter();

    boolean isSkipSelectBitrate(SimVideoUrlModel simVideoUrlModel);

    boolean isUseLastNetworkSpeed();

    boolean onPreGetProperBitrate(SimVideoUrlModel simVideoUrlModel);

    void setForceSuperResolutionListener(InterfaceC1477620oYS interfaceC1477620oYS);

    boolean simKitStrategyEnabled();
}
