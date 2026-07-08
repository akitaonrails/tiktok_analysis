package com.ss.android.ugc.aweme.creative.model.aichat;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenPrompt;
import java.io.Serializable;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class AIChatGenPrompt implements Parcelable, Serializable {
    public static final Parcelable.Creator<AIChatGenPrompt> CREATOR = new Parcelable.Creator<AIChatGenPrompt>() { // from class: X.18Sp
        @Override // android.os.Parcelable.Creator
        public final AIChatGenPrompt createFromParcel(Parcel parcel) {
            return new AIChatGenPrompt(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AIChatGenPrompt[] newArray(int i) {
            return new AIChatGenPrompt[i];
        }
    };

    @C09CT("prompt_icon_uri")
    public String promptIconUri;

    @C09CT("prompt_id")
    public String promptId;

    @C09CT("prompt_text")
    public String promptText;

    @C09CT("prompt_type")
    public String promptType;

    @C09CT("prompt_uri")
    public String promptUri;

    @C09CT("uuid")
    public final String uuid;

    public AIChatGenPrompt() {
        this(UUID.randomUUID().toString(), null, null, null, null, null);
    }

    public final AIChatGenPrompt copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new AIChatGenPrompt(str, str2, str3, str4, str5, str6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIChatGenPrompt)) {
            return false;
        }
        AIChatGenPrompt aIChatGenPrompt = (AIChatGenPrompt) obj;
        return Intrinsics.LJFF(this.uuid, aIChatGenPrompt.uuid) && Intrinsics.LJFF(this.promptText, aIChatGenPrompt.promptText) && Intrinsics.LJFF(this.promptType, aIChatGenPrompt.promptType) && Intrinsics.LJFF(this.promptId, aIChatGenPrompt.promptId) && Intrinsics.LJFF(this.promptUri, aIChatGenPrompt.promptUri) && Intrinsics.LJFF(this.promptIconUri, aIChatGenPrompt.promptIconUri);
    }

    public int hashCode() {
        int iHashCode = this.uuid.hashCode() * 31;
        String str = this.promptText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.promptType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.promptId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.promptUri;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.promptIconUri;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIChatGenPrompt(uuid=");
        sbLIZ.append(this.uuid);
        sbLIZ.append(", promptText=");
        sbLIZ.append(this.promptText);
        sbLIZ.append(", promptType=");
        sbLIZ.append(this.promptType);
        sbLIZ.append(", promptId=");
        sbLIZ.append(this.promptId);
        sbLIZ.append(", promptUri=");
        sbLIZ.append(this.promptUri);
        sbLIZ.append(", promptIconUri=");
        sbLIZ.append(this.promptIconUri);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uuid);
        parcel.writeString(this.promptText);
        parcel.writeString(this.promptType);
        parcel.writeString(this.promptId);
        parcel.writeString(this.promptUri);
        parcel.writeString(this.promptIconUri);
    }

    public final String getPromptIconUri() {
        return this.promptIconUri;
    }

    public final String getPromptId() {
        return this.promptId;
    }

    public final String getPromptText() {
        return this.promptText;
    }

    public final String getPromptType() {
        return this.promptType;
    }

    public final String getPromptUri() {
        return this.promptUri;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final void setPromptIconUri(String str) {
        this.promptIconUri = str;
    }

    public final void setPromptId(String str) {
        this.promptId = str;
    }

    public final void setPromptText(String str) {
        this.promptText = str;
    }

    public final void setPromptType(String str) {
        this.promptType = str;
    }

    public final void setPromptUri(String str) {
        this.promptUri = str;
    }

    public AIChatGenPrompt(String str, String str2, String str3, String str4, String str5, String str6) {
        this.uuid = str;
        this.promptText = str2;
        this.promptType = str3;
        this.promptId = str4;
        this.promptUri = str5;
        this.promptIconUri = str6;
    }
}
