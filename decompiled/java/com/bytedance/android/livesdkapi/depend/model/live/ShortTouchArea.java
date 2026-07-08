package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class ShortTouchArea {

    @C09CT("min_webcast_sdk_version")
    public Long minWebcastSdkVersion;

    @C09CT("priority")
    public Integer priority;

    @C09CT("short_touch_info")
    public ShortTouchInfo shortTouchInfo;

    @C09CT("short_touch_type")
    public int shortTouchType;

    @C09CT("type")
    public Integer type;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.priority != null) {
            sb.append(", priority=");
            sb.append(this.priority);
        }
        if (this.minWebcastSdkVersion != null) {
            sb.append(", min_webcast_sdk_version=");
            sb.append(this.minWebcastSdkVersion);
        }
        sb.append(", short_touch_type=");
        sb.append(this.shortTouchType);
        if (this.shortTouchInfo != null) {
            sb.append(", short_touch_info=");
            sb.append(this.shortTouchInfo);
        }
        sb.replace(0, 2, "ShortTouchArea{");
        sb.append('}');
        return sb.toString();
    }
}
