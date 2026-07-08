package com.ss.android.ugc.aweme.compliance.common.enums;

import X.C08FF;
import X.C0X1E;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class ConfigTypeEnum {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ ConfigTypeEnum[] $VALUES;
    public static final C0X1E Companion;
    public final String type;
    public static final ConfigTypeEnum API_DENY = new ConfigTypeEnum("API_DENY", 0, "api:deny");
    public static final ConfigTypeEnum API_ALLOW = new ConfigTypeEnum("API_ALLOW", 1, "api:allow");
    public static final ConfigTypeEnum PARAM_REMOVE = new ConfigTypeEnum("PARAM_REMOVE", 2, "param:remove");
    public static final ConfigTypeEnum PARAM_ALLOW = new ConfigTypeEnum("PARAM_ALLOW", 3, "param:allow");
    public static final ConfigTypeEnum PARAM_REPLACE = new ConfigTypeEnum("PARAM_REPLACE", 4, "param:replace");

    public static final /* synthetic */ ConfigTypeEnum[] $values() {
        return new ConfigTypeEnum[]{API_DENY, API_ALLOW, PARAM_REMOVE, PARAM_ALLOW, PARAM_REPLACE};
    }

    public static InterfaceC2044707zh<ConfigTypeEnum> getEntries() {
        return $ENTRIES;
    }

    static {
        ConfigTypeEnum[] configTypeEnumArr$values = $values();
        $VALUES = configTypeEnumArr$values;
        $ENTRIES = new C2254308sP(configTypeEnumArr$values);
        Companion = new C0X1E();
    }

    public static ConfigTypeEnum[] values() {
        return (ConfigTypeEnum[]) $VALUES.clone();
    }

    public final String getType() {
        return this.type;
    }

    public static ConfigTypeEnum valueOf(String str) {
        return (ConfigTypeEnum) C08FF.LIZ(ConfigTypeEnum.class, str);
    }

    public ConfigTypeEnum(String str, int i, String str2) {
        this.type = str2;
    }
}
