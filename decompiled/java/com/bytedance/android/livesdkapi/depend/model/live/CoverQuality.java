package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class CoverQuality {

    @C09CT("bubble_tip")
    public String bubbleTip;

    @C09CT("level")
    public Long level;

    @C09CT("pop_tip")
    public String popTip;

    @C09CT("uri")
    public String uri;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.level != null) {
            sb.append(", level=");
            sb.append(this.level);
        }
        if (this.bubbleTip != null) {
            sb.append(", bubble_tip=");
            sb.append(this.bubbleTip);
        }
        if (this.popTip != null) {
            sb.append(", pop_tip=");
            sb.append(this.popTip);
        }
        if (this.uri != null) {
            sb.append(", uri=");
            sb.append(this.uri);
        }
        sb.replace(0, 2, "CoverQuality{");
        sb.append('}');
        return sb.toString();
    }
}
