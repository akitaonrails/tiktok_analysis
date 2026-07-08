package com.ss.android.ugc.aweme.creative.model.audio;

import X.C09CT;
import X.C0MY0;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.audio.AICaptionTTSWrap;

/* JADX INFO: loaded from: classes31.dex */
public final class AICaptionTTSWrap implements Parcelable {
    public static final Parcelable.Creator<AICaptionTTSWrap> CREATOR = new Parcelable.Creator<AICaptionTTSWrap>() { // from class: X.142K
        @Override // android.os.Parcelable.Creator
        public final AICaptionTTSWrap createFromParcel(Parcel parcel) {
            return new AICaptionTTSWrap(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AICaptionTTSWrap[] newArray(int i) {
            return new AICaptionTTSWrap[i];
        }
    };

    @C09CT("ai_caption_tts_audio_path")
    @C0MY0
    public final String audioPath;

    @C09CT("ai_caption_tts_speaker_id")
    public final String speakerId;

    @C09CT("ai_caption_tts_text")
    public final String text;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeString(this.audioPath);
        parcel.writeString(this.speakerId);
    }

    public AICaptionTTSWrap() {
        this("", "", "");
    }

    public AICaptionTTSWrap(String str, String str2, String str3) {
        this.text = str;
        this.audioPath = str2;
        this.speakerId = str3;
    }
}
