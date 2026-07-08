package com.ss.android.ugc.aweme.services.user;

import X.AbstractC1505170pGt;
import X.C01GW;
import X.C452501pT;
import com.ss.android.ugc.aweme.services.audio.IAudioParams;
import com.ss.android.ugc.aweme.services.audio.IAudioService;
import com.ss.android.ugc.aweme.services.audio.IAudioServiceFactory;
import com.ss.android.ugc.aweme.services.audio.IAudioUserPortraitService;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: loaded from: classes35.dex */
public final class AudioUserPortraitServiceFactory implements IAudioUserPortraitService, IAudioServiceFactory<UserPortraitParams> {
    public static final Companion Companion = new Companion();
    public final C01GW portraitCenterService$delegate = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(113));

    public static final class Companion {
    }

    public IAudioUserPortraitService getAudioService(UserPortraitParams userPortraitParams) {
        return this;
    }

    private final AbstractC1505170pGt getPortraitCenterService() {
        return (AbstractC1505170pGt) this.portraitCenterService$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioUserPortraitService
    public int getUserAgeGroup() {
        int iLJFF = getPortraitCenterService().LJFF(-404, "predicted_age_group_classifier_latest");
        return iLJFF != -404 ? iLJFF : getPortraitCenterService().LJFF(-404, "m_predicted_age_group_classifier_latest");
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioServiceFactory
    public /* bridge */ /* synthetic */ IAudioService getAudioService(IAudioParams iAudioParams) {
        getAudioService((UserPortraitParams) iAudioParams);
        return this;
    }
}
