package com.ss.android.ugc.aweme.compliance.privacy.pauseinteraction.vm;

import X.C191880104w;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.pauseinteraction.utils.SingleLiveDataWrapper;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;

/* JADX INFO: loaded from: classes29.dex */
public final class PauseInteractionsVM extends ViewModel {
    public final MutableLiveData<Integer> LL = new MutableLiveData<>(1);
    public final MutableLiveData<Integer> LLILLJJLI = new MutableLiveData<>(1);
    public final SingleLiveDataWrapper<Boolean> LLILLL;

    public PauseInteractionsVM() {
        Integer numLIZ;
        C191880104w.LIZ.getClass();
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIL = C191880104w.LJIIL();
        this.LLILLL = new SingleLiveDataWrapper<>(Boolean.valueOf(true ^ ((privacyUserSettingsV2LJIIL == null || (numLIZ = privacyUserSettingsV2LJIIL.LIZ("pause_interaction_from")) == null || numLIZ.intValue() != 0) ? false : true)));
    }
}
