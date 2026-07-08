package com.ss.android.ugc.aweme.commercialize.promote.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class OptimizationData implements Serializable {

    @C09CT("item_id")
    public String itemId;

    @C09CT("pre_create")
    public Boolean preCreate;

    @C09CT("preload")
    public Boolean preload;

    public OptimizationData() {
        this(null, null, null);
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final Boolean getPreCreate() {
        return this.preCreate;
    }

    public final Boolean getPreload() {
        return this.preload;
    }

    public final void setItemId(String str) {
        this.itemId = str;
    }

    public final void setPreCreate(Boolean bool) {
        this.preCreate = bool;
    }

    public final void setPreload(Boolean bool) {
        this.preload = bool;
    }

    public OptimizationData(String str, Boolean bool, Boolean bool2) {
        this.itemId = str;
        this.preload = bool;
        this.preCreate = bool2;
    }
}
