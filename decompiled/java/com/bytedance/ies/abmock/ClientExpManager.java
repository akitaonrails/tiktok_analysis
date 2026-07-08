package com.bytedance.ies.abmock;

import X.C0TKA;
import X.C0TKB;
import X.C0TKE;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes36.dex */
public class ClientExpManager {
    public static final C0TKB akamai_tnc_config_update_exp;
    public static final C0TKB android_first_video_carry_data;
    public static final C0TKB decompress_so_strategy_client;
    public static final C0TKB device_register_domain_opt_new;
    public static final C0TKB disable_dex2oat_memory_detail;
    public static final String[] experiments_array;
    public static final C0TKB feed_platform_local_offline;
    public static final C0TKB fix_active_user_experiment;
    public static final C0TKB flow_opt_key;
    public static final C0TKB hybrid_performance_optimize;
    public static final C0TKB inference_engine_opt;
    public static final C0TKB is_new_user_see_first;
    public static final C0TKB launch_opt_swipeup;
    public static final C0TKB live_cold_boot_setting_solidify_opt;
    public static final C0TKB miniapp_plugin_install_strategy;
    public static final C0TKB new_user_aggregated_6_optimization;
    public static final C0TKB new_user_config_for_experience_team_2025_q3_non_ttp;
    public static final C0TKB new_user_config_for_experience_team_2025_q3_ttp;
    public static final C0TKB new_user_live_gecko_fe_optimize;
    public static final C0TKB new_user_login_experience_v2_opt;
    public static final C0TKB new_user_m2_feed_total_opt;
    public static final C0TKB new_user_nonuj_feed_preload_opt;
    public static final C0TKB new_user_nonuj_feed_request_advance;
    public static final C0TKB new_user_perf_5_1_live_mix_v2;
    public static final C0TKB new_user_request_delay_reinstall_2;
    public static final C0TKB new_user_requests_optimization;
    public static final C0TKB new_user_swipe_ui_downgrade_opt;
    public static final C0TKB new_user_vod_opt_2025q4_harden_exp;
    public static final C0TKB new_user_vod_opt_delay_init_exp;
    public static final C0TKB new_user_vod_opt_disable_volume_adjust;
    public static final C0TKB new_user_vod_opt_harden_exp;
    public static final C0TKB new_user_vod_opt_harden_exp_v2;
    public static final C0TKB nu_default_fallback_row;
    public static final C0TKB nu_default_fallback_useu;
    public static final C0TKB nuf_refactor_exp;
    public static final C0TKB nuj_auto_login_timing_opt_exp;
    public static final C0TKB nuj_cold_boot_link_saf;
    public static final C0TKB nuj_equality_dryrun;
    public static final C0TKB nuj_fragment_container_exp_v6;
    public static final C0TKB nuj_report_page_start;
    public static final C0TKB nuj_revamp_br_eu;
    public static final C0TKB nuj_revamp_us_eu_v2;
    public static final C0TKB nuj_saf_exp;
    public static final C0TKB nuj_search_single_activity;
    public static final C0TKB nxet_android_nuj_client;
    public static final C0TKB old_user_login_experience_opt;
    public static final C0TKB onboarding_feed_non_personalization_global_v3;
    public static final C0TKB player_new_user_opt_exp;
    public static final C0TKB preload_uninstall_opt;
    public static final C0TKB push_auth_pre_position_config_version_v2;
    public static final C0TKB qr_code_login;
    public static final C0TKB reactivated_feed_loading_exp;
    public static final C0TKB report_nuj_perf_v2;
    public static final C0TKB resso_anchor_uninstalled_vid;
    public static final C0TKB slogan_delay_precisely;
    public static final C0TKB test_ab_a_client_ab;
    public static final C0TKB test_ab_b_client_ab;
    public static final C0TKB test_ab_c_client_ab;
    public static final C0TKB test_ab_d_client_ab;
    public static final C0TKB test_ab_e_client_ab;
    public static final C0TKB ttk_libra_request_type;
    public static final C0TKB weak_net_country_traffic_opt;

    static {
        String[] strArr = {"akamai_tnc_config_update_exp", "android_first_video_carry_data", "decompress_so_strategy_client", "device_register_domain_opt_new", "disable_dex2oat_memory_detail", "feed_platform_local_offline", "fix_active_user_experiment", "flow_opt_key", "hybrid_performance_optimize", "inference_engine_opt", "is_new_user_see_first", "launch_opt_swipeup", "live_cold_boot_setting_solidify_opt", "miniapp_plugin_install_strategy", "new_user_aggregated_6_optimization", "new_user_config_for_experience_team_2025_q3_non_ttp", "new_user_config_for_experience_team_2025_q3_ttp", "new_user_live_gecko_fe_optimize", "new_user_login_experience_v2_opt", "new_user_m2_feed_total_opt", "new_user_nonuj_feed_preload_opt", "new_user_nonuj_feed_request_advance", "new_user_perf_5_1_live_mix_v2", "new_user_request_delay_reinstall_2", "new_user_requests_optimization", "new_user_swipe_ui_downgrade_opt", "new_user_vod_opt_2025q4_harden_exp", "new_user_vod_opt_delay_init_exp", "new_user_vod_opt_disable_volume_adjust", "new_user_vod_opt_harden_exp", "new_user_vod_opt_harden_exp_v2", "nu_default_fallback_row", "nu_default_fallback_useu", "nuf_refactor_exp", "nuj_auto_login_timing_opt_exp", "nuj_cold_boot_link_saf", "nuj_equality_dryrun", "nuj_fragment_container_exp_v6", "nuj_report_page_start", "nuj_revamp_br_eu", "nuj_revamp_us_eu_v2", "nuj_saf_exp", "nuj_search_single_activity", "nxet_android_nuj_client", "old_user_login_experience_opt", "onboarding_feed_non_personalization_global_v3", "player_new_user_opt_exp", "preload_uninstall_opt", "push_auth_pre_position_config_version_v2", "qr_code_login", "reactivated_feed_loading_exp", "report_nuj_perf_v2", "resso_anchor_uninstalled_vid", "slogan_delay_precisely", "test_ab_a_client_ab", "test_ab_b_client_ab", "test_ab_c_client_ab", "test_ab_d_client_ab", "test_ab_e_client_ab", "ttk_libra_request_type", "weak_net_country_traffic_opt"};
        experiments_array = strArr;
        akamai_tnc_config_update_exp = new C0TKB("com.ss.android.ugc.aweme.net.experiment.AkamaiTncUpdateExperiment", strArr, new C0TKE("70824850", 0.45d, 0), new C0TKE("70824851", 0.45d, 1), new C0TKE("70824852", 0.1d, 2));
        android_first_video_carry_data = new C0TKB("com.ss.android.ugc.aweme.feed.preload.carryvideo.CarryVideoExp", strArr, new C0TKE("74162006", 0.33d, 0), new C0TKE("74162007", 0.33d, 0), new C0TKE("74162008", 0.33d, 1));
        decompress_so_strategy_client = new C0TKB("com.ss.android.ugc.aweme.buildconfigdiff.LibraryCompressABGray", strArr, new C0TKE("1668063", 0.05d, 0), new C0TKE("1668064", 0.05d, 1), new C0TKE("1668065", 0.05d, 2), new C0TKE("1668066", 0.05d, 3));
        device_register_domain_opt_new = new C0TKB("com.ss.android.ugc.aweme.buildconfigdiff.DeviceRegisterOptExp", strArr, new C0TKE("72315907", 0.1d, 0), new C0TKE("72315908", 0.1d, 1), new C0TKE("72315909", 0.1d, 2), new C0TKE("72315910", 0.1d, 3), new C0TKE("72315911", 0.6d, 4));
        disable_dex2oat_memory_detail = new C0TKB("com.ss.android.ugc.aweme.experiment.olduser.Dex2OatDisableWhenMemoryExp", strArr, new C0TKE("75899378", 0.2d, 0), new C0TKE("75899379", 0.2d, 1), new C0TKE("75899380", 0.2d, 3), new C0TKE("75899381", 0.2d, 5), new C0TKE("75899382", 0.2d, 2));
        feed_platform_local_offline = new C0TKB("com.ss.android.ugc.feed.platform.FeedPlatformLocalOfflineConfig", strArr, new C0TKE("70907925", 0.5d, 0), new C0TKE("70907926", 0.5d, 1));
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        fix_active_user_experiment = new C0TKB("com.ss.android.ugc.aweme.experiment.FixActiveUserExperiment", strArr, new C0TKE("70242164", 0.5d, bool), new C0TKE("70242163", 0.5d, bool2));
        flow_opt_key = new C0TKB("com.ss.android.ugc.aweme.experiment.FlowOptAB", strArr, new C0TKE("50014827", 0.5d, 0), new C0TKE("50014828", 0.5d, 1));
        hybrid_performance_optimize = new C0TKB("com.ss.android.ugc.aweme.data.HybridAbPerformanceExperiment", strArr, new C0TKE("73071223", 0.01d, 1), new C0TKE("73071224", 0.99d, 2));
        inference_engine_opt = new C0TKB("com.ss.android.ugc.aweme.experiment.newuser.InferenceEngineOptExperiment", strArr, new C0TKE("70517544", 0.1d, 0), new C0TKE("70517545", 0.1d, 1), new C0TKE("70517546", 0.1d, 2), new C0TKE("70517547", 0.1d, 3), new C0TKE("70517548", 0.6d, 4));
        is_new_user_see_first = new C0TKB("com.ss.android.ugc.aweme.experiment.newuser.RecFirstItemOptExperiment", strArr, new C0TKE("70793243", 0.5d, 0), new C0TKE("70793244", 0.5d, 1));
        launch_opt_swipeup = new C0TKB("com.ss.android.ugc.aweme.buildconfigdiff.NewUserSwipeUpOptimizeExperiment", strArr, new C0TKE("185214911", 0.5d, 0), new C0TKE("185215011", 0.5d, 1));
        live_cold_boot_setting_solidify_opt = new C0TKB("com.ss.android.ugc.aweme.experiment.LiveColdBootSettingSolidifyOpt", strArr, new C0TKE("72685095", 0.5d, 0), new C0TKE("72685096", 0.5d, 1));
        miniapp_plugin_install_strategy = new C0TKB("com.ss.android.ugc.aweme.miniapp.abtest.MiniAppPluginInstallAB", strArr, new C0TKE("50019349", 0.5d, 0), new C0TKE("50019350", 0.5d, 1));
        new_user_aggregated_6_optimization = new C0TKB("com.ss.android.ugc.aweme.experiment.newuser.NewUserAggreV6Experiment", strArr, new C0TKE("72487770", 0.2d, 0), new C0TKE("72487771", 0.2d, 1), new C0TKE("72487772", 0.2d, 2), new C0TKE("72487773", 0.2d, 3), new C0TKE("72487774", 0.2d, 4));
        new_user_config_for_experience_team_2025_q3_non_ttp = new C0TKB("com.ss.android.ugc.aweme.experiment.newuser.NewUserConfigSettle2025Q3NonTTPExperiment", strArr, new C0TKE("74909017", 0.5d, 0), new C0TKE("74909018", 0.5d, 1));
        new_user_config_for_experience_team_2025_q3_ttp = new C0TKB("com.ss.android.ugc.aweme.experiment.newuser.NewUserConfigSettle2025Q3TTPExperiment", strArr, new C0TKE("74715829", 0.5d, 0), new C0TKE("74715830", 0.5d, 1));
        new_user_live_gecko_fe_optimize = new C0TKB("com.ss.android.ugc.aweme.ab.NewUserLiveGeckoFEOptimizeExperiment", strArr, new C0TKE("72141807", 0.5d, 0), new C0TKE("72141808", 0.5d, 1));
        new_user_login_experience_v2_opt = new C0TKB("com.ss.android.ugc.aweme.experiment.newuser.NewUserLoginExperienceV2Experiment", strArr, new C0TKE("70763460", 0.2d, 0), new C0TKE("70763461", 0.2d, 1), new C0TKE("70763462", 0.6d, 2));
        new_user_m2_feed_total_opt = new C0TKB("com.ss.android.ugc.aweme.experiment.NewUserM2FeedTotalOptExperiment", strArr, new C0TKE("75377281", 0.25d, 0), new C0TKE("75377282", 0.25d, 1), new C0TKE("75377283", 0.25d, 2), new C0TKE("75377284", 0.25d, 3));
        new_user_nonuj_feed_preload_opt = new C0TKB("com.ss.android.ugc.aweme.experiment.FeedPreloadRequestExperiment", strArr, new C0TKE("70645734", 0.05d, 0), new C0TKE("70645735", 0.05d, 1), new C0TKE("70645736", 0.05d, 2), new C0TKE("70645737", 0.05d, 3), new C0TKE("70645738", 0.8d, 4));
        new_user_nonuj_feed_request_advance = new C0TKB("com.ss.android.ugc.aweme.experiment.newuser.NewUserFirstFeedExperiments$NewUserFirstFeedRequestAdvanceExperiment", strArr, new C0TKE("71808984", 0.5d, 0), new C0TKE("71808985", 0.5d, 1));
        new_user_perf_5_1_live_mix_v2 = new C0TKB("com.ss.android.ugc.aweme.experiment.newuser.NUPerf51LiveMixAB", strArr, new C0TKE("74246343", 0.5d, 0), new C0TKE("74246344", 0.5d, 1));
        new_user_request_delay_reinstall_2 = new C0TKB("com.ss.android.ugc.aweme.experiment.NewUserColdBootRequestDelayRollout", strArr, new C0TKE("74150584", 0.05d, 0), new C0TKE("74150585", 0.05d, 2500), new C0TKE("74150586", 0.05d, 2000), new C0TKE("74150587", 0.05d, Integer.valueOf(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED)), new C0TKE("74150588", 0.05d, Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT)), new C0TKE("74150589", 0.75d, 1));
        new_user_requests_optimization = new C0TKB("com.ss.android.ugc.aweme.experiments.NewUserRequestOptimizationExperiment", strArr, new C0TKE("73308257", 0.025d, 0), new C0TKE("73308258", 0.025d, 1), new C0TKE("73308259", 0.95d, 2));
        new_user_swipe_ui_downgrade_opt = new C0TKB("com.ss.android.ugc.aweme.experiment.newuser.NewUserSwipeUIDowngradeExperiment", strArr, new C0TKE("70867037", 0.05d, 0), new C0TKE("70867038", 0.05d, 1), new C0TKE("70867039", 0.05d, 2), new C0TKE("70867040", 0.85d, 3));
        new_user_vod_opt_2025q4_harden_exp = new C0TKB("com.ss.android.ugc.aweme.experiment.newuser.NewUserVodOptHardenExp2025Q4", strArr, new C0TKE("74892291", 0.5d, 0), new C0TKE("74892292", 0.5d, 1));
        new_user_vod_opt_delay_init_exp = new C0TKB("com.ss.android.ugc.aweme.experiment.newuser.NewUserVodOptDelayInitExperiment", strArr, new C0TKE("72977174", 0.98d, 0), new C0TKE("72977175", 0.01d, 1), new C0TKE("72977176", 0.01d, 2));
        new_user_vod_opt_disable_volume_adjust = new C0TKB("com.ss.android.ugc.aweme.experiment.newuser.NewUserDisableVolumeAutoAdjustExperiment", strArr, new C0TKE("74197730", 0.1d, 0), new C0TKE("74197731", 0.1d, 1));
        new_user_vod_opt_harden_exp = new C0TKB("com.ss.android.ugc.aweme.experiment.newuser.NewUserVodOptHardenExperiment", strArr, new C0TKE("72783680", 0.01d, 0), new C0TKE("72783681", 0.99d, 1));
        new_user_vod_opt_harden_exp_v2 = new C0TKB("com.ss.android.ugc.aweme.experiment.newuser.NewUserVodOptHardenExperimentV2", strArr, new C0TKE("73648412", 0.01d, 0), new C0TKE("73648413", 0.99d, 1));
        nu_default_fallback_row = new C0TKB("com.ss.android.ugc.aweme.experiment.NewUserDefaultGroupAABBRoW", strArr, new C0TKE("72365369", 0.25d, 0), new C0TKE("72365370", 0.25d, 1), new C0TKE("72365371", 0.25d, 2), new C0TKE("72365372", 0.25d, 3));
        nu_default_fallback_useu = new C0TKB("com.ss.android.ugc.aweme.experiment.NewUserDefaultGroupAABBUSEU", strArr, new C0TKE("72365352", 0.025d, 0), new C0TKE("72365353", 0.025d, 1), new C0TKE("72365354", 0.025d, 2), new C0TKE("72365355", 0.025d, 3), new C0TKE("72365356", 0.9d, 4));
        nuf_refactor_exp = new C0TKB("com.ss.android.ugc.aweme.nuf.refactor.NUFRefactorExp", strArr, new C0TKE("75630041", 0.5d, 0), new C0TKE("75630042", 0.5d, 1));
        nuj_auto_login_timing_opt_exp = new C0TKB("com.ss.android.ugc.aweme.experiment.NUJAutoLoginTimingOptExp", strArr, new C0TKE("75411104", 0.1d, 0), new C0TKE("75411105", 0.1d, 1), new C0TKE("72353615", 0.8d, 2));
        nuj_cold_boot_link_saf = new C0TKB("com.ss.android.ugc.aweme.experiment.NUJColdBootLinkSAFExp", strArr, new C0TKE("74486485", 0.5d, 0), new C0TKE("74486486", 0.5d, 1));
        nuj_equality_dryrun = new C0TKB("com.ss.android.ugc.aweme.experiment.newuser.NujEqualityDryRun", strArr, new C0TKE("73870714", 0.5d, 0), new C0TKE("73870715", 0.5d, 1));
        nuj_fragment_container_exp_v6 = new C0TKB("com.ss.android.ugc.aweme.NUJFragmentContainerExp", strArr, new C0TKE("75450278", 0.1d, 0), new C0TKE("75450279", 0.1d, 1), new C0TKE("75450280", 0.1d, 2), new C0TKE("72353615", 0.7d, 3));
        nuj_report_page_start = new C0TKB("com.bytedance.ies.ugc.statisticlogger.experiment.ReportPageStartForNujExperiment", strArr, new C0TKE("71447635", 0.9d, 0), new C0TKE("71447636", 0.1d, 1));
        nuj_revamp_br_eu = new C0TKB("com.ss.android.ugc.aweme.experiment.NUJRevampBREU", strArr, new C0TKE("76243359", 0.5d, 0), new C0TKE("76243360", 0.5d, 1));
        nuj_revamp_us_eu_v2 = new C0TKB("com.ss.android.ugc.aweme.experiment.NUJRevampUSEUExperiment", strArr, new C0TKE("74998356", 0.5d, 0), new C0TKE("74998357", 0.5d, 1));
        nuj_saf_exp = new C0TKB("com.ss.android.ugc.aweme.main.NUJSingleActivityExp", strArr, new C0TKE("76209233", 0.01d, 0), new C0TKE("76209234", 0.01d, 1), new C0TKE("76209235", 0.01d, 2));
        nuj_search_single_activity = new C0TKB("com.ss.android.ugc.aweme.exp.NUJSearchSingleActivityExp", strArr, new C0TKE("75079176", 0.5d, 0), new C0TKE("75079177", 0.5d, 1));
        nxet_android_nuj_client = new C0TKB("com.bytedance.ies.ugc.statisticlogger.experiment.NxETNUJClientExperiment", strArr, new C0TKE("73282910", 0.9d, 0), new C0TKE("73282911", 0.1d, 1));
        old_user_login_experience_opt = new C0TKB("com.ss.android.ugc.aweme.experiment.olduser.OldUserLoginExperienceExperiment", strArr, new C0TKE("70713771", 0.15d, 0), new C0TKE("70713772", 0.15d, 1), new C0TKE("70713773", 0.15d, 2), new C0TKE("70713774", 0.15d, 3), new C0TKE("70713775", 0.15d, 4), new C0TKE("70713776", 0.1d, 5));
        onboarding_feed_non_personalization_global_v3 = new C0TKB("com.ss.android.ugc.aweme.nuf.NUNonPersonalizationRequestGlobalV3Exp", strArr, new C0TKE("75760325", 0.25d, 30), new C0TKE("75760326", 0.25d, 31), new C0TKE("75760327", 0.25d, 32), new C0TKE("75760328", 0.25d, 33));
        player_new_user_opt_exp = new C0TKB("com.ss.android.ugc.aweme.video.experiment.NewUserPlayerOptExperiment", strArr, new C0TKE("70575442", 0.25d, 0), new C0TKE("70575443", 0.25d, 1), new C0TKE("70575444", 0.25d, 2), new C0TKE("70575445", 0.25d, 3));
        preload_uninstall_opt = new C0TKB("com.ss.android.ugc.aweme.experiment.PreloadUninstallOptExperiment", strArr, new C0TKE("70615503", 0.4d, bool), new C0TKE("70615504", 0.6d, bool2));
        push_auth_pre_position_config_version_v2 = new C0TKB("com.ss.android.ugc.aweme.unifiedauthapi.experiment.PushAuthPrepositionExp", strArr, new C0TKE("76153992", 0.1d, 0), new C0TKE("76153993", 0.1d, 1));
        qr_code_login = new C0TKB("com.ss.android.ugc.aweme.buildconfigdiff.QRCodeLoginExperiment", strArr, new C0TKE("50017292", 0.5d, bool2), new C0TKE("50017293", 0.5d, bool));
        reactivated_feed_loading_exp = new C0TKB("com.ss.android.ugc.aweme.experiment.ReactivatedFeedLoadingExp", strArr, new C0TKE("76415914", 0.05d, 0), new C0TKE("76415915", 0.05d, 1), new C0TKE("76415916", 0.05d, 2));
        report_nuj_perf_v2 = new C0TKB("com.ss.android.ugc.aweme.journey.experiment.NujPerfOptExperimentV2", strArr, new C0TKE("72160308", 0.3d, 0), new C0TKE("72160309", 0.3d, 1), new C0TKE("72160310", 0.4d, 2));
        resso_anchor_uninstalled_vid = new C0TKB("com.ss.android.ugc.aweme.buildconfigdiff.RessoAnchorUninstalledVidExperiment", strArr, new C0TKE("70126866,50065928", 1.0d, 0));
        slogan_delay_precisely = new C0TKB("com.ss.android.ugc.aweme.refactor.business.delay.SloganPreciseDelayExperiment", strArr, new C0TKE("72403335", 0.5d, 0), new C0TKE("72403336", 0.5d, 1));
        test_ab_a_client_ab = new C0TKB("com.tiktok.kmp.active.manager.experiments.TestFeatureAClient", strArr, new C0TKE("200100", 0.6d, 0), new C0TKE("200101", 0.2d, 1), new C0TKE("200102", 0.2d, 2));
        test_ab_b_client_ab = new C0TKB("com.tiktok.kmp.active.manager.experiments.TestFeatureBClient", strArr, new C0TKE("200103", 0.6d, 0), new C0TKE("200104", 0.2d, 1), new C0TKE("200105", 0.2d, 2));
        test_ab_c_client_ab = new C0TKB("com.tiktok.kmp.active.manager.experiments.TestFeatureCClient", strArr, new C0TKE("200106", 0.6d, 0), new C0TKE("200107", 0.2d, 1), new C0TKE("200108", 0.2d, 2));
        test_ab_d_client_ab = new C0TKB("com.tiktok.kmp.active.manager.experiments.TestFeatureDClient", strArr, new C0TKE("200109", 0.6d, 0), new C0TKE("200110", 0.2d, 1), new C0TKE("200111", 0.2d, 2));
        test_ab_e_client_ab = new C0TKB("com.tiktok.kmp.active.manager.experiments.TestFeatureEClient", strArr, new C0TKE("200112", 0.6d, 0), new C0TKE("200113", 0.2d, 1), new C0TKE("200114", 0.2d, 2));
        ttk_libra_request_type = new C0TKB("com.tiktok.ef.absettings.impl.experiment.FetchABRequestTypeExperiment", strArr, new C0TKE("75628151", 0.001d, 0), new C0TKE("75628152", 0.001d, 1), new C0TKE("75628153", 0.001d, 2), new C0TKE("75628151", 0.01d, 0), new C0TKE("75628152", 0.01d, 1), new C0TKE("75628153", 0.01d, 2), new C0TKE("75628151", 0.039d, 0), new C0TKE("75628152", 0.039d, 1), new C0TKE("75628153", 0.039d, 2));
        weak_net_country_traffic_opt = new C0TKB("com.ss.android.ugc.aweme.experiment.newuser.WeakNetCountryGeckoOptExperiment", strArr, new C0TKE("70542676", 0.25d, 0), new C0TKE("70542677", 0.25d, 1), new C0TKE("70542678", 0.25d, 2), new C0TKE("70542679", 0.25d, 3));
    }

    public static int akamai_tnc_config_update_exp() {
        return ((Integer) C0TKA.LIZJ("akamai_tnc_config_update_exp", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, akamai_tnc_config_update_exp)).intValue();
    }

    public static int android_first_video_carry_data() {
        return ((Integer) C0TKA.LIZJ("android_first_video_carry_data", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, android_first_video_carry_data)).intValue();
    }

    public static int decompress_so_strategy_client() {
        return ((Integer) C0TKA.LIZJ("decompress_so_strategy_client", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, decompress_so_strategy_client)).intValue();
    }

    public static int device_register_domain_opt_new() {
        return ((Integer) C0TKA.LIZJ("device_register_domain_opt_new", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, device_register_domain_opt_new)).intValue();
    }

    public static int disable_dex2oat_memory_detail() {
        return ((Integer) C0TKA.LIZJ("disable_dex2oat_memory_detail", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, disable_dex2oat_memory_detail)).intValue();
    }

    public static int feed_platform_local_offline() {
        return ((Integer) C0TKA.LIZJ("feed_platform_local_offline", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, feed_platform_local_offline)).intValue();
    }

    public static boolean fix_active_user_experiment() {
        return ((Boolean) C0TKA.LIZJ("fix_active_user_experiment", Boolean.TYPE, Boolean.valueOf("false"), true, true, fix_active_user_experiment)).booleanValue();
    }

    public static int flow_opt_key() {
        return ((Integer) C0TKA.LIZJ("flow_opt_key", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, flow_opt_key)).intValue();
    }

    public static int hybrid_performance_optimize() {
        return ((Integer) C0TKA.LIZJ("hybrid_performance_optimize", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf("1").intValue()), true, true, hybrid_performance_optimize)).intValue();
    }

    public static int inference_engine_opt() {
        return ((Integer) C0TKA.LIZJ("inference_engine_opt", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, inference_engine_opt)).intValue();
    }

    public static int is_new_user_see_first() {
        return ((Integer) C0TKA.LIZJ("is_new_user_see_first", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, is_new_user_see_first)).intValue();
    }

    public static int launch_opt_swipeup() {
        return ((Integer) C0TKA.LIZJ("launch_opt_swipeup", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, launch_opt_swipeup)).intValue();
    }

    public static int live_cold_boot_setting_solidify_opt() {
        return ((Integer) C0TKA.LIZJ("live_cold_boot_setting_solidify_opt", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, live_cold_boot_setting_solidify_opt)).intValue();
    }

    public static int miniapp_plugin_install_strategy() {
        return ((Integer) C0TKA.LIZJ("miniapp_plugin_install_strategy", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, miniapp_plugin_install_strategy)).intValue();
    }

    public static int new_user_aggregated_6_optimization() {
        return ((Integer) C0TKA.LIZJ("new_user_aggregated_6_optimization", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, new_user_aggregated_6_optimization)).intValue();
    }

    public static int new_user_config_for_experience_team_2025_q3_non_ttp() {
        return ((Integer) C0TKA.LIZJ("new_user_config_for_experience_team_2025_q3_non_ttp", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, new_user_config_for_experience_team_2025_q3_non_ttp)).intValue();
    }

    public static int new_user_config_for_experience_team_2025_q3_ttp() {
        return ((Integer) C0TKA.LIZJ("new_user_config_for_experience_team_2025_q3_ttp", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, new_user_config_for_experience_team_2025_q3_ttp)).intValue();
    }

    public static int new_user_live_gecko_fe_optimize() {
        return ((Integer) C0TKA.LIZJ("new_user_live_gecko_fe_optimize", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, new_user_live_gecko_fe_optimize)).intValue();
    }

    public static int new_user_login_experience_v2_opt() {
        return ((Integer) C0TKA.LIZJ("new_user_login_experience_v2_opt", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, new_user_login_experience_v2_opt)).intValue();
    }

    public static int new_user_m2_feed_total_opt() {
        return ((Integer) C0TKA.LIZJ("new_user_m2_feed_total_opt", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, new_user_m2_feed_total_opt)).intValue();
    }

    public static int new_user_nonuj_feed_preload_opt() {
        return ((Integer) C0TKA.LIZJ("new_user_nonuj_feed_preload_opt", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, new_user_nonuj_feed_preload_opt)).intValue();
    }

    public static int new_user_nonuj_feed_request_advance() {
        return ((Integer) C0TKA.LIZJ("new_user_nonuj_feed_request_advance", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, new_user_nonuj_feed_request_advance)).intValue();
    }

    public static int new_user_perf_5_1_live_mix_v2() {
        return ((Integer) C0TKA.LIZJ("new_user_perf_5_1_live_mix_v2", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, new_user_perf_5_1_live_mix_v2)).intValue();
    }

    public static int new_user_request_delay_reinstall_2() {
        return ((Integer) C0TKA.LIZJ("new_user_request_delay_reinstall_2", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf("1").intValue()), true, true, new_user_request_delay_reinstall_2)).intValue();
    }

    public static int new_user_requests_optimization() {
        return ((Integer) C0TKA.LIZJ("new_user_requests_optimization", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf("2").intValue()), true, true, new_user_requests_optimization)).intValue();
    }

    public static int new_user_swipe_ui_downgrade_opt() {
        return ((Integer) C0TKA.LIZJ("new_user_swipe_ui_downgrade_opt", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, new_user_swipe_ui_downgrade_opt)).intValue();
    }

    public static int new_user_vod_opt_2025q4_harden_exp() {
        return ((Integer) C0TKA.LIZJ("new_user_vod_opt_2025q4_harden_exp", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, new_user_vod_opt_2025q4_harden_exp)).intValue();
    }

    public static int new_user_vod_opt_delay_init_exp() {
        return ((Integer) C0TKA.LIZJ("new_user_vod_opt_delay_init_exp", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, new_user_vod_opt_delay_init_exp)).intValue();
    }

    public static int new_user_vod_opt_disable_volume_adjust() {
        return ((Integer) C0TKA.LIZJ("new_user_vod_opt_disable_volume_adjust", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, new_user_vod_opt_disable_volume_adjust)).intValue();
    }

    public static int new_user_vod_opt_harden_exp() {
        return ((Integer) C0TKA.LIZJ("new_user_vod_opt_harden_exp", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, new_user_vod_opt_harden_exp)).intValue();
    }

    public static int new_user_vod_opt_harden_exp_v2() {
        return ((Integer) C0TKA.LIZJ("new_user_vod_opt_harden_exp_v2", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, new_user_vod_opt_harden_exp_v2)).intValue();
    }

    public static int nu_default_fallback_row() {
        return ((Integer) C0TKA.LIZJ("nu_default_fallback_row", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, nu_default_fallback_row)).intValue();
    }

    public static int nu_default_fallback_useu() {
        return ((Integer) C0TKA.LIZJ("nu_default_fallback_useu", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf("4").intValue()), true, true, nu_default_fallback_useu)).intValue();
    }

    public static int nuf_refactor_exp() {
        return ((Integer) C0TKA.LIZJ("nuf_refactor_exp", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, nuf_refactor_exp)).intValue();
    }

    public static int nuj_auto_login_timing_opt_exp() {
        return ((Integer) C0TKA.LIZJ("nuj_auto_login_timing_opt_exp", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf("2").intValue()), true, true, nuj_auto_login_timing_opt_exp)).intValue();
    }

    public static int nuj_cold_boot_link_saf() {
        return ((Integer) C0TKA.LIZJ("nuj_cold_boot_link_saf", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, nuj_cold_boot_link_saf)).intValue();
    }

    public static int nuj_equality_dryrun() {
        return ((Integer) C0TKA.LIZJ("nuj_equality_dryrun", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, nuj_equality_dryrun)).intValue();
    }

    public static int nuj_fragment_container_exp_v6() {
        return ((Integer) C0TKA.LIZJ("nuj_fragment_container_exp_v6", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf("3").intValue()), true, true, nuj_fragment_container_exp_v6)).intValue();
    }

    public static int nuj_report_page_start() {
        return ((Integer) C0TKA.LIZJ("nuj_report_page_start", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, nuj_report_page_start)).intValue();
    }

    public static int nuj_revamp_br_eu() {
        return ((Integer) C0TKA.LIZJ("nuj_revamp_br_eu", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, nuj_revamp_br_eu)).intValue();
    }

    public static int nuj_revamp_us_eu_v2() {
        return ((Integer) C0TKA.LIZJ("nuj_revamp_us_eu_v2", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, nuj_revamp_us_eu_v2)).intValue();
    }

    public static int nuj_saf_exp() {
        return ((Integer) C0TKA.LIZJ("nuj_saf_exp", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, nuj_saf_exp)).intValue();
    }

    public static int nuj_search_single_activity() {
        return ((Integer) C0TKA.LIZJ("nuj_search_single_activity", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), false, true, nuj_search_single_activity)).intValue();
    }

    public static int nxet_android_nuj_client() {
        return ((Integer) C0TKA.LIZJ("nxet_android_nuj_client", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, nxet_android_nuj_client)).intValue();
    }

    public static int old_user_login_experience_opt() {
        return ((Integer) C0TKA.LIZJ("old_user_login_experience_opt", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, old_user_login_experience_opt)).intValue();
    }

    public static int onboarding_feed_non_personalization_global_v3() {
        return ((Integer) C0TKA.LIZJ("onboarding_feed_non_personalization_global_v3", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf("30").intValue()), true, true, onboarding_feed_non_personalization_global_v3)).intValue();
    }

    public static int player_new_user_opt_exp() {
        return ((Integer) C0TKA.LIZJ("player_new_user_opt_exp", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, player_new_user_opt_exp)).intValue();
    }

    public static boolean preload_uninstall_opt() {
        return ((Boolean) C0TKA.LIZJ("preload_uninstall_opt", Boolean.TYPE, Boolean.valueOf("false"), true, true, preload_uninstall_opt)).booleanValue();
    }

    public static int push_auth_pre_position_config_version_v2() {
        return ((Integer) C0TKA.LIZJ("push_auth_pre_position_config_version_v2", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, push_auth_pre_position_config_version_v2)).intValue();
    }

    public static boolean qr_code_login() {
        return ((Boolean) C0TKA.LIZJ("qr_code_login", Boolean.TYPE, Boolean.valueOf("false"), true, true, qr_code_login)).booleanValue();
    }

    public static int reactivated_feed_loading_exp() {
        return ((Integer) C0TKA.LIZJ("reactivated_feed_loading_exp", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, reactivated_feed_loading_exp)).intValue();
    }

    public static int report_nuj_perf_v2() {
        return ((Integer) C0TKA.LIZJ("report_nuj_perf_v2", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, report_nuj_perf_v2)).intValue();
    }

    public static int resso_anchor_uninstalled_vid() {
        return ((Integer) C0TKA.LIZJ("resso_anchor_uninstalled_vid", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, resso_anchor_uninstalled_vid)).intValue();
    }

    public static int slogan_delay_precisely() {
        return ((Integer) C0TKA.LIZJ("slogan_delay_precisely", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, slogan_delay_precisely)).intValue();
    }

    public static int test_ab_a_client_ab() {
        return ((Integer) C0TKA.LIZJ("test_ab_a_client_ab", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, test_ab_a_client_ab)).intValue();
    }

    public static int test_ab_b_client_ab() {
        return ((Integer) C0TKA.LIZJ("test_ab_b_client_ab", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, test_ab_b_client_ab)).intValue();
    }

    public static int test_ab_c_client_ab() {
        return ((Integer) C0TKA.LIZJ("test_ab_c_client_ab", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, test_ab_c_client_ab)).intValue();
    }

    public static int test_ab_d_client_ab() {
        return ((Integer) C0TKA.LIZJ("test_ab_d_client_ab", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, test_ab_d_client_ab)).intValue();
    }

    public static int test_ab_e_client_ab() {
        return ((Integer) C0TKA.LIZJ("test_ab_e_client_ab", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, test_ab_e_client_ab)).intValue();
    }

    public static int ttk_libra_request_type() {
        return ((Integer) C0TKA.LIZJ("ttk_libra_request_type", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, ttk_libra_request_type)).intValue();
    }

    public static int weak_net_country_traffic_opt() {
        return ((Integer) C0TKA.LIZJ("weak_net_country_traffic_opt", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, true, weak_net_country_traffic_opt)).intValue();
    }

    public static int akamai_tnc_config_update_exp(boolean z) {
        return ((Integer) C0TKA.LIZJ("akamai_tnc_config_update_exp", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, akamai_tnc_config_update_exp)).intValue();
    }

    public static int android_first_video_carry_data(boolean z) {
        return ((Integer) C0TKA.LIZJ("android_first_video_carry_data", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, android_first_video_carry_data)).intValue();
    }

    public static int decompress_so_strategy_client(boolean z) {
        return ((Integer) C0TKA.LIZJ("decompress_so_strategy_client", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, decompress_so_strategy_client)).intValue();
    }

    public static int device_register_domain_opt_new(boolean z) {
        return ((Integer) C0TKA.LIZJ("device_register_domain_opt_new", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, device_register_domain_opt_new)).intValue();
    }

    public static int disable_dex2oat_memory_detail(boolean z) {
        return ((Integer) C0TKA.LIZJ("disable_dex2oat_memory_detail", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, disable_dex2oat_memory_detail)).intValue();
    }

    public static int feed_platform_local_offline(boolean z) {
        return ((Integer) C0TKA.LIZJ("feed_platform_local_offline", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, feed_platform_local_offline)).intValue();
    }

    public static boolean fix_active_user_experiment(boolean z) {
        return ((Boolean) C0TKA.LIZJ("fix_active_user_experiment", Boolean.TYPE, Boolean.valueOf("false"), true, z, fix_active_user_experiment)).booleanValue();
    }

    public static int flow_opt_key(boolean z) {
        return ((Integer) C0TKA.LIZJ("flow_opt_key", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, flow_opt_key)).intValue();
    }

    public static int hybrid_performance_optimize(boolean z) {
        return ((Integer) C0TKA.LIZJ("hybrid_performance_optimize", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf("1").intValue()), true, z, hybrid_performance_optimize)).intValue();
    }

    public static int inference_engine_opt(boolean z) {
        return ((Integer) C0TKA.LIZJ("inference_engine_opt", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, inference_engine_opt)).intValue();
    }

    public static int is_new_user_see_first(boolean z) {
        return ((Integer) C0TKA.LIZJ("is_new_user_see_first", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, is_new_user_see_first)).intValue();
    }

    public static int launch_opt_swipeup(boolean z) {
        return ((Integer) C0TKA.LIZJ("launch_opt_swipeup", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, launch_opt_swipeup)).intValue();
    }

    public static int live_cold_boot_setting_solidify_opt(boolean z) {
        return ((Integer) C0TKA.LIZJ("live_cold_boot_setting_solidify_opt", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, live_cold_boot_setting_solidify_opt)).intValue();
    }

    public static int miniapp_plugin_install_strategy(boolean z) {
        return ((Integer) C0TKA.LIZJ("miniapp_plugin_install_strategy", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, miniapp_plugin_install_strategy)).intValue();
    }

    public static int new_user_aggregated_6_optimization(boolean z) {
        return ((Integer) C0TKA.LIZJ("new_user_aggregated_6_optimization", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, new_user_aggregated_6_optimization)).intValue();
    }

    public static int new_user_config_for_experience_team_2025_q3_non_ttp(boolean z) {
        return ((Integer) C0TKA.LIZJ("new_user_config_for_experience_team_2025_q3_non_ttp", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, new_user_config_for_experience_team_2025_q3_non_ttp)).intValue();
    }

    public static int new_user_config_for_experience_team_2025_q3_ttp(boolean z) {
        return ((Integer) C0TKA.LIZJ("new_user_config_for_experience_team_2025_q3_ttp", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, new_user_config_for_experience_team_2025_q3_ttp)).intValue();
    }

    public static int new_user_live_gecko_fe_optimize(boolean z) {
        return ((Integer) C0TKA.LIZJ("new_user_live_gecko_fe_optimize", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, new_user_live_gecko_fe_optimize)).intValue();
    }

    public static int new_user_login_experience_v2_opt(boolean z) {
        return ((Integer) C0TKA.LIZJ("new_user_login_experience_v2_opt", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, new_user_login_experience_v2_opt)).intValue();
    }

    public static int new_user_m2_feed_total_opt(boolean z) {
        return ((Integer) C0TKA.LIZJ("new_user_m2_feed_total_opt", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, new_user_m2_feed_total_opt)).intValue();
    }

    public static int new_user_nonuj_feed_preload_opt(boolean z) {
        return ((Integer) C0TKA.LIZJ("new_user_nonuj_feed_preload_opt", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, new_user_nonuj_feed_preload_opt)).intValue();
    }

    public static int new_user_nonuj_feed_request_advance(boolean z) {
        return ((Integer) C0TKA.LIZJ("new_user_nonuj_feed_request_advance", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, new_user_nonuj_feed_request_advance)).intValue();
    }

    public static int new_user_perf_5_1_live_mix_v2(boolean z) {
        return ((Integer) C0TKA.LIZJ("new_user_perf_5_1_live_mix_v2", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, new_user_perf_5_1_live_mix_v2)).intValue();
    }

    public static int new_user_request_delay_reinstall_2(boolean z) {
        return ((Integer) C0TKA.LIZJ("new_user_request_delay_reinstall_2", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf("1").intValue()), true, z, new_user_request_delay_reinstall_2)).intValue();
    }

    public static int new_user_requests_optimization(boolean z) {
        return ((Integer) C0TKA.LIZJ("new_user_requests_optimization", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf("2").intValue()), true, z, new_user_requests_optimization)).intValue();
    }

    public static int new_user_swipe_ui_downgrade_opt(boolean z) {
        return ((Integer) C0TKA.LIZJ("new_user_swipe_ui_downgrade_opt", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, new_user_swipe_ui_downgrade_opt)).intValue();
    }

    public static int new_user_vod_opt_2025q4_harden_exp(boolean z) {
        return ((Integer) C0TKA.LIZJ("new_user_vod_opt_2025q4_harden_exp", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, new_user_vod_opt_2025q4_harden_exp)).intValue();
    }

    public static int new_user_vod_opt_delay_init_exp(boolean z) {
        return ((Integer) C0TKA.LIZJ("new_user_vod_opt_delay_init_exp", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, new_user_vod_opt_delay_init_exp)).intValue();
    }

    public static int new_user_vod_opt_disable_volume_adjust(boolean z) {
        return ((Integer) C0TKA.LIZJ("new_user_vod_opt_disable_volume_adjust", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, new_user_vod_opt_disable_volume_adjust)).intValue();
    }

    public static int new_user_vod_opt_harden_exp(boolean z) {
        return ((Integer) C0TKA.LIZJ("new_user_vod_opt_harden_exp", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, new_user_vod_opt_harden_exp)).intValue();
    }

    public static int new_user_vod_opt_harden_exp_v2(boolean z) {
        return ((Integer) C0TKA.LIZJ("new_user_vod_opt_harden_exp_v2", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, new_user_vod_opt_harden_exp_v2)).intValue();
    }

    public static int nu_default_fallback_row(boolean z) {
        return ((Integer) C0TKA.LIZJ("nu_default_fallback_row", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, nu_default_fallback_row)).intValue();
    }

    public static int nu_default_fallback_useu(boolean z) {
        return ((Integer) C0TKA.LIZJ("nu_default_fallback_useu", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf("4").intValue()), true, z, nu_default_fallback_useu)).intValue();
    }

    public static int nuf_refactor_exp(boolean z) {
        return ((Integer) C0TKA.LIZJ("nuf_refactor_exp", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, nuf_refactor_exp)).intValue();
    }

    public static int nuj_auto_login_timing_opt_exp(boolean z) {
        return ((Integer) C0TKA.LIZJ("nuj_auto_login_timing_opt_exp", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf("2").intValue()), true, z, nuj_auto_login_timing_opt_exp)).intValue();
    }

    public static int nuj_cold_boot_link_saf(boolean z) {
        return ((Integer) C0TKA.LIZJ("nuj_cold_boot_link_saf", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, nuj_cold_boot_link_saf)).intValue();
    }

    public static int nuj_equality_dryrun(boolean z) {
        return ((Integer) C0TKA.LIZJ("nuj_equality_dryrun", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, nuj_equality_dryrun)).intValue();
    }

    public static int nuj_fragment_container_exp_v6(boolean z) {
        return ((Integer) C0TKA.LIZJ("nuj_fragment_container_exp_v6", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf("3").intValue()), true, z, nuj_fragment_container_exp_v6)).intValue();
    }

    public static int nuj_report_page_start(boolean z) {
        return ((Integer) C0TKA.LIZJ("nuj_report_page_start", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, nuj_report_page_start)).intValue();
    }

    public static int nuj_revamp_br_eu(boolean z) {
        return ((Integer) C0TKA.LIZJ("nuj_revamp_br_eu", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, nuj_revamp_br_eu)).intValue();
    }

    public static int nuj_revamp_us_eu_v2(boolean z) {
        return ((Integer) C0TKA.LIZJ("nuj_revamp_us_eu_v2", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, nuj_revamp_us_eu_v2)).intValue();
    }

    public static int nuj_saf_exp(boolean z) {
        return ((Integer) C0TKA.LIZJ("nuj_saf_exp", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, nuj_saf_exp)).intValue();
    }

    public static int nuj_search_single_activity(boolean z) {
        return ((Integer) C0TKA.LIZJ("nuj_search_single_activity", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), false, z, nuj_search_single_activity)).intValue();
    }

    public static int nxet_android_nuj_client(boolean z) {
        return ((Integer) C0TKA.LIZJ("nxet_android_nuj_client", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, nxet_android_nuj_client)).intValue();
    }

    public static int old_user_login_experience_opt(boolean z) {
        return ((Integer) C0TKA.LIZJ("old_user_login_experience_opt", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, old_user_login_experience_opt)).intValue();
    }

    public static int onboarding_feed_non_personalization_global_v3(boolean z) {
        return ((Integer) C0TKA.LIZJ("onboarding_feed_non_personalization_global_v3", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf("30").intValue()), true, z, onboarding_feed_non_personalization_global_v3)).intValue();
    }

    public static int player_new_user_opt_exp(boolean z) {
        return ((Integer) C0TKA.LIZJ("player_new_user_opt_exp", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, player_new_user_opt_exp)).intValue();
    }

    public static boolean preload_uninstall_opt(boolean z) {
        return ((Boolean) C0TKA.LIZJ("preload_uninstall_opt", Boolean.TYPE, Boolean.valueOf("false"), true, z, preload_uninstall_opt)).booleanValue();
    }

    public static int push_auth_pre_position_config_version_v2(boolean z) {
        return ((Integer) C0TKA.LIZJ("push_auth_pre_position_config_version_v2", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, push_auth_pre_position_config_version_v2)).intValue();
    }

    public static boolean qr_code_login(boolean z) {
        return ((Boolean) C0TKA.LIZJ("qr_code_login", Boolean.TYPE, Boolean.valueOf("false"), true, z, qr_code_login)).booleanValue();
    }

    public static int reactivated_feed_loading_exp(boolean z) {
        return ((Integer) C0TKA.LIZJ("reactivated_feed_loading_exp", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, reactivated_feed_loading_exp)).intValue();
    }

    public static int report_nuj_perf_v2(boolean z) {
        return ((Integer) C0TKA.LIZJ("report_nuj_perf_v2", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, report_nuj_perf_v2)).intValue();
    }

    public static int resso_anchor_uninstalled_vid(boolean z) {
        return ((Integer) C0TKA.LIZJ("resso_anchor_uninstalled_vid", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, resso_anchor_uninstalled_vid)).intValue();
    }

    public static int slogan_delay_precisely(boolean z) {
        return ((Integer) C0TKA.LIZJ("slogan_delay_precisely", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, slogan_delay_precisely)).intValue();
    }

    public static int test_ab_a_client_ab(boolean z) {
        return ((Integer) C0TKA.LIZJ("test_ab_a_client_ab", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, test_ab_a_client_ab)).intValue();
    }

    public static int test_ab_b_client_ab(boolean z) {
        return ((Integer) C0TKA.LIZJ("test_ab_b_client_ab", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, test_ab_b_client_ab)).intValue();
    }

    public static int test_ab_c_client_ab(boolean z) {
        return ((Integer) C0TKA.LIZJ("test_ab_c_client_ab", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, test_ab_c_client_ab)).intValue();
    }

    public static int test_ab_d_client_ab(boolean z) {
        return ((Integer) C0TKA.LIZJ("test_ab_d_client_ab", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, test_ab_d_client_ab)).intValue();
    }

    public static int test_ab_e_client_ab(boolean z) {
        return ((Integer) C0TKA.LIZJ("test_ab_e_client_ab", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, test_ab_e_client_ab)).intValue();
    }

    public static int ttk_libra_request_type(boolean z) {
        return ((Integer) C0TKA.LIZJ("ttk_libra_request_type", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, ttk_libra_request_type)).intValue();
    }

    public static int weak_net_country_traffic_opt(boolean z) {
        return ((Integer) C0TKA.LIZJ("weak_net_country_traffic_opt", Integer.TYPE, Integer.valueOf(CastDoubleProtector.valueOf(CardStruct.IStatusCode.DEFAULT).intValue()), true, z, weak_net_country_traffic_opt)).intValue();
    }
}
