package com.ss.android.ugc.aweme.nimblecard.tako.vm;

import X.C00GR;
import X.C358401aI;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class NimbleVM extends AssemViewModel<C00GR> {
    public static final HashMap<String, User> LLILLJJLI;
    public final C358401aI LL = new C358401aI();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C00GR(0);
    }

    static {
        System.currentTimeMillis();
        LLILLJJLI = new HashMap<>();
    }
}
