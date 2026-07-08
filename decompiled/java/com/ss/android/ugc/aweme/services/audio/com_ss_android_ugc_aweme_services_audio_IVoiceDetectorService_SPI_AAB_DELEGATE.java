package com.ss.android.ugc.aweme.services.audio;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.gamora.editor.audioservice.service.voicedetection.VoiceDetectorService;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_services_audio_IVoiceDetectorService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_services_audio_IVoiceDetectorService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_services_audio_IVoiceDetectorService_SPI_AAB_DELEGATE();
    public static final C01GW VoiceDetectorServiceinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(638));
    public static final int $stable = 8;

    private final VoiceDetectorService getVoiceDetectorServiceinstance() {
        return (VoiceDetectorService) VoiceDetectorServiceinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IVoiceDetectorService> getServices() {
        ArrayList<IVoiceDetectorService> arrayList = new ArrayList<>();
        arrayList.add(getVoiceDetectorServiceinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IVoiceDetectorService getService() {
        return getVoiceDetectorServiceinstance();
    }
}
