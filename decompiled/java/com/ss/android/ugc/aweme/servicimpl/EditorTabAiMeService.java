package com.ss.android.ugc.aweme.servicimpl;

import X.C0MGA;
import X.C1447800nmM;
import X.C19A3;
import X.C1DRG;
import X.C568760MSk;
import X.InterfaceC1737690vJv;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.tiktok.IEditorTabAiMeService;
import com.zhiliaoapp.musically.R;
import t28.h;

/* JADX INFO: loaded from: classes9.dex */
public final class EditorTabAiMeService implements IEditorTabAiMeService {
    @Override // com.ss.android.ugc.tiktok.IEditorTabAiMeService
    public final boolean LIZ(ShortVideoContext shortVideoContext) {
        return C568760MSk.LIZ(shortVideoContext);
    }

    @Override // com.ss.android.ugc.tiktok.IEditorTabAiMeService
    public final void LIZIZ(final C19A3 c19a3, C1DRG c1drg) {
        final h hVar = new h(c1drg, C0MGA.EDITOR_TAB);
        hVar.LLJJJJLIIL = true;
        if (C1447800nmM.LIZ(c19a3) != null) {
            InterfaceC1737690vJv interfaceC1737690vJv = new InterfaceC1737690vJv() { // from class: X.0MGF
                @Override // X.InterfaceC1737690vJv
                public final boolean onBackPressed() {
                    NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(hVar);
                    if (navigationSceneLIZ != null) {
                        navigationSceneLIZ.LLLLLLLZIL(this);
                    }
                    c19a3.remove(hVar);
                    C569590MVp.LIZIZ.LIZ(C1664600tQ2.LJ(c19a3).LJFF());
                    return true;
                }
            };
            c19a3.add(R.id.gu3, hVar, "aime", R.anim.a9);
            hVar.show();
            NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(hVar);
            if (navigationSceneLIZ != null) {
                navigationSceneLIZ.LLLIILIL(c19a3, interfaceC1737690vJv);
            }
        }
    }
}
