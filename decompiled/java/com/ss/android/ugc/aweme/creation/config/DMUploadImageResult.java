package com.ss.android.ugc.aweme.creation.config;

import X.C09KK;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creation.config.DMEncryptedImageContent;
import com.ss.android.ugc.aweme.creation.config.DMUploadImageResult;
import com.ss.android.ugc.aweme.shortvideo.dm.DMUploadProcessData;

/* JADX INFO: loaded from: classes33.dex */
public final class DMUploadImageResult implements Parcelable, C09KK {
    public static final Parcelable.Creator<DMUploadImageResult> CREATOR = new Parcelable.Creator<DMUploadImageResult>() { // from class: X.18YB
        @Override // android.os.Parcelable.Creator
        public final DMUploadImageResult createFromParcel(Parcel parcel) {
            DMUploadProcessData dMUploadProcessDataCreateFromParcel;
            DMEncryptedImageContent dMEncryptedImageContentCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                dMUploadProcessDataCreateFromParcel = null;
            } else {
                dMUploadProcessDataCreateFromParcel = DMUploadProcessData.CREATOR.createFromParcel(parcel);
            }
            DMUploadProcessData dMUploadProcessData = dMUploadProcessDataCreateFromParcel;
            if (parcel.readInt() != 0) {
                dMEncryptedImageContentCreateFromParcel = DMEncryptedImageContent.CREATOR.createFromParcel(parcel);
            }
            return new DMUploadImageResult(dMUploadProcessData, dMEncryptedImageContentCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DMUploadImageResult[] newArray(int i) {
            return new DMUploadImageResult[i];
        }
    };
    public DMEncryptedImageContent decryptData;
    public DMUploadProcessData processData;

    public DMUploadImageResult() {
        this((DMEncryptedImageContent) null, 3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        DMUploadProcessData dMUploadProcessData = this.processData;
        if (dMUploadProcessData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dMUploadProcessData.writeToParcel(parcel, i);
        }
        DMEncryptedImageContent dMEncryptedImageContent = this.decryptData;
        if (dMEncryptedImageContent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dMEncryptedImageContent.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ DMUploadImageResult(DMEncryptedImageContent dMEncryptedImageContent, int i) {
        this((DMUploadProcessData) null, (i & 2) != 0 ? null : dMEncryptedImageContent);
    }

    public DMUploadImageResult(DMUploadProcessData dMUploadProcessData, DMEncryptedImageContent dMEncryptedImageContent) {
        this.processData = dMUploadProcessData;
        this.decryptData = dMEncryptedImageContent;
    }
}
