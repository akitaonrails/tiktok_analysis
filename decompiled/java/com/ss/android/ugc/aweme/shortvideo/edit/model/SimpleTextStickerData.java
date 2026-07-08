package com.ss.android.ugc.aweme.shortvideo.edit.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.edit.model.SimpleTextStickerData;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public final class SimpleTextStickerData implements Parcelable, Cloneable {

    @C09CT("old_text")
    public String audioText;

    @C09CT("audio_track_duration")
    public int audioTrackDuration;

    @C09CT("audio_track_file_path")
    public String audioTrackFilePath;

    @C09CT("audio_track_index")
    public int audioTrackIndex;

    @C09CT("has_read_text_audio")
    public boolean hasReadTextAudio;

    @C09CT("is_creator")
    public boolean isCreatorVoice;

    @C09CT("speaker_id")
    public String speakerID;

    @C09CT("tts_anchor_release_date")
    public final long ttsAnchorReleaseDate;

    @C09CT("tts_extra")
    public final Map<String, String> ttsExtraMap;

    @C09CT("tts_release_date")
    public final long ttsReleaseDate;

    @C09CT("voice_anchor_name")
    public String voiceAnchorName;

    @C09CT("creator_user_id")
    public String voiceCreatorUserId;

    @C09CT("creator_user_name")
    public String voiceCreatorUserName;

    @C09CT("voice_effect_icon_url")
    public String voiceEffectIconUrl;

    @C09CT("voice_effect_id")
    public String voiceEffectId;

    @C09CT("voice_effect_resource_id")
    public String voiceEffectResourceId;
    public static final Parcelable.Creator<SimpleTextStickerData> CREATOR = new Parcelable.Creator<SimpleTextStickerData>() { // from class: X.0mdH
        @Override // android.os.Parcelable.Creator
        public final SimpleTextStickerData createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string = parcel.readString();
            int i = parcel.readInt();
            String string2 = parcel.readString();
            int i2 = parcel.readInt();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            int i3 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new SimpleTextStickerData(z, string, i, string2, i2, string3, string4, string5, string6, string7, string8, string9, z2, j, j2, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final SimpleTextStickerData[] newArray(int i) {
            return new SimpleTextStickerData[i];
        }
    };
    public static final int $stable = 8;

    public SimpleTextStickerData() {
        this(false, null, -1, null, 0, null, null, null, null, null, "", "", false, 0L, 0L, new LinkedHashMap());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.hasReadTextAudio ? 1 : 0);
        parcel.writeString(this.speakerID);
        parcel.writeInt(this.audioTrackIndex);
        parcel.writeString(this.audioTrackFilePath);
        parcel.writeInt(this.audioTrackDuration);
        parcel.writeString(this.audioText);
        parcel.writeString(this.voiceEffectId);
        parcel.writeString(this.voiceEffectIconUrl);
        parcel.writeString(this.voiceAnchorName);
        parcel.writeString(this.voiceEffectResourceId);
        parcel.writeString(this.voiceCreatorUserId);
        parcel.writeString(this.voiceCreatorUserName);
        parcel.writeInt(this.isCreatorVoice ? 1 : 0);
        parcel.writeLong(this.ttsAnchorReleaseDate);
        parcel.writeLong(this.ttsReleaseDate);
        Map<String, String> map = this.ttsExtraMap;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public Object clone() {
        return super.clone();
    }

    public final String getAudioText() {
        return this.audioText;
    }

    public final int getAudioTrackDuration() {
        return this.audioTrackDuration;
    }

    public final String getAudioTrackFilePath() {
        return this.audioTrackFilePath;
    }

    public final int getAudioTrackIndex() {
        return this.audioTrackIndex;
    }

    public final boolean getHasReadTextAudio() {
        return this.hasReadTextAudio;
    }

    public final String getSpeakerID() {
        return this.speakerID;
    }

    public final long getTtsAnchorReleaseDate() {
        return this.ttsAnchorReleaseDate;
    }

    public final Map<String, String> getTtsExtraMap() {
        return this.ttsExtraMap;
    }

    public final long getTtsReleaseDate() {
        return this.ttsReleaseDate;
    }

    public final String getVoiceAnchorName() {
        return this.voiceAnchorName;
    }

    public final String getVoiceCreatorUserId() {
        return this.voiceCreatorUserId;
    }

    public final String getVoiceCreatorUserName() {
        return this.voiceCreatorUserName;
    }

    public final String getVoiceEffectIconUrl() {
        return this.voiceEffectIconUrl;
    }

    public final String getVoiceEffectId() {
        return this.voiceEffectId;
    }

    public final String getVoiceEffectResourceId() {
        return this.voiceEffectResourceId;
    }

    public final boolean isCreatorVoice() {
        return this.isCreatorVoice;
    }

    public SimpleTextStickerData(boolean z) {
        this(z, null, -1, null, 0, null, null, null, null, null, "", "", false, 0L, 0L, new LinkedHashMap());
    }

    public final void setAudioText(String str) {
        this.audioText = str;
    }

    public final void setAudioTrackDuration(int i) {
        this.audioTrackDuration = i;
    }

    public final void setAudioTrackFilePath(String str) {
        this.audioTrackFilePath = str;
    }

    public final void setAudioTrackIndex(int i) {
        this.audioTrackIndex = i;
    }

    public final void setCreatorVoice(boolean z) {
        this.isCreatorVoice = z;
    }

    public final void setHasReadTextAudio(boolean z) {
        this.hasReadTextAudio = z;
    }

    public final void setSpeakerID(String str) {
        this.speakerID = str;
    }

    public final void setVoiceAnchorName(String str) {
        this.voiceAnchorName = str;
    }

    public final void setVoiceCreatorUserId(String str) {
        this.voiceCreatorUserId = str;
    }

    public final void setVoiceCreatorUserName(String str) {
        this.voiceCreatorUserName = str;
    }

    public final void setVoiceEffectIconUrl(String str) {
        this.voiceEffectIconUrl = str;
    }

    public final void setVoiceEffectId(String str) {
        this.voiceEffectId = str;
    }

    public final void setVoiceEffectResourceId(String str) {
        this.voiceEffectResourceId = str;
    }

    public SimpleTextStickerData(boolean z, String str) {
        this(z, str, -1, null, 0, null, null, null, null, null, "", "", false, 0L, 0L, new LinkedHashMap());
    }

    public SimpleTextStickerData(boolean z, String str, int i) {
        this(z, str, i, null, 0, null, null, null, null, null, "", "", false, 0L, 0L, new LinkedHashMap());
    }

    public SimpleTextStickerData(boolean z, String str, int i, String str2) {
        this(z, str, i, str2, 0, null, null, null, null, null, "", "", false, 0L, 0L, new LinkedHashMap());
    }

    public SimpleTextStickerData(boolean z, String str, int i, String str2, int i2) {
        this(z, str, i, str2, i2, null, null, null, null, null, "", "", false, 0L, 0L, new LinkedHashMap());
    }

    public SimpleTextStickerData(boolean z, String str, int i, String str2, int i2, String str3) {
        this(z, str, i, str2, i2, str3, null, null, null, null, "", "", false, 0L, 0L, new LinkedHashMap());
    }

    public SimpleTextStickerData(boolean z, String str, int i, String str2, int i2, String str3, String str4) {
        this(z, str, i, str2, i2, str3, str4, null, null, null, "", "", false, 0L, 0L, new LinkedHashMap());
    }

    public SimpleTextStickerData(boolean z, String str, int i, String str2, int i2, String str3, String str4, String str5) {
        this(z, str, i, str2, i2, str3, str4, str5, null, null, "", "", false, 0L, 0L, new LinkedHashMap());
    }

    public SimpleTextStickerData(boolean z, String str, int i, String str2, int i2, String str3, String str4, String str5, String str6) {
        this(z, str, i, str2, i2, str3, str4, str5, str6, null, "", "", false, 0L, 0L, new LinkedHashMap());
    }

    public SimpleTextStickerData(boolean z, String str, int i, String str2, int i2, String str3, String str4, String str5, String str6, String str7) {
        this(z, str, i, str2, i2, str3, str4, str5, str6, str7, "", "", false, 0L, 0L, new LinkedHashMap());
    }

    public SimpleTextStickerData(boolean z, String str, int i, String str2, int i2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this(z, str, i, str2, i2, str3, str4, str5, str6, str7, str8, "", false, 0L, 0L, new LinkedHashMap());
    }

    public SimpleTextStickerData(boolean z, String str, int i, String str2, int i2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this(z, str, i, str2, i2, str3, str4, str5, str6, str7, str8, str9, false, 0L, 0L, new LinkedHashMap());
    }

    public SimpleTextStickerData(boolean z, String str, int i, String str2, int i2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z2) {
        this(z, str, i, str2, i2, str3, str4, str5, str6, str7, str8, str9, z2, 0L, 0L, new LinkedHashMap());
    }

    public SimpleTextStickerData(boolean z, String str, int i, String str2, int i2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z2, long j) {
        this(z, str, i, str2, i2, str3, str4, str5, str6, str7, str8, str9, z2, j, 0L, new LinkedHashMap());
    }

    public SimpleTextStickerData(boolean z, String str, int i, String str2, int i2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z2, long j, long j2) {
        this(z, str, i, str2, i2, str3, str4, str5, str6, str7, str8, str9, z2, j, j2, new LinkedHashMap());
    }

    public SimpleTextStickerData(boolean z, String str, int i, String str2, int i2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z2, long j, long j2, Map<String, String> map) {
        this.hasReadTextAudio = z;
        this.speakerID = str;
        this.audioTrackIndex = i;
        this.audioTrackFilePath = str2;
        this.audioTrackDuration = i2;
        this.audioText = str3;
        this.voiceEffectId = str4;
        this.voiceEffectIconUrl = str5;
        this.voiceAnchorName = str6;
        this.voiceEffectResourceId = str7;
        this.voiceCreatorUserId = str8;
        this.voiceCreatorUserName = str9;
        this.isCreatorVoice = z2;
        this.ttsAnchorReleaseDate = j;
        this.ttsReleaseDate = j2;
        this.ttsExtraMap = map;
    }
}
