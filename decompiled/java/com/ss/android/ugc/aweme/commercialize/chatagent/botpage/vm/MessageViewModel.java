package com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm;

import X.AbstractC316870CbV;
import X.C01GW;
import X.C0PEM;
import X.C189200o6;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.C291001Au;
import X.C316860CbU;
import X.C317290CcB;
import X.C320610ChX;
import X.C320640Cha;
import X.C320740Chk;
import X.C320880Chy;
import X.C320920Ci2;
import X.C321110CiL;
import X.C321520Cj0;
import X.C321530Cj1;
import X.C321700CjI;
import X.C323380Cm0;
import X.C452501pT;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC320950Ci5;
import X.InterfaceC332260D0u;
import X.InterfaceC497601wk;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.commercialize.chatagent.api.model.CommerceAgentEnterParams;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.actionbar.model.CommerceAgentActiveActionItem;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.actionbar.model.CommerceAgentActiveBotItem;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.ExtraRequestInfo;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS370S0200000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class MessageViewModel extends AssemViewModel<C321700CjI> {
    public CommerceAgentEnterParams LL;
    public C320640Cha LLILLL;
    public final C320880Chy LLILLJJLI = new C320880Chy();
    public final Set<String> LLILZ = new LinkedHashSet();
    public final CopyOnWriteArrayList<InterfaceC320950Ci5> LLILZIL = new CopyOnWriteArrayList<>();
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 63));
    public final ArrayList<String> LLIZ = new ArrayList<>();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        ArrayList arrayList = new ArrayList();
        if (C320920Ci2.LIZ().privacyDisclaimerEnable) {
            arrayList.add(new C321520Cj0());
        }
        arrayList.add(new C321530Cj1());
        return yQ2(new C321700CjI(new C291001Au(arrayList), 2046));
    }

    public final boolean oj() {
        C320610ChX c320610ChX = C320640Cha.LJIIJ;
        C320640Cha c320640Cha = this.LLILLL;
        Long lValueOf = c320640Cha != null ? Long.valueOf(c320640Cha.LIZLLL) : null;
        C320640Cha c320640Cha2 = this.LLILLL;
        InterfaceC332260D0u interfaceC332260D0uLIZLLL = c320610ChX.LIZLLL(c320640Cha2 != null ? Integer.valueOf(c320640Cha2.LJ) : null, lValueOf);
        boolean z = false;
        if (interfaceC332260D0uLIZLLL != null && ((Boolean) interfaceC332260D0uLIZLLL.getValue()).booleanValue()) {
            z = true;
        }
        return !z;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C321700CjI yQ2(X.C321700CjI r60) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.MessageViewModel.yQ2(X.0CjI):X.0CjI");
    }

    public final void xQ2(C321110CiL c321110CiL, InterfaceC1364105Vn<? super AbstractC316870CbV<Boolean>> interfaceC1364105Vn) {
        if (C320740Chk.LIZ[c321110CiL.LIZ.ordinal()] == 1) {
            if (interfaceC1364105Vn != null) {
                C323380Cm0 c323380Cm0LJ = C317290CcB.LJ(AbstractC316870CbV.LIZ, Boolean.TRUE, null, null, 6);
                C189200o6.m2constructorimpl(c323380Cm0LJ);
                interfaceC1364105Vn.resumeWith(c323380Cm0LJ);
            }
            if (c321110CiL.LIZIZ.isEmpty()) {
                setState(new AwS583S0100000_4(c321110CiL, 44));
            } else {
                setState(new AwS370S0200000_4(this, c321110CiL, 13));
            }
        }
    }

    public final void vQ2(String str, boolean z, String str2, Map<String, String> map, CommerceAgentActiveActionItem commerceAgentActiveActionItem, CommerceAgentActiveBotItem commerceAgentActiveBotItem, String str3, int i, int i2, ExtraRequestInfo extraRequestInfo) {
        if (str == null) {
            return;
        }
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C316860CbU(i, i2, commerceAgentActiveActionItem, commerceAgentActiveBotItem, this, extraRequestInfo, str, str2, str3, map, null, z), 2);
    }
}
