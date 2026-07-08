package com.ss.android.ugc.aweme.subscription.pgc.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdk.chatroom.api.SubInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PgcSubscribeUserInfoResponse {

    @C09CT("subscribing")
    public final PgcSubscribingInfo subscribing;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PgcSubscribeUserInfoResponse) && Intrinsics.LJFF(this.subscribing, ((PgcSubscribeUserInfoResponse) obj).subscribing);
    }

    public final int hashCode() {
        return this.subscribing.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PgcSubscribeUserInfoResponse(subscribing=");
        sbLIZ.append(this.subscribing);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PgcSubscribeUserInfoResponse() {
        this(new PgcSubscribingInfo(new SubInfo()));
    }

    public PgcSubscribeUserInfoResponse(PgcSubscribingInfo pgcSubscribingInfo) {
        this.subscribing = pgcSubscribingInfo;
    }
}
