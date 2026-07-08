package com.bytedance.libcore.datastore;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class RecordFileReq {

    @C09CT("request_type")
    public int type;

    @C09CT("project_id")
    public String projectId = "";

    @C09CT("extra")
    public String extra = "";

    public final String getExtra() {
        return this.extra;
    }

    public final String getProjectId() {
        return this.projectId;
    }

    public final int getType() {
        return this.type;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setProjectId(String str) {
        this.projectId = str;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
