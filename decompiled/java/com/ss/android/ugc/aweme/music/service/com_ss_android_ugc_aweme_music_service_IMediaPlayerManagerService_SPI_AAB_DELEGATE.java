package com.ss.android.ugc.aweme.music.service;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.image.music.MediaPlayerManagerServiceImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_music_service_IMediaPlayerManagerService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_music_service_IMediaPlayerManagerService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_music_service_IMediaPlayerManagerService_SPI_AAB_DELEGATE();
    public static final C01GW MediaPlayerManagerServiceImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(591));
    public static final int $stable = 8;

    private final MediaPlayerManagerServiceImpl getMediaPlayerManagerServiceImplinstance() {
        return (MediaPlayerManagerServiceImpl) MediaPlayerManagerServiceImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IMediaPlayerManagerService> getServices() {
        ArrayList<IMediaPlayerManagerService> arrayList = new ArrayList<>();
        arrayList.add(getMediaPlayerManagerServiceImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IMediaPlayerManagerService getService() {
        return getMediaPlayerManagerServiceImplinstance();
    }
}
