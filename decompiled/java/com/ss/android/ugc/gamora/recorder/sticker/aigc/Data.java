package com.ss.android.ugc.gamora.recorder.sticker.aigc;

import X.C09CT;

/* JADX INFO: loaded from: classes9.dex */
public final class Data {

    @C09CT("req_json")
    public final String reqJson;

    @C09CT("req_key")
    public final String reqKey;

    public Data() {
        this(null, null);
    }

    public Data(String str, String str2) {
        this.reqKey = str;
        this.reqJson = str2;
    }
}
