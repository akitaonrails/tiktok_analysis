package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class PhotoModeConfig {

    @C09CT("edit_screen_multi_image_style")
    public final PhotoUiType editScreenUiStyle;

    @C09CT("feed_multi_image_present_style")
    public final PhotoUiType feedUiStyle;

    @C09CT("image_format_consumption_enabled")
    public final boolean isConsumptionEnabled;

    @C09CT("upload_image_format_enabled")
    public final boolean isUploadEnabled;

    @C09CT("should_keep_auto_playing_after_user_swipes")
    public final boolean shouldKeepAutoPlayingAfterUserSwipes;

    public PhotoModeConfig() {
        this(false, PhotoUiType.NO_SWIPE_OR_PINCH, false, PhotoUiType.NO_SWIPE_OR_PINCH, false);
    }

    public final boolean isConsumptionEnabled() {
        return this.isConsumptionEnabled;
    }

    public final boolean isUploadEnabled() {
        return this.isUploadEnabled;
    }

    public PhotoModeConfig(boolean z, PhotoUiType photoUiType, boolean z2, PhotoUiType photoUiType2, boolean z3) {
        this.isUploadEnabled = z;
        this.editScreenUiStyle = photoUiType;
        this.isConsumptionEnabled = z2;
        this.feedUiStyle = photoUiType2;
        this.shouldKeepAutoPlayingAfterUserSwipes = z3;
    }
}
