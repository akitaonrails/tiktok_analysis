package com.ss.android.ugc.aweme.composer.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.composer.model.ExternalContentShareStoryInputData;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class ExternalContentShareStoryInputData implements Parcelable, Serializable {
    public static final Parcelable.Creator<ExternalContentShareStoryInputData> CREATOR = new Parcelable.Creator<ExternalContentShareStoryInputData>() { // from class: X.0Mif
        @Override // android.os.Parcelable.Creator
        public final ExternalContentShareStoryInputData createFromParcel(Parcel parcel) {
            Integer numValueOf;
            UrlModel urlModel = (UrlModel) parcel.readSerializable();
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new ExternalContentShareStoryInputData(urlModel, string, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final ExternalContentShareStoryInputData[] newArray(int i) {
            return new ExternalContentShareStoryInputData[i];
        }
    };

    @C09CT("content_uri")
    public String contentUri;

    @C09CT("cover_url")
    public UrlModel contentUrl;

    @C09CT("landing_back")
    public Integer landingBack;

    public ExternalContentShareStoryInputData() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeSerializable(this.contentUrl);
        parcel.writeString(this.contentUri);
        Integer num = this.landingBack;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public final String getContentUri() {
        return this.contentUri;
    }

    public final UrlModel getContentUrl() {
        return this.contentUrl;
    }

    public final Integer getLandingBack() {
        return this.landingBack;
    }

    public final void setContentUri(String str) {
        this.contentUri = str;
    }

    public final void setContentUrl(UrlModel urlModel) {
        this.contentUrl = urlModel;
    }

    public final void setLandingBack(Integer num) {
        this.landingBack = num;
    }

    public ExternalContentShareStoryInputData(UrlModel urlModel, String str, Integer num) {
        this.contentUrl = urlModel;
        this.contentUri = str;
        this.landingBack = num;
    }
}
