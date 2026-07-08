package com.ss.android.ugc.aweme.im.service.chatroom;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.service.impl.IMChatRoomServiceImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_service_chatroom_IIMChatRoomService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_service_chatroom_IIMChatRoomService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_service_chatroom_IIMChatRoomService_SPI_AAB_DELEGATE();
    public static final C01GW IMChatRoomServiceImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(511));

    private final IMChatRoomServiceImpl getIMChatRoomServiceImplinstance() {
        return (IMChatRoomServiceImpl) IMChatRoomServiceImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IIMChatRoomService> getServices() {
        ArrayList<IIMChatRoomService> arrayList = new ArrayList<>();
        arrayList.add(getIMChatRoomServiceImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IIMChatRoomService getService() {
        return getIMChatRoomServiceImplinstance();
    }
}
