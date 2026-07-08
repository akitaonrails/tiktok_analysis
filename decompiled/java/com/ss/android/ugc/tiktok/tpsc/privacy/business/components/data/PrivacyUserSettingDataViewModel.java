package com.ss.android.ugc.tiktok.tpsc.privacy.business.components.data;

import X.AnonymousClass1091;
import X.C11NZ;
import X.C191862104e;
import X.C191871104n;
import X.C191880104w;
import X.InterfaceC989510brB;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.ss.android.ugc.tiktok.tpsc.privacy.business.components.data.PrivacyUserSettingDataViewModel;

/* JADX INFO: loaded from: classes29.dex */
public final class PrivacyUserSettingDataViewModel extends BaseSettingDataViewModel {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public final String LLILZLL;
    public final AnonymousClass1091 LLIZ;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        C191862104e c191862104eLJ = C191871104n.LJ();
        AnonymousClass1091 anonymousClass1091 = this.LLIZ;
        c191862104eLJ.getClass();
        C191862104e.LIZLLL(anonymousClass1091);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0brB, X.1091] */
    public PrivacyUserSettingDataViewModel(String str) {
        int iLIZ;
        this.LLILZLL = str;
        ?? r1 = new InterfaceC989510brB<PrivacyUserSettingsV2>() { // from class: X.1091
            @Override // X.InterfaceC989510brB
            public final void LLZZLLIL(PrivacyUserSettingsV2 privacyUserSettingsV2) {
                int iIntValue;
                Integer numLIZ;
                PrivacyUserSettingsV2 privacyUserSettingsV22 = privacyUserSettingsV2;
                PrivacyUserSettingDataViewModel privacyUserSettingDataViewModel = this.LL;
                MutableLiveData<Integer> mutableLiveData = privacyUserSettingDataViewModel.LLILLL;
                if (privacyUserSettingsV22 != null && (numLIZ = privacyUserSettingsV22.LIZ(privacyUserSettingDataViewModel.LLILZLL)) != null) {
                    iIntValue = numLIZ.intValue();
                } else {
                    iIntValue = -1;
                }
                mutableLiveData.postValue(Integer.valueOf(iIntValue));
            }
        };
        this.LLIZ = r1;
        C191871104n.LJ().getClass();
        C191862104e.LIZJ(r1);
        MutableLiveData<Integer> mutableLiveData = this.LLILLL;
        C191880104w.LIZ.getClass();
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIL = C191880104w.LJIIL();
        mutableLiveData.setValue((privacyUserSettingsV2LJIIL == null || (iLIZ = privacyUserSettingsV2LJIIL.LIZ(str)) == null) ? -1 : iLIZ);
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.privacy.business.components.data.BaseSettingDataViewModel
    public final C11NZ<BaseResponse> vQ2(int i) {
        C191880104w c191880104w = C191880104w.LIZ;
        String str = this.LLILZLL;
        c191880104w.getClass();
        return C191880104w.LJIJI(i, 0, str);
    }
}
