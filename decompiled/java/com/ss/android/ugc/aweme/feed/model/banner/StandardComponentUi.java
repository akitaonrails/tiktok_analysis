package com.ss.android.ugc.aweme.feed.model.banner;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class StandardComponentUi implements Serializable {

    @C09CT("template")
    public FcpUiTemplate template;

    @C09CT("ui_type")
    public int uiType;

    public StandardComponentUi() {
        this(StandardUiTypeEnum.CUSTOMIZED.getType(), null);
    }

    public StandardComponentUi(int i, FcpUiTemplate fcpUiTemplate) {
        this.uiType = i;
        this.template = fcpUiTemplate;
    }
}
