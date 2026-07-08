package com.ss.android.ugc.aweme.album;

import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_album_IAlbumGuideFrequencyControlSDKHelper_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_album_IAlbumGuideFrequencyControlSDKHelper_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_album_IAlbumGuideFrequencyControlSDKHelper_SPI_AAB_DELEGATE();

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IAlbumGuideFrequencyControlSDKHelper getService() {
        return new AlbumGuideFrequencyControlSDKHelper();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IAlbumGuideFrequencyControlSDKHelper> getServices() {
        ArrayList<IAlbumGuideFrequencyControlSDKHelper> arrayList = new ArrayList<>();
        arrayList.add(new AlbumGuideFrequencyControlSDKHelper());
        return arrayList;
    }
}
