package com.ss.android.ugc.aweme.aigc;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class AIGCQuota implements Serializable {

    @C09CT("quota_remain")
    public final Integer quotaRemain;

    @C09CT("quota_type")
    public final String quotaType;

    public AIGCQuota(String str, Integer num) {
        this.quotaType = str;
        this.quotaRemain = num;
    }
}
