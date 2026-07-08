package com.ss.android.ugc.aweme;

import X.C0VSJ;
import X.C2188811AlT;
import X.C786410Ut5;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.EffectImgCreator$Output;
import com.ss.android.ugc.aweme.data.IconSelectData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class EffectImgCreator$Output implements Parcelable {
    public static final Parcelable.Creator<EffectImgCreator$Output> CREATOR = new Parcelable.Creator<EffectImgCreator$Output>() { // from class: X.0vIq
        @Override // android.os.Parcelable.Creator
        public final EffectImgCreator$Output createFromParcel(Parcel parcel) {
            boolean z;
            IconSelectData iconSelectDataCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                iconSelectDataCreateFromParcel = null;
            } else {
                iconSelectDataCreateFromParcel = IconSelectData.CREATOR.createFromParcel(parcel);
            }
            return new EffectImgCreator$Output(string, string2, z, iconSelectDataCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final EffectImgCreator$Output[] newArray(int i) {
            return new EffectImgCreator$Output[i];
        }
    };
    public final boolean applyEffectChecked;
    public final String effectIconId;
    public final String effectIconPath;
    public final Uri effectIconUri;
    public IconSelectData originIconData;
    public int resultCode;

    /* JADX WARN: Illegal instructions before constructor call */
    public EffectImgCreator$Output() {
        String str = null;
        this(str, str, false, 15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectImgCreator$Output)) {
            return false;
        }
        EffectImgCreator$Output effectImgCreator$Output = (EffectImgCreator$Output) obj;
        return Intrinsics.LJFF(this.effectIconPath, effectImgCreator$Output.effectIconPath) && Intrinsics.LJFF(this.effectIconId, effectImgCreator$Output.effectIconId) && this.applyEffectChecked == effectImgCreator$Output.applyEffectChecked && Intrinsics.LJFF(this.originIconData, effectImgCreator$Output.originIconData);
    }

    public final int hashCode() {
        int iHashCode = this.effectIconPath.hashCode() * 31;
        String str = this.effectIconId;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.applyEffectChecked)) * 31;
        IconSelectData iconSelectData = this.originIconData;
        return iHashCode2 + (iconSelectData != null ? iconSelectData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Output(effectIconPath=");
        sbLIZ.append(this.effectIconPath);
        sbLIZ.append(", effectIconId=");
        sbLIZ.append(this.effectIconId);
        sbLIZ.append(", applyEffectChecked=");
        sbLIZ.append(this.applyEffectChecked);
        sbLIZ.append(", originIconData=");
        sbLIZ.append(this.originIconData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.effectIconPath);
        parcel.writeString(this.effectIconId);
        parcel.writeInt(this.applyEffectChecked ? 1 : 0);
        IconSelectData iconSelectData = this.originIconData;
        if (iconSelectData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iconSelectData.writeToParcel(parcel, i);
        }
    }

    public EffectImgCreator$Output(String str, String str2, boolean z, IconSelectData iconSelectData) {
        this.effectIconPath = str;
        this.effectIconId = str2;
        this.applyEffectChecked = z;
        this.originIconData = iconSelectData;
        this.effectIconUri = Uri.fromFile(new C0VSJ(str));
    }

    public /* synthetic */ EffectImgCreator$Output(String str, String str2, boolean z, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? true : z, (IconSelectData) null);
    }
}
