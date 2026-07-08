package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.SubTemplateInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.SubTemplateStyle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class SubTemplateInfo implements Parcelable {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final Integer id;

    @C09CT("style")
    public SubTemplateStyle style;

    @C09CT("text")
    public String text;
    public static final Parcelable.Creator<SubTemplateInfo> CREATOR = new Parcelable.Creator<SubTemplateInfo>() { // from class: X.0F7H
        @Override // android.os.Parcelable.Creator
        public final SubTemplateInfo createFromParcel(Parcel parcel) {
            Integer numValueOf;
            SubTemplateStyle subTemplateStyleCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                subTemplateStyleCreateFromParcel = SubTemplateStyle.CREATOR.createFromParcel(parcel);
            }
            return new SubTemplateInfo(numValueOf, string, subTemplateStyleCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SubTemplateInfo[] newArray(int i) {
            return new SubTemplateInfo[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubTemplateInfo)) {
            return false;
        }
        SubTemplateInfo subTemplateInfo = (SubTemplateInfo) obj;
        return Intrinsics.LJFF(this.id, subTemplateInfo.id) && Intrinsics.LJFF(this.text, subTemplateInfo.text) && Intrinsics.LJFF(this.style, subTemplateInfo.style);
    }

    public final int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.text;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        SubTemplateStyle subTemplateStyle = this.style;
        return iHashCode2 + (subTemplateStyle != null ? subTemplateStyle.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubTemplateInfo(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", style=");
        sbLIZ.append(this.style);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.text);
        SubTemplateStyle subTemplateStyle = this.style;
        if (subTemplateStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            subTemplateStyle.writeToParcel(parcel, i);
        }
    }

    public SubTemplateInfo(Integer num, String str, SubTemplateStyle subTemplateStyle) {
        this.id = num;
        this.text = str;
        this.style = subTemplateStyle;
    }
}
