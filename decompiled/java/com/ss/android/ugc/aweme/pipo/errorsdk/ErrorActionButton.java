package com.ss.android.ugc.aweme.pipo.errorsdk;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class ErrorActionButton {

    @C09CT("schema")
    public final String actionParams;

    @C09CT("action_type")
    public final String actionType;

    @C09CT("btn_text")
    public final String btnText;

    public ErrorActionButton() {
        this(null, null, null);
    }

    public ErrorActionButton(String str, String str2, String str3) {
        this.btnText = str;
        this.actionType = str2;
        this.actionParams = str3;
    }
}
