package com.ss.android.ugc.aweme.translation.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class TranslationFeedbackExtraInfo implements Serializable {

    @C09CT("description_model")
    public final String descriptionModel;

    @C09CT("description_use_new_protocol")
    public final boolean descriptionUseNewProtocol;

    @C09CT("original_caption_model")
    public final String originalCaptionModel;

    @C09CT("translated_caption_model")
    public final String translatedCaptionModel;

    public TranslationFeedbackExtraInfo(boolean z, String str, String str2, String str3) {
        this.descriptionUseNewProtocol = z;
        this.originalCaptionModel = str;
        this.translatedCaptionModel = str2;
        this.descriptionModel = str3;
    }
}
