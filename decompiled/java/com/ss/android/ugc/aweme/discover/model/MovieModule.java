package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class MovieModule implements Serializable {

    @C09CT("info_line1")
    public String infoLine1;

    @C09CT("info_line2")
    public String infoLine2;

    @C09CT("info_line3")
    public String infoLine3;

    public final String getInfoLine1() {
        return this.infoLine1;
    }

    public final String getInfoLine2() {
        return this.infoLine2;
    }

    public final String getInfoLine3() {
        return this.infoLine3;
    }

    public final void setInfoLine1(String str) {
        this.infoLine1 = str;
    }

    public final void setInfoLine2(String str) {
        this.infoLine2 = str;
    }

    public final void setInfoLine3(String str) {
        this.infoLine3 = str;
    }
}
