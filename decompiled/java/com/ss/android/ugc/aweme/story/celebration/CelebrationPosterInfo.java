package com.ss.android.ugc.aweme.story.celebration;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class CelebrationPosterInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("caption1")
    public final String caption1;

    @C09CT("caption2")
    public final String caption2;

    @C09CT("min_materials_to_show_poster")
    public final int maxMaterialsToShowPoster;

    @C09CT("poster_background_effect_id")
    public final String posterBackgroundEffectId;

    public CelebrationPosterInfo() {
        this(0, "", "", "");
    }

    public CelebrationPosterInfo(int i, String str, String str2, String str3) {
        this.maxMaterialsToShowPoster = i;
        this.posterBackgroundEffectId = str;
        this.caption1 = str2;
        this.caption2 = str3;
    }
}
