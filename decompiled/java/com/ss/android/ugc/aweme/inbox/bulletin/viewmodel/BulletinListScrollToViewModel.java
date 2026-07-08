package com.ss.android.ugc.aweme.inbox.bulletin.viewmodel;

import X.C01GW;
import X.C0OLE;
import X.C0OLG;
import X.C1BNE;
import X.C2252321DDq;
import X.C452501pT;
import X.EnumC617480OJu;
import X.InterfaceC0148002o;
import X.InterfaceC617290OJb;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinListScrollToViewModel extends AssemViewModel<C0OLE> implements InterfaceC617290OJb {
    public boolean LL;
    public int LLILLL;
    public int LLILZLL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(193));
    public EnumC617480OJu LLILZ = EnumC617480OJu.UNINITIALIZED;
    public final C2252321DDq LLILZIL = C1BNE.LIZ(new C0OLG(false, 0));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0OLE(0);
    }

    @Override // X.InterfaceC617290OJb
    public final void Qx0(int i) {
        this.LLILLL = i;
        this.LLILZLL = i;
    }
}
