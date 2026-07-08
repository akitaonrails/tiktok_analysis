package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes28.dex */
public final class ComponentTypeResult {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ ComponentTypeResult[] $VALUES;
    public final String value;
    public static final ComponentTypeResult NONE = new ComponentTypeResult("NONE", 0, "none");
    public static final ComponentTypeResult SUCCESS = new ComponentTypeResult("SUCCESS", 1, "success");
    public static final ComponentTypeResult SEI = new ComponentTypeResult("SEI", 2, "sei");
    public static final ComponentTypeResult SHOW = new ComponentTypeResult("SHOW", 3, "show");

    public static final /* synthetic */ ComponentTypeResult[] $values() {
        return new ComponentTypeResult[]{NONE, SUCCESS, SEI, SHOW};
    }

    public static InterfaceC2044707zh<ComponentTypeResult> getEntries() {
        return $ENTRIES;
    }

    static {
        ComponentTypeResult[] componentTypeResultArr$values = $values();
        $VALUES = componentTypeResultArr$values;
        $ENTRIES = new C2254308sP(componentTypeResultArr$values);
    }

    public static ComponentTypeResult[] values() {
        return (ComponentTypeResult[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public static ComponentTypeResult valueOf(String str) {
        return (ComponentTypeResult) C08FF.LIZ(ComponentTypeResult.class, str);
    }

    public ComponentTypeResult(String str, int i, String str2) {
        this.value = str2;
    }
}
