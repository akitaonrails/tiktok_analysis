package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class TemplateField implements Parcelable {

    @C09CT("field_data")
    public final TemplateFieldData fieldData;

    @C09CT("field_id")
    public final Long fieldId;

    @C09CT("field_name")
    public final String fieldName;

    @C09CT("field_type")
    public final Integer fieldType;
    public static final Parcelable.Creator<TemplateField> CREATOR = new Parcelable.Creator<TemplateField>() { // from class: X.0v8R
        @Override // android.os.Parcelable.Creator
        public final TemplateField createFromParcel(Parcel parcel) {
            Long lValueOf;
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new TemplateField(lValueOf, numValueOf, TemplateFieldData.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TemplateField[] newArray(int i) {
            return new TemplateField[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        Long l = this.fieldId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.fieldType;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.fieldData.hashCode()) * 31;
        String str = this.fieldName;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateField(fieldId=");
        sbLIZ.append(this.fieldId);
        sbLIZ.append(", fieldType=");
        sbLIZ.append(this.fieldType);
        sbLIZ.append(", fieldData=");
        sbLIZ.append(this.fieldData);
        sbLIZ.append(", fieldName=");
        sbLIZ.append(this.fieldName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.fieldId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Integer num = this.fieldType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        this.fieldData.writeToParcel(parcel, i);
        parcel.writeString(this.fieldName);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof TemplateField)) {
            TemplateField templateField = (TemplateField) obj;
            if (Intrinsics.LJFF(this.fieldId, templateField.fieldId) && Intrinsics.LJFF(this.fieldType, templateField.fieldType) && Intrinsics.LJFF(this.fieldData, templateField.fieldData) && Intrinsics.LJFF(this.fieldName, templateField.fieldName)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static TemplateField LIZ(TemplateField templateField, TemplateFieldData templateFieldData) {
        Long l = templateField.fieldId;
        Integer num = templateField.fieldType;
        String str = templateField.fieldName;
        templateField.getClass();
        return new TemplateField(l, num, templateFieldData, str);
    }

    public TemplateField(Long l, Integer num, TemplateFieldData templateFieldData, String str) {
        this.fieldId = l;
        this.fieldType = num;
        this.fieldData = templateFieldData;
        this.fieldName = str;
    }
}
