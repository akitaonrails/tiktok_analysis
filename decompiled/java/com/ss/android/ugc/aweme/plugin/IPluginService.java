package com.ss.android.ugc.aweme.plugin;

import X.C08FF;
import X.C09CT;
import X.C0CV2;
import X.C0TA0;
import X.C0VGI;
import X.C10T7;
import X.C10TU;
import X.C10TV;
import X.C11N2;
import X.C19249410Sm;
import X.C2254308sP;
import X.C848050XOp;
import X.EnumC19241510Pl;
import X.InterfaceC1294060jmO;
import X.InterfaceC2044707zh;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.scene.Scene;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.plugin.firstlike.FirstLikeToastData;
import com.ss.android.ugc.aweme.plugin.journey.NewUserInterestPageStruct;
import com.ss.android.ugc.aweme.plugin.journey.OnboardingFlowData;
import com.ss.android.ugc.aweme.plugin.journey.TrendingCreatorsPageStruct;
import com.ss.android.ugc.aweme.plugin.not_interested.NotInterestedTutorialData;
import com.ss.android.ugc.aweme.plugin.personalizednuj.PersonalizedNUJV2Data;
import com.ss.android.ugc.aweme.plugin.tooltipprotection.TooltipProtectionModel$TooltipDataProtection;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public interface IPluginService {

    /* JADX INFO: loaded from: classes24.dex */
    public static final class NUContainerInfoStruct {

        @C09CT("biz_tag")
        public final String bizTag;

        @C09CT("nu_container_group")
        public final String nuContainerGroup;

        public NUContainerInfoStruct() {
            this("", "");
        }

        public NUContainerInfoStruct(String str, String str2) {
            this.nuContainerGroup = str;
            this.bizTag = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ReinstallCheck {
        public static final C19249410Sm Companion;
        public static final /* synthetic */ ReinstallCheck[] LLILLL;
        public static final /* synthetic */ C2254308sP LLILZ;

        @C09CT("2")
        public static final ReinstallCheck NON_REINSTALL;

        @C09CT("1")
        public static final ReinstallCheck REINSTALL;

        @C09CT(CardStruct.IStatusCode.DEFAULT)
        public static final ReinstallCheck REINSTALL_CHECK_UNKNOWN;
        public final int LL;
        public final String LLILLJJLI;

        public static InterfaceC2044707zh<ReinstallCheck> getEntries() {
            return LLILZ;
        }

        static {
            ReinstallCheck reinstallCheck = new ReinstallCheck("REINSTALL_CHECK_UNKNOWN", 0, 0, "unknown");
            REINSTALL_CHECK_UNKNOWN = reinstallCheck;
            ReinstallCheck reinstallCheck2 = new ReinstallCheck("REINSTALL", 1, 1, "reinstall");
            REINSTALL = reinstallCheck2;
            ReinstallCheck reinstallCheck3 = new ReinstallCheck("NON_REINSTALL", 2, 2, "new");
            NON_REINSTALL = reinstallCheck3;
            ReinstallCheck[] reinstallCheckArr = {reinstallCheck, reinstallCheck2, reinstallCheck3};
            LLILLL = reinstallCheckArr;
            LLILZ = new C2254308sP(reinstallCheckArr);
            Companion = new C19249410Sm();
        }

        public static ReinstallCheck[] values() {
            return (ReinstallCheck[]) LLILLL.clone();
        }

        public final String getEtValue() {
            return this.LLILLJJLI;
        }

        public final int getValue() {
            return this.LL;
        }

        public static ReinstallCheck valueOf(String str) {
            return (ReinstallCheck) C08FF.LIZ(ReinstallCheck.class, str);
        }

        public ReinstallCheck(String str, int i, int i2, String str2) {
            this.LL = i2;
            this.LLILLJJLI = str2;
        }
    }

    C0VGI backgroundThreadObserveFirst(EnumC19241510Pl enumC19241510Pl, Observer<C0TA0> observer);

    String getCdid();

    C0TA0 getCurrentPluginData(EnumC19241510Pl enumC19241510Pl);

    List<C0TA0> getCurrentPluginList();

    @InterfaceC1294060jmO
    List<PluginData> getCurrentPluginListPluginData();

    ReinstallCheck getDeviceCheckResult();

    C10T7 getNewUserFeedSignalModel();

    String getPluginConfigProtoBufVid();

    void observe(EnumC19241510Pl enumC19241510Pl, LifecycleOwner lifecycleOwner, C11N2<C0TA0> c11n2);

    void observeInitialLaunchRequestResult(LifecycleOwner lifecycleOwner, C11N2<C0CV2> c11n2);

    C0VGI observeInitialLaunchRequestResultForever(Observer<C0CV2> observer);

    void prefetchABSettings(Function1<? super OnboardingConfigResponse, Unit> function1);

    void runClientExperimentUploadTask();

    void startPluginRequest(Boolean bool, C848050XOp c848050XOp, Boolean bool2, boolean z, int i);

    void subscribeInit(C10TV c10tv);

    void tryInit();

    public static final class ABExperimentNode {

        @C09CT("ab_group")
        public final String abGroup;

        public ABExperimentNode(String str) {
            this.abGroup = str;
        }
    }

    public static final class DownstreamExperimentFilterConfig {

        @C09CT("downstream_experiment_filters")
        public List<DownstreamExperimentFilter> filters;

        public DownstreamExperimentFilterConfig() {
            this(null);
        }

        public DownstreamExperimentFilterConfig(List<DownstreamExperimentFilter> list) {
            this.filters = list;
        }
    }

    public static final class FeedCardBackgroundMusicData {

        @C09CT("interest_reselection_card_music_url")
        public final String musicUrl;

        public FeedCardBackgroundMusicData() {
            this(null);
        }

        public FeedCardBackgroundMusicData(String str) {
            this.musicUrl = str;
        }
    }

    public static final class NUStrategyData {

        @C09CT("strategy_list")
        public final List<NUStrategy> strategyList;

        public NUStrategyData(List<NUStrategy> list) {
            this.strategyList = list;
        }
    }

    public static final class RemoveISData {

        @C09CT("should_skip_interest_selection")
        public final boolean shouldSkipIS;

        public RemoveISData(boolean z) {
            this.shouldSkipIS = z;
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static final class ServerPadStatusData {

        @C09CT("pad_status")
        public final Integer serverPadStatus;

        public ServerPadStatusData(Integer num) {
            this.serverPadStatus = num;
        }
    }

    public static final class ShowConfig {

        @C09CT("should_show")
        public Boolean shouldShow;

        public ShowConfig() {
            this(null);
        }

        public ShowConfig(Boolean bool) {
            this.shouldShow = bool;
        }
    }

    public static final class NUJFeedSignal {

        @C09CT("forced_login_status")
        public final Integer forcedLoginStatus;

        @C09CT("installation_info")
        public final NUJInstallationInfoModel installationInfo;

        @C09CT("login_history_info")
        public final NUJLoginHistoryInfoModel loginHistoryInfo;

        @C09CT("reinstall_status")
        public final Integer reinstallStatus;

        public static final class NUJInstallationInfoModel {

            @C09CT("first_installation")
            public final NUJInstallationInfoStruct firstInstallation;

            @C09CT("last_installation")
            public final NUJInstallationInfoStruct lastInstallation;

            public NUJInstallationInfoModel(NUJInstallationInfoStruct nUJInstallationInfoStruct, NUJInstallationInfoStruct nUJInstallationInfoStruct2) {
                this.lastInstallation = nUJInstallationInfoStruct;
                this.firstInstallation = nUJInstallationInfoStruct2;
            }
        }

        public static final class NUJLoginHistoryInfoModel {

            @C09CT("last_login")
            public final NUJLoginHistoryInfoStruct lastLogin;

            @C09CT("past_ninety_days_login")
            public final NUJLoginHistoryInfoStruct pastNinetyDaysLogin;

            public NUJLoginHistoryInfoModel(NUJLoginHistoryInfoStruct nUJLoginHistoryInfoStruct, NUJLoginHistoryInfoStruct nUJLoginHistoryInfoStruct2) {
                this.lastLogin = nUJLoginHistoryInfoStruct;
                this.pastNinetyDaysLogin = nUJLoginHistoryInfoStruct2;
            }
        }

        public static final class NUJLoginHistoryInfoStruct {

            @C09CT("login_platform")
            public final String loginPlatform;

            @C09CT("login_type")
            public final String loginType;

            public NUJLoginHistoryInfoStruct(String str, String str2) {
                this.loginType = str;
                this.loginPlatform = str2;
            }
        }

        public static final class NUJInstallationInfoStruct {

            @C09CT("activation_time")
            public final String activationTime;

            @C09CT("app_id")
            public final String appId;

            @C09CT("installation_time")
            public final String installationTime;

            @C09CT("language")
            public final String language;

            public NUJInstallationInfoStruct(String str, String str2, String str3, String str4) {
                this.appId = str;
                this.installationTime = str2;
                this.activationTime = str3;
                this.language = str4;
            }
        }

        public NUJFeedSignal(Integer num, Integer num2, NUJInstallationInfoModel nUJInstallationInfoModel, NUJLoginHistoryInfoModel nUJLoginHistoryInfoModel) {
            this.reinstallStatus = num;
            this.forcedLoginStatus = num2;
            this.installationInfo = nUJInstallationInfoModel;
            this.loginHistoryInfo = nUJLoginHistoryInfoModel;
        }
    }

    public static final class DailyLoginData {

        @C09CT("feed_login_config")
        public final InFeedLoginConfigStruct feedLoginConfig;

        @C09CT("should_terminate_prediction")
        public final Boolean shouldTerminatePrediction;

        public DailyLoginData() {
            this(null, null);
        }

        public DailyLoginData(InFeedLoginConfigStruct inFeedLoginConfigStruct, Boolean bool) {
            this.feedLoginConfig = inFeedLoginConfigStruct;
            this.shouldTerminatePrediction = bool;
        }
    }

    public static final class DownstreamExperimentFilter {

        @C09CT("downstream_service")
        public String downstreamService;

        @C09CT("filter_ids")
        public List<Long> filterIds;

        public DownstreamExperimentFilter() {
            this(null, null);
        }

        public DownstreamExperimentFilter(String str, List<Long> list) {
            this.downstreamService = str;
            this.filterIds = list;
        }
    }

    public static final class FeedRefreshData {

        @C09CT("refresh_condition")
        public final Integer refreshCondition;

        @C09CT("should_refresh_feed_after_age_gate")
        public final Boolean shouldRefreshFeedAfterAgeGate;

        public FeedRefreshData(Boolean bool, Integer num) {
            this.shouldRefreshFeedAfterAgeGate = bool;
            this.refreshCondition = num;
        }
    }

    /* JADX INFO: loaded from: classes26.dex */
    public static final class OnboardingConfigResponse {

        @C09CT("trending_creators_page")
        public final TrendingCreatorsPageStruct trendingCreatorsPageData;

        @C09CT("vod_config")
        public final n vodConfig;

        public OnboardingConfigResponse() {
            this(null, null);
        }

        public OnboardingConfigResponse(n nVar, TrendingCreatorsPageStruct trendingCreatorsPageStruct) {
            this.vodConfig = nVar;
            this.trendingCreatorsPageData = trendingCreatorsPageStruct;
        }
    }

    public static final class PreviousLoginData {

        @C09CT("ab_experiment_nodes")
        public final List<ABExperimentNode> abExperimentNodes;

        @C09CT("previous_login_nodes")
        public final List<PreviousLoginNode> previousLoginNodes;

        public PreviousLoginData(List<PreviousLoginNode> list, List<ABExperimentNode> list2) {
            this.previousLoginNodes = list;
            this.abExperimentNodes = list2;
        }
    }

    public static final class SimplePluginData {

        @C09CT("ab_group")
        public final int abGroup;

        @C09CT("kv_list")
        public final List<SpKvItem> kvList;

        public SimplePluginData(int i, List<SpKvItem> list) {
            this.abGroup = i;
            this.kvList = list;
        }
    }

    public static final class TrendingCreatorsData {

        @C09CT("is_trending_creators_page_enabled")
        public final Boolean isPageEnabled;

        @C09CT("use_server_order")
        public final Boolean useServerOrder;

        public TrendingCreatorsData() {
            this(null, null);
        }

        public TrendingCreatorsData(Boolean bool, Boolean bool2) {
            this.isPageEnabled = bool;
            this.useServerOrder = bool2;
        }
    }

    public static final class AutoExposureConfig {

        @C09CT("type")
        public final ExposureType exposureType;

        @C09CT("full_expose_vid")
        public final String fullExposureVid;

        @C09CT("precise_expose_vid")
        public final String preciseExposureVid;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ExposureType {
            public static final C10TU Companion;

            @C09CT("1")
            public static final ExposureType FULL;

            @C09CT("2")
            public static final ExposureType FULL_AND_PRECISE;
            public static final /* synthetic */ ExposureType[] LLILLJJLI;
            public static final /* synthetic */ C2254308sP LLILLL;

            @C09CT(CardStruct.IStatusCode.DEFAULT)
            public static final ExposureType PRECISE;
            public final int LL;

            public static InterfaceC2044707zh<ExposureType> getEntries() {
                return LLILLL;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.10TU] */
            static {
                ExposureType exposureType = new ExposureType("PRECISE", 0, 0);
                PRECISE = exposureType;
                ExposureType exposureType2 = new ExposureType("FULL", 1, 1);
                FULL = exposureType2;
                ExposureType exposureType3 = new ExposureType("FULL_AND_PRECISE", 2, 2);
                FULL_AND_PRECISE = exposureType3;
                ExposureType[] exposureTypeArr = {exposureType, exposureType2, exposureType3};
                LLILLJJLI = exposureTypeArr;
                LLILLL = new C2254308sP(exposureTypeArr);
                Companion = new Object() { // from class: X.10TU
                };
            }

            public static ExposureType[] values() {
                return (ExposureType[]) LLILLJJLI.clone();
            }

            public final int getValue() {
                return this.LL;
            }

            public static ExposureType valueOf(String str) {
                return (ExposureType) C08FF.LIZ(ExposureType.class, str);
            }

            public ExposureType(String str, int i, int i2) {
                this.LL = i2;
            }
        }

        public AutoExposureConfig() {
            this(null, null, null);
        }

        public AutoExposureConfig(ExposureType exposureType, String str, String str2) {
            this.exposureType = exposureType;
            this.fullExposureVid = str;
            this.preciseExposureVid = str2;
        }
    }

    public static final class CurrentStoreRegion {

        @C09CT("country_code")
        public final String countryCode;

        @C09CT("enabled_region_option")
        public final boolean enabledRegionOption;

        @C09CT("localized_country_name")
        public final String localizedCountryName;

        public CurrentStoreRegion(String str, String str2, boolean z) {
            this.countryCode = str;
            this.localizedCountryName = str2;
            this.enabledRegionOption = z;
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static final class LowActiveUserSurveyData {

        @C09CT("is_user_low_active")
        public final Boolean isUserLowActive;

        @C09CT("show_swipe_up_guide")
        public final Boolean showSwipeUpGuide;

        @C09CT("swipe_up_guide_type")
        public final Integer swipeUpGuideType;

        public LowActiveUserSurveyData() {
            this(null, null, null);
        }

        public LowActiveUserSurveyData(Boolean bool, Boolean bool2, Integer num) {
            this.isUserLowActive = bool;
            this.showSwipeUpGuide = bool2;
            this.swipeUpGuideType = num;
        }
    }

    public static final class LowActivityUserData {

        @C09CT("low_activity_design")
        public final String lowActivityIsDesign;

        @C09CT("low_activity_is_enabled")
        public final Boolean lowActivityIsEnabled;

        @C09CT("new_user_interest_page")
        public final NewUserInterestPageStruct newUserInterestPage;

        public LowActivityUserData() {
            this(null, null, null);
        }

        public LowActivityUserData(NewUserInterestPageStruct newUserInterestPageStruct, Boolean bool, String str) {
            this.newUserInterestPage = newUserInterestPageStruct;
            this.lowActivityIsEnabled = bool;
            this.lowActivityIsDesign = str;
        }
    }

    public static final class PreviousLoginNode {

        @C09CT("detail")
        public final String detail;

        @C09CT("method")
        public final Integer method;

        @C09CT(Scene.SCENE_SERVICE)
        public final Integer scene;

        public PreviousLoginNode(String str, Integer num, Integer num2) {
            this.detail = str;
            this.method = num;
            this.scene = num2;
        }
    }

    public static final class SmartPushData {

        @C09CT("model_reason")
        public final String modelReason;

        @C09CT("push_pop_time")
        public final Integer pushPopTime;

        @C09CT("push_popup_region_label")
        public final Integer pushPopupRegionLabel;

        public SmartPushData(Integer num, String str, Integer num2) {
            this.pushPopTime = num;
            this.modelReason = str;
            this.pushPopupRegionLabel = num2;
        }
    }

    public static final class SubscribeNuEventInfo {

        @C09CT("event_list")
        public final List<String> eventList;

        @C09CT("realtime_event_list")
        public final List<String> realtimeEventList;

        @C09CT("upload_interval_seconds")
        public final Integer uploadIntervalSeconds;

        public SubscribeNuEventInfo() {
            this(null, null, null);
        }

        public SubscribeNuEventInfo(Integer num, List<String> list, List<String> list2) {
            this.uploadIntervalSeconds = num;
            this.eventList = list;
            this.realtimeEventList = list2;
        }
    }

    public static final class AgeAction {

        @C09CT("age_consent_action")
        public final Integer ageConsentAction;

        @C09CT("did_third_party_age_range_action")
        public final Integer didThirdPartyAgeRangeAction;

        @C09CT("fallback_wait_duration")
        public final Integer fallbackWaitDuration;

        @C09CT("third_party_age_range_action")
        public final Integer thirdPartyAgeRangeAction;

        public AgeAction(Integer num, Integer num2, Integer num3, Integer num4) {
            this.thirdPartyAgeRangeAction = num;
            this.didThirdPartyAgeRangeAction = num2;
            this.ageConsentAction = num3;
            this.fallbackWaitDuration = num4;
        }
    }

    public static final class ClientTriggerConfig {

        @C09CT("enable")
        public final Boolean enable;

        @C09CT("max_queue_size")
        public final Integer maxQueueSize;

        @C09CT("missed_et_track_window")
        public final Long missedEtTrackingWindowMs;

        @C09CT("vid")
        public final String vid;

        public ClientTriggerConfig() {
            this(null, null, null, null);
        }

        public ClientTriggerConfig(Boolean bool, Integer num, Long l, String str) {
            this.enable = bool;
            this.maxQueueSize = num;
            this.missedEtTrackingWindowMs = l;
            this.vid = str;
        }
    }

    public static final class NUStrategy {

        @C09CT("ab_expose_vid")
        public final String abExposeVid;

        @C09CT(Scene.SCENE_SERVICE)
        public final Integer scene;

        @C09CT("strategy_data")
        public final String strategyData;

        @C09CT("strategy_id")
        public final long strategyId;

        public NUStrategy(Integer num, String str, long j, String str2) {
            this.scene = num;
            this.strategyData = str;
            this.strategyId = j;
            this.abExposeVid = str2;
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class NonForcedLoginRegionFlow {

        @C09CT("enable_non_forced_login_region_flow")
        public final boolean enableFlow;

        @C09CT("enable_on_app_launch")
        public final Boolean enableOnAppLaunch;

        @C09CT("frequency_post_failure")
        public final Integer frequencyPostFailure;

        @C09CT("single_account_login_type")
        public final Integer singleAccountLoginType;

        public NonForcedLoginRegionFlow() {
            this(false, null, Boolean.FALSE, 0);
        }

        public NonForcedLoginRegionFlow(boolean z, Integer num, Boolean bool, Integer num2) {
            this.enableFlow = z;
            this.singleAccountLoginType = num;
            this.enableOnAppLaunch = bool;
            this.frequencyPostFailure = num2;
        }
    }

    public static final class OptimizeISSkipDisplayData {

        @C09CT("is_enabled")
        public final Boolean isEnabled;

        @C09CT("show_bottom_config")
        public final ShowBottomConfig showBottomConfig;

        @C09CT("show_top_left")
        public final Boolean showTopLeft;

        @C09CT("show_top_right")
        public final Boolean showTopRight;

        public OptimizeISSkipDisplayData(Boolean bool, Boolean bool2, Boolean bool3, ShowBottomConfig showBottomConfig) {
            this.isEnabled = bool;
            this.showTopLeft = bool2;
            this.showTopRight = bool3;
            this.showBottomConfig = showBottomConfig;
        }
    }

    public static final class SpKvItem {

        @C09CT("bool_value")
        public final String boolValue;

        @C09CT("int_value")
        public final String intValue;

        @C09CT("key")
        public final String key;

        @C09CT("string_value")
        public final String stringValue;

        public SpKvItem(String str, String str2, String str3, String str4) {
            this.key = str;
            this.stringValue = str2;
            this.intValue = str3;
            this.boolValue = str4;
        }
    }

    public static final class InFeedLoginConfigStruct {

        @C09CT("is_enabled")
        public final Boolean isEnabled;

        @C09CT("login_signup_panel_size")
        public final Integer loginSignupPanelSize;

        @C09CT("login_signup_panel_skip_style")
        public final Integer loginSignupPanelSkipStyle;

        @C09CT("login_signup_panel_type")
        public final Integer loginSignupPanelType;

        @C09CT("show_on_vv")
        public final Integer showOnVV;

        public InFeedLoginConfigStruct() {
            this(null, null, null, null, null);
        }

        public InFeedLoginConfigStruct(Boolean bool, Integer num, Integer num2, Integer num3, Integer num4) {
            this.isEnabled = bool;
            this.showOnVV = num;
            this.loginSignupPanelSkipStyle = num2;
            this.loginSignupPanelType = num3;
            this.loginSignupPanelSize = num4;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class ProactiveLoginData {

        @C09CT("expiration_offset_end_millis")
        public final Long expirationOffsetEndtMillis;

        @C09CT("expiration_offset_start_millis")
        public final Long expirationOffsetStartMillis;

        @C09CT("title_text_login")
        public final String titleTextLogin;

        @C09CT("title_text_signup")
        public final String titleTextSignup;

        @C09CT("vv_trigger_threshold")
        public final Integer vvTriggerThreshold;

        public ProactiveLoginData(String str, String str2, Long l, Long l2, Integer num) {
            this.titleTextLogin = str;
            this.titleTextSignup = str2;
            this.expirationOffsetStartMillis = l;
            this.expirationOffsetEndtMillis = l2;
            this.vvTriggerThreshold = num;
        }
    }

    public static final class ShowBottomConfig {

        @C09CT("merged_with_next")
        public final Boolean mergedWithNext;

        @C09CT("required_interest_selection")
        public final Integer requiredInterestSelection;

        @C09CT("skip_button_animation_duration_ms")
        public final Long skipButtonAnimationDurationMs;

        @C09CT("skip_button_delay_ms")
        public final Long skipButtonDelayMs;

        @C09CT("wait_for_first_feed")
        public final Boolean waitForFirstFeed;

        public ShowBottomConfig(Boolean bool, Integer num, Long l, Long l2, Boolean bool2) {
            this.mergedWithNext = bool;
            this.requiredInterestSelection = num;
            this.skipButtonAnimationDurationMs = l;
            this.skipButtonDelayMs = l2;
            this.waitForFirstFeed = bool2;
        }
    }

    public static final class EcommerceLandingPageData {

        @C09CT("is_ecomm_new")
        public final Boolean isEcommNew;

        @C09CT("is_enable_onboarding_tts_by_age")
        public final Integer isEnableOnboardingTTSByAge;

        @C09CT("is_show_ecomm_feed_card")
        public final Boolean isShowEcommFeedCard;

        @C09CT("landing_url")
        public final String landingUrl;

        @C09CT("need_remove_swipe_up")
        public final Boolean needRemoveSwipeUp;

        @C09CT("show_after_n_feed_content")
        public final Integer showAfterNFeedContent;

        public EcommerceLandingPageData(Boolean bool, String str, Boolean bool2, Integer num, Boolean bool3, Integer num2) {
            this.isEcommNew = bool;
            this.landingUrl = str;
            this.needRemoveSwipeUp = bool2;
            this.isEnableOnboardingTTSByAge = num;
            this.isShowEcommFeedCard = bool3;
            this.showAfterNFeedContent = num2;
        }
    }

    public static final class PluginData {

        @C09CT("ab_expose_vid")
        public final String abExposeVid;

        @C09CT("auto_exposure_config")
        public final AutoExposureConfig autoExposureConfig;

        @C09CT("params")
        public final PluginDataWrapper configData;

        @C09CT("downstream_experiment_filter_config")
        public final DownstreamExperimentFilterConfig downstreamExperimentFilterConfig;

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public final int id;

        @C09CT("instance_id")
        public final Integer instanceId;

        @C09CT("show_config")
        public final ShowConfig showConfig;

        @C09CT("timestamp")
        public final long timestamp;

        public PluginData(int i, ShowConfig showConfig, PluginDataWrapper pluginDataWrapper, long j, Integer num, String str, AutoExposureConfig autoExposureConfig, long j2, DownstreamExperimentFilterConfig downstreamExperimentFilterConfig) {
            this.id = i;
            this.showConfig = showConfig;
            this.configData = pluginDataWrapper;
            this.timestamp = j;
            this.instanceId = num;
            this.abExposeVid = str;
            this.autoExposureConfig = autoExposureConfig;
            this.downstreamExperimentFilterConfig = downstreamExperimentFilterConfig;
        }
    }

    public static final class PluginConfigResponse {

        @C09CT("ad_scenario")
        public final String adScenario;

        @C09CT("bind_age_successful")
        public final Boolean bindAgeSuccessful;

        @C09CT("client_trigger_config")
        public final ClientTriggerConfig clientTriggerConfig;

        @C09CT("current_store_region")
        public final CurrentStoreRegion currentStoreRegion;

        @C09CT("android_device_reinstall_check")
        public final ReinstallCheck deviceCheckResult;

        @C09CT("expired_plugin_id_list")
        public final List<Integer> expiredPluginIds;

        @C09CT("ug_feature_list")
        public final List<PluginData> featureList;

        @C09CT("feed_signal")
        public final NUJFeedSignal feedSignal;

        @C09CT("nu_container_info")
        public final NUContainerInfoStruct nuContainerInfo;

        @C09CT("server_pad_status")
        public final Integer serverPadStatus;

        @C09CT("subscribed_nu_event_info")
        public final SubscribeNuEventInfo subscribeNuEventInfo;

        public PluginConfigResponse() {
            this(null, null, null, null, null, null, null, null, null, null, null);
        }

        public PluginConfigResponse(ReinstallCheck reinstallCheck, List<PluginData> list, ClientTriggerConfig clientTriggerConfig, CurrentStoreRegion currentStoreRegion, NUJFeedSignal nUJFeedSignal, NUContainerInfoStruct nUContainerInfoStruct, SubscribeNuEventInfo subscribeNuEventInfo, List<Integer> list2, String str, Boolean bool, Integer num) {
            this.deviceCheckResult = reinstallCheck;
            this.featureList = list;
            this.clientTriggerConfig = clientTriggerConfig;
            this.currentStoreRegion = currentStoreRegion;
            this.feedSignal = nUJFeedSignal;
            this.nuContainerInfo = nUContainerInfoStruct;
            this.subscribeNuEventInfo = subscribeNuEventInfo;
            this.expiredPluginIds = list2;
            this.adScenario = str;
            this.bindAgeSuccessful = bool;
            this.serverPadStatus = num;
        }
    }

    public static final class PluginDataWrapper {

        @C09CT("age_action")
        public final AgeAction ageAction;

        @C09CT("daily_login_data")
        public final DailyLoginData dailyLoginData;

        @C09CT("ecommerce_landing_page_data")
        public final EcommerceLandingPageData ecommerceLandingPageData;

        @C09CT("feed_card_background_music_data")
        public final FeedCardBackgroundMusicData feedCardBackgroundMusicData;

        @C09CT("feed_refresh_data")
        public final FeedRefreshData feedRefreshData;

        @C09CT("first_like_toast_data")
        public final FirstLikeToastData firstLikeToastdata;

        @C09CT("low_active_user_data")
        public final LowActiveUserSurveyData lowActiveUserSurveyData;

        @C09CT("low_activity_user_data")
        public final LowActivityUserData lowActivityUserData;

        @C09CT("non_forced_login_region_flow_data")
        public final NonForcedLoginRegionFlow nonForcedLoginRegionFlow;

        @C09CT("video_tutorial_data")
        public final NotInterestedTutorialData notInterestedTutorialData;

        @C09CT("new_user_strategy_data")
        public final NUStrategyData nuStrategyData;

        @C09CT("onboarding_flow_data")
        public final OnboardingFlowData onboardingFlowData;

        @C09CT("optimize_is_skip_display_data")
        public final OptimizeISSkipDisplayData optimizeISSkipDisplayData;

        @C09CT("personalized_nuj_v2_data")
        public final PersonalizedNUJV2Data personalizedNUJV2Data;

        @C09CT("previous_login_data")
        public final PreviousLoginData previousLoginData;

        @C09CT("proactive_login_data")
        public final ProactiveLoginData proactiveLoginData;

        @C09CT("remove_interest_selection_data")
        public final RemoveISData removeISData;

        @C09CT("pad_data")
        public final ServerPadStatusData serverPadStatusData;

        @C09CT("simple_plugin_data")
        public final SimplePluginData simplePluginData;

        @C09CT("smart_push_data")
        public final SmartPushData smartPushData;

        @C09CT("tooltips_protection_plugin_data")
        public final TooltipProtectionModel$TooltipDataProtection tooltipDataProtection;

        @C09CT("trending_creators_page_data")
        public final TrendingCreatorsData trendingCreatorsData;

        public PluginDataWrapper() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        }

        public PluginDataWrapper(NotInterestedTutorialData notInterestedTutorialData, FirstLikeToastData firstLikeToastData, OnboardingFlowData onboardingFlowData, PersonalizedNUJV2Data personalizedNUJV2Data, NonForcedLoginRegionFlow nonForcedLoginRegionFlow, SimplePluginData simplePluginData, TooltipProtectionModel$TooltipDataProtection tooltipProtectionModel$TooltipDataProtection, RemoveISData removeISData, PreviousLoginData previousLoginData, ProactiveLoginData proactiveLoginData, SmartPushData smartPushData, NUStrategyData nUStrategyData, EcommerceLandingPageData ecommerceLandingPageData, OptimizeISSkipDisplayData optimizeISSkipDisplayData, DailyLoginData dailyLoginData, LowActivityUserData lowActivityUserData, LowActiveUserSurveyData lowActiveUserSurveyData, TrendingCreatorsData trendingCreatorsData, FeedRefreshData feedRefreshData, AgeAction ageAction, FeedCardBackgroundMusicData feedCardBackgroundMusicData, ServerPadStatusData serverPadStatusData) {
            this.notInterestedTutorialData = notInterestedTutorialData;
            this.firstLikeToastdata = firstLikeToastData;
            this.onboardingFlowData = onboardingFlowData;
            this.personalizedNUJV2Data = personalizedNUJV2Data;
            this.nonForcedLoginRegionFlow = nonForcedLoginRegionFlow;
            this.simplePluginData = simplePluginData;
            this.tooltipDataProtection = tooltipProtectionModel$TooltipDataProtection;
            this.removeISData = removeISData;
            this.previousLoginData = previousLoginData;
            this.proactiveLoginData = proactiveLoginData;
            this.smartPushData = smartPushData;
            this.nuStrategyData = nUStrategyData;
            this.ecommerceLandingPageData = ecommerceLandingPageData;
            this.optimizeISSkipDisplayData = optimizeISSkipDisplayData;
            this.dailyLoginData = dailyLoginData;
            this.lowActivityUserData = lowActivityUserData;
            this.lowActiveUserSurveyData = lowActiveUserSurveyData;
            this.trendingCreatorsData = trendingCreatorsData;
            this.feedRefreshData = feedRefreshData;
            this.ageAction = ageAction;
            this.feedCardBackgroundMusicData = feedCardBackgroundMusicData;
            this.serverPadStatusData = serverPadStatusData;
        }
    }
}
