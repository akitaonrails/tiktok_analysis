package com.ss.android.ugc.aweme.minis.feed.dmpg;

import X.AbstractC848400XPy;
import X.C086500Ud;
import X.C0XQ7;
import X.C1528840pt4;
import X.C1528860pt6;
import X.C2196741AyG;
import X.C261580AMy;
import X.EnumC2196771AyJ;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.api.preload.IMinisDmPlaygroundPreloadService;
import com.ss.android.ugc.aweme.minis.exp.MinisPreloadConfig;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class MinisDmPlaygroundPreloadServiceImpl implements IMinisDmPlaygroundPreloadService {
    @Override // com.ss.android.ugc.aweme.minis.api.preload.IMinisDmPlaygroundPreloadService
    public final void LIZ(List<String> list, List<String> list2) {
        try {
            if (!((Boolean) C261580AMy.LIZ.getValue()).booleanValue() || !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                return;
            }
            MinisPreloadConfig minisPreloadConfigLIZ = C1528840pt4.LIZ();
            EnumC2196771AyJ enumC2196771AyJ = EnumC2196771AyJ.DM_PLAYGROUND;
            List listLIZ = C086500Ud.LIZ(minisPreloadConfigLIZ.getMaxPreloadCount(enumC2196771AyJ), list, list2);
            if (listLIZ.isEmpty()) {
                return;
            }
            C2196741AyG c2196741AyG = new C2196741AyG(enumC2196771AyJ, listLIZ);
            c2196741AyG.LIZJ();
            c2196741AyG.LJ();
            c2196741AyG.LJFF().LIZJ = true;
            c2196741AyG.LIZIZ();
            c2196741AyG.LIZ(C1528860pt6.LIZ(enumC2196771AyJ));
            c2196741AyG.LJI();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
