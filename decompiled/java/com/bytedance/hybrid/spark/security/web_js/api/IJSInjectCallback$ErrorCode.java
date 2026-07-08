package com.bytedance.hybrid.spark.security.web_js.api;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class IJSInjectCallback$ErrorCode {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ IJSInjectCallback$ErrorCode[] $VALUES;
    public final int code;
    public static final IJSInjectCallback$ErrorCode BLOCK_BY_BUSINESS_INTERCEPTOR = new IJSInjectCallback$ErrorCode("BLOCK_BY_BUSINESS_INTERCEPTOR", 0, 1402);
    public static final IJSInjectCallback$ErrorCode ERROR_BLOCK_BY_EMPTY_CONFIG = new IJSInjectCallback$ErrorCode("ERROR_BLOCK_BY_EMPTY_CONFIG", 1, 2411);
    public static final IJSInjectCallback$ErrorCode ERROR_MANUAL_EMPTY_URL = new IJSInjectCallback$ErrorCode("ERROR_MANUAL_EMPTY_URL", 2, 2104);
    public static final IJSInjectCallback$ErrorCode ERROR_MANUAL_EMPTY_GLOBAL_CONFIG = new IJSInjectCallback$ErrorCode("ERROR_MANUAL_EMPTY_GLOBAL_CONFIG", 3, 2101);
    public static final IJSInjectCallback$ErrorCode ERROR_MANUAL_PROVIDER_NAME_NOT_FOUND = new IJSInjectCallback$ErrorCode("ERROR_MANUAL_PROVIDER_NAME_NOT_FOUND", 4, 2108);
    public static final IJSInjectCallback$ErrorCode ERROR_MANUAL_JS_CONFIG_NOT_FOUND = new IJSInjectCallback$ErrorCode("ERROR_MANUAL_JS_CONFIG_NOT_FOUND", 5, 2102);
    public static final IJSInjectCallback$ErrorCode ERROR_MANUAL_JS_CODE_NOT_FOUND = new IJSInjectCallback$ErrorCode("ERROR_MANUAL_JS_CODE_NOT_FOUND", 6, 2103);
    public static final IJSInjectCallback$ErrorCode ERROR_MANUAL_GLOBAL_CONFIG_INTERCEPT_URL = new IJSInjectCallback$ErrorCode("ERROR_MANUAL_GLOBAL_CONFIG_INTERCEPT_URL", 7, 1101);
    public static final IJSInjectCallback$ErrorCode ERROR_MANUAL_JS_PROVIDER_INTERCEPT = new IJSInjectCallback$ErrorCode("ERROR_MANUAL_JS_PROVIDER_INTERCEPT", 8, 1102);
    public static final IJSInjectCallback$ErrorCode ERROR_MANUAL_GLOBAL_INTERCEPT = new IJSInjectCallback$ErrorCode("ERROR_MANUAL_GLOBAL_INTERCEPT", 9, 1103);
    public static final IJSInjectCallback$ErrorCode ERROR_MANUAL_SECURITY_INTERCEPT = new IJSInjectCallback$ErrorCode("ERROR_MANUAL_SECURITY_INTERCEPT", 10, 1104);
    public static final IJSInjectCallback$ErrorCode ERROR_MANUAL_WEBVIEWJSINJECTSDK_NOT_INIT = new IJSInjectCallback$ErrorCode("ERROR_MANUAL_WEBVIEWJSINJECTSDK_NOT_INIT", 11, 3102);
    public static final IJSInjectCallback$ErrorCode ERROR_AUTO_JS_CONFIG_NOT_FOUND = new IJSInjectCallback$ErrorCode("ERROR_AUTO_JS_CONFIG_NOT_FOUND", 12, 2502);
    public static final IJSInjectCallback$ErrorCode ERROR_AUTO_JS_PROVIDER_INTERCEPT = new IJSInjectCallback$ErrorCode("ERROR_AUTO_JS_PROVIDER_INTERCEPT", 13, 1502);
    public static final IJSInjectCallback$ErrorCode ERROR_AUTO_JS_CODE_NOT_FOUND = new IJSInjectCallback$ErrorCode("ERROR_AUTO_JS_CODE_NOT_FOUND", 14, 2503);
    public static final IJSInjectCallback$ErrorCode ERROR_AUTO_GLOBAL_INTERCEPT = new IJSInjectCallback$ErrorCode("ERROR_AUTO_GLOBAL_INTERCEPT", 15, 1503);
    public static final IJSInjectCallback$ErrorCode ERROR_AUTO_SECURITY_INTERCEPT = new IJSInjectCallback$ErrorCode("ERROR_AUTO_SECURITY_INTERCEPT", 16, 1504);
    public static final IJSInjectCallback$ErrorCode ERROR_AUTO_ILLEGAL_URL = new IJSInjectCallback$ErrorCode("ERROR_AUTO_ILLEGAL_URL", 17, 4501);
    public static final IJSInjectCallback$ErrorCode ERROR_AUTO_JS_CONFIG_INTERCEPT = new IJSInjectCallback$ErrorCode("ERROR_AUTO_JS_CONFIG_INTERCEPT", 18, 1505);
    public static final IJSInjectCallback$ErrorCode ERROR_PAGE_STARTED_EMPTY_URL = new IJSInjectCallback$ErrorCode("ERROR_PAGE_STARTED_EMPTY_URL", 19, 2204);
    public static final IJSInjectCallback$ErrorCode ERROR_PAGE_FINISHED_EMPTY_URL = new IJSInjectCallback$ErrorCode("ERROR_PAGE_FINISHED_EMPTY_URL", 20, 2304);
    public static final IJSInjectCallback$ErrorCode ERROR_PAGE_STARTED_EMPTY_GLOBAL_CONFIG = new IJSInjectCallback$ErrorCode("ERROR_PAGE_STARTED_EMPTY_GLOBAL_CONFIG", 21, 2201);
    public static final IJSInjectCallback$ErrorCode ERROR_PAGE_FINISHED_EMPTY_GLOBAL_CONFIG = new IJSInjectCallback$ErrorCode("ERROR_PAGE_FINISHED_EMPTY_GLOBAL_CONFIG", 22, 2301);
    public static final IJSInjectCallback$ErrorCode ERROR_PAGE_STARTED_GLOBAL_CONFIG_INTERCEPT_URL = new IJSInjectCallback$ErrorCode("ERROR_PAGE_STARTED_GLOBAL_CONFIG_INTERCEPT_URL", 23, 1201);
    public static final IJSInjectCallback$ErrorCode ERROR_PAGE_FINISHED_GLOBAL_CONFIG_INTERCEPT_URL = new IJSInjectCallback$ErrorCode("ERROR_PAGE_FINISHED_GLOBAL_CONFIG_INTERCEPT_URL", 24, 1301);
    public static final IJSInjectCallback$ErrorCode ERROR_PAGE_STARTED_WEBVIEWJSINJECTSDK_NOT_INIT = new IJSInjectCallback$ErrorCode("ERROR_PAGE_STARTED_WEBVIEWJSINJECTSDK_NOT_INIT", 25, 3202);
    public static final IJSInjectCallback$ErrorCode ERROR_PAGE_FINISHED_WEBVIEWJSINJECTSDK_NOT_INIT = new IJSInjectCallback$ErrorCode("ERROR_PAGE_FINISHED_WEBVIEWJSINJECTSDK_NOT_INIT", 26, 3302);
    public static final IJSInjectCallback$ErrorCode ERROR_VERY_BEGINNING_EMPTY_URL = new IJSInjectCallback$ErrorCode("ERROR_VERY_BEGINNING_EMPTY_URL", 27, 2404);
    public static final IJSInjectCallback$ErrorCode ERROR_VERY_BEGINNING_EMPTY_INLINE_INJECTOR = new IJSInjectCallback$ErrorCode("ERROR_VERY_BEGINNING_EMPTY_INLINE_INJECTOR", 28, 2405);
    public static final IJSInjectCallback$ErrorCode ERROR_VERY_BEGINNING_NOT_FOUND_INJECTOR = new IJSInjectCallback$ErrorCode("ERROR_VERY_BEGINNING_NOT_FOUND_INJECTOR", 29, 2406);
    public static final IJSInjectCallback$ErrorCode ERROR_VERY_BEGINNING_NOT_FOUND_INJECT_SCRIPT = new IJSInjectCallback$ErrorCode("ERROR_VERY_BEGINNING_NOT_FOUND_INJECT_SCRIPT", 30, 2407);
    public static final IJSInjectCallback$ErrorCode ERROR_VERY_BEGINNING_EMPTY_GLOBAL_CONFIG = new IJSInjectCallback$ErrorCode("ERROR_VERY_BEGINNING_EMPTY_GLOBAL_CONFIG", 31, 2401);
    public static final IJSInjectCallback$ErrorCode ERROR_VERY_BEGINNING_GLOBAL_CONFIG_INTERCEPT_URL = new IJSInjectCallback$ErrorCode("ERROR_VERY_BEGINNING_GLOBAL_CONFIG_INTERCEPT_URL", 32, 1401);
    public static final IJSInjectCallback$ErrorCode ERROR_VERY_BEGINNING_JS_CODE_NOT_FOUND = new IJSInjectCallback$ErrorCode("ERROR_VERY_BEGINNING_JS_CODE_NOT_FOUND", 33, 2403);
    public static final IJSInjectCallback$ErrorCode ERROR_VERY_BEGINNING_GLOBAL_INTERCEPT = new IJSInjectCallback$ErrorCode("ERROR_VERY_BEGINNING_GLOBAL_INTERCEPT", 34, 1403);
    public static final IJSInjectCallback$ErrorCode ERROR_VERY_BEGINNING_SECURITY_INTERCEPT = new IJSInjectCallback$ErrorCode("ERROR_VERY_BEGINNING_SECURITY_INTERCEPT", 35, 1404);
    public static final IJSInjectCallback$ErrorCode ERROR_VERY_BEGINNING_JS_CONFIG_INTERCEPT = new IJSInjectCallback$ErrorCode("ERROR_VERY_BEGINNING_JS_CONFIG_INTERCEPT", 36, 1405);
    public static final IJSInjectCallback$ErrorCode ERROR_VERY_BEGINNING_CSP_INTERCEPT = new IJSInjectCallback$ErrorCode("ERROR_VERY_BEGINNING_CSP_INTERCEPT", 37, 1406);
    public static final IJSInjectCallback$ErrorCode ERROR_VERY_BEGINNING_INLINE_CONFIG_NOT_FOUND = new IJSInjectCallback$ErrorCode("ERROR_VERY_BEGINNING_INLINE_CONFIG_NOT_FOUND", 38, 2409);
    public static final IJSInjectCallback$ErrorCode ERROR_VERY_BEGINNING_FETCH_EMPTY_RESPONSE = new IJSInjectCallback$ErrorCode("ERROR_VERY_BEGINNING_FETCH_EMPTY_RESPONSE", 39, 2410);
    public static final IJSInjectCallback$ErrorCode ERROR_VERY_BEGINNING_WEBVIEWJSINJECTSDK_NOT_INIT = new IJSInjectCallback$ErrorCode("ERROR_VERY_BEGINNING_WEBVIEWJSINJECTSDK_NOT_INIT", 40, 3402);
    public static final IJSInjectCallback$ErrorCode ERROR_VERY_BEGINNING_EXCEPTION_FETCH_RESPONSE = new IJSInjectCallback$ErrorCode("ERROR_VERY_BEGINNING_EXCEPTION_FETCH_RESPONSE", 41, 4406);
    public static final IJSInjectCallback$ErrorCode ERROR_VERY_BEGINNING_REQUEST_NOT_GET = new IJSInjectCallback$ErrorCode("ERROR_VERY_BEGINNING_REQUEST_NOT_GET", 42, 4404);
    public static final IJSInjectCallback$ErrorCode INLINE_MAIN_FRAME_RESOURCE_EMPTY_DATA = new IJSInjectCallback$ErrorCode("INLINE_MAIN_FRAME_RESOURCE_EMPTY_DATA", 43, 4405);
    public static final IJSInjectCallback$ErrorCode ERROR_VERY_BEGINNING_NOT_FOUND_IN_IFRAME_WHITELIST = new IJSInjectCallback$ErrorCode("ERROR_VERY_BEGINNING_NOT_FOUND_IN_IFRAME_WHITELIST", 44, 4402);
    public static final IJSInjectCallback$ErrorCode ERROR_VERY_BEGINNING_URL_NOT_MATCH = new IJSInjectCallback$ErrorCode("ERROR_VERY_BEGINNING_URL_NOT_MATCH", 45, 4407);
    public static final IJSInjectCallback$ErrorCode ERROR_VERY_BEGINNING_INJECT_TIME_ERROR = new IJSInjectCallback$ErrorCode("ERROR_VERY_BEGINNING_INJECT_TIME_ERROR", 46, 4408);
    public static final IJSInjectCallback$ErrorCode ERROR_VERY_BEGINNING_SCRIPT_RESOURCE_INTERCEPT_FAIL = new IJSInjectCallback$ErrorCode("ERROR_VERY_BEGINNING_SCRIPT_RESOURCE_INTERCEPT_FAIL", 47, 4410);

    public static final /* synthetic */ IJSInjectCallback$ErrorCode[] $values() {
        return new IJSInjectCallback$ErrorCode[]{BLOCK_BY_BUSINESS_INTERCEPTOR, ERROR_BLOCK_BY_EMPTY_CONFIG, ERROR_MANUAL_EMPTY_URL, ERROR_MANUAL_EMPTY_GLOBAL_CONFIG, ERROR_MANUAL_PROVIDER_NAME_NOT_FOUND, ERROR_MANUAL_JS_CONFIG_NOT_FOUND, ERROR_MANUAL_JS_CODE_NOT_FOUND, ERROR_MANUAL_GLOBAL_CONFIG_INTERCEPT_URL, ERROR_MANUAL_JS_PROVIDER_INTERCEPT, ERROR_MANUAL_GLOBAL_INTERCEPT, ERROR_MANUAL_SECURITY_INTERCEPT, ERROR_MANUAL_WEBVIEWJSINJECTSDK_NOT_INIT, ERROR_AUTO_JS_CONFIG_NOT_FOUND, ERROR_AUTO_JS_PROVIDER_INTERCEPT, ERROR_AUTO_JS_CODE_NOT_FOUND, ERROR_AUTO_GLOBAL_INTERCEPT, ERROR_AUTO_SECURITY_INTERCEPT, ERROR_AUTO_ILLEGAL_URL, ERROR_AUTO_JS_CONFIG_INTERCEPT, ERROR_PAGE_STARTED_EMPTY_URL, ERROR_PAGE_FINISHED_EMPTY_URL, ERROR_PAGE_STARTED_EMPTY_GLOBAL_CONFIG, ERROR_PAGE_FINISHED_EMPTY_GLOBAL_CONFIG, ERROR_PAGE_STARTED_GLOBAL_CONFIG_INTERCEPT_URL, ERROR_PAGE_FINISHED_GLOBAL_CONFIG_INTERCEPT_URL, ERROR_PAGE_STARTED_WEBVIEWJSINJECTSDK_NOT_INIT, ERROR_PAGE_FINISHED_WEBVIEWJSINJECTSDK_NOT_INIT, ERROR_VERY_BEGINNING_EMPTY_URL, ERROR_VERY_BEGINNING_EMPTY_INLINE_INJECTOR, ERROR_VERY_BEGINNING_NOT_FOUND_INJECTOR, ERROR_VERY_BEGINNING_NOT_FOUND_INJECT_SCRIPT, ERROR_VERY_BEGINNING_EMPTY_GLOBAL_CONFIG, ERROR_VERY_BEGINNING_GLOBAL_CONFIG_INTERCEPT_URL, ERROR_VERY_BEGINNING_JS_CODE_NOT_FOUND, ERROR_VERY_BEGINNING_GLOBAL_INTERCEPT, ERROR_VERY_BEGINNING_SECURITY_INTERCEPT, ERROR_VERY_BEGINNING_JS_CONFIG_INTERCEPT, ERROR_VERY_BEGINNING_CSP_INTERCEPT, ERROR_VERY_BEGINNING_INLINE_CONFIG_NOT_FOUND, ERROR_VERY_BEGINNING_FETCH_EMPTY_RESPONSE, ERROR_VERY_BEGINNING_WEBVIEWJSINJECTSDK_NOT_INIT, ERROR_VERY_BEGINNING_EXCEPTION_FETCH_RESPONSE, ERROR_VERY_BEGINNING_REQUEST_NOT_GET, INLINE_MAIN_FRAME_RESOURCE_EMPTY_DATA, ERROR_VERY_BEGINNING_NOT_FOUND_IN_IFRAME_WHITELIST, ERROR_VERY_BEGINNING_URL_NOT_MATCH, ERROR_VERY_BEGINNING_INJECT_TIME_ERROR, ERROR_VERY_BEGINNING_SCRIPT_RESOURCE_INTERCEPT_FAIL};
    }

    public static InterfaceC2044707zh<IJSInjectCallback$ErrorCode> getEntries() {
        return $ENTRIES;
    }

    static {
        IJSInjectCallback$ErrorCode[] iJSInjectCallback$ErrorCodeArr$values = $values();
        $VALUES = iJSInjectCallback$ErrorCodeArr$values;
        $ENTRIES = new C2254308sP(iJSInjectCallback$ErrorCodeArr$values);
    }

    public static IJSInjectCallback$ErrorCode[] values() {
        return (IJSInjectCallback$ErrorCode[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }

    public static IJSInjectCallback$ErrorCode valueOf(String str) {
        return (IJSInjectCallback$ErrorCode) C08FF.LIZ(IJSInjectCallback$ErrorCode.class, str);
    }

    public IJSInjectCallback$ErrorCode(String str, int i, int i2) {
        this.code = i2;
    }
}
