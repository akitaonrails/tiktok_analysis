package com.ss.android.ugc.aweme.ecommerce.sticker;

import X.AbstractC19589811ke;
import X.C19589911kf;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes3.dex */
public final class EcommerceStickerComponentProviderImpl implements IEcommerceStickerComponentProvider {
    @Override // com.ss.android.ugc.aweme.ecommerce.sticker.IEcommerceStickerComponentProvider
    public final Class<? extends AbstractC19589811ke<?>> LIZ() {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ec_sv_should_enable_dynamic_photo_sticker", false)) {
            return C19589911kf.class;
        }
        return null;
    }
}
