package com.ss.android.ugc.aweme.im.messagelist.api;

import X.AnonymousClass0950;
import X.C463090IDz;
import X.InterfaceC0148002o;
import X.InterfaceC332260D0u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* JADX INFO: loaded from: classes7.dex */
public abstract class IAwemeStatusViewModel extends AssemViewModel<InterfaceC0148002o> {
    public abstract InterfaceC332260D0u vQ2(String str);

    public abstract AnonymousClass0950 wQ2();

    public abstract void xQ2(Long l, String str, String str2);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C463090IDz(5);
    }
}
