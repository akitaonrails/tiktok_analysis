package com.ss.android.account.leak;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class LoginAssuranceObject {
    public static final LoginAssuranceObject LIZ = new LoginAssuranceObject(C1697810uHb.LJIIJJI("/passport/app/region/", "/passport/app/region_alert/", "/passport/app/auth_broadcast/"), C1697810uHb.LJIIJJI("User-Agent", "Rpc-Persist-Agw-Ug-Country-New", "Sdk-Version", "X-Vc-Bdturing-Sdk-Version", "Tt-Request-Time", "tt-ticket-guard-iteration-version", "tt-ticket-guard-public-key", "tt-ticket-guard-version", "tt-ticket-guard-server-data", "tt-ticket-guard-client-data", "tt-device-guard-client-data", "tt-device-guard-iteration-version", "X-Ss-Req-Ticket", "Traceparent", "X-Use-Ppe", "X-Tt-Env", "X-Ladon", "X-Khronos", "X-Argus", "X-Gorgon", "Accept-Encoding", "X-Tt-Trace-Id", "X-Tt-Request-Tag", "X-Tt-Bypass-Dp", "X-Tt-Dm-Status", "X-Tt-Passport-Csrf-Token", "Passport-Sdk-Version", "X-Ss-Stub", "X-Bd-Kmsv", "X-Wltc-Token", "x-tts-test"), C1697810uHb.LJIIJJI("device_id", "aid", "iid", "reg_store_region", "support_webview", "app_id", "app_name", "ttnet_version", "sys_region", "use_store_region_cookie", "carrier_region", "version_code", "version_name", "channel", "device_platform"), C1697810uHb.LJIIJJI("passport_csrf_token", "cmpl_token", "reg-store-region", "tt-target-idc-sign", "store-country-code-src", "tt-target-idc", "store-country-code", "passport_csrf_token_default"), 0);

    @C09CT("cookies")
    public final List<String> cookies;

    @C09CT("headers")
    public final List<String> headers;

    @C09CT("paths")
    public final List<String> paths;

    @C09CT("queries")
    public final List<String> queries;

    @C09CT("version")
    public final int version;

    public LoginAssuranceObject(List<String> list, List<String> list2, List<String> list3, List<String> list4, int i) {
        this.paths = list;
        this.headers = list2;
        this.queries = list3;
        this.cookies = list4;
        this.version = i;
    }
}
