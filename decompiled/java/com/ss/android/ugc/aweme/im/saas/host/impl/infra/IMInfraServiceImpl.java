package com.ss.android.ugc.aweme.im.saas.host.impl.infra;

import X.C08KG;
import X.C0CF8;
import X.C0VWN;
import X.C274190Aor;
import X.InterfaceC1602960roc;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.saas.host.api.infra.IMInfraService;

/* JADX INFO: loaded from: classes22.dex */
public final class IMInfraServiceImpl implements IMInfraService {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.infra.IMInfraService
    public final boolean LIZ() {
        C0CF8.LIZ.getClass();
        return C0CF8.LIZ() != -1.0f && C0CF8.LIZ() >= ((Number) C274190Aor.LIZ.getValue()).floatValue();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.infra.IMInfraService
    public final boolean LJ() {
        C0CF8.LIZ.getClass();
        return C0CF8.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.infra.IMInfraService
    public final void LIZJ(String str) {
        C0VWN.LIZ(str, false).start();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.infra.IMInfraService
    public final String LIZLLL(Exception exc) {
        return C08KG.LIZ(exc);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.infra.IMInfraService
    public final void stopFpsMonitor(String str) {
        InterfaceC1602960roc interfaceC1602960rocLIZIZ = C0VWN.LIZIZ(str);
        if (interfaceC1602960rocLIZIZ != null) {
            interfaceC1602960rocLIZIZ.stop();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.infra.IMInfraService
    public final void LIZIZ(RecyclerView recyclerView, String str) {
        C0VWN.LIZ(str, false).LIZIZ(recyclerView);
    }
}
