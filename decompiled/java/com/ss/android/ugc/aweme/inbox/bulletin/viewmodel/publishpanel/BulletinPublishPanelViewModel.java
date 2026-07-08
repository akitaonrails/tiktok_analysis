package com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.publishpanel;

import X.C06J8;
import X.C1559260qg8;
import X.C1588106Jr;
import X.C723600SZy;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* JADX INFO: loaded from: classes3.dex */
public final class BulletinPublishPanelViewModel extends AssemViewModel<C1588106Jr> {
    public String LL = "";
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new C723600SZy(this, C06J8.class, "bulletin_publish_data"), true);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1588106Jr(0);
    }

    public final C06J8 vQ2() {
        return (C06J8) this.LLILLJJLI.getValue();
    }
}
