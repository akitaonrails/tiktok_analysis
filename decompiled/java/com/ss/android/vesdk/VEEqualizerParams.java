package com.ss.android.vesdk;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.vesdk.VEEqualizerParams;

/* JADX INFO: loaded from: classes2.dex */
public class VEEqualizerParams implements Parcelable {
    public static final Parcelable.Creator<VEEqualizerParams> CREATOR = new Parcelable.Creator<VEEqualizerParams>() { // from class: X.02xu
        @Override // android.os.Parcelable.Creator
        public final VEEqualizerParams createFromParcel(Parcel parcel) {
            return new VEEqualizerParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final VEEqualizerParams[] newArray(int i) {
            return new VEEqualizerParams[i];
        }
    };
    public float amp1000;
    public float amp125;
    public float amp16000;
    public float amp2000;
    public float amp250;
    public float amp31;
    public float amp4000;
    public float amp500;
    public float amp63;
    public float amp8000;
    public float freqWidth1000;
    public float freqWidth125;
    public float freqWidth16000;
    public float freqWidth2000;
    public float freqWidth250;
    public float freqWidth31;
    public float freqWidth4000;
    public float freqWidth500;
    public float freqWidth63;
    public float freqWidth8000;
    public String name;
    public float preamp;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public VEEqualizerParams() {
        this.name = "";
        this.preamp = 12.0f;
        this.freqWidth31 = 1.0f;
        this.freqWidth63 = 1.0f;
        this.freqWidth125 = 1.0f;
        this.freqWidth250 = 1.0f;
        this.freqWidth500 = 1.0f;
        this.freqWidth1000 = 1.0f;
        this.freqWidth2000 = 1.0f;
        this.freqWidth4000 = 1.0f;
        this.freqWidth8000 = 1.0f;
        this.freqWidth16000 = 1.0f;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEEqualizerParams{name='");
        sbLIZ.append(this.name);
        sbLIZ.append('\'');
        sbLIZ.append(", preamp=");
        sbLIZ.append(this.preamp);
        sbLIZ.append(", amp31=");
        sbLIZ.append(this.amp31);
        sbLIZ.append(", amp63=");
        sbLIZ.append(this.amp63);
        sbLIZ.append(", amp125=");
        sbLIZ.append(this.amp125);
        sbLIZ.append(", amp250=");
        sbLIZ.append(this.amp250);
        sbLIZ.append(", amp500=");
        sbLIZ.append(this.amp500);
        sbLIZ.append(", amp1000=");
        sbLIZ.append(this.amp1000);
        sbLIZ.append(", amp2000=");
        sbLIZ.append(this.amp2000);
        sbLIZ.append(", amp4000=");
        sbLIZ.append(this.amp4000);
        sbLIZ.append(", amp8000=");
        sbLIZ.append(this.amp8000);
        sbLIZ.append(", amp16000=");
        sbLIZ.append(this.amp16000);
        sbLIZ.append(", freqWidth31=");
        sbLIZ.append(this.freqWidth31);
        sbLIZ.append(", freqWidth63=");
        sbLIZ.append(this.freqWidth63);
        sbLIZ.append(", freqWidth125=");
        sbLIZ.append(this.freqWidth125);
        sbLIZ.append(", freqWidth250=");
        sbLIZ.append(this.freqWidth250);
        sbLIZ.append(", freqWidth500=");
        sbLIZ.append(this.freqWidth500);
        sbLIZ.append(", freqWidth1000=");
        sbLIZ.append(this.freqWidth1000);
        sbLIZ.append(", freqWidth2000=");
        sbLIZ.append(this.freqWidth2000);
        sbLIZ.append(", freqWidth4000=");
        sbLIZ.append(this.freqWidth4000);
        sbLIZ.append(", freqWidth8000=");
        sbLIZ.append(this.freqWidth8000);
        sbLIZ.append(", freqWidth16000=");
        sbLIZ.append(this.freqWidth16000);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VEEqualizerParams(Parcel parcel) {
        this.name = "";
        this.preamp = 12.0f;
        this.freqWidth31 = 1.0f;
        this.freqWidth63 = 1.0f;
        this.freqWidth125 = 1.0f;
        this.freqWidth250 = 1.0f;
        this.freqWidth500 = 1.0f;
        this.freqWidth1000 = 1.0f;
        this.freqWidth2000 = 1.0f;
        this.freqWidth4000 = 1.0f;
        this.freqWidth8000 = 1.0f;
        this.freqWidth16000 = 1.0f;
        this.name = parcel.readString();
        this.preamp = parcel.readFloat();
        this.freqWidth31 = parcel.readFloat();
        this.freqWidth63 = parcel.readFloat();
        this.freqWidth125 = parcel.readFloat();
        this.freqWidth250 = parcel.readFloat();
        this.freqWidth500 = parcel.readFloat();
        this.freqWidth1000 = parcel.readFloat();
        this.freqWidth2000 = parcel.readFloat();
        this.freqWidth4000 = parcel.readFloat();
        this.freqWidth8000 = parcel.readFloat();
        this.freqWidth16000 = parcel.readFloat();
        this.amp31 = parcel.readFloat();
        this.amp63 = parcel.readFloat();
        this.amp125 = parcel.readFloat();
        this.amp250 = parcel.readFloat();
        this.amp500 = parcel.readFloat();
        this.amp1000 = parcel.readFloat();
        this.amp2000 = parcel.readFloat();
        this.amp4000 = parcel.readFloat();
        this.amp8000 = parcel.readFloat();
        this.amp16000 = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeFloat(this.preamp);
        parcel.writeFloat(this.freqWidth31);
        parcel.writeFloat(this.freqWidth63);
        parcel.writeFloat(this.freqWidth125);
        parcel.writeFloat(this.freqWidth250);
        parcel.writeFloat(this.freqWidth500);
        parcel.writeFloat(this.freqWidth1000);
        parcel.writeFloat(this.freqWidth2000);
        parcel.writeFloat(this.freqWidth4000);
        parcel.writeFloat(this.freqWidth8000);
        parcel.writeFloat(this.freqWidth16000);
        parcel.writeFloat(this.amp31);
        parcel.writeFloat(this.amp63);
        parcel.writeFloat(this.amp125);
        parcel.writeFloat(this.amp250);
        parcel.writeFloat(this.amp500);
        parcel.writeFloat(this.amp1000);
        parcel.writeFloat(this.amp2000);
        parcel.writeFloat(this.amp4000);
        parcel.writeFloat(this.amp8000);
        parcel.writeFloat(this.amp16000);
    }
}
