package com.ss.android.ugc.tools.infosticker.repository.internal;

import X.AbstractC19484711Kz;
import X.C1634340sdE;
import X.C1634450sdP;
import X.C19482011Jy;
import X.InterfaceC1633960scc;
import X.InterfaceC1634480sdS;
import Y.AkS475S0100000_12;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public final class InfoStickerCategoryListViewModel extends BaseInfoStickerListViewModel<Effect> {
    public final InterfaceC1633960scc LLILZIL;
    public final C1634340sdE LLILZLL;
    public final Function1<Effect, Boolean> LLIZ;
    public InterfaceC1634480sdS<Effect, CategoryEffectModel> LLIZLLLIL;

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final AbstractC19484711Kz<List<Effect>> wQ2() {
        InterfaceC1634480sdS<Effect, CategoryEffectModel> interfaceC1634480sdSLJ = this.LLILZIL.LJ(this.LLILZLL);
        this.LLIZLLLIL = interfaceC1634480sdSLJ;
        C19482011Jy next = interfaceC1634480sdSLJ.next();
        return this.LLIZ != C1634450sdP.LIZ ? next.LJIL(new AkS475S0100000_12(this, 3)) : next;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final AbstractC19484711Kz<List<Effect>> xQ2() {
        C19482011Jy next;
        InterfaceC1634480sdS<Effect, CategoryEffectModel> interfaceC1634480sdS = this.LLIZLLLIL;
        return (interfaceC1634480sdS == null || (next = interfaceC1634480sdS.next()) == null) ? AbstractC19484711Kz.LJIILLIIL(new IllegalStateException("Illegal method invoke order, should request data before request more.")) : this.LLIZ != C1634450sdP.LIZ ? next.LJIL(new AkS475S0100000_12(this, 4)) : next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InfoStickerCategoryListViewModel(LifecycleOwner lifecycleOwner, InterfaceC1633960scc interfaceC1633960scc, C1634340sdE c1634340sdE, Function1<? super Effect, Boolean> function1) {
        super(lifecycleOwner);
        this.LLILZIL = interfaceC1633960scc;
        this.LLILZLL = c1634340sdE;
        this.LLIZ = function1;
    }
}
