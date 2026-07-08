package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinCreateMultiItemResponse extends BaseResponse {

    @C09CT("item_info")
    public final List<BulletinItem> itemInfo;

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT("need_toast")
    public final Boolean needToast;

    @C09CT("new_quota")
    public final Long quota;

    @C09CT("status_code_list")
    public final List<Integer> statusCodeList;

    @C09CT("status_msg_list")
    public final List<String> statusMsgList;

    @C09CT("toast_msg")
    public final String toastMsg;

    public final BulletinCreateMultiItemResponse copy(List<Integer> list, List<String> list2, List<BulletinItem> list3, Long l, Boolean bool, String str, LogPbBean logPbBean) {
        return new BulletinCreateMultiItemResponse(list, list2, list3, l, bool, str, logPbBean);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinCreateMultiItemResponse)) {
            return false;
        }
        BulletinCreateMultiItemResponse bulletinCreateMultiItemResponse = (BulletinCreateMultiItemResponse) obj;
        return Intrinsics.LJFF(this.statusCodeList, bulletinCreateMultiItemResponse.statusCodeList) && Intrinsics.LJFF(this.statusMsgList, bulletinCreateMultiItemResponse.statusMsgList) && Intrinsics.LJFF(this.itemInfo, bulletinCreateMultiItemResponse.itemInfo) && Intrinsics.LJFF(this.quota, bulletinCreateMultiItemResponse.quota) && Intrinsics.LJFF(this.needToast, bulletinCreateMultiItemResponse.needToast) && Intrinsics.LJFF(this.toastMsg, bulletinCreateMultiItemResponse.toastMsg) && Intrinsics.LJFF(this.logPb, bulletinCreateMultiItemResponse.logPb);
    }

    public int hashCode() {
        List<Integer> list = this.statusCodeList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.statusMsgList;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<BulletinItem> list3 = this.itemInfo;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Long l = this.quota;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.needToast;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.toastMsg;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        LogPbBean logPbBean = this.logPb;
        return iHashCode6 + (logPbBean != null ? logPbBean.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinCreateMultiItemResponse(statusCodeList=");
        sbLIZ.append(this.statusCodeList);
        sbLIZ.append(", statusMsgList=");
        sbLIZ.append(this.statusMsgList);
        sbLIZ.append(", itemInfo=");
        sbLIZ.append(this.itemInfo);
        sbLIZ.append(", quota=");
        sbLIZ.append(this.quota);
        sbLIZ.append(", needToast=");
        sbLIZ.append(this.needToast);
        sbLIZ.append(", toastMsg=");
        sbLIZ.append(this.toastMsg);
        sbLIZ.append(", logPb=");
        sbLIZ.append(this.logPb);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<BulletinItem> getItemInfo() {
        return this.itemInfo;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final Boolean getNeedToast() {
        return this.needToast;
    }

    public final Long getQuota() {
        return this.quota;
    }

    public final List<Integer> getStatusCodeList() {
        return this.statusCodeList;
    }

    public final List<String> getStatusMsgList() {
        return this.statusMsgList;
    }

    public final String getToastMsg() {
        return this.toastMsg;
    }

    public BulletinCreateMultiItemResponse(List<Integer> list, List<String> list2, List<BulletinItem> list3, Long l, Boolean bool, String str, LogPbBean logPbBean) {
        this.statusCodeList = list;
        this.statusMsgList = list2;
        this.itemInfo = list3;
        this.quota = l;
        this.needToast = bool;
        this.toastMsg = str;
        this.logPb = logPbBean;
    }
}
