package com.ss.android.ugc.aweme.compliance.agegate;

import X.C19298010eg;
import X.C20684815ws;
import X.C2344009Gk;
import X.C786410Ut5;
import android.os.Bundle;
import com.ss.android.ugc.aweme.compliance.agegate.api.IAgeGateTracker;

/* JADX INFO: loaded from: classes29.dex */
public final class AgeGateMonitor implements IAgeGateTracker {
    public static final /* synthetic */ int LIZ = 0;

    @Override // com.ss.android.ugc.aweme.compliance.agegate.api.IAgeGateTracker
    public final void LIZ() {
        C20684815ws.LJIILLIIL("recover_from_video_delete", new C2344009Gk().LIZ);
    }

    @Override // com.ss.android.ugc.aweme.compliance.agegate.api.IAgeGateTracker
    public final void LIZIZ() {
        C20684815ws.LJIILLIIL("age_gate_ban", new C2344009Gk().LIZ);
    }

    @Override // com.ss.android.ugc.aweme.compliance.agegate.api.IAgeGateTracker
    public final void LIZJ() {
        C20684815ws.LJIILLIIL("recover_from_account_page", new C2344009Gk().LIZ);
    }

    @Override // com.ss.android.ugc.aweme.compliance.agegate.api.IAgeGateTracker
    public final void LIZLLL() {
        C20684815ws.LJIILLIIL("recover_from_password_page", new C2344009Gk().LIZ);
    }

    @Override // com.ss.android.ugc.aweme.compliance.agegate.api.IAgeGateTracker
    public final void LJ(String str) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("verification_type", str, bundle);
        C19298010eg.LIZLLL("registration_age_verification", bundle);
    }
}
