package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player;

import X.InterfaceC1479620obg;
import X.InterfaceC1508380pM4;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;

/* JADX INFO: loaded from: classes24.dex */
public interface IPlayerDependencyService extends IECommerceHostService {
    long getHitCacheSize(VideoUrlModel videoUrlModel);

    int getNonNullQualityType(VideoUrlModel videoUrlModel);

    InterfaceC1508380pM4 getPlayerManager(boolean z);

    InterfaceC1508380pM4 getSharedPlayerManager();

    long getVideoSize(VideoUrlModel videoUrlModel);

    boolean isVideoPlaying();

    boolean otherSceneFeedUseMediaBoxExp();

    boolean otherSceneFeedUseMediaBoxExp2();

    void playingVideoMute();

    void playingVideoPause();

    void playingVideoResume();

    void playingVideoUnMute();

    void preloadDescVideo(Aweme aweme);

    InterfaceC1479620obg toIPlayRequest(Aweme aweme);
}
