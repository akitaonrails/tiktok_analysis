package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoMixKeyFramePic {
    public transient Aweme LIZ;

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("base_info")
    public final BaseImage image;

    @C09CT("keyframe")
    public final Keyframe keyframe;

    public TakoMixKeyFramePic() {
        this(null, null, null, null);
    }

    public TakoMixKeyFramePic(BaseImage baseImage, String str, Keyframe keyframe, Aweme aweme) {
        this.image = baseImage;
        this.awemeId = str;
        this.keyframe = keyframe;
        this.LIZ = aweme;
    }
}
