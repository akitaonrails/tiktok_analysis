package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class RoomExtra implements Serializable {

    @C09CT("config")
    public RoomConfig config;

    @C09CT("with_promotion")
    public boolean withPromotion;

    public RoomConfig getConfig() {
        return this.config;
    }

    public void setConfig(RoomConfig roomConfig) {
        this.config = roomConfig;
    }
}
