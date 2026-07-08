package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIAliveInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<AIAliveInfo> CREATOR = new Creator();

    @C09CT("model_key")
    public String modelKey;

    @C09CT("model_prompt")
    public String modelPrompt;

    @C09CT("prompt_type")
    public String promptType;

    @C09CT("style_image_url")
    public String styleImageUrl;

    @C09CT("text")
    public String text;

    public static final class Creator implements Parcelable.Creator<AIAliveInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AIAliveInfo createFromParcel(Parcel parcel) {
            return new AIAliveInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AIAliveInfo[] newArray(int i) {
            return new AIAliveInfo[i];
        }
    }

    public final AIAliveInfo copy(String str, String str2, String str3, String str4, String str5) {
        return new AIAliveInfo(str, str2, str3, str4, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIAliveInfo)) {
            return false;
        }
        AIAliveInfo aIAliveInfo = (AIAliveInfo) obj;
        return Intrinsics.LJFF(this.text, aIAliveInfo.text) && Intrinsics.LJFF(this.promptType, aIAliveInfo.promptType) && Intrinsics.LJFF(this.modelPrompt, aIAliveInfo.modelPrompt) && Intrinsics.LJFF(this.modelKey, aIAliveInfo.modelKey) && Intrinsics.LJFF(this.styleImageUrl, aIAliveInfo.styleImageUrl);
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.promptType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.modelPrompt;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.modelKey;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.styleImageUrl;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIAliveInfo(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", promptType=");
        sbLIZ.append(this.promptType);
        sbLIZ.append(", modelPrompt=");
        sbLIZ.append(this.modelPrompt);
        sbLIZ.append(", modelKey=");
        sbLIZ.append(this.modelKey);
        sbLIZ.append(", styleImageUrl=");
        sbLIZ.append(this.styleImageUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeString(this.promptType);
        parcel.writeString(this.modelPrompt);
        parcel.writeString(this.modelKey);
        parcel.writeString(this.styleImageUrl);
    }

    public AIAliveInfo() {
        this("", "", "", "", "");
    }

    public final String getModelKey() {
        return this.modelKey;
    }

    public final String getModelPrompt() {
        return this.modelPrompt;
    }

    public final String getPromptType() {
        return this.promptType;
    }

    public final String getStyleImageUrl() {
        return this.styleImageUrl;
    }

    public final String getText() {
        return this.text;
    }

    public AIAliveInfo(String str, String str2, String str3, String str4, String str5) {
        this.text = str;
        this.promptType = str2;
        this.modelPrompt = str3;
        this.modelKey = str4;
        this.styleImageUrl = str5;
    }
}
