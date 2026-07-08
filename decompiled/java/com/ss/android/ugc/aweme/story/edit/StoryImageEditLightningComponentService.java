package com.ss.android.ugc.aweme.story.edit;

import X.C0BUI;
import X.C0ET4;
import X.C0L2F;
import X.C0L2G;
import X.C0L2H;
import X.C1411220mpM;
import X.C1659700tI8;
import X.C2188811AlT;
import X.C539960LFq;
import X.EnumC1642750sqn;
import X.InterfaceC1439570nZ5;
import com.ss.android.ugc.gamora.editor.services.ImageEditLightningStoryComponentService;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class StoryImageEditLightningComponentService implements ImageEditLightningStoryComponentService {
    @Override // com.ss.android.ugc.gamora.editor.services.ImageEditLightningStoryComponentService
    public final void LIZ(C539960LFq c539960LFq) {
        if (C0L2G.LIZJ()) {
            C0L2H.LLJ.getClass();
            C0L2F.LIZ(c539960LFq, null, "StoryEnterEditOpt");
        }
        if (C0BUI.LIZ()) {
            EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("register component ");
            sbLIZ.append(C1411220mpM.class.getName());
            sbLIZ.append(" api ");
            sbLIZ.append(InterfaceC1439570nZ5.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC1439570nZ5.class, C1411220mpM.class, new AwS587S0100000_8(new C0ET4(), c539960LFq, 597));
        }
    }
}
