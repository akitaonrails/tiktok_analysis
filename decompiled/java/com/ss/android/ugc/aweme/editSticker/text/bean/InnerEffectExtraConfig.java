package com.ss.android.ugc.aweme.editSticker.text.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectExtraConfig;

/* JADX INFO: loaded from: classes30.dex */
public final class InnerEffectExtraConfig implements Parcelable {
    public static final Parcelable.Creator<InnerEffectExtraConfig> CREATOR = new Parcelable.Creator<InnerEffectExtraConfig>() { // from class: X.126B
        @Override // android.os.Parcelable.Creator
        public final InnerEffectExtraConfig createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new InnerEffectExtraConfig(z);
        }

        @Override // android.os.Parcelable.Creator
        public final InnerEffectExtraConfig[] newArray(int i) {
            return new InnerEffectExtraConfig[i];
        }
    };
    public final boolean forceUpdate;

    public InnerEffectExtraConfig() {
        this(false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.forceUpdate ? 1 : 0);
    }

    public final boolean getForceUpdate() {
        return this.forceUpdate;
    }

    public InnerEffectExtraConfig(boolean z) {
        this.forceUpdate = z;
    }
}
