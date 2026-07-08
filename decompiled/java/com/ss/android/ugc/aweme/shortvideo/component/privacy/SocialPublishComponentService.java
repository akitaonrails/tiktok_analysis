package com.ss.android.ugc.aweme.shortvideo.component.privacy;

import X.C05YF;
import X.C0ET4;
import X.C1659700tI8;
import X.C214720191i;
import X.C214824195i;
import X.C2188811AlT;
import X.C539960LFq;
import X.EnumC1642750sqn;
import X.EnumC992170bvT;
import com.ss.android.ugc.aweme.shortvideo.services.ExternalPublishComponentService;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class SocialPublishComponentService implements ExternalPublishComponentService {
    @Override // com.ss.android.ugc.aweme.shortvideo.services.ExternalPublishComponentService
    public final void LIZ(C539960LFq c539960LFq, EnumC992170bvT enumC992170bvT) {
        if (enumC992170bvT == EnumC992170bvT.PUBLISH_OPTIONS && C214824195i.LIZIZ.LJIILL()) {
            EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("register component ");
            sbLIZ.append(C214720191i.class.getName());
            sbLIZ.append(" api ");
            sbLIZ.append(C05YF.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, C05YF.class, C214720191i.class, new AwS611S0100000_32(new C0ET4(), c539960LFq, 123));
        }
    }
}
