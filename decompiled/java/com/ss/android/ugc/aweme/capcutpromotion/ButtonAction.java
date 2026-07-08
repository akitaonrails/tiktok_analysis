package com.ss.android.ugc.aweme.capcutpromotion;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public final class ButtonAction {

    @C09CT("btn_style")
    public final int buttonStyle;

    @C09CT("jump_type")
    public final int jumpType;

    @C09CT("log_pb")
    public final LogPb logPb;

    @C09CT("schema")
    public final String schema;

    @C09CT("text")
    public final String text;

    public ButtonAction(int i, String str, String str2, int i2, LogPb logPb) {
        this.jumpType = i;
        this.text = str;
        this.schema = str2;
        this.buttonStyle = i2;
        this.logPb = logPb;
    }
}
