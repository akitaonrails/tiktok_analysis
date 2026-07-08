package com.larus.business.markdown.api.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class CodeStyle {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ CodeStyle[] $VALUES;
    public final String style;
    public static final CodeStyle NORMAL = new CodeStyle("NORMAL", 0, "normal");
    public static final CodeStyle BORDER = new CodeStyle("BORDER", 1, "border");

    public static final /* synthetic */ CodeStyle[] $values() {
        return new CodeStyle[]{NORMAL, BORDER};
    }

    public static InterfaceC2044707zh<CodeStyle> getEntries() {
        return $ENTRIES;
    }

    static {
        CodeStyle[] codeStyleArr$values = $values();
        $VALUES = codeStyleArr$values;
        $ENTRIES = new C2254308sP(codeStyleArr$values);
    }

    public static CodeStyle[] values() {
        return (CodeStyle[]) $VALUES.clone();
    }

    public static CodeStyle valueOf(String str) {
        return (CodeStyle) C08FF.LIZ(CodeStyle.class, str);
    }

    public CodeStyle(String str, int i, String str2) {
        this.style = str2;
    }
}
