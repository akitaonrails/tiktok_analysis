package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.TemplateEffectInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class TemplateEffectInfo implements Parcelable {
    public static final Parcelable.Creator<TemplateEffectInfo> CREATOR = new Parcelable.Creator<TemplateEffectInfo>() { // from class: X.0siY
        @Override // android.os.Parcelable.Creator
        public final TemplateEffectInfo createFromParcel(Parcel parcel) {
            return new TemplateEffectInfo(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TemplateEffectInfo[] newArray(int i) {
            return new TemplateEffectInfo[i];
        }
    };

    @C09CT("templateEffectId")
    public final String templateEffectId;

    @C09CT("templateResourceId")
    public final String templateResourceId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateEffectInfo)) {
            return false;
        }
        TemplateEffectInfo templateEffectInfo = (TemplateEffectInfo) obj;
        return Intrinsics.LJFF(this.templateResourceId, templateEffectInfo.templateResourceId) && Intrinsics.LJFF(this.templateEffectId, templateEffectInfo.templateEffectId);
    }

    public final int hashCode() {
        return (this.templateResourceId.hashCode() * 31) + this.templateEffectId.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateEffectInfo(templateResourceId=");
        sbLIZ.append(this.templateResourceId);
        sbLIZ.append(", templateEffectId=");
        sbLIZ.append(this.templateEffectId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.templateResourceId);
        parcel.writeString(this.templateEffectId);
    }

    public TemplateEffectInfo() {
        this("", "");
    }

    public TemplateEffectInfo(String str, String str2) {
        this.templateResourceId = str;
        this.templateEffectId = str2;
    }
}
