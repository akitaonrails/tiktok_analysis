package com.ss.android.ugc.aweme.creative.model.editorpro;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.editorpro.AlgoRaw;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class AlgoRaw implements Parcelable {
    public static final Parcelable.Creator<AlgoRaw> CREATOR = new Parcelable.Creator<AlgoRaw>() { // from class: X.0EsK
        @Override // android.os.Parcelable.Creator
        public final AlgoRaw createFromParcel(Parcel parcel) {
            return new AlgoRaw(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AlgoRaw[] newArray(int i) {
            return new AlgoRaw[i];
        }
    };

    @C09CT("req_json")
    public final String reqJson;

    @C09CT("req_key")
    public final String reqKey;

    public final AlgoRaw copy(String str, String str2) {
        return new AlgoRaw(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlgoRaw)) {
            return false;
        }
        AlgoRaw algoRaw = (AlgoRaw) obj;
        return Intrinsics.LJFF(this.reqKey, algoRaw.reqKey) && Intrinsics.LJFF(this.reqJson, algoRaw.reqJson);
    }

    public int hashCode() {
        return (this.reqKey.hashCode() * 31) + this.reqJson.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AlgoRaw(reqKey=");
        sbLIZ.append(this.reqKey);
        sbLIZ.append(", reqJson=");
        sbLIZ.append(this.reqJson);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.reqKey);
        parcel.writeString(this.reqJson);
    }

    public AlgoRaw() {
        this("", "");
    }

    public final String getReqJson() {
        return this.reqJson;
    }

    public final String getReqKey() {
        return this.reqKey;
    }

    public AlgoRaw(String str, String str2) {
        this.reqKey = str;
        this.reqJson = str2;
    }
}
