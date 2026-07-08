package com.ss.android.ugc.gamora.editor.audioservice.service.texttospeach;

import X.C09CT;

/* JADX INFO: loaded from: classes26.dex */
public final class ReuseTtsAudioInMusicShootConfig {

    @C09CT("enable_text_sticker_editing_page")
    public final boolean enableEditingPageTextSticker;

    @C09CT("enable_reuse_tts_audio")
    public final boolean enableReuse;

    @C09CT("enable_text_sticker_shooting_page")
    public final boolean enableShootingPgaeTextSticker;

    public ReuseTtsAudioInMusicShootConfig() {
        this(false, false, false);
    }

    public ReuseTtsAudioInMusicShootConfig(boolean z, boolean z2, boolean z3) {
        this.enableReuse = z;
        this.enableEditingPageTextSticker = z2;
        this.enableShootingPgaeTextSticker = z3;
    }
}
