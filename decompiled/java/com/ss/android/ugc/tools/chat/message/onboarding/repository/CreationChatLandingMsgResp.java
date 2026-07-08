package com.ss.android.ugc.tools.chat.message.onboarding.repository;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class CreationChatLandingMsgResp extends BaseResponse {

    @C09CT("landing_messages")
    public final List<GeneralLandingMessage> landingMessages;

    @C09CT("source")
    public final Integer source;

    public CreationChatLandingMsgResp() {
        this(0, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreationChatLandingMsgResp)) {
            return false;
        }
        CreationChatLandingMsgResp creationChatLandingMsgResp = (CreationChatLandingMsgResp) obj;
        return Intrinsics.LJFF(this.source, creationChatLandingMsgResp.source) && Intrinsics.LJFF(this.landingMessages, creationChatLandingMsgResp.landingMessages);
    }

    public final int hashCode() {
        Integer num = this.source;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<GeneralLandingMessage> list = this.landingMessages;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreationChatLandingMsgResp(source=");
        sbLIZ.append(this.source);
        sbLIZ.append(", landingMessages=");
        sbLIZ.append(this.landingMessages);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CreationChatLandingMsgResp(Integer num, List<GeneralLandingMessage> list) {
        this.source = num;
        this.landingMessages = list;
    }
}
