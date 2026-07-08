package com.ss.android.ugc.aweme.music.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class MDPTemplatePinReasonIcon {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ MDPTemplatePinReasonIcon[] $VALUES;
    public final int value;
    public static final MDPTemplatePinReasonIcon EMPTY_ICON = new MDPTemplatePinReasonIcon("EMPTY_ICON", 0, 0);
    public static final MDPTemplatePinReasonIcon AUTHOR_AVATAR = new MDPTemplatePinReasonIcon("AUTHOR_AVATAR", 1, 1);
    public static final MDPTemplatePinReasonIcon CV_NUMBER = new MDPTemplatePinReasonIcon("CV_NUMBER", 2, 2);
    public static final MDPTemplatePinReasonIcon TREND = new MDPTemplatePinReasonIcon("TREND", 3, 3);

    public static final /* synthetic */ MDPTemplatePinReasonIcon[] $values() {
        return new MDPTemplatePinReasonIcon[]{EMPTY_ICON, AUTHOR_AVATAR, CV_NUMBER, TREND};
    }

    public static InterfaceC2044707zh<MDPTemplatePinReasonIcon> getEntries() {
        return $ENTRIES;
    }

    static {
        MDPTemplatePinReasonIcon[] mDPTemplatePinReasonIconArr$values = $values();
        $VALUES = mDPTemplatePinReasonIconArr$values;
        $ENTRIES = new C2254308sP(mDPTemplatePinReasonIconArr$values);
    }

    public static MDPTemplatePinReasonIcon[] values() {
        return (MDPTemplatePinReasonIcon[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static MDPTemplatePinReasonIcon valueOf(String str) {
        return (MDPTemplatePinReasonIcon) C08FF.LIZ(MDPTemplatePinReasonIcon.class, str);
    }

    public MDPTemplatePinReasonIcon(String str, int i, int i2) {
        this.value = i2;
    }
}
