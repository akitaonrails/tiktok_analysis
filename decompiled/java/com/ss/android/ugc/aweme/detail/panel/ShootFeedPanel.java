package com.ss.android.ugc.aweme.detail.panel;

import X.C10IT;
import X.C12ES;
import X.C14EU;
import X.C14LC;
import X.C21459218yU;
import X.C309690CBz;
import X.C716550S8v;
import X.C786410Ut5;
import Y.ACListenerS154S0100000_19;
import Y.ARunnableS37S0300000_4;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public abstract class ShootFeedPanel extends DetailFragmentPanel {
    public static final /* synthetic */ int F0 = 0;
    public RelativeLayout A0;
    public boolean B0;
    public Drawable C0;
    public Drawable D0;
    public View E0;
    public View z0;

    public abstract void I0(View view);

    public abstract int L0();

    public abstract View M0(RelativeLayout relativeLayout);

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.detail.component.bottom.DetailBottomLegacyAbility
    public void Cu1() {
        Activity activity = this.activity;
        if (activity == null || activity.isFinishing() || getFragment() == null || this.A0 != null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getFragment().getView().findViewById(R.id.cb7);
        if (viewGroup == null) {
            viewGroup = (ViewGroup) getFragment().getView();
        }
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.A0 = relativeLayout;
        viewGroup.addView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        View viewM0 = M0(this.A0);
        this.z0 = viewM0;
        View viewFindViewById = viewM0.findViewById(R.id.cbx);
        this.E0 = viewFindViewById;
        if (viewFindViewById != null) {
            ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
            TextView textView = (TextView) viewGroup2.findViewById(R.id.szn);
            if (textView != null) {
                textView.setText(L0());
                HandlerHook.viewPost(viewGroup2, new ARunnableS37S0300000_4(this, viewGroup2, textView, 6));
            }
            C786410Ut5.I7(new ACListenerS154S0100000_19((Object) this, 101), this.E0);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        this.A0.addView(this.z0, layoutParams);
        View view = new View(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) C12ES.LIZJ(12.0f, getContext()));
        layoutParams2.addRule(6, this.z0.getId());
        this.A0.addView(view, layoutParams2);
    }

    public final void F0() {
        if (this.z0 != null) {
            if (C10IT.LJIIJJI(LJIIIIZZ())) {
                C786410Ut5.LJLLLLLL(4, this.z0);
            } else {
                C786410Ut5.LJLLLLLL(0, this.z0);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void LLILII() {
        super.LLILII();
        F0();
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public void LLJJJJLIIL() {
        super.LLJJJJLIIL();
        F0();
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC739960T0w
    public void initPanel() {
        super.initPanel();
        F0();
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.C14LF
    public void y() {
        super.y();
        View view = this.z0;
        if (view != null) {
            view.getContext();
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.z0.getLayoutParams();
            int i = C14LC.LJIILLIIL;
            C14LC c14lc = C309690CBz.LIZ;
            c14lc.getClass();
            int iLIZIZ = C14LC.LIZIZ();
            if (i == 0) {
                i = iLIZIZ;
            }
            layoutParams.height = i;
            C786410Ut5.W5(this.z0, layoutParams);
            if (c14lc.LJFF) {
                return;
            }
            this.B0 = true;
            View view2 = this.z0;
            View viewFindViewById = view2.findViewById(R.id.htn);
            View viewFindViewById2 = view2.findViewById(R.id.huj);
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            }
            if (viewFindViewById2 != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    @C14EU
    public void onCancelVideoCoverMaskEvent(C716550S8v c716550S8v) {
        View view = this.z0;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    public final void N0(final C21459218yU c21459218yU, final String str) {
        c21459218yU.setText(str);
        C786410Ut5.x3(c21459218yU.getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0hfA
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                View view;
                C786410Ut5.C3(c21459218yU.getViewTreeObserver(), this);
                int measuredWidth = c21459218yU.getMeasuredWidth();
                if (str != null && measuredWidth < c21459218yU.getPaint().measureText(str)) {
                    ShootFeedPanel shootFeedPanel = this.LLILLL;
                    if (!shootFeedPanel.B0 && (view = shootFeedPanel.z0) != null) {
                        shootFeedPanel.getClass();
                        View viewFindViewById = view.findViewById(R.id.htn);
                        View viewFindViewById2 = view.findViewById(R.id.huj);
                        if (viewFindViewById != null) {
                            C786410Ut5.LJLLLLLL(0, viewFindViewById);
                        }
                        if (viewFindViewById2 != null) {
                            C786410Ut5.LJLLLLLL(0, viewFindViewById2);
                        }
                        if (C444960Hcc.LIZJ(shootFeedPanel.getContext()) && viewFindViewById2 != null && viewFindViewById != null) {
                            if (shootFeedPanel.C0 == null) {
                                shootFeedPanel.C0 = viewFindViewById.getBackground();
                            }
                            if (shootFeedPanel.D0 == null) {
                                shootFeedPanel.D0 = viewFindViewById2.getBackground();
                            }
                            viewFindViewById.setBackground(shootFeedPanel.D0);
                            viewFindViewById2.setBackground(shootFeedPanel.C0);
                        }
                    }
                    c21459218yU.LIZJ();
                }
            }
        });
    }
}
