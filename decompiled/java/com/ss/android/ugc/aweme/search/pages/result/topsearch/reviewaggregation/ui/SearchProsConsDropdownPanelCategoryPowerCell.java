package com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.ui;

import X.C01GW;
import X.C1206170hUd;
import X.C1360520lVa;
import X.C13LE;
import X.C166W;
import X.C1954807lC;
import X.C2217381BqS;
import X.C331070CyP;
import X.C337180DJs;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS76S0100000_4;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class SearchProsConsDropdownPanelCategoryPowerCell extends PowerCell<C331070CyP> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final C01GW LL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1463));
    public final C166W LLILLJJLI = new C166W(new AwS597S0100000_18((PowerCell) this, 554));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchProsConsDropdownPanelCategoryPowerCell.class, "binding", "getBinding()Lcom/ss/android/ugc/aweme/search/databinding/SearchProsConsTagPowerCellBinding;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.f2p;
    }

    public final C1206170hUd I5() {
        C166W c166w = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
        return (C1206170hUd) c166w.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C427690Gpr.LJ(this.itemView, C418440Gaw.LIZIZ(16));
        C786410Ut5.I7(new AkS76S0100000_4(this, 3), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C331070CyP c331070CyP = (C331070CyP) interfaceC1891350zJl;
        I5().LL.setSelected(c331070CyP.LLILZIL);
        I5().LLILLL.setText(c331070CyP.LL);
        Boolean bool = c331070CyP.LLILLL;
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            String str = c331070CyP.LLILZ;
            if (str != null && str.length() > 0) {
                C337180DJs.LIZJ(I5().LLILLJJLI);
                I5().LLILLJJLI.setTextColorRes(R.attr.a1k);
                I5().LLILLJJLI.setTuxFont(61);
                TuxTextView tuxTextView = I5().LLILLJJLI;
                C1360520lVa c1360520lVa = new C1360520lVa();
                c1360520lVa.LIZ.append((CharSequence) " ");
                c1360520lVa.LIZ.append((CharSequence) c331070CyP.LLILZ);
                tuxTextView.setText(c1360520lVa.LIZ);
                return;
            }
            C337180DJs.LIZ(I5().LLILLJJLI);
            return;
        }
        if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
            C337180DJs.LIZ(I5().LLILLJJLI);
            return;
        }
        if (bool == null) {
            C337180DJs.LIZJ(I5().LLILLJJLI);
            I5().LLILLJJLI.setTextColorRes(R.attr.a1h);
            I5().LLILLJJLI.setTuxFont(52);
            TuxTextView tuxTextView2 = I5().LLILLJJLI;
            C1360520lVa c1360520lVa2 = new C1360520lVa();
            c1360520lVa2.LIZ.append((CharSequence) " ");
            c1360520lVa2.LIZ.append((CharSequence) String.valueOf(c331070CyP.LLILLJJLI));
            tuxTextView2.setText(c1360520lVa2.LIZ);
            return;
        }
        throw new C1954807lC();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewOnCreateItemView = super.onCreateItemView(viewGroup);
        ViewGroup.LayoutParams layoutParams = viewOnCreateItemView.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
            C786410Ut5.W5(viewOnCreateItemView, marginLayoutParams);
        }
        return viewOnCreateItemView;
    }
}
