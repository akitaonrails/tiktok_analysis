package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceStruct;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class TTSVoiceStruct implements Serializable, Parcelable {

    @C09CT("icon_url")
    public final String effectIconUrl;

    @C09CT("effect_id")
    public final String ttsVoiceId;

    @C09CT("resource_id")
    public final String ttsVoiceResourceId;

    @C09CT("tts_voice_attr")
    public final String voiceAttr;
    public static final Parcelable.Creator<TTSVoiceStruct> CREATOR = new Parcelable.Creator<TTSVoiceStruct>() { // from class: X.0nJ3
        @Override // android.os.Parcelable.Creator
        public final TTSVoiceStruct createFromParcel(Parcel parcel) {
            return new TTSVoiceStruct(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TTSVoiceStruct[] newArray(int i) {
            return new TTSVoiceStruct[i];
        }
    };
    public static final int $stable = 8;

    public TTSVoiceStruct() {
        this(null, null, null, null);
    }

    public final TTSVoiceStruct copy(String str, String str2, String str3, String str4) {
        return new TTSVoiceStruct(str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TTSVoiceStruct)) {
            return false;
        }
        TTSVoiceStruct tTSVoiceStruct = (TTSVoiceStruct) obj;
        return Intrinsics.LJFF(this.ttsVoiceId, tTSVoiceStruct.ttsVoiceId) && Intrinsics.LJFF(this.effectIconUrl, tTSVoiceStruct.effectIconUrl) && Intrinsics.LJFF(this.ttsVoiceResourceId, tTSVoiceStruct.ttsVoiceResourceId) && Intrinsics.LJFF(this.voiceAttr, tTSVoiceStruct.voiceAttr);
    }

    public int hashCode() {
        String str = this.ttsVoiceId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.effectIconUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ttsVoiceResourceId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.voiceAttr;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTSVoiceStruct(ttsVoiceId=");
        sbLIZ.append(this.ttsVoiceId);
        sbLIZ.append(", effectIconUrl=");
        sbLIZ.append(this.effectIconUrl);
        sbLIZ.append(", ttsVoiceResourceId=");
        sbLIZ.append(this.ttsVoiceResourceId);
        sbLIZ.append(", voiceAttr=");
        sbLIZ.append(this.voiceAttr);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ttsVoiceId);
        parcel.writeString(this.effectIconUrl);
        parcel.writeString(this.ttsVoiceResourceId);
        parcel.writeString(this.voiceAttr);
    }

    public final String getEffectIconUrl() {
        return this.effectIconUrl;
    }

    public final String getTtsVoiceId() {
        return this.ttsVoiceId;
    }

    public final String getTtsVoiceResourceId() {
        return this.ttsVoiceResourceId;
    }

    public final String getVoiceAttr() {
        return this.voiceAttr;
    }

    public TTSVoiceStruct(String str, String str2, String str3, String str4) {
        this.ttsVoiceId = str;
        this.effectIconUrl = str2;
        this.ttsVoiceResourceId = str3;
        this.voiceAttr = str4;
    }
}
