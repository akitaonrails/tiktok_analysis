package com.bytedance.android.livesdk.signaling.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public class BaseUplinkData implements Serializable {

    @C09CT("need_resp")
    public boolean needResp;

    @C09CT("upload_data")
    public String uploadData;

    public final boolean getNeedResp() {
        return this.needResp;
    }

    public final String getUploadData() {
        return this.uploadData;
    }

    public final void setNeedResp(boolean z) {
        this.needResp = z;
    }

    public final void setUploadData(String str) {
        this.uploadData = str;
    }
}
