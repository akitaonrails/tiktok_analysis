package com.ss.android.ugc.airemix.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.airemix.model.AIRemixAwemeVideoData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AIRemixAwemeVideoData implements Parcelable {
    public static final Parcelable.Creator<AIRemixAwemeVideoData> CREATOR = new Parcelable.Creator<AIRemixAwemeVideoData>() { // from class: X.035E
        @Override // android.os.Parcelable.Creator
        public final AIRemixAwemeVideoData createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new AIRemixAwemeVideoData(string, z);
        }

        @Override // android.os.Parcelable.Creator
        public final AIRemixAwemeVideoData[] newArray(int i) {
            return new AIRemixAwemeVideoData[i];
        }
    };

    @C09CT("cover_url")
    public final String coverUrl;

    @C09CT("is_story")
    public final boolean isStory;

    public AIRemixAwemeVideoData() {
        this(null, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIRemixAwemeVideoData)) {
            return false;
        }
        AIRemixAwemeVideoData aIRemixAwemeVideoData = (AIRemixAwemeVideoData) obj;
        return Intrinsics.LJFF(this.coverUrl, aIRemixAwemeVideoData.coverUrl) && this.isStory == aIRemixAwemeVideoData.isStory;
    }

    public final int hashCode() {
        String str = this.coverUrl;
        return ((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.isStory);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIRemixAwemeVideoData(coverUrl=");
        sbLIZ.append(this.coverUrl);
        sbLIZ.append(", isStory=");
        sbLIZ.append(this.isStory);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.coverUrl);
        parcel.writeInt(this.isStory ? 1 : 0);
    }

    public AIRemixAwemeVideoData(String str, boolean z) {
        this.coverUrl = str;
        this.isStory = z;
    }
}
