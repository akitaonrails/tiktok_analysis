package com.ss.android.ugc.aweme.creation.sender;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.creation.sender.MediaMsgSendManager;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_creation_sender_IMediaMsgSendManager_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_creation_sender_IMediaMsgSendManager_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_creation_sender_IMediaMsgSendManager_SPI_AAB_DELEGATE();
    public static final C01GW Serviceinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(214));

    private final MediaMsgSendManager.Service getServiceinstance() {
        return (MediaMsgSendManager.Service) Serviceinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IMediaMsgSendManager> getServices() {
        ArrayList<IMediaMsgSendManager> arrayList = new ArrayList<>();
        arrayList.add(getServiceinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IMediaMsgSendManager getService() {
        return getServiceinstance();
    }
}
