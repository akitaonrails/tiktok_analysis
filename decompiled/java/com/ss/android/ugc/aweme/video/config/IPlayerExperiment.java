package com.ss.android.ugc.aweme.video.config;

import X.C308310C6r;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public interface IPlayerExperiment {
    int ABR4GMaxResolutionIndex();

    int ABRFixedLevel();

    boolean Bytevc1PlayAddrPolicyUnifyExperiment();

    int PlayeAbDashHijackRetryEnableExp();

    int PlayeAbEnableCustomizeThreadPoolExp();

    int PlayeAbFixPrepareSeqTmpEnableExp();

    int PlayeAbVIDDashHijackRetryEnableExp();

    float PlayerAbABRBandwidthParamExp();

    float PlayerAbABRStallPenaltyParamExp();

    int PlayerAbABRStartUpModelExp();

    int PlayerAbABRSwitchCsModelExp();

    float PlayerAbABRSwitchPenaltyParamExp();

    int PlayerAbABRSwitchSensitivityExp();

    int PlayerAbABRTimerIntervalMillExp();

    boolean PreloadProcessDataExperiment();

    int cacheDuration(int i);

    long cdnUrlExpiredOffset();

    boolean enableBufferTimeControl();

    boolean enableCdnUrlExpiredExperiment();

    int enableIntertrust();

    int enableIntertrustDemotion();

    boolean enableLazyLoadVideoDecode();

    boolean enableNoSurfacePreRenderWithoutRender();

    boolean enableNoSurfacePreRenderWithoutRenderForStartup();

    boolean enableSoftwareDecodeBlockIssueOpt();

    List<C308310C6r> engineStaticOptionList();

    int frameWait();

    int get265DecodeType();

    float getVolLoudUnity();

    boolean isAsyncInit();

    boolean isCbofCache();

    boolean isDashABREnabled();

    boolean isDirectUrlCheckInfoEnable();

    boolean isOpenPlayerReleaseOpt();

    int memCacheVideoDurationThreshold();

    boolean playEventLogEnabled();

    int resumeFileIoBlockDurationThreshold();

    boolean videoBitRateEnabled();
}
