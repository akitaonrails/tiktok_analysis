package com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class FailMsgModel implements Serializable {

    @C09CT("consecutive_times")
    public int consecutiveTimes;

    @C09CT("is_first_page")
    public int isFirstPage;

    @C09CT("name")
    public String name;

    public FailMsgModel() {
        this(null, 1, 0);
    }

    public int hashCode() {
        String str = this.name;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.isFirstPage) * 31) + this.consecutiveTimes;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FailMsgModel(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", isFirstPage=");
        sbLIZ.append(this.isFirstPage);
        sbLIZ.append(", consecutiveTimes=");
        sbLIZ.append(this.consecutiveTimes);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int isFirstPage() {
        return this.isFirstPage;
    }

    public final void setConsecutiveTimes(int i) {
        this.consecutiveTimes = i;
    }

    public final void setFirstPage(int i) {
        this.isFirstPage = i;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public FailMsgModel(String str, int i, int i2) {
        this.name = str;
        this.isFirstPage = i;
        this.consecutiveTimes = i2;
    }
}
