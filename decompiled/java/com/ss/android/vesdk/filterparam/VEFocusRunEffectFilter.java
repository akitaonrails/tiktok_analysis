package com.ss.android.vesdk.filterparam;

import android.os.Parcel;

/* JADX INFO: loaded from: classes36.dex */
public class VEFocusRunEffectFilter extends VEBaseFilterParam {
    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public VEFocusRunEffectFilter() {
        this.filterName = "focus effect";
        this.filterType = 32;
        this.filterDurationType = 1;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
