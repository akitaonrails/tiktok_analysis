package com.ss.android.ugc.profile.platform.base.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public class BizBaseData implements Serializable {

    @C09CT("accessibility")
    public String accessbility;

    @C09CT("describe")
    public Describe describe;

    @C09CT("icon")
    public Icon icon;

    public final String getAccessbility() {
        return this.accessbility;
    }

    public final Describe getDescribe() {
        return this.describe;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final void setAccessbility(String str) {
        this.accessbility = str;
    }

    public final void setDescribe(Describe describe) {
        this.describe = describe;
    }

    public final void setIcon(Icon icon) {
        this.icon = icon;
    }
}
