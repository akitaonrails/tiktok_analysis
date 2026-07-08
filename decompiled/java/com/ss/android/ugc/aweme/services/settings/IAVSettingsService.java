package com.ss.android.ugc.aweme.services.settings;

import com.google.gson.n;

/* JADX INFO: loaded from: classes22.dex */
public interface IAVSettingsService {
    boolean downloadEffectOrMusicAfterEnterCamera();

    boolean enableLightningPrivacySetting();

    boolean enableModelFileOnlyEnv();

    boolean enableReeditPostedDraftAfterDelete();

    boolean enableReleaseVideoPlayerOpt();

    boolean enableSaveDraftAfterPosting();

    boolean enableSaveOwnVideoWithoutWatermask();

    boolean enableSaveUploadVideo();

    boolean enableSharePanelTuxDialogRefactor();

    boolean enableShowCutsameAnchor();

    boolean enableShowMvAnchor();

    boolean enableTaskDegradationOpti();

    String getEffectVersion();

    boolean getMvThemeRecordMode();

    String getStickerArtistIconUrl();

    String getVESDKVersion();

    boolean isDebugConfigOpen();

    boolean isDuetAutoApplyEffectEnabled();

    boolean isLongVideoPermitted();

    long longVideoThresholdWithTolerance();

    boolean needLoginBeforeRecord();

    boolean optPermission();

    long progressBarThreshold();

    boolean shareVideo2GifEditable();

    boolean showDuetWithReact();

    boolean showMvThemeRecordMode();

    void updateABTestModel(n nVar);
}
