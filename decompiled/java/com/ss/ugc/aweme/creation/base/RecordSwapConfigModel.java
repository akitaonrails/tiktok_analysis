package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.RecordSwapConfigModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public class RecordSwapConfigModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<RecordSwapConfigModel> CREATOR = new Parcelable.Creator<RecordSwapConfigModel>() { // from class: X.0wQU
        @Override // android.os.Parcelable.Creator
        public final RecordSwapConfigModel createFromParcel(Parcel parcel) {
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
            return new RecordSwapConfigModel(boolValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RecordSwapConfigModel[] newArray(int i) {
            return new RecordSwapConfigModel[i];
        }
    };

    @C09CT("default_position")
    public String defaultPosition;

    @C09CT("forbid_save_apply_last_swap")
    public Boolean forbidSaveApplyLastSwap;

    public RecordSwapConfigModel() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        Boolean bool = this.forbidSaveApplyLastSwap;
        if (bool != null) {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        } else {
            BooleanValue = 0;
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.defaultPosition);
    }

    public final String getDefaultPosition() {
        return this.defaultPosition;
    }

    public final Boolean getForbidSaveApplyLastSwap() {
        return this.forbidSaveApplyLastSwap;
    }

    public final void setDefaultPosition(String str) {
        this.defaultPosition = str;
    }

    public final void setForbidSaveApplyLastSwap(Boolean bool) {
        this.forbidSaveApplyLastSwap = bool;
    }

    public RecordSwapConfigModel(Boolean bool, String str) {
        this.forbidSaveApplyLastSwap = bool;
        this.defaultPosition = str;
    }
}
