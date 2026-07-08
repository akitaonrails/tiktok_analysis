package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SubscriptionInfo implements Serializable {

    @C09CT("is_preview")
    public Boolean isPreview;

    public SubscriptionInfo() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubscriptionInfo) && Intrinsics.LJFF(this.isPreview, ((SubscriptionInfo) obj).isPreview);
    }

    public final Boolean isPreview() {
        return this.isPreview;
    }

    public SubscriptionInfo(Boolean bool) {
        this.isPreview = bool;
    }
}
