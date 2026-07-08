package com.ss.android.ugc.gamora.editor.sticker.pov.api;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.gamora.editor.sticker.pov.api.PovRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class PovRequest implements Parcelable {
    public static final Parcelable.Creator<PovRequest> CREATOR = new Parcelable.Creator<PovRequest>() { // from class: X.0NTc
        @Override // android.os.Parcelable.Creator
        public final PovRequest createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new PovRequest(string, numValueOf, numValueOf2, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PovRequest[] newArray(int i) {
            return new PovRequest[i];
        }
    };

    @C09CT("blip_scene")
    public final String blipScene;

    @C09CT("generate_type")
    public final Integer generateType;

    @C09CT("model_scene")
    public final String modelScene;

    @C09CT("size")
    public final Integer pageSize;

    @C09CT("uri")
    public final String uri;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PovRequest)) {
            return false;
        }
        PovRequest povRequest = (PovRequest) obj;
        return Intrinsics.LJFF(this.uri, povRequest.uri) && Intrinsics.LJFF(this.pageSize, povRequest.pageSize) && Intrinsics.LJFF(this.generateType, povRequest.generateType) && Intrinsics.LJFF(this.blipScene, povRequest.blipScene) && Intrinsics.LJFF(this.modelScene, povRequest.modelScene);
    }

    public final int hashCode() {
        String str = this.uri;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.pageSize;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.generateType;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.blipScene;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.modelScene;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PovRequest(uri=");
        sbLIZ.append(this.uri);
        sbLIZ.append(", pageSize=");
        sbLIZ.append(this.pageSize);
        sbLIZ.append(", generateType=");
        sbLIZ.append(this.generateType);
        sbLIZ.append(", blipScene=");
        sbLIZ.append(this.blipScene);
        sbLIZ.append(", modelScene=");
        sbLIZ.append(this.modelScene);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uri);
        Integer num = this.pageSize;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.generateType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.blipScene);
        parcel.writeString(this.modelScene);
    }

    public PovRequest(String str, Integer num, Integer num2, String str2, String str3) {
        this.uri = str;
        this.pageSize = num;
        this.generateType = num2;
        this.blipScene = str2;
        this.modelScene = str3;
    }
}
