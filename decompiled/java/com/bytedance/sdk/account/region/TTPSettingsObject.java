package com.bytedance.sdk.account.region;

import X.C09CT;
import X.C0OFE;
import X.C1697810uHb;
import X.C2097608Jq;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.tts.oecverify.BdTuringConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes36.dex */
public final class TTPSettingsObject {
    public static final Map<String, TTPDomain> LIZ;
    public static final Map<String, String> LIZIZ;
    public static final TTPSettingsObject LIZJ;

    @C09CT("auth_broadcast_domains")
    public final List<String> auth_broadcast_domains;

    @C09CT("disabled_app_region_optimization")
    public final Boolean disableRegionOpt;

    @C09CT("disabled_app_region_optimization_disaster_recovery")
    public final Boolean disableRegionOptDR;

    @C09CT("disabled")
    public final boolean disabled;

    @C09CT("domains")
    public final List<String> domains;

    @C09CT("email_send_code_paths")
    public final List<String> email_send_code_paths;

    @C09CT("exclude_email_code_type")
    public final List<Integer> exclude_email_code_type;

    @C09CT("exclude_paths")
    public final List<String> exclude_paths;

    @C09CT("exclude_sms_code_type")
    public final List<Integer> exclude_sms_code_type;

    @C09CT("max_retry_count")
    public final Integer maxRetryCount;

    @C09CT("mobile_send_code_paths")
    public final List<String> mobile_send_code_paths;

    @C09CT("country_to_vdc")
    public final Map<String, String> regionToVDC;

    @C09CT("valid_invocations")
    public final List<String> validInvocationList;

    @C09CT("vdc_to_domain")
    public final Map<String, TTPDomain> vdcToDomain;

    static {
        Map<String, TTPDomain> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("alisg", new TTPDomain("api16-normal-c-alisg.tiktokv.com")), new Pair("ie", new TTPDomain("api16-normal-c-useast2a.tiktokv.com")), new Pair("maliva", new TTPDomain("api16-normal-c-useast1a.tiktokv.com")), new Pair("my", new TTPDomain("api16-normal-c-alisg.tiktokv.com")), new Pair("no1a", new TTPDomain("api16-normal-no1a.tiktokv.eu")), new Pair("sg1", new TTPDomain("api16-normal-c-alisg.tiktokv.com")), new Pair("useast2a", new TTPDomain("api16-normal-c-useast2a.tiktokv.com")), new Pair("useast5", new TTPDomain("api16-normal-useast5.tiktokv.us")), new Pair("useast8", new TTPDomain("api16-normal-useast8.tiktokv.us")));
        LIZ = mapLJIIIIZZ;
        Map<String, String> mapLJIIIIZZ2 = C2097608Jq.LJIIIIZZ(new Pair("ad", "maliva"), new Pair("ae", "alisg"), new Pair("af", "alisg"), new Pair("ag", "maliva"), new Pair("ai", "maliva"), new Pair("al", "maliva"), new Pair("am", "alisg"), new Pair("ao", "maliva"), new Pair("aq", "maliva"), new Pair("ar", "maliva"), new Pair("as", "useast5"), new Pair("at", "useast2a"), new Pair("au", "alisg"), new Pair("aw", "maliva"), new Pair("ax", "maliva"), new Pair("az", "alisg"), new Pair("ba", "maliva"), new Pair("bb", "maliva"), new Pair("bd", "alisg"), new Pair("be", "useast2a"), new Pair("bf", "maliva"), new Pair("bg", "useast2a"), new Pair("bh", "alisg"), new Pair("bi", "maliva"), new Pair("bj", "maliva"), new Pair("bl", "maliva"), new Pair("bm", "maliva"), new Pair("bn", "alisg"), new Pair("bo", "maliva"), new Pair("bq", "maliva"), new Pair("br", "maliva"), new Pair("bs", "maliva"), new Pair("bt", "alisg"), new Pair("bv", "maliva"), new Pair("bw", "maliva"), new Pair("by", "maliva"), new Pair("bz", "maliva"), new Pair("ca", "maliva"), new Pair("cc", "alisg"), new Pair("cd", "maliva"), new Pair("cf", "maliva"), new Pair("cg", "maliva"), new Pair("ch", "useast2a"), new Pair("ci", "maliva"), new Pair("ck", "alisg"), new Pair("cl", "maliva"), new Pair("cm", "maliva"), new Pair(BdTuringConfig.REGION_CN, "alisg"), new Pair("co", "maliva"), new Pair("cr", "maliva"), new Pair("cu", "alisg"), new Pair("cv", "maliva"), new Pair("cw", "maliva"), new Pair("cx", "alisg"), new Pair("cy", "useast2a"), new Pair("cz", "useast2a"), new Pair("de", "useast2a"), new Pair("dj", "maliva"), new Pair("dk", "useast2a"), new Pair("dm", "maliva"), new Pair("do", "maliva"), new Pair("dz", "maliva"), new Pair("ec", "maliva"), new Pair("ee", "useast2a"), new Pair("eg", "maliva"), new Pair("eh", "maliva"), new Pair("er", "maliva"), new Pair("es", "useast2a"), new Pair("et", "maliva"), new Pair("fi", "useast2a"), new Pair("fj", "alisg"), new Pair("fk", "maliva"), new Pair("fm", "alisg"), new Pair("fo", "maliva"), new Pair("fr", "useast2a"), new Pair("ga", "maliva"), new Pair("gb", "useast2a"), new Pair("gd", "maliva"), new Pair("ge", "alisg"), new Pair("gf", "useast2a"), new Pair("gg", "maliva"), new Pair("gh", "maliva"), new Pair("gi", "maliva"), new Pair("gl", "maliva"), new Pair("gm", "maliva"), new Pair("gn", "maliva"), new Pair("gp", "useast2a"), new Pair("gq", "maliva"), new Pair("gr", "useast2a"), new Pair("gs", "alisg"), new Pair("gt", "maliva"), new Pair("gu", "useast5"), new Pair("gw", "maliva"), new Pair("gy", "maliva"), new Pair("hk", "alisg"), C0OFE.LIZ("hm", "alisg"), C0OFE.LIZ("hn", "maliva"), C0OFE.LIZ("hr", "useast2a"), C0OFE.LIZ("ht", "maliva"), C0OFE.LIZ("hu", "useast2a"), C0OFE.LIZ(FollowStatusChangeMethod.PARAM_UID, "maliva"), C0OFE.LIZ("ie", "useast2a"), C0OFE.LIZ("il", "alisg"), C0OFE.LIZ("im", "maliva"), C0OFE.LIZ("in", "alisg"), C0OFE.LIZ("io", "alisg"), C0OFE.LIZ("iq", "maliva"), C0OFE.LIZ("ir", "alisg"), C0OFE.LIZ("is", "useast2a"), C0OFE.LIZ("it", "useast2a"), C0OFE.LIZ("je", "maliva"), C0OFE.LIZ("jm", "maliva"), C0OFE.LIZ("jo", "alisg"), C0OFE.LIZ("jp", "alisg"), C0OFE.LIZ("ke", "maliva"), C0OFE.LIZ("kg", "alisg"), C0OFE.LIZ("kh", "alisg"), C0OFE.LIZ("ki", "alisg"), C0OFE.LIZ("km", "maliva"), C0OFE.LIZ("kn", "maliva"), C0OFE.LIZ("kp", "alisg"), C0OFE.LIZ("kr", "alisg"), C0OFE.LIZ("kw", "alisg"), C0OFE.LIZ("ky", "maliva"), C0OFE.LIZ("kz", "maliva"), C0OFE.LIZ("la", "alisg"), C0OFE.LIZ("lb", "alisg"), C0OFE.LIZ("lc", "maliva"), C0OFE.LIZ("li", "useast2a"), C0OFE.LIZ("lk", "alisg"), C0OFE.LIZ("lr", "maliva"), C0OFE.LIZ("ls", "maliva"), C0OFE.LIZ("lt", "useast2a"), C0OFE.LIZ("lu", "useast2a"), C0OFE.LIZ("lv", "useast2a"), C0OFE.LIZ("ly", "maliva"), C0OFE.LIZ("ma", "maliva"), C0OFE.LIZ("mc", "maliva"), C0OFE.LIZ("md", "maliva"), C0OFE.LIZ("me", "maliva"), C0OFE.LIZ("mf", "useast2a"), C0OFE.LIZ("mg", "maliva"), C0OFE.LIZ("mh", "alisg"), C0OFE.LIZ("mk", "maliva"), C0OFE.LIZ("ml", "maliva"), C0OFE.LIZ("mm", "alisg"), C0OFE.LIZ("mn", "alisg"), C0OFE.LIZ("mo", "alisg"), C0OFE.LIZ("mp", "useast5"), C0OFE.LIZ("mq", "useast2a"), C0OFE.LIZ("mr", "maliva"), C0OFE.LIZ("ms", "maliva"), C0OFE.LIZ("mt", "useast2a"), C0OFE.LIZ("mu", "maliva"), C0OFE.LIZ("mv", "alisg"), C0OFE.LIZ("mw", "maliva"), C0OFE.LIZ("mx", "maliva"), C0OFE.LIZ("my", "alisg"), C0OFE.LIZ("mz", "maliva"), C0OFE.LIZ("na", "maliva"), C0OFE.LIZ("nc", "alisg"), C0OFE.LIZ("ne", "maliva"), C0OFE.LIZ("nf", "alisg"), C0OFE.LIZ("ng", "maliva"), C0OFE.LIZ("ni", "maliva"), C0OFE.LIZ("nl", "useast2a"), C0OFE.LIZ("no", "useast2a"), C0OFE.LIZ("np", "alisg"), C0OFE.LIZ("nr", "alisg"), C0OFE.LIZ("nu", "alisg"), C0OFE.LIZ("nz", "alisg"), C0OFE.LIZ("om", "alisg"), C0OFE.LIZ("pa", "maliva"), C0OFE.LIZ("pe", "maliva"), C0OFE.LIZ("pf", "alisg"), C0OFE.LIZ("pg", "alisg"), C0OFE.LIZ("ph", "maliva"), C0OFE.LIZ("pk", "maliva"), C0OFE.LIZ("pl", "useast2a"), C0OFE.LIZ("pm", "maliva"), C0OFE.LIZ("pn", "alisg"), C0OFE.LIZ("pr", "useast5"), C0OFE.LIZ("ps", "alisg"), C0OFE.LIZ("pt", "useast2a"), C0OFE.LIZ("pw", "alisg"), C0OFE.LIZ("py", "maliva"), C0OFE.LIZ("qa", "alisg"), C0OFE.LIZ("re", "useast2a"), C0OFE.LIZ("ro", "useast2a"), C0OFE.LIZ("rs", "maliva"), C0OFE.LIZ("ru", "alisg"), C0OFE.LIZ("rw", "maliva"), C0OFE.LIZ("sa", "alisg"), C0OFE.LIZ("sb", "alisg"), C0OFE.LIZ("sc", "maliva"), C0OFE.LIZ("sd", "maliva"), C0OFE.LIZ("se", "useast2a"), C0OFE.LIZ("sg", "alisg"), C0OFE.LIZ("sh", "maliva"), C0OFE.LIZ("si", "useast2a"), C0OFE.LIZ("sj", "maliva"), C0OFE.LIZ("sk", "useast2a"), C0OFE.LIZ("sl", "maliva"), C0OFE.LIZ("sm", "maliva"), C0OFE.LIZ("sn", "maliva"), C0OFE.LIZ("so", "maliva"), C0OFE.LIZ("sr", "maliva"), C0OFE.LIZ("ss", "maliva"), C0OFE.LIZ("st", "alisg"), C0OFE.LIZ("sv", "maliva"), C0OFE.LIZ("sx", "maliva"), C0OFE.LIZ("sy", "alisg"), C0OFE.LIZ("sz", "maliva"), C0OFE.LIZ("tc", "maliva"), C0OFE.LIZ("td", "maliva"), C0OFE.LIZ("tf", "alisg"), C0OFE.LIZ("tg", "maliva"), C0OFE.LIZ("th", "alisg"), C0OFE.LIZ("tj", "alisg"), C0OFE.LIZ("tk", "alisg"), C0OFE.LIZ("tl", "alisg"), C0OFE.LIZ("tm", "alisg"), C0OFE.LIZ("tn", "maliva"), C0OFE.LIZ("to", "alisg"), C0OFE.LIZ("tp", "alisg"), C0OFE.LIZ("tr", "maliva"), C0OFE.LIZ("tt", "maliva"), C0OFE.LIZ("tv", "alisg"), C0OFE.LIZ("tw", "maliva"), C0OFE.LIZ("tz", "maliva"), C0OFE.LIZ("ua", "maliva"), C0OFE.LIZ("ug", "maliva"), C0OFE.LIZ("um", "useast5"), C0OFE.LIZ("us", "useast5"), C0OFE.LIZ("uy", "maliva"), C0OFE.LIZ("uz", "alisg"), C0OFE.LIZ("va", "maliva"), C0OFE.LIZ("vc", "maliva"), C0OFE.LIZ("ve", "maliva"), C0OFE.LIZ("vg", "maliva"), C0OFE.LIZ("vi", "useast5"), C0OFE.LIZ("vn", "alisg"), C0OFE.LIZ("vu", "alisg"), C0OFE.LIZ("wf", "alisg"), C0OFE.LIZ("ws", "alisg"), C0OFE.LIZ("xk", "maliva"), C0OFE.LIZ("ye", "alisg"), C0OFE.LIZ("yt", "useast2a"), C0OFE.LIZ("za", "maliva"), C0OFE.LIZ("zm", "maliva"), C0OFE.LIZ("zw", "maliva"), C0OFE.LIZ("unknown", "alisg"), C0OFE.LIZ("fake-ad", "alisg"), C0OFE.LIZ("fake-passport", "alisg"));
        LIZIZ = mapLJIIIIZZ2;
        List listLJIIJJI = C1697810uHb.LJIIJJI("api16-normal-c-alisg.tiktokv.com", "api16-normal-useast5.tiktokv.us", "api16-normal-no1a.tiktokv.eu");
        List listLJIIJJI2 = C1697810uHb.LJIIJJI("api16-normal-c-alisg.tiktokv.com", "api16-normal-useast5.tiktokv.us");
        List listLJIIJJI3 = C1697810uHb.LJIIJJI("/user/mobile/send_code/", "/user/mobile/send_code/v1/", "/passport/mobile/send_code/", "/passport/mobile/send_code/v1/", "/passport/mobile/send_voice_code/");
        List listLJIIJJI4 = C1697810uHb.LJIIJJI(8, 9, 10, 11, 12, 13, 14, 15, 20, 21, 22, 23, 26, 42);
        List listSingletonList = Collections.singletonList("/passport/email/send_code/");
        List listLJIIJJI5 = C1697810uHb.LJIIJJI(6, 7, 8, 11);
        List listLJIIJJI6 = C1697810uHb.LJIIJJI("/passport/org/account/permission/role/invite/send/", "/passport/app/region/", "/passport/app/region_alert/", "/passport/app/auth_broadcast/", "/passport/account/info/v2/", "/passport/token/beat/v2/", "/passport/account/set/", "/passport/web/account/set/", "/passport/password/change/", "/passport/web/password/change/", "/user/mobile/change_password/", "/open/api/user/mobile/change_password/", "/user/mobile/change_password/v1/", "/passport/web/email/change_password/", "/passport/email/change_password/", "/passport/account/set/", "/passport/web/account/set/", "/passport/password/set/", "/passport/password/set_by_verify_ticket/", "/passport/web/password_set/", "/passport/password/update/", "/passport/web/password/update/", "/passport/mobile/authorize/", "/passport/email/bind_email_for_device_login/", "/passport/email/bind_without_verify/", "/passport/mobile/bind/v1/", "/passport/web/mobile/bind/", "/user/mobile/bind_mobile/", "/open/api/user/mobile/bind_mobile/", "/user/mobile/lbind_mobile/v1/", "/passport/mobile/bind_with_change_password/", "/passport/web/mobile/bind_with_2sv/", "/passport/account/authorize/", "/passport/web/account/authorzie/", "/passport/account/verify/", "/passport/web/account/verify/", "/passport/auth/get_nonce/", "/passport/mobile/authorize/", "/passport/mobile/bind/v1/", "/passport/web/mobile/bind/", "/user/mobile/bind_mobile/", "/user/mobile/bind_mobile/v1/", "/open/api/user/mobile/bind_mobile/", "/user/mobile/bind_mobile/v1/", "/passport/mobile/bind_with_change_password/", "/passport/web/mobile/bind_with_2sv/", "/passport/account/authorize/", "/passport/web/account/authorzie/", "/passport/account/verify/", "/passport/web/account/verify/", "/passport/user/change_mobile/submit_mobile/", "/passport/mobile/change/", "/passport/mobile/change/v1/", "/user/mobile/change_mobile/", "/passport/web/mobile/change/", "/passport/safe/get_user_worth/", "/passport/mobile/check_unusable/", "/passport/mobile/bind_for_connect/", "/passport/mobile/conditional_bind_login/", "/passport/email/bind_email_for_device_login/", "/passport/email/bind_without_verify/", "/passport/account/authorize/", "/passport/web/account/authorzie/", "/passport/account/verify/", "/passport/web/account/verify/", "/passport/email/bind/", "/passport/web/email/bind/", "/passport/email/bind_and_verify/", "/passport/email/bind_with_change_password/", "/passport/email/bind_with_set_password/", "/passport/web/email/bind_with_2sv/", "/passport/email/change/", "/passport/web/email/change/", "/passport/email/change_with_update_password/", "/passport/shark/safe_verify/", "/passport/user/device_record_status/set/", "/passport/auth/available_ways/", "/passport/password/has_set/", "/passport/safe/two_step_verification/get_verification_list/", "/passport/user/fetch_oauth_info/", "/passport/mobile/unbind_validate/", "/passport/device/trust_users/", "/passport/safe/two_step_verification/add_auth_device/", "/passport/user/device_record_status/get/", "/passport/email/unbind_validate/", "/passport/safe/login_device/list/", "/passport/user/logout/", "/passport/account/verify/", "/passport/login_name/update/", "/passport/password/check/", "/passport/password/forced_reset_by_email_ticket/", "/passport/cancel/do/", "/passport/safe/two_step_verification/add_verification/", "/passport/shark/safe_verify/verification_manage/", "/passport/safe/login_device/del/", "/passport/account/verify/", "/passport/email/verify/", "/passport/cancel/post/", "/passport/shark/safe_verify/", "/passport/shark/safe_verify/v2/", "/passport/mobile/validate_code/", "/passport/mobile/validate_code/v1/", "/passport/deactivation/post/", "/passport/deactivation/do/", "/passport/safe/login_device/list/v2/", "/passport/safe/login_device/list/", "/passport/user/device_record_status/set/", "/passport/safe/two_step_verification/get_auth_device_list/", "/passport/safe/two_step_verification/add_auth_device/", "/passport/safe/two_step_verification/remove_all/", "/passport/safe/two_step_verification/remove_auth_device/", "/passport/safe/two_step_verification/remove_verification/", "/passport/password/set/", "/passport/shark/safe_verify/verification_manage/", "/passport/user/appeal_ticket/", "/passport/mobile/unbind/", "/passport/email/unbind/", "/passport/auth/bind/", "/passport/auth/get_token/", "/passport/gec/tiktok/login/", "/passport/cloud_token/enable/", "/passport/cloud_token/disable/", "/passport/safe/api/user/unusual_info_preview/", "/passport/safe/recommend_device/list/", "/passport/totp/register/", "/passport/totp/status/", "/passport/totp/recover/", "/passport/totp/verify/", "/passport/reauth_settings/state/", "/passport/reauth_settings/default/change/", "/passport/reauth_settings/change/", "/passport/reauth_settings/set/", "/passport/web/account/info/");
        Boolean bool = Boolean.FALSE;
        LIZJ = new TTPSettingsObject(false, listLJIIJJI, listLJIIJJI2, listLJIIJJI3, listLJIIJJI4, listSingletonList, listLJIIJJI5, listLJIIJJI6, 3, bool, mapLJIIIIZZ2, mapLJIIIIZZ, C1697810uHb.LJIIJJI("com.ss.android.ugc.aweme.account.network.IAccountNetworkApi", "com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$Api", "com.ss.android.ugc.aweme.account.login.trustedfriends.TrustedFriendsApi$Api", "com.ss.android.ugc.aweme.account.login.v2.network.UserBasicInfoApi$Api", "com.ss.android.ugc.aweme.account.api.AccountApiInModule$Api", "com.ss.android.ugc.aweme.account.login.v2.network.GSMAApi$Api"), bool);
    }

    public TTPSettingsObject(boolean z, List<String> list, List<String> list2, List<String> list3, List<Integer> list4, List<String> list5, List<Integer> list6, List<String> list7, Integer num, Boolean bool, Map<String, String> map, Map<String, TTPDomain> map2, List<String> list8, Boolean bool2) {
        this.disabled = z;
        this.auth_broadcast_domains = list;
        this.domains = list2;
        this.mobile_send_code_paths = list3;
        this.exclude_sms_code_type = list4;
        this.email_send_code_paths = list5;
        this.exclude_email_code_type = list6;
        this.exclude_paths = list7;
        this.maxRetryCount = num;
        this.disableRegionOpt = bool;
        this.regionToVDC = map;
        this.vdcToDomain = map2;
        this.validInvocationList = list8;
        this.disableRegionOptDR = bool2;
    }
}
