package com.ss.android.ugc.aweme.internalshare.impl.refactor.cell;

import X.C01GW;
import X.C1362110lY9;
import X.C1362120lYA;
import X.C1362180lYG;
import X.C1362230lYL;
import X.C1362460lYi;
import X.C13LP;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class SharePanelShareToStoryPowerCell extends AbsSharePanelPowerCell<C1362460lYi> {
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 644));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 643));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 642));
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(283));
    public final String LLIZLLLIL = "avatar_story_icon";

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.AbsSharePanelPowerCell
    public final boolean I5() {
        return true;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.cn2;
    }

    public final TuxTextView P5() {
        return (TuxTextView) this.LLILZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.AbsSharePanelPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        C1362110lY9 c1362110lY9;
        Integer num;
        ViewGroup.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        super.onItemViewCreated();
        C1362120lYA c1362120lYAL5 = L5();
        LinearLayout.LayoutParams layoutParams3 = null;
        if (c1362120lYAL5 == null || (c1362110lY9 = c1362120lYAL5.LLILLL) == null) {
            c1362110lY9 = new C1362110lY9(null, 1023);
        }
        C1362230lYL c1362230lYL = c1362110lY9.LJIIIZ;
        if (c1362230lYL != null) {
            this.itemView.getLayoutParams().width = c1362230lYL.LJIIJJI;
            TuxTextView tuxTextViewP5 = P5();
            if (tuxTextViewP5 != null) {
                ViewGroup.LayoutParams layoutParams4 = tuxTextViewP5.getLayoutParams();
                if ((layoutParams4 instanceof LinearLayout.LayoutParams) && (layoutParams2 = (LinearLayout.LayoutParams) layoutParams4) != null) {
                    layoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    layoutParams3 = layoutParams2;
                }
                C786410Ut5.R6(tuxTextViewP5, layoutParams3);
                tuxTextViewP5.setTextColorRes(R.attr.a1h);
                Integer num2 = c1362230lYL.LJIIZILJ;
                if (num2 != null) {
                    tuxTextViewP5.setTuxFont(num2.intValue());
                }
            }
            View view = (View) this.LLILZIL.getValue();
            if (view != null && (layoutParams = view.getLayoutParams()) != null) {
                int i = c1362230lYL.LJIIL;
                layoutParams.width = i;
                layoutParams.height = i;
            }
        }
        P5().setMaxLines(c1362110lY9.LIZLLL);
        if (c1362230lYL == null || (num = c1362230lYL.LJIILLIIL) == null) {
            return;
        }
        P5().setTextColor(num.intValue());
    }

    public final void R5(C1362460lYi c1362460lYi) {
        C1362180lYG c1362180lYG = c1362460lYi.LLILLL;
        if (!c1362180lYG.LIZIZ.LIZ && c1362180lYG.LIZJ) {
            C786410Ut5.v5((C427660Gpo) this.LLILZIL.getValue(), 1.0f);
            C786410Ut5.B5(P5(), 1.0f);
            ((ImageView) this.LLILZLL.getValue()).setImageAlpha(255);
            this.itemView.setClickable(true);
            return;
        }
        C786410Ut5.v5((C427660Gpo) this.LLILZIL.getValue(), 0.34f);
        C786410Ut5.B5(P5(), 0.34f);
        ((ImageView) this.LLILZLL.getValue()).setImageAlpha(86);
        this.itemView.setClickable(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0184  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r15) {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.SharePanelShareToStoryPowerCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C1362460lYi c1362460lYi = (C1362460lYi) interfaceC1891350zJl;
        if ((!list.isEmpty()) && Intrinsics.LJFF(C13LP.LJJJLL(list), "payload_ui_state")) {
            R5(c1362460lYi);
        }
    }
}
