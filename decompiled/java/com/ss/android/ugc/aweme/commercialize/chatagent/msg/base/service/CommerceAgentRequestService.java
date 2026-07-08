package com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.service;

import X.C054G;
import X.C09A1;
import X.C0PEM;
import X.C1008760cME;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C321380Cim;
import com.ss.android.ugc.aweme.commercialize.chatagent.api.ICommerceAgentRequestService;

/* JADX INFO: loaded from: classes3.dex */
public final class CommerceAgentRequestService implements ICommerceAgentRequestService {
    public final C054G LIZ;

    public CommerceAgentRequestService() {
        final C054G c054gLIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
        this.LIZ = c054gLIZ;
        new Object(c054gLIZ) { // from class: X.05KP
            public final InterfaceC497601wk LIZ;

            {
                this.LIZ = c054gLIZ;
                new C321150CiP(c054gLIZ);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.api.ICommerceAgentRequestService
    public final void LIZ(C1008760cME c1008760cME, String str, String str2, Integer num) {
        C23250099c.LIZLLL(this.LIZ, null, null, new C321380Cim(str, str2, num, c1008760cME, null), 3);
    }
}
