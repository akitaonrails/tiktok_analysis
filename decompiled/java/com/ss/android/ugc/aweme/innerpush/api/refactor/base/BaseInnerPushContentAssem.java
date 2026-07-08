package com.ss.android.ugc.aweme.innerpush.api.refactor.base;

import X.C01GW;
import X.C1559260qg8;
import X.C1591806Lc;
import X.C452501pT;
import X.C723590SZx;
import X.C786410Ut5;
import Y.ACListenerS137S0100000_2;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseInnerPushContentAssem extends UIContentAssem {
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C1591806Lc.class, null), checkSupervisorPrepared());
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 636));

    public abstract int Go();

    public final InnerPushMessage Ho() {
        return ((C1591806Lc) this.LLIZLLLIL.getValue()).LL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.I7(new ACListenerS137S0100000_2(this, 38), view);
    }
}
