package com.ss.android.ugc.aweme.poi.detail.basicinfo.header;

import X.C1189060h32;
import X.C1697810uHb;
import X.C418440Gaw;
import X.C423420Giy;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.detail.container.model.OpeningTime;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class PoiOpeningTimeCell extends PowerCell<C423420Giy> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.e0s;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C423420Giy c423420Giy = (C423420Giy) interfaceC1891350zJl;
        super.onBindItemView(c423420Giy);
        OpeningTime openingTime = c423420Giy.LLILLJJLI;
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.tv_week_day);
        tuxTextView.setText(openingTime.weekDays);
        if (c423420Giy.LLILLL) {
            tuxTextView.setTextColorRes(R.attr.a1h);
            tuxTextView.setTuxFont(52);
        } else {
            tuxTextView.setTextColorRes(R.attr.a1j);
            tuxTextView.setTuxFont(51);
        }
        if (C426750GoL.LIZLLL(tuxTextView.getContext())) {
            tuxTextView.setGravity(5);
        } else {
            tuxTextView.setGravity(3);
        }
        ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.nfz);
        if (!openingTime.openingStatus) {
            TuxTextView tuxTextViewI5 = I5(this.itemView.getContext(), c423420Giy.LLILLL);
            tuxTextViewI5.setText(2131844859);
            viewGroup.addView(tuxTextViewI5);
            return;
        }
        List<String> list = openingTime.timeForShow;
        if (list == null) {
            return;
        }
        int i = 0;
        for (String str : list) {
            int i2 = i + 1;
            if (i >= 0) {
                String str2 = str;
                TuxTextView tuxTextViewI52 = I5(this.itemView.getContext(), c423420Giy.LLILLL);
                if (i > 0) {
                    C1189060h32.LJJII(tuxTextViewI52, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), null, null);
                }
                tuxTextViewI52.setText(str2);
                viewGroup.addView(tuxTextViewI52);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public static TuxTextView I5(Context context, boolean z) {
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        if (z) {
            tuxTextView.setTextColorRes(R.attr.a1h);
            tuxTextView.setTuxFont(52);
        } else {
            tuxTextView.setTextColorRes(R.attr.a1j);
            tuxTextView.setTuxFont(51);
        }
        tuxTextView.setGravity(8388613);
        C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-2, -2));
        return tuxTextView;
    }
}
