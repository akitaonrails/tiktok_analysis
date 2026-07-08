package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AIGroupShotTemplateModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class AIGroupShotTemplateModel implements Parcelable {
    public static final Parcelable.Creator<AIGroupShotTemplateModel> CREATOR = new Parcelable.Creator<AIGroupShotTemplateModel>() { // from class: X.0nKD
        @Override // android.os.Parcelable.Creator
        public final AIGroupShotTemplateModel createFromParcel(Parcel parcel) {
            return new AIGroupShotTemplateModel(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AIGroupShotTemplateModel[] newArray(int i) {
            return new AIGroupShotTemplateModel[i];
        }
    };

    @C09CT("dm_group_shot_template_id")
    public String dmGroupShotTemplateId;

    @C09CT("dm_group_shot_template_res_id")
    public String dmGroupShotTemplateResId;

    public AIGroupShotTemplateModel() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGroupShotTemplateModel)) {
            return false;
        }
        AIGroupShotTemplateModel aIGroupShotTemplateModel = (AIGroupShotTemplateModel) obj;
        return Intrinsics.LJFF(this.dmGroupShotTemplateId, aIGroupShotTemplateModel.dmGroupShotTemplateId) && Intrinsics.LJFF(this.dmGroupShotTemplateResId, aIGroupShotTemplateModel.dmGroupShotTemplateResId);
    }

    public final int hashCode() {
        String str = this.dmGroupShotTemplateId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dmGroupShotTemplateResId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGroupShotTemplateModel(dmGroupShotTemplateId=");
        sbLIZ.append(this.dmGroupShotTemplateId);
        sbLIZ.append(", dmGroupShotTemplateResId=");
        sbLIZ.append(this.dmGroupShotTemplateResId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.dmGroupShotTemplateId);
        parcel.writeString(this.dmGroupShotTemplateResId);
    }

    public AIGroupShotTemplateModel(String str, String str2) {
        this.dmGroupShotTemplateId = str;
        this.dmGroupShotTemplateResId = str2;
    }
}
