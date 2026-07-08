package com.ss.android.ugc.aweme.inbox.search.vm;

import X.AbstractC316870CbV;
import X.AnonymousClass0956;
import X.C06KT;
import X.C0PEM;
import X.C1157130gDX;
import X.C1241350iPN;
import X.C1241540iPg;
import X.C1720106oR;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C23250099c;
import X.C296890BkN;
import X.C627660Ojc;
import X.EnumC1241490iPb;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1631620sYq;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class InboxSearchUserFilterVM extends AssemListViewModel<C1241540iPg, C1241350iPN, Long> {
    public String LL = "";
    public final long LLILLJJLI = C296890BkN.LIZ();
    public final Set<String> LLILLL = new LinkedHashSet();
    public InterfaceC1631620sYq<? super String, ? super String, ? super UrlModel, Unit> LLILZ;
    public String LLILZIL;
    public AnonymousClass0956 LLILZLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1241540iPg(EnumC1241490iPb.INIT, new C627660Ojc(null, null, null, null, 15));
    }

    public final void refresh() {
        AnonymousClass0956 anonymousClass0956 = this.LLILZLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLILZLL = C23250099c.LIZLLL(getLifecycleScope(), C0PEM.LIZJ, null, new C06KT(this, null), 2);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C1241350iPN> c627660Ojc) {
        setState(new AwS598S0100000_19(c627660Ojc, (C627660Ojc<C1157130gDX>) 187));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRefresh() - nowKeyWord = ");
        sbLIZ.append(this.LL);
        C1720106oR.LJI("InboxSearchUserFilterVM", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZIL = null;
        if (this.LL.length() == 0) {
            return vQ2(interfaceC1364105Vn);
        }
        setState(AFwS257S0000000_19.get$arr$(213));
        return wQ2(-1L, this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r15) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchUserFilterVM.vQ2(X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Long l, InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        return wQ2(l.longValue(), this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(long r14, java.lang.String r16, X.InterfaceC1364105Vn r17) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchUserFilterVM.wQ2(long, java.lang.String, X.05Vn):java.lang.Object");
    }
}
