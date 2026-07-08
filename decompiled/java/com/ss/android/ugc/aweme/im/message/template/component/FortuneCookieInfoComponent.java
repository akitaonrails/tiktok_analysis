package com.ss.android.ugc.aweme.im.message.template.component;

import X.C2188811AlT;
import X.C2243211Cr1;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.FortuneCookieInfoComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class FortuneCookieInfoComponent implements BaseComponent<C2243211Cr1> {
    public static final Parcelable.Creator<FortuneCookieInfoComponent> CREATOR = new Parcelable.Creator<FortuneCookieInfoComponent>() { // from class: X.0ZqU
        @Override // android.os.Parcelable.Creator
        public final FortuneCookieInfoComponent createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new FortuneCookieInfoComponent(string, z);
        }

        @Override // android.os.Parcelable.Creator
        public final FortuneCookieInfoComponent[] newArray(int i) {
            return new FortuneCookieInfoComponent[i];
        }
    };
    public final String messageTips;
    public final boolean show;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FortuneCookieInfoComponent)) {
            return false;
        }
        FortuneCookieInfoComponent fortuneCookieInfoComponent = (FortuneCookieInfoComponent) obj;
        return Intrinsics.LJFF(this.messageTips, fortuneCookieInfoComponent.messageTips) && this.show == fortuneCookieInfoComponent.show;
    }

    public final int hashCode() {
        return (this.messageTips.hashCode() * 31) + C786410Ut5.Z2(this.show);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FortuneCookieInfoComponent(messageTips=");
        sbLIZ.append(this.messageTips);
        sbLIZ.append(", show=");
        sbLIZ.append(this.show);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.messageTips);
        parcel.writeInt(this.show ? 1 : 0);
    }

    public FortuneCookieInfoComponent(String str, boolean z) {
        this.messageTips = str;
        this.show = z;
    }
}
