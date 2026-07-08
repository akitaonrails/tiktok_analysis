package com.ss.android.ugc.aweme.live;

import X.C0J3O;
import X.C0J3P;
import X.C1209120hZO;
import X.C1440005kM;
import X.C20441214yg;
import X.C2188811AlT;
import X.C421540Gfw;
import X.C479930Irv;
import Y.AObjectS283S0200000_7;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;

/* JADX INFO: loaded from: classes8.dex */
public final class SearchCardLiveService implements ISearchCardLiveService {
    @Override // com.ss.android.ugc.aweme.live.ISearchCardLiveService
    public final void LIZ() {
        C1440005kM.LIZ(new C479930Irv());
    }

    @Override // com.ss.android.ugc.aweme.live.ISearchCardLiveService
    public final void LIZIZ() {
        VerticalViewPager verticalViewPager;
        C0J3P.LIZ.getClass();
        boolean zLIZLLL = C0J3P.LIZLLL();
        if (C0J3P.LJI != zLIZLLL) {
            C0J3O c0j3o = C0J3P.LIZIZ;
            if (c0j3o != null && (verticalViewPager = ((C1209120hZO) c0j3o).LIZ.LLJJIJI) != null) {
                verticalViewPager.setDisableScroll(!zLIZLLL);
            }
            C0J3P.LJI = zLIZLLL;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.ISearchCardLiveService
    public final void searchScrollToNextItem(boolean z) {
        C0J3P.LIZ.getClass();
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("searchScrollToNextItem, needDelete=");
            sbLIZ.append(z);
            C20441214yg.LJIIIZ("LiveSearchPlayHelper", C2188811AlT.LIZIZ(sbLIZ));
            C0J3O c0j3o = C0J3P.LIZIZ;
            if (c0j3o != null) {
                C1209120hZO c1209120hZO = (C1209120hZO) c0j3o;
                Aweme awemeLJIIIIZZ = c1209120hZO.LIZ.LJIIIIZZ();
                if (awemeLJIIIIZZ != null && AwemeSaaSExtKt.isLive(awemeLJIIIIZZ)) {
                    C421540Gfw.LIZ(new AObjectS283S0200000_7(c1209120hZO, awemeLJIIIIZZ, 1));
                    return;
                }
                return;
            }
            return;
        }
        C0J3O c0j3o2 = C0J3P.LIZIZ;
        if (c0j3o2 == null) {
            return;
        }
        ((C1209120hZO) c0j3o2).LIZ();
    }
}
