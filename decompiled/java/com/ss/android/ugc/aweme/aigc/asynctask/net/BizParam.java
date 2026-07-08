package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.aigc.asynctask.net.BizParam;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class BizParam implements Parcelable {

    @C09CT("edit_transition_ids")
    public final List<String> editEffectIds;

    @C09CT("prompt_visible_editable")
    public final String editableText;

    @C09CT("prompt_visible_uneditable")
    public final String unEditableText;
    public static final Parcelable.Creator<BizParam> CREATOR = new Parcelable.Creator<BizParam>() { // from class: X.0wVP
        @Override // android.os.Parcelable.Creator
        public final BizParam createFromParcel(Parcel parcel) {
            return new BizParam(parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final BizParam[] newArray(int i) {
            return new BizParam[i];
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
        if (!(obj instanceof BizParam)) {
            return false;
        }
        BizParam bizParam = (BizParam) obj;
        return Intrinsics.LJFF(this.editableText, bizParam.editableText) && Intrinsics.LJFF(this.unEditableText, bizParam.unEditableText) && Intrinsics.LJFF(this.editEffectIds, bizParam.editEffectIds);
    }

    public final int hashCode() {
        String str = this.editableText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.unEditableText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.editEffectIds;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BizParam(editableText=");
        sbLIZ.append(this.editableText);
        sbLIZ.append(", unEditableText=");
        sbLIZ.append(this.unEditableText);
        sbLIZ.append(", editEffectIds=");
        sbLIZ.append(this.editEffectIds);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.editableText);
        parcel.writeString(this.unEditableText);
        parcel.writeStringList(this.editEffectIds);
    }

    public BizParam(String str, String str2, List<String> list) {
        this.editableText = str;
        this.unEditableText = str2;
        this.editEffectIds = list;
    }
}
