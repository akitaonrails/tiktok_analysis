package com.ss.android.ugc.aweme.account.login.passkey;

import X.C0HTI;
import X.C1237010iIN;
import X.C1308910kAL;
import X.C19EG;
import X.C786410Ut5;
import Y.ACListenerS154S0100000_19;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public final class SettingsPasskeySetupFragment extends BasePasskeySetUpFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0ISHELIOStiOS4gOy4pMGEALTE4ICE0OxUtOjw4LTwfLDsmOAM+KCg+LSs4";

    @Override // com.ss.android.ugc.aweme.account.login.passkey.BasePasskeySetUpFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        C1237010iIN c1237010iINIS = super.iS();
        C19EG activity = getActivity();
        if (activity != null) {
            ImageView imageView = (ImageView) this.LLLIL.getValue();
            if (imageView != null) {
                C0HTI c0hti = new C0HTI();
                c0hti.LIZ = R.drawable.rj;
                imageView.setImageDrawable(c0hti.LIZ(imageView.getContext()));
            }
            TextView textView = (TextView) this.LLLILZ.getValue();
            if (textView != null) {
                textView.setText(activity.getString(2131839121));
            }
            NS(R.raw.icon_shield_tick, 2131826584);
            NS(R.raw.icon_globe_tick, 2131826583);
            View view = (View) this.LLLIZZ.getValue();
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            TuxTextView tuxTextView = (TuxTextView) this.LLLIZZ.getValue();
            if (tuxTextView != null) {
                int[][] iArr = {new int[]{android.R.attr.state_focused, android.R.attr.state_pressed}, new int[0]};
                int[] iArr2 = new int[2];
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.uh, activity);
                iArr2[0] = numLIZJ != null ? numLIZJ.intValue() : 0;
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, activity);
                iArr2[1] = numLIZJ2 != null ? numLIZJ2.intValue() : 0;
                tuxTextView.setTextColor(new ColorStateList(iArr, iArr2));
                C786410Ut5.h9(tuxTextView, new ACListenerS154S0100000_19(this, 30));
            }
            View view2 = (View) this.LLLJ.getValue();
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
            c1237010iINIS.LJIIL = false;
            c1237010iINIS.LIZ = " ";
            c1237010iINIS.LJI = true;
        }
        return c1237010iINIS;
    }
}
