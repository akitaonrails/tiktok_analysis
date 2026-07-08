package com.ss.android.ugc.aweme.compliance.privacy.checkup.privacy;

import X.C104A;
import X.C1264560j0o;
import X.C1408000mkA;
import X.C1697810uHb;
import X.C191850103s;
import X.C191918106i;
import X.C191973108l;
import X.C191994109g;
import X.C19203110Ar;
import X.C1954807lC;
import X.C20684815ws;
import X.C23250099c;
import X.C2344009Gk;
import X.C306560Bzy;
import X.EnumC19202910Ap;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class CheckupPrivacyInteractionFragment extends CheckupPrivacyBaseFragment {
    public static Boolean LLIZ = null;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9ODclPy4wMWsvISHELIOSowIzA8Zz8hITMtKjZ9Cy0pKiQmOBU+IDkyKzwFJzs2OiQvPSY8JgM+KCg+LSs4";

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.privacy.CheckupPrivacyBaseFragment
    public final String bS() {
        return "checkup_privacy_interaction";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        LLIZ = null;
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.CheckupBasePageFragment
    public final void PR() {
        C191994109g c191994109g = C191994109g.LIZ;
        String enterFrom = getEnterFrom();
        c191994109g.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", enterFrom);
        c2344009Gk.LJ(C191994109g.LIZJ(), "total_social_info");
        c2344009Gk.LJ(C191994109g.LIZIZ(), "privacy_status_info");
        C20684815ws.LJIILLIIL("privacy_checkup_interaction_page_show", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.CheckupBasePageFragment
    public final String RR() {
        return C1264560j0o.LIZ("interaction_controls");
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.privacy.CheckupPrivacyBaseFragment
    public final C191850103s cS() {
        return new C191850103s(2131845080, 2131845079);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.privacy.CheckupPrivacyBaseFragment
    public final List<C104A> aS() {
        if (C306560Bzy.LIZ()) {
            C191918106i.LIZ.getClass();
            return C1697810uHb.LJIIJJI(C191973108l.LIZ, C191918106i.LIZIZ, C191918106i.LIZJ, C191918106i.LIZLLL);
        }
        C191918106i.LIZ.getClass();
        return C1697810uHb.LJIIJJI(C191918106i.LIZIZ, C191918106i.LIZJ, C191918106i.LIZLLL);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.CheckupBasePageFragment
    public final void OR(EnumC19202910Ap enumC19202910Ap) {
        String str;
        int i = C19203110Ar.LIZ[enumC19202910Ap.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    str = "tap_x_exit";
                } else {
                    throw new C1954807lC();
                }
            } else {
                str = "tap_previous";
            }
        } else {
            str = "tap_submit";
        }
        C191994109g c191994109g = C191994109g.LIZ;
        String enterFrom = getEnterFrom();
        c191994109g.getClass();
        C191994109g.LJIIIIZZ(enterFrom, str);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.CheckupBasePageFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1408000mkA(null), 3);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.privacy.CheckupPrivacyBaseFragment, com.ss.android.ugc.aweme.compliance.privacy.checkup.CheckupBasePageFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        if (C306560Bzy.LIZ()) {
            i = 2;
        } else {
            i = 3;
        }
        ZR(i);
    }
}
