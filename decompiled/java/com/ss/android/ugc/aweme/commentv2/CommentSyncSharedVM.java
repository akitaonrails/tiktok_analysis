package com.ss.android.ugc.aweme.commentv2;

import X.C1342780l2y;
import X.C442480HWs;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentSyncSharedVM extends AssemViewModel<C442480HWs> {
    public int LL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C442480HWs(null, null);
    }

    public CommentSyncSharedVM() {
        new LinkedHashMap();
        this.LL = -1;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
    }

    public final void vQ2(C1342780l2y c1342780l2y) {
        if (c1342780l2y == null) {
            return;
        }
        setState(new AwS600S0100000_21(c1342780l2y, 94));
    }
}
