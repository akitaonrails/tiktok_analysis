package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class AnchorPanelAction implements Serializable {

    @C09CT("action_type")
    public int actionType;

    @C09CT("icon")
    public UrlModel icon;

    @C09CT("schema")
    public String schema = "";

    public final int getActionType() {
        return this.actionType;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final String getSchema() {
        return this.schema;
    }
}
