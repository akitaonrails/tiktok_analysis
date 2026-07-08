package com.ss.android.ugc.aweme.music;

import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.services.IAppDiffMusicService;

/* JADX INFO: loaded from: classes10.dex */
public final class AppDiffMusicServiceImpl implements IAppDiffMusicService {
    @Override // com.ss.android.ugc.aweme.services.IAppDiffMusicService
    public final boolean enableDetailShoot() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.IAppDiffMusicService
    public final boolean enableInitMusicCreateSongAssem() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.IAppDiffMusicService
    public final boolean enableMusicDetailNavBarAssem() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.IAppDiffMusicService
    public final boolean enableMusicShareToEditAssem() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.IAppDiffMusicService
    public final boolean enableShare() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.IAppDiffMusicService
    public final boolean initMusicListViewTitleBar(TuxNavBar tuxNavBar, Object obj) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.IAppDiffMusicService
    public final boolean enableToMusicShoot() {
        return IAppDiffMusicService.DefaultImpls.enableToMusicShoot(this);
    }

    @Override // com.ss.android.ugc.aweme.services.IAppDiffMusicService
    public final boolean enableToShowSearchEntrance() {
        return IAppDiffMusicService.DefaultImpls.enableToShowSearchEntrance(this);
    }
}
