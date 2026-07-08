package com.ss.android.ugc.aweme.feed.model.banner;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class StandardElementUi implements Serializable {

    @C09CT("customized_ui_content")
    public String customizedUiContent;
    public StandardTagUi standardUi;

    @C09CT("template")
    public FcpUiTemplate template;

    @C09CT("ui_type")
    public int uiType;

    public StandardElementUi() {
        this(StandardUiTypeEnum.CUSTOMIZED.getType(), null, null, null);
    }

    public StandardElementUi(int i, String str, StandardTagUi standardTagUi, FcpUiTemplate fcpUiTemplate) {
        this.uiType = i;
        this.customizedUiContent = str;
        this.standardUi = standardTagUi;
        this.template = fcpUiTemplate;
    }
}
