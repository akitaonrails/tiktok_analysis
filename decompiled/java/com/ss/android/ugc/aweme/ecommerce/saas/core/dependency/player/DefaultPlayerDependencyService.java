package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player;

import X.InterfaceC1479620obg;
import X.InterfaceC1508380pM4;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;

/* JADX INFO: loaded from: classes29.dex */
public final class DefaultPlayerDependencyService implements IPlayerDependencyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService
    public long getHitCacheSize(VideoUrlModel videoUrlModel) {
        return 0L;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService
    public int getNonNullQualityType(VideoUrlModel videoUrlModel) {
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService
    public InterfaceC1508380pM4 getPlayerManager(boolean z) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService
    public InterfaceC1508380pM4 getSharedPlayerManager() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService
    public long getVideoSize(VideoUrlModel videoUrlModel) {
        return 0L;
    }

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService
    public boolean isVideoPlaying() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService
    public boolean otherSceneFeedUseMediaBoxExp() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService
    public boolean otherSceneFeedUseMediaBoxExp2() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService
    public void playingVideoMute() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService
    public void playingVideoPause() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService
    public void playingVideoResume() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService
    public void playingVideoUnMute() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService
    public void preloadDescVideo(Aweme aweme) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService
    public InterfaceC1479620obg toIPlayRequest(Aweme aweme) {
        return null;
    }
}
