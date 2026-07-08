package com.ss.android.ugc.bytebench;

import X.C04TD;
import X.InterfaceC1103404Tg;
import com.ss.android.ugc.aweme.bl.EditorStickerDowngradeService;

/* JADX INFO: loaded from: classes3.dex */
public final class EditorStickerDowngradeServiceImpl implements EditorStickerDowngradeService {
    public static EditorStickerDowngradeService LIZIZ() {
        Object objLIZ = C04TD.LIZ(EditorStickerDowngradeService.class, false);
        if (objLIZ != null) {
            return (EditorStickerDowngradeService) objLIZ;
        }
        if (C04TD.j6 == null) {
            synchronized (EditorStickerDowngradeService.class) {
                if (C04TD.j6 == null) {
                    C04TD.j6 = new EditorStickerDowngradeServiceImpl();
                }
            }
        }
        return C04TD.j6;
    }

    @Override // com.ss.android.ugc.aweme.bl.EditorStickerDowngradeService
    public final boolean LIZ() {
        return InterfaceC1103404Tg.LJIILJJIL.isDowngrade();
    }
}
