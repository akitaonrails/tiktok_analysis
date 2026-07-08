package com.ss.android.ugc.aweme.relation.ffp.ui.cell;

import X.AbstractC1069740dwa;
import X.C05HZ;
import X.C1069710dwX;
import X.C14LC;
import X.C197039127h;
import X.C23250099c;
import X.C296060Bj2;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C786410Ut5;
import X.C814420VxA;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes17.dex */
public final class RecFriendsInviteCell extends RecFriendsTopBaseCell<C1069710dwX> {
    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.cell.RecFriendsTopBaseCell
    public final void R5(AbstractC1069740dwa abstractC1069740dwa) {
        C1069710dwX c1069710dwX = (C1069710dwX) abstractC1069740dwa;
        if (C296060Bj2.LIZIZ) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C05HZ(this, null), 3);
            return;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.itemView.getContext(), "//friends/invite");
        smartRouteBuildRoute.withParam("enter_from", c1069710dwX.LL.LIZ);
        smartRouteBuildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.cell.RecFriendsTopBaseCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: S5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C1069710dwX c1069710dwX) {
        View view;
        Float fValueOf;
        super.onBindItemView(c1069710dwX);
        Context context = this.itemView.getContext();
        boolean z = C296060Bj2.LIZIZ;
        Integer numValueOf = Integer.valueOf(R.attr.ee);
        if (z) {
            TuxIconView tuxIconViewL5 = L5();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_arrow_turn_up_right_fill;
            c419910GdJ.LJ = numValueOf;
            boolean z2 = C14LC.LJIIIZ;
            if (z2) {
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
            } else {
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            }
            tuxIconViewL5.setTuxIcon(c419910GdJ);
            ViewGroup.LayoutParams layoutParams = tuxIconViewL5.getLayoutParams();
            if (layoutParams != null) {
                if (z2) {
                    layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
                    layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
                } else {
                    layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                    layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                }
                C786410Ut5.W5(tuxIconViewL5, layoutParams);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.tc);
                if (z2) {
                    fValueOf = Float.valueOf(C418440Gaw.LIZIZ(44));
                } else {
                    fValueOf = Float.valueOf(C418440Gaw.LIZIZ(48));
                }
                c384050F3z.LIZJ = fValueOf;
                tuxIconViewL5.setBackground(c384050F3z.LIZ(context));
                N5().setText(context.getText(2131839076));
                TuxTextView tuxTextView = this.LLILZIL;
                if (tuxTextView != null) {
                    tuxTextView.setText(context.getText(2131839075));
                }
                C786410Ut5.LJLLLLLL(8, I5());
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        TuxIconView tuxIconViewL52 = L5();
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_arrow_turn_up_right_fill;
        c419910GdJ2.LJ = numValueOf;
        c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(21));
        c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(21));
        tuxIconViewL52.setTuxIcon(c419910GdJ2);
        ViewGroup.LayoutParams layoutParams2 = tuxIconViewL52.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
            layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
            C786410Ut5.W5(tuxIconViewL52, layoutParams2);
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.te);
            c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(36));
            tuxIconViewL52.setBackground(c384050F3z2.LIZ(context));
            N5().setText(context.getText(2131834657));
            C197039127h c197039127h = this.LLILLL;
            if (c197039127h == null) {
                c197039127h = null;
            }
            C786410Ut5.LJLLLLLL(8, c197039127h);
            C786410Ut5.LJLLLLLL(8, I5());
            Object parent = I5().getParent();
            if (!(parent instanceof View) || (view = (View) parent) == null) {
                return;
            }
            C786410Ut5.LJLLLLLL(0, view);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
