package com.ss.android.ugc.aweme.ecommerce.publish.aidubbing;

import X.AnonymousClass1920;
import X.C0ET4;
import X.C1420670n4b;
import X.C1659700tI8;
import X.C214737191z;
import X.C2188811AlT;
import X.C539960LFq;
import X.EnumC1642750sqn;
import X.EnumC992170bvT;
import X.InterfaceC214735191x;
import X.InterfaceC856270XiT;
import com.ss.android.ugc.aweme.shortvideo.services.ExternalPublishComponentService;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class EcSvPublishComponentService implements ExternalPublishComponentService {
    @Override // com.ss.android.ugc.aweme.shortvideo.services.ExternalPublishComponentService
    public final void LIZ(C539960LFq c539960LFq, EnumC992170bvT enumC992170bvT) {
        if (enumC992170bvT == EnumC992170bvT.PUBLISH_OPTIONS && C1420670n4b.LJIILIIL()) {
            EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("register component ");
            sbLIZ.append(AnonymousClass1920.class.getName());
            sbLIZ.append(" api ");
            sbLIZ.append(InterfaceC856270XiT.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC856270XiT.class, AnonymousClass1920.class, new AwS611S0100000_32(new C0ET4(), c539960LFq, 65));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("register component ");
            sbLIZ2.append(C214737191z.class.getName());
            sbLIZ2.append(" api ");
            sbLIZ2.append(InterfaceC214735191x.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC214735191x.class, C214737191z.class, new AwS611S0100000_32(new C0ET4(), c539960LFq, 66));
        }
    }
}
