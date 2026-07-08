package com.ss.android.ugc.aweme.detail.panel;

import X.C12ES;
import X.C14LC;
import X.C786410Ut5;
import Y.ACListenerS154S0100000_19;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public abstract class CreateButtonPanel extends DetailFragmentPanel {
    public static final /* synthetic */ int B0 = 0;
    public RelativeLayout A0;
    public View z0;

    public abstract void F0(View view);

    public abstract View I0(RelativeLayout relativeLayout);

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.detail.component.bottom.DetailBottomLegacyAbility
    public final void Cu1() {
        View viewFindViewById;
        Activity activity = this.activity;
        if (activity == null || activity.isFinishing() || getFragment() == null || this.A0 != null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getFragment().getView();
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.A0 = relativeLayout;
        viewGroup.addView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        View viewI0 = I0(this.A0);
        this.z0 = viewI0;
        if (viewI0 != null && (viewFindViewById = viewI0.findViewById(R.id.cbx)) != null) {
            C786410Ut5.I7(new ACListenerS154S0100000_19((Object) this, 99), viewFindViewById);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        this.A0.addView(this.z0, layoutParams);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.C14LF
    public final void y() {
        super.y();
        View view = this.z0;
        if (view != null) {
            Context context = view.getContext();
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.z0.getLayoutParams();
            int iLIZJ = C14LC.LJIILLIIL;
            if (iLIZJ == 0) {
                iLIZJ = (int) C12ES.LIZJ(58.0f, context);
            }
            layoutParams.height = iLIZJ;
            C786410Ut5.W5(this.z0, layoutParams);
        }
    }
}
