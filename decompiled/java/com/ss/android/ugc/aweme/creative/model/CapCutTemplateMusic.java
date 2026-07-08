package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.CapCutTemplateMusic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class CapCutTemplateMusic implements Parcelable {
    public static final Parcelable.Creator<CapCutTemplateMusic> CREATOR = new Parcelable.Creator<CapCutTemplateMusic>() { // from class: X.0mdJ
        @Override // android.os.Parcelable.Creator
        public final CapCutTemplateMusic createFromParcel(Parcel parcel) {
            return new CapCutTemplateMusic(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CapCutTemplateMusic[] newArray(int i) {
            return new CapCutTemplateMusic[i];
        }
    };

    @C040H
    @C09CT("template_id")
    public final String templateId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CapCutTemplateMusic) && Intrinsics.LJFF(this.templateId, ((CapCutTemplateMusic) obj).templateId);
    }

    public final int hashCode() {
        return this.templateId.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CapCutTemplateMusic(templateId=");
        sbLIZ.append(this.templateId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.templateId);
    }

    public CapCutTemplateMusic() {
        this("");
    }

    public CapCutTemplateMusic(String str) {
        this.templateId = str;
    }
}
