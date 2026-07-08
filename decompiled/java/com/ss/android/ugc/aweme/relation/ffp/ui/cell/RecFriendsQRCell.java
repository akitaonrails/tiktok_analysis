package com.ss.android.ugc.aweme.relation.ffp.ui.cell;

import X.AbstractC1069740dwa;
import X.C1069720dwY;
import X.C1069760dwc;
import X.C14LC;
import X.C23250099c;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C786410Ut5;
import X.C814420VxA;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes17.dex */
public final class RecFriendsQRCell extends RecFriendsTopBaseCell<C1069720dwY> {
    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.cell.RecFriendsTopBaseCell
    public final void R5(AbstractC1069740dwa abstractC1069740dwa) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1069760dwc(this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.cell.RecFriendsTopBaseCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: S5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C1069720dwY c1069720dwY) {
        Float fValueOf;
        super.onBindItemView(c1069720dwY);
        Context context = this.itemView.getContext();
        TuxIconView tuxIconViewL5 = L5();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_qr_code_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        boolean z = C14LC.LJIIIZ;
        if (z) {
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
        } else {
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        }
        tuxIconViewL5.setTuxIcon(c419910GdJ);
        ViewGroup.LayoutParams layoutParams = tuxIconViewL5.getLayoutParams();
        if (layoutParams != null) {
            if (z) {
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
            } else {
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            }
            C786410Ut5.W5(tuxIconViewL5, layoutParams);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.td);
            if (z) {
                fValueOf = Float.valueOf(C418440Gaw.LIZIZ(44));
            } else {
                fValueOf = Float.valueOf(C418440Gaw.LIZIZ(48));
            }
            c384050F3z.LIZJ = fValueOf;
            tuxIconViewL5.setBackground(c384050F3z.LIZ(context));
            N5().setText(context.getText(2131839074));
            TuxTextView tuxTextView = this.LLILZIL;
            if (tuxTextView != null) {
                tuxTextView.setText(context.getText(2131839073));
            }
            C786410Ut5.LJLLLLLL(8, I5());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
