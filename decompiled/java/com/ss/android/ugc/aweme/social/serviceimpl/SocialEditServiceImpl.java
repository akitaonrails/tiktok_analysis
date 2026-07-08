package com.ss.android.ugc.aweme.social.serviceimpl;

import X.C0ET4;
import X.C1442850neN;
import X.C1659700tI8;
import X.C19611611oA;
import X.C19A3;
import X.C2188811AlT;
import X.C539960LFq;
import X.EnumC1642750sqn;
import X.InterfaceC1427620nFo;
import X.InterfaceC1435980nTI;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.gamora.editor.services.ExternalVideoEditComponentService;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: loaded from: classes23.dex */
public final class SocialEditServiceImpl implements ExternalVideoEditComponentService {
    @Override // com.ss.android.ugc.gamora.editor.services.ExternalVideoEditComponentService
    public final void registerComponents(C539960LFq c539960LFq, CreativeModel creativeModel, C19A3 c19a3) {
        if (creativeModel.storyEventStickerData.isStoryEventStickerPost()) {
            EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("register component ");
            sbLIZ.append(C1442850neN.class.getName());
            sbLIZ.append(" api ");
            sbLIZ.append(InterfaceC1435980nTI.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC1435980nTI.class, C1442850neN.class, new AwS601S0100000_22(new C0ET4(), c539960LFq, 249));
        }
        if (creativeModel.storyEventStickerData.isStoryEventStickerPost()) {
            EnumC1642750sqn enumC1642750sqn2 = EnumC1642750sqn.IMMEDIATE;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("register component ");
            sbLIZ2.append(C19611611oA.class.getName());
            sbLIZ2.append(" api ");
            sbLIZ2.append(InterfaceC1427620nFo.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn2, null, InterfaceC1427620nFo.class, C19611611oA.class, new AwS601S0100000_22(new C0ET4(), c539960LFq, 250));
        }
    }
}
