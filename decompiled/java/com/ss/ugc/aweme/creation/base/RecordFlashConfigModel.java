package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.RecordFlashConfigModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public class RecordFlashConfigModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<RecordFlashConfigModel> CREATOR = new Parcelable.Creator<RecordFlashConfigModel>() { // from class: X.0wQl
        @Override // android.os.Parcelable.Creator
        public final RecordFlashConfigModel createFromParcel(Parcel parcel) {
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
            return new RecordFlashConfigModel(boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final RecordFlashConfigModel[] newArray(int i) {
            return new RecordFlashConfigModel[i];
        }
    };

    @C09CT("forbid_front_flash")
    public Boolean forbidFrontFlash;

    public RecordFlashConfigModel() {
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
        Boolean bool = this.forbidFrontFlash;
        if (bool != null) {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        } else {
            BooleanValue = 0;
        }
        parcel.writeInt(BooleanValue);
    }

    public final Boolean getForbidFrontFlash() {
        return this.forbidFrontFlash;
    }

    public RecordFlashConfigModel(Boolean bool) {
        this.forbidFrontFlash = bool;
    }

    public final void setForbidFrontFlash(Boolean bool) {
        this.forbidFrontFlash = bool;
    }
}
