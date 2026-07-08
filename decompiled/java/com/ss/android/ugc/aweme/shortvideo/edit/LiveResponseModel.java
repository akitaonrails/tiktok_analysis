package com.ss.android.ugc.aweme.shortvideo.edit;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class LiveResponseModel implements Serializable {

    @C09CT("code")
    public Integer code = 0;

    @C09CT("type")
    public String type = "highlight";

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public String status = "draft";

    public final Integer getCode() {
        return this.code;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getType() {
        return this.type;
    }

    public final void setCode(Integer num) {
        this.code = num;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public final void setType(String str) {
        this.type = str;
    }
}
