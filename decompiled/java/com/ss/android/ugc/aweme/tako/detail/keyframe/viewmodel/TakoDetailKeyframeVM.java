package com.ss.android.ugc.aweme.tako.detail.keyframe.viewmodel;

import X.C1155520gAw;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.tako.detail.model.TakoKeyFramePoint;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoDetailKeyframeVM extends AssemViewModel<C1155520gAw> {
    public IPlayerComponentAbility LL;
    public List<TakoKeyFramePoint> LLILLJJLI;
    public boolean LLILLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1155520gAw(0);
    }
}
