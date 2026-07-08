package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DefaultSelection;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultSelection implements Parcelable {

    @C09CT("default_pre_select_type")
    public final String defaultPreSelectType;

    @C09CT("image_is_preselected")
    public final Boolean imageIsPreselected;

    @C09CT("pdp_panel")
    public final Boolean pdpPanel;

    @C09CT("selected_props")
    public final List<String> selectedProps;

    @C09CT("sku_panel")
    public final Boolean skuPanel;
    public static final Parcelable.Creator<DefaultSelection> CREATOR = new Parcelable.Creator<DefaultSelection>() { // from class: X.03yu
        @Override // android.os.Parcelable.Creator
        public final DefaultSelection createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            boolean z2;
            Boolean boolValueOf2;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            boolean z3 = true;
            Boolean boolValueOf3 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z3 = false;
                }
                boolValueOf3 = Boolean.valueOf(z3);
            }
            return new DefaultSelection(arrayListCreateStringArrayList, boolValueOf, string, boolValueOf2, boolValueOf3);
        }

        @Override // android.os.Parcelable.Creator
        public final DefaultSelection[] newArray(int i) {
            return new DefaultSelection[i];
        }
    };
    public static final int $stable = 8;

    public DefaultSelection() {
        this(null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultSelection)) {
            return false;
        }
        DefaultSelection defaultSelection = (DefaultSelection) obj;
        return Intrinsics.LJFF(this.selectedProps, defaultSelection.selectedProps) && Intrinsics.LJFF(this.imageIsPreselected, defaultSelection.imageIsPreselected) && Intrinsics.LJFF(this.defaultPreSelectType, defaultSelection.defaultPreSelectType) && Intrinsics.LJFF(this.pdpPanel, defaultSelection.pdpPanel) && Intrinsics.LJFF(this.skuPanel, defaultSelection.skuPanel);
    }

    public final int hashCode() {
        List<String> list = this.selectedProps;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.imageIsPreselected;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.defaultPreSelectType;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.pdpPanel;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.skuPanel;
        return iHashCode4 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DefaultSelection(selectedProps=");
        sbLIZ.append(this.selectedProps);
        sbLIZ.append(", imageIsPreselected=");
        sbLIZ.append(this.imageIsPreselected);
        sbLIZ.append(", defaultPreSelectType=");
        sbLIZ.append(this.defaultPreSelectType);
        sbLIZ.append(", pdpPanel=");
        sbLIZ.append(this.pdpPanel);
        sbLIZ.append(", skuPanel=");
        sbLIZ.append(this.skuPanel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.selectedProps);
        Boolean bool = this.imageIsPreselected;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.defaultPreSelectType);
        Boolean bool2 = this.pdpPanel;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.skuPanel;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
    }

    public DefaultSelection(List<String> list, Boolean bool, String str, Boolean bool2, Boolean bool3) {
        this.selectedProps = list;
        this.imageIsPreselected = bool;
        this.defaultPreSelectType = str;
        this.pdpPanel = bool2;
        this.skuPanel = bool3;
    }
}
