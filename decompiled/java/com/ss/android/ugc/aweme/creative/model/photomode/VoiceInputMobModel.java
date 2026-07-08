package com.ss.android.ugc.aweme.creative.model.photomode;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.photomode.VoiceInputMobModel;

/* JADX INFO: loaded from: classes9.dex */
public final class VoiceInputMobModel implements Parcelable {
    public static final Parcelable.Creator<VoiceInputMobModel> CREATOR = new Parcelable.Creator<VoiceInputMobModel>() { // from class: X.0MpO
        @Override // android.os.Parcelable.Creator
        public final VoiceInputMobModel createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new VoiceInputMobModel(z, parcel.readInt(), parcel.readLong(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final VoiceInputMobModel[] newArray(int i) {
            return new VoiceInputMobModel[i];
        }
    };

    @C09CT("is_used_voice_input")
    public boolean isUsedVoiceInput;

    @C09CT("voice_input_count")
    public int voiceInputCount;

    @C09CT("voice_total_duration")
    public long voiceTotalDurationMs;

    @C09CT("voice_transcribed_length")
    public int voiceTranscribedLength;

    public VoiceInputMobModel() {
        this(false, 0, 0L, 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoiceInputMobModel)) {
            return false;
        }
        VoiceInputMobModel voiceInputMobModel = (VoiceInputMobModel) obj;
        return this.isUsedVoiceInput == voiceInputMobModel.isUsedVoiceInput && this.voiceInputCount == voiceInputMobModel.voiceInputCount && this.voiceTotalDurationMs == voiceInputMobModel.voiceTotalDurationMs && this.voiceTranscribedLength == voiceInputMobModel.voiceTranscribedLength;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.isUsedVoiceInput) * 31) + this.voiceInputCount) * 31) + C786410Ut5.Y2(this.voiceTotalDurationMs)) * 31) + this.voiceTranscribedLength;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoiceInputMobModel(isUsedVoiceInput=");
        sbLIZ.append(this.isUsedVoiceInput);
        sbLIZ.append(", voiceInputCount=");
        sbLIZ.append(this.voiceInputCount);
        sbLIZ.append(", voiceTotalDurationMs=");
        sbLIZ.append(this.voiceTotalDurationMs);
        sbLIZ.append(", voiceTranscribedLength=");
        sbLIZ.append(this.voiceTranscribedLength);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isUsedVoiceInput ? 1 : 0);
        parcel.writeInt(this.voiceInputCount);
        parcel.writeLong(this.voiceTotalDurationMs);
        parcel.writeInt(this.voiceTranscribedLength);
    }

    public VoiceInputMobModel(boolean z, int i, long j, int i2) {
        this.isUsedVoiceInput = z;
        this.voiceInputCount = i;
        this.voiceTotalDurationMs = j;
        this.voiceTranscribedLength = i2;
    }
}
