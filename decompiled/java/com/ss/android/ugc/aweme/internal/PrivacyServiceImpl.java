package com.ss.android.ugc.aweme.internal;

import X.C0XQ7;
import X.C10EU;
import X.C376930EqB;

/* JADX INFO: loaded from: classes23.dex */
public final class PrivacyServiceImpl implements IPrivacyService {
    @Override // com.ss.android.ugc.aweme.internal.IPrivacyService
    public final boolean LIZ() {
        return C10EU.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.internal.IPrivacyService
    public final boolean LIZIZ() {
        return C376930EqB.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.internal.IPrivacyService
    public final boolean LIZJ() {
        return C0XQ7.LJFF().getCurUser().isAccuratePrivateAccount();
    }
}
