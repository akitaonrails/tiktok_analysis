package com.bytedance.ies.ugc.aweme.commwecialize.ba.settings;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class BACouponEntranceSettingModel implements Serializable {

    @C09CT("enable")
    public Boolean enable;

    @C09CT("schema")
    public String schema;

    public BACouponEntranceSettingModel() {
        this(Boolean.FALSE, "");
    }

    public final Boolean getEnable() {
        return this.enable;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final void setEnable(Boolean bool) {
        this.enable = bool;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public BACouponEntranceSettingModel(Boolean bool, String str) {
        this.enable = bool;
        this.schema = str;
    }
}
