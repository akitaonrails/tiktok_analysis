package com.ss.android.ugc.aweme.portrait.service;

import X.C098200Yq;
import X.C0MGI;
import X.C1447800nmM;
import X.C189200o6;
import X.C19A3;
import X.C19EH;
import X.C1DRG;
import X.C20622515mp;
import X.InterfaceC1737690vJv;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.portrait.route.AIPortraitEnterParams;
import com.ss.android.ugc.aweme.portrait.tab.AIPortraitTabFragment;
import com.ss.android.ugc.tiktok.IEditorTabAIPortraitService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes9.dex */
public final class EditorTabAIPortraitServiceImpl implements IEditorTabAIPortraitService {
    @Override // com.ss.android.ugc.tiktok.IEditorTabAIPortraitService
    public final void LIZ(C1DRG c1drg, final C19A3 c19a3, AIPortraitEnterParams aIPortraitEnterParams) {
        Object c098200Yq;
        Fragment fragmentLJJJJZI;
        final C0MGI c0mgi = new C0MGI(aIPortraitEnterParams);
        if (C1447800nmM.LIZ(c19a3) != null) {
            InterfaceC1737690vJv interfaceC1737690vJv = new InterfaceC1737690vJv() { // from class: X.0MGH
                @Override // X.InterfaceC1737690vJv
                public final boolean onBackPressed() {
                    NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(c0mgi);
                    if (navigationSceneLIZ != null) {
                        navigationSceneLIZ.LLLLLLLZIL(this);
                    }
                    c19a3.remove(c0mgi);
                    C569590MVp.LIZIZ.LIZ(C1664600tQ2.LJ(c19a3).LJFF());
                    return true;
                }
            };
            c19a3.add(R.id.gu3, c0mgi, "AIPortraitEditorTabScene");
            try {
                c098200Yq = C20622515mp.LJIILLIIL(c0mgi);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            FragmentManager fragmentManager = (FragmentManager) c098200Yq;
            if (fragmentManager != null && ((fragmentLJJJJZI = fragmentManager.LJJJJZI("aiPortraitTabFragmentEditorTabTag")) == null || !fragmentLJJJJZI.isVisible())) {
                AIPortraitTabFragment aIPortraitTabFragment = new AIPortraitTabFragment();
                aIPortraitTabFragment.LL = c0mgi;
                Bundle bundleLIZIZ = c0mgi.LLJILLL.LIZIZ();
                bundleLIZIZ.putBoolean("is_from_editor_tab", true);
                aIPortraitTabFragment.setArguments(bundleLIZIZ);
                C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
                c19ehLJIIJ.LJIJ(R.id.guc, aIPortraitTabFragment, "aiPortraitTabFragmentEditorTabTag");
                c19ehLJIIJ.LJIIJJI();
            }
            NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(c0mgi);
            if (navigationSceneLIZ != null) {
                navigationSceneLIZ.LLLIILIL(c19a3, interfaceC1737690vJv);
            }
        }
    }
}
