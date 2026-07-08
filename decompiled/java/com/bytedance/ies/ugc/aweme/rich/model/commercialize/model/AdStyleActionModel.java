package com.bytedance.ies.ugc.aweme.rich.model.commercialize.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AdStyleActionModel implements Serializable {

    @C09CT("corner_radius")
    public final CornerRadiusActionModel cornerRadius;

    @C09CT("open_landing_page_config")
    public final OpenLandingPageConfigModel openLandingPageConfig;

    public AdStyleActionModel() {
        this(null, null);
    }

    public AdStyleActionModel(OpenLandingPageConfigModel openLandingPageConfigModel, CornerRadiusActionModel cornerRadiusActionModel) {
        this.openLandingPageConfig = openLandingPageConfigModel;
        this.cornerRadius = cornerRadiusActionModel;
    }
}
