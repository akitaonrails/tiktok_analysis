package com.bytedance.ies.ugc.aweme.rich.model.feed.model;

import X.C09CS;
import X.C09CT;
import com.bytedance.ies.ugc.aweme.rich.model.utils.JsonToStringAdapter;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class EfficiencyJumpData implements Serializable {

    @C09CT("frontend_data")
    @C09CS(JsonToStringAdapter.class)
    public final String frontendData;

    @C09CT("lynx_schema")
    public final String lynxSchema;

    public EfficiencyJumpData() {
        this(null, null);
    }

    public EfficiencyJumpData(String str, String str2) {
        this.lynxSchema = str;
        this.frontendData = str2;
    }
}
