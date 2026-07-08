package com.ss.android.ugc.aweme.music.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class SearchCardType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ SearchCardType[] $VALUES;
    public static final SearchCardType TYPE_NORMAL = new SearchCardType("TYPE_NORMAL", 0, 1);
    public final int value;

    public static final /* synthetic */ SearchCardType[] $values() {
        return new SearchCardType[]{TYPE_NORMAL};
    }

    public static InterfaceC2044707zh<SearchCardType> getEntries() {
        return $ENTRIES;
    }

    static {
        SearchCardType[] searchCardTypeArr$values = $values();
        $VALUES = searchCardTypeArr$values;
        $ENTRIES = new C2254308sP(searchCardTypeArr$values);
    }

    public static SearchCardType[] values() {
        return (SearchCardType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static SearchCardType valueOf(String str) {
        return (SearchCardType) C08FF.LIZ(SearchCardType.class, str);
    }

    public SearchCardType(String str, int i, int i2) {
        this.value = i2;
    }
}
