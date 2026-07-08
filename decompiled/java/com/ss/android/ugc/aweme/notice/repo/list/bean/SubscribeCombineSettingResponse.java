package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class SubscribeCombineSettingResponse extends BaseResponse {

    @C09CT("channel_setting")
    public final GroupUnsubscribeSetting groupUnsubscribeSetting;

    public SubscribeCombineSettingResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubscribeCombineSettingResponse) && Intrinsics.LJFF(this.groupUnsubscribeSetting, ((SubscribeCombineSettingResponse) obj).groupUnsubscribeSetting);
    }

    public final int hashCode() {
        GroupUnsubscribeSetting groupUnsubscribeSetting = this.groupUnsubscribeSetting;
        if (groupUnsubscribeSetting == null) {
            return 0;
        }
        return groupUnsubscribeSetting.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubscribeCombineSettingResponse(groupUnsubscribeSetting=");
        sbLIZ.append(this.groupUnsubscribeSetting);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SubscribeCombineSettingResponse(GroupUnsubscribeSetting groupUnsubscribeSetting) {
        this.groupUnsubscribeSetting = groupUnsubscribeSetting;
    }
}
