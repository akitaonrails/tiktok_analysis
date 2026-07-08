package com.ss.android.ugc.aweme.mvtheme.cutsame;

import X.C09HP;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.mvtheme.cutsame.CutSameParams;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class CutSameParams implements Parcelable {
    public String enterFrom;
    public int enterStyle;
    public Bundle extraBundle;
    public ArrayList<String> inputPathList;
    public boolean isEnterEditActivity;
    public String templateId;
    public static final C09HP Companion = new Object() { // from class: X.09HP
    };
    public static final Parcelable.Creator<CutSameParams> CREATOR = new Parcelable.Creator<CutSameParams>() { // from class: X.09HO
        @Override // android.os.Parcelable.Creator
        public final CutSameParams createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new CutSameParams(string, string2, i, arrayListCreateStringArrayList, z, parcel.readBundle(CutSameParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CutSameParams[] newArray(int i) {
            return new CutSameParams[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutSameParams)) {
            return false;
        }
        CutSameParams cutSameParams = (CutSameParams) obj;
        return Intrinsics.LJFF(this.templateId, cutSameParams.templateId) && Intrinsics.LJFF(this.enterFrom, cutSameParams.enterFrom) && this.enterStyle == cutSameParams.enterStyle && Intrinsics.LJFF(this.inputPathList, cutSameParams.inputPathList) && this.isEnterEditActivity == cutSameParams.isEnterEditActivity && Intrinsics.LJFF(this.extraBundle, cutSameParams.extraBundle);
    }

    public final int hashCode() {
        String str = this.templateId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.enterFrom;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.enterStyle) * 31;
        ArrayList<String> arrayList = this.inputPathList;
        return ((((iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.isEnterEditActivity)) * 31) + this.extraBundle.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CutSameParams(templateId=");
        sbLIZ.append(this.templateId);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(", enterStyle=");
        sbLIZ.append(this.enterStyle);
        sbLIZ.append(", inputPathList=");
        sbLIZ.append(this.inputPathList);
        sbLIZ.append(", isEnterEditActivity=");
        sbLIZ.append(this.isEnterEditActivity);
        sbLIZ.append(", extraBundle=");
        sbLIZ.append(this.extraBundle);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.templateId);
        parcel.writeString(this.enterFrom);
        parcel.writeInt(this.enterStyle);
        parcel.writeStringList(this.inputPathList);
        parcel.writeInt(this.isEnterEditActivity ? 1 : 0);
        parcel.writeBundle(this.extraBundle);
    }

    public CutSameParams(String str, String str2, int i, ArrayList<String> arrayList, boolean z, Bundle bundle) {
        this.templateId = str;
        this.enterFrom = str2;
        this.enterStyle = i;
        this.inputPathList = arrayList;
        this.isEnterEditActivity = z;
        this.extraBundle = bundle;
    }
}
