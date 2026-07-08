package com.ss.android.ugc.aweme.im.sticker.api.provider;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.sticker.basic.provider.BasicIMStickerFallbackProvider;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_sticker_api_provider_IMStickerFallbackProvider_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_sticker_api_provider_IMStickerFallbackProvider_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_sticker_api_provider_IMStickerFallbackProvider_SPI_AAB_DELEGATE();
    public static final C01GW BasicIMStickerFallbackProviderinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(545));

    private final BasicIMStickerFallbackProvider getBasicIMStickerFallbackProviderinstance() {
        return (BasicIMStickerFallbackProvider) BasicIMStickerFallbackProviderinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IMStickerFallbackProvider> getServices() {
        ArrayList<IMStickerFallbackProvider> arrayList = new ArrayList<>();
        arrayList.add(getBasicIMStickerFallbackProviderinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IMStickerFallbackProvider getService() {
        return getBasicIMStickerFallbackProviderinstance();
    }
}
