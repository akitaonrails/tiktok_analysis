package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class BindInfo {

    @C09CT("bind_status")
    public String bindStatus;

    @C09CT("button_text")
    public String buttonText;

    @C09CT("is_need_pre_bind_verify")
    public Boolean isNeedPrebindVerify;

    @C09CT("is_need_pre_fetch_activate_url")
    public Boolean needPrefetchActivateUrl;

    @C09CT("note")
    public String note;

    @C09CT("schema")
    public String schema;

    @C09CT("supported_bind_commute_types")
    public List<CommuteInfo> supportedBindCommuteTypes;

    @C09CT("title")
    public String title;

    public BindInfo() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BindInfo)) {
            return false;
        }
        BindInfo bindInfo = (BindInfo) obj;
        return Intrinsics.LJFF(this.buttonText, bindInfo.buttonText) && Intrinsics.LJFF(this.note, bindInfo.note) && Intrinsics.LJFF(this.title, bindInfo.title) && Intrinsics.LJFF(this.schema, bindInfo.schema) && Intrinsics.LJFF(this.bindStatus, bindInfo.bindStatus) && Intrinsics.LJFF(this.needPrefetchActivateUrl, bindInfo.needPrefetchActivateUrl) && Intrinsics.LJFF(this.supportedBindCommuteTypes, bindInfo.supportedBindCommuteTypes) && Intrinsics.LJFF(this.isNeedPrebindVerify, bindInfo.isNeedPrebindVerify);
    }

    public final int hashCode() {
        String str = this.buttonText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.note;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.schema;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.bindStatus;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.needPrefetchActivateUrl;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<CommuteInfo> list = this.supportedBindCommuteTypes;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool2 = this.isNeedPrebindVerify;
        return iHashCode7 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BindInfo(buttonText=");
        sbLIZ.append(this.buttonText);
        sbLIZ.append(", note=");
        sbLIZ.append(this.note);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", bindStatus=");
        sbLIZ.append(this.bindStatus);
        sbLIZ.append(", needPrefetchActivateUrl=");
        sbLIZ.append(this.needPrefetchActivateUrl);
        sbLIZ.append(", supportedBindCommuteTypes=");
        sbLIZ.append(this.supportedBindCommuteTypes);
        sbLIZ.append(", isNeedPrebindVerify=");
        sbLIZ.append(this.isNeedPrebindVerify);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BindInfo(String str, String str2, String str3, String str4, String str5, Boolean bool, List<CommuteInfo> list, Boolean bool2) {
        this.buttonText = str;
        this.note = str2;
        this.title = str3;
        this.schema = str4;
        this.bindStatus = str5;
        this.needPrefetchActivateUrl = bool;
        this.supportedBindCommuteTypes = list;
        this.isNeedPrebindVerify = bool2;
    }
}
