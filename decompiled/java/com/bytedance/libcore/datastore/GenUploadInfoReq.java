package com.bytedance.libcore.datastore;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class GenUploadInfoReq {

    @C09CT("extra")
    public String extra = "";

    @C09CT("request_type")
    public int type;

    public final String getExtra() {
        return this.extra;
    }

    public final int getType() {
        return this.type;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
