package com.ss.android.ugc.aweme.im.saas.host.api.profile;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.saas.host.impl.profile.IMProfileBridgeImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_saas_host_api_profile_IMProfileBridge_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_saas_host_api_profile_IMProfileBridge_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_saas_host_api_profile_IMProfileBridge_SPI_AAB_DELEGATE();
    public static final C01GW IMProfileBridgeImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(464));
    public static final int $stable = 8;

    private final IMProfileBridgeImpl getIMProfileBridgeImplinstance() {
        return (IMProfileBridgeImpl) IMProfileBridgeImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IMProfileBridge> getServices() {
        ArrayList<IMProfileBridge> arrayList = new ArrayList<>();
        arrayList.add(getIMProfileBridgeImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IMProfileBridge getService() {
        return getIMProfileBridgeImplinstance();
    }
}
