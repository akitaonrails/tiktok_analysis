package com.ss.android.ugc.aweme.main;

import X.C1030680cva;
import X.C687700QyG;
import X.InterfaceC1146704e9;
import X.InterfaceC1601520rmI;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class LiveMainActivityColdStartAssem extends BaseMainContainerAssem implements InterfaceC1146704e9 {
    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onBeforeCreate() {
        InterfaceC1601520rmI interfaceC1601520rmIS3;
        super.onBeforeCreate();
        boolean zLJIIIZ = C1030680cva.LJIIIZ();
        boolean z = C1030680cva.LJIJ;
        boolean z2 = C1030680cva.LJFF;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService == null || (interfaceC1601520rmIS3 = iLiveOuterService.S3()) == null) {
            return;
        }
        interfaceC1601520rmIS3.LJFF(zLJIIIZ, z, z2);
    }
}
