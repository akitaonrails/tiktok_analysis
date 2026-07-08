package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.PaidContentVideoModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class PaidContentVideoModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<PaidContentVideoModel> CREATOR = new Parcelable.Creator<PaidContentVideoModel>() { // from class: X.0nXN
        @Override // android.os.Parcelable.Creator
        public final PaidContentVideoModel createFromParcel(Parcel parcel) {
            return new PaidContentVideoModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PaidContentVideoModel[] newArray(int i) {
            return new PaidContentVideoModel[i];
        }
    };

    @C09CT("collection_cover_url")
    public String collectionCoverUrl;

    @C09CT("paid_collection_id")
    public String collectionId;

    @C09CT("collection_name")
    public String collectionName;

    @C09CT("entry_point")
    public String entryPoint;

    @C09CT("publish_id")
    public final String publishId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.collectionId);
        parcel.writeString(this.publishId);
        parcel.writeString(this.collectionCoverUrl);
        parcel.writeString(this.collectionName);
        parcel.writeString(this.entryPoint);
    }

    public PaidContentVideoModel() {
        this("", "", "", "", "");
    }

    public final String getCollectionCoverUrl() {
        return this.collectionCoverUrl;
    }

    public final String getCollectionId() {
        return this.collectionId;
    }

    public final String getCollectionName() {
        return this.collectionName;
    }

    public final String getEntryPoint() {
        return this.entryPoint;
    }

    public final String getPublishId() {
        return this.publishId;
    }

    public final void setCollectionCoverUrl(String str) {
        this.collectionCoverUrl = str;
    }

    public final void setCollectionId(String str) {
        this.collectionId = str;
    }

    public final void setCollectionName(String str) {
        this.collectionName = str;
    }

    public final void setEntryPoint(String str) {
        this.entryPoint = str;
    }

    public PaidContentVideoModel(String str, String str2, String str3, String str4, String str5) {
        this.collectionId = str;
        this.publishId = str2;
        this.collectionCoverUrl = str3;
        this.collectionName = str4;
        this.entryPoint = str5;
    }
}
