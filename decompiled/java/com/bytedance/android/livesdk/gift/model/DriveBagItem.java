package com.bytedance.android.livesdk.gift.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class DriveBagItem {

    @C09CT("equipped")
    public Boolean equipped;

    @C09CT("item")
    public DriveItem item;

    @C09CT("next_expire")
    public Long nextExpire;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.item != null) {
            sb.append(", item=");
            sb.append(this.item);
        }
        if (this.nextExpire != null) {
            sb.append(", next_expire=");
            sb.append(this.nextExpire);
        }
        if (this.equipped != null) {
            sb.append(", equipped=");
            sb.append(this.equipped);
        }
        sb.replace(0, 2, "DriveBagItem{");
        sb.append('}');
        return sb.toString();
    }
}
