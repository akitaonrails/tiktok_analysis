package com.ss.android.ugc.aweme.template.datamodel;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class TemplatePugcCreatorStatisticModel implements Serializable {
    public static final int $stable = 0;

    @C09CT("count")
    public final Integer count;

    @C09CT("left_day")
    public final Integer leftDay;

    @C09CT("show")
    public final Integer show;

    public final Integer getCount() {
        return this.count;
    }

    public final Integer getLeftDay() {
        return this.leftDay;
    }

    public final Integer getShow() {
        return this.show;
    }
}
