package com.bytedance.android.livesdk.game.broadcast.dialog;

import X.C0IPN;
import X.C1124870fNV;
import X.C1143680frq;
import X.C1324720kZq;
import X.C1533950q1J;
import X.C16F5;
import X.C16FS;
import X.C497740JfY;
import X.C500980Jkm;
import X.C786410Ut5;
import Y.ACListenerS142S0100000_7;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public final class GameScreenShareTipsDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExOiotHELIOSLSwyOzFiLSYyJCorZwgyJSAfKj02LSsfIS4hLRElOTwXISQgJig=";
    public C16F5 LL;
    public C16F5 LLILLJJLI;
    public C16FS LLILLL;
    public C1324720kZq LLILZ;
    public Function0<Unit> LLILZIL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.gao);
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
        this.LLILZ = null;
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
        C1124870fNV.LIZJ().getClass();
        String strLIZIZ = C1124870fNV.LIZIZ("pm_mt_liveStudio_permission_allowRecording_actionSheet_header");
        if (strLIZIZ == null) {
            strLIZIZ = C497740JfY.LJIJI(2131842576);
        }
        View viewFindViewById = null;
        if (C1533950q1J.LJ(strLIZIZ)) {
            View viewFindViewById2 = this.LL;
            if (viewFindViewById2 == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById2 = view2.findViewById(R.id.ype);
                } else {
                    viewFindViewById2 = null;
                }
                this.LL = (C16F5) viewFindViewById2;
            }
            ((TextView) viewFindViewById2).setText(strLIZIZ);
        }
        C1124870fNV.LIZJ().getClass();
        String strLIZIZ2 = C1124870fNV.LIZIZ("pm_mt_liveStudio_permission_allowRecording_actionSheet_desc");
        if (strLIZIZ2 == null) {
            strLIZIZ2 = C497740JfY.LJIJI(2131842575);
        }
        if (C1533950q1J.LJ(strLIZIZ2)) {
            View viewFindViewById3 = this.LLILLJJLI;
            if (viewFindViewById3 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById3 = view3.findViewById(R.id.ypc);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLILLJJLI = (C16F5) viewFindViewById3;
            }
            ((TextView) viewFindViewById3).setText(strLIZIZ2);
        }
        C1124870fNV.LIZJ().getClass();
        String strLIZIZ3 = C1124870fNV.LIZIZ("pm_mt_liveStudio_permission_allowRecording_actionSheet_button2");
        if (strLIZIZ3 == null) {
            strLIZIZ3 = C497740JfY.LJIJI(2131842574);
        }
        if (C1533950q1J.LJ(strLIZIZ3)) {
            View viewFindViewById4 = this.LLILLL;
            if (viewFindViewById4 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById4 = view4.findViewById(R.id.ypf);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLILLL = (C16FS) viewFindViewById4;
            }
            ((C16FS) viewFindViewById4).setText(strLIZIZ3);
        }
        View viewFindViewById5 = this.LLILZ;
        if (viewFindViewById5 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById5 = view5.findViewById(R.id.ypd);
            } else {
                viewFindViewById5 = null;
            }
            this.LLILZ = (C1324720kZq) viewFindViewById5;
        }
        C1143680frq.LIZLLL(viewFindViewById5, C0IPN.LIZ("tiktok_live_broadcast_resource", "tiktok_live_game_demand_1"), "ttlive_screen_share_guide.png");
        View view6 = this.LLILLL;
        if (view6 == null) {
            View view7 = getView();
            if (view7 != null) {
                viewFindViewById = view7.findViewById(R.id.ypf);
            }
            this.LLILLL = (C16FS) viewFindViewById;
            view6 = viewFindViewById;
        }
        C786410Ut5.h8((C16FS) view6, new ACListenerS142S0100000_7(this, 62));
    }
}
