package com.ss.android.ugc.tools.infosticker.repository.internal;

import X.C11NZ;
import X.C1634100scq;
import X.EnumC1641420soe;
import X.InterfaceC1633960scc;
import Y.AkS486S0100000_25;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel;

/* JADX INFO: loaded from: classes26.dex */
public final class InfoStickerStateViewModel extends BaseInfoStickerStateViewModel<Effect> {
    public final InterfaceC1633960scc LLILZIL;

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel
    public final C11NZ<C1634100scq<Effect, EnumC1641420soe, Integer>> vQ2(Effect effect) {
        Effect effect2 = effect;
        return this.LLILZIL.LIZJ(effect2, true).LJJJJZI(new AkS486S0100000_25(effect2, 22));
    }

    public InfoStickerStateViewModel(LifecycleOwner lifecycleOwner, InterfaceC1633960scc interfaceC1633960scc) {
        super(lifecycleOwner);
        this.LLILZIL = interfaceC1633960scc;
    }
}
