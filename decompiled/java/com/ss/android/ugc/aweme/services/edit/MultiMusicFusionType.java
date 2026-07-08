package com.ss.android.ugc.aweme.services.edit;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class MultiMusicFusionType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ MultiMusicFusionType[] $VALUES;
    public final int value;
    public static final MultiMusicFusionType MULTI_MUSIC_FUSION_TYPE_UNKNOWN = new MultiMusicFusionType("MULTI_MUSIC_FUSION_TYPE_UNKNOWN", 0, 0);
    public static final MultiMusicFusionType MULTI_MUSIC_FUSION_TYPE_SMART_STITCH = new MultiMusicFusionType("MULTI_MUSIC_FUSION_TYPE_SMART_STITCH", 1, 1);
    public static final MultiMusicFusionType MULTI_MUSIC_FUSION_TYPE_EDITOR_PRO = new MultiMusicFusionType("MULTI_MUSIC_FUSION_TYPE_EDITOR_PRO", 2, 2);

    public static final /* synthetic */ MultiMusicFusionType[] $values() {
        return new MultiMusicFusionType[]{MULTI_MUSIC_FUSION_TYPE_UNKNOWN, MULTI_MUSIC_FUSION_TYPE_SMART_STITCH, MULTI_MUSIC_FUSION_TYPE_EDITOR_PRO};
    }

    public static InterfaceC2044707zh<MultiMusicFusionType> getEntries() {
        return $ENTRIES;
    }

    static {
        MultiMusicFusionType[] multiMusicFusionTypeArr$values = $values();
        $VALUES = multiMusicFusionTypeArr$values;
        $ENTRIES = new C2254308sP(multiMusicFusionTypeArr$values);
    }

    public static MultiMusicFusionType[] values() {
        return (MultiMusicFusionType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static MultiMusicFusionType valueOf(String str) {
        return (MultiMusicFusionType) C08FF.LIZ(MultiMusicFusionType.class, str);
    }

    public MultiMusicFusionType(String str, int i, int i2) {
        this.value = i2;
    }
}
