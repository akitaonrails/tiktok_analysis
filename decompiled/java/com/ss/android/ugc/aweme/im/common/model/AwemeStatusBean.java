package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class AwemeStatusBean implements Serializable {

    @C09CT("item_id")
    public String awemeId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public Integer status;

    @C09CT("status_text")
    public String statusText;

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final String getStatusText() {
        return this.statusText;
    }

    public final void setAwemeId(String str) {
        this.awemeId = str;
    }

    public final void setStatus(Integer num) {
        this.status = num;
    }

    public final void setStatusText(String str) {
        this.statusText = str;
    }
}
