package com.bytedance.pitaya.api.bean;

import X.C08FF;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;

/* JADX INFO: loaded from: classes28.dex */
public enum PTYErrorCode implements ReflectionCall {
    SUCCESS(0),
    INIT(1),
    PACKAGE_NOT_FOUND(2),
    PACKAGE_NOT_READY(3),
    PACKAGE_BREAK(4),
    UNKNOWN(50),
    UNSUPPORT_TASK_TYPE(100),
    INVALID_INPUT(101),
    INVALID_OUTPUT(102),
    APP_VERSON(200),
    OS_VERSON(201),
    ENGINE_UNSUPPORT(210),
    ENGINE_VERSION(211),
    PY_VERSON(220),
    PY_FOUNDATION_VERSION(221),
    PY_BRIDGE_VERSION(222),
    PY_BYTEAI_VERSION(223),
    PY_LIBRARY_VERSION(224),
    RESOURCE_VERSION(230),
    MINPY_VERSION(240),
    CEP_VERSION(260),
    NO_MODEL(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL),
    NO_HANDLER(301),
    NO_FOUNDATION(302),
    NO_BRIDGE(303),
    NO_BYTEAI(304),
    NO_LIBRARY(305),
    NO_ENGINE(306),
    INVALID_DATA(310),
    NETWORK_ERROR(400),
    SERVER_ERROR(401),
    FILE_ERROR(402),
    MD5_ERROR(403),
    UNZIP_ERROR(404),
    PRIORITY_ERROR(405),
    OFFLINE(406),
    WIFI_ONLY(407),
    TASK_INIT_ERROR(500),
    TASK_LOAD_ERROR(501),
    TASK_RUN_ERROR(502),
    TASK_EXIT_ERROR(503),
    TASK_WATCHDOG(504),
    FEATURE_OPEN_ERROR(600),
    FEATURE_UPGRADE_ERROR(601),
    PITAYA_IMPL_NOT_READY(OppoPermissionPopupMaskDelayExp.DEFAULT),
    SUB_MODULE_SO_ERROR(701),
    SUB_MODULE_OTHER_ERROR(702),
    ARTSOTER_IMPL_NOT_READY(703),
    STORAGE_CLEAN(704),
    ANDROID_CTX_NULL(705),
    CEP_EXECUTE_ERROR(900);

    public final int code;

    public static PTYErrorCode valueOf(String str) {
        return (PTYErrorCode) C08FF.LIZ(PTYErrorCode.class, str);
    }

    public final int getCode() {
        return this.code;
    }

    PTYErrorCode(int i) {
        this.code = i;
    }
}
