package com.bytedance.android.livesdk.livesetting.feed;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveSkylightNearbyStyleConfig {
    public static final TypeAdapter ADAPTER = new LiveSkylightNearbyStyleConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("show_location")
    public boolean showLocation;

    @C09CT("style")
    public int style;

    @C09CT("use_ip_location")
    public boolean useIpLocation;

    public final boolean getShowLocation() {
        return this.showLocation;
    }

    public final int getStyle() {
        return this.style;
    }

    public final boolean getUseIpLocation() {
        return this.useIpLocation;
    }

    public final void setShowLocation(boolean z) {
        this.showLocation = z;
    }

    public final void setStyle(int i) {
        this.style = i;
    }

    public final void setUseIpLocation(boolean z) {
        this.useIpLocation = z;
    }
}
