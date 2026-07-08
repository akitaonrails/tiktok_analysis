package com.bytedance.android.livesdk.gift.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class DriveItem {

    @C09CT("count")
    public Long count;

    @C09CT("level")
    public Integer level;

    @C09CT("type")
    public Integer type;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.level != null) {
            sb.append(", level=");
            sb.append(this.level);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        sb.replace(0, 2, "DriveItem{");
        sb.append('}');
        return sb.toString();
    }
}
