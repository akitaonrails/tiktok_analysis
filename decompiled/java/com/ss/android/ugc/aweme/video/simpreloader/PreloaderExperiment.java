package com.ss.android.ugc.aweme.video.simpreloader;

import X.C01GW;
import X.C07JK;
import X.C07R7;
import X.C07R8;
import X.C07RT;
import X.C07RV;
import X.C08JS;
import X.C08TN;
import X.C0C64;
import X.C0NKF;
import X.C1150504el;
import X.C1781506yL;
import X.C1784206ym;
import X.C1786206z6;
import X.C1787006zE;
import X.C19252910Tv;
import X.C2504009ra;
import X.C2508509sJ;
import X.C304180Bw8;
import X.C307480C3m;
import X.C307500C3o;
import X.C308310C6r;
import X.C452501pT;
import X.EnumC452301pR;
import X.InterfaceC2505009rk;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment;
import com.ss.android.ugc.aweme.video.preload.model.BufferPreloadStrategyConfig;
import com.ss.android.ugc.aweme.video.preload.model.EnginePreloaderConfig;
import com.ss.android.ugc.aweme.video.preload.model.PreloadPromptConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class PreloaderExperiment implements IPreloaderExperiment {
    public static final C2508509sJ Companion = new Object() { // from class: X.09sJ
    };
    public static int videoNetworkSpeedAlgorithmExperimentValue = -1;
    public final C01GW mPreloadExpModel$delegate = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C07R7());

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public /* bridge */ /* synthetic */ boolean EnableDetailNotification() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public /* bridge */ /* synthetic */ int EngineEnableMaxFileMemCacheNumExp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public /* bridge */ /* synthetic */ int EngineEnableMaxFileMemCacheSizeExp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public /* bridge */ /* synthetic */ boolean enableMDLDowngradeWhenBackground() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public /* bridge */ /* synthetic */ boolean enableMDLInitAsync() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public /* bridge */ /* synthetic */ boolean enableMDLInitDelay() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public /* bridge */ /* synthetic */ boolean enableRealTimeSpeedMonitor() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public /* bridge */ /* synthetic */ boolean enableSuperResolution() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public /* bridge */ /* synthetic */ boolean enableUseNewGetCacheMethod() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public /* bridge */ /* synthetic */ double getBitrateSwitchThreshold() {
        return 0.75d;
    }

    public /* bridge */ /* synthetic */ BufferPreloadStrategyConfig getBufferPreloadStrategyConfig() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public /* bridge */ /* synthetic */ String getDataLoaderMdlExtensionOpts() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public /* bridge */ /* synthetic */ String getMDLUA1() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public /* bridge */ /* synthetic */ boolean getUSE_CALLBACK_CACHE_SIZE() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public /* bridge */ /* synthetic */ int isEnginePreloaderForceUseOKHttp() {
        return 0;
    }

    public /* bridge */ /* synthetic */ boolean isPreloadStrategyUseSameThread() {
        return false;
    }

    private final C07R8 getMPreloadExpModel() {
        return (C07R8) this.mPreloadExpModel$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int DisableVideocacheLocalServerExperiment() {
        return ((Number) C1784206ym.LIZ.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderEnableFileExtendBuffer() {
        return ((Number) C1784206ym.LIZLLL.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderEnablePreconneExp() {
        return ((Number) C2504009ra.LIZ.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int RingBufferSizeMdlExperiment() {
        return ((Number) C1784206ym.LIZIZ.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int VideoNetworkSpeedAlgorithmExperiment() {
        if (!C1781506yL.LIZ) {
            return C0C64.LJIILLIIL().LJIJ(31744, 0, "video_network_speed_algorithm", true);
        }
        if (videoNetworkSpeedAlgorithmExperimentValue == -1) {
            videoNetworkSpeedAlgorithmExperimentValue = C0C64.LJIILLIIL().LJIJ(31744, 0, "video_network_speed_algorithm", true);
        }
        return videoNetworkSpeedAlgorithmExperimentValue;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public List<C308310C6r> engineInstanceOptionList() {
        C307500C3o.LIZ.getClass();
        return (List) C307500C3o.LJFF.getValue();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public String getBandWidthJsonString() {
        C01GW c01gw = C07RT.LIZ;
        return (String) C07RT.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public Map getExCacheDirSizeConfig() {
        return new HashMap();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public String getGearStrategyJsonString() {
        VideoBitRateABManager videoBitRateABManager = VideoBitRateABManager.LJFF;
        RateSettingsResponse rateSettingsResponse = videoBitRateABManager.LIZ;
        if (rateSettingsResponse == null) {
            if (videoBitRateABManager.LJ == null) {
                videoBitRateABManager.LJI();
            }
            rateSettingsResponse = videoBitRateABManager.LJ;
            if (rateSettingsResponse == null) {
                return "";
            }
        }
        return C08JS.LIZLLL(rateSettingsResponse);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public String getModuleConfigJsonString() {
        C01GW c01gw = C07RV.LIZ;
        return (String) C07RV.LIZ.getValue();
    }

    public PreloadPromptConfig getPreloadPromptConfig() {
        return new PreloadPromptConfig();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public List<C308310C6r> newSharedLibraStaticOptionList() {
        return (List) C307480C3m.LJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int newUserVodOptDiversionV2() {
        return ((Boolean) C1787006zE.LIZIZ.getValue()).booleanValue() ? 1 : 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public List<C308310C6r> newVodLibraStaticOptionList() {
        return (List) C307480C3m.LIZLLL.getValue();
    }

    public Boolean CheckVideoCacheRequestHeaderExperiment() {
        return Boolean.valueOf(C304180Bw8.LJI() ? true : C0C64.LJIILLIIL().LJIIIZ(31744, "check_video_cache_request_header", true, true));
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int EnableDownloaderLogExpErrorExperiment() {
        if (C304180Bw8.LJI()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_engine_downloader_log_exp", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public boolean EnableGetCDNLogExperiment() {
        if (C304180Bw8.LJ()) {
            return false;
        }
        return InterfaceC2505009rk.LIZ;
    }

    public int EnableP2pStragetyControlExperiment() {
        if (C304180Bw8.LJ()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_p2p_stragety_control", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public Boolean EnablePreloaderPreConnect() {
        boolean z = false;
        if (!C304180Bw8.LJI() && C0C64.LJIILLIIL().LJIJ(31744, 0, "engine_preloader_pre_connect", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public boolean EnableTTnetClientInject() {
        return C304180Bw8.LIZLLL() || C0C64.LJIILLIIL().LJIJ(31744, 1, "player_enable_ttnet_inject", false) == 1;
    }

    public long EngineDataloaderDownloadMonitorMinLoadSizeExperiment() {
        if (C304180Bw8.LJI()) {
            return 0L;
        }
        return C0C64.LJIILLIIL().LJIJJLI(31744, 0L, "dataloader_download_monitor_min_loadsize", true);
    }

    public long EngineDataloaderDownloadMonitorTimeInternalExperiment() {
        if (C304180Bw8.LJI()) {
            return 0L;
        }
        return C0C64.LJIILLIIL().LJIJJLI(31744, 0L, "dataloader_download_monitor_time_internal", true);
    }

    public int EnginePreloaderBlockHostErrIPCountExperiment() {
        if (C304180Bw8.LJI()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "block_host_err_ip_count", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int EnginePreloaderConcurrentNumExperiment() {
        if (C304180Bw8.LJ()) {
            return 1;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 1, "engine_preloader_concurrent_num", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public EnginePreloaderConfig EnginePreloaderConfigExperiment() {
        return (EnginePreloaderConfig) C0C64.LJIILLIIL().LJJII(EnginePreloaderConfig.class, null, "engine_preload_config", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int EnginePreloaderEnableNetworkChangedListenExperiment() {
        if (C304180Bw8.LJ()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "engine_preloader_enable_network_changed_listen", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int EnginePreloaderNetSchedulerBlockAllNetErrorExperiment() {
        if (C304180Bw8.LJI()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_net_scheduler_block_all_net_error", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int EnginePreloaderNetSchedulerBlockDurationExperiment() {
        if (C304180Bw8.LJI()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "net_scheduler_block_duration", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int EnginePreloaderNetSchedulerBlockErrorCountExperiment() {
        if (C304180Bw8.LJI()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "net_scheduler_block_error_count", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int EnginePreloaderNetSchedulerEnableExperiment() {
        if (C304180Bw8.LJI()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_net_scheduler", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int EnginePreloaderOpenTimeoutExperiment() {
        if (C304180Bw8.LJ()) {
            return 10;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 10, "engine_preloader_open_timeout", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int EnginePreloaderPreloadStrategyExperiment() {
        return C0C64.LJIILLIIL().LJIJ(31744, 1, "engine_preloader_preload_strategy", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int EnginePreloaderRWTimeoutExperiment() {
        if (C304180Bw8.LJ()) {
            return 10;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 10, "engine_preloader_rw_timeout", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int EnginePreloaderStackOrQueueExperiment() {
        return C0C64.LJIILLIIL().LJIJ(31744, 1, "engine_preloader_queue_or_stack", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int EnginePreloaderTlsSessionTimeoutExperiment() {
        if (C304180Bw8.LJFF()) {
            return 3600;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 3600, "engine_preloader_tls_session_timeout", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int P2pStragetyEnableSyndnsExperiment() {
        if (C304180Bw8.LJ()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_p2p_stragety_enable_syndns", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int P2pStragetyExpiredTimeExperiment() {
        if (C304180Bw8.LJ()) {
            return 120;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 120, "p2p_stragety_expired_time", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int P2pStragetyMaxBufferingTimeExperiment() {
        return !C304180Bw8.LJ() ? C0C64.LJIILLIIL().LJIJ(31744, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, "p2p_stragety_max_buffering_time", true) : DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int P2pStragetyMaxLeaveWaitTimeExperiment() {
        if (C304180Bw8.LJ()) {
            return 600;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 600, "p2p_stragety_max_leave_wait_time", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int P2pStragetyMinNetSpeedExperiment() {
        if (C304180Bw8.LJ()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "p2p_stragety_min_net_speed", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int P2pStragetyMinPlayNumberExperiment() {
        if (C304180Bw8.LJ()) {
            return 5;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 5, "p2p_stragety_min_play_num", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int P2pStragetyXyLibValueExperiment() {
        if (C304180Bw8.LJ()) {
            return 1;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 1, "enable_p2p_stragety_xy_lib_value", true);
    }

    public int PlayUse2UrlExperiment() {
        if (C304180Bw8.LJI()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "player_play_use_2_cdn_url", true);
    }

    public int PlayeAbUserHttp2Exp() {
        if (C304180Bw8.LJI()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "player_use_http2", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbABRAlgoExp() {
        if (C304180Bw8.LJ()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "player_abr_algo", true);
    }

    public int PlayerAbABRSpeedPredictAlgoExp() {
        if (C304180Bw8.LJ()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "player_abr_speed_predict_algo", true);
    }

    public int PlayerAbABRSpeedPredictTimeIntervalExp() {
        if (C304180Bw8.LJ()) {
            return 500;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 500, "player_abr_speed_predict_time_interval", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbBackupDnsTypeExp() {
        if (C304180Bw8.LJ()) {
            return 3;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 2, "player_ab_backup_dns_type", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbChecksumLevelExp() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "checksum_level", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbDashPreloadAudioFirstExp() {
        if (C304180Bw8.LJ()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "player_dash_preload_audio_first", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbEnableDebugLogExp() {
        if (C304180Bw8.LJFF()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "player_enable_debug_log", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMainDnsDelayTimeExp() {
        if (C304180Bw8.LJ()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "player_ab_main_dns_timeout", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMainDnsTypeExp() {
        if (C304180Bw8.LJ()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "player_ab_main_dns_type", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMediaLoaderCheckPreloadLevelExp() {
        if (C304180Bw8.LJFF()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "player_medialoader_check_preload_level", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderAccessCheckLevelExp() {
        if (C304180Bw8.LJFF()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "player_medialoader_access_check_level", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderEnableBackupDnsIPExp() {
        if (C304180Bw8.LJFF()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "player_medialoader_enable_dns_backup_ip", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderEnableBenchmarkExp() {
        if (C304180Bw8.LJFF()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "player_medialoader_enable_benchmark_io", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderEnableDnsLogExp() {
        if (C304180Bw8.LJFF()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "player_medialoader_enable_dns_log", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderEnableDnsParallelExp() {
        if (C304180Bw8.LJFF()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "player_medialoader_enable_dns_parallel", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderEnableDnsRefreshExp() {
        if (C304180Bw8.LJFF()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "player_medialoader_enable_dns_refresh", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderEnableFileRingBuffer() {
        if (C304180Bw8.LJFF()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "player_medialoader_enable_file_ring_buffer", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderEnableSpeedCoefficientExp() {
        if (C304180Bw8.LJFF()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "player_medialoader_enable_speed_coefficient", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderEnableTLSSessionReuseExp() {
        if (C304180Bw8.LJFF()) {
            return 1;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "player_medialoader_enable_tls_session_reuse", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderEnableTaskReuseExp() {
        if (C304180Bw8.LJFF()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "player_medialoader_enable_task_reuse", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public String PlayerAbMedialoaderGoogleDnsHostExp() {
        return !C304180Bw8.LJFF() ? C0C64.LJIILLIIL().LJJ(31744, "player_medialoader_google_dns_host", "dns.google.com", true) : "dns.google.com";
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderHeaderDataMemCache() {
        if (C304180Bw8.LJFF()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "player_medialoader_header_data_mem_cache", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderIpv4Num() {
        if (C304180Bw8.LJFF()) {
            return Integer.MAX_VALUE;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, Integer.MAX_VALUE, "player_medialoader_ipv4_num", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderIpv6Num() {
        if (C304180Bw8.LJFF()) {
            return Integer.MAX_VALUE;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, Integer.MAX_VALUE, "player_medialoader_ipv6_num", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderLazyBufferPoolEnableExp() {
        if (C304180Bw8.LJFF()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "player_mdl_enable_lazy_buffer_pool", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public String PlayerAbMedialoaderOwnDnsHostExp() {
        return !C304180Bw8.LJFF() ? C0C64.LJIILLIIL().LJJ(31744, "player_medialoader_own_dns_host", "34.102.215.99", true) : "34.102.215.99";
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderPreconnectNumExp() {
        return C0C64.LJIILLIIL().LJIJ(31744, 3, "player_medialoader_preconnect_num", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderTLSVersionExp() {
        if (C304180Bw8.LJI()) {
            return 3;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 2, "player_medialoader_tls_version", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderTaskReuseParallelNextThresholdExp() {
        if (C304180Bw8.LJFF()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "player_medialoader_task_reuse_parallel_next_threshold", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbPreloadSizeOffsetThresholdExp() {
        if (C304180Bw8.LJI()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "player_preload_size_offset_threshold", true);
    }

    public int PlayerAbSpeedSinkExp() {
        if (C304180Bw8.LJI()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "speed_monitor_sink", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbTestSpeedVersionExp() {
        if (C304180Bw8.LJI()) {
            return 2;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 2, "player_test_speed_version", true);
    }

    public Boolean PlayerAbUseLastIf403Exp() {
        return Boolean.valueOf(C304180Bw8.LJI() ? true : C0C64.LJIILLIIL().LJIIIZ(31744, "player_use_last_url_if_403", true, true));
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerDataEncryptExperiment() {
        if (C304180Bw8.LJI()) {
            return 1;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 1, "player_data_encrpt", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerMdlLogEnableExperiment() {
        if (C304180Bw8.LJI()) {
            return 1;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 1, "enable_player_mdl_log", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public Boolean PlayerPreloadLazyGetUrlsExperiment() {
        return Boolean.valueOf(C304180Bw8.LJI() ? true : C0C64.LJIILLIIL().LJIIIZ(31744, "player_preload_lazy_get_urls", true, true));
    }

    public Boolean PreloadLocalCachePathVideoPlayExperiment() {
        return Boolean.valueOf(C304180Bw8.LJI() ? false : C0C64.LJIILLIIL().LJIIIZ(31744, "is_preload_local_cache_path_video_play_enable", true, false));
    }

    public int UseTTNetExperiment() {
        return C0C64.LJIILLIIL().LJIJ(31744, 1, "use_ttnet", true);
    }

    public Boolean UseVideoCacheHttpDnsExperiment() {
        return Boolean.valueOf(C304180Bw8.LJI() ? true : C0C64.LJIILLIIL().LJIIIZ(31744, "use_video_cache_http_dns", true, false));
    }

    public Boolean VideoCacheAutoAdjustPreloadMaxExperiment() {
        return Boolean.valueOf(C304180Bw8.LJI() ? true : C0C64.LJIILLIIL().LJIIIZ(31744, "is_video_cache_auto_adust_preload_max", true, true));
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int VideoCacheLoaderTypeExperiment() {
        if (C304180Bw8.LJI()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "videocache_loader_type", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int VideoCacheMaxCacheSizeExperiment() {
        return C19252910Tv.LIZIZ.LIZLLL().LIZ().LIZLLL(C0C64.LJIILLIIL().LJIJ(31744, -1, "player_cache_max_size", true));
    }

    public int VideoCacheP2pLevelExperiment() {
        if (C304180Bw8.LJI()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "videocache_p2p_level", true);
    }

    public int VideoCacheReadBuffersizeExperiment() {
        if (C304180Bw8.LJI()) {
            return 8192;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 8192, "video_cache_read_buffersize", true);
    }

    public int VideoCacheTTnetPreloadTimeoutExperiment() {
        if (C304180Bw8.LJI()) {
            return 30000;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 30000, "videocache_ttnet_preload_timeout", true);
    }

    public int VideoCacheTTnetProxyTimeoutExperiment() {
        if (C304180Bw8.LJI()) {
            return 10000;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 10000, "videocache_ttnet_proxy_timeout", true);
    }

    public Boolean VideoCacheWriteAsynchronousExperiment() {
        return Boolean.valueOf(C304180Bw8.LJI() ? false : C0C64.LJIILLIIL().LJIIIZ(31744, "video_cache_write_asynchronous", true, false));
    }

    public int VideoDownloadSpeedCostTimeExperiment() {
        if (C304180Bw8.LJI()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "video_download_speed_cost_time", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int VideoSpeedQueueSizeExperiment() {
        return C0C64.LJIILLIIL().LJIJ(31744, 10, "video_speed_queue_size", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int enginePreloaderEnableTTnetLoader() {
        if (C304180Bw8.LIZLLL()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_ttnet_loader", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public List<C308310C6r> engineStaticOptionList() {
        C08TN.LIZ().LJ("engine_preload_config_staticoptionlist", true);
        C1150504el.LIZ().LIZLLL("engine_preload_config_staticoptionlist", false);
        C307500C3o.LIZ.getClass();
        List<C308310C6r> list = (List) C307500C3o.LIZJ.getValue();
        C1150504el.LIZ().LJI("engine_preload_config_staticoptionlist", false);
        C08TN.LIZ().LJI("engine_preload_config_staticoptionlist");
        return list;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public String getPlayerTraceHost() {
        return C0C64.LJIILLIIL().LJJ(31744, "player_medialoader_trace_host", "", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public C07R8 getPreloaderExpModel() {
        return getMPreloadExpModel();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int newUserVodOptDiversion() {
        return C1786206z6.LIZ() ? 1 : 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int newUserVodOptDiversionV3() {
        return C07JK.LIZ() ? 1 : 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public C0NKF PreloadTypeExperiment() {
        return C0NKF.MediaLoader;
    }

    public Boolean VideoCacheMonitorNetStatus() {
        return Boolean.TRUE;
    }
}
