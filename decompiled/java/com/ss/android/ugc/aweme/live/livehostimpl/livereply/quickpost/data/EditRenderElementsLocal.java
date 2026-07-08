package com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data;

import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public final class EditRenderElementsLocal implements Serializable {
    public static final int $stable = 8;
    public CaptionPositionLocal captionPositionLocal;
    public MusicLocal music;
    public float originVideoVolume;
    public TextStickerConfigLocal subTitleLocal;

    public EditRenderElementsLocal() {
        this(null, 0.0f, null, null);
    }

    public final void setCaptionPositionLocal(CaptionPositionLocal captionPositionLocal) {
        this.captionPositionLocal = captionPositionLocal;
    }

    public final void setMusic(MusicLocal musicLocal) {
        this.music = musicLocal;
    }

    public final void setOriginVideoVolume(float f) {
        this.originVideoVolume = f;
    }

    public final void setSubTitleLocal(TextStickerConfigLocal textStickerConfigLocal) {
        this.subTitleLocal = textStickerConfigLocal;
    }

    public EditRenderElementsLocal(MusicLocal musicLocal, float f, TextStickerConfigLocal textStickerConfigLocal, CaptionPositionLocal captionPositionLocal) {
        this.music = musicLocal;
        this.originVideoVolume = f;
        this.subTitleLocal = textStickerConfigLocal;
        this.captionPositionLocal = captionPositionLocal;
    }
}
