package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ModelCard;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ModelInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ModelCard implements Parcelable {

    @C09CT("card_title")
    public final String cardTitle;

    @C09CT("color_property_id")
    public final String colorPropertyId;

    @C09CT("model_infos")
    public final List<ModelInfo> modelInfos;

    @C09CT("schema")
    public final String schema;

    @C09CT("title")
    public final String sizeInformationTitle;
    public static final Parcelable.Creator<ModelCard> CREATOR = new Parcelable.Creator<ModelCard>() { // from class: X.03vZ
        @Override // android.os.Parcelable.Creator
        public final ModelCard createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ModelInfo.CREATOR.createFromParcel(parcel));
                }
            }
            return new ModelCard(string, arrayList, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ModelCard[] newArray(int i) {
            return new ModelCard[i];
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
        if (!(obj instanceof ModelCard)) {
            return false;
        }
        ModelCard modelCard = (ModelCard) obj;
        return Intrinsics.LJFF(this.colorPropertyId, modelCard.colorPropertyId) && Intrinsics.LJFF(this.modelInfos, modelCard.modelInfos) && Intrinsics.LJFF(this.cardTitle, modelCard.cardTitle) && Intrinsics.LJFF(this.schema, modelCard.schema) && Intrinsics.LJFF(this.sizeInformationTitle, modelCard.sizeInformationTitle);
    }

    public final int hashCode() {
        String str = this.colorPropertyId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<ModelInfo> list = this.modelInfos;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.cardTitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.schema;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sizeInformationTitle;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ModelCard(colorPropertyId=");
        sbLIZ.append(this.colorPropertyId);
        sbLIZ.append(", modelInfos=");
        sbLIZ.append(this.modelInfos);
        sbLIZ.append(", cardTitle=");
        sbLIZ.append(this.cardTitle);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", sizeInformationTitle=");
        sbLIZ.append(this.sizeInformationTitle);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.colorPropertyId);
        List<ModelInfo> list = this.modelInfos;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ModelInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.cardTitle);
        parcel.writeString(this.schema);
        parcel.writeString(this.sizeInformationTitle);
    }

    public ModelCard(String str, List<ModelInfo> list, String str2, String str3, String str4) {
        this.colorPropertyId = str;
        this.modelInfos = list;
        this.cardTitle = str2;
        this.schema = str3;
        this.sizeInformationTitle = str4;
    }
}
