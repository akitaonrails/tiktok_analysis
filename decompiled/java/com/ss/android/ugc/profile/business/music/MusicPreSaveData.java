package com.ss.android.ugc.profile.business.music;

import X.C09CT;
import com.ss.android.ugc.aweme.profile.model.MusicPreSaveInfo;
import com.ss.android.ugc.profile.platform.business.header.advanced.AdvancedFeatureBaseData;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicPreSaveData extends AdvancedFeatureBaseData {
    public static final int $stable = 8;

    @C09CT("music_pre_save_info")
    public MusicPreSaveInfo musicPreSaveInfo;

    public final MusicPreSaveInfo getMusicPreSaveInfo() {
        return this.musicPreSaveInfo;
    }

    public final void setMusicPreSaveInfo(MusicPreSaveInfo musicPreSaveInfo) {
        this.musicPreSaveInfo = musicPreSaveInfo;
    }
}
