package com.ss.android.ugc.aweme.sticker.pagination;

import X.C1629640sVe;
import X.C1DRG;
import X.InterfaceC1624480sNK;
import X.InterfaceC1625410sOp;
import X.InterfaceC1628910sUT;
import X.InterfaceC1635560sfC;
import Y.AObserverS227S0100000_25;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.SharedPoolStickerListViewModel;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes26.dex */
public final class PagingStickerListViewModel extends SharedPoolStickerListViewModel {
    public final C1629640sVe LLJJJIL;
    public String LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public final AObserverS227S0100000_25 LLJL;

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.SharedPoolStickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, X.InterfaceC1631540sYi
    public final void XH2(String str) {
        int i;
        if (a0.LJJJIL(str)) {
            return;
        }
        this.LLJJJJ = str;
        if (this.LLJJLIIIJLLLLLLLZ == 0) {
            i = this.LLJJJIL.LIZIZ;
        } else {
            i = this.LLJJJIL.LIZJ;
        }
        this.LL.getStickerRepository().LJFF().LJIIJJI(true, false, str, this.LLJJJJJIL, this.LLJJJJLIIL, i, null).observe(this.LLJJIJIIJIL, this.LLJL);
    }

    public PagingStickerListViewModel(StickerCategoryFragment stickerCategoryFragment, C1629640sVe c1629640sVe, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1625410sOp interfaceC1625410sOp, InterfaceC1635560sfC interfaceC1635560sfC, C1DRG c1drg, InterfaceC1628910sUT interfaceC1628910sUT) {
        super(stickerCategoryFragment, c1drg, interfaceC1625410sOp, interfaceC1624480sNK, interfaceC1628910sUT, interfaceC1635560sfC);
        this.LLJJJIL = c1629640sVe;
        this.LLJJJJ = "";
        this.LLJL = new AObserverS227S0100000_25(this, 130);
    }
}
