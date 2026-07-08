package com.ss.android.ugc.aweme.external.router;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.external.router.AssetInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AssetInfo implements Parcelable {
    public static final Parcelable.Creator<AssetInfo> CREATOR = new Parcelable.Creator<AssetInfo>() { // from class: X.06Ah
        @Override // android.os.Parcelable.Creator
        public final AssetInfo createFromParcel(Parcel parcel) {
            return new AssetInfo(parcel.readString(), parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AssetInfo[] newArray(int i) {
            return new AssetInfo[i];
        }
    };

    @C09CT("ai_generated_source")
    public final String aiGenerateSource;

    @C09CT("asset_type")
    public final String type;

    @C09CT("urls")
    public final List<String> urls;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetInfo)) {
            return false;
        }
        AssetInfo assetInfo = (AssetInfo) obj;
        return Intrinsics.LJFF(this.type, assetInfo.type) && Intrinsics.LJFF(this.urls, assetInfo.urls) && Intrinsics.LJFF(this.aiGenerateSource, assetInfo.aiGenerateSource);
    }

    public final int hashCode() {
        String str = this.type;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.urls.hashCode()) * 31;
        String str2 = this.aiGenerateSource;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AssetInfo(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", urls=");
        sbLIZ.append(this.urls);
        sbLIZ.append(", aiGenerateSource=");
        sbLIZ.append(this.aiGenerateSource);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeStringList(this.urls);
        parcel.writeString(this.aiGenerateSource);
    }

    public AssetInfo() {
        this("", new ArrayList(), "");
    }

    public AssetInfo(String str, List<String> list, String str2) {
        this.type = str;
        this.urls = list;
        this.aiGenerateSource = str2;
    }
}
