package com.ss.android.ugc.aweme.im.saas.host.api.im.contact;

import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.saas.host.impl.im.contact.SaasUserUpdateMonitorImpl;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_saas_host_api_im_contact_ISaasUserUpdateMonitor_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final int $stable = 0;
    public static final com_ss_android_ugc_aweme_im_saas_host_api_im_contact_ISaasUserUpdateMonitor_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_saas_host_api_im_contact_ISaasUserUpdateMonitor_SPI_AAB_DELEGATE();

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ISaasUserUpdateMonitor getService() {
        return new SaasUserUpdateMonitorImpl();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<ISaasUserUpdateMonitor> getServices() {
        ArrayList<ISaasUserUpdateMonitor> arrayList = new ArrayList<>();
        arrayList.add(new SaasUserUpdateMonitorImpl());
        return arrayList;
    }
}
