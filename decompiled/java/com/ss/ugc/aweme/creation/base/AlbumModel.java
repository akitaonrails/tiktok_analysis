package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.AlbumModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class AlbumModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<AlbumModel> CREATOR = new Parcelable.Creator<AlbumModel>() { // from class: X.0Mhp
        @Override // android.os.Parcelable.Creator
        public final AlbumModel createFromParcel(Parcel parcel) {
            Integer numValueOf;
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            } else {
                numValueOf = null;
            }
            return new AlbumModel(numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AlbumModel[] newArray(int i) {
            return new AlbumModel[i];
        }
    };

    @C09CT("album_cover_index")
    public Integer albumCoverIndex;

    @C09CT("album_publish_title")
    public String albumPublishTitle;

    public AlbumModel() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        Integer num = this.albumCoverIndex;
        if (num != null) {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.albumPublishTitle);
    }

    public final Integer getAlbumCoverIndex() {
        return this.albumCoverIndex;
    }

    public final String getAlbumPublishTitle() {
        return this.albumPublishTitle;
    }

    public final void setAlbumCoverIndex(Integer num) {
        this.albumCoverIndex = num;
    }

    public final void setAlbumPublishTitle(String str) {
        this.albumPublishTitle = str;
    }

    public AlbumModel(Integer num, String str) {
        this.albumCoverIndex = num;
        this.albumPublishTitle = str;
    }
}
