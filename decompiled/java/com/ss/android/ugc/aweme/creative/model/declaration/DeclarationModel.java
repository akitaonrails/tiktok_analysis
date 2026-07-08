package com.ss.android.ugc.aweme.creative.model.declaration;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.declaration.DeclarationInfoStruct;
import com.ss.android.ugc.aweme.creative.model.declaration.DeclarationModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class DeclarationModel implements Parcelable {
    public static final Parcelable.Creator<DeclarationModel> CREATOR = new Parcelable.Creator<DeclarationModel>() { // from class: X.0n4i
        @Override // android.os.Parcelable.Creator
        public final DeclarationModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(DeclarationInfoStruct.CREATOR.createFromParcel(parcel));
                }
            }
            return new DeclarationModel(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final DeclarationModel[] newArray(int i) {
            return new DeclarationModel[i];
        }
    };

    @C09CT("declaration_info_list")
    public List<DeclarationInfoStruct> infoList;

    public DeclarationModel() {
        this(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeclarationModel) && Intrinsics.LJFF(this.infoList, ((DeclarationModel) obj).infoList);
    }

    public final int hashCode() {
        List<DeclarationInfoStruct> list = this.infoList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeclarationModel(infoList=");
        sbLIZ.append(this.infoList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<DeclarationInfoStruct> list = this.infoList;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<DeclarationInfoStruct> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public DeclarationModel(List<DeclarationInfoStruct> list) {
        this.infoList = list;
    }
}
