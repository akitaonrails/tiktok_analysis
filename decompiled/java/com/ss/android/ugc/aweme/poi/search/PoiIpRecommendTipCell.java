package com.ss.android.ugc.aweme.poi.search;

import X.C06T9;
import X.C20642515q3;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes3.dex */
public final class PoiIpRecommendTipCell extends PowerCell<C06T9> {
    public TuxTextView LL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int iIntValue;
        int iIntValue2;
        C06T9 c06t9 = (C06T9) interfaceC1891350zJl;
        super.onBindItemView(c06t9);
        TuxTextView tuxTextView = this.LL;
        TuxTextView tuxTextView2 = null;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        Integer num = c06t9.LL;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 2131844792;
        }
        tuxTextView.setText(C20642515q3.LJI(iIntValue));
        TuxTextView tuxTextView3 = this.LL;
        if (tuxTextView3 != null) {
            tuxTextView2 = tuxTextView3;
        }
        Integer num2 = c06t9.LLILLJJLI;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = 1;
        }
        tuxTextView2.setMaxLines(iIntValue2);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        TuxTextView tuxTextView = (TuxTextView) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e1s, viewGroup, false);
        this.LL = tuxTextView;
        return tuxTextView;
    }
}
