package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public class CommitRemarkNameResponse {

    @C09CT("remark_name")
    public String remarkName;

    @C09CT("status_code")
    public int statusCode;

    @C09CT("status_msg")
    public String statusMsg;

    public boolean isOK() {
        return this.statusCode == 0;
    }
}
