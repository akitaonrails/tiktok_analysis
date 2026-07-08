package com.ss.android.ugc.aweme.publicgroup.data.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes3.dex */
public final class UpdateOnboardingCardRequest {

    @C09CT("conversation_short_id")
    public final long conversationShortId;

    @C09CT("message_id")
    public final long messageId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int status;

    public UpdateOnboardingCardRequest() {
        this(0L, 0L, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateOnboardingCardRequest)) {
            return false;
        }
        UpdateOnboardingCardRequest updateOnboardingCardRequest = (UpdateOnboardingCardRequest) obj;
        return this.conversationShortId == updateOnboardingCardRequest.conversationShortId && this.messageId == updateOnboardingCardRequest.messageId && this.status == updateOnboardingCardRequest.status;
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.conversationShortId) * 31) + C786410Ut5.Y2(this.messageId)) * 31) + this.status;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateOnboardingCardRequest(conversationShortId=");
        sbLIZ.append(this.conversationShortId);
        sbLIZ.append(", messageId=");
        sbLIZ.append(this.messageId);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UpdateOnboardingCardRequest(long j, long j2, int i) {
        this.conversationShortId = j;
        this.messageId = j2;
        this.status = i;
    }
}
