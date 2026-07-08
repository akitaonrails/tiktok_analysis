package com.ss.android.ugc.aweme.setting.serverpush.model;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class ClaCombineSettings {

    @C09CT("enable_auto_dubbing")
    public final Integer enableAutoDubbing;

    @C09CT("show_auto_dubbing")
    public final Integer enableAutoDubbingConsumption;

    @C09CT("enable_comment_auto_translation")
    public final Integer enableCommentAutoTranslation;

    @C09CT("enable_foreign_caption")
    public final Integer enableForeignCaption;

    @C09CT("enable_master_translation")
    public final Integer enableMasterTranslation;

    @C09CT("enable_native_caption")
    public final Integer enableNativeCaption;

    @C09CT("enable_sticker_translation")
    public final Integer enableStickerTranslation;

    public ClaCombineSettings() {
        this(null, null, null, null, null, null, null);
    }

    public ClaCombineSettings(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
        this.enableMasterTranslation = num;
        this.enableStickerTranslation = num2;
        this.enableForeignCaption = num3;
        this.enableNativeCaption = num4;
        this.enableAutoDubbing = num5;
        this.enableAutoDubbingConsumption = num6;
        this.enableCommentAutoTranslation = num7;
    }
}
