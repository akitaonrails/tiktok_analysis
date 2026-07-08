package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.tabconfig;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchTabPlayConfig implements Serializable {
    public static final int $stable = 0;

    @C09CT("has_music_play")
    public final boolean hasMusicPlay;

    @C09CT("has_video_play")
    public final boolean hasVideoPlay;

    @C09CT("is_live_source")
    public final boolean isLiveSource;

    @C09CT("need_auto_play")
    public final boolean needAutoPlay;

    public SearchTabPlayConfig() {
        this(false, false, false, false);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchTabPlayConfig(hasMusicPlay=");
        sbLIZ.append(this.hasMusicPlay);
        sbLIZ.append(", hasVideoPlay=");
        sbLIZ.append(this.hasVideoPlay);
        sbLIZ.append(", needAutoPlay=");
        sbLIZ.append(this.needAutoPlay);
        sbLIZ.append(", isLiveSource=");
        sbLIZ.append(this.isLiveSource);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isLiveSource() {
        return this.isLiveSource;
    }

    public SearchTabPlayConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        this.hasMusicPlay = z;
        this.hasVideoPlay = z2;
        this.needAutoPlay = z3;
        this.isLiveSource = z4;
    }
}
