package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.MediaLocationMetaDataModel;

/* JADX INFO: loaded from: classes9.dex */
public final class MediaLocationMetaDataModel implements Parcelable {
    public static final Parcelable.Creator<MediaLocationMetaDataModel> CREATOR = new Parcelable.Creator<MediaLocationMetaDataModel>() { // from class: X.0KjC
        @Override // android.os.Parcelable.Creator
        public final MediaLocationMetaDataModel createFromParcel(Parcel parcel) {
            Long lValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            return new MediaLocationMetaDataModel(string, string2, string3, lValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final MediaLocationMetaDataModel[] newArray(int i) {
            return new MediaLocationMetaDataModel[i];
        }
    };

    @C09CT("timestamp")
    public Long createTimestamp;

    @C09CT("encrypt_latitude")
    public String encryptLatitude;

    @C09CT("encrypt_longitude")
    public String encryptLongitude;

    @C09CT("origin_path")
    public String originPath;

    public MediaLocationMetaDataModel() {
        this(null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.originPath);
        parcel.writeString(this.encryptLatitude);
        parcel.writeString(this.encryptLongitude);
        Long l = this.createTimestamp;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    public MediaLocationMetaDataModel(String str, String str2, String str3, Long l) {
        this.originPath = str;
        this.encryptLatitude = str2;
        this.encryptLongitude = str3;
        this.createTimestamp = l;
    }
}
