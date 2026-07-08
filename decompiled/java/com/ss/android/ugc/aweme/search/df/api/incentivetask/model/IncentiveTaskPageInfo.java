package com.ss.android.ugc.aweme.search.df.api.incentivetask.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class IncentiveTaskPageInfo implements Serializable {

    @C09CT("main_title")
    public final String mainTitle;

    @C09CT("sub_title")
    public final String subTitle;

    @C09CT("task_card_desc")
    public final String taskCardDesc;

    @C09CT("task_finished_schema")
    public final String taskFinishedSchema;

    @C09CT("task_in_process_schema")
    public final String taskInProcessSchema;

    @C09CT("terms_url")
    public final String termsUrl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncentiveTaskPageInfo)) {
            return false;
        }
        IncentiveTaskPageInfo incentiveTaskPageInfo = (IncentiveTaskPageInfo) obj;
        return Intrinsics.LJFF(this.mainTitle, incentiveTaskPageInfo.mainTitle) && Intrinsics.LJFF(this.subTitle, incentiveTaskPageInfo.subTitle) && Intrinsics.LJFF(this.taskCardDesc, incentiveTaskPageInfo.taskCardDesc) && Intrinsics.LJFF(this.taskInProcessSchema, incentiveTaskPageInfo.taskInProcessSchema) && Intrinsics.LJFF(this.taskFinishedSchema, incentiveTaskPageInfo.taskFinishedSchema) && Intrinsics.LJFF(this.termsUrl, incentiveTaskPageInfo.termsUrl);
    }

    public int hashCode() {
        String str = this.mainTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.taskCardDesc;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.taskInProcessSchema;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.taskFinishedSchema;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.termsUrl;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IncentiveTaskPageInfo(mainTitle=");
        sbLIZ.append(this.mainTitle);
        sbLIZ.append(", subTitle=");
        sbLIZ.append(this.subTitle);
        sbLIZ.append(", taskCardDesc=");
        sbLIZ.append(this.taskCardDesc);
        sbLIZ.append(", taskInProcessSchema=");
        sbLIZ.append(this.taskInProcessSchema);
        sbLIZ.append(", taskFinishedSchema=");
        sbLIZ.append(this.taskFinishedSchema);
        sbLIZ.append(", termsUrl=");
        sbLIZ.append(this.termsUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IncentiveTaskPageInfo() {
        this("", "", "", "", "", "");
    }

    public IncentiveTaskPageInfo(String str, String str2, String str3, String str4, String str5, String str6) {
        this.mainTitle = str;
        this.subTitle = str2;
        this.taskCardDesc = str3;
        this.taskInProcessSchema = str4;
        this.taskFinishedSchema = str5;
        this.termsUrl = str6;
    }
}
