package com.ss.android.ugc.aweme.im.chatroom.common.titlebar;

import X.C1559260qg8;
import X.C457780HxI;
import X.C723600SZy;
import X.C899450ZQh;
import X.C899460ZQi;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* JADX INFO: loaded from: classes15.dex */
public final class TitleBarLeftViewModel extends AssemViewModel<C899460ZQi> {
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, C899450ZQh.class, null), true);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        C899450ZQh c899450ZQh = (C899450ZQh) this.LL.getValue();
        if (c899450ZQh != null) {
            return new C899460ZQi(c899450ZQh.LL, c899450ZQh.LLILLJJLI);
        }
        C899450ZQh c899450ZQh2 = new C899450ZQh(0);
        return new C899460ZQi(c899450ZQh2.LL, c899450ZQh2.LLILLJJLI);
    }

    public TitleBarLeftViewModel() {
        new C723600SZy(this, C457780HxI.class, null);
    }
}
