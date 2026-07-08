package com.ss.android.ugc.aweme.publicgroup.assem.groupcreation;

import X.C1229040i5W;
import X.C12860051m;
import X.C14EU;
import X.C1527305yR;
import X.C1559260qg8;
import X.C1616906Ut;
import X.C1617806Vc;
import X.C723590SZx;
import X.C724240Sb0;
import X.EnumC913760Zt0;
import com.bytedance.assem.arch.view.UIContentAssem;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes3.dex */
public final class GroupCreationClosePanelAssem extends UIContentAssem {
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C1527305yR.class, null), checkSupervisorPrepared());

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @C14EU
    public final void onPublicGroupCreateFinish(C1617806Vc c1617806Vc) {
        if (c1617806Vc.LIZ) {
            C1229040i5W c1229040i5W = C1229040i5W.LL;
            if (Intrinsics.LJFF(c1617806Vc.LIZJ, EnumC913760Zt0.FAN_GROUP.getValue())) {
                C12860051m.LIZ().storeBoolean("key_is_first_create", false);
            }
            C1616906Ut.LIZ(((C1527305yR) this.LLIZLLLIL.getValue()).LL.LIZ.LJIIJ, C724240Sb0.LJI(this), C724240Sb0.LIZ(this));
        }
    }
}
