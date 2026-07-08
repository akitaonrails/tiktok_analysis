package com.ss.android.ugc.aweme.feed.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class SeriesCategory {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ SeriesCategory[] $VALUES;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final SeriesCategory DEFAULT = new SeriesCategory(LivePreviewCTASmartDisplayManager.DEFAULT, 0);

    @C09CT("1")
    public static final SeriesCategory MINI_DRAMA = new SeriesCategory("MINI_DRAMA", 1);

    public static final /* synthetic */ SeriesCategory[] $values() {
        return new SeriesCategory[]{DEFAULT, MINI_DRAMA};
    }

    public static InterfaceC2044707zh<SeriesCategory> getEntries() {
        return $ENTRIES;
    }

    static {
        SeriesCategory[] seriesCategoryArr$values = $values();
        $VALUES = seriesCategoryArr$values;
        $ENTRIES = new C2254308sP(seriesCategoryArr$values);
    }

    public static SeriesCategory[] values() {
        return (SeriesCategory[]) $VALUES.clone();
    }

    public static SeriesCategory valueOf(String str) {
        return (SeriesCategory) C08FF.LIZ(SeriesCategory.class, str);
    }

    public SeriesCategory(String str, int i) {
    }
}
