package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class TTSVoiceModel implements Serializable, Parcelable {

    @C09CT("effect_id")
    public final String effectId;

    @C09CT("speaker_name")
    public final String speakerName;
    public static final Parcelable.Creator<TTSVoiceModel> CREATOR = new Parcelable.Creator<TTSVoiceModel>() { // from class: X.0F7i
        @Override // android.os.Parcelable.Creator
        public final TTSVoiceModel createFromParcel(Parcel parcel) {
            return new TTSVoiceModel(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TTSVoiceModel[] newArray(int i) {
            return new TTSVoiceModel[i];
        }
    };
    public static final int $stable = 8;

    public TTSVoiceModel() {
        this(null, null);
    }

    public final TTSVoiceModel copy(String str, String str2) {
        return new TTSVoiceModel(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TTSVoiceModel)) {
            return false;
        }
        TTSVoiceModel tTSVoiceModel = (TTSVoiceModel) obj;
        return Intrinsics.LJFF(this.effectId, tTSVoiceModel.effectId) && Intrinsics.LJFF(this.speakerName, tTSVoiceModel.speakerName);
    }

    public int hashCode() {
        String str = this.effectId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.speakerName;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTSVoiceModel(effectId=");
        sbLIZ.append(this.effectId);
        sbLIZ.append(", speakerName=");
        sbLIZ.append(this.speakerName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.effectId);
        parcel.writeString(this.speakerName);
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final String getSpeakerName() {
        return this.speakerName;
    }

    public TTSVoiceModel(String str, String str2) {
        this.effectId = str;
        this.speakerName = str2;
    }
}
