package com.ss.android.ugc.aweme.im.service.network;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.service.impl.network.IMChatRoomNetDispatchConfigServiceImpl;
import com.ss.android.ugc.aweme.im.service.impl.network.IMOutPushNetDispatchConfigServiceImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class com_ss_android_ugc_aweme_im_service_network_IMChatRoomNetDispatchConfigService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final C01GW IMChatRoomNetDispatchConfigServiceImplinstance$delegate;
    public static final C01GW IMOutPushNetDispatchConfigServiceImplinstance$delegate;
    public static final com_ss_android_ugc_aweme_im_service_network_IMChatRoomNetDispatchConfigService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_service_network_IMChatRoomNetDispatchConfigService_SPI_AAB_DELEGATE();

    static {
        EnumC452301pR enumC452301pR = EnumC452301pR.PUBLICATION;
        IMOutPushNetDispatchConfigServiceImplinstance$delegate = C452501pT.LIZ(enumC452301pR, AFwS201S0000000_14.get$arr$(253));
        IMChatRoomNetDispatchConfigServiceImplinstance$delegate = C452501pT.LIZ(enumC452301pR, AFwS201S0000000_14.get$arr$(252));
    }

    private final IMChatRoomNetDispatchConfigServiceImpl getIMChatRoomNetDispatchConfigServiceImplinstance() {
        return (IMChatRoomNetDispatchConfigServiceImpl) IMChatRoomNetDispatchConfigServiceImplinstance$delegate.getValue();
    }

    private final IMOutPushNetDispatchConfigServiceImpl getIMOutPushNetDispatchConfigServiceImplinstance() {
        return (IMOutPushNetDispatchConfigServiceImpl) IMOutPushNetDispatchConfigServiceImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IMChatRoomNetDispatchConfigService> getServices() {
        ArrayList<IMChatRoomNetDispatchConfigService> arrayList = new ArrayList<>();
        arrayList.add(getIMOutPushNetDispatchConfigServiceImplinstance());
        arrayList.add(getIMChatRoomNetDispatchConfigServiceImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IMChatRoomNetDispatchConfigService getService() {
        return getIMOutPushNetDispatchConfigServiceImplinstance();
    }
}
