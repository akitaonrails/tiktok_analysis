package com.ss.android.ugc.aweme.feed.model.prompt;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class PromptRecTagType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ PromptRecTagType[] $VALUES;
    public final long value;
    public static final PromptRecTagType INTERACTIVE_REC_TAG_TYPE_TRIGGER = new PromptRecTagType("INTERACTIVE_REC_TAG_TYPE_TRIGGER", 0, 1);
    public static final PromptRecTagType INTERACTIVE_REC_TAG_TYPE_RANDOM = new PromptRecTagType("INTERACTIVE_REC_TAG_TYPE_RANDOM", 1, 2);

    public static final /* synthetic */ PromptRecTagType[] $values() {
        return new PromptRecTagType[]{INTERACTIVE_REC_TAG_TYPE_TRIGGER, INTERACTIVE_REC_TAG_TYPE_RANDOM};
    }

    public static InterfaceC2044707zh<PromptRecTagType> getEntries() {
        return $ENTRIES;
    }

    static {
        PromptRecTagType[] promptRecTagTypeArr$values = $values();
        $VALUES = promptRecTagTypeArr$values;
        $ENTRIES = new C2254308sP(promptRecTagTypeArr$values);
    }

    public static PromptRecTagType[] values() {
        return (PromptRecTagType[]) $VALUES.clone();
    }

    public final long getValue() {
        return this.value;
    }

    public static PromptRecTagType valueOf(String str) {
        return (PromptRecTagType) C08FF.LIZ(PromptRecTagType.class, str);
    }

    public PromptRecTagType(String str, int i, long j) {
        this.value = j;
    }
}
