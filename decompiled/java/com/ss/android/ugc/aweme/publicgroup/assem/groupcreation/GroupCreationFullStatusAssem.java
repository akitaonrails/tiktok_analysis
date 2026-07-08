package com.ss.android.ugc.aweme.publicgroup.assem.groupcreation;

import X.C01GW;
import X.C1527305yR;
import X.C1559260qg8;
import X.C452501pT;
import X.C723590SZx;
import X.C786410Ut5;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS546S0100000_2;
import wh6.AbS686S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class GroupCreationFullStatusAssem extends UISlotAssem {
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723590SZx(this, C1527305yR.class, null), checkSupervisorPrepared());
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS546S0100000_2(this, 763));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.f888cj7;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.I7(new AbS686S0100000_2(this, 20), (View) this.LLJJIII.getValue());
    }
}
