package com.lynx.textra;

import X.C1321990kVR;

/* JADX INFO: loaded from: classes21.dex */
public class VivoFontCaps implements PlatformFontCaps {
    @Override // com.lynx.textra.PlatformFontCaps
    public final /* synthetic */ short clamp(int i) {
        return C1321990kVR.LIZ(this, i);
    }

    @Override // com.lynx.textra.PlatformFontCaps
    public String defaultFamilyName() {
        return "sans-serif";
    }

    @Override // com.lynx.textra.PlatformFontCaps
    public short adjust(short s) {
        int iNativeGetSystemPropInt = TTTextUtils.nativeGetSystemPropInt("persist.system.vivo.fontsize");
        if (iNativeGetSystemPropInt <= 0) {
            iNativeGetSystemPropInt = 550;
        }
        return clamp((int) ((iNativeGetSystemPropInt / 550.0f) * s));
    }
}
