package com.ss.android.ugc.aweme.tako.ccl.net;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBaseResponse;
import com.ss.android.ugc.aweme.tako.ccl.model.api.UpdateUserSettings;
import com.ss.android.ugc.aweme.tako.ccl.model.conversation.ConversationInfo;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class BatchFetchConversationsResponse extends TakoBaseResponse {

    @C09CT("conversations")
    public final List<ConversationInfo> conversationInfoList;

    @C09CT("tako_user_settings")
    public final UpdateUserSettings userSettings;

    public BatchFetchConversationsResponse() {
        this(null, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BatchFetchConversationsResponse)) {
            return false;
        }
        BatchFetchConversationsResponse batchFetchConversationsResponse = (BatchFetchConversationsResponse) obj;
        return Intrinsics.LJFF(this.conversationInfoList, batchFetchConversationsResponse.conversationInfoList) && Intrinsics.LJFF(this.userSettings, batchFetchConversationsResponse.userSettings);
    }

    public final int hashCode() {
        List<ConversationInfo> list = this.conversationInfoList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        UpdateUserSettings updateUserSettings = this.userSettings;
        return iHashCode + (updateUserSettings != null ? updateUserSettings.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BatchFetchConversationsResponse(conversationInfoList=");
        sbLIZ.append(this.conversationInfoList);
        sbLIZ.append(", userSettings=");
        sbLIZ.append(this.userSettings);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BatchFetchConversationsResponse(List<ConversationInfo> list, UpdateUserSettings updateUserSettings) {
        super(null, 0, "");
        this.conversationInfoList = list;
        this.userSettings = updateUserSettings;
    }

    public BatchFetchConversationsResponse(List list, UpdateUserSettings updateUserSettings, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? new UpdateUserSettings(false, false, 0, false, false, false, "", Boolean.FALSE) : updateUserSettings);
    }
}
