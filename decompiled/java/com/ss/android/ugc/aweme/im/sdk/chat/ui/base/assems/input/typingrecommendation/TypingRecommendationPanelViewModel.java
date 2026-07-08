package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.typingrecommendation;

import X.C1BNE;
import X.C2252321DDq;
import X.C463090IDz;
import X.EnumC452900HpQ;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* JADX INFO: loaded from: classes7.dex */
public final class TypingRecommendationPanelViewModel extends AssemViewModel<InterfaceC0148002o> {
    public final C2252321DDq LL;
    public final C2252321DDq LLILLJJLI;
    public final C2252321DDq LLILLL;
    public final C2252321DDq LLILZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C463090IDz(14);
    }

    public TypingRecommendationPanelViewModel() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(Boolean.FALSE);
        this.LL = c2252321DDqLIZ;
        this.LLILLJJLI = c2252321DDqLIZ;
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(EnumC452900HpQ.FAKE_MESSAGE);
        this.LLILLL = c2252321DDqLIZ2;
        this.LLILZ = c2252321DDqLIZ2;
    }
}
