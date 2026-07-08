package com.bytedance.android.livesdk.game.broadcast.dialog;

import X.C1124870fNV;
import X.C1143680frq;
import X.C1143920fsE;
import X.C1143950fsH;
import X.C1322110kVd;
import X.C1533950q1J;
import X.C16F5;
import X.C16FS;
import X.C497740JfY;
import X.C500980Jkm;
import X.C786410Ut5;
import Y.ACListenerS142S0100000_7;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class GameFloatWindowTipsDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExOiotHELIOSLSwyOzFiLSYyJCorZwgyJSAKJSAyPBIlJys8PxElOTwXISQgJig=";
    public C16F5 LL;
    public C16F5 LLILLJJLI;
    public C16FS LLILLL;
    public String LLILZ = "";

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g6m);
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJIILIIL = 48;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIIZ = c500980Jkm.LJIIIZ;
        c500980Jkm.LJIIJ = -2;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1322110kVd c1322110kVd = (C1322110kVd) view.findViewById(R.id.yoy);
        C16FS c16fs = (C16FS) view.findViewById(R.id.yp0);
        C1124870fNV.LIZJ().getClass();
        String strLIZIZ = C1124870fNV.LIZIZ("pm_mt_liveStudio_permission_allowDisplay_actionSheet_header");
        if (strLIZIZ == null) {
            strLIZIZ = C497740JfY.LJIJI(2131842573);
        }
        View viewFindViewById = null;
        if (C1533950q1J.LJ(strLIZIZ)) {
            View viewFindViewById2 = this.LL;
            if (viewFindViewById2 == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById2 = view2.findViewById(R.id.yoz);
                } else {
                    viewFindViewById2 = null;
                }
                this.LL = (C16F5) viewFindViewById2;
            }
            ((TextView) viewFindViewById2).setText(strLIZIZ);
        }
        C1124870fNV.LIZJ().getClass();
        String strLIZIZ2 = C1124870fNV.LIZIZ("pm_mt_liveStudio_permission_allowDisplay_actionSheet_desc");
        if (strLIZIZ2 == null) {
            strLIZIZ2 = C497740JfY.LJIJI(2131842572);
        }
        if (C1533950q1J.LJ(strLIZIZ2)) {
            View viewFindViewById3 = this.LLILLJJLI;
            if (viewFindViewById3 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById3 = view3.findViewById(R.id.yox);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLILLJJLI = (C16F5) viewFindViewById3;
            }
            ((TextView) viewFindViewById3).setText(strLIZIZ2);
        }
        C1124870fNV.LIZJ().getClass();
        String strLIZIZ3 = C1124870fNV.LIZIZ("pm_mt_liveStudio_permission_allowDisplay_actionSheet_button");
        if (strLIZIZ3 == null) {
            strLIZIZ3 = C497740JfY.LJIJI(2131842571);
        }
        if (C1533950q1J.LJ(strLIZIZ3)) {
            View view4 = this.LLILLL;
            if (view4 == null) {
                View view5 = getView();
                if (view5 != null) {
                    viewFindViewById = view5.findViewById(R.id.yp0);
                }
                this.LLILLL = (C16FS) viewFindViewById;
                view4 = viewFindViewById;
            }
            ((C16FS) view4).setText(strLIZIZ3);
        }
        C1143920fsE c1143920fsE = new C1143920fsE();
        c1143920fsE.LIZ = c1322110kVd;
        c1143920fsE.LIZIZ = "tiktok_live_game_demand_2";
        c1143920fsE.LIZJ = "ttlive_float_window_permission_guide_new.webp";
        c1143920fsE.LJFF = true;
        c1143920fsE.LJI = Integer.MAX_VALUE;
        c1143920fsE.LJ = new C1143950fsH() { // from class: X.0IgI
            @Override // X.C1143950fsH
            public final void LJFF(Animatable animatable) {
            }
        };
        C1143680frq.LJIIIIZZ(c1143920fsE);
        C786410Ut5.h8(c16fs, new ACListenerS142S0100000_7(this, 60));
    }
}
