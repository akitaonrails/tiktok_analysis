package com.ss.android.ugc.aweme.social.sticker.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class SecretReplyResultEntry extends BaseResponse {

    @C09CT("creation_timestamp")
    public final long creationTimestamp;

    @C09CT("reply_id")
    public final String replyId;

    @C09CT("reply_text")
    public final String replyText;

    @C09CT("user_id")
    public final String userId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecretReplyResultEntry)) {
            return false;
        }
        SecretReplyResultEntry secretReplyResultEntry = (SecretReplyResultEntry) obj;
        return Intrinsics.LJFF(this.replyId, secretReplyResultEntry.replyId) && Intrinsics.LJFF(this.replyText, secretReplyResultEntry.replyText) && Intrinsics.LJFF(this.userId, secretReplyResultEntry.userId) && this.creationTimestamp == secretReplyResultEntry.creationTimestamp;
    }

    public final int hashCode() {
        return (((((this.replyId.hashCode() * 31) + this.replyText.hashCode()) * 31) + this.userId.hashCode()) * 31) + C786410Ut5.Y2(this.creationTimestamp);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SecretReplyResultEntry(replyId=");
        sbLIZ.append(this.replyId);
        sbLIZ.append(", replyText=");
        sbLIZ.append(this.replyText);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", creationTimestamp=");
        sbLIZ.append(this.creationTimestamp);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SecretReplyResultEntry() {
        this("", "", "", 0L);
    }

    public SecretReplyResultEntry(String str, String str2, String str3, long j) {
        this.replyId = str;
        this.replyText = str2;
        this.userId = str3;
        this.creationTimestamp = j;
    }
}
