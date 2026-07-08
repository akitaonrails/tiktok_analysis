package com.ss.android.ugc.aweme.feed.assems;

import X.C01GW;
import X.C1568730qvP;
import X.C1568740qvQ;
import X.C452501pT;
import X.C486610J6l;
import X.C755980Tl6;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes25.dex */
public final class LiveMainFragmentAssem extends UIContentAssem {
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C1568730qvP(this));
    public final C01GW LLJ = C452501pT.LIZIZ(new C1568740qvQ(this));

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Object value = this.LLIZLLLIL.getValue();
        value.getClass();
        EventBus.LIZLLL().LJJI(value);
        C755980Tl6.LIZ().LIZJ();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ((C486610J6l) this.LLIZLLLIL.getValue()).LIZ();
    }
}
