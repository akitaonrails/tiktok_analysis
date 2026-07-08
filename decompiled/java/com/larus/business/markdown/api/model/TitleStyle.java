package com.larus.business.markdown.api.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes33.dex */
public final class TitleStyle {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ TitleStyle[] $VALUES;
    public final String style;
    public static final TitleStyle NORMAL = new TitleStyle("NORMAL", 0, "style");
    public static final TitleStyle LARGE = new TitleStyle("LARGE", 1, "large");
    public static final TitleStyle TAKO = new TitleStyle("TAKO", 2, "tako");

    public static final /* synthetic */ TitleStyle[] $values() {
        return new TitleStyle[]{NORMAL, LARGE, TAKO};
    }

    public static InterfaceC2044707zh<TitleStyle> getEntries() {
        return $ENTRIES;
    }

    static {
        TitleStyle[] titleStyleArr$values = $values();
        $VALUES = titleStyleArr$values;
        $ENTRIES = new C2254308sP(titleStyleArr$values);
    }

    public static TitleStyle[] values() {
        return (TitleStyle[]) $VALUES.clone();
    }

    public static TitleStyle valueOf(String str) {
        return (TitleStyle) C08FF.LIZ(TitleStyle.class, str);
    }

    public TitleStyle(String str, int i, String str2) {
        this.style = str2;
    }
}
