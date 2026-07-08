package com.ss.android.ugc.aweme.im.service.legacy;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.slot.IMBaseLegacyBridgeService;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_service_legacy_IMBaseLegacyBridge_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_service_legacy_IMBaseLegacyBridge_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_service_legacy_IMBaseLegacyBridge_SPI_AAB_DELEGATE();
    public static final C01GW IMBaseLegacyBridgeServiceinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(519));

    private final IMBaseLegacyBridgeService getIMBaseLegacyBridgeServiceinstance() {
        return (IMBaseLegacyBridgeService) IMBaseLegacyBridgeServiceinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IMBaseLegacyBridge> getServices() {
        ArrayList<IMBaseLegacyBridge> arrayList = new ArrayList<>();
        arrayList.add(getIMBaseLegacyBridgeServiceinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IMBaseLegacyBridge getService() {
        return getIMBaseLegacyBridgeServiceinstance();
    }
}
