package com.ss.android.ugc.gamora.genaifoundation.core;

import X.C379640EuY;
import X.C381750Exx;
import X.C381810Ey3;
import X.C382240Eyk;
import X.EnumC379630EuX;
import X.InterfaceC355850DxH;
import X.InterfaceC378020Erw;
import X.InterfaceC381790Ey1;

/* JADX INFO: loaded from: classes6.dex */
public final class GenAIFoundationServiceImpl implements IGenAIFoundationService {
    public final C382240Eyk LIZ = new C382240Eyk();

    @Override // com.ss.android.ugc.gamora.genaifoundation.core.IGenAIFoundationService
    public final InterfaceC378020Erw LIZ(C379640EuY c379640EuY) {
        InterfaceC381790Ey1 interfaceC381790Ey1LIZ = this.LIZ.LIZ(c379640EuY.LIZ);
        final C381810Ey3 c381810Ey3 = new C381810Ey3(c379640EuY.LIZIZ, c379640EuY.LIZJ, c379640EuY.LIZLLL, interfaceC381790Ey1LIZ);
        final C381750Exx c381750Exx = new C381750Exx(interfaceC381790Ey1LIZ);
        return new InterfaceC378020Erw(c381810Ey3, c381750Exx) { // from class: X.0Ex9
            public final InterfaceC381940EyG LIZ;
            public final InterfaceC355850DxH LIZIZ;

            @Override // X.InterfaceC378020Erw
            public final InterfaceC381940EyG LIZ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC378020Erw
            public final InterfaceC355850DxH LIZIZ() {
                return this.LIZIZ;
            }

            {
                this.LIZ = c381810Ey3;
                this.LIZIZ = c381750Exx;
            }
        };
    }

    @Override // com.ss.android.ugc.gamora.genaifoundation.core.IGenAIFoundationService
    public final InterfaceC355850DxH LIZIZ(EnumC379630EuX enumC379630EuX) {
        return new C381750Exx(this.LIZ.LIZ(enumC379630EuX));
    }
}
