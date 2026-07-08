package com.ss.android.ugc.aweme.music.vm;

import X.AbstractC316870CbV;
import X.C036E;
import X.C0ODG;
import X.C2217381BqS;
import X.C291001Au;
import X.C326260Cqe;
import X.C623470Ocr;
import X.C627660Ojc;
import X.C632560OrW;
import X.C632600Ora;
import X.C844470XAv;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC597750NcT;
import X.InterfaceC736910SvR;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class ReportListViewModel extends AssemListViewModel<C326260Cqe, C632560OrW, C632600Ora> {
    public final InterfaceC736910SvR<InterfaceC597750NcT> LL;
    public boolean LLILLJJLI;
    public final List<C632560OrW> LLILLL = new ArrayList();
    public C632600Ora LLILZ = new C632600Ora(0, 0);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        AssemViewModel.asyncSubscribe$default(this, new C2217381BqS() { // from class: X.0OrZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C326260Cqe c326260Cqe = (C326260Cqe) obj;
                c326260Cqe.getClass();
                return C627260Oiy.LIZLLL(c326260Cqe);
            }
        }, null, new AwS588S0100000_9(this, 350), new AwS553S0100000_9(this, 1356), new AwS588S0100000_9(this, 351), 2, null);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C326260Cqe(true, new C627660Ojc(null, null, null, null, 15), new C291001Au(Boolean.FALSE));
    }

    public final void refresh() {
        if (this.LLILLJJLI) {
            return;
        }
        this.LLILLJJLI = true;
        ((ArrayList) this.LLILLL).clear();
        this.LLILZ = new C632600Ora(0, 0);
        manualListRefresh();
        setState(AFwS240S0000000_9.get$arr$(558));
    }

    public ReportListViewModel(C0ODG c0odg) {
        this.LL = c0odg;
        new LinkedHashSet();
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C632560OrW> c627660Ojc) {
        setState(new AwS588S0100000_9(c627660Ojc, (C627660Ojc<C623470Ocr>) 349));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C632600Ora>> interfaceC1364105Vn) {
        return vQ2(new C632600Ora(0, 0), interfaceC1364105Vn);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(C632600Ora c632600Ora, InterfaceC1364105Vn<? super AbstractC316870CbV<C632600Ora>> interfaceC1364105Vn) {
        boolean zLIZIZ;
        C632600Ora c632600Ora2 = c632600Ora;
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        if (!zLIZIZ) {
            setState(AFwS232S0000000_4.get$arr$(224));
        }
        return vQ2(c632600Ora2, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(X.C632600Ora r24, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C632600Ora>> r25) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.vm.ReportListViewModel.vQ2(X.0Ora, X.05Vn):java.lang.Object");
    }
}
