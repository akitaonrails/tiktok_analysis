package com.bytedance.ies.ugc.aweme.rich.model.commercialize.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class ShakeModel implements Serializable {

    @C09CT("frontend_data")
    public final Object frontendData;

    @C09CT("gecko_channel")
    public final List<String> geckoChannel;

    @C09CT("lynx_url")
    public final String lynxUrl;
    public boolean shaken;

    @C09CT("show_time")
    public final int showTime;

    @C09CT("speed")
    public final float speed;

    public final void setShaken(boolean z) {
        this.shaken = z;
    }

    public ShakeModel(float f, int i, List<String> list, String str, Object obj, boolean z) {
        this.speed = f;
        this.showTime = i;
        this.geckoChannel = list;
        this.lynxUrl = str;
        this.frontendData = obj;
        this.shaken = z;
    }
}
