package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class DescendantsModel implements Serializable {

    @C09CT("notify_msg")
    public String notifyMsg;

    @C09CT("platforms")
    public List<String> platforms;

    public String getNotifyMsg() {
        return this.notifyMsg;
    }

    public List<String> getPlatforms() {
        return this.platforms;
    }

    public void setNotifyMsg(String str) {
        this.notifyMsg = str;
    }

    public void setPlatforms(List<String> list) {
        this.platforms = list;
    }
}
