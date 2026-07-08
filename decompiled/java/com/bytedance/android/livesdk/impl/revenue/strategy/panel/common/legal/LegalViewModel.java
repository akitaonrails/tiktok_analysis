package com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.legal;

import X.C01GW;
import X.C1143850fs7;
import X.C16F5;
import X.C1A12;
import X.C1A13;
import X.C1A14;
import X.C1A16;
import X.C20588115hH;
import X.C452501pT;
import X.InterfaceC0148002o;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.widget.TextView;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AwS399S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS612S0100000_33;
import webcast.data.TPText;

/* JADX INFO: loaded from: classes34.dex */
public final class LegalViewModel extends AssemViewModel<C1A13> {
    public final TouchPointAbility LL;
    public final C1A12 LLILLJJLI = new C1A12(0);
    public final C1A12 LLILLL = new C1A12(0);
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 219));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 218));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1A13(0);
    }

    public final void yQ2() {
        int i = C1A16.LIZ[getState().LL.ordinal()];
        setState(new AwS612S0100000_33((i == 1 || i == 2 || i == 3) ? C1A14.UNFOLD : C1A14.FOLD, 28));
    }

    public LegalViewModel(TouchPointAbility touchPointAbility) {
        this.LL = touchPointAbility;
    }

    public final void vQ2(boolean z) {
        C1A12 c1a12;
        C1A14 c1a14;
        if (z) {
            c1a12 = this.LLILLJJLI;
        } else {
            c1a12 = this.LLILLL;
        }
        if (c1a12.LIZIZ > 2) {
            if (z) {
                c1a14 = C1A14.INIT_FOLD_RECHARGE;
            } else {
                c1a14 = C1A14.INIT_FOLD_EXCHANGE;
            }
        } else {
            c1a14 = C1A14.NO_FOLD;
        }
        setState(new AwS399S0200000_33(c1a14, c1a12, 3));
    }

    public final void wQ2(C16F5 c16f5, int i) {
        CharSequence charSequenceLIZLLL;
        SpannableStringBuilder spannableStringBuilderLIZLLL;
        c16f5.setScrollContainer(false);
        C1A12 c1a12 = this.LLILLJJLI;
        TPText tPText = (TPText) this.LLILZ.getValue();
        c1a12.LIZ = tPText;
        CharSequence charSequence = "";
        if (tPText == null || (charSequenceLIZLLL = C1143850fs7.LIZLLL(C1143850fs7.LIZ, tPText)) == null) {
            charSequenceLIZLLL = "";
        }
        c1a12.LIZIZ = xQ2(i, c16f5, charSequenceLIZLLL);
        C1A12 c1a122 = this.LLILLL;
        TPText tPText2 = (TPText) this.LLILZIL.getValue();
        c1a122.LIZ = tPText2;
        if (tPText2 != null && (spannableStringBuilderLIZLLL = C1143850fs7.LIZLLL(C1143850fs7.LIZ, tPText2)) != null) {
            charSequence = spannableStringBuilderLIZLLL;
        }
        c1a122.LIZIZ = xQ2(i, c16f5, charSequence);
    }

    public static int xQ2(int i, TextView textView, CharSequence charSequence) {
        return C20588115hH.LIZLLL(textView, charSequence, new TextPaint(textView.getPaint()), i, Float.valueOf(textView.getTextSize()), true).getLineCount();
    }
}
