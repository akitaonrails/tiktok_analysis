package com.ss.android.ugc.aweme.creative.model.stickers;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.stickers.PovItemInfo;
import com.ss.android.ugc.aweme.creative.model.stickers.PovModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PovModel implements Parcelable {
    public static final Parcelable.Creator<PovModel> CREATOR = new Parcelable.Creator<PovModel>() { // from class: X.0n5j
        @Override // android.os.Parcelable.Creator
        public final PovModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(PovItemInfo.CREATOR.createFromParcel(parcel));
                }
            }
            return new PovModel(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PovModel[] newArray(int i) {
            return new PovModel[i];
        }
    };

    @C09CT("media_path")
    public final String fileIdentifier;

    @C09CT("pov_list")
    public List<PovItemInfo> povList;

    public PovModel() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PovModel)) {
            return false;
        }
        PovModel povModel = (PovModel) obj;
        return Intrinsics.LJFF(this.fileIdentifier, povModel.fileIdentifier) && Intrinsics.LJFF(this.povList, povModel.povList);
    }

    public final int hashCode() {
        String str = this.fileIdentifier;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<PovItemInfo> list = this.povList;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PovModel(fileIdentifier=");
        sbLIZ.append(this.fileIdentifier);
        sbLIZ.append(", povList=");
        sbLIZ.append(this.povList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.fileIdentifier);
        List<PovItemInfo> list = this.povList;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<PovItemInfo> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public PovModel(String str, List<PovItemInfo> list) {
        this.fileIdentifier = str;
        this.povList = list;
    }
}
