package com.ss.android.ugc.aweme.im.sticker.api.provider;

import X.C06P9;
import X.C869590Y9l;
import X.EnumC441530HTb;
import X.InterfaceC0148002o;
import android.view.View;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.IAddStickerToFavViewModel;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class StubAddStickerToFavViewModel extends IAddStickerToFavViewModel {
    @Override // com.ss.android.ugc.aweme.im.sticker.api.viewmodel.IAddStickerToFavViewModel
    public final void addToFavorites(C869590Y9l c869590Y9l, View view, EnumC441530HTb enumC441530HTb) {
    }

    @Override // com.ss.android.ugc.aweme.im.sticker.api.viewmodel.IAddStickerToFavViewModel
    public final void prepare(List<? extends C869590Y9l> list) {
    }

    @Override // com.ss.android.ugc.aweme.im.sticker.api.viewmodel.IAddStickerToFavViewModel
    public final boolean shouldShowAddToFav(C869590Y9l c869590Y9l) {
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C06P9(0);
    }
}
