package com.ss.android.ugc.aweme.social.serviceimpl;

import X.C0ET4;
import X.C1442850neN;
import X.C1659700tI8;
import X.C2188811AlT;
import X.C539960LFq;
import X.EnumC1642750sqn;
import X.InterfaceC1435980nTI;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.social.service.ISocialEditServiceForStoryEdit;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: loaded from: classes23.dex */
public final class SocialEditServiceForStoryEditImpl implements ISocialEditServiceForStoryEdit {
    @Override // com.ss.android.ugc.aweme.social.service.ISocialEditServiceForStoryEdit
    public final void LIZ(C539960LFq c539960LFq, CreativeModel creativeModel) {
        if (creativeModel.storyEventStickerData.isStoryEventStickerPost()) {
            EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("register component ");
            sbLIZ.append(C1442850neN.class.getName());
            sbLIZ.append(" api ");
            sbLIZ.append(InterfaceC1435980nTI.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC1435980nTI.class, C1442850neN.class, new AwS601S0100000_22(new C0ET4(), c539960LFq, 922));
        }
    }
}
