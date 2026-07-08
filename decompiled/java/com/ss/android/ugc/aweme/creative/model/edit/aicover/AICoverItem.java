package com.ss.android.ugc.aweme.creative.model.edit.aicover;

import X.C09CT;
import X.C0MY0;
import X.C2188811AlT;
import X.EnumC1454140nwa;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverItem;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class AICoverItem implements Parcelable, Serializable {
    public static final Parcelable.Creator<AICoverItem> CREATOR = new Parcelable.Creator<AICoverItem>() { // from class: X.0nxi
        @Override // android.os.Parcelable.Creator
        public final AICoverItem createFromParcel(Parcel parcel) {
            return new AICoverItem(parcel.readString(), parcel.readString(), parcel.readString(), EnumC1454140nwa.valueOf(parcel.readString()), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AICoverItem[] newArray(int i) {
            return new AICoverItem[i];
        }
    };

    @C09CT("height")
    public int height;

    @C09CT("image_url")
    public String imageUrl;

    @C09CT("local_path")
    @C0MY0
    public String localPath;

    @C09CT("progress")
    public float progress;

    @C09CT("retry_count")
    public int retryCount;

    @C09CT("state")
    public EnumC1454140nwa state;

    @C09CT("cover_id")
    public final String subTaskId;

    @C09CT("template_id")
    public String templateId;

    @C09CT("template_name")
    public String templateName;

    @C09CT("width")
    public int width;

    public final AICoverItem copy(String str, String str2, String str3, EnumC1454140nwa enumC1454140nwa, float f, int i, int i2, int i3, String str4, String str5) {
        return new AICoverItem(str, str2, str3, enumC1454140nwa, f, i, i2, i3, str4, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AICoverItem)) {
            return false;
        }
        AICoverItem aICoverItem = (AICoverItem) obj;
        return Intrinsics.LJFF(this.subTaskId, aICoverItem.subTaskId) && Intrinsics.LJFF(this.imageUrl, aICoverItem.imageUrl) && Intrinsics.LJFF(this.localPath, aICoverItem.localPath) && this.state == aICoverItem.state && Float.compare(this.progress, aICoverItem.progress) == 0 && this.width == aICoverItem.width && this.height == aICoverItem.height && this.retryCount == aICoverItem.retryCount && Intrinsics.LJFF(this.templateId, aICoverItem.templateId) && Intrinsics.LJFF(this.templateName, aICoverItem.templateName);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AICoverItem(subTaskId=");
        sbLIZ.append(this.subTaskId);
        sbLIZ.append(", imageUrl=");
        sbLIZ.append(this.imageUrl);
        sbLIZ.append(", localPath=");
        sbLIZ.append(this.localPath);
        sbLIZ.append(", state=");
        sbLIZ.append(this.state);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.progress);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", retryCount=");
        sbLIZ.append(this.retryCount);
        sbLIZ.append(", templateId=");
        sbLIZ.append(this.templateId);
        sbLIZ.append(", templateName=");
        sbLIZ.append(this.templateName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.subTaskId);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.localPath);
        parcel.writeString(this.state.name());
        parcel.writeFloat(this.progress);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.retryCount);
        parcel.writeString(this.templateId);
        parcel.writeString(this.templateName);
    }

    public int hashCode() {
        int iHashCode = this.subTaskId.hashCode() * 31;
        String str = this.imageUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.localPath;
        int iHashCode3 = (((((((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.state.hashCode()) * 31) + Float.floatToIntBits(this.progress)) * 31) + this.width) * 31) + this.height) * 31) + this.retryCount) * 31;
        String str3 = this.templateId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.templateName;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean isFinished() {
        EnumC1454140nwa enumC1454140nwa = this.state;
        return enumC1454140nwa == EnumC1454140nwa.SUCCESS || enumC1454140nwa == EnumC1454140nwa.FAILED || enumC1454140nwa == EnumC1454140nwa.CANCELED;
    }

    public final boolean isReady() {
        if (this.state == EnumC1454140nwa.SUCCESS) {
            String str = this.localPath;
            if (str != null && str.length() != 0) {
                return true;
            }
            String str2 = this.imageUrl;
            if (str2 != null && str2.length() != 0) {
                return true;
            }
        }
        return false;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getLocalPath() {
        return this.localPath;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final int getRetryCount() {
        return this.retryCount;
    }

    public final EnumC1454140nwa getState() {
        return this.state;
    }

    public final String getSubTaskId() {
        return this.subTaskId;
    }

    public final String getTemplateId() {
        return this.templateId;
    }

    public final String getTemplateName() {
        return this.templateName;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public final void setLocalPath(String str) {
        this.localPath = str;
    }

    public final void setProgress(float f) {
        this.progress = f;
    }

    public final void setRetryCount(int i) {
        this.retryCount = i;
    }

    public final void setState(EnumC1454140nwa enumC1454140nwa) {
        this.state = enumC1454140nwa;
    }

    public final void setTemplateId(String str) {
        this.templateId = str;
    }

    public final void setTemplateName(String str) {
        this.templateName = str;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public AICoverItem(String str, String str2, String str3, EnumC1454140nwa enumC1454140nwa, float f, int i, int i2, int i3, String str4, String str5) {
        this.subTaskId = str;
        this.imageUrl = str2;
        this.localPath = str3;
        this.state = enumC1454140nwa;
        this.progress = f;
        this.width = i;
        this.height = i2;
        this.retryCount = i3;
        this.templateId = str4;
        this.templateName = str5;
    }
}
