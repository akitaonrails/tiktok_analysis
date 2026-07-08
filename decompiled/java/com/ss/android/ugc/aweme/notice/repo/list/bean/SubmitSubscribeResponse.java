package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SubmitSubscribeResponse extends BaseResponse {

    @C09CT("subscribe_guide")
    public final SubscribeGuide subscribeGuide;

    public SubmitSubscribeResponse() {
        this(null);
    }

    public final SubmitSubscribeResponse copy(SubscribeGuide subscribeGuide) {
        return new SubmitSubscribeResponse(subscribeGuide);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitSubscribeResponse) && Intrinsics.LJFF(this.subscribeGuide, ((SubmitSubscribeResponse) obj).subscribeGuide);
    }

    public int hashCode() {
        SubscribeGuide subscribeGuide = this.subscribeGuide;
        if (subscribeGuide == null) {
            return 0;
        }
        return subscribeGuide.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubmitSubscribeResponse(subscribeGuide=");
        sbLIZ.append(this.subscribeGuide);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final SubscribeGuide getSubscribeGuide() {
        return this.subscribeGuide;
    }

    public SubmitSubscribeResponse(SubscribeGuide subscribeGuide) {
        this.subscribeGuide = subscribeGuide;
    }
}
