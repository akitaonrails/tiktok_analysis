package com.ss.android.ugc.aweme.sticker;

import X.C04TD;
import X.C19607711nX;

/* JADX INFO: loaded from: classes12.dex */
public final class StickerContainerService implements InteractStickerContainerGetterApi {
    public static InteractStickerContainerGetterApi LIZ() {
        Object objLIZ = C04TD.LIZ(InteractStickerContainerGetterApi.class, false);
        if (objLIZ != null) {
            return (InteractStickerContainerGetterApi) objLIZ;
        }
        if (C04TD.x5 == null) {
            synchronized (InteractStickerContainerGetterApi.class) {
                if (C04TD.x5 == null) {
                    C04TD.x5 = new StickerContainerService();
                }
            }
        }
        return C04TD.x5;
    }

    @Override // com.ss.android.ugc.aweme.sticker.InteractStickerContainerGetterApi
    public final C19607711nX LJIJI() {
        return new C19607711nX();
    }
}
