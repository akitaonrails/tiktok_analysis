package com.ss.android.ugc.aweme.im.saas.host.api.debug;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.saas.host.impl.debug.IMSaasHostOfflineDebugServiceImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class com_ss_android_ugc_aweme_im_saas_host_api_debug_IMSaasHostOfflineDebugService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_saas_host_api_debug_IMSaasHostOfflineDebugService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_saas_host_api_debug_IMSaasHostOfflineDebugService_SPI_AAB_DELEGATE();
    public static final C01GW IMSaasHostOfflineDebugServiceImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS201S0000000_14.get$arr$(165));
    public static final int $stable = 8;

    private final IMSaasHostOfflineDebugServiceImpl getIMSaasHostOfflineDebugServiceImplinstance() {
        return (IMSaasHostOfflineDebugServiceImpl) IMSaasHostOfflineDebugServiceImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IMSaasHostOfflineDebugService> getServices() {
        ArrayList<IMSaasHostOfflineDebugService> arrayList = new ArrayList<>();
        arrayList.add(getIMSaasHostOfflineDebugServiceImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IMSaasHostOfflineDebugService getService() {
        return getIMSaasHostOfflineDebugServiceImplinstance();
    }
}
