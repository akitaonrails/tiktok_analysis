package com.ss.android.ugc.aweme.notification.vh;

import X.C01GW;
import X.C11NJ;
import X.C21411818qq;
import X.C452501pT;
import X.C635590OwP;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS144S0100000_9;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class SubscribeSettingsCell extends PowerCell<C635590OwP> {
    public final C01GW LL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(284));
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public C21411818qq LLILZ;
    public C635590OwP LLILZIL;
    public int LLILZLL;
    public int LLIZ;

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        ((C11NJ) this.LL.getValue()).LJ();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int iIntValue;
        String str;
        C635590OwP c635590OwP = (C635590OwP) interfaceC1891350zJl;
        super.onBindItemView(c635590OwP);
        this.LLILZIL = c635590OwP;
        C21411818qq c21411818qq = null;
        if (c635590OwP == null) {
            c635590OwP = null;
        }
        Integer num = c635590OwP.LL;
        int iIntValue2 = 0;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLILZLL = iIntValue;
        C635590OwP c635590OwP2 = this.LLILZIL;
        if (c635590OwP2 == null) {
            c635590OwP2 = null;
        }
        Integer num2 = c635590OwP2.LLILLJJLI;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        }
        this.LLIZ = iIntValue2;
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        C635590OwP c635590OwP3 = this.LLILZIL;
        if (c635590OwP3 == null) {
            c635590OwP3 = null;
        }
        tuxTextView.setText(c635590OwP3.LLILLL);
        C21411818qq c21411818qq2 = this.LLILZ;
        if (c21411818qq2 == null) {
            c21411818qq2 = null;
        }
        C635590OwP c635590OwP4 = this.LLILZIL;
        if (c635590OwP4 == null) {
            c635590OwP4 = null;
        }
        Boolean bool = c635590OwP4.LLILZLL;
        Boolean bool2 = Boolean.TRUE;
        c21411818qq2.setChecked(!Intrinsics.LJFF(bool, bool2));
        TuxTextView tuxTextView2 = this.LLILLL;
        if (tuxTextView2 == null) {
            tuxTextView2 = null;
        }
        C635590OwP c635590OwP5 = this.LLILZIL;
        if (c635590OwP5 == null) {
            c635590OwP5 = null;
        }
        if (!Intrinsics.LJFF(c635590OwP5.LLILZLL, bool2)) {
            C635590OwP c635590OwP6 = this.LLILZIL;
            if (c635590OwP6 == null) {
                c635590OwP6 = null;
            }
            str = c635590OwP6.LLILZ;
        } else {
            C635590OwP c635590OwP7 = this.LLILZIL;
            if (c635590OwP7 == null) {
                c635590OwP7 = null;
            }
            str = c635590OwP7.LLILZIL;
        }
        tuxTextView2.setText(str);
        C21411818qq c21411818qq3 = this.LLILZ;
        if (c21411818qq3 != null) {
            c21411818qq = c21411818qq3;
        }
        C786410Ut5.f9(c21411818qq, new ACListenerS144S0100000_9(this, 81));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.aaa, viewGroup, false);
        this.LLILLJJLI = (TuxTextView) viewTd.findViewById(R.id.pfc);
        this.LLILLL = (TuxTextView) viewTd.findViewById(R.id.pe7);
        this.LLILZ = (C21411818qq) viewTd.findViewById(R.id.pfa);
        return viewTd;
    }
}
