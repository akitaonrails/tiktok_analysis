package com.ss.android.ugc.aweme.ecommerce.showcase.mix.assem;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.mix.base.BaseMixPostEvent;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class JumpLynxPageResult extends BaseMixPostEvent {

    @C09CT("errorMessage")
    public String errorMessage;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("isSuccess")
    public Integer isSuccess;

    @C09CT("originTimestamp")
    public Long originTimestamp;

    @C09CT("page_id")
    public final String pageId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JumpLynxPageResult)) {
            return false;
        }
        JumpLynxPageResult jumpLynxPageResult = (JumpLynxPageResult) obj;
        return Intrinsics.LJFF(this.pageId, jumpLynxPageResult.pageId) && Intrinsics.LJFF(this.originTimestamp, jumpLynxPageResult.originTimestamp) && Intrinsics.LJFF(this.id, jumpLynxPageResult.id) && Intrinsics.LJFF(this.isSuccess, jumpLynxPageResult.isSuccess) && Intrinsics.LJFF(this.errorMessage, jumpLynxPageResult.errorMessage);
    }

    public final int hashCode() {
        String str = this.pageId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.originTimestamp;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.id;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.isSuccess;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.errorMessage;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JumpLynxPageResult(pageId=");
        sbLIZ.append(this.pageId);
        sbLIZ.append(", originTimestamp=");
        sbLIZ.append(this.originTimestamp);
        sbLIZ.append(", id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", isSuccess=");
        sbLIZ.append(this.isSuccess);
        sbLIZ.append(", errorMessage=");
        sbLIZ.append(this.errorMessage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public JumpLynxPageResult(String str, Long l, String str2, Integer num, String str3) {
        this.pageId = str;
        this.originTimestamp = l;
        this.id = str2;
        this.isSuccess = num;
        this.errorMessage = str3;
    }
}
