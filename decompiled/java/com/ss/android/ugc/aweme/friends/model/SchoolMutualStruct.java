package com.ss.android.ugc.aweme.friends.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SchoolMutualStruct implements Serializable {

    @C09CT("anchor")
    public String anchor;

    @C09CT("button")
    public String button;

    @C09CT("popup_config")
    public SchoolPopupConfig popupConfig;

    @C09CT("school_content_type")
    public int schoolContentType;

    @C09CT("school_id")
    public String schoolId;

    @C09CT("school_name")
    public String schoolName;

    @C09CT("total")
    public int total;

    @C09CT("user_list")
    public List<MutualUser> userList;

    @C09CT("viewer_verify_status")
    public int viewerVerifyStatus;

    public SchoolMutualStruct() {
        this(null, 0, null, null, null, null, 0, 0, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchoolMutualStruct)) {
            return false;
        }
        SchoolMutualStruct schoolMutualStruct = (SchoolMutualStruct) obj;
        return Intrinsics.LJFF(this.userList, schoolMutualStruct.userList) && this.total == schoolMutualStruct.total && Intrinsics.LJFF(this.anchor, schoolMutualStruct.anchor) && Intrinsics.LJFF(this.button, schoolMutualStruct.button) && Intrinsics.LJFF(this.schoolName, schoolMutualStruct.schoolName) && Intrinsics.LJFF(this.schoolId, schoolMutualStruct.schoolId) && this.viewerVerifyStatus == schoolMutualStruct.viewerVerifyStatus && this.schoolContentType == schoolMutualStruct.schoolContentType && Intrinsics.LJFF(this.popupConfig, schoolMutualStruct.popupConfig);
    }

    public int hashCode() {
        List<MutualUser> list = this.userList;
        int iHashCode = (((list == null ? 0 : list.hashCode()) * 31) + this.total) * 31;
        String str = this.anchor;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.button;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.schoolName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.schoolId;
        int iHashCode5 = (((((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.viewerVerifyStatus) * 31) + this.schoolContentType) * 31;
        SchoolPopupConfig schoolPopupConfig = this.popupConfig;
        return iHashCode5 + (schoolPopupConfig != null ? schoolPopupConfig.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SchoolMutualStruct(userList=");
        sbLIZ.append(this.userList);
        sbLIZ.append(", total=");
        sbLIZ.append(this.total);
        sbLIZ.append(", anchor=");
        sbLIZ.append(this.anchor);
        sbLIZ.append(", button=");
        sbLIZ.append(this.button);
        sbLIZ.append(", schoolName=");
        sbLIZ.append(this.schoolName);
        sbLIZ.append(", schoolId=");
        sbLIZ.append(this.schoolId);
        sbLIZ.append(", viewerVerifyStatus=");
        sbLIZ.append(this.viewerVerifyStatus);
        sbLIZ.append(", schoolContentType=");
        sbLIZ.append(this.schoolContentType);
        sbLIZ.append(", popupConfig=");
        sbLIZ.append(this.popupConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SchoolMutualStruct(List<MutualUser> list, int i, String str, String str2, String str3, String str4, int i2, int i3, SchoolPopupConfig schoolPopupConfig) {
        this.userList = list;
        this.total = i;
        this.anchor = str;
        this.button = str2;
        this.schoolName = str3;
        this.schoolId = str4;
        this.viewerVerifyStatus = i2;
        this.schoolContentType = i3;
        this.popupConfig = schoolPopupConfig;
    }
}
