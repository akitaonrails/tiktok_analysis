package com.ss.android.ugc.gamora.editorpro.capabilities.text.editpanel;

import X.C0ET4;
import X.C0FAJ;
import X.C1659700tI8;
import X.C2188811AlT;
import X.C385410F9f;
import X.C385880FBa;
import X.C388420FKu;
import X.C388470FKz;
import X.InterfaceC384330F5b;
import android.widget.FrameLayout;
import com.ss.android.ugc.editorpro.components.api.text.editpanel.IEPTextEditPanelService;
import kotlin.jvm.internal.AwS103S0400000_5;
import kotlin.jvm.internal.AwS371S0200000_5;

/* JADX INFO: loaded from: classes6.dex */
public final class EPTextEditPanelService implements IEPTextEditPanelService {
    @Override // com.ss.android.ugc.editorpro.components.api.text.editpanel.IEPTextEditPanelService
    public final void LIZIZ(C0FAJ c0faj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register slotUIComponent ");
        sbLIZ.append(C385410F9f.class.getName());
        sbLIZ.append(" api ");
        sbLIZ.append(InterfaceC384330F5b.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c0faj.LIZ.LIZ.LIZIZ(null, c0faj.LJ, c0faj.LJFF, InterfaceC384330F5b.class, C385410F9f.class, C385880FBa.class, c0faj.LIZJ, c0faj.LIZLLL, new AwS371S0200000_5(new C0ET4(), c0faj, c0faj, 116));
    }

    @Override // com.ss.android.ugc.editorpro.components.api.text.editpanel.IEPTextEditPanelService
    public final void LIZ(C0FAJ c0faj, FrameLayout frameLayout, FrameLayout frameLayout2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register slotUIComponent ");
        sbLIZ.append(C388470FKz.class.getName());
        sbLIZ.append(" api ");
        sbLIZ.append(InterfaceC384330F5b.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c0faj.LIZ.LIZ.LIZIZ(null, c0faj.LJ, c0faj.LJFF, InterfaceC384330F5b.class, C388470FKz.class, C388420FKu.class, c0faj.LIZJ, c0faj.LIZLLL, new AwS103S0400000_5(new C0ET4(), c0faj, frameLayout, frameLayout2, c0faj, 2));
    }
}
