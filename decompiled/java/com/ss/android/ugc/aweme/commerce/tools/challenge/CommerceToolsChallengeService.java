package com.ss.android.ugc.aweme.commerce.tools.challenge;

import X.C1429380nIe;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class CommerceToolsChallengeService implements ICommerceToolsChallengeService {
    @Override // com.ss.android.ugc.aweme.commerce.tools.challenge.ICommerceToolsChallengeService
    public final void LIZ(Bundle bundle, ShortVideoContext shortVideoContext) {
        Serializable serializable;
        boolean z;
        if (bundle != null) {
            serializable = bundle.getSerializable("extra_open_record_challenge");
        } else {
            serializable = null;
        }
        AVChallenge aVChallenge = (AVChallenge) serializable;
        shortVideoContext.creativeModel.commerceModel.setRecordChallenge(aVChallenge);
        if (aVChallenge != null) {
            z = aVChallenge.isCommerce;
        } else {
            z = false;
        }
        C1429380nIe.LIZIZ = z;
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.challenge.ICommerceToolsChallengeService
    public final void LIZIZ(Intent intent, Intent intent2) {
        if (intent != null && intent.hasExtra("extra_open_record_challenge")) {
            intent2.putExtra("extra_open_record_challenge", intent.getSerializableExtra("extra_open_record_challenge"));
        }
    }
}
