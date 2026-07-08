package com.ss.android.ugc.aweme.notification.bean;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class LiveNoticeMessageResponse extends BaseResponse {
    public static final int $stable = 8;

    @C09CT("data")
    public final LiveMessage liveMessage;

    public LiveNoticeMessageResponse() {
        this(null);
    }

    public final LiveNoticeMessageResponse copy(LiveMessage liveMessage) {
        return new LiveNoticeMessageResponse(liveMessage);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LiveNoticeMessageResponse) && Intrinsics.LJFF(this.liveMessage, ((LiveNoticeMessageResponse) obj).liveMessage);
    }

    public int hashCode() {
        LiveMessage liveMessage = this.liveMessage;
        if (liveMessage == null) {
            return 0;
        }
        return liveMessage.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveNoticeMessageResponse(liveMessage=");
        sbLIZ.append(this.liveMessage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final LiveMessage getLiveMessage() {
        return this.liveMessage;
    }

    public LiveNoticeMessageResponse(LiveMessage liveMessage) {
        this.liveMessage = liveMessage;
    }
}
