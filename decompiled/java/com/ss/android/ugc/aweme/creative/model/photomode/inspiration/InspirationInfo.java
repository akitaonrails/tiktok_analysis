package com.ss.android.ugc.aweme.creative.model.photomode.inspiration;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.photomode.inspiration.InspirationInfo;
import com.ss.android.ugc.aweme.creative.model.photomode.inspiration.InspirationTag;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class InspirationInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<InspirationInfo> CREATOR = new Parcelable.Creator<InspirationInfo>() { // from class: X.0ngC
        @Override // android.os.Parcelable.Creator
        public final InspirationInfo createFromParcel(Parcel parcel) {
            InspirationTag[] inspirationTagArr;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                inspirationTagArr = null;
            } else {
                int i = parcel.readInt();
                inspirationTagArr = new InspirationTag[i];
                for (int i2 = 0; i2 != i; i2++) {
                    inspirationTagArr[i2] = InspirationTag.CREATOR.createFromParcel(parcel);
                }
            }
            return new InspirationInfo(string, inspirationTagArr);
        }

        @Override // android.os.Parcelable.Creator
        public final InspirationInfo[] newArray(int i) {
            return new InspirationInfo[i];
        }
    };

    @C09CT("description")
    public final String description;

    @C09CT("inspiration_tag")
    public final InspirationTag[] inspirationTag;

    public InspirationInfo() {
        this(null, null);
    }

    public final InspirationInfo copy(String str, InspirationTag[] inspirationTagArr) {
        return new InspirationInfo(str, inspirationTagArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InspirationInfo(description=");
        sbLIZ.append(this.description);
        sbLIZ.append(", inspirationTag=");
        sbLIZ.append(Arrays.toString(this.inspirationTag));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.description);
        InspirationTag[] inspirationTagArr = this.inspirationTag;
        if (inspirationTagArr == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        int length = inspirationTagArr.length;
        parcel.writeInt(length);
        for (int i2 = 0; i2 != length; i2++) {
            inspirationTagArr[i2].writeToParcel(parcel, i);
        }
    }

    public int hashCode() {
        String str = this.description;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        InspirationTag[] inspirationTagArr = this.inspirationTag;
        return iHashCode + (inspirationTagArr != null ? Arrays.hashCode(inspirationTagArr) : 0);
    }

    public final String getDescription() {
        return this.description;
    }

    public final InspirationTag[] getInspirationTag() {
        return this.inspirationTag;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Class<?> cls = null;
        if (obj != null) {
            cls = obj.getClass();
        }
        if (!Intrinsics.LJFF(InspirationInfo.class, cls) || !(obj instanceof InspirationInfo) || obj == null) {
            return false;
        }
        InspirationInfo inspirationInfo = (InspirationInfo) obj;
        if (!Intrinsics.LJFF(this.description, inspirationInfo.description)) {
            return false;
        }
        InspirationTag[] inspirationTagArr = this.inspirationTag;
        if (inspirationTagArr != null) {
            InspirationTag[] inspirationTagArr2 = inspirationInfo.inspirationTag;
            if (inspirationTagArr2 == null || !Arrays.equals(inspirationTagArr, inspirationTagArr2)) {
                return false;
            }
        } else if (inspirationInfo.inspirationTag != null) {
            return false;
        }
        return true;
    }

    public InspirationInfo(String str, InspirationTag[] inspirationTagArr) {
        this.description = str;
        this.inspirationTag = inspirationTagArr;
    }
}
