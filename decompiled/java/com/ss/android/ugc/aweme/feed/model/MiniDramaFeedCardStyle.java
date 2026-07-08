package com.ss.android.ugc.aweme.feed.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class MiniDramaFeedCardStyle {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ MiniDramaFeedCardStyle[] $VALUES;
    public final int value;
    public static final MiniDramaFeedCardStyle MINI_DRAMA_FEED_CARD_STYLE_DEFAULT = new MiniDramaFeedCardStyle("MINI_DRAMA_FEED_CARD_STYLE_DEFAULT", 0, 0);
    public static final MiniDramaFeedCardStyle MINI_DRAMA_FEED_CARD_STYLE_LIST = new MiniDramaFeedCardStyle("MINI_DRAMA_FEED_CARD_STYLE_LIST", 1, 1);
    public static final MiniDramaFeedCardStyle MINI_DRAMA_FEED_CARD_STYLE_HIGHLIGHT_VIDEO = new MiniDramaFeedCardStyle("MINI_DRAMA_FEED_CARD_STYLE_HIGHLIGHT_VIDEO", 2, 2);

    public static final /* synthetic */ MiniDramaFeedCardStyle[] $values() {
        return new MiniDramaFeedCardStyle[]{MINI_DRAMA_FEED_CARD_STYLE_DEFAULT, MINI_DRAMA_FEED_CARD_STYLE_LIST, MINI_DRAMA_FEED_CARD_STYLE_HIGHLIGHT_VIDEO};
    }

    public static InterfaceC2044707zh<MiniDramaFeedCardStyle> getEntries() {
        return $ENTRIES;
    }

    static {
        MiniDramaFeedCardStyle[] miniDramaFeedCardStyleArr$values = $values();
        $VALUES = miniDramaFeedCardStyleArr$values;
        $ENTRIES = new C2254308sP(miniDramaFeedCardStyleArr$values);
    }

    public static MiniDramaFeedCardStyle[] values() {
        return (MiniDramaFeedCardStyle[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static MiniDramaFeedCardStyle valueOf(String str) {
        return (MiniDramaFeedCardStyle) C08FF.LIZ(MiniDramaFeedCardStyle.class, str);
    }

    public MiniDramaFeedCardStyle(String str, int i, int i2) {
        this.value = i2;
    }
}
