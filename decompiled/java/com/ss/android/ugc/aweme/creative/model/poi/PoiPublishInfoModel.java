package com.ss.android.ugc.aweme.creative.model.poi;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.poi.PoiPublishInfoModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class PoiPublishInfoModel implements Serializable, Parcelable {
    public static final Parcelable.Creator<PoiPublishInfoModel> CREATOR = new Parcelable.Creator<PoiPublishInfoModel>() { // from class: X.0nf2
        @Override // android.os.Parcelable.Creator
        public final PoiPublishInfoModel createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new PoiPublishInfoModel(boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final PoiPublishInfoModel[] newArray(int i) {
            return new PoiPublishInfoModel[i];
        }
    };

    @C09CT("disable_change_poi")
    public Boolean disableChangePoi;

    public PoiPublishInfoModel() {
        this(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        Boolean bool = this.disableChangePoi;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public final Boolean getDisableChangePoi() {
        return this.disableChangePoi;
    }

    public PoiPublishInfoModel(Boolean bool) {
        this.disableChangePoi = bool;
    }

    public final void setDisableChangePoi(Boolean bool) {
        this.disableChangePoi = bool;
    }
}
