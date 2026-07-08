package com.ss.android.ugc.aweme.hybridkit.ssc.event;

import X.C1845210y7L;
import X.C1848530yCh;
import X.C1848560yCk;
import X.C1848570yCl;
import X.InterfaceC1848340yCO;
import Y.ARunnableS27S1200000_23;
import com.ss.android.ugc.aweme.nxet.ISSCNxETEventService;
import com.ss.android.ugc.aweme.nxet.ITracingService;

/* JADX INFO: loaded from: classes28.dex */
public final class SSCNxETEventService implements ISSCNxETEventService {
    public final C1848570yCl LIZ = new InterfaceC1848340yCO() { // from class: X.0yCl
        @Override // X.InterfaceC1848340yCO
        public final void LIZ(EnumC1847910yBh enumC1847910yBh, C1847770yBT c1847770yBT, String str) {
            C823050WQl.LIZJ().submit(new ARunnableS27S1200000_23(c1847770yBT, enumC1847910yBh, str, 4));
        }
    };

    @Override // com.ss.android.ugc.aweme.nxet.ISSCNxETEventService
    public final void LIZ() {
        C1848560yCk c1848560yCk = C1848530yCh.LIZ;
        C1848570yCl c1848570yCl = this.LIZ;
        c1848560yCk.getClass();
        ITracingService iTracingServiceLIZ = C1845210y7L.LIZ();
        if (iTracingServiceLIZ != null) {
            iTracingServiceLIZ.LIZJ(c1848570yCl);
        }
    }
}
