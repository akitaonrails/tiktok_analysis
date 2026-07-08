package com.ss.android.ugc.aweme.shortvideo.component.preload;

import X.C05YF;
import X.C0ET4;
import X.C1659700tI8;
import X.C194O;
import X.C194P;
import X.C2188811AlT;
import X.C539960LFq;
import X.EnumC1642750sqn;
import X.EnumC992160bvS;
import com.ss.android.ugc.aweme.shortvideo.componentservices.PublishComponentService;
import com.ss.android.ugc.aweme.shortvideo.experiment.PostPageClickPostPredictionFriendsTabDataConfig;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class PreloadFriendsDataComponentService implements PublishComponentService {
    @Override // com.ss.android.ugc.aweme.shortvideo.componentservices.PublishComponentService
    public final void LIZ(C539960LFq c539960LFq, EnumC992160bvS enumC992160bvS) {
        if (enumC992160bvS == EnumC992160bvS.PUBLISH_UI && ((PostPageClickPostPredictionFriendsTabDataConfig) C194P.LIZIZ.getValue()).strategyType != 0) {
            EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("register component ");
            sbLIZ.append(C194O.class.getName());
            sbLIZ.append(" api ");
            sbLIZ.append(C05YF.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, C05YF.class, C194O.class, new AwS611S0100000_32(new C0ET4(), c539960LFq, 121));
        }
    }
}
