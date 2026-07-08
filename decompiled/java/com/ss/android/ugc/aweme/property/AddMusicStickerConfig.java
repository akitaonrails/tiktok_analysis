package com.ss.android.ugc.aweme.property;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class AddMusicStickerConfig {

    @C09CT("consumption_music_sticker_enabled")
    public final boolean consumptionMusicStickerEnabled;

    @C09CT("creation_music_sticker_enabled")
    public final boolean creationMusicStickerEnabled;

    public AddMusicStickerConfig() {
        this(false, false);
    }

    public AddMusicStickerConfig(boolean z, boolean z2) {
        this.creationMusicStickerEnabled = z;
        this.consumptionMusicStickerEnabled = z2;
    }
}
