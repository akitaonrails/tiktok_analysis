package com.ss.android.ugc.aweme.creative.model.audio;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.audio.ConsumptionSpeakerInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class ConsumptionSpeakerInfo implements Parcelable {
    public static final Parcelable.Creator<ConsumptionSpeakerInfo> CREATOR = new Parcelable.Creator<ConsumptionSpeakerInfo>() { // from class: X.062Q
        @Override // android.os.Parcelable.Creator
        public final ConsumptionSpeakerInfo createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new ConsumptionSpeakerInfo(string, string2, z);
        }

        @Override // android.os.Parcelable.Creator
        public final ConsumptionSpeakerInfo[] newArray(int i) {
            return new ConsumptionSpeakerInfo[i];
        }
    };

    @C09CT("is_private")
    public boolean isPrivate;

    @C09CT("key_speaker_id")
    public String keySpeakerId;

    @C09CT("tts_speaker_id")
    public String ttsId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.keySpeakerId);
        parcel.writeString(this.ttsId);
        parcel.writeInt(this.isPrivate ? 1 : 0);
    }

    public ConsumptionSpeakerInfo() {
        this("", "", true);
    }

    public ConsumptionSpeakerInfo(String str, String str2, boolean z) {
        this.keySpeakerId = str;
        this.ttsId = str2;
        this.isPrivate = z;
    }
}
