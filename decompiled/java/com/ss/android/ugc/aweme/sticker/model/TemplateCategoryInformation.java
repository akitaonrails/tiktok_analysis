package com.ss.android.ugc.aweme.sticker.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.sticker.model.TemplateCategoryInformation;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class TemplateCategoryInformation implements Serializable, Parcelable {
    public static final Parcelable.Creator<TemplateCategoryInformation> CREATOR = new Parcelable.Creator<TemplateCategoryInformation>() { // from class: X.0ss3
        @Override // android.os.Parcelable.Creator
        public final TemplateCategoryInformation createFromParcel(Parcel parcel) {
            return new TemplateCategoryInformation(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TemplateCategoryInformation[] newArray(int i) {
            return new TemplateCategoryInformation[i];
        }
    };

    @C09CT("key")
    public final String key;

    public final TemplateCategoryInformation copy(String str) {
        return new TemplateCategoryInformation(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TemplateCategoryInformation) && Intrinsics.LJFF(this.key, ((TemplateCategoryInformation) obj).key);
    }

    public int hashCode() {
        String str = this.key;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateCategoryInformation(key=");
        sbLIZ.append(this.key);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.key);
    }

    public final String getKey() {
        return this.key;
    }

    public TemplateCategoryInformation(String str) {
        this.key = str;
    }
}
