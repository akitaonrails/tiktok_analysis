package com.ss.android.ugc.aweme.component.slideupcompoent.model;

import X.C09CT;
import com.ss.android.ugc.aweme.commercialize.model.AnoleLogInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleUpSlideComponetDataModel implements Serializable {
    public static final int $stable = 8;

    @C09CT("log_info")
    public final AnoleLogInfo logInfo;

    @C09CT("text")
    public final String upSlideText;

    public AnoleUpSlideComponetDataModel() {
        this(null, null);
    }

    public final AnoleLogInfo getLogInfo() {
        return this.logInfo;
    }

    public final String getUpSlideText() {
        return this.upSlideText;
    }

    public AnoleUpSlideComponetDataModel(AnoleLogInfo anoleLogInfo, String str) {
        this.logInfo = anoleLogInfo;
        this.upSlideText = str;
    }
}
