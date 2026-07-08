package com.ss.android.ugc.aweme.share.qrcode.config;

import X.EnumC1487630oob;
import X.EnumC19356010o2;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicBitmapConfig;

/* JADX INFO: loaded from: classes30.dex */
public final class TTLogoBlackConfig implements IDynamicBitmapConfig {
    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    public final boolean enable() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    public final /* bridge */ /* synthetic */ Drawable fallback() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    public final String key() {
        return "img_scan_logo_new";
    }

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    public final EnumC1487630oob priority() {
        return EnumC1487630oob.NORMAL;
    }

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    public final EnumC19356010o2 type() {
        return EnumC19356010o2.IMAGE;
    }
}
