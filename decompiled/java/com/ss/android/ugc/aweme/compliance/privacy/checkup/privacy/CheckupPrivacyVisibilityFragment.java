package com.ss.android.ugc.aweme.compliance.privacy.checkup.privacy;

import X.C104A;
import X.C1264560j0o;
import X.C1697810uHb;
import X.C191821102p;
import X.C191850103s;
import X.C191852103u;
import X.C191880104w;
import X.C191973108l;
import X.C191994109g;
import X.C19203210As;
import X.C1954807lC;
import X.C20684815ws;
import X.C2344009Gk;
import X.EnumC19202910Ap;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecord;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class CheckupPrivacyVisibilityFragment extends CheckupPrivacyBaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9ODclPy4wMWsvISHELIOSowIzA8Zz8hITMtKjZ9Cy0pKiQmOBU+IDkyKzwaIDw6KiwgIDsqDjctLiI2JjE=";

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.privacy.CheckupPrivacyBaseFragment
    public final List<C104A> aS() {
        C191852103u c191852103u = C191973108l.LIZ;
        return C1697810uHb.LJIIJJI(C191973108l.LIZ, C191973108l.LIZIZ);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.privacy.CheckupPrivacyBaseFragment
    public final String bS() {
        return "checkup_privacy_visibility";
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.CheckupBasePageFragment
    public final void PR() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", getEnterFrom());
        C20684815ws.LJIILLIIL("privacy_checkup_visibility_page_show", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.CheckupBasePageFragment
    public final String RR() {
        return C1264560j0o.LIZ("account_visibility");
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.privacy.CheckupPrivacyBaseFragment
    public final C191850103s cS() {
        return new C191850103s(2131845105, 2131845103);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C191852103u c191852103u = C191973108l.LIZ;
        C191821102p.LIZIZ().getClass();
        PrivacySettingsAgreementRecord privacySettingsAgreementRecordLJI = C191880104w.LJI("account_content_reuse");
        if (privacySettingsAgreementRecordLJI == null || privacySettingsAgreementRecordLJI.status != 1) {
            return;
        }
        C191821102p.LIZIZ().getClass();
        C191880104w.LIZIZ("checkup_visibility", null);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.CheckupBasePageFragment
    public final void OR(EnumC19202910Ap enumC19202910Ap) {
        String str;
        int i = C19203210As.LIZ[enumC19202910Ap.ordinal()];
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
        C191994109g.LJIIL(enterFrom, str);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.privacy.CheckupPrivacyBaseFragment, com.ss.android.ugc.aweme.compliance.privacy.checkup.CheckupBasePageFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ZR(2);
    }
}
