package com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.data;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.ChatDetailImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_sdk_chatdetail_refactor_data_IChatDetailApi_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_sdk_chatdetail_refactor_data_IChatDetailApi_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_sdk_chatdetail_refactor_data_IChatDetailApi_SPI_AAB_DELEGATE();
    public static final C01GW ChatDetailImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(497));

    private final ChatDetailImpl getChatDetailImplinstance() {
        return (ChatDetailImpl) ChatDetailImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IChatDetailApi> getServices() {
        ArrayList<IChatDetailApi> arrayList = new ArrayList<>();
        arrayList.add(getChatDetailImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IChatDetailApi getService() {
        return getChatDetailImplinstance();
    }
}
