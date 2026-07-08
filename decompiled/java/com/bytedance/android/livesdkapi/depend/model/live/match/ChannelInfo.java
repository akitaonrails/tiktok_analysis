package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class ChannelInfo {

    @C09CT("dimension")
    public Integer dimension;

    @C09CT("layout")
    public Integer layout;

    @C09CT("vendor")
    public Integer vendor;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.vendor != null) {
            sb.append(", vendor=");
            sb.append(this.vendor);
        }
        if (this.layout != null) {
            sb.append(", layout=");
            sb.append(this.layout);
        }
        if (this.dimension != null) {
            sb.append(", dimension=");
            sb.append(this.dimension);
        }
        sb.replace(0, 2, "ChannelInfo{");
        sb.append('}');
        return sb.toString();
    }
}
