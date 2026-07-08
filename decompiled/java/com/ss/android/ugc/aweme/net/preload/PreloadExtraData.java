package com.ss.android.ugc.aweme.net.preload;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.net.preload.PreloadExtraData;
import com.ss.android.ugc.aweme.preload.PreloadExtraInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PreloadExtraData implements Parcelable {
    public static final Parcelable.Creator<PreloadExtraData> CREATOR = new Parcelable.Creator<PreloadExtraData>() { // from class: X.0hVX
        @Override // android.os.Parcelable.Creator
        public final PreloadExtraData createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            PreloadExtraInfo preloadExtraInfo = (PreloadExtraInfo) parcel.readParcelable(PreloadExtraData.class.getClassLoader());
            if (parcel.readInt() == 0) {
                z2 = false;
            }
            return new PreloadExtraData(z, preloadExtraInfo, z2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PreloadExtraData[] newArray(int i) {
            return new PreloadExtraData[i];
        }
    };
    public final boolean addPreloadParam;
    public final PreloadExtraInfo eventInfo;
    public final String preloadFlag;
    public final boolean supportChunk;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreloadExtraData)) {
            return false;
        }
        PreloadExtraData preloadExtraData = (PreloadExtraData) obj;
        return this.supportChunk == preloadExtraData.supportChunk && Intrinsics.LJFF(this.eventInfo, preloadExtraData.eventInfo) && this.addPreloadParam == preloadExtraData.addPreloadParam && Intrinsics.LJFF(this.preloadFlag, preloadExtraData.preloadFlag);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.supportChunk) * 31;
        PreloadExtraInfo preloadExtraInfo = this.eventInfo;
        int iHashCode = (((iZ2 + (preloadExtraInfo == null ? 0 : preloadExtraInfo.hashCode())) * 31) + C786410Ut5.Z2(this.addPreloadParam)) * 31;
        String str = this.preloadFlag;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreloadExtraData(supportChunk=");
        sbLIZ.append(this.supportChunk);
        sbLIZ.append(", eventInfo=");
        sbLIZ.append(this.eventInfo);
        sbLIZ.append(", addPreloadParam=");
        sbLIZ.append(this.addPreloadParam);
        sbLIZ.append(", preloadFlag=");
        sbLIZ.append(this.preloadFlag);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.supportChunk ? 1 : 0);
        parcel.writeParcelable(this.eventInfo, i);
        parcel.writeInt(this.addPreloadParam ? 1 : 0);
        parcel.writeString(this.preloadFlag);
    }

    public PreloadExtraData(boolean z, PreloadExtraInfo preloadExtraInfo, boolean z2, String str) {
        this.supportChunk = z;
        this.eventInfo = preloadExtraInfo;
        this.addPreloadParam = z2;
        this.preloadFlag = str;
    }

    public /* synthetic */ PreloadExtraData(boolean z, PreloadExtraInfo preloadExtraInfo, boolean z2, String str, int i) {
        this(z, (i & 2) != 0 ? null : preloadExtraInfo, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? null : str);
    }
}
