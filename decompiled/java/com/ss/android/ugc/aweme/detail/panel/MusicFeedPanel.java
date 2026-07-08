package com.ss.android.ugc.aweme.detail.panel;

import X.C1387620mDI;
import X.C21459218yU;
import X.C786410Ut5;
import Y.ACListenerS155S0100000_21;
import Y.ARunnableS112S0100000_12;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public class MusicFeedPanel extends ShootFeedPanel {
    public static final /* synthetic */ int L0 = 0;
    public View G0;
    public TuxIconView H0;
    public View I0;
    public TextView J0;
    public View K0;

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final void I0(View view) {
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final int L0() {
        return 2131857990;
    }

    public final void P0() {
        View view = this.G0;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        View view2 = this.E0;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        TuxIconView tuxIconView = this.H0;
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        }
        View view3 = this.I0;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(8, view3);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel, com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void LLJJJJLIIL() {
        super.LLJJJJLIIL();
        if (LJIIIIZZ() != null && LJIIIIZZ().getAwemeType() == 65) {
            P0();
            TextView textView = this.J0;
            if (textView != null) {
                textView.setText(getContext().getString(2131857994));
            }
        } else if (LJIIIIZZ() == null || LJIIIIZZ().getCcTemplateInfo() == null || !LJIIIIZZ().getCcTemplateInfo().isTemplateBottomStyleSingleBtn()) {
            View view = this.G0;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            View view2 = this.E0;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
            TuxIconView tuxIconView = this.H0;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            }
            View view3 = this.I0;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(0, view3);
            }
            View view4 = this.K0;
            if (view4 != null) {
                C786410Ut5.LJLLLLLL(8, view4);
            }
            if (LJIIIIZZ() != null) {
                C1387620mDI c1387620mDI = C1387620mDI.LIZ;
                Aweme awemeLJIIIIZZ = LJIIIIZZ();
                c1387620mDI.getClass();
                if (C1387620mDI.LJFF(awemeLJIIIIZZ) && LJIIIIZZ().getCcTemplateInfo() != null && LJIIIIZZ().getCcTemplateInfo().isTemplateBottomStyleDoubleBtn()) {
                    TuxIconView tuxIconView2 = this.H0;
                    if (tuxIconView2 != null) {
                        C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
                    }
                    View view5 = this.I0;
                    if (view5 != null) {
                        C786410Ut5.LJLLLLLL(8, view5);
                    }
                    View view6 = this.K0;
                    if (view6 != null) {
                        C786410Ut5.LJLLLLLL(0, view6);
                    }
                }
            }
        } else {
            P0();
            TextView textView2 = this.J0;
            if (textView2 != null) {
                textView2.setText(getContext().getString(2131828423));
            }
        }
        if (LJIIIIZZ() == null || LJIIIIZZ().getAwemeType() != 65) {
            C1387620mDI c1387620mDI2 = C1387620mDI.LIZ;
            Aweme awemeLJIIIIZZ2 = LJIIIIZZ();
            c1387620mDI2.getClass();
            if (!C1387620mDI.LJFF(awemeLJIIIIZZ2)) {
                return;
            }
        }
        if (this.G0 != null) {
            HandlerHook.viewPost(this.G0, new ARunnableS112S0100000_12((Object) this, 173));
        }
    }

    public final void O0() {
        if (LJIIIIZZ() == null || LJIIIIZZ().getCcTemplateInfo() == null) {
            return;
        }
        C1387620mDI c1387620mDI = C1387620mDI.LIZ;
        Aweme awemeLJIIIIZZ = LJIIIIZZ();
        String previousPage = getPreviousPage();
        String fromGroupId = this.LLLLIIIILLL.getFromGroupId();
        Context context = getContext();
        c1387620mDI.getClass();
        C1387620mDI.LIZLLL(context, awemeLJIIIIZZ, previousPage, fromGroupId);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final View M0(RelativeLayout relativeLayout) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.blg, relativeLayout, false);
        TuxIconView tuxIconView = (TuxIconView) viewTd.findViewById(R.id.ovk);
        this.H0 = tuxIconView;
        C786410Ut5.LLLLLLZZ(tuxIconView, 0);
        this.I0 = viewTd.findViewById(R.id.o00);
        View viewFindViewById = viewTd.findViewById(R.id.cc7);
        this.G0 = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 62), viewFindViewById);
        }
        this.J0 = (TextView) viewTd.findViewById(R.id.dkd);
        this.K0 = viewTd.findViewById(R.id.nzz);
        if (viewTd.findViewById(R.id.o0v) != null) {
            C21459218yU c21459218yU = (C21459218yU) viewTd.findViewById(R.id.o0v);
            c21459218yU.setTuxFont(42);
            N0(c21459218yU, getContext().getString(2131828423));
        }
        View view = this.K0;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 63), view);
            C786410Ut5.LJLLLLLL(8, this.K0);
        }
        return viewTd;
    }
}
