package com.ss.android.ugc.aweme.fangroup.assem;

import X.C01GW;
import X.C0ZK1;
import X.C0ZKF;
import X.C1156850gD5;
import X.C1559260qg8;
import X.C452501pT;
import X.C723590SZx;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class FanGroupJoinPanelContentAssem extends UISlotAssem {
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 542));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS565S0100000_21(this, 543));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 541));
    public final C1559260qg8 LLJJIJIIJIL = new C1559260qg8(new C723590SZx(this, C1156850gD5.class, null), checkSupervisorPrepared());
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 540));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cj4;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ((IDMAvatarLoader) this.LLJJIJIL.getValue()).LIZLLL(((C1156850gD5) this.LLJJIJIIJIL.getValue()).LL, ((C1156850gD5) this.LLJJIJIIJIL.getValue()).LLILLL, null, new C0ZKF(0, 0, 0, 0, 0, (C0ZK1) null, 127));
        ((TextView) this.LLJJIII.getValue()).setText(((C1156850gD5) this.LLJJIJIIJIL.getValue()).LLILZ);
        ((TextView) this.LLJJIJI.getValue()).setText(((C1156850gD5) this.LLJJIJIIJIL.getValue()).LLILZIL);
    }
}
