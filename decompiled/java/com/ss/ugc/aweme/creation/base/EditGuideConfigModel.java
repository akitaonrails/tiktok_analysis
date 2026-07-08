package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.EditGuideConfigModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public class EditGuideConfigModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<EditGuideConfigModel> CREATOR = new Parcelable.Creator<EditGuideConfigModel>() { // from class: X.0wQX
        @Override // android.os.Parcelable.Creator
        public final EditGuideConfigModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            boolean z;
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            } else {
                boolValueOf = null;
            }
            return new EditGuideConfigModel(boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final EditGuideConfigModel[] newArray(int i) {
            return new EditGuideConfigModel[i];
        }
    };

    @C09CT("hide_add_text_guidance")
    public Boolean hideAddTextGuidance;

    public EditGuideConfigModel() {
        this(null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        Boolean bool = this.hideAddTextGuidance;
        if (bool != null) {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        } else {
            BooleanValue = 0;
        }
        parcel.writeInt(BooleanValue);
    }

    public final Boolean getHideAddTextGuidance() {
        return this.hideAddTextGuidance;
    }

    public EditGuideConfigModel(Boolean bool) {
        this.hideAddTextGuidance = bool;
    }

    public final void setHideAddTextGuidance(Boolean bool) {
        this.hideAddTextGuidance = bool;
    }
}
