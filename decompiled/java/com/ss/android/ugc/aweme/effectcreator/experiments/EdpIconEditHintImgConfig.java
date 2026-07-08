package com.ss.android.ugc.aweme.effectcreator.experiments;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.effectcreator.experiments.EdpIconEditHintImgConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class EdpIconEditHintImgConfig implements Parcelable {
    public static final Parcelable.Creator<EdpIconEditHintImgConfig> CREATOR = new Parcelable.Creator<EdpIconEditHintImgConfig>() { // from class: X.0Hsy
        @Override // android.os.Parcelable.Creator
        public final EdpIconEditHintImgConfig createFromParcel(Parcel parcel) {
            return new EdpIconEditHintImgConfig(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EdpIconEditHintImgConfig[] newArray(int i) {
            return new EdpIconEditHintImgConfig[i];
        }
    };

    @C09CT("female_icon")
    public final String femaleIcon;

    @C09CT("male_icon")
    public final String maleIcon;

    @C09CT("pet_icon")
    public final String petIcon;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EdpIconEditHintImgConfig)) {
            return false;
        }
        EdpIconEditHintImgConfig edpIconEditHintImgConfig = (EdpIconEditHintImgConfig) obj;
        return Intrinsics.LJFF(this.femaleIcon, edpIconEditHintImgConfig.femaleIcon) && Intrinsics.LJFF(this.maleIcon, edpIconEditHintImgConfig.maleIcon) && Intrinsics.LJFF(this.petIcon, edpIconEditHintImgConfig.petIcon);
    }

    public final int hashCode() {
        return (((this.femaleIcon.hashCode() * 31) + this.maleIcon.hashCode()) * 31) + this.petIcon.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EdpIconEditHintImgConfig(femaleIcon=");
        sbLIZ.append(this.femaleIcon);
        sbLIZ.append(", maleIcon=");
        sbLIZ.append(this.maleIcon);
        sbLIZ.append(", petIcon=");
        sbLIZ.append(this.petIcon);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.femaleIcon);
        parcel.writeString(this.maleIcon);
        parcel.writeString(this.petIcon);
    }

    public EdpIconEditHintImgConfig() {
        this("https://lf19-effect.tiktokcdn-us.com/obj/eden-sg/aulpsj_lth_rvarpa/ljhwZthlaukjlkulzlp/images/edp_icon_edit_hint_img/icon-difference-2.jpg", "https://lf19-effect.tiktokcdn-us.com/obj/eden-sg/aulpsj_lth_rvarpa/ljhwZthlaukjlkulzlp/images/edp_icon_edit_hint_img/icon-difference-1.jpg", "https://lf19-effect.tiktokcdn-us.com/obj/eden-sg/aulpsj_lth_rvarpa/ljhwZthlaukjlkulzlp/images/edp_icon_edit_hint_img/icon-same-1.jpg");
    }

    public EdpIconEditHintImgConfig(String str, String str2, String str3) {
        this.femaleIcon = str;
        this.maleIcon = str2;
        this.petIcon = str3;
    }
}
