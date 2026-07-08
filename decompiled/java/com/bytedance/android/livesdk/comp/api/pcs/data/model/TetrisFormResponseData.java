package com.bytedance.android.livesdk.comp.api.pcs.data.model;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class TetrisFormResponseData {

    @C09CT("clue_id")
    public final String clueId;

    @C09CT("err_msg")
    public final String errMsg;

    @C09CT("verify_subtype")
    public final String verifySubtype;

    @C09CT("verify_type")
    public final String verifyType;

    public TetrisFormResponseData() {
        this("", "", "", "");
    }

    public TetrisFormResponseData(String str, String str2, String str3, String str4) {
        this.clueId = str;
        this.verifyType = str2;
        this.verifySubtype = str3;
        this.errMsg = str4;
    }
}
