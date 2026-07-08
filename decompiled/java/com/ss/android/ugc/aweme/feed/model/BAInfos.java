package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.profile.model.TagBAUser;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class BAInfos implements Serializable {

    @C09CT("ba_infos")
    public final List<TagBAUser> baInfos;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public String statusMsg;

    public final List<TagBAUser> getBaInfos() {
        return this.baInfos;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final void setStatusMsg(String str) {
        this.statusMsg = str;
    }
}
