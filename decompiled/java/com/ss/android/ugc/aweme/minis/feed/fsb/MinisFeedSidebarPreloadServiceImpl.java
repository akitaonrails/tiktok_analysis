package com.ss.android.ugc.aweme.minis.feed.fsb;

import X.AbstractC848400XPy;
import X.C07Z6;
import X.C0XQ7;
import X.C1528840pt4;
import X.C1528860pt6;
import X.C15438062q;
import X.C1580770rEp;
import X.C2196741AyG;
import X.C261590AMz;
import X.EnumC2196771AyJ;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.api.preload.IMinisFeedSidebarPreloadService;
import com.ss.android.ugc.aweme.minis.exp.MinisPreloadConfig;
import com.ss.android.ugc.aweme.sidebar.model.SideBarRootComponentConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class MinisFeedSidebarPreloadServiceImpl implements IMinisFeedSidebarPreloadService {
    @Override // com.ss.android.ugc.aweme.minis.api.preload.IMinisFeedSidebarPreloadService
    public final void LIZ(SideBarRootComponentConfig sideBarRootComponentConfig) {
        try {
            if (!((Boolean) C261590AMz.LIZ.getValue()).booleanValue() || !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                return;
            }
            MinisPreloadConfig minisPreloadConfigLIZ = C1528840pt4.LIZ();
            EnumC2196771AyJ enumC2196771AyJ = EnumC2196771AyJ.FEED_SIDEBAR;
            List listLIZ = C1580770rEp.LIZ(sideBarRootComponentConfig, minisPreloadConfigLIZ.getMaxPreloadCount(enumC2196771AyJ));
            if (listLIZ.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
            Iterator it2 = listLIZ.iterator();
            while (it2.hasNext()) {
                arrayList.add(((C07Z6) it2.next()).LIZIZ);
            }
            C2196741AyG c2196741AyG = new C2196741AyG(enumC2196771AyJ, arrayList);
            c2196741AyG.LIZJ();
            c2196741AyG.LJFF().LIZJ = true;
            c2196741AyG.LJ();
            c2196741AyG.LIZIZ();
            c2196741AyG.LIZ(C1528860pt6.LIZ(EnumC2196771AyJ.FEED_SIDEBAR));
            c2196741AyG.LJI();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
