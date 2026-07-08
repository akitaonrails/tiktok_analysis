package com.ss.android.ugc.aweme.live.toplives.watchlater;

import X.C01GW;
import X.C1954807lC;
import X.C452501pT;
import X.C786410Ut5;
import X.C993560bxi;
import X.C993570bxj;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class SectionHeaderCell extends PowerCell<C993570bxj> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 351));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i;
        C993570bxj c993570bxj = (C993570bxj) interfaceC1891350zJl;
        super.onBindItemView(c993570bxj);
        int i2 = C993560bxi.LIZ[c993570bxj.LL.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                i = 2131856909;
            } else {
                throw new C1954807lC();
            }
        } else {
            i = 2131856908;
        }
        ((TextView) this.LL.getValue()).setText(i);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gw7, viewGroup, false);
    }
}
