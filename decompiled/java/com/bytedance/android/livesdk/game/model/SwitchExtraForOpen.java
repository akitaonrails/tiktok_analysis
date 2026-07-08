package com.bytedance.android.livesdk.game.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class SwitchExtraForOpen {

    @C09CT("schema_for_open")
    public String schemaForOpen;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.schemaForOpen != null) {
            sb.append(", schema_for_open=");
            sb.append(this.schemaForOpen);
        }
        sb.replace(0, 2, "SwitchExtraForOpen{");
        sb.append('}');
        return sb.toString();
    }
}
