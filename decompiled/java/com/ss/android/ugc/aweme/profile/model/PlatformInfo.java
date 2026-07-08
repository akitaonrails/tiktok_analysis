package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class PlatformInfo implements Serializable {

    @C09CT("full_synced")
    public boolean fullSynced;

    @C09CT("nickname")
    public String nickName;

    @C09CT("platform_name")
    public String patformName;

    public String getNickName() {
        return this.nickName;
    }

    public String getPatformName() {
        return this.patformName;
    }

    public boolean isFullSynced() {
        return this.fullSynced;
    }

    public void setFullSynced(boolean z) {
        this.fullSynced = z;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setPatformName(String str) {
        this.patformName = str;
    }
}
