package com.ss.android.ugc.aweme.services.edit;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class StripMusicPostType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ StripMusicPostType[] $VALUES;
    public final String value;

    @C09CT("post_from_add_sound")
    public static final StripMusicPostType POST_FROM_ADD_SOUND = new StripMusicPostType("POST_FROM_ADD_SOUND", 0, "post_from_add_sound");

    @C09CT("post_with_preview")
    public static final StripMusicPostType POST_WITH_PREVIEW = new StripMusicPostType("POST_WITH_PREVIEW", 1, "post_with_preview");

    @C09CT("post_from_replace_with_strip")
    public static final StripMusicPostType POST_FROM_REPLACE_WITH_STRIP = new StripMusicPostType("POST_FROM_REPLACE_WITH_STRIP", 2, "post_from_replace_with_strip");

    public static final /* synthetic */ StripMusicPostType[] $values() {
        return new StripMusicPostType[]{POST_FROM_ADD_SOUND, POST_WITH_PREVIEW, POST_FROM_REPLACE_WITH_STRIP};
    }

    public static InterfaceC2044707zh<StripMusicPostType> getEntries() {
        return $ENTRIES;
    }

    static {
        StripMusicPostType[] stripMusicPostTypeArr$values = $values();
        $VALUES = stripMusicPostTypeArr$values;
        $ENTRIES = new C2254308sP(stripMusicPostTypeArr$values);
    }

    public static StripMusicPostType[] values() {
        return (StripMusicPostType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public static StripMusicPostType valueOf(String str) {
        return (StripMusicPostType) C08FF.LIZ(StripMusicPostType.class, str);
    }

    public StripMusicPostType(String str, int i, String str2) {
        this.value = str2;
    }
}
