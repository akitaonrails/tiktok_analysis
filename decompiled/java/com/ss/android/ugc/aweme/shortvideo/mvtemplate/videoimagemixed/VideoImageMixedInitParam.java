package com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed;

import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.builtin.AlbumDefaultBottomActionBarConfig;

/* JADX INFO: loaded from: classes9.dex */
public final class VideoImageMixedInitParam {
    public static final int $stable = 8;
    public final String aiImaginePrompt;
    public final String aiLivePhotoPrompt;
    public final String aigcSureButtonText;
    public final int chooseScene;
    public final Drawable clickableDrawable;
    public final boolean forceHideEP;
    public final boolean forceMultiSelectHintStyle;
    public final boolean fromLightRecordTab;
    public final boolean hideDock;
    public final boolean hideSelectedMediaBar;
    public final boolean isAIGCPath;
    public final boolean isEditorProPip;
    public final boolean isReuseImageEffectTemplateAddPhoto;
    public final boolean isSoundSync;
    public final boolean isUgcTemplate;
    public final Integer maxSelectCount;
    public final AlbumDefaultBottomActionBarConfig openApiConfig;
    public final boolean showAutoCut;
    public final boolean showAutoPick;
    public final boolean showConfirm;
    public final boolean showEditorPro;
    public final boolean showNextOnly;
    public final Drawable unClickableDrawable;

    public final boolean isAIGCPath() {
        return this.isAIGCPath;
    }

    public final boolean isEditorProPip() {
        return this.isEditorProPip;
    }

    public final boolean isReuseImageEffectTemplateAddPhoto() {
        return this.isReuseImageEffectTemplateAddPhoto;
    }

    public final boolean isSoundSync() {
        return this.isSoundSync;
    }

    public final boolean isUgcTemplate() {
        return this.isUgcTemplate;
    }

    public VideoImageMixedInitParam(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str, Drawable drawable, Drawable drawable2, boolean z9, int i, boolean z10, boolean z11, String str2, String str3, Integer num, boolean z12, AlbumDefaultBottomActionBarConfig albumDefaultBottomActionBarConfig, boolean z13, boolean z14, boolean z15) {
        this.showAutoCut = z;
        this.showEditorPro = z2;
        this.isSoundSync = z3;
        this.isUgcTemplate = z4;
        this.isEditorProPip = z5;
        this.isAIGCPath = z6;
        this.hideDock = z7;
        this.isReuseImageEffectTemplateAddPhoto = z8;
        this.aigcSureButtonText = str;
        this.clickableDrawable = drawable;
        this.unClickableDrawable = drawable2;
        this.showConfirm = z9;
        this.chooseScene = i;
        this.showNextOnly = z10;
        this.forceHideEP = z11;
        this.aiLivePhotoPrompt = str2;
        this.aiImaginePrompt = str3;
        this.maxSelectCount = num;
        this.hideSelectedMediaBar = z12;
        this.openApiConfig = albumDefaultBottomActionBarConfig;
        this.showAutoPick = z13;
        this.fromLightRecordTab = z14;
        this.forceMultiSelectHintStyle = z15;
    }
}
