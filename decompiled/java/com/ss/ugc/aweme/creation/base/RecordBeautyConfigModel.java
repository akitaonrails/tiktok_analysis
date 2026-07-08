package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.RecordBeautyConfigModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public class RecordBeautyConfigModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<RecordBeautyConfigModel> CREATOR = new Parcelable.Creator<RecordBeautyConfigModel>() { // from class: X.0wQi
        @Override // android.os.Parcelable.Creator
        public final RecordBeautyConfigModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            boolean z;
            boolean z2 = true;
            Boolean boolValueOf2 = null;
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
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            return new RecordBeautyConfigModel(boolValueOf, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final RecordBeautyConfigModel[] newArray(int i) {
            return new RecordBeautyConfigModel[i];
        }
    };

    @C09CT("forbid_save_apply_last_beauty")
    public Boolean forbidSaveApplyLastBeauty;

    @C09CT("force_use_switch")
    public Boolean forceUseSwitch;

    public RecordBeautyConfigModel() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.forbidSaveApplyLastBeauty;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        Boolean bool2 = this.forceUseSwitch;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public final Boolean getForbidSaveApplyLastBeauty() {
        return this.forbidSaveApplyLastBeauty;
    }

    public final Boolean getForceUseSwitch() {
        return this.forceUseSwitch;
    }

    public final void setForbidSaveApplyLastBeauty(Boolean bool) {
        this.forbidSaveApplyLastBeauty = bool;
    }

    public final void setForceUseSwitch(Boolean bool) {
        this.forceUseSwitch = bool;
    }

    public RecordBeautyConfigModel(Boolean bool, Boolean bool2) {
        this.forbidSaveApplyLastBeauty = bool;
        this.forceUseSwitch = bool2;
    }
}
