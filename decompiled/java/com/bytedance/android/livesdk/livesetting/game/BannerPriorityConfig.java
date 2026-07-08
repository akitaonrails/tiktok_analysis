package com.bytedance.android.livesdk.livesetting.game;

import X.C09CT;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes13.dex */
public final class BannerPriorityConfig {

    @C09CT("game_banner_count")
    public final int gameBannerCount;

    @C09CT("game_banner_list")
    public final LinkedList<BannerInfo> gameBannerInfoList;

    @C09CT("live_studio_banner_count")
    public final int liveStudioBannerCount;

    @C09CT("live_studio_banner_list")
    public final LinkedList<BannerInfo> liveStudioBannerInfoList;

    @C09CT("obs_banner_count")
    public final int obsBannerCount;

    @C09CT("obs_banner_list")
    public final LinkedList<BannerInfo> obsBannerInfoList;

    public BannerPriorityConfig(LinkedList<BannerInfo> linkedList, LinkedList<BannerInfo> linkedList2, int i, int i2, LinkedList<BannerInfo> linkedList3, int i3) {
        this.gameBannerInfoList = linkedList;
        this.obsBannerInfoList = linkedList2;
        this.gameBannerCount = i;
        this.obsBannerCount = i2;
        this.liveStudioBannerInfoList = linkedList3;
        this.liveStudioBannerCount = i3;
    }
}
