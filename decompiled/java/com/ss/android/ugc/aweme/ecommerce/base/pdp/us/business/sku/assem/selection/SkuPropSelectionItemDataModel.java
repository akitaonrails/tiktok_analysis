package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection;

import X.C033W;
import X.C03T5;
import X.C09CT;
import X.C0NJ1;
import X.C0NJ9;
import X.C13LQ;
import X.C1405970mgt;
import X.C2188811AlT;
import X.InterfaceC718502rH;
import X.InterfaceC746802vq;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.goda.v2.model.dto.GodaV2Style;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.Prop;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.PropButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.SkuPropSelectionItemDataModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class SkuPropSelectionItemDataModel implements Parcelable, InterfaceC718502rH {

    @C09CT("cell_style")
    public final GodaV2Style cellStyle;

    @C09CT("delimiter")
    public final String delimiter;

    @C09CT("is_selection_required")
    public final Boolean isSelectionRequired;

    @C09CT("layout_type")
    public final Integer layoutType;

    @C09CT("prop_button")
    public final PropButton propButton;

    @C09CT("props")
    public final List<Prop> props;

    @C09CT("should_show_text")
    public final Boolean shouldShowText;
    public static final Parcelable.Creator<SkuPropSelectionItemDataModel> CREATOR = new Parcelable.Creator<SkuPropSelectionItemDataModel>() { // from class: X.0mgb
        @Override // android.os.Parcelable.Creator
        public final SkuPropSelectionItemDataModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            PropButton propButtonCreateFromParcel;
            Integer numValueOf;
            boolean z;
            Boolean boolValueOf;
            boolean z2 = false;
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Prop.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                propButtonCreateFromParcel = null;
            } else {
                propButtonCreateFromParcel = PropButton.CREATOR.createFromParcel(parcel);
            }
            PropButton propButton = propButtonCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            GodaV2Style godaV2Style = (GodaV2Style) parcel.readParcelable(SkuPropSelectionItemDataModel.class.getClassLoader());
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
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            return new SkuPropSelectionItemDataModel(arrayList, propButton, string, numValueOf, godaV2Style, boolValueOf, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final SkuPropSelectionItemDataModel[] newArray(int i) {
            return new SkuPropSelectionItemDataModel[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuPropSelectionItemDataModel)) {
            return false;
        }
        SkuPropSelectionItemDataModel skuPropSelectionItemDataModel = (SkuPropSelectionItemDataModel) obj;
        return Intrinsics.LJFF(this.props, skuPropSelectionItemDataModel.props) && Intrinsics.LJFF(this.propButton, skuPropSelectionItemDataModel.propButton) && Intrinsics.LJFF(this.delimiter, skuPropSelectionItemDataModel.delimiter) && Intrinsics.LJFF(this.layoutType, skuPropSelectionItemDataModel.layoutType) && Intrinsics.LJFF(this.cellStyle, skuPropSelectionItemDataModel.cellStyle) && Intrinsics.LJFF(this.shouldShowText, skuPropSelectionItemDataModel.shouldShowText) && Intrinsics.LJFF(this.isSelectionRequired, skuPropSelectionItemDataModel.isSelectionRequired);
    }

    public final int hashCode() {
        List<Prop> list = this.props;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        PropButton propButton = this.propButton;
        int iHashCode2 = (iHashCode + (propButton == null ? 0 : propButton.hashCode())) * 31;
        String str = this.delimiter;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.layoutType;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        GodaV2Style godaV2Style = this.cellStyle;
        int iHashCode5 = (iHashCode4 + (godaV2Style == null ? 0 : godaV2Style.hashCode())) * 31;
        Boolean bool = this.shouldShowText;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isSelectionRequired;
        return iHashCode6 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkuPropSelectionItemDataModel(props=");
        sbLIZ.append(this.props);
        sbLIZ.append(", propButton=");
        sbLIZ.append(this.propButton);
        sbLIZ.append(", delimiter=");
        sbLIZ.append(this.delimiter);
        sbLIZ.append(", layoutType=");
        sbLIZ.append(this.layoutType);
        sbLIZ.append(", cellStyle=");
        sbLIZ.append(this.cellStyle);
        sbLIZ.append(", shouldShowText=");
        sbLIZ.append(this.shouldShowText);
        sbLIZ.append(", isSelectionRequired=");
        sbLIZ.append(this.isSelectionRequired);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<Prop> list = this.props;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Prop> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        PropButton propButton = this.propButton;
        if (propButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            propButton.writeToParcel(parcel, i);
        }
        parcel.writeString(this.delimiter);
        Integer num = this.layoutType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeParcelable(this.cellStyle, i);
        Boolean bool = this.shouldShowText;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isSelectionRequired;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    @Override // X.InterfaceC718502rH
    public final List<InterfaceC746802vq> LIZ(C033W c033w) {
        Object[] objArr;
        C0NJ9 c0nj9LJ;
        Object obj = c033w.LIZIZ.get(C0NJ1.class);
        if (!(obj instanceof C0NJ1)) {
            obj = null;
        }
        C0NJ1 c0nj1 = (C0NJ1) obj;
        if (c0nj1 == null || (c0nj9LJ = c0nj1.LJ()) == null || (objArr = (Object[]) c0nj9LJ.LIZIZ(new String[0], "checked_sku_ids")) == null) {
            objArr = new String[0];
        }
        C03T5.LIZ.getClass();
        return Collections.singletonList(new C1405970mgt(this.props, this.propButton, this.delimiter, this.layoutType, this.cellStyle, this.shouldShowText, this.isSelectionRequired, C13LQ.LJJLL(objArr), C03T5.LIZIZ()));
    }

    public SkuPropSelectionItemDataModel(List<Prop> list, PropButton propButton, String str, Integer num, GodaV2Style godaV2Style, Boolean bool, Boolean bool2) {
        this.props = list;
        this.propButton = propButton;
        this.delimiter = str;
        this.layoutType = num;
        this.cellStyle = godaV2Style;
        this.shouldShowText = bool;
        this.isSelectionRequired = bool2;
    }
}
