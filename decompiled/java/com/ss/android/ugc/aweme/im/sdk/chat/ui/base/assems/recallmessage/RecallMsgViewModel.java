package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.recallmessage;

import X.C19990113Jj;
import X.C19990313Jl;
import X.C461720I8s;
import X.C462160IAk;
import X.EnumC19990213Jk;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;

/* JADX INFO: loaded from: classes15.dex */
public final class RecallMsgViewModel extends AssemViewModel<C462160IAk> {
    public final String LL;
    public final Keva LLILLJJLI;

    static {
        C19990113Jj.LJIJI(C19990313Jl.LJII(3, EnumC19990213Jk.MINUTES), EnumC19990213Jk.MILLISECONDS);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C462160IAk(this.LLILLJJLI.getLong(this.LL, 0L), 5);
    }

    public RecallMsgViewModel() {
        String strLIZIZ = C461720I8s.LIZIZ();
        Keva repo = Keva.getRepo("recall_msg_flow_repo");
        this.LL = strLIZIZ;
        this.LLILLJJLI = repo;
    }
}
