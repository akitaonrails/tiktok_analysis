package com.ss.android.ugc.aweme.im.saas.api.groupchat;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.exposed.IMExposedGroupChatBridgeImpl;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_saas_api_groupchat_IMGroupChatBridge_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_saas_api_groupchat_IMGroupChatBridge_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_saas_api_groupchat_IMGroupChatBridge_SPI_AAB_DELEGATE();
    public static final C01GW IMExposedGroupChatBridgeImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(391));

    private final IMExposedGroupChatBridgeImpl getIMExposedGroupChatBridgeImplinstance() {
        return (IMExposedGroupChatBridgeImpl) IMExposedGroupChatBridgeImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IMGroupChatBridge> getServices() {
        ArrayList<IMGroupChatBridge> arrayList = new ArrayList<>();
        arrayList.add(getIMExposedGroupChatBridgeImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IMGroupChatBridge getService() {
        return getIMExposedGroupChatBridgeImplinstance();
    }
}
