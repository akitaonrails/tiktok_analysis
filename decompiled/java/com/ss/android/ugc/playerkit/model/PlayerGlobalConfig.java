package com.ss.android.ugc.playerkit.model;

import X.C00UI;
import X.C0CJP;
import X.EnumC1479760obu;
import X.InterfaceC1479910oc9;
import android.content.Context;

/* JADX INFO: loaded from: classes24.dex */
public interface PlayerGlobalConfig {
    Context context();

    boolean forceHttps();

    float getAdjustedVolume();

    String getAudioRoute();

    boolean getAutoAudioFocus();

    int getBitrateSelectMode();

    int getEnableSAMISDKAB();

    String getGraphJson();

    C0CJP getLiveGlobalConfig();

    int getPlaybackAbility();

    int getPlayerBackgroundSleepStrategy();

    int getPlayerFramesWait();

    EnumC1479760obu getPlayerType();

    String getPredictLabelResult();

    int getPreloadType();

    int getRenderType();

    C00UI getVideoEffectInfo(String str);

    boolean isAsyncInit();

    boolean isCallbackCompletionFix();

    boolean isDebug();

    boolean isDynamicBitrateEnable();

    boolean isDynamicConfigAvailable();

    boolean isEnableByteVC1AutoRetry();

    boolean isEnableBytevc1();

    boolean isEnableBytevc1BlackList();

    boolean isEnablePlayerLogV2();

    boolean isEnableSurfaceLifeCycleNotification();

    boolean isMultiPlayer();

    boolean isPowerModeHandlerEnable();

    boolean isPrepareAhead();

    boolean isPrerenderSurfaceSlowSetFix();

    boolean isSurfaceViewLogOpt();

    boolean isUseOptimizedSurfaceView();

    boolean isUseSurfaceControl();

    boolean isUseSurfaceView();

    boolean isUseVideoTextureRenderer();

    boolean optGlobalAppAnr();

    boolean optSpecialAppAnr();

    InterfaceC1479910oc9 prepareConfig();

    void setAutoAudioFocus(boolean z, String str);

    void setForceHttps(boolean z);
}
