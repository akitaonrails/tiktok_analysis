package com.ss.android.ugc.aweme.story.celebration;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class CelebrationTemplateConfig implements Serializable {
    public static final int $stable = 8;

    @C09CT("max_materials_to_create_video")
    public final int maxMaterialsToCreate;

    @C09CT("poster")
    public final CelebrationPosterInfo poster;

    @C09CT("recap_lottie")
    public final RecapLottie recapLottie;

    @C09CT("sticker")
    public final CelebrationStickerInfo sticker;

    @C09CT("template_prefix")
    public final String templatePrefix;

    public CelebrationTemplateConfig() {
        this("", null, null, 0, null);
    }

    public CelebrationTemplateConfig(String str, CelebrationStickerInfo celebrationStickerInfo, CelebrationPosterInfo celebrationPosterInfo, int i, RecapLottie recapLottie) {
        this.templatePrefix = str;
        this.sticker = celebrationStickerInfo;
        this.poster = celebrationPosterInfo;
        this.maxMaterialsToCreate = i;
        this.recapLottie = recapLottie;
    }
}
