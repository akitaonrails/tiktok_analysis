package com.ss.android.ugc.aweme.homepage.experiment;

import X.C799820VZc;
import X.C799890VZj;
import X.C799900VZk;
import X.InterfaceC800080Va2;
import com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate;
import com.ss.android.ugc.aweme.homepage.ui.inflate.X2CActivityMain;
import com.ss.android.ugc.aweme.homepage.ui.inflate.X2CFragmentMain;
import com.ss.android.ugc.aweme.homepage.ui.inflate.X2CFragmentMainPage;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.X2CTabItem;
import com.ss.android.ugc.aweme.main.experiment.IHomepageExperimentService;

/* JADX INFO: loaded from: classes14.dex */
public final class HomepageExperimentServiceImpl implements IHomepageExperimentService {
    @Override // com.ss.android.ugc.aweme.main.experiment.IHomepageExperimentService
    public final void initLegoInflate() {
        C799900VZk c799900VZk = C799900VZk.LIZ;
        X2CActivityMain x2CActivityMain = new X2CActivityMain();
        c799900VZk.getClass();
        C799820VZc c799820VZc = C799900VZk.LIZLLL;
        c799820VZc.LIZ("X2CActivityMain", x2CActivityMain);
        c799820VZc.LIZ("X2CFragmentMainPage", new X2CFragmentMainPage());
        c799820VZc.LIZ("X2CFragmentMain", new X2CFragmentMain());
        c799820VZc.LIZ("X2CTabItem", new X2CTabItem());
        c799820VZc.LIZ("PreDrawableInflate", new PreDrawableInflate());
        C799890VZj c799890VZj = new C799890VZj() { // from class: X.0Va8
        };
        c799890VZj.LIZ((InterfaceC800080Va2) PreDrawableInflate.class.newInstance());
        c799890VZj.LIZIZ();
    }
}
