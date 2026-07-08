package com.ss.android.ugc.aweme.im.saas.host.api.camera;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.saas.host.impl.camera.IMCameraBridgeService;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class com_ss_android_ugc_aweme_im_saas_host_api_camera_IMCameraBridgeApi_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_saas_host_api_camera_IMCameraBridgeApi_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_saas_host_api_camera_IMCameraBridgeApi_SPI_AAB_DELEGATE();
    public static final C01GW IMCameraBridgeServiceinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS201S0000000_14.get$arr$(164));
    public static final int $stable = 8;

    private final IMCameraBridgeService getIMCameraBridgeServiceinstance() {
        return (IMCameraBridgeService) IMCameraBridgeServiceinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IMCameraBridgeApi> getServices() {
        ArrayList<IMCameraBridgeApi> arrayList = new ArrayList<>();
        arrayList.add(getIMCameraBridgeServiceinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IMCameraBridgeApi getService() {
        return getIMCameraBridgeServiceinstance();
    }
}
