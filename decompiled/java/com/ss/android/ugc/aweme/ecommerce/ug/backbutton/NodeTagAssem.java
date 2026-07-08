package com.ss.android.ugc.aweme.ecommerce.ug.backbutton;

import X.C1150504el;
import X.C19EG;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC1583770rJf;
import android.os.Bundle;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;

/* JADX INFO: loaded from: classes25.dex */
public final class NodeTagAssem extends BaseMainContainerAssem implements InterfaceC1583770rJf {
    public String LL;

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            Hox.LLJILJIL.LIZ(c19egLIZ).OQ2(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onCreate(Bundle bundle) {
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"NodeTagAssem", "onCreate_with_bundle"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onCreate(bundle);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            Hox.LLJILJIL.LIZ(c19egLIZ).vQ2(this);
        }
        C1150504el.LIZ().LJI(strJ4, false);
    }

    @Override // X.InterfaceC1583770rJf
    public final void A4(String str, String str2) {
        this.LL = str2;
    }
}
