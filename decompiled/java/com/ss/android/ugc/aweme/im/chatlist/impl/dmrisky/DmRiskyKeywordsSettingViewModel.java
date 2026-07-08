package com.ss.android.ugc.aweme.im.chatlist.impl.dmrisky;

import X.C1336205Ku;
import X.C1BNE;
import X.C2252321DDq;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;

/* JADX INFO: loaded from: classes15.dex */
public final class DmRiskyKeywordsSettingViewModel extends DmRiskyKeywordsViewModel {
    public final PrivacySettingsFeature LLIZ;
    public final boolean LLIZLLLIL;
    public final C2252321DDq LLJ;
    public final C2252321DDq LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DmRiskyKeywordsSettingViewModel() {
        super(0);
        PrivacySettingsFeature imPrivacySettings = C1336205Ku.LIZ(false).getImPrivacySettings();
        this.LLIZ = imPrivacySettings;
        boolean zLJIIJ = imPrivacySettings.LJIIJ();
        this.LLIZLLLIL = zLJIIJ;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(Boolean.valueOf(zLJIIJ));
        this.LLJ = c2252321DDqLIZ;
        this.LLJI = c2252321DDqLIZ;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LLIZ.LJJII("dm_filter_keyword");
        super.onCleared();
    }
}
