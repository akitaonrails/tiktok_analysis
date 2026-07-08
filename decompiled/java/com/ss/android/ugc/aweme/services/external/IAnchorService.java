package com.ss.android.ugc.aweme.services.external;

/* JADX INFO: loaded from: classes17.dex */
public interface IAnchorService {
    boolean enableCameraLayoutAnchor();

    boolean enableGreenScreenAnchor();

    boolean enableLyricEffectAnchor();

    String getRealTitleString(String str);

    boolean isCaptionAnchorLandingPageShown();

    boolean isEditorProCaptionNewFuncEnabled();

    boolean isEditorProEffectEnabled();

    boolean isEditorProEnabled();

    boolean isFunctionEnabled(Integer num);

    boolean isMagicAsyncInEditorProEnabled();

    boolean needShowAnchorInFYP(boolean z);
}
