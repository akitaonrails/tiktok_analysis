package com.ss.android.ugc.aweme.legoImp;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class ElfAndSymbolConfig {
    public static final int $stable = 8;

    @C09CT("elf_name")
    public String elfName;

    @C09CT("symbol_name")
    public String symbolName;

    public ElfAndSymbolConfig() {
        this("", "");
    }

    public final void setElfName(String str) {
        this.elfName = str;
    }

    public final void setSymbolName(String str) {
        this.symbolName = str;
    }

    public ElfAndSymbolConfig(String str, String str2) {
        this.elfName = str;
        this.symbolName = str2;
    }
}
