package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.RecordFilterConfigModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public class RecordFilterConfigModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<RecordFilterConfigModel> CREATOR = new Parcelable.Creator<RecordFilterConfigModel>() { // from class: X.0wQk
        @Override // android.os.Parcelable.Creator
        public final RecordFilterConfigModel createFromParcel(Parcel parcel) {
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
            return new RecordFilterConfigModel(boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final RecordFilterConfigModel[] newArray(int i) {
            return new RecordFilterConfigModel[i];
        }
    };

    @C09CT("forbid_save_apply_last_filter")
    public Boolean forbidSaveApplyLastFilter;

    public RecordFilterConfigModel() {
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
        Boolean bool = this.forbidSaveApplyLastFilter;
        if (bool != null) {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        } else {
            BooleanValue = 0;
        }
        parcel.writeInt(BooleanValue);
    }

    public final Boolean getForbidSaveApplyLastFilter() {
        return this.forbidSaveApplyLastFilter;
    }

    public RecordFilterConfigModel(Boolean bool) {
        this.forbidSaveApplyLastFilter = bool;
    }

    public final void setForbidSaveApplyLastFilter(Boolean bool) {
        this.forbidSaveApplyLastFilter = bool;
    }
}
