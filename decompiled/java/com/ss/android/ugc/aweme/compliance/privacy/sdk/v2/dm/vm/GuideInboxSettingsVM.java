package com.ss.android.ugc.aweme.compliance.privacy.sdk.v2.dm.vm;

import X.C191880104w;
import X.C191985108x;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;

/* JADX INFO: loaded from: classes29.dex */
public final class GuideInboxSettingsVM extends ViewModel {
    public final MutableLiveData<Integer> LL;
    public final MutableLiveData<Integer> LLILLJJLI;
    public final MutableLiveData<Integer> LLILLL;

    public GuideInboxSettingsVM() {
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(1);
        C191880104w.LIZ.getClass();
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIJJI = C191880104w.LJIIJJI(0, "dm_setting_friends");
        MutableLiveData<Integer> mutableLiveData2 = null;
        this.LL = privacySettingsRestrictionItemLJIIJJI != null && C191985108x.LIZLLL(privacySettingsRestrictionItemLJIIJJI).LIZIZ ? mutableLiveData : null;
        MutableLiveData<Integer> mutableLiveData3 = new MutableLiveData<>(1);
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIJJI2 = C191880104w.LJIIJJI(0, "dm_setting_potential_connection");
        this.LLILLJJLI = (privacySettingsRestrictionItemLJIIJJI2 == null || !C191985108x.LIZLLL(privacySettingsRestrictionItemLJIIJJI2).LIZIZ) ? null : mutableLiveData3;
        MutableLiveData<Integer> mutableLiveData4 = new MutableLiveData<>(1);
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIJJI3 = C191880104w.LJIIJJI(0, "dm_setting_others");
        if (privacySettingsRestrictionItemLJIIJJI3 != null && C191985108x.LIZLLL(privacySettingsRestrictionItemLJIIJJI3).LIZIZ) {
            mutableLiveData2 = mutableLiveData4;
        }
        this.LLILLL = mutableLiveData2;
    }
}
