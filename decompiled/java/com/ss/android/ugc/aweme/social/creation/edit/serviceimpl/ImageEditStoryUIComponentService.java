package com.ss.android.ugc.aweme.social.creation.edit.serviceimpl;

import X.C0ET4;
import X.C1450970nrT;
import X.C1659700tI8;
import X.C19A3;
import X.C2188811AlT;
import X.C2489309pD;
import X.C539960LFq;
import X.EnumC1642750sqn;
import X.EnumC1989707qp;
import X.InterfaceC1451100nrg;
import com.ss.android.ugc.aweme.shortvideo.componentservices.ImageEditComponentService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: loaded from: classes23.dex */
public final class ImageEditStoryUIComponentService implements ImageEditComponentService {
    @Override // com.ss.android.ugc.aweme.shortvideo.componentservices.ImageEditComponentService
    public final void LIZ(C539960LFq c539960LFq, VideoPublishEditModel videoPublishEditModel, C19A3 c19a3, EnumC1989707qp enumC1989707qp) {
        if (enumC1989707qp == EnumC1989707qp.EDIT_ROOT && C2489309pD.LIZ() && u4.LJLL(videoPublishEditModel)) {
            EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("register component ");
            sbLIZ.append(C1450970nrT.class.getName());
            sbLIZ.append(" api ");
            sbLIZ.append(InterfaceC1451100nrg.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC1451100nrg.class, C1450970nrT.class, new AwS601S0100000_22(new C0ET4(), c539960LFq, 864));
        }
    }
}
