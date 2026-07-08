package com.bytedance.effectcreatormobile.infrastructure.network.model;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class BaseResponse {
    public static final int $stable = 8;
    public final int error_code;
    public final ServerTimeExtra extra;
    public final Map<String, String> extraMap;
    public final String message;
    public final String prompts;
    public final int status_code;
    public final String status_msg;

    public BaseResponse() {
        this(-1, -1, null, null, null, null, null);
    }

    public final int getError_code() {
        return this.error_code;
    }

    public final ServerTimeExtra getExtra() {
        return this.extra;
    }

    public final Map<String, String> getExtraMap() {
        return this.extraMap;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getPrompts() {
        return this.prompts;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_msg() {
        return this.status_msg;
    }

    public BaseResponse(int i, int i2, String str, String str2, String str3, ServerTimeExtra serverTimeExtra, Map<String, String> map) {
        this.status_code = i;
        this.error_code = i2;
        this.message = str;
        this.status_msg = str2;
        this.prompts = str3;
        this.extra = serverTimeExtra;
        this.extraMap = map;
    }
}
