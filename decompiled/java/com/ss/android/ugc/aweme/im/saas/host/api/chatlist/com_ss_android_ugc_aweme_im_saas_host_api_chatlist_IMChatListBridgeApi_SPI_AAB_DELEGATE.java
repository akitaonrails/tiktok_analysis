package com.ss.android.ugc.aweme.im.saas.host.api.chatlist;

import X.C01GW;
import X.C04PB;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.saas.host.impl.chatlist.IMChatListBridgeService;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_saas_host_api_chatlist_IMChatListBridgeApi_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_saas_host_api_chatlist_IMChatListBridgeApi_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_saas_host_api_chatlist_IMChatListBridgeApi_SPI_AAB_DELEGATE();
    public static final C01GW IMChatListBridgeServiceinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, new C04PB());
    public static final int $stable = 8;

    private final IMChatListBridgeService getIMChatListBridgeServiceinstance() {
        return (IMChatListBridgeService) IMChatListBridgeServiceinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IMChatListBridgeApi> getServices() {
        ArrayList<IMChatListBridgeApi> arrayList = new ArrayList<>();
        arrayList.add(getIMChatListBridgeServiceinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IMChatListBridgeApi getService() {
        return getIMChatListBridgeServiceinstance();
    }
}
