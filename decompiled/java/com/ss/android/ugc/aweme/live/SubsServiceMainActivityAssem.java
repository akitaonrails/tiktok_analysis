package com.ss.android.ugc.aweme.live;

import X.C1150504el;
import X.C786410Ut5;
import X.C823050WQl;
import android.os.Bundle;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;

/* JADX INFO: loaded from: classes17.dex */
public final class SubsServiceMainActivityAssem extends BaseMainContainerAssem {
    public boolean LL;

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        this.LL = true;
        DataChannelGlobal.LLILZ.zQ2(this);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onCreate(Bundle bundle) {
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"SubsServiceMainActivityAssem", "onCreate_with_bundle"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onCreate(bundle);
        C823050WQl.LIZIZ().execute(new Runnable() { // from class: X.0KB4
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SubsServiceMainActivityAssem@401a.onCreate$1");
                try {
                    ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
                    C0K77 c0k77C3 = iLiveOuterService != null ? iLiveOuterService.C3() : null;
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0KB5(this.LL, c0k77C3, null), 3);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SubsServiceMainActivityAssem@401a.onCreate$1");
            }
        });
        C1150504el.LIZ().LJI(strJ4, false);
    }
}
