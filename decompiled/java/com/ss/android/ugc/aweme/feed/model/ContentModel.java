package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ContentModel implements Serializable {

    @C09CT("custom_biz")
    public CustomBizInfo customBizInfo;

    @C09CT("standard_biz")
    public StandardBusinessModel standardBusinessModel;

    public ContentModel() {
        this(null, null);
    }

    public final void setCustomBizInfo(CustomBizInfo customBizInfo) {
        this.customBizInfo = customBizInfo;
    }

    public final void setStandardBusinessModel(StandardBusinessModel standardBusinessModel) {
        this.standardBusinessModel = standardBusinessModel;
    }

    public ContentModel(CustomBizInfo customBizInfo, StandardBusinessModel standardBusinessModel) {
        this.customBizInfo = customBizInfo;
        this.standardBusinessModel = standardBusinessModel;
    }
}
