package com.bytedance.tiktok.creationmodel.nano.core;

import X.C040H;
import X.C1780730wRL;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tiktok.creationmodel.nano.core.Controlled;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes28.dex */
public final class Controlled<READ_ONLY_MODEL_TYPE extends Parcelable, MUTABLE_MODEL_TYPE extends READ_ONLY_MODEL_TYPE> implements Parcelable {
    public static final C1780730wRL CREATOR = new Parcelable.Creator<Controlled<Parcelable, Parcelable>>() { // from class: X.0wRL
        @Override // android.os.Parcelable.Creator
        public final Controlled<Parcelable, Parcelable> createFromParcel(Parcel parcel) {
            return new Controlled<>(parcel.readParcelable(Controlled.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Controlled<Parcelable, Parcelable>[] newArray(int i) {
            return new Controlled[i];
        }
    };

    /* JADX INFO: Incorrect field signature: TMUTABLE_MODEL_TYPE; */
    @C040H
    public final Parcelable _value;

    @C040H
    public WeakReference<Object> controllerRef;

    @C040H
    public MutableLiveData<READ_ONLY_MODEL_TYPE> liveData;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Incorrect types in method signature: (TMUTABLE_MODEL_TYPE;)V */
    public Controlled(Parcelable parcelable) {
        this._value = parcelable;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this._value, i);
    }
}
