package com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.api;

import X.C106G;
import X.C11NZ;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;

/* JADX INFO: loaded from: classes29.dex */
public interface PaPromptApi {
    public static final C106G LIZ = C106G.LIZ;

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/privacy/user/private_account_prompt/v1")
    C11NZ<PaPromptResponse> updatePrivateAccountAndFetchPrivacySettings(@InterfaceC1501050pAF("private_account") int i);
}
