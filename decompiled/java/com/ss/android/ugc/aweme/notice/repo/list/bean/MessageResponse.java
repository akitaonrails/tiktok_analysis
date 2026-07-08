package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class MessageResponse extends BaseResponse {

    @C09CT("messages")
    public final MessageItem item;

    @C09CT("log_pb")
    public final LogPbBean mLogPbBean;

    public MessageResponse() {
        this(null, null);
    }

    public final MessageResponse copy(MessageItem messageItem, LogPbBean logPbBean) {
        return new MessageResponse(messageItem, logPbBean);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageResponse)) {
            return false;
        }
        MessageResponse messageResponse = (MessageResponse) obj;
        return Intrinsics.LJFF(this.item, messageResponse.item) && Intrinsics.LJFF(this.mLogPbBean, messageResponse.mLogPbBean);
    }

    public int hashCode() {
        MessageItem messageItem = this.item;
        int iHashCode = (messageItem == null ? 0 : messageItem.hashCode()) * 31;
        LogPbBean logPbBean = this.mLogPbBean;
        return iHashCode + (logPbBean != null ? logPbBean.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageResponse(item=");
        sbLIZ.append(this.item);
        sbLIZ.append(", mLogPbBean=");
        sbLIZ.append(this.mLogPbBean);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final MessageItem getItem() {
        return this.item;
    }

    public final LogPbBean getMLogPbBean() {
        return this.mLogPbBean;
    }

    public MessageResponse(MessageItem messageItem, LogPbBean logPbBean) {
        this.item = messageItem;
        this.mLogPbBean = logPbBean;
    }
}
