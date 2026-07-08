package com.ss.android.ugc.aweme.account.login.auth.ui.login;

import X.C1527830prR;
import X.C197039127h;
import X.C19EG;
import X.C20684815ws;
import X.C2344009Gk;
import X.InterfaceC836760Ws6;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.account.loginapproval.BaseConfirmLoginPageFragment;

/* JADX INFO: loaded from: classes33.dex */
@InterfaceC836760Ws6(attachActivity = QRCodeLoginVerifyHostActivity.class)
public final class QRCodeLoginVerifyFragment extends BaseConfirmLoginPageFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0IStiHELIOSKDonIGs5IGE/JyIlJ2ECGgYjLSofJyIlJxk2OiwqMAkhKSIhLCEn";
    public QRCodeLoginVerifyViewModel LLJLL;

    @Override // com.ss.android.ugc.aweme.account.loginapproval.BaseConfirmLoginPageFragment
    public final void WR() {
        QRCodeLoginVerifyViewModel qRCodeLoginVerifyViewModel = this.LLJLL;
        if (qRCodeLoginVerifyViewModel != null) {
            qRCodeLoginVerifyViewModel.vQ2(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.loginapproval.BaseConfirmLoginPageFragment
    public final void aS() {
        QRCodeLoginVerifyViewModel qRCodeLoginVerifyViewModel = this.LLJLL;
        if (qRCodeLoginVerifyViewModel != null) {
            qRCodeLoginVerifyViewModel.vQ2(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.loginapproval.BaseConfirmLoginPageFragment
    public final void cS() {
        C197039127h c197039127h = this.LLJJIII;
        if (c197039127h != null) {
            c197039127h.setButtonVariant(1);
        }
        C197039127h c197039127h2 = this.LLJJIJI;
        if (c197039127h2 != null) {
            c197039127h2.setButtonVariant(0);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0204  */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.19GA] */
    @Override // com.ss.android.ugc.aweme.account.loginapproval.BaseConfirmLoginPageFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void SR() {
        /*
            Method dump skipped, instruction units count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.auth.ui.login.QRCodeLoginVerifyFragment.SR():void");
    }

    @Override // com.ss.android.ugc.aweme.account.loginapproval.BaseConfirmLoginPageFragment
    public final void ZR() {
        C19EG activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJLL = (QRCodeLoginVerifyViewModel) new ViewModelProvider(this).get(QRCodeLoginVerifyViewModel.class);
        dS(view);
        String string = requireArguments().getString("from", "");
        this.LLJJJJ = string;
        C1527830prR.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", string);
        C20684815ws.LJIILLIIL("login_approval_show", c2344009Gk.LIZ);
    }
}
