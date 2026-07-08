package com.ss.android.ugc.aweme.settings;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class DeviceZtiConfig {
    public static final List<String> LIZ = C1697810uHb.LJIILJJIL("/passport/token/beat/v2/", "/passport/shark/safe_verify/verification_manage/", "/passport/shark/safe_verify/v2/", "/passport/password/reset_by_ticket/", "/passport/email/change/", "/passport/password/reset_by_email_ticket/", "/passport/mobile/change/v1/", "/passport/password/reset/", "/passport/security_checkup/info/", "/passport/security_checkup/report_items/", "/passport/shark/safe_verify/", "/passport/account_lookup/device/", "/passport/auth/available_ways/", "/passport/user/login_by_passport_ticket/", "/passport/account_lookup/username/", "/passport/account_lookup/email/", "/passport/account_lookup/mobile/", "/passport/aaas/authenticate/", "/passport/account/switch/v2/", "/passport/account_lookup/device/", "/passport/auth/available_ways/", "/passport/cloud_token/login/", "/passport/email/change_password/", "/passport/email/password/reset_and_login/", "/passport/mobile/mobile_reused_login/", "/passport/mobile/origin_mobile_login/", "/passport/password/forced_reset_by_email_ticket/", "/passport/password/forced_reset_by_mobile_ticket/", "/passport/password/reset/", "/passport/password/reset_by_email_ticket/", "/passport/password/reset_by_ticket/", "/passport/pin/reset_by_ticket", "/passport/pin/verify", "/passport/recall/bind_ticket_login/", "/passport/safe/login_device/parent_control_del/", "/passport/security_checkup/info/", "/passport/security_checkup/report_items/", "/passport/shark/safe_verify/v2/", "/passport/user/login/", "/passport/user/login_by_verify_ticket/", "/aweme/v1/aweme/stats/");
    public static final List<Integer> LIZIZ = C1697810uHb.LJIILJJIL(1003, 1103, 1202, 1203, 1204, 1005);
    public static final List<String> LIZJ = C1697810uHb.LJIILJJIL("/passport/");
    public static final List<String> LIZLLL = C1697810uHb.LJIILJJIL("/passport/popup/configuration/");

    @C09CT("need_dtoken_paths_config_version")
    public int configVersion;

    @C09CT("use_cached_device_properties")
    public boolean useCachedDeviceProperties;

    @C09CT("enable_zti")
    public boolean ebableZti = true;

    @C09CT("enable_event_track")
    public boolean enableEventTrack = true;

    @C09CT("enable_reset_did")
    public boolean enableResetDid = true;

    @C09CT("need_dtoken_paths")
    public List<String> dtokenPath = LIZ;

    @C09CT("need_dtoken_path_prefixes")
    public List<String> dtokenPathPrefixs = LIZJ;

    @C09CT("exclude_dtoken_paths")
    public List<String> excludeDtokenPaths = LIZLLL;

    @C09CT("retry_error_codes")
    public List<Integer> retryErrorCodes = LIZIZ;

    @C09CT("retry_rest_seconds")
    public long retryRestSeconds = 600;
}
