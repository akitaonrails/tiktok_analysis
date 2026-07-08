package com.ss.android.ugc.aweme.poi.mapdetail.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiFeedCenterRecallArea implements Serializable {

    @C09CT("center_id")
    public final String centerId;

    @C09CT("display_text")
    public final String displayText;

    @C09CT("is_selected")
    public final Boolean isSelected;

    @C09CT("recall_radius_meter")
    public final Integer recallRadiusMeter;

    @C09CT("recall_type")
    public final Integer recallType;

    @C09CT("recall_type_desc")
    public final String recallTypeDesc;

    public PoiFeedCenterRecallArea() {
        this(null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiFeedCenterRecallArea)) {
            return false;
        }
        PoiFeedCenterRecallArea poiFeedCenterRecallArea = (PoiFeedCenterRecallArea) obj;
        return Intrinsics.LJFF(this.recallType, poiFeedCenterRecallArea.recallType) && Intrinsics.LJFF(this.centerId, poiFeedCenterRecallArea.centerId) && Intrinsics.LJFF(this.recallRadiusMeter, poiFeedCenterRecallArea.recallRadiusMeter) && Intrinsics.LJFF(this.displayText, poiFeedCenterRecallArea.displayText) && Intrinsics.LJFF(this.recallTypeDesc, poiFeedCenterRecallArea.recallTypeDesc) && Intrinsics.LJFF(this.isSelected, poiFeedCenterRecallArea.isSelected);
    }

    public int hashCode() {
        Integer num = this.recallType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.centerId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.recallRadiusMeter;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.displayText;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.recallTypeDesc;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isSelected;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiFeedCenterRecallArea(recallType=");
        sbLIZ.append(this.recallType);
        sbLIZ.append(", centerId=");
        sbLIZ.append(this.centerId);
        sbLIZ.append(", recallRadiusMeter=");
        sbLIZ.append(this.recallRadiusMeter);
        sbLIZ.append(", displayText=");
        sbLIZ.append(this.displayText);
        sbLIZ.append(", recallTypeDesc=");
        sbLIZ.append(this.recallTypeDesc);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.isSelected);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean isSelected() {
        return this.isSelected;
    }

    public PoiFeedCenterRecallArea(Integer num, String str, Integer num2, String str2, String str3, Boolean bool) {
        this.recallType = num;
        this.centerId = str;
        this.recallRadiusMeter = num2;
        this.displayText = str2;
        this.recallTypeDesc = str3;
        this.isSelected = bool;
    }
}
