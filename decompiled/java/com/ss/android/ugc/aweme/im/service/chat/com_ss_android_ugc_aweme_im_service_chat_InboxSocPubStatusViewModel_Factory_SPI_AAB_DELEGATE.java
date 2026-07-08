package com.ss.android.ugc.aweme.im.service.chat;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.socialpublish.viewmodel.InboxSocPubStatusViewModelImpl;
import com.ss.android.ugc.aweme.im.service.chat.InboxSocPubStatusViewModel;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_service_chat_InboxSocPubStatusViewModel_Factory_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_service_chat_InboxSocPubStatusViewModel_Factory_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_service_chat_InboxSocPubStatusViewModel_Factory_SPI_AAB_DELEGATE();
    public static final C01GW Factoryinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(509));

    private final InboxSocPubStatusViewModelImpl.Factory getFactoryinstance() {
        return (InboxSocPubStatusViewModelImpl.Factory) Factoryinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<InboxSocPubStatusViewModel.Factory> getServices() {
        ArrayList<InboxSocPubStatusViewModel.Factory> arrayList = new ArrayList<>();
        arrayList.add(getFactoryinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public InboxSocPubStatusViewModel.Factory getService() {
        return getFactoryinstance();
    }
}
