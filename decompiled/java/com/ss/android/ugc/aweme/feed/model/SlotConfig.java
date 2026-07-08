package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class SlotConfig implements Serializable {

    @C09CT("extra_data")
    public String extraData;

    @C09CT("frequency_config")
    public String frequencyConfig;

    @C09CT("priority")
    public Integer priority;

    @C09CT("render_type")
    public Integer renderType;

    @C09CT("res_key")
    public String resKey;

    @C09CT("schema")
    public String schema;

    @C09CT("key")
    public String slotKey;

    @C09CT("trackParams")
    public String trackParams;

    public SlotConfig() {
        this(null, null, null, null, null, null, null, null);
    }

    public SlotConfig(String str, String str2, Integer num, String str3, String str4, String str5, String str6, Integer num2) {
        this.slotKey = str;
        this.schema = str2;
        this.renderType = num;
        this.resKey = str3;
        this.extraData = str4;
        this.frequencyConfig = str5;
        this.trackParams = str6;
        this.priority = num2;
    }
}
