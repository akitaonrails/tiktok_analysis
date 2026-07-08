package com.lynx.textra;

import X.C1321990kVR;

/* JADX INFO: loaded from: classes21.dex */
public class DefaultFontCaps implements PlatformFontCaps {
    @Override // com.lynx.textra.PlatformFontCaps
    public short adjust(short s) {
        return s;
    }

    @Override // com.lynx.textra.PlatformFontCaps
    public final /* synthetic */ short clamp(int i) {
        return C1321990kVR.LIZ(this, i);
    }

    @Override // com.lynx.textra.PlatformFontCaps
    public String defaultFamilyName() {
        return "sans-serif";
    }
}
