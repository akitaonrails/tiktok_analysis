package com.ss.android.ugc.aweme.share.qrcode.config;

import X.C418440Gaw;
import X.C419910GdJ;
import X.C814420VxA;
import X.C844470XAv;
import X.EnumC1487630oob;
import X.EnumC19356010o2;
import android.graphics.drawable.Drawable;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicBitmapConfig;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes30.dex */
public final class QRCodeConfig implements IDynamicBitmapConfig {
    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    public final boolean enable() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    public final Drawable fallback() {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_qr_code;
        c419910GdJ.LIZLLL = Integer.valueOf(ColorProtector.parseColor("#F1F1F1"));
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(190));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(190));
        C844470XAv.LIZ.getClass();
        return c419910GdJ.LIZ(C844470XAv.LIZ());
    }

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    public final String key() {
        return "qr_code_default_view";
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
