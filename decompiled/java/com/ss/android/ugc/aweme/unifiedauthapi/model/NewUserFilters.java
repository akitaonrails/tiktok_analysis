package com.ss.android.ugc.aweme.unifiedauthapi.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class NewUserFilters implements Serializable {

    @C09CT("less_than_x_days")
    public final double lessThanXDays;

    @C09CT("more_than_x_days")
    public final double moreThanXDays;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NewUserFilters(moreThanXDays=");
        sbLIZ.append(this.moreThanXDays);
        sbLIZ.append(", lessThanXDays=");
        sbLIZ.append(this.lessThanXDays);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public NewUserFilters() {
        this(0.0d, 0.0d);
    }

    public NewUserFilters(double d, double d2) {
        this.moreThanXDays = d;
        this.lessThanXDays = d2;
    }
}
