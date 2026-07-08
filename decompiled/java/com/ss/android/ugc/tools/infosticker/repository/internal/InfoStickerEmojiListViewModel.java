package com.ss.android.ugc.tools.infosticker.repository.internal;

import X.AbstractC1634360sdG;
import X.AbstractC19484711Kz;
import X.C1465200oEQ;
import X.C1634340sdE;
import X.C19482011Jy;
import X.InterfaceC1633960scc;
import X.InterfaceC1634480sdS;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel;
import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
public final class InfoStickerEmojiListViewModel extends BaseInfoStickerListViewModel<Effect> {
    public final InterfaceC1633960scc LLILZIL;
    public C1634340sdE LLILZLL;
    public InterfaceC1634480sdS<Effect, CategoryEffectModel> LLIZ;

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final AbstractC19484711Kz<List<Effect>> wQ2() {
        InterfaceC1633960scc interfaceC1633960scc = this.LLILZIL;
        C1634340sdE c1634340sdE = this.LLILZLL;
        if (c1634340sdE == null) {
            "ListMeta not fetched yet".toString();
            throw new IllegalArgumentException("ListMeta not fetched yet");
        }
        InterfaceC1634480sdS<Effect, CategoryEffectModel> interfaceC1634480sdSLJ = interfaceC1633960scc.LJ(c1634340sdE);
        this.LLIZ = interfaceC1634480sdSLJ;
        return interfaceC1634480sdSLJ.next();
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final AbstractC19484711Kz<List<Effect>> xQ2() {
        C19482011Jy next;
        InterfaceC1634480sdS<Effect, CategoryEffectModel> interfaceC1634480sdS = this.LLIZ;
        return (interfaceC1634480sdS == null || (next = interfaceC1634480sdS.next()) == null) ? AbstractC19484711Kz.LJIILLIIL(new IllegalStateException("Illegal method invoke order, should request data before request more.")) : next;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, X.InterfaceC1640330smt
    public final void Px2(AbstractC1634360sdG abstractC1634360sdG) {
        if (abstractC1634360sdG instanceof C1634340sdE) {
            this.LLILZLL = (C1634340sdE) abstractC1634360sdG;
        }
    }

    public InfoStickerEmojiListViewModel(C1465200oEQ c1465200oEQ, InterfaceC1633960scc interfaceC1633960scc) {
        super(c1465200oEQ);
        this.LLILZIL = interfaceC1633960scc;
    }
}
