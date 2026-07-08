package com.bytedance.android.livesdk.billboard.ui.cell;

import X.C01GW;
import X.C1119530fEt;
import X.C20736316Cj;
import X.C2095008Iq;
import X.C452501pT;
import X.C497740JfY;
import X.C786410Ut5;
import X.C800330VaR;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.text.a0;
import webcast.data.host_board.BoardCell;

/* JADX INFO: loaded from: classes18.dex */
public final class TextTrailingImageCell extends BillboardPowerCell<C1119530fEt> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 109));

    @Override // com.bytedance.android.livesdk.billboard.ui.cell.BillboardPowerCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: R5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C1119530fEt c1119530fEt) {
        byte b;
        int i;
        int iIntValue;
        super.onBindItemView(c1119530fEt);
        BoardCell boardCell = c1119530fEt.LL;
        byte[] bArr = boardCell.paramsData;
        if (bArr != null) {
            b = bArr[0];
        } else {
            b = 1;
        }
        if (b == 1) {
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(boardCell.text);
            if (numLJIIJJI != null) {
                iIntValue = numLJIIJJI.intValue();
            } else {
                iIntValue = 0;
            }
            String strLJIIL = C497740JfY.LJIIL(2131755895, iIntValue, String.valueOf(iIntValue), "icon");
            int iLJJJ = a0.LJJJ(strLJIIL, "icon", 0, false, 6);
            int i2 = iLJJJ + 4;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strLJIIL);
            Drawable drawableLIZIZ = C800330VaR.LIZIZ(C497740JfY.LJII(), R.drawable.elu);
            if (drawableLIZIZ != null) {
                int iLIZIZ = (int) C497740JfY.LIZIZ(12.0f);
                drawableLIZIZ.setBounds(0, 0, iLIZIZ, iLIZIZ);
                C786410Ut5.q2(spannableStringBuilder, new ImageSpan(drawableLIZIZ), iLJJJ, i2, 33);
            }
            ((TextView) this.LL.getValue()).setText(spannableStringBuilder);
        }
        TextView textView = (TextView) this.LL.getValue();
        int i3 = c1119530fEt.LL.alignment;
        if (i3 != 1) {
            if (i3 != 2) {
                i = 8388627;
            } else {
                i = 17;
            }
        } else {
            i = 8388629;
        }
        textView.setGravity(i);
        ((TextView) this.LL.getValue()).setTextColor(C20736316Cj.LIZIZ(R.attr.eyw, getContext()));
        L5((TuxTextView) this.LL.getValue(), c1119530fEt.LL.textStyle);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.g02, viewGroup, false);
    }
}
