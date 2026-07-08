package com.ss.android.ugc.aweme.im.saas.host.api.shareeffect;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.saas.host.impl.shareeffect.IMShareEffectBridgeImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_saas_host_api_shareeffect_IMShareEffectBridgeApi_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_saas_host_api_shareeffect_IMShareEffectBridgeApi_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_saas_host_api_shareeffect_IMShareEffectBridgeApi_SPI_AAB_DELEGATE();
    public static final C01GW IMShareEffectBridgeImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(470));
    public static final int $stable = 8;

    private final IMShareEffectBridgeImpl getIMShareEffectBridgeImplinstance() {
        return (IMShareEffectBridgeImpl) IMShareEffectBridgeImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IMShareEffectBridgeApi> getServices() {
        ArrayList<IMShareEffectBridgeApi> arrayList = new ArrayList<>();
        arrayList.add(getIMShareEffectBridgeImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IMShareEffectBridgeApi getService() {
        return getIMShareEffectBridgeImplinstance();
    }
}
