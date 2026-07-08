package com.ss.android.ugc.aweme.im.message.template.component;

import X.C18Y4;
import X.C2188811AlT;
import X.C2241211Cnn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetErrorInfoComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class VisualPoetErrorInfoComponent implements BaseComponent<C2241211Cnn> {
    public final String code;
    public final String detail;
    public final String message;
    public static final C18Y4 Companion = new Object() { // from class: X.18Y4
    };
    public static final Parcelable.Creator<VisualPoetErrorInfoComponent> CREATOR = new Parcelable.Creator<VisualPoetErrorInfoComponent>() { // from class: X.18Y3
        @Override // android.os.Parcelable.Creator
        public final VisualPoetErrorInfoComponent createFromParcel(Parcel parcel) {
            return new VisualPoetErrorInfoComponent(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VisualPoetErrorInfoComponent[] newArray(int i) {
            return new VisualPoetErrorInfoComponent[i];
        }
    };
    public static final VisualPoetErrorInfoComponent EMPTY_VISUAL_POET_ERROR_INFO = new VisualPoetErrorInfoComponent(0);

    public VisualPoetErrorInfoComponent() {
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
        if (!(obj instanceof VisualPoetErrorInfoComponent)) {
            return false;
        }
        VisualPoetErrorInfoComponent visualPoetErrorInfoComponent = (VisualPoetErrorInfoComponent) obj;
        return Intrinsics.LJFF(this.code, visualPoetErrorInfoComponent.code) && Intrinsics.LJFF(this.message, visualPoetErrorInfoComponent.message) && Intrinsics.LJFF(this.detail, visualPoetErrorInfoComponent.detail);
    }

    public final int hashCode() {
        return (((this.code.hashCode() * 31) + this.message.hashCode()) * 31) + this.detail.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VisualPoetErrorInfoComponent(code=");
        sbLIZ.append(this.code);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(", detail=");
        sbLIZ.append(this.detail);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.code);
        parcel.writeString(this.message);
        parcel.writeString(this.detail);
    }

    public /* synthetic */ VisualPoetErrorInfoComponent(int i) {
        this("", "", "");
    }

    public VisualPoetErrorInfoComponent(String str, String str2, String str3) {
        this.code = str;
        this.message = str2;
        this.detail = str3;
    }
}
