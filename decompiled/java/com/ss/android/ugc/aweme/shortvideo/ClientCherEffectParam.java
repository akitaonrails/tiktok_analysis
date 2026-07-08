package com.ss.android.ugc.aweme.shortvideo;

import X.C09CT;
import X.C1DMA;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import java.io.Serializable;

/* JADX INFO: loaded from: classes36.dex */
public final class ClientCherEffectParam implements Serializable, Parcelable {
    public static final C1DMA CREATOR = new Parcelable.Creator<ClientCherEffectParam>() { // from class: X.1DMA
        @Override // android.os.Parcelable.Creator
        public final ClientCherEffectParam createFromParcel(Parcel parcel) {
            return new ClientCherEffectParam(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ClientCherEffectParam[] newArray(int i) {
            return new ClientCherEffectParam[i];
        }
    };

    @C09CT("duration")
    public double[] duration;

    @C09CT("matrix")
    public String[] matrix;

    @C09CT("segUseCher")
    public boolean[] segUseCher;

    public ClientCherEffectParam() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final double[] getDuration() {
        return this.duration;
    }

    public final String[] getMatrix() {
        return this.matrix;
    }

    public final boolean[] getSegUseCher() {
        return this.segUseCher;
    }

    public ClientCherEffectParam(Parcel parcel) {
        this(parcel.createStringArray(), parcel.createDoubleArray(), parcel.createBooleanArray());
    }

    public final void setDuration(double[] dArr) {
        this.duration = dArr;
    }

    public final void setMatrix(String[] strArr) {
        this.matrix = strArr;
    }

    public final void setSegUseCher(boolean[] zArr) {
        this.segUseCher = zArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray(this.matrix);
        parcel.writeDoubleArray(this.duration);
        parcel.writeBooleanArray(this.segUseCher);
    }

    public ClientCherEffectParam(String[] strArr, double[] dArr, boolean[] zArr) {
        this.matrix = strArr;
        this.duration = dArr;
        this.segUseCher = zArr;
    }
}
