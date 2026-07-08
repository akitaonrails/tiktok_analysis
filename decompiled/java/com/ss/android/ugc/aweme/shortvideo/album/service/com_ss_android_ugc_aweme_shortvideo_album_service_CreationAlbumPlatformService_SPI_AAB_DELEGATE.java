package com.ss.android.ugc.aweme.shortvideo.album.service;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.portrait.customize.album.AIPortraitAlbumPlatformServiceImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_shortvideo_album_service_CreationAlbumPlatformService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_shortvideo_album_service_CreationAlbumPlatformService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_shortvideo_album_service_CreationAlbumPlatformService_SPI_AAB_DELEGATE();
    public static final C01GW AIPortraitAlbumPlatformServiceImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(657));
    public static final int $stable = 8;

    private final AIPortraitAlbumPlatformServiceImpl getAIPortraitAlbumPlatformServiceImplinstance() {
        return (AIPortraitAlbumPlatformServiceImpl) AIPortraitAlbumPlatformServiceImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<CreationAlbumPlatformService> getServices() {
        ArrayList<CreationAlbumPlatformService> arrayList = new ArrayList<>();
        arrayList.add(getAIPortraitAlbumPlatformServiceImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public CreationAlbumPlatformService getService() {
        return getAIPortraitAlbumPlatformServiceImplinstance();
    }
}
