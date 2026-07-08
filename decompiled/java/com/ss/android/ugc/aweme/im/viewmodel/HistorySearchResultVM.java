package com.ss.android.ugc.aweme.im.viewmodel;

import X.AbstractC316870CbV;
import X.C01GW;
import X.C1156020gBk;
import X.C1157130gDX;
import X.C1240360iNm;
import X.C1240530iO3;
import X.C1240980iOm;
import X.C1241150iP3;
import X.C1559260qg8;
import X.C316650Cb9;
import X.C317290CcB;
import X.C452501pT;
import X.C627660Ojc;
import X.C723600SZy;
import X.EnumC1241070iOv;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import android.view.View;
import com.bytedance.ext_power_list.AssemListViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class HistorySearchResultVM extends AssemListViewModel<C1240980iOm, C1240530iO3, String> {
    public final C1240360iNm LL = new C1240360iNm(new AwS598S0100000_19(this, 173));
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new C723600SZy(this, C1156020gBk.class, null), true);
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1525));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1526));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1524));
    public final List<View.OnFocusChangeListener> LLILZLL = new ArrayList();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1240980iOm(EnumC1241070iOv.INIT, "", 0, null, null, new C627660Ojc(null, null, null, null, 15));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C1240530iO3> c627660Ojc) {
        setState(new AwS598S0100000_19(c627660Ojc, (C627660Ojc<C1157130gDX>) 174));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r13) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.viewmodel.HistorySearchResultVM.onRefresh(X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(String str, InterfaceC1364105Vn<? super AbstractC316870CbV<String>> interfaceC1364105Vn) {
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        C1241150iP3 c1241150iP3 = new C1241150iP3();
        c317290CcB.getClass();
        return new C316650Cb9(c1241150iP3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(int r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, X.InterfaceC1364105Vn r24) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.viewmodel.HistorySearchResultVM.vQ2(int, java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
