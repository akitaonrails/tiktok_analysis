package com.ss.android.ugc.aweme.minis.page.main.functions.notification.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class MinisInboxSubscriptionStatusResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("is_subscribed")
    public final Boolean isSubscribed;

    public MinisInboxSubscriptionStatusResponse() {
        this(null);
    }

    public final MinisInboxSubscriptionStatusResponse copy(Boolean bool) {
        return new MinisInboxSubscriptionStatusResponse(bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MinisInboxSubscriptionStatusResponse) && Intrinsics.LJFF(this.isSubscribed, ((MinisInboxSubscriptionStatusResponse) obj).isSubscribed);
    }

    public int hashCode() {
        Boolean bool = this.isSubscribed;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisInboxSubscriptionStatusResponse(isSubscribed=");
        sbLIZ.append(this.isSubscribed);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean isSubscribed() {
        return this.isSubscribed;
    }

    public MinisInboxSubscriptionStatusResponse(Boolean bool) {
        this.isSubscribed = bool;
    }
}
