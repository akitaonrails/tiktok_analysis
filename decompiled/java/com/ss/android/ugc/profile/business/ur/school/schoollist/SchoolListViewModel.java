package com.ss.android.ugc.profile.business.ur.school.schoollist;

import X.AbstractC316870CbV;
import X.C01GW;
import X.C0KBN;
import X.C1225580hzw;
import X.C326320Cqk;
import X.C452501pT;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.profile.business.ur.school.datasource.SchoolListRepository;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: loaded from: classes20.dex */
public final class SchoolListViewModel extends AssemListViewModel<C326320Cqk, Object, C1225580hzw> {
    public final C01GW LL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(516));
    public final Map<String, List<Object>> LLILLJJLI = new LinkedHashMap();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C326320Cqk(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        ((SchoolListRepository) this.LL.getValue()).LIZ();
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<Object> c627660Ojc) {
        setState(new AwS583S0100000_4(c627660Ojc, (C627660Ojc<C0KBN>) 175));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C1225580hzw>> interfaceC1364105Vn) {
        return onLoadMore(new C1225580hzw(0), interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(java.lang.String r18, X.InterfaceC1364105Vn<? super java.util.List<java.lang.Object>> r19) {
        /*
            Method dump skipped, instruction units count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.school.schoollist.SchoolListViewModel.vQ2(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fe  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: wQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(X.C1225580hzw r10, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1225580hzw>> r11) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.school.schoollist.SchoolListViewModel.onLoadMore(X.0hzw, X.05Vn):java.lang.Object");
    }
}
