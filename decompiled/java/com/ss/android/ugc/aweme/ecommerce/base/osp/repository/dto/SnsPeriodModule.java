package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsPeriodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsPeriodModule;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SnsPeriodModule implements Parcelable {

    @C09CT("sns_period_info_list")
    public List<SnsPeriodInfo> snsPeriodInfoList;

    @C09CT("title")
    public ECRichText title;

    @C09CT("un_selected_toast")
    public String unSelectedToast;
    public static final Parcelable.Creator<SnsPeriodModule> CREATOR = new Parcelable.Creator<SnsPeriodModule>() { // from class: X.02i0
        @Override // android.os.Parcelable.Creator
        public final SnsPeriodModule createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(SnsPeriodModule.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(SnsPeriodInfo.CREATOR.createFromParcel(parcel));
                }
            }
            return new SnsPeriodModule(eCRichText, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SnsPeriodModule[] newArray(int i) {
            return new SnsPeriodModule[i];
        }
    };
    public static final int $stable = 8;

    public SnsPeriodModule() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SnsPeriodModule)) {
            return false;
        }
        SnsPeriodModule snsPeriodModule = (SnsPeriodModule) obj;
        return Intrinsics.LJFF(this.title, snsPeriodModule.title) && Intrinsics.LJFF(this.snsPeriodInfoList, snsPeriodModule.snsPeriodInfoList) && Intrinsics.LJFF(this.unSelectedToast, snsPeriodModule.unSelectedToast);
    }

    public final int hashCode() {
        ECRichText eCRichText = this.title;
        int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
        List<SnsPeriodInfo> list = this.snsPeriodInfoList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.unSelectedToast;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SnsPeriodModule(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", snsPeriodInfoList=");
        sbLIZ.append(this.snsPeriodInfoList);
        sbLIZ.append(", unSelectedToast=");
        sbLIZ.append(this.unSelectedToast);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.title, i);
        List<SnsPeriodInfo> list = this.snsPeriodInfoList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<SnsPeriodInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.unSelectedToast);
    }

    public SnsPeriodModule(ECRichText eCRichText, List<SnsPeriodInfo> list, String str) {
        this.title = eCRichText;
        this.snsPeriodInfoList = list;
        this.unSelectedToast = str;
    }
}
