package com.ss.android.ugc.aweme.im.chatroom.api;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.adapter.FollowTaskService;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_chatroom_api_IFollowTaskService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_chatroom_api_IFollowTaskService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_chatroom_api_IFollowTaskService_SPI_AAB_DELEGATE();
    public static final C01GW FollowTaskServiceinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(354));

    private final FollowTaskService getFollowTaskServiceinstance() {
        return (FollowTaskService) FollowTaskServiceinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IFollowTaskService> getServices() {
        ArrayList<IFollowTaskService> arrayList = new ArrayList<>();
        arrayList.add(getFollowTaskServiceinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IFollowTaskService getService() {
        return getFollowTaskServiceinstance();
    }
}
