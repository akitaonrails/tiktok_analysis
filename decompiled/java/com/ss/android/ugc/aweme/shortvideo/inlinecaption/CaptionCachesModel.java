package com.ss.android.ugc.aweme.shortvideo.inlinecaption;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionCachesModel;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionQueryInfo;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class CaptionCachesModel implements Parcelable {
    public static final Parcelable.Creator<CaptionCachesModel> CREATOR = new Parcelable.Creator<CaptionCachesModel>() { // from class: X.0EQp
        @Override // android.os.Parcelable.Creator
        public final CaptionCachesModel createFromParcel(Parcel parcel) {
            CaptionQueryInfo captionQueryInfoCreateFromParcel;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                captionQueryInfoCreateFromParcel = null;
            } else {
                captionQueryInfoCreateFromParcel = CaptionQueryInfo.CREATOR.createFromParcel(parcel);
            }
            CaptionQueryInfo captionQueryInfo = captionQueryInfoCreateFromParcel;
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(CaptionUtterance.CREATOR.createFromParcel(parcel));
                }
            }
            return new CaptionCachesModel(captionQueryInfo, parcel.readString(), arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CaptionCachesModel[] newArray(int i) {
            return new CaptionCachesModel[i];
        }
    };
    public CaptionQueryInfo captionQueryInfo;
    public ArrayList<CaptionUtterance> captionsList;
    public String recognizedLanguage;

    /* JADX WARN: Multi-variable type inference failed */
    public CaptionCachesModel() {
        this((CaptionQueryInfo) null, (ArrayList) (0 == true ? 1 : 0), 7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CaptionCachesModel)) {
            return false;
        }
        CaptionCachesModel captionCachesModel = (CaptionCachesModel) obj;
        return Intrinsics.LJFF(this.captionQueryInfo, captionCachesModel.captionQueryInfo) && Intrinsics.LJFF(this.captionsList, captionCachesModel.captionsList) && Intrinsics.LJFF(this.recognizedLanguage, captionCachesModel.recognizedLanguage);
    }

    public final int hashCode() {
        CaptionQueryInfo captionQueryInfo = this.captionQueryInfo;
        int iHashCode = (captionQueryInfo == null ? 0 : captionQueryInfo.hashCode()) * 31;
        ArrayList<CaptionUtterance> arrayList = this.captionsList;
        int iHashCode2 = (iHashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        String str = this.recognizedLanguage;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptionCachesModel(captionQueryInfo=");
        sbLIZ.append(this.captionQueryInfo);
        sbLIZ.append(", captionsList=");
        sbLIZ.append(this.captionsList);
        sbLIZ.append(", recognizedLanguage=");
        sbLIZ.append(this.recognizedLanguage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CaptionQueryInfo captionQueryInfo = this.captionQueryInfo;
        if (captionQueryInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            captionQueryInfo.writeToParcel(parcel, i);
        }
        ArrayList<CaptionUtterance> arrayList = this.captionsList;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<CaptionUtterance> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.recognizedLanguage);
    }

    public /* synthetic */ CaptionCachesModel(CaptionQueryInfo captionQueryInfo, ArrayList arrayList, int i) {
        this((i & 1) != 0 ? null : captionQueryInfo, (String) null, (i & 2) != 0 ? null : arrayList);
    }

    public CaptionCachesModel(CaptionQueryInfo captionQueryInfo, String str, ArrayList arrayList) {
        this.captionQueryInfo = captionQueryInfo;
        this.captionsList = arrayList;
        this.recognizedLanguage = str;
    }
}
