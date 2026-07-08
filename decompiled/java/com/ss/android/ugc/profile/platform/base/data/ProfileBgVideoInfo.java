package com.ss.android.ugc.profile.platform.base.data;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileBgVideoInfo implements Serializable {

    @C09CT("aweme_info")
    public Aweme awemeInfo;

    @C09CT("offset_y_ratio")
    public float offsetYRatio = 0.5f;

    @C09CT("auto_play")
    public boolean autoPlay = true;

    public final boolean getAutoPlay() {
        return this.autoPlay;
    }

    public final Aweme getAwemeInfo() {
        return this.awemeInfo;
    }

    public final float getOffsetYRatio() {
        return this.offsetYRatio;
    }

    public final void setAutoPlay(boolean z) {
        this.autoPlay = z;
    }

    public final void setAwemeInfo(Aweme aweme) {
        this.awemeInfo = aweme;
    }

    public final void setOffsetYRatio(float f) {
        this.offsetYRatio = f;
    }
}
