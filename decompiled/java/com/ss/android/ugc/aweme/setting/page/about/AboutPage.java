package com.ss.android.ugc.aweme.setting.page.about;

import X.C01GW;
import X.C0OM1;
import X.C0W9I;
import X.C1237450iJ5;
import X.C19305810fw;
import X.C19318810i2;
import X.C19319710iB;
import X.C452501pT;
import X.C844470XAv;
import X.DialogC19319910iD;
import X.InterfaceC836760Ws6;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
@InterfaceC836760Ws6
public final class AboutPage extends BasePage {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpHELIOSPTs6JiJiOS40LWstKyAmPGsNKyAmPBUtLio=";
    public ViewOnAttachStateChangeListenerC20604515jv LLJ;
    public TuxNavBar LLJI;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 527));
    public C19305810fw LLJILJIL;
    public TextView LLJILJILJ;
    public DialogC19319910iD LLJILLL;

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int UR() {
        return R.layout.f5k;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJ = null;
        this.LLJI = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        this.LLJILJILJ = (TextView) view.findViewById(R.id.version);
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LLJI;
        C19305810fw c19305810fw = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.p15);
            } else {
                viewFindViewById = null;
            }
            this.LLJI = (TuxNavBar) viewFindViewById;
        }
        C0OM1 c0om1 = new C0OM1();
        C1237450iJ5.LIZIZ(c0om1, "", new AwS572S0100000_28(this, 526));
        ((TuxNavBar) viewFindViewById).setNavActions(c0om1);
        TextView textView = this.LLJILJILJ;
        if (textView == null) {
            textView = null;
        }
        StringBuilder sb = new StringBuilder("v");
        C844470XAv.LIZ.getClass();
        String strLIZJ = C844470XAv.LIZJ();
        if (TextUtils.isEmpty(strLIZJ)) {
            strLIZJ = "1.0";
        }
        sb.append(strLIZJ);
        sb.append(" Build ");
        sb.append(C844470XAv.LJIILL);
        sb.append("_");
        sb.append(C0W9I.LIZIZ(getContext()).LIZ("release_build", ""));
        textView.setText(sb.toString());
        C19318810i2 c19318810i2 = (C19318810i2) this.LLJIJIL.getValue();
        int i = 130542;
        C19305810fw c19305810fw2 = new C19305810fw(new C19319710iB("", getString(2131858261), null, getString(2131838489), 0 == true ? 1 : 0, i));
        this.LLJILJIL = c19305810fw2;
        c19318810i2.LIZ(c19305810fw2);
        ((C19318810i2) this.LLJIJIL.getValue()).LIZ(new C19305810fw(new C19319710iB(getString(2131828858), getString(2131838487), 0 == true ? 1 : 0, getString(2131833838), 0 == true ? 1 : 0, i)));
        C19305810fw c19305810fw3 = this.LLJILJIL;
        if (c19305810fw3 != null) {
            c19305810fw = c19305810fw3;
        }
        c19305810fw.LJI(new AwS607S0100000_28(this, 287));
    }
}
