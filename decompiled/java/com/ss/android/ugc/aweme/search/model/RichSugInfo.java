package com.ss.android.ugc.aweme.search.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class RichSugInfo implements Serializable {

    @C09CT("sug_icon_uri")
    public String sugIconUri;

    @C09CT("sug_reason")
    public String sugReason;

    @C09CT("sug_reason_type")
    public String sugReasonType;

    public RichSugInfo() {
        this(null, null, null);
    }

    public RichSugInfo(String str, String str2, String str3) {
        this.sugReason = str;
        this.sugReasonType = str2;
        this.sugIconUri = str3;
    }
}
