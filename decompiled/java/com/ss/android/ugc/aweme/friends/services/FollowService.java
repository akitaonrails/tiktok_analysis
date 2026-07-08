package com.ss.android.ugc.aweme.friends.services;

import X.C0OVM;
import X.C1252360ih8;
import X.C1252380ihA;
import X.InterfaceC1252460ihI;
import X.InterfaceC723190SYj;
import com.ss.android.ugc.aweme.friends.service.IFollowService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;

/* JADX INFO: loaded from: classes20.dex */
public final class FollowService implements IFollowService {
    public static final int $stable = 0;

    @Override // com.ss.android.ugc.aweme.friends.service.IFollowService
    public void sendRequest(String str, String str2, int i, InterfaceC1252460ihI interfaceC1252460ihI) {
        sendRequest(str, str2, i, 0, interfaceC1252460ihI);
    }

    public final void sendRequest(String str, String str2, int i, int i2, final InterfaceC1252460ihI interfaceC1252460ihI) {
        C1252360ih8 c1252360ih8 = new C1252360ih8();
        c1252360ih8.LLILLJJLI = new InterfaceC723190SYj() { // from class: X.0ihH
            @Override // X.InterfaceC723190SYj
            public final void uc1(FollowStatus followStatus) {
            }

            @Override // X.InterfaceC723190SYj
            public final void Uo(FollowStatus followStatus) {
                InterfaceC1252460ihI interfaceC1252460ihI2 = interfaceC1252460ihI;
                if (interfaceC1252460ihI2 != null) {
                    interfaceC1252460ihI2.LIZIZ();
                }
            }

            @Override // X.InterfaceC723190SYj
            public final void th(Exception exc) {
                InterfaceC1252460ihI interfaceC1252460ihI2 = interfaceC1252460ihI;
                if (interfaceC1252460ihI2 != null) {
                    interfaceC1252460ihI2.LIZ(exc);
                }
            }

            @Override // X.InterfaceC723190SYj
            public final void u41(Exception exc) {
                C723180SYi.LIZ(this, exc);
            }
        };
        C0OVM c0ovm = new C0OVM();
        c0ovm.LIZJ(str);
        c0ovm.LIZIZ(str2);
        C1252380ihA c1252380ihA = c0ovm.LIZ;
        c1252380ihA.LIZLLL = i;
        c1252380ihA.LJ = i2;
        c1252360ih8.LJ(c0ovm.LIZ());
    }
}
