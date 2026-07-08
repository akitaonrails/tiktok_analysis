package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.tabconfig;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchTabAndroidConfig implements Serializable {
    public static final int $stable = 8;

    @C09CT("has_music_play")
    public final boolean hasMusicPlay;

    @C09CT("has_video_play")
    public final boolean hasVideoPlay;

    @C09CT("is_live_source")
    public final boolean isLiveSource;

    @C09CT("lynx_event_config")
    public final List<SearchTabLynxEventConfig> lynxEventConfig;

    @C09CT("need_location_params")
    public final Boolean needLocationParams;

    @C09CT("should_show_center_loading_view")
    public final Boolean shouldShowCenterLoadingView;

    @C09CT("tab_type")
    public final int tabType;

    public SearchTabAndroidConfig() {
        this(Boolean.TRUE, Boolean.TRUE, -1, false, false, false, null);
    }

    public final boolean isLiveSource() {
        return this.isLiveSource;
    }

    public SearchTabAndroidConfig(Boolean bool, Boolean bool2, int i, boolean z, boolean z2, boolean z3, List<SearchTabLynxEventConfig> list) {
        this.shouldShowCenterLoadingView = bool;
        this.needLocationParams = bool2;
        this.tabType = i;
        this.hasMusicPlay = z;
        this.hasVideoPlay = z2;
        this.isLiveSource = z3;
        this.lynxEventConfig = list;
    }
}
