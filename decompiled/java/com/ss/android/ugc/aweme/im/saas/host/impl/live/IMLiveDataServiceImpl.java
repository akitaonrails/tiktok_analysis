package com.ss.android.ugc.aweme.im.saas.host.impl.live;

import X.C0K77;
import X.InterfaceC2183451Acp;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveDataService;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class IMLiveDataServiceImpl implements IMLiveDataService {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveDataService
    public final boolean LIZ() {
        C0K77 c0k77C3;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        return (iLiveOuterService == null || (c0k77C3 = iLiveOuterService.C3()) == null || !c0k77C3.LIZ()) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveDataService
    public final void LIZIZ(String str) {
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null) {
            iLiveOuterService.LIZIZ(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveDataService
    public final void LIZJ(String str) {
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null) {
            iLiveOuterService.D4(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveDataService
    public final void g1(List<Long> list) {
        InterfaceC2183451Acp interfaceC2183451AcpX3;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (interfaceC2183451AcpX3 = iLiveOuterService.X3()) != null) {
            interfaceC2183451AcpX3.g1(list);
        }
    }
}
