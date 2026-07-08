package com.ss.android.ugc.aweme.detail.panel;

import X.C0WZX;
import X.C0XQ7;
import X.C11VF;
import X.C1390130mHL;
import X.C2204961BRm;
import X.C384050F3z;
import X.C418440Gaw;
import X.C786410Ut5;
import Y.ACListenerS154S0100000_19;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public final class AddVideoPreviewPanel extends ShootFeedPanel {
    public final String G0;
    public final String H0;
    public RelativeLayout I0;
    public View J0;
    public C1390130mHL K0;
    public final String L0 = C0XQ7.LJFF().getCurUserId();

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final int L0() {
        return R.string.m6n;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel, com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.detail.component.bottom.DetailBottomLegacyAbility
    public final void Cu1() {
        View viewFindViewById;
        Activity activity = this.activity;
        if (activity == null || activity.isFinishing() || getFragment() == null || this.I0 != null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getFragment().getView();
        if (viewGroup != null && (viewFindViewById = viewGroup.findViewById(R.id.ltz)) != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        ViewGroup viewGroup2 = viewGroup != null ? (ViewGroup) viewGroup.findViewById(R.id.ija) : null;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.bki, viewGroup2, false);
        this.J0 = viewTd;
        if (viewGroup2 != null) {
            viewGroup2.addView(viewTd);
        }
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.I0 = relativeLayout;
        viewGroup.addView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        View viewM0 = M0(this.I0);
        this.z0 = viewM0;
        ViewGroup viewGroup3 = (ViewGroup) viewM0.findViewById(R.id.cbx);
        if (viewGroup3 != null) {
            C786410Ut5.K7(viewGroup3, new ACListenerS154S0100000_19((Object) this, 96));
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
            viewGroup3.setBackground(c384050F3z.LIZ(viewGroup3.getContext()));
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        RelativeLayout relativeLayout2 = this.I0;
        if (relativeLayout2 != null) {
            relativeLayout2.addView(this.z0, layoutParams);
        }
        C1390130mHL c1390130mHL = new C1390130mHL(getContext(), null, 6);
        c1390130mHL.setMessage(R.string.txr);
        C786410Ut5.LLZ(c1390130mHL, 8);
        this.K0 = c1390130mHL;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        RelativeLayout relativeLayout3 = this.I0;
        if (relativeLayout3 != null) {
            relativeLayout3.addView(this.K0, layoutParams2);
        }
        C11VF.LIZIZ.LJII(this.G0);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final void I0(View view) throws Throwable {
        C1390130mHL c1390130mHL = this.K0;
        if (c1390130mHL != null && c1390130mHL.getVisibility() == 0) {
            return;
        }
        C11VF c11vf = C11VF.LIZIZ;
        c11vf.LJIIJ();
        if (!this.L0.equals(this.H0) && this.activity != null) {
            C1390130mHL c1390130mHL2 = this.K0;
            if (c1390130mHL2 != null) {
                C786410Ut5.LLZ(c1390130mHL2, 0);
            }
            c11vf.LJFF(this.activity, getAid());
            return;
        }
        Activity activity = this.activity;
        if (activity != null) {
            C2204961BRm.LJIILIIL(activity, -1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO6td57H0Hx2mTZlVHtD+Xfi/VhEpOVYmByn7HOjcO56Rw==", null));
        }
        Activity activity2 = this.activity;
        if (activity2 == null) {
            return;
        }
        activity2.finish();
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final View M0(RelativeLayout relativeLayout) {
        return C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.ble, relativeLayout, false);
    }

    public AddVideoPreviewPanel(String str, String str2) {
        this.G0 = str;
        this.H0 = str2;
    }
}
