package com.ss.android.ugc.aweme.shortvideo.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class DuetAndStitchRouterConfig implements Parcelable {
    public static final Parcelable.Creator<DuetAndStitchRouterConfig> CREATOR = new Creator();

    @C09CT("anchors")
    public final List<TransAnchorData> anchors;

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("enter_method")
    public final String enterMethod;

    @C09CT("is_ecommerce")
    public final boolean isEcommerce;

    @C09CT("type")
    public final String type;

    public static final class Creator implements Parcelable.Creator<DuetAndStitchRouterConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DuetAndStitchRouterConfig createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(TransAnchorData.CREATOR.createFromParcel(parcel));
                }
            }
            return new DuetAndStitchRouterConfig(string, string2, arrayList, parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DuetAndStitchRouterConfig[] newArray(int i) {
            return new DuetAndStitchRouterConfig[i];
        }
    }

    public DuetAndStitchRouterConfig() {
        this("", "", null, "", "", false);
    }

    public final DuetAndStitchRouterConfig copy(String str, String str2, List<TransAnchorData> list, String str3, String str4, boolean z) {
        return new DuetAndStitchRouterConfig(str, str2, list, str3, str4, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DuetAndStitchRouterConfig)) {
            return false;
        }
        DuetAndStitchRouterConfig duetAndStitchRouterConfig = (DuetAndStitchRouterConfig) obj;
        return Intrinsics.LJFF(this.type, duetAndStitchRouterConfig.type) && Intrinsics.LJFF(this.awemeId, duetAndStitchRouterConfig.awemeId) && Intrinsics.LJFF(this.anchors, duetAndStitchRouterConfig.anchors) && Intrinsics.LJFF(this.enterFrom, duetAndStitchRouterConfig.enterFrom) && Intrinsics.LJFF(this.enterMethod, duetAndStitchRouterConfig.enterMethod) && this.isEcommerce == duetAndStitchRouterConfig.isEcommerce;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.awemeId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<TransAnchorData> list = this.anchors;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.enterFrom;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.enterMethod;
        return ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.isEcommerce);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DuetAndStitchRouterConfig(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", awemeId=");
        sbLIZ.append(this.awemeId);
        sbLIZ.append(", anchors=");
        sbLIZ.append(this.anchors);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.enterMethod);
        sbLIZ.append(", isEcommerce=");
        sbLIZ.append(this.isEcommerce);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeString(this.awemeId);
        List<TransAnchorData> list = this.anchors;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<TransAnchorData> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.enterMethod);
        parcel.writeInt(this.isEcommerce ? 1 : 0);
    }

    public final List<TransAnchorData> getAnchors() {
        return this.anchors;
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final String getType() {
        return this.type;
    }

    public final boolean isEcommerce() {
        return this.isEcommerce;
    }

    public DuetAndStitchRouterConfig(String str, String str2, List<TransAnchorData> list, String str3, String str4, boolean z) {
        this.type = str;
        this.awemeId = str2;
        this.anchors = list;
        this.enterFrom = str3;
        this.enterMethod = str4;
        this.isEcommerce = z;
    }
}
