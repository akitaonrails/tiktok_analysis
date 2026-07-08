package com.ss.android.ugc.aweme.challenge.service;

import X.C0OFL;
import X.C116P;
import X.C116Q;
import X.C116S;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.music.model.Music;

/* JADX INFO: loaded from: classes30.dex */
public class ChallengeServiceImpl implements IChallengeService {
    public final C116P LIZ = C116Q.LIZ;

    @Override // com.ss.android.ugc.aweme.challenge.service.IChallengeService
    public final Class<? extends Activity> LIZLLL() {
        this.LIZ.getClass();
        return ChallengeDetailActivity.class;
    }

    @Override // com.ss.android.ugc.aweme.challenge.service.IChallengeService
    public final C0OFL LIZ(Context context, Boolean bool) {
        return this.LIZ.LIZ(context, bool);
    }

    @Override // com.ss.android.ugc.aweme.challenge.service.IChallengeService
    public final Challenge LIZJ(int i, String str, boolean z) {
        return this.LIZ.LIZJ(i, str, z);
    }

    @Override // com.ss.android.ugc.aweme.challenge.service.IChallengeService
    public final void LIZIZ(String str, String str2, String str3, Music music, C116S c116s) {
        this.LIZ.LIZIZ(str, str2, str3, music, c116s);
    }
}
