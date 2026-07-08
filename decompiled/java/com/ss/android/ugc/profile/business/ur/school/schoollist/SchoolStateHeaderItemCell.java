package com.ss.android.ugc.profile.business.ur.school.schoollist;

import X.C00XL;
import X.C01GW;
import X.C0H1U;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class SchoolStateHeaderItemCell extends PowerCell<C00XL> {
    public final C01GW LL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(517));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(519));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(518));
    public TuxTextView LLILZ;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C00XL c00xl = (C00XL) interfaceC1891350zJl;
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView != null) {
            tuxTextView.setText(c00xl.LL);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        TuxTextView tuxTextView = new TuxTextView(viewGroup.getContext(), null, 6, 0);
        tuxTextView.setTuxFont(52);
        tuxTextView.setTextColorRes(R.attr.a1k);
        C0H1U.LJIIIIZZ(((Number) this.LLILLJJLI.getValue()).intValue(), tuxTextView);
        C0H1U.LJIIIZ(((Number) this.LLILLJJLI.getValue()).intValue(), tuxTextView);
        C0H1U.LJII(((Number) this.LLILLL.getValue()).intValue(), tuxTextView);
        tuxTextView.setTextDirection(5);
        tuxTextView.setTextAlignment(5);
        tuxTextView.setGravity(80);
        C786410Ut5.R6(tuxTextView, new ViewGroup.LayoutParams(-1, ((Number) this.LL.getValue()).intValue()));
        this.LLILZ = tuxTextView;
        return tuxTextView;
    }
}
