package com.ss.android.ugc.aweme.im.sticker.api.viewmodel;

import X.C06P9;
import X.C0ZOK;
import X.C869590Y9l;
import X.EnumC441530HTb;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public abstract class IAddStickerToFavViewModel extends AssemViewModel<C06P9> {
    public static final C0ZOK Companion = new Object() { // from class: X.0ZOK
    };

    public abstract void addToFavorites(C869590Y9l c869590Y9l, View view, EnumC441530HTb enumC441530HTb);

    public abstract void prepare(List<? extends C869590Y9l> list);

    public abstract boolean shouldShowAddToFav(C869590Y9l c869590Y9l);
}
