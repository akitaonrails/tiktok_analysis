package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel;

import X.C004I;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class DistrictPickerState implements C004I {
    public static final int $stable = 8;
    public final List<Object> districtList;
    public final District selectedDistrict;
    public final int status;
    public final String title;
    public final String titleEn;

    public DistrictPickerState() {
        this(null, null, null, null, 0, 31, null);
    }

    public final DistrictPickerState copy(String str, String str2, List<? extends Object> list, District district, int i) {
        return new DistrictPickerState(str, str2, list, district, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DistrictPickerState)) {
            return false;
        }
        DistrictPickerState districtPickerState = (DistrictPickerState) obj;
        return Intrinsics.LJFF(this.title, districtPickerState.title) && Intrinsics.LJFF(this.titleEn, districtPickerState.titleEn) && Intrinsics.LJFF(this.districtList, districtPickerState.districtList) && Intrinsics.LJFF(this.selectedDistrict, districtPickerState.selectedDistrict) && this.status == districtPickerState.status;
    }

    public int hashCode() {
        int iHashCode = ((((this.title.hashCode() * 31) + this.titleEn.hashCode()) * 31) + this.districtList.hashCode()) * 31;
        District district = this.selectedDistrict;
        return ((iHashCode + (district == null ? 0 : district.hashCode())) * 31) + this.status;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DistrictPickerState(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", titleEn=");
        sbLIZ.append(this.titleEn);
        sbLIZ.append(", districtList=");
        sbLIZ.append(this.districtList);
        sbLIZ.append(", selectedDistrict=");
        sbLIZ.append(this.selectedDistrict);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<Object> getDistrictList() {
        return this.districtList;
    }

    public final District getSelectedDistrict() {
        return this.selectedDistrict;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleEn() {
        return this.titleEn;
    }

    public DistrictPickerState(String str, String str2, List<? extends Object> list, District district, int i) {
        this.title = str;
        this.titleEn = str2;
        this.districtList = list;
        this.selectedDistrict = district;
        this.status = i;
    }

    public DistrictPickerState(String str, String str2, List list, District district, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) == 0 ? str2 : "", (i2 & 4) != 0 ? C13BV.INSTANCE : list, (i2 & 8) != 0 ? null : district, (i2 & 16) != 0 ? -1 : i);
    }
}
