package com.ss.android.ugc.aweme.minis.settings;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.google.gson.n;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes35.dex */
public final class MinisConfigSettings {
    public static final TtopMinisConfigModel LIZ = new TtopMinisConfigModel(null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);

    /* JADX INFO: loaded from: classes31.dex */
    public static final class UrlSetting {

        @C09CT("community_guideline")
        public final String communityGuidelines;

        @C09CT("guidance_lottie_dark")
        public final String guidanceLottieDark;

        @C09CT("guidance_lottie_light")
        public final String guidanceLottieLight;

        public UrlSetting() {
            this("https://www.tiktok.com/community-guidelines/", "https://connect.tiktok-minis.com/assets/minis/minis_Intro_dark_tux_lottie.json", "https://connect.tiktok-minis.com/assets/minis/minis_Intro_light_tux_lottie.json");
        }

        public UrlSetting(String str, String str2, String str3) {
            this.communityGuidelines = str;
            this.guidanceLottieDark = str2;
            this.guidanceLottieLight = str3;
        }
    }

    public static final TtopMinisConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        TtopMinisConfigModel ttopMinisConfigModel = LIZ;
        TtopMinisConfigModel ttopMinisConfigModel2 = (TtopMinisConfigModel) settingsManagerLIZLLL.LJIIIIZZ("minis_config", TtopMinisConfigModel.class, ttopMinisConfigModel);
        return ttopMinisConfigModel2 != null ? ttopMinisConfigModel2 : ttopMinisConfigModel;
    }

    public static final class Controls {

        @C09CT("login")
        public final Login login;

        public Controls(Login login) {
            this.login = login;
        }
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static final class Debug {

        @C09CT("fetch_meta_with_debug_meta_update_jsb")
        public final boolean fetchMetaWithDebugMetaUpdateJsb;

        public Debug() {
            this(true);
        }

        public Debug(boolean z) {
            this.fetchMetaWithDebugMetaUpdateJsb = z;
        }
    }

    public static final class Touch {

        @C09CT("forbidMiniGamePageScroll")
        public final boolean forbidMiniGamePageScroll;

        public Touch() {
            this(true);
        }

        public Touch(boolean z) {
            this.forbidMiniGamePageScroll = z;
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class Login {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("allow_list")
        public final List<String> whitelistMinisClientKeys;

        public Login(boolean z, List<String> list) {
            this.enable = z;
            this.whitelistMinisClientKeys = list;
        }

        public Login(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? C13BV.INSTANCE : list);
        }
    }

    public static final class MetaCache {

        @C09CT("time")
        public final int duration;

        @C09CT("enable")
        public final boolean enable;

        public MetaCache(int i, boolean z) {
            this.duration = i;
            this.enable = z;
        }
    }

    /* JADX INFO: loaded from: classes28.dex */
    public static final class Payment {

        @C09CT("beans_method_enable")
        public final boolean beansMethodEnable;

        @C09CT("subscribe_method_enable")
        public final boolean subscribeMethodEnable;

        public Payment() {
            this(true, true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Payment)) {
                return false;
            }
            Payment payment = (Payment) obj;
            return this.beansMethodEnable == payment.beansMethodEnable && this.subscribeMethodEnable == payment.subscribeMethodEnable;
        }

        public final int hashCode() {
            return (C786410Ut5.Z2(this.beansMethodEnable) * 31) + C786410Ut5.Z2(this.subscribeMethodEnable);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Payment(beansMethodEnable=");
            sbLIZ.append(this.beansMethodEnable);
            sbLIZ.append(", subscribeMethodEnable=");
            sbLIZ.append(this.subscribeMethodEnable);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Payment(boolean z, boolean z2) {
            this.beansMethodEnable = z;
            this.subscribeMethodEnable = z2;
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static final class UsageTimeThreshold implements Serializable {
        public static final int $stable = 0;

        @C09CT("enabled")
        public final boolean enabled;

        @C09CT("minigame")
        public final UsageTimeThresholdValue miniGame;

        public UsageTimeThreshold() {
            this(true, new UsageTimeThresholdValue(1L, null));
        }

        public UsageTimeThreshold(boolean z, UsageTimeThresholdValue usageTimeThresholdValue) {
            this.enabled = z;
            this.miniGame = usageTimeThresholdValue;
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static final class UsageTimeThresholdValue implements Serializable {
        public static final int $stable = 0;

        @C09CT("max")
        public final Long max;

        @C09CT("min")
        public final Long min;

        public UsageTimeThresholdValue() {
            this(null, null);
        }

        public UsageTimeThresholdValue(Long l, Long l2) {
            this.min = l;
            this.max = l2;
        }
    }

    public static final class Home {

        @C09CT("minis_center_schema")
        public final String minisCenterSchema;

        @C09CT("minis_center_schema_musically")
        public final String minisCenterSchemaMusically;

        @C09CT("minis_center_schema_tiktok")
        public final String minisCenterSchemaTikTok;

        public Home(String str, String str2, String str3) {
            this.minisCenterSchema = str;
            this.minisCenterSchemaMusically = str2;
            this.minisCenterSchemaTikTok = str3;
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class HotLoad {

        @C09CT("count")
        public final int count;

        @C09CT("duration")
        public final int duration;

        @C09CT("enable")
        public final boolean enable;

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HotLoad(count=");
            sbLIZ.append(this.count);
            sbLIZ.append(", duration=");
            sbLIZ.append(this.duration);
            sbLIZ.append(", enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public HotLoad(int i, int i2, boolean z) {
            this.count = i;
            this.duration = i2;
            this.enable = z;
        }
    }

    /* JADX INFO: loaded from: classes31.dex */
    public static final class TosConfig {

        @C09CT("access_key")
        public final String accessKey;

        @C09CT("hostname")
        public final String hostName;

        @C09CT("secret_key")
        public final String secretKey;

        public TosConfig(String str, String str2, String str3) {
            this.accessKey = str;
            this.hostName = str2;
            this.secretKey = str3;
        }
    }

    public static final class DramaAddLauncherPopupControl {

        @C09CT("entry_wl")
        public final List<String> entryWList;

        @C09CT("max_times")
        public final int maxTimes;

        @C09CT("period")
        public final long period;

        @C09CT("times")
        public final int times;

        public DramaAddLauncherPopupControl(List<String> list, long j, int i, int i2) {
            this.entryWList = list;
            this.period = j;
            this.times = i;
            this.maxTimes = i2;
        }

        public DramaAddLauncherPopupControl(List list, long j, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? C13BV.INSTANCE : list, j, i, i2);
        }
    }

    public static final class GamesAddLauncherPopupControl {

        @C09CT("entry_wl")
        public final List<String> entryWList;

        @C09CT("max_times")
        public final int maxTimes;

        @C09CT("period")
        public final long period;

        @C09CT("times")
        public final int times;

        public GamesAddLauncherPopupControl(List<String> list, long j, int i, int i2) {
            this.entryWList = list;
            this.period = j;
            this.times = i;
            this.maxTimes = i2;
        }

        public GamesAddLauncherPopupControl(List list, long j, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? C13BV.INSTANCE : list, j, i, i2);
        }
    }

    public static final class GamesIntroPopupControl {

        @C09CT("entry_bl")
        public final List<String> entryBList;

        @C09CT("period")
        public final long period;

        @C09CT("stay_duration")
        public final int stayDuration;

        @C09CT("times")
        public final int times;

        public GamesIntroPopupControl(List<String> list, long j, int i, int i2) {
            this.entryBList = list;
            this.period = j;
            this.stayDuration = i;
            this.times = i2;
        }

        public GamesIntroPopupControl(List list, long j, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? C13BV.INSTANCE : list, j, i, i2);
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class Report {

        @C09CT("functional_report_details_page_schema")
        public final String functionalReportDetailsPageSchema;

        @C09CT("minigame_functional_report_page_schema")
        public final String minigameFunctionalReportPageSchema;

        @C09CT("minigame_violation_report_page_schema")
        public final String minigameViolationReportPageSchema;

        @C09CT("minis_report_ads_revamp_page_schema")
        public final String minisAdsReportRevampPageSchema;

        @C09CT("minis_report_experience_revamp_page_schema")
        public final String minisExperienceReportRevampPageSchema;

        @C09CT("minis_report_feedback_revamp_page_schema")
        public final String minisFeedbackReportRevampPageSchema;

        @C09CT("minis_report_payment_revamp_page_schema")
        public final String minisPaymentReportRevampPageSchema;

        @C09CT("minis_report_revamp_switch")
        public final boolean minisReportRevampSwitch;

        @C09CT("payment_order_report_schema")
        public final String paymentOrderReportSchema;

        @C09CT("tos_config")
        public final TosConfig tosConfig;

        public Report(TosConfig tosConfig, String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8) {
            this.tosConfig = tosConfig;
            this.paymentOrderReportSchema = str;
            this.functionalReportDetailsPageSchema = str2;
            this.minigameFunctionalReportPageSchema = str3;
            this.minigameViolationReportPageSchema = str4;
            this.minisReportRevampSwitch = z;
            this.minisAdsReportRevampPageSchema = str5;
            this.minisExperienceReportRevampPageSchema = str6;
            this.minisFeedbackReportRevampPageSchema = str7;
            this.minisPaymentReportRevampPageSchema = str8;
        }
    }

    public static final class TtopMinisConfigModel {

        @C09CT("add_to_launcher_enabled")
        public final boolean addToLauncherEnabled;

        @C09CT("controls")
        public final Controls controls;

        @C09CT("debug")
        public final Debug debug;

        @C09CT("drama_add_launcher_popup_control")
        public final DramaAddLauncherPopupControl dramaAddLauncherPopupControl;

        @C09CT("exit_bottom_bar_enter_from_list")
        public final List<String> exitBottomBarEnterFromList;

        @C09CT("games_intro_popup_control")
        public final GamesIntroPopupControl gameIntroPopupControl;

        @C09CT("game_mainframe_url")
        public final String gameMainFrameUrl;

        @C09CT("games_supported_global_props")
        public final List<String> gameSupportedGlobalProps;

        @C09CT("games_add_launcher_popup_control")
        public final GamesAddLauncherPopupControl gamesAddLauncherPopupControl;

        @C09CT("home")
        public final Home home;

        @C09CT("hot_load")
        public final HotLoad hotLoad;

        @C09CT("meta_cache")
        public final MetaCache metaCache;

        @C09CT("openBalance")
        public final n openBalance;

        @C09CT("payment")
        public final Payment payment;

        @C09CT("report")
        public final Report report;

        @C09CT("supported_global_props")
        public final List<String> supportedGlobalProps;

        @C09CT("touch")
        public final Touch touch;

        @C09CT("urls_setting")
        public final UrlSetting urlSetting;

        @C09CT("usage_time_threshold")
        public final UsageTimeThreshold usageTimeThreshold;

        public TtopMinisConfigModel() {
            this(null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
        }

        public TtopMinisConfigModel(Controls controls, String str, GamesIntroPopupControl gamesIntroPopupControl, GamesAddLauncherPopupControl gamesAddLauncherPopupControl, DramaAddLauncherPopupControl dramaAddLauncherPopupControl, boolean z, HotLoad hotLoad, MetaCache metaCache, n nVar, Report report, List<String> list, List<String> list2, Home home, UrlSetting urlSetting, Touch touch, Debug debug, UsageTimeThreshold usageTimeThreshold, List<String> list3, Payment payment) {
            this.controls = controls;
            this.gameMainFrameUrl = str;
            this.gameIntroPopupControl = gamesIntroPopupControl;
            this.gamesAddLauncherPopupControl = gamesAddLauncherPopupControl;
            this.dramaAddLauncherPopupControl = dramaAddLauncherPopupControl;
            this.addToLauncherEnabled = z;
            this.hotLoad = hotLoad;
            this.metaCache = metaCache;
            this.openBalance = nVar;
            this.report = report;
            this.supportedGlobalProps = list;
            this.gameSupportedGlobalProps = list2;
            this.home = home;
            this.urlSetting = urlSetting;
            this.touch = touch;
            this.debug = debug;
            this.usageTimeThreshold = usageTimeThreshold;
            this.exitBottomBarEnterFromList = list3;
            this.payment = payment;
        }

        public TtopMinisConfigModel(Controls controls, String str, GamesIntroPopupControl gamesIntroPopupControl, GamesAddLauncherPopupControl gamesAddLauncherPopupControl, DramaAddLauncherPopupControl dramaAddLauncherPopupControl, boolean z, HotLoad hotLoad, MetaCache metaCache, n nVar, Report report, List list, List list2, Home home, UrlSetting urlSetting, Touch touch, Debug debug, UsageTimeThreshold usageTimeThreshold, List list3, Payment payment, int i, DefaultConstructorMarker defaultConstructorMarker) {
            Long l;
            UsageTimeThreshold usageTimeThreshold2 = usageTimeThreshold;
            Payment payment2 = payment;
            Debug debug2 = debug;
            Touch touch2 = touch;
            UrlSetting urlSetting2 = urlSetting;
            controls = (i & 1) != 0 ? null : controls;
            str = (i & 2) != 0 ? null : str;
            gamesIntroPopupControl = (i & 4) != 0 ? null : gamesIntroPopupControl;
            gamesAddLauncherPopupControl = (i & 8) != 0 ? null : gamesAddLauncherPopupControl;
            dramaAddLauncherPopupControl = (i & 16) != 0 ? null : dramaAddLauncherPopupControl;
            z = (i & 32) != 0 ? true : z;
            hotLoad = (i & 64) != 0 ? null : hotLoad;
            metaCache = (i & 128) != 0 ? null : metaCache;
            nVar = (i & 256) != 0 ? null : nVar;
            report = (i & 512) != 0 ? null : report;
            list = (i & 1024) != 0 ? C13BV.INSTANCE : list;
            list2 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? C13BV.INSTANCE : list2;
            home = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : home;
            urlSetting2 = (i & 8192) != 0 ? new UrlSetting("https://www.tiktok.com/community-guidelines/", "https://connect.tiktok-minis.com/assets/minis/minis_Intro_dark_tux_lottie.json", "https://connect.tiktok-minis.com/assets/minis/minis_Intro_light_tux_lottie.json") : urlSetting2;
            if ((i & 16384) != 0) {
                l = null;
                touch2 = new Touch(true);
            } else {
                l = null;
            }
            this(controls, str, gamesIntroPopupControl, gamesAddLauncherPopupControl, dramaAddLauncherPopupControl, z, hotLoad, metaCache, nVar, report, list, list2, home, urlSetting2, touch2, (32768 & i) != 0 ? new Debug(true) : debug2, (65536 & i) != 0 ? new UsageTimeThreshold(true, new UsageTimeThresholdValue(1L, l)) : usageTimeThreshold2, (131072 & i) != 0 ? C13BV.INSTANCE : list3, (i & 262144) != 0 ? new Payment(true, true) : payment2);
        }
    }
}
