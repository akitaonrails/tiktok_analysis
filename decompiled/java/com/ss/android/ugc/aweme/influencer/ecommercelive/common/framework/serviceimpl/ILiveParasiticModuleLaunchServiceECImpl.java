package com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.serviceimpl;

import X.C0JGA;
import X.C21207317yx;
import X.EnumC495860JcW;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService;
import kotlin.Unit;

/* JADX INFO: loaded from: classes32.dex */
public final class ILiveParasiticModuleLaunchServiceECImpl implements ILiveParasiticModuleLaunchService {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.14e9] */
    @Override // com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService
    public final void launch() {
        ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        iLiveOuterService.j6().registerSlot(new C21207317yx());
        iLiveOuterService.I3().LIZ(EnumC495860JcW.BUSINESS, new C0JGA<Unit>() { // from class: X.14e9
            @Override // X.C0JGA
            public final AbstractC495790JcP LIZ(C495920Jcc c495920Jcc) {
                return new C2260851DeN(c495920Jcc);
            }
        });
    }
}
