package com.ss.android.ugc.aweme.creative.model.edit;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.ReuseEffectTemplateInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class ReuseEffectTemplateInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<ReuseEffectTemplateInfo> CREATOR = new Parcelable.Creator<ReuseEffectTemplateInfo>() { // from class: X.0nbZ
        @Override // android.os.Parcelable.Creator
        public final ReuseEffectTemplateInfo createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                z2 = false;
            }
            return new ReuseEffectTemplateInfo(z, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final ReuseEffectTemplateInfo[] newArray(int i) {
            return new ReuseEffectTemplateInfo[i];
        }
    };

    @C09CT("need_reuse_image_effect_template")
    public final boolean needReuseImageEffectTemplate;

    @C09CT("reuse_fail")
    public boolean reuseFail;

    public ReuseEffectTemplateInfo() {
        this(false, false);
    }

    public final ReuseEffectTemplateInfo copy(boolean z, boolean z2) {
        return new ReuseEffectTemplateInfo(z, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReuseEffectTemplateInfo)) {
            return false;
        }
        ReuseEffectTemplateInfo reuseEffectTemplateInfo = (ReuseEffectTemplateInfo) obj;
        return this.needReuseImageEffectTemplate == reuseEffectTemplateInfo.needReuseImageEffectTemplate && this.reuseFail == reuseEffectTemplateInfo.reuseFail;
    }

    public int hashCode() {
        return (C786410Ut5.Z2(this.needReuseImageEffectTemplate) * 31) + C786410Ut5.Z2(this.reuseFail);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReuseEffectTemplateInfo(needReuseImageEffectTemplate=");
        sbLIZ.append(this.needReuseImageEffectTemplate);
        sbLIZ.append(", reuseFail=");
        sbLIZ.append(this.reuseFail);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.needReuseImageEffectTemplate ? 1 : 0);
        parcel.writeInt(this.reuseFail ? 1 : 0);
    }

    public final boolean getNeedReuseImageEffectTemplate() {
        return this.needReuseImageEffectTemplate;
    }

    public final boolean getReuseFail() {
        return this.reuseFail;
    }

    public final void setReuseFail(boolean z) {
        this.reuseFail = z;
    }

    public ReuseEffectTemplateInfo(boolean z, boolean z2) {
        this.needReuseImageEffectTemplate = z;
        this.reuseFail = z2;
    }
}
