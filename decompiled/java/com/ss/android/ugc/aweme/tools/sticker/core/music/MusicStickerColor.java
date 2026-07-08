package com.ss.android.ugc.aweme.tools.sticker.core.music;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class MusicStickerColor implements Serializable {
    public static final int $stable = 0;

    @C09CT("card_bg_color")
    public final Integer cardBgColor;

    @C09CT("volume_color")
    public final Integer waveColor;

    public MusicStickerColor() {
        this(null, null);
    }

    public MusicStickerColor(Integer num, Integer num2) {
        this.cardBgColor = num;
        this.waveColor = num2;
    }
}
