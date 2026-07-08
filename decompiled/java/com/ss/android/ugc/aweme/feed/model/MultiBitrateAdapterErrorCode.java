package com.ss.android.ugc.aweme.feed.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class MultiBitrateAdapterErrorCode {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ MultiBitrateAdapterErrorCode[] $VALUES;
    public final int code;
    public static final MultiBitrateAdapterErrorCode DEFAULT_CODE = new MultiBitrateAdapterErrorCode("DEFAULT_CODE", 0, 0);
    public static final MultiBitrateAdapterErrorCode SETTING_MULTI_BITRATE_CONFIG_ERROR = new MultiBitrateAdapterErrorCode("SETTING_MULTI_BITRATE_CONFIG_ERROR", 1, 100);
    public static final MultiBitrateAdapterErrorCode INTERNET_SPEED_ERROR = new MultiBitrateAdapterErrorCode("INTERNET_SPEED_ERROR", 2, 102);
    public static final MultiBitrateAdapterErrorCode IMAGE_RESOURCE_EMPTY = new MultiBitrateAdapterErrorCode("IMAGE_RESOURCE_EMPTY", 3, 101);
    public static final MultiBitrateAdapterErrorCode IMAGE_RESOURCE_MATCH_ERROR = new MultiBitrateAdapterErrorCode("IMAGE_RESOURCE_MATCH_ERROR", 4, 103);
    public static final MultiBitrateAdapterErrorCode SETTING_DEFAULT_RESOURCE_MATCH_ERROR = new MultiBitrateAdapterErrorCode("SETTING_DEFAULT_RESOURCE_MATCH_ERROR", 5, 104);
    public static final MultiBitrateAdapterErrorCode SETTING_MULTI_BITRATE_CONFIG_MATCH_ERROR = new MultiBitrateAdapterErrorCode("SETTING_MULTI_BITRATE_CONFIG_MATCH_ERROR", 6, 105);

    public static final /* synthetic */ MultiBitrateAdapterErrorCode[] $values() {
        return new MultiBitrateAdapterErrorCode[]{DEFAULT_CODE, SETTING_MULTI_BITRATE_CONFIG_ERROR, INTERNET_SPEED_ERROR, IMAGE_RESOURCE_EMPTY, IMAGE_RESOURCE_MATCH_ERROR, SETTING_DEFAULT_RESOURCE_MATCH_ERROR, SETTING_MULTI_BITRATE_CONFIG_MATCH_ERROR};
    }

    public static InterfaceC2044707zh<MultiBitrateAdapterErrorCode> getEntries() {
        return $ENTRIES;
    }

    static {
        MultiBitrateAdapterErrorCode[] multiBitrateAdapterErrorCodeArr$values = $values();
        $VALUES = multiBitrateAdapterErrorCodeArr$values;
        $ENTRIES = new C2254308sP(multiBitrateAdapterErrorCodeArr$values);
    }

    public static MultiBitrateAdapterErrorCode[] values() {
        return (MultiBitrateAdapterErrorCode[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }

    public static MultiBitrateAdapterErrorCode valueOf(String str) {
        return (MultiBitrateAdapterErrorCode) C08FF.LIZ(MultiBitrateAdapterErrorCode.class, str);
    }

    public MultiBitrateAdapterErrorCode(String str, int i, int i2) {
        this.code = i2;
    }
}
