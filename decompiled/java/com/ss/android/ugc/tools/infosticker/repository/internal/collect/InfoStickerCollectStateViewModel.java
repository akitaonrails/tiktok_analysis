package com.ss.android.ugc.tools.infosticker.repository.internal.collect;

import X.C01GW;
import X.C11NZ;
import X.C11PQ;
import X.C1431920nMk;
import X.C1462570oAB;
import X.C1465200oEQ;
import X.C1633940sca;
import X.C1634100scq;
import X.C19475711Hn;
import X.C452501pT;
import X.EnumC1641420soe;
import X.InterfaceC1633950scb;
import X.InterfaceC1633960scc;
import Y.AkS486S0100000_25;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel;
import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class InfoStickerCollectStateViewModel extends BaseInfoStickerStateViewModel<Effect> {
    public final InterfaceC1633960scc LLILZIL;
    public final C01GW LLILZLL;

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel
    public final C11NZ<C1634100scq<Effect, EnumC1641420soe, Integer>> vQ2(Effect effect) {
        C11NZ c19475711Hn;
        Effect effect2 = effect;
        if (!C1462570oAB.LJIIJJI(effect2) && !C1462570oAB.LJIJI(effect2) && !C1462570oAB.LJI(effect2)) {
            c19475711Hn = this.LLILZIL.LIZJ(effect2, true);
        } else {
            C1431920nMk c1431920nMk = (C1431920nMk) this.LLILZLL.getValue();
            c1431920nMk.getClass();
            C11PQ c11pq = new C11PQ();
            ((InterfaceC1633950scb) c1431920nMk.LIZIZ.getValue()).LIZ(effect2, new C1633940sca(c11pq, effect2, c1431920nMk));
            c19475711Hn = new C19475711Hn(c11pq);
        }
        return c19475711Hn.LJJJJZI(new AkS486S0100000_25(effect2, 27));
    }

    public InfoStickerCollectStateViewModel(C1465200oEQ c1465200oEQ, InterfaceC1633960scc interfaceC1633960scc) {
        super(c1465200oEQ);
        this.LLILZIL = interfaceC1633960scc;
        this.LLILZLL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(531));
    }
}
