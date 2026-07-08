package com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction;

import X.C914160Zte;
import X.InterfaceC0148002o;
import X.InterfaceC879330YeZ;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes15.dex */
public final class IMPendingReactionViewModel extends AssemViewModel<InterfaceC0148002o> {
    public final ConcurrentHashMap<String, InterfaceC879330YeZ> LL = new ConcurrentHashMap<>();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C914160Zte(13);
    }
}
