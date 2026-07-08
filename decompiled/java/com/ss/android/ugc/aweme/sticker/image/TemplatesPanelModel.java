package com.ss.android.ugc.aweme.sticker.image;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class TemplatesPanelModel implements Serializable {
    public static final int $stable = 8;

    @C09CT("default_data")
    public DefaultTemplates defaultTemplates;

    public TemplatesPanelModel() {
        this(null);
    }

    public TemplatesPanelModel(DefaultTemplates defaultTemplates) {
        this.defaultTemplates = defaultTemplates;
    }

    public final void setDefaultTemplates(DefaultTemplates defaultTemplates) {
        this.defaultTemplates = defaultTemplates;
    }
}
