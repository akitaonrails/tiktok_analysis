package com.ss.android.ugc.aweme.shortvideo.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class PageType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ PageType[] $VALUES;
    public static final PageType TAKE_PHOTO = new PageType("TAKE_PHOTO", 0);
    public static final PageType ALBUM = new PageType("ALBUM", 1);
    public static final PageType PDP = new PageType("PDP", 2);
    public static final PageType USER_GUIDANCE = new PageType("USER_GUIDANCE", 3);
    public static final PageType RECOMMEND = new PageType("RECOMMEND", 4);

    public static final /* synthetic */ PageType[] $values() {
        return new PageType[]{TAKE_PHOTO, ALBUM, PDP, USER_GUIDANCE, RECOMMEND};
    }

    public static InterfaceC2044707zh<PageType> getEntries() {
        return $ENTRIES;
    }

    static {
        PageType[] pageTypeArr$values = $values();
        $VALUES = pageTypeArr$values;
        $ENTRIES = new C2254308sP(pageTypeArr$values);
    }

    public static PageType[] values() {
        return (PageType[]) $VALUES.clone();
    }

    public static PageType valueOf(String str) {
        return (PageType) C08FF.LIZ(PageType.class, str);
    }

    public PageType(String str, int i) {
    }
}
