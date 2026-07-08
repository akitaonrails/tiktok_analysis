package com.ss.android.ugc.aweme.aikit.api.common.task;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SubscriptionInfo implements Serializable {

    @C09CT("is_preview")
    public final Boolean isPreview;

    public SubscriptionInfo() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubscriptionInfo) && Intrinsics.LJFF(this.isPreview, ((SubscriptionInfo) obj).isPreview);
    }

    public int hashCode() {
        Boolean bool = this.isPreview;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubscriptionInfo(isPreview=");
        sbLIZ.append(this.isPreview);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean isPreview() {
        return this.isPreview;
    }

    public SubscriptionInfo(Boolean bool) {
        this.isPreview = bool;
    }
}
