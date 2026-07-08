package com.ss.android.ugc.aweme.im.message.template.component;

import X.C21304618Yy;
import X.C2188811AlT;
import X.C2241191Cnl;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetQuotaComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class VisualPoetQuotaComponent implements BaseComponent<C2241191Cnl> {
    public final boolean button_invisible;
    public final String button_title;
    public final String schema;
    public final String subtitle;
    public final String title;
    public static final C21304618Yy Companion = new Object() { // from class: X.18Yy
    };
    public static final Parcelable.Creator<VisualPoetQuotaComponent> CREATOR = new Parcelable.Creator<VisualPoetQuotaComponent>() { // from class: X.18Yx
        @Override // android.os.Parcelable.Creator
        public final VisualPoetQuotaComponent createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new VisualPoetQuotaComponent(string, string2, string3, string4, z);
        }

        @Override // android.os.Parcelable.Creator
        public final VisualPoetQuotaComponent[] newArray(int i) {
            return new VisualPoetQuotaComponent[i];
        }
    };
    public static final VisualPoetQuotaComponent EMPTY_VISUAL_POET_QUOTA = new VisualPoetQuotaComponent(0);

    public VisualPoetQuotaComponent() {
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
        if (!(obj instanceof VisualPoetQuotaComponent)) {
            return false;
        }
        VisualPoetQuotaComponent visualPoetQuotaComponent = (VisualPoetQuotaComponent) obj;
        return Intrinsics.LJFF(this.title, visualPoetQuotaComponent.title) && Intrinsics.LJFF(this.subtitle, visualPoetQuotaComponent.subtitle) && Intrinsics.LJFF(this.button_title, visualPoetQuotaComponent.button_title) && Intrinsics.LJFF(this.schema, visualPoetQuotaComponent.schema) && this.button_invisible == visualPoetQuotaComponent.button_invisible;
    }

    public final int hashCode() {
        return (((((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.button_title.hashCode()) * 31) + this.schema.hashCode()) * 31) + C786410Ut5.Z2(this.button_invisible);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VisualPoetQuotaComponent(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", subtitle=");
        sbLIZ.append(this.subtitle);
        sbLIZ.append(", button_title=");
        sbLIZ.append(this.button_title);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", button_invisible=");
        sbLIZ.append(this.button_invisible);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.button_title);
        parcel.writeString(this.schema);
        parcel.writeInt(this.button_invisible ? 1 : 0);
    }

    public /* synthetic */ VisualPoetQuotaComponent(int i) {
        this("", "", "", "", false);
    }

    public VisualPoetQuotaComponent(String str, String str2, String str3, String str4, boolean z) {
        this.title = str;
        this.subtitle = str2;
        this.button_title = str3;
        this.schema = str4;
        this.button_invisible = z;
    }
}
