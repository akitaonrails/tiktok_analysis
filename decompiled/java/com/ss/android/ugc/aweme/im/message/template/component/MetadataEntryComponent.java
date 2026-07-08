package com.ss.android.ugc.aweme.im.message.template.component;

import X.C1C3O;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.MetadataEntryComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class MetadataEntryComponent implements BaseComponent<C1C3O> {
    public static final Parcelable.Creator<MetadataEntryComponent> CREATOR = new Parcelable.Creator<MetadataEntryComponent>() { // from class: X.0ZhS
        @Override // android.os.Parcelable.Creator
        public final MetadataEntryComponent createFromParcel(Parcel parcel) {
            return new MetadataEntryComponent(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MetadataEntryComponent[] newArray(int i) {
            return new MetadataEntryComponent[i];
        }
    };
    public final String key;
    public final String value;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetadataEntryComponent)) {
            return false;
        }
        MetadataEntryComponent metadataEntryComponent = (MetadataEntryComponent) obj;
        return Intrinsics.LJFF(this.key, metadataEntryComponent.key) && Intrinsics.LJFF(this.value, metadataEntryComponent.value);
    }

    public final int hashCode() {
        return (this.key.hashCode() * 31) + this.value.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MetadataEntryComponent(key=");
        sbLIZ.append(this.key);
        sbLIZ.append(", value=");
        sbLIZ.append(this.value);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.key);
        parcel.writeString(this.value);
    }

    public MetadataEntryComponent() {
        this("", "");
    }

    public MetadataEntryComponent(String str, String str2) {
        this.key = str;
        this.value = str2;
    }
}
