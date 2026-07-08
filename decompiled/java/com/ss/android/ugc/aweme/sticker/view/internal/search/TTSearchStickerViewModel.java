package com.ss.android.ugc.aweme.sticker.view.internal.search;

import X.C1633110sbF;
import X.C1635530sf9;
import X.C1DRG;
import X.InterfaceC1624480sNK;
import X.InterfaceC1625410sOp;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes26.dex */
public final class TTSearchStickerViewModel extends SearchStickerViewModel {
    @Override // com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewModel, X.InterfaceC1636820shE
    public final void AA2(C1633110sbF c1633110sbF) {
        this.LLJLL.setValue(c1633110sbF.LIZJ);
        this.LLJL = c1633110sbF;
        this.LLJLIL = System.currentTimeMillis();
        this.LL.getStickerRepository().LJIJI(c1633110sbF);
    }

    public TTSearchStickerViewModel(LifecycleOwner lifecycleOwner, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1625410sOp interfaceC1625410sOp, C1635530sf9 c1635530sf9, C1DRG c1drg) {
        super(lifecycleOwner, interfaceC1624480sNK, interfaceC1625410sOp, c1635530sf9, c1drg);
    }
}
