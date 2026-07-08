package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.cell;

import X.C005U;
import X.C1189060h32;
import X.C1546210qL5;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS78S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class PoiCategoryNameCell extends PowerCell<C005U> {
    public TuxTextView LL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C005U c005u = (C005U) interfaceC1891350zJl;
        super.onBindItemView(c005u);
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            tuxTextView.setText(c005u.LLILLJJLI);
        }
        C786410Ut5.I7(new AkS78S0100000_6(this, 19), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        TuxTextView tuxTextView = new TuxTextView(viewGroup.getContext(), null, 6, 0);
        C1546210qL5.LIZ.getClass();
        C1189060h32.LJJII(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C1546210qL5.LIZ(4))), null, null, null);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(1);
        tuxTextView.setTuxFont(51);
        tuxTextView.setTextColorRes(R.attr.a1h);
        this.LL = tuxTextView;
        return tuxTextView;
    }
}
