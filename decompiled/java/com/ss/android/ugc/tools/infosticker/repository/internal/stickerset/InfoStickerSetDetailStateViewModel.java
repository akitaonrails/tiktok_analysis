package com.ss.android.ugc.tools.infosticker.repository.internal.stickerset;

import X.C01GW;
import X.C11NZ;
import X.C11PQ;
import X.C1431920nMk;
import X.C1465200oEQ;
import X.C1633940sca;
import X.C1634100scq;
import X.C19475711Hn;
import X.C452501pT;
import X.EnumC1641420soe;
import X.InterfaceC1633950scb;
import Y.AkS486S0100000_25;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel;
import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class InfoStickerSetDetailStateViewModel extends BaseInfoStickerStateViewModel<Effect> {
    public final C01GW LLILZIL;

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public InfoStickerSetDetailStateViewModel(C1465200oEQ c1465200oEQ) {
        super(c1465200oEQ);
        this.LLILZIL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(395));
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel
    public final C11NZ<C1634100scq<Effect, EnumC1641420soe, Integer>> vQ2(Effect effect) {
        Effect effect2 = effect;
        C1431920nMk c1431920nMk = (C1431920nMk) this.LLILZIL.getValue();
        c1431920nMk.getClass();
        C11PQ c11pq = new C11PQ();
        ((InterfaceC1633950scb) c1431920nMk.LIZIZ.getValue()).LIZ(effect2, new C1633940sca(c11pq, effect2, c1431920nMk));
        return new C19475711Hn(c11pq).LJJJJZI(new AkS486S0100000_25(effect2, 15));
    }
}
