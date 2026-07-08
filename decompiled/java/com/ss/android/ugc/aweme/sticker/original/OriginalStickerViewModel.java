package com.ss.android.ugc.aweme.sticker.original;

import X.C1DRG;
import X.C259800zU;
import X.InterfaceC1624480sNK;
import X.InterfaceC1625410sOp;
import X.InterfaceC1631100sY0;
import X.InterfaceC1635560sfC;
import X.ViewOnClickListenerC1638020sjA;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.AwS391S0200000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class OriginalStickerViewModel extends StickerListViewModel {
    public final InterfaceC1631100sY0 LLJJJIL;
    public final Effect LLJJJJ;
    public boolean LLJJJJJIL;
    public int LLJJJJLIIL;

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, X.InterfaceC1631540sYi
    public final void XH2(String str) {
        if (this.LLJJJJJIL) {
            return;
        }
        this.LLJJJJJIL = true;
        this.LLJJJIL.LJ(ViewOnClickListenerC1638020sjA.LLLIL, new AwS391S0200000_25(new C259800zU(), (C259800zU<List<String>>) this, (OriginalStickerViewModel) 149));
    }

    public OriginalStickerViewModel(StickerCategoryFragment stickerCategoryFragment, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1625410sOp interfaceC1625410sOp, InterfaceC1635560sfC interfaceC1635560sfC, InterfaceC1631100sY0 interfaceC1631100sY0, Effect effect, C1DRG c1drg) {
        super(stickerCategoryFragment, interfaceC1624480sNK, interfaceC1625410sOp, interfaceC1635560sfC, c1drg, null, false, 96);
        this.LLJJJIL = interfaceC1631100sY0;
        this.LLJJJJ = effect;
    }
}
