package com.ss.android.ugc.aweme.commercialize.router.api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class CRouterJSBJumpDataModel implements Serializable {

    @C09CT("quick_action_model")
    public final CRouterQuickActionModel quickActionModel;

    public CRouterJSBJumpDataModel() {
        this(null);
    }

    public final CRouterQuickActionModel getQuickActionModel() {
        return this.quickActionModel;
    }

    public CRouterJSBJumpDataModel(CRouterQuickActionModel cRouterQuickActionModel) {
        this.quickActionModel = cRouterQuickActionModel;
    }
}
