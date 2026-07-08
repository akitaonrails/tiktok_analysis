package com.ss.android.ugc.aweme.im.avatarloader.api;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.avatarloader.impl.IMAvatarLoaderImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_avatarloader_api_IMAvatarLoaderApi_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_avatarloader_api_IMAvatarLoaderApi_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_avatarloader_api_IMAvatarLoaderApi_SPI_AAB_DELEGATE();
    public static final C01GW Serviceinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(334));

    private final IMAvatarLoaderImpl.Service getServiceinstance() {
        return (IMAvatarLoaderImpl.Service) Serviceinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IMAvatarLoaderApi> getServices() {
        ArrayList<IMAvatarLoaderApi> arrayList = new ArrayList<>();
        arrayList.add(getServiceinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IMAvatarLoaderApi getService() {
        return getServiceinstance();
    }
}
