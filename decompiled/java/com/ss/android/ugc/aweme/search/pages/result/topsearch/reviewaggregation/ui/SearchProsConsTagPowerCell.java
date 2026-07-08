package com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.ui;

import X.C1091800eWA;
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
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.ui.base.AbsSearchProsConsPowerCell;
import com.zhiliaoapp.musically.R;
import irm.AkS81S0100000_9;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class SearchProsConsTagPowerCell extends AbsSearchProsConsPowerCell<C331070CyP> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final C166W LLILLJJLI = new C166W(new AwS597S0100000_18((PowerCell) this, 556));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchProsConsTagPowerCell.class, "binding", "getBinding()Lcom/ss/android/ugc/aweme/search/databinding/SearchProsConsTagPowerCellBinding;", 0);
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
        C1091800eWA c1091800eWA;
        super.onItemViewCreated();
        View view = this.itemView;
        if ((view instanceof C1091800eWA) && (c1091800eWA = (C1091800eWA) view) != null) {
            c1091800eWA.setCustomMaxWidth(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(280))));
        }
        C427690Gpr.LJ(this.itemView, C418440Gaw.LIZIZ(16));
        C786410Ut5.I7(new AkS81S0100000_9(this, 9), this.itemView);
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
}
