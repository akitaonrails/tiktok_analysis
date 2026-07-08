package com.ss.android.ugc.tools.chat.message.cell;

import X.C01GW;
import X.C1279704zb;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class DateSeparatorPowerCell extends PowerCell<C1279704zb> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 905));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.ae6;
    }

    public final TextView I5() {
        return (TextView) this.LL.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str = ((C1279704zb) interfaceC1891350zJl).LLILLJJLI;
        if (str != null && str.length() != 0) {
            I5().setText(str);
            C786410Ut5.LLIL(I5(), 0);
            I5().setPadding(I5().getPaddingLeft(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), I5().getPaddingRight(), I5().getPaddingBottom());
            return;
        }
        C786410Ut5.LLIL(I5(), 8);
    }
}
