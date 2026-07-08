package com.ss.android.ugc.tools.infosticker.repository.internal;

import X.C11S5;
import X.C1701940uOG;
import X.EnumC1641470soj;
import Y.AfS194S0100000_25;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerProviderListViewModel;
import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
public final class InfoStickerProviderCategoryViewModel$trendDataViewModel$2$1 extends InfoStickerProviderListViewModel.TrendListViewModel {
    public List<? extends ProviderEffect> LLIZLLLIL;

    @Override // com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerProviderListViewModel.TrendListViewModel, com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, X.InterfaceC1640330smt
    public final void X1() {
        if (isDestroyed()) {
            return;
        }
        EnumC1641470soj value = this.LLILLJJLI.getValue();
        if (value == null || !(value == EnumC1641470soj.EMPTY || value == EnumC1641470soj.LOADING)) {
            List list = (List) this.LL.getValue();
            if (list != null && (true ^ list.isEmpty())) {
                throw null;
            }
            this.LLILLJJLI.setValue(EnumC1641470soj.LOADING);
            vQ2().LIZ(wQ2().LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS194S0100000_25(this, 99), new AfS194S0100000_25(this, 100)));
        }
    }
}
