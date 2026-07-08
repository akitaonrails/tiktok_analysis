package com.orbu.core.config;

import X.C09CT;
import X.C13BV;
import X.C1697810uHb;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class AgConfig {

    @C09CT("ag")
    public final NetConfig ag;

    @C09CT("ag_special")
    public final List<NetConfig> agSpecial;

    @C09CT("boot")
    public final NetConfig boot;

    public AgConfig() {
        this(null, null, null, 7, null);
    }

    public AgConfig(NetConfig netConfig, NetConfig netConfig2, List<NetConfig> list) {
        this.boot = netConfig;
        this.ag = netConfig2;
        this.agSpecial = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AgConfig(NetConfig netConfig, NetConfig netConfig2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        List listLJIIJJI = list;
        NetConfig netConfig3 = netConfig2;
        NetConfig netConfig4 = (i & 1) != 0 ? new NetConfig(C1697810uHb.LJIIJJI("search16-normal-c-useast1a.tiktokv.com", "webcast16-ws-useast1a.tiktokv.com", "hotapi16-normal-useast1a.tiktokv.com", "hotapi16-normal-alisg.tiktokv.com", "-boot.tiktokv.com"), C13BV.INSTANCE, "738197504") : netConfig;
        netConfig3 = (i & 2) != 0 ? new NetConfig(C1697810uHb.LJIIJJI("adsintegrity.us", "affiliate-us.tiktok.com", "seller-us.tiktok.com", "tiktokcdn-us.com", "tiktokv.us", "tiktokw.us", "us.tiktok.com", "us.tiktokapis.com", "us.tiktokv.com", "www.tiktoklinksafety.us", ".adsintegrity.us", ".tiktokcdn-us.com", ".ttcdn-us.com", ".tiktokshops.us", ".tiktokglobalshop.us", ".tiktokv.us", ".tiktokv-us.com", ".tiktokw.us", ".us.tiktok.com", ".us.tiktokapis.com", ".us.tiktokv.com", ".tiktokminis.us", ".capcutcdn-us.com", ".pipopayment.us", ".tiktokpangle-cdn-us.com"), C13BV.INSTANCE, "671088640") : netConfig3;
        if ((i & 4) != 0) {
            C13BV c13bv = C13BV.INSTANCE;
            listLJIIJJI = C1697810uHb.LJIIJJI(new NetConfig(c13bv, C1697810uHb.LJIIJJI("/passport/oidc/login/", "/passport/oidc/prepare/"), "738198019"), new NetConfig(c13bv, C1697810uHb.LJIIJJI("/passport/app/region/", "/passport/app/region_alert/", "/passport/app/auth_broadcast/"), "738198020"), new NetConfig(c13bv, C1697810uHb.LJIIJJI("/captcha/get", "/captcha/verify", "/captcha/feedback", "/verifycenter/ttcaptcha"), "671154177"), new NetConfig(c13bv, C1697810uHb.LJIIJJI("/tos-alisg-i-749px8mig0-sg", "/tos-maliva-i-b4yrtqhy5a-us", "/tos-useast2a-i-447w7jt563-euttp", "/tos-no1a-i-6wrll1mm2s-no"), "671154178"), new NetConfig(c13bv, C1697810uHb.LJIIJJI("/obj/captcha-dl-sgp", "/obj/captcha-dl-usa-us", "/obj/captcha-dl-euttp", "/obj/captcha-dl-no"), "671154179"), new NetConfig(c13bv, C1697810uHb.LJIIJJI("/passport/aaas/authenticate/", "/passport/aaas/verify/"), "671154180"), new NetConfig(c13bv, C1697810uHb.LJIIJJI("/passport/account/switch/", "/passport/account/switch/v2/"), "671154181"), new NetConfig(c13bv, Collections.singletonList("/passport/account_lookup/device/"), "671154182"), new NetConfig(c13bv, C1697810uHb.LJIIJJI("/passport/find_account/instagram/index/", "/passport/account/verify/"), "671154183"), new NetConfig(c13bv, C1697810uHb.LJIIJJI("/passport/account_lookup/username/", "/passport/email/send_code/", "/passport/user/check_email_registered", "/passport/email/check_code/", "/passport/email/register_verify_login/", "/passport/email/register/v2/", "/passport/app/email/code_login/", "/passport/email/bind/", "/passport/email/change/", "/passport/email/verify/", "/passport/email/bind_with_change_password/", "/passport/email/change_password/", "/passport/web/email/bind/", "/passport/web/email/send_code/", "/passport/web/email/check_code/"), "671154184"), new NetConfig(c13bv, C1697810uHb.LJIIJJI("/passport/account_lookup/mobile/", "/passport/app/store_region/", "/passport/app/region/register_region_list/"), "671154185"), new NetConfig(c13bv, C1697810uHb.LJIIJJI("/passport/account_lookup/email/", "/passport/auth/login_only/", "/passport/auth/only_login", "/passport/auth/get_nonce/", "/passport/auth/login/", "/passport/user/fetch_oauth_info/", "/passport/auth/get_token"), "671154186"), new NetConfig(c13bv, C1697810uHb.LJIIJJI("/passport/account_lookup/cloud/", "/passport/cloud_token/login/", "/passport/device/trust_users/", "/passport/device/one_login/"), "671154187"), new NetConfig(c13bv, C1697810uHb.LJIIJJI("/passport/employee/account/switch/", "/passport/employee/account/create/"), "671154188"), new NetConfig(c13bv, C1697810uHb.LJIIJJI("/passport/fido2/begin_discoverable_user_login/", "/passport/fido2/begin_user_registration/", "/passport/fido2/finish_discoverable_user_login", "/passport/fido2/finish_user_registration/"), "671154189"), new NetConfig(c13bv, C1697810uHb.LJIIJJI("/passport/mobile/send_code/v1/", "/passport/mobile/can_send_voice_code/", "/passport/mobile/check_code/", "/passport/mobile/send_voice_code/", "/passport/mobile/sms_login_continue/", "/passport/mobile/sms_login_only", "/passport/mobile/bind/v1/", "/passport/mobile/change/v1/", "/passport/mobile/bind_with_change_password/", "/passport/mobile/validate_code/v1", "/passport/web/send_code/", "/passport/web/mobile/bind/"), "671154190"), new NetConfig(c13bv, C1697810uHb.LJIIJJI("/passport/user/login/", "/passport/username/register/", "/passport/login_name/check/", "/passport/login_name/register/", "/passport/user/login/pre_check/", "/passport/user/check_ticket_status/", "/passport/user/login_by_passport_ticket/"), "671154191"), new NetConfig(c13bv, C1697810uHb.LJIIJJI("/passport/password/reset_by_ticket/", "/passport/password/reset_by_email_ticket", "/passport/password/has_set", "/passport/password/set", "/passport/password/check/"), "671154192"), new NetConfig(c13bv, C1697810uHb.LJIIJJI("/passport/auth/available_ways/", "/passport/safe/two_step_verification/get_verification_list/", "/passport/shark/safe_verify/verification_manage/", "/passport/shark/safe_verify", "/passport/safe/two_step_verification/add_verification/", "/passport/safe/two_step_verification/add_auth_device"), "671154193"), new NetConfig(c13bv, C1697810uHb.LJIIJJI("/passport/totp/bind_verify/", "/passport/totp/verify_without_login"), "671154194"), new NetConfig(c13bv, Collections.singletonList("/passport/mobile/check_qrconnect/"), "671154195"), new NetConfig(c13bv, Collections.singletonList("/passport/sso/login/callback/"), "671154196"), new NetConfig(c13bv, C1697810uHb.LJIIJJI("/service/2/device_register", "/service/2/app_alert_check"), "671154197"), new NetConfig(C1697810uHb.LJIIJJI("image-va.tiktokv.com", "image-sg.tiktokv.com", "p0-pu-image-no.tiktokv.com", "image-useast2a.tiktokv.com", "p0-common-image-private-useastred.tiktokv.eu", "image-va.tiktok.com", "image-sg.tiktok.com", "p0-pu-image-no.tiktok.com", "image-useast2a.tiktok.com", "p0-common-image-private-useastred.eu.tiktok.com"), c13bv, "671154198"), new NetConfig(c13bv, C1697810uHb.LJIIJJI("/passport/auth/m2/login_and_bind_oauth/", "/passport/m2/ticket_login_and_bind_oauth/", "/passport/web/m2/ticket_login_and_bind_oauth/", "/passport/oidc/multi_login/"), "671154199"), new NetConfig(c13bv, C1697810uHb.LJIIJJI("/passport/org/account/permission/role/invite/send_code/", "/passport/org/account/permission/role/invite/accept/", "/passport/org/account/login_by_passport_ticket/"), "671154200"), new NetConfig(c13bv, C1697810uHb.LJIIJJI("/passport/deactivation/login/", "/passport/cancel/login/"), "671154201"));
        }
        this(netConfig4, netConfig3, listLJIIJJI);
    }
}
