package com.ss.android.ugc.aweme.tako.botpage.components.share;

import X.C1361505Un;
import X.C1A3K;
import X.C1A3L;
import X.C1A3M;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS279S0000000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class TakoSharePreviewViewModel extends AssemViewModel<C1A3K> implements TakoSharePreviewAbility {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1A3K(0);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.components.share.TakoSharePreviewAbility
    public final void cP0() {
        if (getState().LL == null) {
            return;
        }
        setState(AFwS279S0000000_33.get$arr$(239));
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.components.share.TakoSharePreviewAbility
    public final void yx1(float f) {
        setState(new C1A3M(f));
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.components.share.TakoSharePreviewAbility
    public final void zv0(TakoContentPreviewItem.Image image, C1361505Un c1361505Un, Function0 function0, boolean z) {
        setState(new C1A3L(image, c1361505Un, function0, z));
    }
}
