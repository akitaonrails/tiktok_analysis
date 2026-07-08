package com.ss.android.ugc.effectmanager.effect.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class CategoryType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ CategoryType[] $VALUES;
    public static final CategoryType EFFECTS = new CategoryType("EFFECTS", 0, "effects");
    public final String value;

    public static final /* synthetic */ CategoryType[] $values() {
        return new CategoryType[]{EFFECTS};
    }

    public static InterfaceC2044707zh<CategoryType> getEntries() {
        return $ENTRIES;
    }

    static {
        CategoryType[] categoryTypeArr$values = $values();
        $VALUES = categoryTypeArr$values;
        $ENTRIES = new C2254308sP(categoryTypeArr$values);
    }

    public static CategoryType[] values() {
        return (CategoryType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public static CategoryType valueOf(String str) {
        return (CategoryType) C08FF.LIZ(CategoryType.class, str);
    }

    public CategoryType(String str, int i, String str2) {
        this.value = str2;
    }
}
