package com.ss.android.ugc.aweme.im.quickchat.ui.assem;

import X.C1769806wS;
import X.C603820NmG;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class StoryReplySARecommendCacheVM extends AssemViewModel<InterfaceC0148002o> {
    public final C603820NmG<Long, List<StickerItem>> LL = new C603820NmG<>(5);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1769806wS(2);
    }
}
