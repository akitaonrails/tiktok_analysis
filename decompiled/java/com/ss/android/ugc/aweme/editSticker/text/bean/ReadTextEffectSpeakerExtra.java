package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.editSticker.text.bean.ReadTextEffectSpeakerExtra;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes30.dex */
public final class ReadTextEffectSpeakerExtra implements Parcelable {
    public static final Parcelable.Creator<ReadTextEffectSpeakerExtra> CREATOR = new Parcelable.Creator<ReadTextEffectSpeakerExtra>() { // from class: X.11YG
        @Override // android.os.Parcelable.Creator
        public final ReadTextEffectSpeakerExtra createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new ReadTextEffectSpeakerExtra(z, string, string2, string3, i, i2, string4, string5, string6, string7, z2, parcel.readLong(), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReadTextEffectSpeakerExtra[] newArray(int i) {
            return new ReadTextEffectSpeakerExtra[i];
        }
    };

    @C09CT("is_creator")
    public final boolean isCreatorVoice;
    public boolean isFake;

    @C09CT("lock_easteregg")
    public int lockEasterEgg;

    @C09CT("lock_keywords_easteregg")
    public String lockKeywordsEasterEgg;
    public String speakerName;

    @C09CT("speakerID")
    public String speakreID;

    @C09CT("StreamTTSSpkID")
    public String streamTTSSpkID;

    @C09CT("TTS_anchor_name")
    public String ttsAnchorName;

    @C09CT("tts_anchor_release_date")
    public final long ttsAnchorReleaseDate;

    @C09CT("tts_release_date")
    public final long ttsReleaseDate;

    @C09CT("creator_user_id")
    public String voiceCreatorUserId;

    @C09CT("creator_user_name")
    public final String voiceCreatorUserName;

    @C09CT("voice_descriptions")
    public String voiceDescriptions;

    @C09CT("voice_use_commercial")
    public int voiceUseCommercial;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public ReadTextEffectSpeakerExtra() {
        long j = 0;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        this(false, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr, objArr2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr3, j, j, 0 == true ? 1 : 0, 16383, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isFake ? 1 : 0);
        parcel.writeString(this.speakerName);
        parcel.writeString(this.speakreID);
        parcel.writeString(this.lockKeywordsEasterEgg);
        parcel.writeInt(this.lockEasterEgg);
        parcel.writeInt(this.voiceUseCommercial);
        parcel.writeString(this.ttsAnchorName);
        parcel.writeString(this.voiceDescriptions);
        parcel.writeString(this.voiceCreatorUserId);
        parcel.writeString(this.voiceCreatorUserName);
        parcel.writeInt(this.isCreatorVoice ? 1 : 0);
        parcel.writeLong(this.ttsAnchorReleaseDate);
        parcel.writeLong(this.ttsReleaseDate);
        parcel.writeString(this.streamTTSSpkID);
    }

    public ReadTextEffectSpeakerExtra(boolean z, String str, String str2, String str3, int i, int i2, String str4, String str5, String str6, String str7, boolean z2, long j, long j2, String str8) {
        this.isFake = z;
        this.speakerName = str;
        this.speakreID = str2;
        this.lockKeywordsEasterEgg = str3;
        this.lockEasterEgg = i;
        this.voiceUseCommercial = i2;
        this.ttsAnchorName = str4;
        this.voiceDescriptions = str5;
        this.voiceCreatorUserId = str6;
        this.voiceCreatorUserName = str7;
        this.isCreatorVoice = z2;
        this.ttsAnchorReleaseDate = j;
        this.ttsReleaseDate = j2;
        this.streamTTSSpkID = str8;
    }

    public /* synthetic */ ReadTextEffectSpeakerExtra(boolean z, String str, String str2, String str3, int i, int i2, String str4, String str5, String str6, String str7, boolean z2, long j, long j2, String str8, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? "" : str4, (i3 & 128) != 0 ? "" : str5, (i3 & 256) != 0 ? "" : str6, (i3 & 512) != 0 ? "" : str7, (i3 & 1024) == 0 ? z2 : false, (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0L : j, (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? j2 : 0L, (i3 & 8192) == 0 ? str8 : "");
    }
}
