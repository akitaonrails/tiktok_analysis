package com.ss.android.ugc.aweme.feed.model.banner;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class StandardTagUiWrapper implements Serializable {

    @C09CT("actions")
    public List<FcpTemplateActionGroup> actions;

    @C09CT("standard_ui")
    public StandardTagUi standardUi;

    @C09CT("template")
    public FcpUiTemplate template;

    @C09CT("ui_type")
    public int uiType;

    public StandardTagUiWrapper() {
        this(StandardUiTypeEnum.STANDARD.getType(), null, null, null);
    }

    public StandardTagUiWrapper(int i, StandardTagUi standardTagUi, FcpUiTemplate fcpUiTemplate, List<FcpTemplateActionGroup> list) {
        this.uiType = i;
        this.standardUi = standardTagUi;
        this.template = fcpUiTemplate;
        this.actions = list;
    }
}
