package com.bytedance.android.livesdk.billboard.ui.cell;

import X.C01GW;
import X.C1119520fEs;
import X.C20736316Cj;
import X.C452501pT;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class TextCell extends BillboardPowerCell<C1119520fEs> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 108));

    public final TuxTextView S5() {
        return (TuxTextView) this.LL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00da  */
    @Override // com.bytedance.android.livesdk.billboard.ui.cell.BillboardPowerCell
    /* JADX INFO: renamed from: R5, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int N5(X.C1119520fEs r8) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.billboard.ui.cell.TextCell.N5(X.0fEs):int");
    }

    @Override // com.bytedance.android.livesdk.billboard.ui.cell.BillboardPowerCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: T5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C1119520fEs c1119520fEs) {
        int i;
        super.onBindItemView(c1119520fEs);
        S5().setText(c1119520fEs.LL.text);
        TuxTextView tuxTextViewS5 = S5();
        int iN5 = N5(c1119520fEs);
        if (iN5 != 1) {
            if (iN5 != 2) {
                i = 8388627;
            } else {
                i = 17;
            }
        } else {
            i = 8388629;
        }
        tuxTextViewS5.setGravity(i);
        S5().setTuxFont(81);
        S5().setTextColor(C20736316Cj.LIZIZ(R.attr.eyw, getContext()));
        L5(S5(), c1119520fEs.LL.textStyle);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.g01, viewGroup, false);
    }
}
