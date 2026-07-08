package com.ss.android.ugc.aweme.im.message.template.component;

import X.C2188811AlT;
import X.C2241591CoP;
import X.C786410Ut5;
import X.InterfaceC1294060jmO;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.TTLComponent;

/* JADX INFO: loaded from: classes35.dex */
@InterfaceC1294060jmO
public final class TTLComponent implements BaseComponent<C2241591CoP> {
    public static final Parcelable.Creator<TTLComponent> CREATOR = new Parcelable.Creator<TTLComponent>() { // from class: X.1CoS
        @Override // android.os.Parcelable.Creator
        public final TTLComponent createFromParcel(Parcel parcel) {
            return new TTLComponent(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final TTLComponent[] newArray(int i) {
            return new TTLComponent[i];
        }
    };
    public final long expiredAt;

    public TTLComponent() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TTLComponent) && this.expiredAt == ((TTLComponent) obj).expiredAt;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.expiredAt);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTLComponent(expiredAt=");
        sbLIZ.append(this.expiredAt);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.expiredAt);
    }

    public /* synthetic */ TTLComponent(int i) {
        this(0L);
    }

    public TTLComponent(long j) {
        this.expiredAt = j;
    }
}
