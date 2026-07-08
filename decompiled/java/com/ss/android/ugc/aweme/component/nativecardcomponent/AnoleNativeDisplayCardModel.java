package com.ss.android.ugc.aweme.component.nativecardcomponent;

import X.C09CT;
import com.ss.android.ugc.aweme.commercialize.model.AnoleLogInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleNativeDisplayCardModel implements Serializable {
    public static final int $stable = 8;

    @C09CT("log_info")
    public final AnoleLogInfo anoleLogInfo;

    @C09CT("image_url")
    public final String cardImageUrl;

    public final AnoleLogInfo getAnoleLogInfo() {
        return this.anoleLogInfo;
    }

    public final String getCardImageUrl() {
        return this.cardImageUrl;
    }

    public AnoleNativeDisplayCardModel(AnoleLogInfo anoleLogInfo, String str) {
        this.anoleLogInfo = anoleLogInfo;
        this.cardImageUrl = str;
    }
}
