package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C19EG;
import X.C469480Ib4;
import X.C497740JfY;
import X.InterfaceC1220300hrQ;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.bytedance.android.livesdkapi.host.IHostPersonalized;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;

/* JADX INFO: loaded from: classes29.dex */
public final class LiveHostPersonalized implements IHostPersonalized {
    @Override // com.bytedance.android.livesdkapi.host.IHostPersonalized
    public final boolean BA2() {
        return ComplianceServiceProvider.LJI().LJIIJ(false);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPersonalized
    public final boolean P9() {
        return ComplianceServiceProvider.LJI().P9();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPersonalized
    public final LiveData<Boolean> cx2() {
        return ComplianceServiceProvider.LJI().LJJIII();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPersonalized
    public final void MZ0(C19EG c19eg) {
        ComplianceServiceProvider.LJI().LJIIL(c19eg);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPersonalized
    public final String va2(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return C497740JfY.LJIJI(2131838203);
                    }
                    return C497740JfY.LJIJI(2131838202);
                }
                return C497740JfY.LJIJI(2131844880);
            }
            return C497740JfY.LJIJI(2131838205);
        }
        return C497740JfY.LJIJI(2131838204);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0zyA] */
    @Override // com.bytedance.android.livesdkapi.host.IHostPersonalized
    public final Fragment ds2(boolean z, final C469480Ib4 c469480Ib4) {
        return ComplianceServiceProvider.LJI().LJJI(z, new InterfaceC1220300hrQ() { // from class: X.0zyA
            @Override // X.InterfaceC1220300hrQ
            public final void LIZ() {
                c469480Ib4.LIZ();
            }

            @Override // X.InterfaceC1220300hrQ
            public final void LIZIZ(String str) {
                c469480Ib4.LIZIZ();
            }

            @Override // X.InterfaceC1220300hrQ
            public final void LIZJ(boolean z2) {
                c469480Ib4.LIZJ(z2);
            }

            @Override // X.InterfaceC1220300hrQ
            public final void LIZLLL(boolean z2) {
                c469480Ib4.LJ();
            }

            @Override // X.InterfaceC1220300hrQ
            public final void LJ(String str) {
                c469480Ib4.LIZLLL();
            }
        });
    }
}
