package com.ss.android.ugc.profile.business.music;

import X.C1889790zHF;
import X.C633020OsG;

/* JADX INFO: loaded from: classes20.dex */
public final class AdvancedMusicProtocol extends SemiMyMusicProtocol {
    @Override // com.ss.android.ugc.profile.business.music.SemiMyMusicProtocol, com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "advanced_feature_my_music";
    }

    @Override // com.ss.android.ugc.profile.business.music.SemiMyMusicProtocol, com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJJZ() {
        return C633020OsG.LIZIZ.LJJLIIIJ() && C1889790zHF.LIZ.LIZ().hasMusicDsp();
    }
}
