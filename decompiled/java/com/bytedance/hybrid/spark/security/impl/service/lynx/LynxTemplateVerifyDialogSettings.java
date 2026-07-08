package com.bytedance.hybrid.spark.security.impl.service.lynx;

import X.C09CT;
import X.EnumC843650X7r;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class LynxTemplateVerifyDialogSettings {

    @C09CT("allow_list")
    public final List<String> allowList;

    @C09CT("close_verify_link")
    public final String closeVerifyLink;

    @C09CT("mode")
    public final int mode;

    @C09CT("statement")
    public final String statement;

    @C09CT("statement_close")
    public final String statementClose;

    @C09CT("statement_url")
    public final String statementUrl;

    public LynxTemplateVerifyDialogSettings() {
        this("", EnumC843650X7r.NONE.getCode(), "", null, "", "");
    }

    public LynxTemplateVerifyDialogSettings(String str, int i, String str2, List<String> list, String str3, String str4) {
        this.statement = str;
        this.mode = i;
        this.statementUrl = str2;
        this.allowList = list;
        this.statementClose = str3;
        this.closeVerifyLink = str4;
    }
}
