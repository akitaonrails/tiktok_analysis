package com.ss.android.ugc.aweme.detail.panel;

import X.C01GW;
import X.C1367960lha;
import X.C1620930sHb;
import X.C2189821An6;
import X.C452501pT;
import X.C786410Ut5;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class PoiAmusementPanel extends DetailFragmentPanel {
    public final C01GW A0;
    public final C01GW B0;
    public final C01GW C0;
    public FrameLayout D0;
    public FrameLayout E0;
    public FrameLayout F0;
    public final Bundle z0;

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.detail.component.bottom.DetailBottomLegacyAbility
    public final void Cu1() {
        Context context;
        Context context2;
        Context context3;
        Activity activity = this.activity;
        if (activity == null || activity.isFinishing() || getFragment() == null) {
            return;
        }
        Fragment fragment = getFragment();
        if (fragment != null && (context3 = getContext()) != null) {
            View view = getFragment().getView();
            View viewFindViewById = view != null ? view.findViewById(R.id.cb7) : null;
            ViewGroup viewGroup = viewFindViewById instanceof ViewGroup ? (ViewGroup) viewFindViewById : null;
            if (this.D0 == null) {
                FrameLayout frameLayout = new FrameLayout(context3);
                this.D0 = frameLayout;
                C1367960lha.LIZ.getClass();
                C1367960lha.LIZ().LLI(frameLayout, fragment);
                if (viewGroup != null) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams.gravity = 80;
                    viewGroup.addView(frameLayout, layoutParams);
                }
            }
        }
        if (getFragment() != null && (context2 = getContext()) != null) {
            View view2 = getFragment().getView();
            View viewFindViewById2 = view2 != null ? view2.findViewById(R.id.cb7) : null;
            ViewGroup viewGroup2 = viewFindViewById2 instanceof ViewGroup ? (ViewGroup) viewFindViewById2 : null;
            if (this.E0 == null) {
                FrameLayout frameLayout2 = new FrameLayout(context2);
                this.E0 = frameLayout2;
                C1367960lha.LIZ.getClass();
                C1367960lha.LIZ().LJIILL(this.z0, frameLayout2, getChildFragmentManager());
                if (viewGroup2 != null) {
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams2.gravity = 80;
                    viewGroup2.addView(frameLayout2, layoutParams2);
                }
            }
            FrameLayout frameLayout3 = this.E0;
            if (frameLayout3 != null) {
                C786410Ut5.LJZ(8, frameLayout3);
            }
        }
        Fragment fragment2 = getFragment();
        if (fragment2 != null && (context = getContext()) != null) {
            View view3 = getFragment().getView();
            View viewFindViewById3 = view3 != null ? view3.findViewById(R.id.cb7) : null;
            ViewGroup viewGroup3 = viewFindViewById3 instanceof ViewGroup ? (ViewGroup) viewFindViewById3 : null;
            if (this.F0 == null) {
                FrameLayout frameLayout4 = new FrameLayout(context);
                this.F0 = frameLayout4;
                C1367960lha.LIZ.getClass();
                C1367960lha.LIZ().LJIILLIIL(frameLayout4, fragment2);
                if (viewGroup3 != null) {
                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams3.gravity = 80;
                    viewGroup3.addView(frameLayout4, layoutParams3);
                }
            }
        }
        this.LLJJIJI.LIZJ(new C1620930sHb(this, 3));
    }

    public PoiAmusementPanel(Bundle bundle, C2189821An6 c2189821An6) {
        super(c2189821An6);
        this.z0 = bundle;
        this.A0 = C452501pT.LIZIZ(new AwS568S0100000_24(this, 258));
        this.B0 = C452501pT.LIZIZ(new AwS568S0100000_24(this, 260));
        this.C0 = C452501pT.LIZIZ(new AwS568S0100000_24(this, 259));
    }
}
