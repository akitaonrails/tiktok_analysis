package com.ss.android.ugc.aweme.feed.model.prompt;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class PromptDetailActionType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ PromptDetailActionType[] $VALUES;
    public final String prefix;
    public final String value;
    public static final PromptDetailActionType MORE = new PromptDetailActionType("MORE", 0, "more", "More");
    public static final PromptDetailActionType FEWER = new PromptDetailActionType("FEWER", 1, "fewer", "Fewer");

    public static final /* synthetic */ PromptDetailActionType[] $values() {
        return new PromptDetailActionType[]{MORE, FEWER};
    }

    public static InterfaceC2044707zh<PromptDetailActionType> getEntries() {
        return $ENTRIES;
    }

    static {
        PromptDetailActionType[] promptDetailActionTypeArr$values = $values();
        $VALUES = promptDetailActionTypeArr$values;
        $ENTRIES = new C2254308sP(promptDetailActionTypeArr$values);
    }

    public static PromptDetailActionType[] values() {
        return (PromptDetailActionType[]) $VALUES.clone();
    }

    public final String getPrefix() {
        return this.prefix;
    }

    public final String getValue() {
        return this.value;
    }

    public static PromptDetailActionType valueOf(String str) {
        return (PromptDetailActionType) C08FF.LIZ(PromptDetailActionType.class, str);
    }

    public PromptDetailActionType(String str, int i, String str2, String str3) {
        this.value = str2;
        this.prefix = str3;
    }
}
