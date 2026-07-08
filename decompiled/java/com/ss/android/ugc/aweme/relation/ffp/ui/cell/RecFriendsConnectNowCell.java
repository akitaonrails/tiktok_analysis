package com.ss.android.ugc.aweme.relation.ffp.ui.cell;

import X.AbstractC1069740dwa;
import X.C0R90;
import X.C1069690dwV;
import X.C1070670dy5;
import X.C1388190mED;
import X.C14LC;
import X.C20684815ws;
import X.C2344009Gk;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C786410Ut5;
import X.C814420VxA;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes17.dex */
public final class RecFriendsConnectNowCell extends RecFriendsTopBaseCell<C1069690dwV> {
    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.cell.RecFriendsTopBaseCell
    public final void R5(AbstractC1069740dwa abstractC1069740dwa) {
        Activity activityLIZ;
        if (!C0R90.LIZ(1200L, this.itemView) && (activityLIZ = C1388190mED.LIZ(this.itemView.getContext())) != null) {
            C1070670dy5.LIZ.getClass();
            C1070670dy5.LIZ(activityLIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.cell.RecFriendsTopBaseCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: S5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C1069690dwV c1069690dwV) {
        Float fValueOf;
        super.onBindItemView(c1069690dwV);
        Context context = this.itemView.getContext();
        TuxIconView tuxIconViewL5 = L5();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_connect_now;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        tuxIconViewL5.setTuxIcon(c419910GdJ);
        ViewGroup.LayoutParams layoutParams = tuxIconViewL5.getLayoutParams();
        if (layoutParams != null) {
            boolean z = C14LC.LJIIIZ;
            if (z) {
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
            } else {
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            }
            C786410Ut5.W5(tuxIconViewL5, layoutParams);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.t_);
            if (z) {
                fValueOf = Float.valueOf(C418440Gaw.LIZIZ(44));
            } else {
                fValueOf = Float.valueOf(C418440Gaw.LIZIZ(48));
            }
            c384050F3z.LIZJ = fValueOf;
            tuxIconViewL5.setBackground(c384050F3z.LIZ(context));
            N5().setText(context.getString(2131824854));
            TuxTextView tuxTextView = this.LLILZIL;
            if (tuxTextView != null) {
                tuxTextView.setText(context.getString(2131824853));
            }
            C786410Ut5.LJLLLLLL(8, I5());
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "find_friends_page");
            C20684815ws.LJIILLIIL("show_connect_now_banner", c2344009Gk.LIZ);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
