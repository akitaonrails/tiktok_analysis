package com.ss.android.ugc.tiktok.im.contact.selector.impl.cell;

import X.C1223780hx2;
import X.C1223790hx3;
import X.C123100dR;
import X.C1383370m6R;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import android.view.View;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public final class SelectorListIndexCell extends PowerCell<C1223790hx3> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.aed;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        C1223790hx3 c1223790hx3 = (C1223790hx3) interfaceC1891350zJl;
        View viewFindViewById = this.itemView.findViewById(R.id.kkt);
        C1223780hx2 c1223780hx2 = c1223790hx3.LLILLJJLI;
        int i = 8;
        if (c1223780hx2 != null && (num7 = c1223780hx2.LIZ) != null) {
            num = null;
            C1383370m6R.LIZJ(viewFindViewById, null, null, null, Integer.valueOf(num7.intValue()), 7);
        } else {
            num = null;
            C1383370m6R.LIZJ(viewFindViewById, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 7);
        }
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.kky);
        if (C123100dR.LIZ(c1223790hx3.LL)) {
            i = 0;
        }
        C786410Ut5.LJLLLLLL(i, tuxTextView);
        tuxTextView.setText(c1223790hx3.LL);
        C1223780hx2 c1223780hx22 = c1223790hx3.LLILLJJLI;
        if (c1223780hx22 != null && (num6 = c1223780hx22.LIZLLL) != null) {
            tuxTextView.setTuxFont(num6.intValue());
        } else {
            tuxTextView.setTuxFont(62);
        }
        C1223780hx2 c1223780hx23 = c1223790hx3.LLILLJJLI;
        if (c1223780hx23 != null && (num5 = c1223780hx23.LJ) != null) {
            tuxTextView.setTextColorRes(num5.intValue());
        } else {
            tuxTextView.setTextColorRes(R.attr.ug);
        }
        C1223780hx2 c1223780hx24 = c1223790hx3.LLILLJJLI;
        if (c1223780hx24 != null && (num4 = c1223780hx24.LIZIZ) != null) {
            num2 = num;
            C1383370m6R.LIZJ(tuxTextView, num2, Integer.valueOf(num4.intValue()), num2, num2, 13);
        } else {
            num2 = num;
            C1383370m6R.LIZJ(tuxTextView, num2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), num2, num2, 13);
        }
        C1223780hx2 c1223780hx25 = c1223790hx3.LLILLJJLI;
        if (c1223780hx25 != null && (num3 = c1223780hx25.LIZJ) != null) {
            C1383370m6R.LIZJ(tuxTextView, num2, num2, num2, Integer.valueOf(num3.intValue()), 7);
        } else {
            C1383370m6R.LIZJ(tuxTextView, num2, num2, num2, 0, 7);
        }
    }
}
