package com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image;

import X.C666400QBy;
import X.EnumC666410QBz;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.ImageData;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchImageLandingPageVM extends AssemViewModel<C666400QBy> {
    public Function1<? super ImageData, ? extends Map<String, String>> LL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C666400QBy(0);
    }

    public final void vQ2(List<ImageData> list) {
        this.vmDispatcher.getState();
        setStateImmediate(new AwS589S0100000_10(list, (List<ImageData>) 250));
    }

    public final void wQ2(EnumC666410QBz enumC666410QBz) {
        this.vmDispatcher.getState();
        setStateImmediate(new AwS589S0100000_10(enumC666410QBz, 251));
    }
}
