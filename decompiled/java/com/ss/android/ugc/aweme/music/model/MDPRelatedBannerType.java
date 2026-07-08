package com.ss.android.ugc.aweme.music.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class MDPRelatedBannerType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ MDPRelatedBannerType[] $VALUES;
    public final int value;
    public static final MDPRelatedBannerType TEMPLATE = new MDPRelatedBannerType("TEMPLATE", 0, 1);
    public static final MDPRelatedBannerType MUSIC_TRENDING_HASHTAG = new MDPRelatedBannerType("MUSIC_TRENDING_HASHTAG", 1, 2);

    public static final /* synthetic */ MDPRelatedBannerType[] $values() {
        return new MDPRelatedBannerType[]{TEMPLATE, MUSIC_TRENDING_HASHTAG};
    }

    public static InterfaceC2044707zh<MDPRelatedBannerType> getEntries() {
        return $ENTRIES;
    }

    static {
        MDPRelatedBannerType[] mDPRelatedBannerTypeArr$values = $values();
        $VALUES = mDPRelatedBannerTypeArr$values;
        $ENTRIES = new C2254308sP(mDPRelatedBannerTypeArr$values);
    }

    public static MDPRelatedBannerType[] values() {
        return (MDPRelatedBannerType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static MDPRelatedBannerType valueOf(String str) {
        return (MDPRelatedBannerType) C08FF.LIZ(MDPRelatedBannerType.class, str);
    }

    public MDPRelatedBannerType(String str, int i, int i2) {
        this.value = i2;
    }
}
