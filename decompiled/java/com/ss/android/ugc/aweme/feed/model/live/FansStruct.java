package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class FansStruct implements Serializable {

    @C09CT("fans_level")
    public int fansLevel;

    @C09CT("fans_name")
    public String fansName;

    @C09CT("is_fan")
    public boolean isFan;

    @C09CT("light_up")
    public boolean lightUp;

    public int getFansLevel() {
        return this.fansLevel;
    }

    public String getFansName() {
        return this.fansName;
    }

    public boolean isFan() {
        return this.isFan;
    }

    public boolean isLightUp() {
        return this.lightUp;
    }

    public void setFan(boolean z) {
        this.isFan = z;
    }

    public void setFansLevel(int i) {
        this.fansLevel = i;
    }

    public void setFansName(String str) {
        this.fansName = str;
    }

    public void setLightUp(boolean z) {
        this.lightUp = z;
    }
}
