package com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.moderator.data;

import X.AbstractC316870CbV;
import X.C0230005s;
import X.C13BV;
import X.C316640Cb8;
import X.C317290CcB;
import X.C326310Cqj;
import X.C627660Ojc;
import X.C751680TeA;
import X.C773680UWo;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import com.bytedance.ext_power_list.AssemListViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveModeratorListViewModel extends AssemListViewModel<C326310Cqj, C751680TeA, Long> {
    public final C773680UWo LL = new C773680UWo();
    public final List<C751680TeA> LLILLJJLI = new ArrayList();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C326310Cqj(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C751680TeA> c627660Ojc) {
        setState(new AwS591S0100000_12(c627660Ojc, (C627660Ojc<C0230005s>) 621));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r9) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.moderator.data.LiveModeratorListViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Long l, InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        l.longValue();
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        C13BV c13bv = C13BV.INSTANCE;
        c317290CcB.getClass();
        return new C316640Cb8(c13bv);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(int r18, long r19, java.lang.String r21, X.InterfaceC1364105Vn<? super java.lang.Boolean> r22) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.moderator.data.LiveModeratorListViewModel.vQ2(int, long, java.lang.String, X.05Vn):java.lang.Object");
    }
}
