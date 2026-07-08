package com.ss.android.ugc.aweme.texttoimage.setting;

import X.C09CT;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class CreationTextimageAiVersionConfigModel {

    @C09CT("ai_version_guide_title_disclaimer")
    public final String disclaimerText;

    /* JADX WARN: Multi-variable type inference failed */
    public CreationTextimageAiVersionConfigModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public CreationTextimageAiVersionConfigModel(String str) {
        this.disclaimerText = str;
    }

    public /* synthetic */ CreationTextimageAiVersionConfigModel(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
