package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel;

import X.C004I;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class DistrictPickerWrapperState implements C004I {
    public static final int $stable = 8;
    public final boolean close;
    public final boolean done;
    public final boolean physicalBack;
    public final List<Region> selectedRegions;
    public final boolean titleBarBack;

    public DistrictPickerWrapperState() {
        this(false, false, false, false, null, 31, null);
    }

    public final DistrictPickerWrapperState copy(boolean z, boolean z2, boolean z3, boolean z4, List<Region> list) {
        return new DistrictPickerWrapperState(z, z2, z3, z4, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DistrictPickerWrapperState)) {
            return false;
        }
        DistrictPickerWrapperState districtPickerWrapperState = (DistrictPickerWrapperState) obj;
        return this.done == districtPickerWrapperState.done && this.close == districtPickerWrapperState.close && this.titleBarBack == districtPickerWrapperState.titleBarBack && this.physicalBack == districtPickerWrapperState.physicalBack && Intrinsics.LJFF(this.selectedRegions, districtPickerWrapperState.selectedRegions);
    }

    public int hashCode() {
        return (((((((C786410Ut5.Z2(this.done) * 31) + C786410Ut5.Z2(this.close)) * 31) + C786410Ut5.Z2(this.titleBarBack)) * 31) + C786410Ut5.Z2(this.physicalBack)) * 31) + this.selectedRegions.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DistrictPickerWrapperState(done=");
        sbLIZ.append(this.done);
        sbLIZ.append(", close=");
        sbLIZ.append(this.close);
        sbLIZ.append(", titleBarBack=");
        sbLIZ.append(this.titleBarBack);
        sbLIZ.append(", physicalBack=");
        sbLIZ.append(this.physicalBack);
        sbLIZ.append(", selectedRegions=");
        sbLIZ.append(this.selectedRegions);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getClose() {
        return this.close;
    }

    public final boolean getDone() {
        return this.done;
    }

    public final boolean getPhysicalBack() {
        return this.physicalBack;
    }

    public final List<Region> getSelectedRegions() {
        return this.selectedRegions;
    }

    public final boolean getTitleBarBack() {
        return this.titleBarBack;
    }

    public DistrictPickerWrapperState(boolean z, boolean z2, boolean z3, boolean z4, List<Region> list) {
        this.done = z;
        this.close = z2;
        this.titleBarBack = z3;
        this.physicalBack = z4;
        this.selectedRegions = list;
    }

    public DistrictPickerWrapperState(boolean z, boolean z2, boolean z3, boolean z4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) == 0 ? z4 : false, (i & 16) != 0 ? C13BV.INSTANCE : list);
    }
}
