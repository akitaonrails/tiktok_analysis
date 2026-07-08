package com.ss.android.ugc.aweme.tako.detail.operator;

import X.AbstractC2126608Uu;
import X.C09CT;
import X.C0PI2;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class BatchDetailList extends AbstractC2126608Uu {

    @C09CT("error_code")
    public int errorCode;

    @C09CT("extra")
    public Extra ext;

    @C09CT("aweme_details")
    public List<C0PI2> items;

    @C09CT("log_pb")
    public LogPbBean logPbBean;

    @C09CT("message")
    public String message;

    @C09CT("rid")
    public String requestId;

    @C09CT("status_code")
    public int statusCode;

    @C09CT("status_msg")
    public String statusMsg;

    public BatchDetailList() {
        this(null, null, null, null, null, null, 0, 0, 255, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BatchDetailList)) {
            return false;
        }
        BatchDetailList batchDetailList = (BatchDetailList) obj;
        return Intrinsics.LJFF(this.items, batchDetailList.items) && Intrinsics.LJFF(this.requestId, batchDetailList.requestId) && Intrinsics.LJFF(this.logPbBean, batchDetailList.logPbBean) && Intrinsics.LJFF(this.ext, batchDetailList.ext) && Intrinsics.LJFF(this.message, batchDetailList.message) && Intrinsics.LJFF(this.statusMsg, batchDetailList.statusMsg) && this.statusCode == batchDetailList.statusCode && this.errorCode == batchDetailList.errorCode;
    }

    public final int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        String str = this.requestId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        LogPbBean logPbBean = this.logPbBean;
        int iHashCode3 = (iHashCode2 + (logPbBean == null ? 0 : logPbBean.hashCode())) * 31;
        Extra extra = this.ext;
        int iHashCode4 = (iHashCode3 + (extra == null ? 0 : extra.hashCode())) * 31;
        String str2 = this.message;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.statusMsg;
        return ((((iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.statusCode) * 31) + this.errorCode;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BatchDetailList(items=");
        sbLIZ.append(this.items);
        sbLIZ.append(", requestId=");
        sbLIZ.append(this.requestId);
        sbLIZ.append(", logPbBean=");
        sbLIZ.append(this.logPbBean);
        sbLIZ.append(", ext=");
        sbLIZ.append(this.ext);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.errorCode);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BatchDetailList(List<C0PI2> list, String str, LogPbBean logPbBean, Extra extra, String str2, String str3, int i, int i2) {
        this.items = list;
        this.requestId = str;
        this.logPbBean = logPbBean;
        this.ext = extra;
        this.message = str2;
        this.statusMsg = str3;
        this.statusCode = i;
        this.errorCode = i2;
    }

    public BatchDetailList(List list, String str, LogPbBean logPbBean, Extra extra, String str2, String str3, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? C13BV.INSTANCE : list, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? null : logPbBean, (i3 & 8) != 0 ? null : extra, (i3 & 16) != 0 ? null : str2, (i3 & 32) == 0 ? str3 : null, (i3 & 64) != 0 ? 0 : i, (i3 & 128) == 0 ? i2 : 0);
    }
}
