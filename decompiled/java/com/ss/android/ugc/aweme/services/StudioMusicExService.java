package com.ss.android.ugc.aweme.services;

import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: loaded from: classes10.dex */
public final class StudioMusicExService implements IAppDiffMusicService {
    public static final StudioMusicExService INSTANCE = new StudioMusicExService();
    public final /* synthetic */ IAppDiffMusicService $$delegate_0;

    @Override // com.ss.android.ugc.aweme.services.IAppDiffMusicService
    public boolean enableDetailShoot() {
        return this.$$delegate_0.enableDetailShoot();
    }

    @Override // com.ss.android.ugc.aweme.services.IAppDiffMusicService
    public boolean enableInitMusicCreateSongAssem() {
        return this.$$delegate_0.enableInitMusicCreateSongAssem();
    }

    @Override // com.ss.android.ugc.aweme.services.IAppDiffMusicService
    public boolean enableMusicDetailNavBarAssem() {
        return this.$$delegate_0.enableMusicDetailNavBarAssem();
    }

    @Override // com.ss.android.ugc.aweme.services.IAppDiffMusicService
    public boolean enableMusicShareToEditAssem() {
        return this.$$delegate_0.enableMusicShareToEditAssem();
    }

    @Override // com.ss.android.ugc.aweme.services.IAppDiffMusicService
    public boolean enableShare() {
        return this.$$delegate_0.enableShare();
    }

    @Override // com.ss.android.ugc.aweme.services.IAppDiffMusicService
    public boolean enableToMusicShoot() {
        return this.$$delegate_0.enableToMusicShoot();
    }

    @Override // com.ss.android.ugc.aweme.services.IAppDiffMusicService
    public boolean enableToShowSearchEntrance() {
        return this.$$delegate_0.enableToShowSearchEntrance();
    }

    @Override // com.ss.android.ugc.aweme.services.IAppDiffMusicService
    public boolean initMusicListViewTitleBar(TuxNavBar tuxNavBar, Object obj) {
        return this.$$delegate_0.initMusicListViewTitleBar(tuxNavBar, obj);
    }

    public StudioMusicExService() {
        IAppDiffMusicService iAppDiffMusicService = (IAppDiffMusicService) PluggableExtentionKt.pluggableSpi$default(IAppDiffMusicService.class, false, false, false, 14, null);
        if (iAppDiffMusicService != null) {
            this.$$delegate_0 = iAppDiffMusicService;
        } else {
            "no impl for IMusicExService".toString();
            throw new IllegalStateException("no impl for IMusicExService");
        }
    }
}
