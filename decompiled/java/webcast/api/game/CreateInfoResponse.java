package webcast.api.game;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.GameRevenueTipsMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.EnlargeViewInfo;

/* JADX INFO: loaded from: classes.dex */
public final class CreateInfoResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("allow_multi_stream")
        public boolean allowMultiStream;

        @C09CT("anchor_first_game_go_live_ts")
        public long anchorFirstGameGoLiveTs;

        @C09CT("audio_violations_info")
        public AudioViolationsInfo audioViolationsInfo;

        @C09CT("banner_data")
        public GameBannerContainer bannerData;

        @C09CT("cli_tns_collect_interval_ms")
        public long cliTnsCollectIntervalMs;

        @C09CT("enable_enlarge_tips")
        public boolean enableEnlargeTips;

        @C09CT("enable_live_studio_monitor")
        public boolean enableLiveStudioMonitor;

        @C09CT("enable_phone_as_camera")
        public long enablePhoneAsCamera;

        @C09CT("enlarge_view")
        public EnlargeViewInfo enlargeView;

        @C09CT("extended_chat_penetration_promotion_info")
        public ExtendedChatPenetrationPromotionInfo extendedChatPenetrationPromotionInfo;

        @C09CT("guess_result_notice_time")
        public long guessResultNoticeTime;

        @C09CT("has_live_studio_login")
        public boolean hasLiveStudioLogin;

        @C09CT("has_oral_ability_for_ai_script")
        public boolean hasOralAbilityForAiScript;

        @C09CT("have_ai_script_permission")
        public boolean haveAiScriptPermission;

        @C09CT("have_cue_script_permission")
        public boolean haveCueScriptPermission;

        @C09CT("have_dual_device_camera")
        public boolean haveDualDeviceCamera;

        @C09CT("have_mutil_guest_permission")
        public boolean haveMutilGuestPermission;

        @C09CT("have_screenshot_record")
        public boolean haveScreenshotRecord;

        @C09CT("have_super_fans_permission")
        public boolean haveSuperFansPermission;

        @C09CT("in_game_info")
        public InGameInfo inGameInfo;

        @C09CT("is_game_anchor")
        public boolean isGameAnchor;

        @C09CT("monetization_tips_config")
        public MonetizationTipsConfig monetizationTipsConfig;

        @C09CT("noice_reduction_info")
        public NoiceReductionInfo noiceReductionInfo;

        @C09CT("open_ls_notify")
        public OpenLsNotifyInfo openLsNotify;

        @C09CT("revenue_tips")
        public GameRevenueTipsMessage revenueTips;

        @C09CT("server_timestamp")
        public long serverTimestamp;

        @C09CT("tips")
        public Text tips;

        @C09CT("tns_lid_language")
        public TnsLidLanguage tnsLidLanguage;

        @C09CT("tns_report_interval_ms")
        public long tnsReportIntervalMs;

        @C09CT("use_custom_cover")
        public boolean useCustomCover;

        @C09CT("user_setting_detail")
        public long userSettingDetail;
    }
}
