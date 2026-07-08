package com.ss.android.ugc.aweme.emojisticker.socialavatar.service;

import X.C0IDZ;
import X.C1408880mla;
import X.C1891750zKP;
import X.C1895007bY;
import X.C19EG;
import com.ss.android.ugc.aweme.emojisticker.api.ISocialAvatarReactionAbilityProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes29.dex */
public final class SocialAvatarReactionAbilityProviderImpl implements ISocialAvatarReactionAbilityProvider {
    @Override // com.ss.android.ugc.aweme.emojisticker.api.ISocialAvatarReactionAbilityProvider
    public final C1408880mla LIZ() {
        return new C1408880mla();
    }

    @Override // com.ss.android.ugc.aweme.emojisticker.api.ISocialAvatarReactionAbilityProvider
    public final C1891750zKP LIZIZ(C19EG c19eg, Aweme aweme, C1895007bY c1895007bY, C0IDZ c0idz) {
        if (aweme.getAid() == null) {
            return null;
        }
        C1891750zKP c1891750zKP = new C1891750zKP(c19eg, c1895007bY, c0idz, 5);
        c1891750zKP.LJLJJI(aweme);
        return c1891750zKP;
    }
}
