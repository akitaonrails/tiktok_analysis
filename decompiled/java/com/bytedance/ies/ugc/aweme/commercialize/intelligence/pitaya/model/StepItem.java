package com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes35.dex */
public final class StepItem implements Serializable {

    @C09CT("aweme_id")
    public final String aweme_id;

    @C09CT("debug_info")
    public final String debug_info;

    @C09CT("is_ads")
    public final boolean is_ads;

    @C09CT("new_pos")
    public final Integer new_pos;

    @C09CT("old_pos")
    public final Integer old_pos;

    @C09CT("step")
    public final Integer step;

    @C09CT("type")
    public final int type;

    public StepItem() {
        this("", false, -1, null, null, null, null);
    }

    public final String getAweme_id() {
        return this.aweme_id;
    }

    public final String getDebug_info() {
        return this.debug_info;
    }

    public final Integer getNew_pos() {
        return this.new_pos;
    }

    public final Integer getOld_pos() {
        return this.old_pos;
    }

    public final Integer getStep() {
        return this.step;
    }

    public final int getType() {
        return this.type;
    }

    public final boolean is_ads() {
        return this.is_ads;
    }

    public StepItem(String str, boolean z, int i, Integer num, Integer num2, String str2, Integer num3) {
        this.aweme_id = str;
        this.is_ads = z;
        this.type = i;
        this.old_pos = num;
        this.new_pos = num2;
        this.debug_info = str2;
        this.step = num3;
    }
}
