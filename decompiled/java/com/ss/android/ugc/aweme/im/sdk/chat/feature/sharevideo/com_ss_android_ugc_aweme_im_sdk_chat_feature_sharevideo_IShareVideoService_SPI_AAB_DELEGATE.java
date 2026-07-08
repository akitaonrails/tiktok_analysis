package com.ss.android.ugc.aweme.im.sdk.chat.feature.sharevideo;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.sharevideopanel.ShareVideoService;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_sdk_chat_feature_sharevideo_IShareVideoService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_sdk_chat_feature_sharevideo_IShareVideoService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_sdk_chat_feature_sharevideo_IShareVideoService_SPI_AAB_DELEGATE();
    public static final C01GW ShareVideoServiceinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(481));

    private final ShareVideoService getShareVideoServiceinstance() {
        return (ShareVideoService) ShareVideoServiceinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IShareVideoService> getServices() {
        ArrayList<IShareVideoService> arrayList = new ArrayList<>();
        arrayList.add(getShareVideoServiceinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IShareVideoService getService() {
        return getShareVideoServiceinstance();
    }
}
