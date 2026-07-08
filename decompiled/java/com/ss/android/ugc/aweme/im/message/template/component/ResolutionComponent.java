package com.ss.android.ugc.aweme.im.message.template.component;

import X.C2188811AlT;
import X.C2244161CsY;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;

/* JADX INFO: loaded from: classes15.dex */
public final class ResolutionComponent implements BaseComponent<C2244161CsY> {
    public static final Parcelable.Creator<ResolutionComponent> CREATOR = new Parcelable.Creator<ResolutionComponent>() { // from class: X.0ZWl
        @Override // android.os.Parcelable.Creator
        public final ResolutionComponent createFromParcel(Parcel parcel) {
            return new ResolutionComponent(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ResolutionComponent[] newArray(int i) {
            return new ResolutionComponent[i];
        }
    };
    public final int height;
    public final int width;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolutionComponent)) {
            return false;
        }
        ResolutionComponent resolutionComponent = (ResolutionComponent) obj;
        return this.width == resolutionComponent.width && this.height == resolutionComponent.height;
    }

    public final int hashCode() {
        return (this.width * 31) + this.height;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResolutionComponent(width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }

    public ResolutionComponent(int i, int i2) {
        this.width = i;
        this.height = i2;
    }
}
