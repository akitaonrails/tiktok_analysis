package com.ss.android.ugc.gamora.editor.music.service;

import X.C01GW;
import X.C0BDW;
import X.C0TGX;
import X.C1246240iXG;
import X.C1246250iXH;
import X.C20515215Pi;
import X.C452501pT;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.gamora.editor.services.ILongToShortOutreachProfileBannerService;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class LongToShortOutreachProfileBannerService implements ILongToShortOutreachProfileBannerService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(337));

    @Override // com.ss.android.ugc.gamora.editor.services.ILongToShortOutreachProfileBannerService
    public final boolean LIZIZ() {
        C1246250iXH c1246250iXH = (C1246250iXH) this.LIZ.getValue();
        c1246250iXH.getClass();
        return (C0BDW.LIZ() == 1 || C0BDW.LIZ() == 2 || C0BDW.LIZ() == 3) && !c1246250iXH.LIZ.getBoolean("is_quit_forever", false) && c1246250iXH.LIZ.getInt("show_count", 0) < 3 && c1246250iXH.LIZ.getLong("last_show_time", 0L) + 604800000 < System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.gamora.editor.services.ILongToShortOutreachProfileBannerService
    public final void LIZ(C0TGX c0tgx, C20515215Pi c20515215Pi) {
        PopupManager.LJIJI(new C1246240iXG(c0tgx, c20515215Pi, (C1246250iXH) this.LIZ.getValue()), true);
    }
}
