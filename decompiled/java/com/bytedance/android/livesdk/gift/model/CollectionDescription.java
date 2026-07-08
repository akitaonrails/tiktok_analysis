package com.bytedance.android.livesdk.gift.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class CollectionDescription {

    @C09CT("audience_description")
    public String audienceDescription;

    @C09CT("common_description")
    public String commonDescription;

    @C09CT("host_description")
    public String hostDescription;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.commonDescription != null) {
            sb.append(", common_description=");
            sb.append(this.commonDescription);
        }
        if (this.hostDescription != null) {
            sb.append(", host_description=");
            sb.append(this.hostDescription);
        }
        if (this.audienceDescription != null) {
            sb.append(", audience_description=");
            sb.append(this.audienceDescription);
        }
        sb.replace(0, 2, "CollectionDescription{");
        sb.append('}');
        return sb.toString();
    }
}
