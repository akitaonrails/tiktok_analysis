package com.lynx.textra;

import X.C1321990kVR;
import android.content.Context;
import android.provider.Settings;

/* JADX INFO: loaded from: classes21.dex */
public class HonorFontCaps implements PlatformFontCaps {
    public final Context mContext;

    @Override // com.lynx.textra.PlatformFontCaps
    public final /* synthetic */ short clamp(int i) {
        return C1321990kVR.LIZ(this, i);
    }

    @Override // com.lynx.textra.PlatformFontCaps
    public String defaultFamilyName() {
        return "sans-serif";
    }

    public HonorFontCaps(Context context) {
        this.mContext = context;
    }

    @Override // com.lynx.textra.PlatformFontCaps
    public short adjust(short s) {
        return clamp((int) ((Settings.Secure.getInt(this.mContext.getContentResolver(), "font_weight_scale", 100) / 100.0f) * s));
    }
}
