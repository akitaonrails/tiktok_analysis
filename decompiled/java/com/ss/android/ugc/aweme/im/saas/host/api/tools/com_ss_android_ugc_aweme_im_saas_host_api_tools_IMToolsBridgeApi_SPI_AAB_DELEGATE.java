package com.ss.android.ugc.aweme.im.saas.host.api.tools;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.saas.host.impl.tools.IMToolsBridgeImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_saas_host_api_tools_IMToolsBridgeApi_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_saas_host_api_tools_IMToolsBridgeApi_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_saas_host_api_tools_IMToolsBridgeApi_SPI_AAB_DELEGATE();
    public static final C01GW IMToolsBridgeImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(471));
    public static final int $stable = 8;

    private final IMToolsBridgeImpl getIMToolsBridgeImplinstance() {
        return (IMToolsBridgeImpl) IMToolsBridgeImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IMToolsBridgeApi> getServices() {
        ArrayList<IMToolsBridgeApi> arrayList = new ArrayList<>();
        arrayList.add(getIMToolsBridgeImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IMToolsBridgeApi getService() {
        return getIMToolsBridgeImplinstance();
    }
}
