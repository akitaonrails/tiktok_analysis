package com.ss.android.ugc.aweme.feed.model;

import X.C09CS;
import X.C09CT;
import com.ss.android.ugc.aweme.utils.JsonToStringAdapter;
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

    public int hashCode() {
        String str = this.lynxSchema;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.frontendData;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public EfficiencyJumpData(String str, String str2) {
        this.lynxSchema = str;
        this.frontendData = str2;
    }
}
