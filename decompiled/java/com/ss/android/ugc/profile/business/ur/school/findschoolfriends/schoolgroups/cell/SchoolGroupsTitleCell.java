package com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolgroups.cell;

import X.C01GW;
import X.C1214240hhe;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class SchoolGroupsTitleCell extends PowerCell<C1214240hhe> {
    public TuxTextView LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(489));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(490));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1214240hhe c1214240hhe = (C1214240hhe) interfaceC1891350zJl;
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            tuxTextView.setText(this.itemView.getContext().getString(c1214240hhe.LL.getTitleStarling()));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(0);
        C786410Ut5.d6(linearLayout, new ViewGroup.LayoutParams(-1, ((Number) this.LLILLJJLI.getValue()).intValue()));
        linearLayout.setGravity(80);
        TuxTextView tuxTextView = new TuxTextView(viewGroup.getContext(), null, 6, 0);
        tuxTextView.setTuxFont(52);
        tuxTextView.setTextColorRes(R.attr.a1k);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMarginStart(((Number) this.LLILLL.getValue()).intValue());
        linearLayout.addView(tuxTextView, layoutParams);
        this.LL = tuxTextView;
        return linearLayout;
    }
}
