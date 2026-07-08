package com.ss.android.ugc.aweme.ogc.declaration.creator;

import X.C0ET4;
import X.C1618480sDe;
import X.C1618500sDg;
import X.C1659700tI8;
import X.C214686190a;
import X.C2188811AlT;
import X.C539960LFq;
import X.C708510Rqj;
import X.EnumC1642750sqn;
import X.EnumC992170bvT;
import X.InterfaceC214688190c;
import com.ss.android.ugc.aweme.ogc.declaration.IDeclarationService;
import com.ss.android.ugc.aweme.shortvideo.services.ExternalPublishComponentService;
import kotlin.jvm.internal.AwS398S0200000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class OgcPublishOptionsService implements ExternalPublishComponentService {
    @Override // com.ss.android.ugc.aweme.shortvideo.services.ExternalPublishComponentService
    public final void LIZ(C539960LFq c539960LFq, EnumC992170bvT enumC992170bvT) {
        C1618480sDe publisher;
        C1618500sDg c1618500sDgLIZJ;
        if (enumC992170bvT == EnumC992170bvT.PUBLISH_OPTIONS) {
            IDeclarationService.LIZ.getClass();
            IDeclarationService iDeclarationServiceLIZ = C708510Rqj.LIZ();
            if (iDeclarationServiceLIZ != null && (publisher = iDeclarationServiceLIZ.getPublisher()) != null && (c1618500sDgLIZJ = publisher.LIZJ()) != null) {
                EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("register component ");
                sbLIZ.append(C214686190a.class.getName());
                sbLIZ.append(" api ");
                sbLIZ.append(InterfaceC214688190c.class.getName());
                C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC214688190c.class, C214686190a.class, new AwS398S0200000_32(new C0ET4(), c539960LFq, c1618500sDgLIZJ, 79));
            }
        }
    }
}
