package com.ss.android.ugc.aweme;

import X.C0C8J;
import X.C13LE;
import X.C1565380qq0;
import X.C1586120rNS;
import X.C1790450wh1;
import X.C1906360zhy;
import X.C19719912Dl;
import X.C311800CKc;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.sidebar.SidebarLegoTask;
import com.ss.android.ugc.aweme.sidebar.SidebarPageFragment;
import com.ss.android.ugc.aweme.tab.lifecycle.TabLifecycleAssem;
import com.ss.android.ugc.aweme.tab.tabclean.TabCleanAssem;

/* JADX INFO: loaded from: classes25.dex */
public final class HomeTabServiceImpl implements IHomeTabService {
    @Override // com.ss.android.ugc.aweme.IHomeTabService
    public final C19719912Dl LIZJ() {
        return C13LE.LIZ(TabLifecycleAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.IHomeTabService
    public final C19719912Dl LJI() {
        return C13LE.LIZ(TabCleanAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.IHomeTabService
    public final void LJIIIIZZ() {
        C311800CKc.LIZ = true;
    }

    @Override // com.ss.android.ugc.aweme.IHomeTabService
    public final void LIZ() {
        C1565380qq0.LIZ.getClass();
        C1565380qq0.LIZIZ = true;
    }

    @Override // com.ss.android.ugc.aweme.IHomeTabService
    public final SidebarLegoTask LIZLLL() {
        return new SidebarLegoTask();
    }

    @Override // com.ss.android.ugc.aweme.IHomeTabService
    public final void LJFF() {
        C1906360zhy.LIZ.LIZ.getValue();
        C1790450wh1 c1790450wh1 = C1906360zhy.LIZIZ;
        c1790450wh1.getClass();
        C1586120rNS.LIZ.getClass();
        c1790450wh1.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.IHomeTabService
    public final void LJII() {
        C1565380qq0.LIZ.getClass();
        C1565380qq0.LIZIZ = true;
    }

    @Override // com.ss.android.ugc.aweme.IHomeTabService
    public final Class<? extends Fragment> LJIIIZ() {
        return SidebarPageFragment.class;
    }

    @Override // com.ss.android.ugc.aweme.IHomeTabService
    public final void LIZIZ(boolean z) {
        C0C8J.LIZ.getClass();
        C0C8J.LJIIIIZZ = z;
    }

    @Override // com.ss.android.ugc.aweme.IHomeTabService
    public final void LJ(boolean z) {
        C0C8J.LIZ.getClass();
        StringBuilder sb = C0C8J.LIZLLL;
        sb.append(z);
        sb.append(" ");
    }
}
