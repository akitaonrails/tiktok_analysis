package com.ss.android.ugc.aweme.audio.copyrightdetect;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class PostSettingEntryType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ PostSettingEntryType[] $VALUES;
    public final int value;
    public static final PostSettingEntryType UNKNOWN = new PostSettingEntryType("UNKNOWN", 0, 0);
    public static final PostSettingEntryType PR_CHECK_MUSIC = new PostSettingEntryType("PR_CHECK_MUSIC", 1, 1);
    public static final PostSettingEntryType ENABLE_AUTO_STRIP = new PostSettingEntryType("ENABLE_AUTO_STRIP", 2, 2);

    public static final /* synthetic */ PostSettingEntryType[] $values() {
        return new PostSettingEntryType[]{UNKNOWN, PR_CHECK_MUSIC, ENABLE_AUTO_STRIP};
    }

    public static InterfaceC2044707zh<PostSettingEntryType> getEntries() {
        return $ENTRIES;
    }

    static {
        PostSettingEntryType[] postSettingEntryTypeArr$values = $values();
        $VALUES = postSettingEntryTypeArr$values;
        $ENTRIES = new C2254308sP(postSettingEntryTypeArr$values);
    }

    public static PostSettingEntryType[] values() {
        return (PostSettingEntryType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static PostSettingEntryType valueOf(String str) {
        return (PostSettingEntryType) C08FF.LIZ(PostSettingEntryType.class, str);
    }

    public PostSettingEntryType(String str, int i, int i2) {
        this.value = i2;
    }
}
