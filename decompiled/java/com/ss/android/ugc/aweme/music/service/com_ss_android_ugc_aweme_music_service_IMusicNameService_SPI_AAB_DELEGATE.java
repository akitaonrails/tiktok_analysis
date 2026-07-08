package com.ss.android.ugc.aweme.music.service;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.gamora.editor.music.MusicNameServiceImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_music_service_IMusicNameService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_music_service_IMusicNameService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_music_service_IMusicNameService_SPI_AAB_DELEGATE();
    public static final C01GW MusicNameServiceImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(593));
    public static final int $stable = 8;

    private final MusicNameServiceImpl getMusicNameServiceImplinstance() {
        return (MusicNameServiceImpl) MusicNameServiceImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IMusicNameService> getServices() {
        ArrayList<IMusicNameService> arrayList = new ArrayList<>();
        arrayList.add(getMusicNameServiceImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IMusicNameService getService() {
        return getMusicNameServiceImplinstance();
    }
}
