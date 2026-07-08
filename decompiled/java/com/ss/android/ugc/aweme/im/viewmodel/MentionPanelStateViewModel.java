package com.ss.android.ugc.aweme.im.viewmodel;

import X.C1BNE;
import X.C2252321DDq;
import X.C463090IDz;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* JADX INFO: loaded from: classes7.dex */
public final class MentionPanelStateViewModel extends AssemViewModel<InterfaceC0148002o> {
    public final C2252321DDq LL;
    public final C2252321DDq LLILLJJLI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C463090IDz(16);
    }

    public MentionPanelStateViewModel() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(Boolean.FALSE);
        this.LL = c2252321DDqLIZ;
        this.LLILLJJLI = c2252321DDqLIZ;
    }
}
