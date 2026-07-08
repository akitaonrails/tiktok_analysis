package com.ss.android.ugc.aweme.im.message.template.component;

import X.C21372818kY;
import X.C2188811AlT;
import X.C2238721Cjm;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetActionTemplateComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class VisualPoetActionTemplateComponent implements BaseComponent<C2238721Cjm> {
    public final String key;
    public final String name;
    public final String schema;
    public static final C21372818kY Companion = new Object() { // from class: X.18kY
    };
    public static final Parcelable.Creator<VisualPoetActionTemplateComponent> CREATOR = new Parcelable.Creator<VisualPoetActionTemplateComponent>() { // from class: X.18kX
        @Override // android.os.Parcelable.Creator
        public final VisualPoetActionTemplateComponent createFromParcel(Parcel parcel) {
            return new VisualPoetActionTemplateComponent(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VisualPoetActionTemplateComponent[] newArray(int i) {
            return new VisualPoetActionTemplateComponent[i];
        }
    };
    public static final VisualPoetTnsComponent EMPTY_VISUAL_POET_TNS_COMPONENT = new VisualPoetTnsComponent(0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisualPoetActionTemplateComponent)) {
            return false;
        }
        VisualPoetActionTemplateComponent visualPoetActionTemplateComponent = (VisualPoetActionTemplateComponent) obj;
        return Intrinsics.LJFF(this.key, visualPoetActionTemplateComponent.key) && Intrinsics.LJFF(this.name, visualPoetActionTemplateComponent.name) && Intrinsics.LJFF(this.schema, visualPoetActionTemplateComponent.schema);
    }

    public final int hashCode() {
        return (((this.key.hashCode() * 31) + this.name.hashCode()) * 31) + this.schema.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VisualPoetActionTemplateComponent(key=");
        sbLIZ.append(this.key);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.key);
        parcel.writeString(this.name);
        parcel.writeString(this.schema);
    }

    public VisualPoetActionTemplateComponent() {
        this("", "", "");
    }

    public VisualPoetActionTemplateComponent(String str, String str2, String str3) {
        this.key = str;
        this.name = str2;
        this.schema = str3;
    }
}
