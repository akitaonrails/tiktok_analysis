package com.ss.android.ugc.aweme.video.preload.api;

import X.C07R8;
import X.C0NKF;
import X.C308310C6r;
import com.ss.android.ugc.aweme.video.preload.model.EnginePreloaderConfig;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public interface IPreloaderExperiment {
    int DisableVideocacheLocalServerExperiment();

    boolean EnableDetailNotification();

    int EnableDownloaderLogExpErrorExperiment();

    boolean EnableGetCDNLogExperiment();

    Boolean EnablePreloaderPreConnect();

    boolean EnableTTnetClientInject();

    int EngineEnableMaxFileMemCacheNumExp();

    int EngineEnableMaxFileMemCacheSizeExp();

    int EnginePreloaderConcurrentNumExperiment();

    EnginePreloaderConfig EnginePreloaderConfigExperiment();

    int EnginePreloaderEnableNetworkChangedListenExperiment();

    int EnginePreloaderNetSchedulerBlockAllNetErrorExperiment();

    int EnginePreloaderNetSchedulerBlockDurationExperiment();

    int EnginePreloaderNetSchedulerBlockErrorCountExperiment();

    int EnginePreloaderNetSchedulerEnableExperiment();

    int EnginePreloaderOpenTimeoutExperiment();

    int EnginePreloaderPreloadStrategyExperiment();

    int EnginePreloaderRWTimeoutExperiment();

    int EnginePreloaderStackOrQueueExperiment();

    int EnginePreloaderTlsSessionTimeoutExperiment();

    int P2pStragetyEnableSyndnsExperiment();

    int P2pStragetyExpiredTimeExperiment();

    int P2pStragetyMaxBufferingTimeExperiment();

    int P2pStragetyMaxLeaveWaitTimeExperiment();

    int P2pStragetyMinNetSpeedExperiment();

    int P2pStragetyMinPlayNumberExperiment();

    int P2pStragetyXyLibValueExperiment();

    int PlayerAbABRAlgoExp();

    int PlayerAbBackupDnsTypeExp();

    int PlayerAbChecksumLevelExp();

    int PlayerAbDashPreloadAudioFirstExp();

    int PlayerAbEnableDebugLogExp();

    int PlayerAbMainDnsDelayTimeExp();

    int PlayerAbMainDnsTypeExp();

    int PlayerAbMediaLoaderCheckPreloadLevelExp();

    int PlayerAbMedialoaderAccessCheckLevelExp();

    int PlayerAbMedialoaderEnableBackupDnsIPExp();

    int PlayerAbMedialoaderEnableBenchmarkExp();

    int PlayerAbMedialoaderEnableDnsLogExp();

    int PlayerAbMedialoaderEnableDnsParallelExp();

    int PlayerAbMedialoaderEnableDnsRefreshExp();

    int PlayerAbMedialoaderEnableFileExtendBuffer();

    int PlayerAbMedialoaderEnableFileRingBuffer();

    int PlayerAbMedialoaderEnablePreconneExp();

    int PlayerAbMedialoaderEnableSpeedCoefficientExp();

    int PlayerAbMedialoaderEnableTLSSessionReuseExp();

    int PlayerAbMedialoaderEnableTaskReuseExp();

    String PlayerAbMedialoaderGoogleDnsHostExp();

    int PlayerAbMedialoaderHeaderDataMemCache();

    int PlayerAbMedialoaderIpv4Num();

    int PlayerAbMedialoaderIpv6Num();

    int PlayerAbMedialoaderLazyBufferPoolEnableExp();

    String PlayerAbMedialoaderOwnDnsHostExp();

    int PlayerAbMedialoaderPreconnectNumExp();

    int PlayerAbMedialoaderTLSVersionExp();

    int PlayerAbMedialoaderTaskReuseParallelNextThresholdExp();

    int PlayerAbPreloadSizeOffsetThresholdExp();

    int PlayerAbTestSpeedVersionExp();

    int PlayerDataEncryptExperiment();

    int PlayerMdlLogEnableExperiment();

    Boolean PlayerPreloadLazyGetUrlsExperiment();

    C0NKF PreloadTypeExperiment();

    int RingBufferSizeMdlExperiment();

    int VideoCacheLoaderTypeExperiment();

    int VideoCacheMaxCacheSizeExperiment();

    int VideoNetworkSpeedAlgorithmExperiment();

    int VideoSpeedQueueSizeExperiment();

    boolean enableMDLDowngradeWhenBackground();

    boolean enableMDLInitAsync();

    boolean enableMDLInitDelay();

    boolean enableRealTimeSpeedMonitor();

    boolean enableSuperResolution();

    boolean enableUseNewGetCacheMethod();

    List<C308310C6r> engineInstanceOptionList();

    int enginePreloaderEnableTTnetLoader();

    List<C308310C6r> engineStaticOptionList();

    String getBandWidthJsonString();

    double getBitrateSwitchThreshold();

    String getDataLoaderMdlExtensionOpts();

    Map<String, Long> getExCacheDirSizeConfig();

    String getGearStrategyJsonString();

    String getMDLUA1();

    String getModuleConfigJsonString();

    String getPlayerTraceHost();

    C07R8 getPreloaderExpModel();

    boolean getUSE_CALLBACK_CACHE_SIZE();

    int isEnginePreloaderForceUseOKHttp();

    List<C308310C6r> newSharedLibraStaticOptionList();

    int newUserVodOptDiversion();

    int newUserVodOptDiversionV2();

    int newUserVodOptDiversionV3();

    List<C308310C6r> newVodLibraStaticOptionList();
}
