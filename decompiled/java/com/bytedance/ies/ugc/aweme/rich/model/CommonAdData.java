package com.bytedance.ies.ugc.aweme.rich.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public class CommonAdData implements Serializable {

    @C09CT("charge_type")
    public int chargeType;

    @C09CT("creative_id")
    public Long creativeId;

    @C09CT("group_id")
    public Long groupId;

    @C09CT("log_extra")
    public String logExtra;

    @C09CT("system_origin")
    public int systemOrigin = -1;

    public String getCreativeIdStr() {
        Long l = this.creativeId;
        if (l == null) {
            return null;
        }
        return l.toString();
    }

    public int getChargeType() {
        return this.chargeType;
    }

    public Long getCreativeId() {
        return this.creativeId;
    }

    public Long getGroupId() {
        return this.groupId;
    }

    public String getLogExtra() {
        return this.logExtra;
    }

    public int getSystemOrigin() {
        return this.systemOrigin;
    }

    public void setCreativeId(Long l) {
        this.creativeId = l;
    }

    public void setGroupId(Long l) {
        this.groupId = l;
    }

    public void setLogExtra(String str) {
        this.logExtra = str;
    }

    public void setSystemOrigin(int i) {
        this.systemOrigin = i;
    }
}
