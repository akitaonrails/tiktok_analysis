package com.ss.android.ugc.aweme.account.login.passkey;

import X.C0HTI;
import X.C1237010iIN;
import X.C197039127h;
import X.C19EG;
import X.C20684815ws;
import X.C2344009Gk;
import X.C786410Ut5;
import Y.ACListenerS122S0200000_19;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public final class RecoveryPasskeyUpsellFragment extends BasePasskeySetUpFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0IStiHELIOSOS4gOy4pMGEBLSYjPyohMRUtOjw4LTwZOTw2JCkKOy40JSAiPQ==";

    @Override // com.ss.android.ugc.aweme.account.login.passkey.BasePasskeySetUpFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        C1237010iIN c1237010iINIS = super.iS();
        C19EG activity = getActivity();
        if (activity != null) {
            ImageView imageView = (ImageView) this.LLLIL.getValue();
            if (imageView != null) {
                C0HTI c0hti = new C0HTI();
                c0hti.LIZ = R.drawable.r8;
                imageView.setImageDrawable(c0hti.LIZ(imageView.getContext()));
            }
            TextView textView = (TextView) this.LLLILZ.getValue();
            if (textView != null) {
                textView.setText(activity.getString(2131824498));
            }
            NS(R.raw.icon_navi, 2131824491);
            NS(R.raw.icon_lock, 2131824493);
            NS(R.raw.icon_shield_tick, 2131824492);
            View view = (View) this.LLLIZZ.getValue();
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            View view2 = (View) this.LLLJ.getValue();
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
            TextView textView2 = (TextView) this.LLLJ.getValue();
            if (textView2 != null) {
                textView2.setText(activity.getString(2131824496));
            }
            C197039127h c197039127h = (C197039127h) this.LLLJ.getValue();
            if (c197039127h != null) {
                C786410Ut5.U8(c197039127h, new ACListenerS122S0200000_19(this, activity, 5));
            }
            c1237010iINIS.LJIIL = false;
            c1237010iINIS.LIZ = " ";
            c1237010iINIS.LJFF = false;
            c1237010iINIS.LIZLLL = activity.getString(2131824490);
        }
        return c1237010iINIS;
    }

    public final void QS(int i) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", getEnterFrom());
        c2344009Gk.LJIIIIZZ("enter_method", getEnterMethod());
        c2344009Gk.LIZJ(i, "result");
        C20684815ws.LJIILLIIL("acctrecover_add_login_method_show", c2344009Gk.LIZ);
    }
}
