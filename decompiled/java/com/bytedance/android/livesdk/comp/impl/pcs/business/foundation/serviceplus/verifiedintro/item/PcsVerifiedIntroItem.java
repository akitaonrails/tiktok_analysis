package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.verifiedintro.item;

import X.C2188811AlT;
import X.InterfaceC1891350zJl;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.verifiedintro.item.PcsVerifiedIntroItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsVerifiedIntroItem implements InterfaceC1891350zJl, Parcelable {
    public static final Parcelable.Creator<PcsVerifiedIntroItem> CREATOR = new Parcelable.Creator<PcsVerifiedIntroItem>() { // from class: X.0JM1
        @Override // android.os.Parcelable.Creator
        public final PcsVerifiedIntroItem createFromParcel(Parcel parcel) {
            return new PcsVerifiedIntroItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PcsVerifiedIntroItem[] newArray(int i) {
            return new PcsVerifiedIntroItem[i];
        }
    };
    public final String content;
    public final String title;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PcsVerifiedIntroItem)) {
            return false;
        }
        PcsVerifiedIntroItem pcsVerifiedIntroItem = (PcsVerifiedIntroItem) obj;
        return Intrinsics.LJFF(this.title, pcsVerifiedIntroItem.title) && Intrinsics.LJFF(this.content, pcsVerifiedIntroItem.content);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (this.title.hashCode() * 31) + this.content.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PcsVerifiedIntroItem(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.content);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public PcsVerifiedIntroItem(String str, String str2) {
        this.title = str;
        this.content = str2;
    }
}
