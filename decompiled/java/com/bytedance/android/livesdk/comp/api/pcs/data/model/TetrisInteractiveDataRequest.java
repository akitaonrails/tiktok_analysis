package com.bytedance.android.livesdk.comp.api.pcs.data.model;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class TetrisInteractiveDataRequest {

    @C09CT("clue_id")
    public final String clueId;

    @C09CT("interactive_type")
    public final String interactiveType;

    @C09CT("request_tag_from")
    public final String requestTagFrom;

    public TetrisInteractiveDataRequest() {
        this("", "", "");
    }

    public TetrisInteractiveDataRequest(String str, String str2, String str3) {
        this.clueId = str;
        this.interactiveType = str2;
        this.requestTagFrom = str3;
    }
}
