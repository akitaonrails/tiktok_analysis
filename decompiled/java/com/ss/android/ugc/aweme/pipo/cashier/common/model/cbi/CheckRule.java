package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class CheckRule {

    @C09CT("error_msg_raw_text")
    public final String errorMsg;

    @C09CT("type")
    public final String type;

    @C09CT("value")
    public final String value;

    public CheckRule(String str, String str2, String str3) {
        this.type = str;
        this.value = str2;
        this.errorMsg = str3;
    }
}
