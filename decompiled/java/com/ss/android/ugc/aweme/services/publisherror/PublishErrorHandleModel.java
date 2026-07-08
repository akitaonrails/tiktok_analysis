package com.ss.android.ugc.aweme.services.publisherror;

import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PublishErrorHandleModel {
    public final List<Integer> awemeTypes;
    public final String btnAction;
    public final String btnText;
    public final int btnType;
    public final String content;
    public final Integer contentPlural;
    public final List<String> errors;
    public final List<String> regions;
    public final List<Integer> retryCount;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublishErrorHandleModel)) {
            return false;
        }
        PublishErrorHandleModel publishErrorHandleModel = (PublishErrorHandleModel) obj;
        return Intrinsics.LJFF(this.awemeTypes, publishErrorHandleModel.awemeTypes) && Intrinsics.LJFF(this.regions, publishErrorHandleModel.regions) && Intrinsics.LJFF(this.errors, publishErrorHandleModel.errors) && Intrinsics.LJFF(this.retryCount, publishErrorHandleModel.retryCount) && Intrinsics.LJFF(this.content, publishErrorHandleModel.content) && Intrinsics.LJFF(this.contentPlural, publishErrorHandleModel.contentPlural) && this.btnType == publishErrorHandleModel.btnType && Intrinsics.LJFF(this.btnText, publishErrorHandleModel.btnText) && Intrinsics.LJFF(this.btnAction, publishErrorHandleModel.btnAction);
    }

    public int hashCode() {
        List<Integer> list = this.awemeTypes;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.regions;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.errors;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<Integer> list4 = this.retryCount;
        int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str = this.content;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.contentPlural;
        int iHashCode6 = (((iHashCode5 + (num == null ? 0 : num.hashCode())) * 31) + this.btnType) * 31;
        String str2 = this.btnText;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.btnAction;
        return iHashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishErrorHandleModel(awemeTypes=");
        sbLIZ.append(this.awemeTypes);
        sbLIZ.append(", regions=");
        sbLIZ.append(this.regions);
        sbLIZ.append(", errors=");
        sbLIZ.append(this.errors);
        sbLIZ.append(", retryCount=");
        sbLIZ.append(this.retryCount);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", contentPlural=");
        sbLIZ.append(this.contentPlural);
        sbLIZ.append(", btnType=");
        sbLIZ.append(this.btnType);
        sbLIZ.append(", btnText=");
        sbLIZ.append(this.btnText);
        sbLIZ.append(", btnAction=");
        sbLIZ.append(this.btnAction);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PublishErrorHandleModel(List<Integer> list, List<String> list2, List<String> list3, List<Integer> list4, String str, Integer num, int i, String str2, String str3) {
        this.awemeTypes = list;
        this.regions = list2;
        this.errors = list3;
        this.retryCount = list4;
        this.content = str;
        this.contentPlural = num;
        this.btnType = i;
        this.btnText = str2;
        this.btnAction = str3;
    }
}
