package com.ss.android.ugc.aweme.im.streaming.api;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class StreamingInterruptResponseData extends BaseResponse {

    @C09CT("final_seq_id")
    public final int finalSeqId;

    @C09CT("interrupted")
    public final boolean interrupted;

    @C09CT("reply_client_message_id")
    public final String replyClientMessageId;

    @C09CT("reply_server_message_id")
    public final Long replyServerMessageId;

    @C09CT("send_client_message_id")
    public final String sendClientMessageId;

    @C09CT("send_server_message_id")
    public final Long sendServerMessageId;

    public StreamingInterruptResponseData() {
        this(false, 0, null, null, "", null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreamingInterruptResponseData)) {
            return false;
        }
        StreamingInterruptResponseData streamingInterruptResponseData = (StreamingInterruptResponseData) obj;
        return this.interrupted == streamingInterruptResponseData.interrupted && this.finalSeqId == streamingInterruptResponseData.finalSeqId && Intrinsics.LJFF(this.sendClientMessageId, streamingInterruptResponseData.sendClientMessageId) && Intrinsics.LJFF(this.sendServerMessageId, streamingInterruptResponseData.sendServerMessageId) && Intrinsics.LJFF(this.replyClientMessageId, streamingInterruptResponseData.replyClientMessageId) && Intrinsics.LJFF(this.replyServerMessageId, streamingInterruptResponseData.replyServerMessageId);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.interrupted) * 31) + this.finalSeqId) * 31;
        String str = this.sendClientMessageId;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.sendServerMessageId;
        int iHashCode2 = (((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + this.replyClientMessageId.hashCode()) * 31;
        Long l2 = this.replyServerMessageId;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreamingInterruptResponseData(interrupted=");
        sbLIZ.append(this.interrupted);
        sbLIZ.append(", finalSeqId=");
        sbLIZ.append(this.finalSeqId);
        sbLIZ.append(", sendClientMessageId=");
        sbLIZ.append(this.sendClientMessageId);
        sbLIZ.append(", sendServerMessageId=");
        sbLIZ.append(this.sendServerMessageId);
        sbLIZ.append(", replyClientMessageId=");
        sbLIZ.append(this.replyClientMessageId);
        sbLIZ.append(", replyServerMessageId=");
        sbLIZ.append(this.replyServerMessageId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StreamingInterruptResponseData(boolean z, int i, String str, Long l, String str2, Long l2) {
        this.interrupted = z;
        this.finalSeqId = i;
        this.sendClientMessageId = str;
        this.sendServerMessageId = l;
        this.replyClientMessageId = str2;
        this.replyServerMessageId = l2;
    }
}
