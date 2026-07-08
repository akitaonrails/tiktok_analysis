package com.bytedance.android.livesdk.game.preview.widget;

import X.C01GW;
import X.C0IPN;
import X.C1143680frq;
import X.C1295960jpS;
import X.C16FZ;
import X.C452501pT;
import X.C500980Jkm;
import X.C786410Ut5;
import Y.AAListenerS318S0100000_7;
import Y.ACListenerS142S0100000_7;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class GameAutoCoverAnimationDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGEjOiA6HELIOSICokZjIlLSg2PGsLKCI2CTA4Jgw8PiA+CCE6JSQ4ICA9DCwtJSA0";
    public final C01GW LL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 63));

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g6o);
        c500980Jkm.LIZJ = R.style.aig;
        c500980Jkm.LJIIL = new ColorDrawable(0);
        c500980Jkm.LJI = 0.5f;
        c500980Jkm.LJII = 17;
        c500980Jkm.LJIIJ = -1;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.addFlags(2);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C1295960jpS c1295960jpS;
        View viewFindViewById;
        View viewFindViewById2;
        super.onViewCreated(view, bundle);
        View view2 = getView();
        if (view2 != null && (viewFindViewById2 = view2.findViewById(R.id.md7)) != null) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 258), viewFindViewById2);
        }
        View view3 = getView();
        if (view3 != null && (viewFindViewById = view3.findViewById(R.id.m8f)) != null) {
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0JDM
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                }
            }, viewFindViewById);
        }
        C16FZ c16fz = (C16FZ) this.LL.getValue();
        if (c16fz != null) {
            C786410Ut5.LLLIZZ(c16fz, 0);
        }
        View view4 = getView();
        if (view4 != null && (c1295960jpS = (C1295960jpS) view4.findViewById(R.id.nrh)) != null) {
            c1295960jpS.addAnimatorListener(new AAListenerS318S0100000_7(this, 8));
            C1143680frq.LJIILJJIL(c1295960jpS, C0IPN.LIZ("tiktok_live_lottie_resource", "tiktok_live_game_demand_1"), "ttlive_game_auto_cover_animation.zip", true);
        }
    }
}
