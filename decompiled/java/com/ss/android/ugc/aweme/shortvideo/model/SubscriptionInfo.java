package com.ss.android.ugc.aweme.shortvideo.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes21.dex */
public final class SubscriptionInfo implements Parcelable {
    public static final Parcelable.Creator<SubscriptionInfo> CREATOR = new Creator();

    @C09CT("is_preview")
    public final boolean isPreview;

    public static final class Creator implements Parcelable.Creator<SubscriptionInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SubscriptionInfo createFromParcel(Parcel parcel) {
            return new SubscriptionInfo(parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SubscriptionInfo[] newArray(int i) {
            return new SubscriptionInfo[i];
        }
    }

    public SubscriptionInfo() {
        this(false);
    }

    public final SubscriptionInfo copy(boolean z) {
        return new SubscriptionInfo(z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubscriptionInfo) && this.isPreview == ((SubscriptionInfo) obj).isPreview;
    }

    public int hashCode() {
        return C786410Ut5.Z2(this.isPreview);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubscriptionInfo(isPreview=");
        sbLIZ.append(this.isPreview);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isPreview ? 1 : 0);
    }

    public final boolean isPreview() {
        return this.isPreview;
    }

    public SubscriptionInfo(boolean z) {
        this.isPreview = z;
    }
}
