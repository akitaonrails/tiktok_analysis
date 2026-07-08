package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SkcInfo implements Parcelable {

    @C09CT("default_skc_id")
    public String defaultSkcId;

    @C09CT("mini_panel_schema")
    public String miniPanelSchema;

    @C09CT("skcs")
    public List<Skc> skcList;

    @C09CT("skc_property_id")
    public String skcPropertyId;
    public static final Parcelable.Creator<SkcInfo> CREATOR = new Parcelable.Creator<SkcInfo>() { // from class: X.02iY
        @Override // android.os.Parcelable.Creator
        public final SkcInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Skc.CREATOR.createFromParcel(parcel));
                }
            }
            return new SkcInfo(string, arrayList, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SkcInfo[] newArray(int i) {
            return new SkcInfo[i];
        }
    };
    public static final int $stable = 8;

    public SkcInfo() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkcInfo)) {
            return false;
        }
        SkcInfo skcInfo = (SkcInfo) obj;
        return Intrinsics.LJFF(this.skcPropertyId, skcInfo.skcPropertyId) && Intrinsics.LJFF(this.skcList, skcInfo.skcList) && Intrinsics.LJFF(this.miniPanelSchema, skcInfo.miniPanelSchema) && Intrinsics.LJFF(this.defaultSkcId, skcInfo.defaultSkcId);
    }

    public final int hashCode() {
        String str = this.skcPropertyId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Skc> list = this.skcList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.miniPanelSchema;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.defaultSkcId;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkcInfo(skcPropertyId=");
        sbLIZ.append(this.skcPropertyId);
        sbLIZ.append(", skcList=");
        sbLIZ.append(this.skcList);
        sbLIZ.append(", miniPanelSchema=");
        sbLIZ.append(this.miniPanelSchema);
        sbLIZ.append(", defaultSkcId=");
        sbLIZ.append(this.defaultSkcId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.skcPropertyId);
        List<Skc> list = this.skcList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Skc> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.miniPanelSchema);
        parcel.writeString(this.defaultSkcId);
    }

    public SkcInfo(String str, List<Skc> list, String str2, String str3) {
        this.skcPropertyId = str;
        this.skcList = list;
        this.miniPanelSchema = str2;
        this.defaultSkcId = str3;
    }
}
