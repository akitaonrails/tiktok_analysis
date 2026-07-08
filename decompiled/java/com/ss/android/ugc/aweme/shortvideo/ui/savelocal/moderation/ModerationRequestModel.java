package com.ss.android.ugc.aweme.shortvideo.ui.savelocal.moderation;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class ModerationRequestModel {
    public static final int $stable = 0;

    @C09CT("type")
    public final int type;

    @C09CT("watermark_moderation")
    public final WaterMarkModerationModel waterMarkModerationModel;

    public ModerationRequestModel(int i, WaterMarkModerationModel waterMarkModerationModel) {
        this.type = i;
        this.waterMarkModerationModel = waterMarkModerationModel;
    }
}
