package com.ss.android.ugc.aweme.ecommerce.ug.common.assem;

import X.C1150504el;
import X.C1552540qVI;
import X.C19EG;
import X.C724240Sb0;
import X.C786410Ut5;
import android.os.Bundle;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.ecommerce.ug.pitaya.service.IEcUgPitayaService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes17.dex */
public final class EcUgMainAssem extends BaseMainContainerAssem {
    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        String str;
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"EcUgMainAssem", "onResume"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onResume();
        C1552540qVI c1552540qVI = C1552540qVI.LIZ;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        c1552540qVI.getClass();
        if (c19egLIZ != null && (str = C1552540qVI.LIZJ) != null && !a0.LJJJIL(str)) {
            C1552540qVI.LIZJ = null;
            C1552540qVI.LIZ(c19egLIZ, str);
        }
        C1150504el.LIZ().LJI(strJ4, false);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onCreate(Bundle bundle) {
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"EcUgMainAssem", "onCreate_with_bundle"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onCreate(bundle);
        IEcUgPitayaService iEcUgPitayaService = (IEcUgPitayaService) PluggableExtentionKt.pluggableSpi$default(IEcUgPitayaService.class, false, false, false, 14, null);
        if (iEcUgPitayaService != null) {
            iEcUgPitayaService.LJI();
        }
        C1150504el.LIZ().LJI(strJ4, false);
    }
}
