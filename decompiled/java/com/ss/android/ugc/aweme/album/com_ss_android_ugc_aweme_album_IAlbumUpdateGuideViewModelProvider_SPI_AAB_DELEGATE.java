package com.ss.android.ugc.aweme.album;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_album_IAlbumUpdateGuideViewModelProvider_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_album_IAlbumUpdateGuideViewModelProvider_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_album_IAlbumUpdateGuideViewModelProvider_SPI_AAB_DELEGATE();
    public static final C01GW AlbumUpdateGuideViewModelProviderinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(181));

    private final AlbumUpdateGuideViewModelProvider getAlbumUpdateGuideViewModelProviderinstance() {
        return (AlbumUpdateGuideViewModelProvider) AlbumUpdateGuideViewModelProviderinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IAlbumUpdateGuideViewModelProvider> getServices() {
        ArrayList<IAlbumUpdateGuideViewModelProvider> arrayList = new ArrayList<>();
        arrayList.add(getAlbumUpdateGuideViewModelProviderinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IAlbumUpdateGuideViewModelProvider getService() {
        return getAlbumUpdateGuideViewModelProviderinstance();
    }
}
