package com.ss.android.ugc.aweme.commercialize.model.promote;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class PromoteTraffic implements Serializable {

    @C09CT("delay_time")
    public Long delayTime = 1000L;

    @C09CT("traffic_level")
    public Integer level;

    @C09CT("need_track")
    public Boolean needTrack;

    @C09CT("version")
    public String version;

    public final Long getDelayTime() {
        return this.delayTime;
    }

    public final Integer getLevel() {
        return this.level;
    }

    public final Boolean getNeedTrack() {
        return this.needTrack;
    }

    public final String getVersion() {
        return this.version;
    }

    public final void setDelayTime(Long l) {
        this.delayTime = l;
    }

    public final void setLevel(Integer num) {
        this.level = num;
    }

    public final void setNeedTrack(Boolean bool) {
        this.needTrack = bool;
    }

    public final void setVersion(String str) {
        this.version = str;
    }
}
