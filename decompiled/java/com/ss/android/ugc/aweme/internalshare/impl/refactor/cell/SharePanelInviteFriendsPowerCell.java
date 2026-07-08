package com.ss.android.ugc.aweme.internalshare.impl.refactor.cell;

import X.C01GW;
import X.C1362080lY6;
import X.C1362110lY9;
import X.C1362120lYA;
import X.C1362180lYG;
import X.C1362230lYL;
import X.C13LP;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS89S0100000_21;
import java.util.List;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class SharePanelInviteFriendsPowerCell extends AbsSharePanelPowerCell<C1362080lY6> {
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 638));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 639));

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.AbsSharePanelPowerCell
    public final boolean I5() {
        return true;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.ckv;
    }

    public final TuxIconView R5() {
        return (TuxIconView) this.LLILZ.getValue();
    }

    public final TuxTextView S5() {
        return (TuxTextView) this.LLILZIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.AbsSharePanelPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        C1362110lY9 c1362110lY9;
        Integer num;
        LinearLayout.LayoutParams layoutParams;
        super.onItemViewCreated();
        C1362120lYA c1362120lYAL5 = L5();
        LinearLayout.LayoutParams layoutParams2 = null;
        if (c1362120lYAL5 == null || (c1362110lY9 = c1362120lYAL5.LLILLL) == null) {
            c1362110lY9 = new C1362110lY9(null, 1023);
        }
        C1362230lYL c1362230lYL = c1362110lY9.LJIIIZ;
        if (c1362230lYL != null) {
            this.itemView.getLayoutParams().width = c1362230lYL.LJIIJJI;
            R5().getLayoutParams().width = c1362230lYL.LJIIL;
            R5().getLayoutParams().height = c1362230lYL.LJIIL;
            R5().setIconHeight(c1362230lYL.LJIILIIL);
            R5().setIconWidth(c1362230lYL.LJIILIIL);
            TuxIconView tuxIconViewR5 = R5();
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(c1362230lYL.LJIILIIL);
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a2l);
            tuxIconViewR5.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
            TuxTextView tuxTextViewS5 = S5();
            ViewGroup.LayoutParams layoutParams3 = S5().getLayoutParams();
            if ((layoutParams3 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams3) != null) {
                layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                layoutParams2 = layoutParams;
            }
            C786410Ut5.R6(tuxTextViewS5, layoutParams2);
            Integer num2 = c1362230lYL.LJIIZILJ;
            if (num2 != null) {
                S5().setTuxFont(num2.intValue());
            }
        } else {
            TuxIconView tuxIconViewR52 = R5();
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(24));
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a2l);
            tuxIconViewR52.setBackground(c384050F3z2.LIZ(this.itemView.getContext()));
        }
        R5().setTintColorRes(R.attr.ee);
        C1362230lYL c1362230lYL2 = c1362110lY9.LJIIIZ;
        if (c1362230lYL2 != null && (num = c1362230lYL2.LJIILLIIL) != null) {
            S5().setTextColor(num.intValue());
        }
        S5().setMaxLines(c1362110lY9.LIZLLL);
        S5().setText(this.itemView.getContext().getString(2131847902));
        C786410Ut5.I7(new AkS89S0100000_21(this, 23), this.itemView);
    }

    public final void P5(C1362080lY6 c1362080lY6) {
        C1362180lYG c1362180lYG = c1362080lY6.LLILLL;
        if (!c1362180lYG.LIZIZ.LIZ && c1362180lYG.LIZJ) {
            C786410Ut5.x5(R5(), 1.0f);
            C786410Ut5.B5(S5(), 1.0f);
        } else {
            C786410Ut5.x5(R5(), 0.34f);
            C786410Ut5.B5(S5(), 0.34f);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1362080lY6 c1362080lY6 = (C1362080lY6) interfaceC1891350zJl;
        this.LL.LIZ(c1362080lY6.LL, "SHARE_PANEL", AFwS209S0000000_21.get$arr$(467));
        P5(c1362080lY6);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C1362080lY6 c1362080lY6 = (C1362080lY6) interfaceC1891350zJl;
        if (!list.isEmpty()) {
            Object objLJJJLL = C13LP.LJJJLL(list);
            if (!(objLJJJLL instanceof String)) {
                objLJJJLL = null;
            }
            if (Intrinsics.LJFF(objLJJJLL, "payload_ui_state")) {
                P5(c1362080lY6);
            }
        }
    }
}
