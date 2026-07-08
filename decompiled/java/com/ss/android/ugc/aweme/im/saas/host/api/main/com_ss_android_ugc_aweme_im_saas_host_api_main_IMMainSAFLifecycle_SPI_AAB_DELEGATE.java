package com.ss.android.ugc.aweme.im.saas.host.api.main;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.saas.host.impl.main.IMMainSAFLifecycleImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_saas_host_api_main_IMMainSAFLifecycle_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_saas_host_api_main_IMMainSAFLifecycle_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_saas_host_api_main_IMMainSAFLifecycle_SPI_AAB_DELEGATE();
    public static final C01GW IMMainSAFLifecycleImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(459));
    public static final int $stable = 8;

    private final IMMainSAFLifecycleImpl getIMMainSAFLifecycleImplinstance() {
        return (IMMainSAFLifecycleImpl) IMMainSAFLifecycleImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IMMainSAFLifecycle> getServices() {
        ArrayList<IMMainSAFLifecycle> arrayList = new ArrayList<>();
        arrayList.add(getIMMainSAFLifecycleImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IMMainSAFLifecycle getService() {
        return getIMMainSAFLifecycleImplinstance();
    }
}
