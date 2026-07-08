package com.ss.android.ugc.aweme.ecommerce.photo;

import X.C1558520qew;
import X.C21270718Lx;
import X.C694950RNt;
import X.InterfaceC665370Q7z;
import X.InterfaceC694960RNu;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ability.IPhotoModeAbility;
import com.ss.android.ugc.aweme.ecommerce.service.IECommercePhotoService;

/* JADX INFO: loaded from: classes12.dex */
public final class ECPhotoService implements IECommercePhotoService {
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommercePhotoService
    public final InterfaceC694960RNu LIZ() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("ec_sv_should_enable_dynamic_photo_sticker", false) ? C21270718Lx.LIZ : C694950RNt.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommercePhotoService
    public final int LIZIZ(InterfaceC665370Q7z interfaceC665370Q7z) {
        IPhotoModeAbility iPhotoModeAbility;
        if (interfaceC665370Q7z != null && (iPhotoModeAbility = (IPhotoModeAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPhotoModeAbility.class, null)) != null) {
            return iPhotoModeAbility.fj1();
        }
        return -1;
    }
}
