package com.ss.android.ugc.aweme.edit;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.edit.TextPublishUploadModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class TextPublishUploadModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<TextPublishUploadModel> CREATOR = new Parcelable.Creator<TextPublishUploadModel>() { // from class: X.0mf8
        @Override // android.os.Parcelable.Creator
        public final TextPublishUploadModel createFromParcel(Parcel parcel) {
            return new TextPublishUploadModel(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final TextPublishUploadModel[] newArray(int i) {
            return new TextPublishUploadModel[i];
        }
    };

    @C09CT("cover_image_height")
    public int coverImageHeight;

    @C09CT("cover_image_uri")
    public String coverImageUri;

    @C09CT("cover_image_width")
    public int coverImageWidth;

    @C09CT("is_has_last_content")
    public int isHasLastContent;

    @C09CT("text_content")
    public String textContent;

    public TextPublishUploadModel() {
        this("", null, 0, 0, 0);
    }

    public final TextPublishUploadModel copy(String str, String str2, int i, int i2, int i3) {
        return new TextPublishUploadModel(str, str2, i, i2, i3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextPublishUploadModel)) {
            return false;
        }
        TextPublishUploadModel textPublishUploadModel = (TextPublishUploadModel) obj;
        return Intrinsics.LJFF(this.textContent, textPublishUploadModel.textContent) && Intrinsics.LJFF(this.coverImageUri, textPublishUploadModel.coverImageUri) && this.coverImageHeight == textPublishUploadModel.coverImageHeight && this.coverImageWidth == textPublishUploadModel.coverImageWidth && this.isHasLastContent == textPublishUploadModel.isHasLastContent;
    }

    public int hashCode() {
        int iHashCode = this.textContent.hashCode() * 31;
        String str = this.coverImageUri;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.coverImageHeight) * 31) + this.coverImageWidth) * 31) + this.isHasLastContent;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextPublishUploadModel(textContent=");
        sbLIZ.append(this.textContent);
        sbLIZ.append(", coverImageUri=");
        sbLIZ.append(this.coverImageUri);
        sbLIZ.append(", coverImageHeight=");
        sbLIZ.append(this.coverImageHeight);
        sbLIZ.append(", coverImageWidth=");
        sbLIZ.append(this.coverImageWidth);
        sbLIZ.append(", isHasLastContent=");
        sbLIZ.append(this.isHasLastContent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.textContent);
        parcel.writeString(this.coverImageUri);
        parcel.writeInt(this.coverImageHeight);
        parcel.writeInt(this.coverImageWidth);
        parcel.writeInt(this.isHasLastContent);
    }

    public final int getCoverImageHeight() {
        return this.coverImageHeight;
    }

    public final String getCoverImageUri() {
        return this.coverImageUri;
    }

    public final int getCoverImageWidth() {
        return this.coverImageWidth;
    }

    public final String getTextContent() {
        return this.textContent;
    }

    public final int isHasLastContent() {
        return this.isHasLastContent;
    }

    public final void setCoverImageHeight(int i) {
        this.coverImageHeight = i;
    }

    public final void setCoverImageUri(String str) {
        this.coverImageUri = str;
    }

    public final void setCoverImageWidth(int i) {
        this.coverImageWidth = i;
    }

    public final void setHasLastContent(int i) {
        this.isHasLastContent = i;
    }

    public final void setTextContent(String str) {
        this.textContent = str;
    }

    public TextPublishUploadModel(String str, String str2, int i, int i2, int i3) {
        this.textContent = str;
        this.coverImageUri = str2;
        this.coverImageHeight = i;
        this.coverImageWidth = i2;
        this.isHasLastContent = i3;
    }
}
