package com.bytedance.android.livesdk.game.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class SwitchExtraBase {

    @C09CT("schema_for_check")
    public String schemaForCheck;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.schemaForCheck != null) {
            sb.append(", schema_for_check=");
            sb.append(this.schemaForCheck);
        }
        sb.replace(0, 2, "SwitchExtraBase{");
        sb.append('}');
        return sb.toString();
    }
}
