package com.larus.business.markdown.api.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class CustomSpaceScene {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ CustomSpaceScene[] $VALUES;
    public static final CustomSpaceScene V1 = new CustomSpaceScene("V1", 0);
    public static final CustomSpaceScene V2 = new CustomSpaceScene("V2", 1);

    public static final /* synthetic */ CustomSpaceScene[] $values() {
        return new CustomSpaceScene[]{V1, V2};
    }

    public static InterfaceC2044707zh<CustomSpaceScene> getEntries() {
        return $ENTRIES;
    }

    static {
        CustomSpaceScene[] customSpaceSceneArr$values = $values();
        $VALUES = customSpaceSceneArr$values;
        $ENTRIES = new C2254308sP(customSpaceSceneArr$values);
    }

    public static CustomSpaceScene[] values() {
        return (CustomSpaceScene[]) $VALUES.clone();
    }

    public static CustomSpaceScene valueOf(String str) {
        return (CustomSpaceScene) C08FF.LIZ(CustomSpaceScene.class, str);
    }

    public CustomSpaceScene(String str, int i) {
    }
}
